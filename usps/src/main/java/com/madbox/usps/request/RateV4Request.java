/*******************************************************
 * Copyright (C) 2012-2019 Adam Dale adamdale2018@gmail.com
 * 
 * This file is part of Madbox Solutions.
 * 
 * USPS Java Api can not be copied and/or distributed without the express
 * permission of Madbox Solutions.
 *******************************************************/
package com.madbox.usps.request;

import java.io.StringWriter;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="RateV4Request")
@XmlType(propOrder = {"revision","packageObj"})
public class RateV4Request {
	private String userId="<user id from usps>";
	private ArrayList<PackageRequest> packageObjList;
	private String revision;
	public RateV4Request(){
		
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	@XmlAttribute(name="USERID")
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the packageObj
	 */
	public ArrayList<PackageRequest> getPackageObj() {
		return packageObjList;
	}
	/**
	 * @param packageObj the packageObj to set
	 */
	 @XmlElement(name="Package")
	public void setPackageObj(ArrayList<PackageRequest> list) {
		this.packageObjList = list;
	}

	public String toXML() {
		try {
		JAXBContext jaxbContext = JAXBContext.newInstance(RateV4Request.class);
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
	public String toFormatedXML() {
		try {
		JAXBContext jaxbContext = JAXBContext.newInstance(RateV4Request.class);
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
	 * @return the revision
	 */
	public String getRevision() {
		return revision;
	}
	/**
	 * @param revision the revision to set
	 */
	@XmlElement(name="Revision")
	public void setRevision(String revision) {
		this.revision = revision;
	}
}
