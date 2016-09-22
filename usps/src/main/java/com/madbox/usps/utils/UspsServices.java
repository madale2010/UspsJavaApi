package com.madbox.usps.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.madbox.usps.Address;
import com.madbox.usps.ZipCode;
import com.madbox.usps.request.AddressValidateRequest;
import com.madbox.usps.request.CityStateLookupRequest;
import com.madbox.usps.request.ExpressMailLabelRequest;
import com.madbox.usps.request.PackageRequest;
import com.madbox.usps.request.RateV4Request;
import com.madbox.usps.response.AddressValidateResponse;
import com.madbox.usps.response.CityStateLookupResponse;
import com.madbox.usps.response.ExpressMailLabelResponse;
import com.madbox.usps.response.PackageResponse;
import com.madbox.usps.response.RateV4Response;


public class UspsServices {
	private URLConnection connection;
	private URL uspsUrl=new URL("http://production.shippingapis.com/ShippingApi.dll");
	private final String charset = "UTF-8";
	private String query;
	private Error errorType;
	private StringBuilder errorDetails;
	
	public UspsServices() throws IOException{
	//Default Constructor
	}
	/**
	 * Query to bind xml and request parms needed for usps.
	 * @param apicontext
	 * @param xmlString
	 * @return
	 */
	public String bindQuery(String apicontext,String xmlString){
		
		try {
			this.query= String.format("API=%s&XML=%s",URLEncoder.encode(apicontext, charset),URLEncoder.encode(xmlString, charset));
		} catch (UnsupportedEncodingException e) {
			UspsException.processError(e);
		}
		return this.query;
	}
	/**
	 * Configure connection
	 * @throws IOException
	 */
	public void configureConnection() throws IOException{
		connection = uspsUrl.openConnection();
		connection.setDoOutput(true);
		connection.setRequestProperty("Accept-Charset", charset);
		connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=" + charset);
	}
	/**
	 * Execute command
	 * @param clazz 
	 * @return
	 * @throws IOException
	 * @throws Exception
	 */
	public Object execute(Class<?> clazz) throws IOException, Exception{
		String results="";
		try {
		    connection.getOutputStream().write(query.getBytes(charset));
		}
		finally {
		    connection.getOutputStream().close();
		}
		InputStream is = connection.getInputStream();
		 BufferedReader reader = new BufferedReader(new InputStreamReader(is));
	        StringBuilder out = new StringBuilder();
	        String line;
	        while ((line = reader.readLine()) != null) {
	            out.append(line);
	        }
	        results= out.toString();   //Prints the string content read from input stream
	        reader.close();
	        if(results.contains("Error") && !results.contains("<RateV4")){
	        	JAXBContext jaxbContext = JAXBContext.newInstance(Error.class);
	        	Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

	        	StringReader sr = new StringReader(results);
	        	errorType = (Error) unmarshaller.unmarshal(sr);
	        	errorDetails = new StringBuilder();
	        	errorDetails.append("Error :"+errorType.getNumber());
	        	errorDetails.append("\nMessage :"+errorType.getDescription());
	        	errorDetails.append("\nUrl :"+connection.getURL());
	        	errorDetails.append("\nQuery :"+connection.getURL().getQuery());
	       
	        	System.out.println(errorDetails.toString());
	        	//Get whatever the object was to be and create it with the added error
	        	//this will prevent bubble up of error handling
	        	
	        	return null;
	        } else {
	        	return toObject(results, clazz);
	        }
	       
	}
	public boolean validateInState(String zipCode){
		boolean inState=false;
		CityStateLookupRequest request = new CityStateLookupRequest();
		request.setID("<enter user id>");
		ZipCode zip = new ZipCode();
		zip.setID("0");
		zip.setZip5(zipCode);
		request.setZipCode(zip);
		bindQuery("CityStateLookup",request.toXML());
		try {
			CityStateLookupResponse response = (CityStateLookupResponse) configureAndExecute(CityStateLookupResponse.class);
			String state=response.getZipCode().getState();
			if(state.equalsIgnoreCase("VA")){
				inState=true;
			}
			
		} catch (Exception e) {
			UspsException.processError(e);
		}
		return inState;
	}
	/**
	 * Validate Address
	 * Save time and money by reducing shipping errors due to incorrect address entry. 
	 * This tool corrects errors in street addresses, including abbreviations and missing information. 
	 * It also supplies a Zip 4
	 * @param address
	 * @return
	 * @throws Exception 
	 */
	public Address validatedAddress(Address address){
		Address results=null;
		AddressValidateRequest requestAdd = new AddressValidateRequest();
		requestAdd.setAddress(address);
		String xml=requestAdd.toXML();
		bindQuery("Verify",xml);
		try {
			AddressValidateResponse addResponse = (AddressValidateResponse) configureAndExecute(AddressValidateResponse.class);
			results=addResponse.getAddress();
		} catch (Exception e) {
			UspsException.processError(e);
		}
		return results;
	}
	/**
	 * Calculate postage rates quickly and easily online for domestic and international shipping. 
	 * V4 is domestic and V2 for international
	 * This request is for multiple packages
	 * @param rate
	 * @return
	 */
	public PackageResponse requestShipping(ArrayList<PackageRequest> packageList){
		PackageResponse result=null;
		RateV4Request rateRequest = new RateV4Request();
		rateRequest.setPackageObj(packageList);
		String xml=rateRequest.toXML();
		System.out.println("Multiple Packages\n");
		rateRequest.printXML();
		bindQuery("RateV4",xml);
		try {
			RateV4Response rateResponse = (RateV4Response)configureAndExecute(RateV4Response.class);
			if(rateResponse!=null && errorType==null){
				result=rateResponse.getPackageObj();
				System.out.println("Muiltipe Response");
				result.printXML();
			}
			if(rateResponse==null && errorType!=null){
				result=new PackageResponse();
				result.appendError(errorType);
			}
		} catch (Exception e) {
			UspsException.processError(e);
		}

		return result;
	}
	/**
	 * Calculate postage rates quickly and easily online for domestic and international shipping. 
	 * V4 is domestic and V2 for international
	 * This request only does a single request package.
	 * @param rate
	 * @return
	 */
	public PackageResponse requestShipping(PackageRequest packageDetails){
		PackageResponse result=null;
		ArrayList<PackageRequest> packageRequestList = new ArrayList<PackageRequest>();
		packageRequestList.add(packageDetails);
		RateV4Request rateRequest = new RateV4Request();
		rateRequest.setPackageObj(packageRequestList);
		String xml=rateRequest.toXML();
		bindQuery("RateV4",xml);
		try {
			RateV4Response rateResponse = (RateV4Response)configureAndExecute(RateV4Response.class);
			if(rateResponse!=null){
				result=rateResponse.getPackageObj();
			}
		} catch (Exception e) {
			UspsException.processError(e);
		}

		return result;
	}
	/**
	 *  The Priority Mail Express Label API will let customers create Priority Mail Express Labels. 
	 *  Please note that the API labels are printed without postage. 
	 *  Postage must be purchased and applied separately.
	 *  
	 * @param labelRequest
	 * @return labelResponse
	 */
	public ExpressMailLabelResponse requestMailLabel(ExpressMailLabelRequest labelRequest){
		ExpressMailLabelResponse result = null;
		String xml=labelRequest.toXML();
		System.out.println(labelRequest.toFormatedXML());
		bindQuery("ExpressMailLabel",xml);
		try {
			ExpressMailLabelResponse labelResponse = (ExpressMailLabelResponse)configureAndExecute(ExpressMailLabelResponse.class);
			if(labelResponse!=null){
				result=labelResponse;
			}
		} catch (Exception e) {
			UspsException.processError(e);
		}
		return result;
	}
	/**
	 * @return the connection
	 */
	public URLConnection getConnection() {
		return connection;
	}
	/**
	 * @param connection the connection to set
	 */
	public void setConnection(URLConnection connection) {
		this.connection = connection;
	}
	/**
	 * @return the charset
	 */
	public String getCharset() {
		return charset;
	}
	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}
	/**
	 * @param query the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}
	/**
	 * @return the uspsUrl
	 */
	public URL getUspsUrl() {
		return uspsUrl;
	}
	/**
	 * @param uspsUrl the uspsUrl to set
	 */
	public void setUspsUrl(URL uspsUrl) {
		this.uspsUrl = uspsUrl;
	}
	public Object configureAndExecute(Class<?> clazz) throws Exception{
		configureConnection();
		return execute(clazz);
	}
	@SuppressWarnings("rawtypes")
	public Object toObject(String results, Class clazz) throws JAXBException{
		JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
    	Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

    	StringReader sr = new StringReader(results);
    	return unmarshaller.unmarshal(sr);
	}
	/**
	 * @return the errorType
	 */
	public Error getErrorType() {
		return errorType;
	}
	/**
	 * @param errorType the errorType to set
	 */
	public void setErrorType(Error errorType) {
		this.errorType = errorType;
	}
}
