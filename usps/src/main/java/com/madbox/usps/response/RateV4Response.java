/*******************************************************
 * Copyright (C) 2012-2019 Adam Dale adamdale2018@gmail.com
 * 
 * This file is part of Madbox Solutions.
 * 
 * USPS Java Api can not be copied and/or distributed without the express
 * permission of Madbox Solutions.
 *******************************************************/
package com.madbox.usps.response;

import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="RateV4Response")
public class RateV4Response {
	private PackageResponse packageObj;
	private Error error;
	public RateV4Response(){
		
	}
	/**
	 * @return the packageObj
	 */
	public PackageResponse getPackageObj() {
		return packageObj;
	}
	/**
	 * @param packageObj the packageObj to set
	 */
	 @XmlElement(name="Package")
	public void setPackageObj(PackageResponse packageObj) {
		this.packageObj = packageObj;
	}

	public String toXML() {
		try {
		JAXBContext jaxbContext = JAXBContext.newInstance(RateV4Response.class);
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
		JAXBContext jaxbContext = JAXBContext.newInstance(RateV4Response.class);
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
	/**
	 * @return the error
	 */
	public Error getError() {
		return error;
	}
	/**
	 * @param error the error to set
	 */
	public void setError(Error error) {
		this.error = error;
	}
	public void appendError(Error errorType) {
		this.error= errorType;
	}
}
