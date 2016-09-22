package com.madbox.usps.response;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.madbox.usps.Postage;

@XmlRootElement(name="Package")
@XmlType(propOrder = {"zipOrigination",
					  "zipDestination",
					  "pounds",
					  "ounces",
					  "firstClassMailType",
					  "container",
					  "size",
					  "width",
					  "length",
					  "height",
					  "girth",
					  "machinable",
					  "zone",
					  "postage",
					  "restrictions",
					  "ratePriceType",
					  "ratePaymentType",
					  "error",})

public class PackageResponse {
	private String ID;
	private String zipOrigination;
	private String zipDestination;
	private String pounds;
	private String ounces;
	private String firstClassMailType;
	private String container;
	private String size;
	private String width;
	private String length;
	private String height;
	private String girth;
	private String machinable;
	private String zone;
	private Postage postage;
	private String restrictions;
	private String ratePriceType;
	private String ratePaymentType;
	private com.madbox.usps.utils.Error error;

	
	public PackageResponse(){
		
	}
	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	@XmlAttribute(name="ID")
	public void setID(String iD) {
		this.ID = iD;
	}

	/**
	 * @return the zipOrigination
	 */
	public String getZipOrigination() {
		return zipOrigination;
	}
	/**
	 * @param zipOrigination the zipOrigination to set
	 */
	@XmlElement(name="ZipOrigination")
	public void setZipOrigination(String zipOrigination) {
		this.zipOrigination = zipOrigination;
	}
	/**
	 * @return the zipDestination
	 */
	public String getZipDestination() {
		return zipDestination;
	}
	/**
	 * @param zipDestination the zipDestination to set
	 */
	@XmlElement(name="ZipDestination")
	public void setZipDestination(String zipDestination) {
		this.zipDestination = zipDestination;
	}
	/**
	 * @return the pounds
	 */
	public String getPounds() {
		return pounds;
	}
	/**
	 * @param pounds the pounds to set
	 */
	@XmlElement(name="Pounds")
	public void setPounds(String pounds) {
		this.pounds = pounds;
	}
	/**
	 * @return the ounces
	 */
	public String getOunces() {
		return ounces;
	}
	/**
	 * @param ounces the ounces to set
	 */
	@XmlElement(name="Ounces")
	public void setOunces(String ounces) {
		this.ounces = ounces;
	}
	/**
	 * @return the container
	 */
	public String getContainer() {
		return container;
	}
	/**
	 * @param container the container to set
	 */
	 @XmlElement(name="Container")
	public void setContainer(String container) {
		this.container = container;
	}
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	 @XmlElement(name="Size")
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the postage
	 */
	public Postage getPostage() {
		return postage;
	}
	/**
	 * @param postage the postage to set
	 */
	 @XmlElement(name="Postage")
	public void setPostage(Postage postage) {
		this.postage = postage;
	}
	/**
	 * @return the zone
	 */
	public String getZone() {
		return zone;
	}
	/**
	 * @param zone the zone to set
	 */
	 @XmlElement(name="Zone")
	public void setZone(String zone) {
		this.zone = zone;
	}
	/**
	 * @return the firstClassMailType
	 */
	public String getFirstClassMailType() {
		return firstClassMailType;
	}
	/**
	 * @param firstClassMailType the firstClassMailType to set
	 */
	@XmlElement(name="FirstClassMailType")
	public void setFirstClassMailType(String firstClassMailType) {
		this.firstClassMailType = firstClassMailType;
	}
	/**
	 * @return the width
	 */
	public String getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	@XmlElement (name="Width")
	public void setWidth(String width) {
		this.width = width;
	}
	/**
	 * @return the length
	 */
	public String getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	@XmlElement (name="Length")
	public void setLength(String length) {
		this.length = length;
	}
	/**
	 * @return the height
	 */
	public String getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	@XmlElement (name="Height")
	public void setHeight(String height) {
		this.height = height;
	}
	/**
	 * @return the girth
	 */
	public String getGirth() {
		return girth;
	}
	/**
	 * @param girth the girth to set
	 */
	@XmlElement (name="Girth")
	public void setGirth(String girth) {
		this.girth = girth;
	}
	/**
	 * @return the machinable
	 */
	public String getMachinable() {
		return machinable;
	}
	/**
	 * @param machinable the machinable to set
	 */
	@XmlElement (name="Machinable")
	public void setMachinable(String machinable) {
		this.machinable = machinable;
	}
	/**
	 * @return the restrictions
	 */
	public String getRestrictions() {
		return restrictions;
	}
	/**
	 * @param restrictions the restrictions to set
	 */
	@XmlElement (name="Restrictions")
	public void setRestrictions(String restrictions) {
		this.restrictions = restrictions;
	}
	/**
	 * @return the ratePriceType
	 */
	public String getRatePriceType() {
		return ratePriceType;
	}
	/**
	 * @param ratePriceType the ratePriceType to set
	 */
	@XmlElement (name="RatePriceType")
	public void setRatePriceType(String ratePriceType) {
		this.ratePriceType = ratePriceType;
	}
	/**
	 * @return the ratePaymentType
	 */
	public String getRatePaymentType() {
		return ratePaymentType;
	}
	/**
	 * @param ratePaymentType the ratePaymentType to set
	 */
	@XmlElement (name="RatePaymentType")
	public void setRatePaymentType(String ratePaymentType) {
		this.ratePaymentType = ratePaymentType;
	}
	/**
	 * @return the error
	 */
	public com.madbox.usps.utils.Error getError() {
		return error;
	}
	/**
	 * @param error the error to set
	 */
	@XmlElement (name="Error")
	public void setError(com.madbox.usps.utils.Error error) {
		this.error = error;
	}

	public String toXML() {
		try {
		JAXBContext jaxbContext = JAXBContext.newInstance(PackageResponse.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
		StringWriter sw = new StringWriter();
		jaxbMarshaller.marshal(this, sw);
		String xmlString = sw.toString();
		return xmlString;
		} catch(Exception e){
			e.printStackTrace();
		}
		return "";
	}
	public String toFormatedXML() {
		try {
		JAXBContext jaxbContext = JAXBContext.newInstance(PackageResponse.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
		StringWriter sw = new StringWriter();
		jaxbMarshaller.marshal(this, sw);
		String xmlString = sw.toString();
		return xmlString;
		} catch(Exception e){
			e.printStackTrace();
		}
		return "";
	}
	public void printXML(){
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance(this.getClass());
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
			StringWriter stringWriter = new StringWriter();
			marshaller.marshal(this, stringWriter );
			System.out.println(stringWriter.toString());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void appendError(com.madbox.usps.utils.Error errorType) {
		// TODO Auto-generated method stub
		this.error=errorType;
	}
}
