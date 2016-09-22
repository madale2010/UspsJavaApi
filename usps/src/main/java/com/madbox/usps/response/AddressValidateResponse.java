package com.madbox.usps.response;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.madbox.usps.Address;

@XmlRootElement(name="AddressValidateResponse")
public class AddressValidateResponse {
	private Address address;
	public AddressValidateResponse(){
		
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	@XmlElement(name="Address")
	public void setAddress(Address address) {
		this.address = address;
	}
	public String toXML() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(AddressValidateResponse.class);
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
			JAXBContext jaxbContext = JAXBContext.newInstance(AddressValidateResponse.class);
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
}
