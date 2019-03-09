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
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ExpressMailLabelResponse")
@XmlType(propOrder = {"toFirstName",
		"toLastName",
		"toFirm",
		"toAddress1",
		"toAddress2",
		"toCity",
		"toState",
		"toZip5",
		"toZip4",
//		"postage",
		"eMConfirmationNumber",
		"eMLabel",
		"eMReceipt",
		"RDC",
		"insuranceFee",
		"extraServices",
		"zone",
		"carrierRoute",
		"commitment",
		"logMessage"
})

public class ExpressMailLabelResponse {
	private String toFirstName;
	private String toLastName;
	private String toFirm;
	private String toAddress1;
	private String toAddress2;
	private String toCity;
	private String toState;
	private String toZip5;
	private String toZip4;
//	private Postage postage;
	private String eMConfirmationNumber;
	private String eMLabel;
	private String eMReceipt;
	private String RDC;
	private String insuranceFee;
	private String extraServices;
	private String zone;
	private String carrierRoute;
	private String commitment;
	private String logMessage;
	/**
	 * @return the toFirstName
	 */
	public String getToFirstName() {
		return toFirstName;
	}
	/**
	 * @param toFirstName the toFirstName to set
	 */
	@XmlElement(name="ToFirstName")
	public void setToFirstName(String toFirstName) {
		this.toFirstName = toFirstName;
	}
	/**
	 * @return the toLastName
	 */
	public String getToLastName() {
		return toLastName;
	}
	/**
	 * @param toLastName the toLastName to set
	 */
	@XmlElement(name="ToLastName")
	public void setToLastName(String toLastName) {
		this.toLastName = toLastName;
	}
	/**
	 * @return the toFirm
	 */
	public String getToFirm() {
		return toFirm;
	}
	/**
	 * @param toFirm the toFirm to set
	 */
	@XmlElement(name="ToFirm")
	public void setToFirm(String toFirm) {
		this.toFirm = toFirm;
	}
	/**
	 * @return the toAddress1
	 */
	public String getToAddress1() {
		return toAddress1;
	}
	/**
	 * @param toAddress1 the toAddress1 to set
	 */
	@XmlElement(name="ToAddress1")
	public void setToAddress1(String toAddress1) {
		this.toAddress1 = toAddress1;
	}
	/**
	 * @return the toAddress2
	 */
	public String getToAddress2() {
		return toAddress2;
	}
	/**
	 * @param toAddress2 the toAddress2 to set
	 */
	@XmlElement(name="ToAddress2")
	public void setToAddress2(String toAddress2) {
		this.toAddress2 = toAddress2;
	}
	/**
	 * @return the toCity
	 */
	public String getToCity() {
		return toCity;
	}
	/**
	 * @param toCity the toCity to set
	 */
	@XmlElement(name="ToCity")
	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	/**
	 * @return the toState
	 */
	public String getToState() {
		return toState;
	}
	/**
	 * @param toState the toState to set
	 */
	@XmlElement(name="ToState")
	public void setToState(String toState) {
		this.toState = toState;
	}
	/**
	 * @return the toZip5
	 */
	public String getToZip5() {
		return toZip5;
	}
	/**
	 * @param toZip5 the toZip5 to set
	 */
	@XmlElement(name="ToZip5")
	public void setToZip5(String toZip5) {
		this.toZip5 = toZip5;
	}
	/**
	 * @return the toZip4
	 */
	public String getToZip4() {
		return toZip4;
	}
	/**
	 * @param toZip4 the toZip4 to set
	 */
	@XmlElement(name="ToZip4")
	public void setToZip4(String toZip4) {
		this.toZip4 = toZip4;
	}
//	/**
//	 * @return the postage
//	 */
//	public Postage getPostage() {
//		return postage;
//	}
//	/**
//	 * @param postage the postage to set
//	 */
//	@XmlElement(name="Postage")
//	public void setPostage(Postage postage) {
//		this.postage = postage;
//	}
	/**
	 * @return the eMConfirmationNumber
	 */
	public String geteMConfirmationNumber() {
		return eMConfirmationNumber;
	}
	/**
	 * @param eMConfirmationNumber the eMConfirmationNumber to set
	 */
	@XmlElement(name="EMConfirmationNumber")
	public void seteMConfirmationNumber(String eMConfirmationNumber) {
		this.eMConfirmationNumber = eMConfirmationNumber;
	}
	/**
	 * @return the eMLabel
	 */
	public String geteMLabel() {
		return eMLabel;
	}
	/**
	 * @param eMLabel the eMLabel to set
	 */
	@XmlElement(name="EMLabel")
	public void seteMLabel(String eMLabel) {
		this.eMLabel = eMLabel;
	}
	/**
	 * @return the eMReceipt
	 */
	public String geteMReceipt() {
		return eMReceipt;
	}
	/**
	 * @param eMReceipt the eMReceipt to set
	 */
	@XmlElement(name="EMReceipt")
	public void seteMReceipt(String eMReceipt) {
		this.eMReceipt = eMReceipt;
	}
	/**
	 * @return the rDC
	 */
	public String getRDC() {
		return RDC;
	}
	/**
	 * @param rDC the rDC to set
	 */
	@XmlElement(name="RDC")
	public void setRDC(String rDC) {
		RDC = rDC;
	}
	/**
	 * @return the insuranceFee
	 */
	public String getInsuranceFee() {
		return insuranceFee;
	}
	/**
	 * @param insuranceFee the insuranceFee to set
	 */
	@XmlElement(name="InsuranceFee")
	public void setInsuranceFee(String insuranceFee) {
		this.insuranceFee = insuranceFee;
	}
	/**
	 * @return the extraServices
	 */
	public String getExtraServices() {
		return extraServices;
	}
	/**
	 * @param extraServices the extraServices to set
	 */
	@XmlElement(name="ExtraServices")
	public void setExtraServices(String extraServices) {
		this.extraServices = extraServices;
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
	 * @return the carrierRoute
	 */
	public String getCarrierRoute() {
		return carrierRoute;
	}
	/**
	 * @param carrierRoute the carrierRoute to set
	 */
	@XmlElement(name="CarrierRoute")
	public void setCarrierRoute(String carrierRoute) {
		this.carrierRoute = carrierRoute;
	}
	/**
	 * @return the commitment
	 */
	public String getCommitment() {
		return commitment;
	}
	/**
	 * @param commitment the commitment to set
	 */
	@XmlElement(name="Commitment")
	public void setCommitment(String commitment) {
		this.commitment = commitment;
	}
	/**
	 * @return the logMessage
	 */
	public String getLogMessage() {
		return logMessage;
	}
	/**
	 * @param logMessage the logMessage to set
	 */
	@XmlElement(name="LogMessage")
	public void setLogMessage(String logMessage) {
		this.logMessage = logMessage;
	}
	public String toXML() {
		try {
		JAXBContext jaxbContext = JAXBContext.newInstance(ExpressMailLabelResponse.class);
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
		JAXBContext jaxbContext = JAXBContext.newInstance(ExpressMailLabelResponse.class);
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
}
