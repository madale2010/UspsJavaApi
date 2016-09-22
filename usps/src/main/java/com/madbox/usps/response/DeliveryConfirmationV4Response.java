package com.madbox.usps.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author madal
 *
 */
@XmlRootElement(name="DeliveryConfirmationV4Response")
@XmlType(propOrder = {"deliveryConfirmationNumber",
		"deliveryConfirmationLabel",
		"toName",
		"toFirm",
		"toAddress1",
		"toAddress2",
		"toCity",
		"toState",
		"toZip5",
		"toZip4",
		"toPOBoxFlag",
		"postnet",
		"RDC",
		"postage",
		"zone",
		"insuranceFee",
		"carrierRoute",
		"carrierRelease",
		"extraServices",
		"extraService",
		"serviceID",
		"serviceName",
		"price",
		"commitment",
		"commitmentName",
		"scheduledDeliveryDate"})
public class DeliveryConfirmationV4Response {
	private String deliveryConfirmationNumber;
	private String deliveryConfirmationLabel;
	private String toName;
	private String toFirm;
	private String toAddress1;
	private String toAddress2;
	private String toCity;
	private String toState;
	private String toZip5;
	private String toZip4;
	private String toPOBoxFlag;
	private String postnet;
	private String RDC;
	private String postage;
	private String zone;
	private String insuranceFee;
	private String carrierRoute;
	private String carrierRelease;
	private String extraServices;
	private String extraService;
	private String serviceID;
	private String serviceName;
	private String price;
	private String commitment;
	private String commitmentName;
	private String scheduledDeliveryDate;
	/**
	 * @return the deliveryConfirmationNumber
	 */
	public String getDeliveryConfirmationNumber() {
		return deliveryConfirmationNumber;
	}
	/**
	 * @param deliveryConfirmationNumber the deliveryConfirmationNumber to set
	 */
	@XmlElement(name="DeliveryConfirmationNumber")
	public void setDeliveryConfirmationNumber(String deliveryConfirmationNumber) {
		this.deliveryConfirmationNumber = deliveryConfirmationNumber;
	}
	/**
	 * @return the deliveryConfirmationLabel
	 */
	public String getDeliveryConfirmationLabel() {
		return deliveryConfirmationLabel;
	}
	/**
	 * @param deliveryConfirmationLabel the deliveryConfirmationLabel to set
	 */
	@XmlElement(name="DeliveryConfirmationLabel")
	public void setDeliveryConfirmationLabel(String deliveryConfirmationLabel) {
		this.deliveryConfirmationLabel = deliveryConfirmationLabel;
	}
	/**
	 * @return the toName
	 */
	public String getToName() {
		return toName;
	}
	/**
	 * @param toName the toName to set
	 */
	@XmlElement(name="ToName")
	public void setToName(String toName) {
		this.toName = toName;
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
	/**
	 * @return the toPOBoxFlag
	 */
	public String getToPOBoxFlag() {
		return toPOBoxFlag;
	}
	/**
	 * @param toPOBoxFlag the toPOBoxFlag to set
	 */
	@XmlElement(name="ToPOBoxFlag")
	public void setToPOBoxFlag(String toPOBoxFlag) {
		this.toPOBoxFlag = toPOBoxFlag;
	}
	/**
	 * @return the postnet
	 */
	public String getPostnet() {
		return postnet;
	}
	/**
	 * @param postnet the postnet to set
	 */
	@XmlElement(name="Postnet")
	public void setPostnet(String postnet) {
		this.postnet = postnet;
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
	 * @return the postage
	 */
	public String getPostage() {
		return postage;
	}
	/**
	 * @param postage the postage to set
	 */
	@XmlElement(name="Postage")
	public void setPostage(String postage) {
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
	 * @return the carrierRelease
	 */
	public String getCarrierRelease() {
		return carrierRelease;
	}
	/**
	 * @param carrierRelease the carrierRelease to set
	 */
	@XmlElement(name="CarrierRelease")
	public void setCarrierRelease(String carrierRelease) {
		this.carrierRelease = carrierRelease;
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
	 * @return the extraService
	 */
	public String getExtraService() {
		return extraService;
	}
	/**
	 * @param extraService the extraService to set
	 */
	@XmlElement(name="ExtraService")
	public void setExtraService(String extraService) {
		this.extraService = extraService;
	}
	/**
	 * @return the serviceID
	 */
	public String getServiceID() {
		return serviceID;
	}
	/**
	 * @param serviceID the serviceID to set
	 */
	@XmlElement(name="ServiceID")
	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}
	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}
	/**
	 * @param serviceName the serviceName to set
	 */
	@XmlElement(name="ServiceName")
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	@XmlElement(name="Price")
	public void setPrice(String price) {
		this.price = price;
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
	 * @return the commitmentName
	 */
	public String getCommitmentName() {
		return commitmentName;
	}
	/**
	 * @param commitmentName the commitmentName to set
	 */
	@XmlElement(name="CommitmentName")
	public void setCommitmentName(String commitmentName) {
		this.commitmentName = commitmentName;
	}
	/**
	 * @return the scheduledDeliveryDate
	 */
	public String getScheduledDeliveryDate() {
		return scheduledDeliveryDate;
	}
	/**
	 * @param scheduledDeliveryDate the scheduledDeliveryDate to set
	 */
	@XmlElement(name="ScheduledDeliveryDate")
	public void setScheduledDeliveryDate(String scheduledDeliveryDate) {
		this.scheduledDeliveryDate = scheduledDeliveryDate;
	}
}
