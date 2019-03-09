/*******************************************************
 * Copyright (C) 2012-2019 Adam Dale adamdale2018@gmail.com
 * 
 * This file is part of Madbox Solutions.
 * 
 * USPS Java Api can not be copied and/or distributed without the express
 * permission of Madbox Solutions.
 *******************************************************/
package com.madbox.usps.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author madal
 *
 */
@XmlRootElement(name="DeliveryConfirmationV4.0Request")
@XmlType(propOrder = {"option",
		"revision",
		"imageParameters",
		"fromName",
		"fromFirm",
		"fromAddress1",
		"fromAddress2",
		"fromCity",
		"fromState",
		"fromZip5",
		"fromZip4",
		"toName",
		"toFirm",
		"toAddress1",
		"toAddress2",
		"toCity",
		"toState",
		"toZip5",
		"toZip4",
		"toPOBoxFlag",
		"toContactPreference",
		"toContactMessaging",
		"toContactEMail",
		"weightInOunces",
		"serviceType",
		"insuredAmount",
		"waiverOfSignature",
		"separateReceiptPage",
		"pOZipCode",
		"imageType",
		"labelDate",
		"customerRefNo",
		"addressServiceRequested",
		"senderName",
		"senderEMail",
		"recipientName",
		"recipientEMail",
		"allowNonCleansedDestAddr",
		"holdForManifest",
		"container",
		"size",
		"width",
		"length",
		"height",
		"girth",
		"machinable",
		"commercialPrice",
		"extraServices",
		"carrierRelease",
		"returnCommitments",
		"groundOnly",
		"content",
		"contentType",
		"contentDescription",
		"meterData"})
public class DeliveryConfirmationV4Request {
	private String option;
	private String revision;
	private String imageParameters;
	private String fromName;
	private String fromFirm;
	private String fromAddress1;
	private String fromAddress2;
	private String fromCity;
	private String fromState;
	private String fromZip5;
	private String fromZip4;
	private String toName;
	private String toFirm;
	private String toAddress1;
	private String toAddress2;
	private String toCity;
	private String toState;
	private String toZip5;
	private String toZip4;
	private String toPOBoxFlag;
	private String toContactPreference;
	private String toContactMessaging;
	private String toContactEMail;
	private String weightInOunces;
	private String serviceType;
	private String insuredAmount;
	private String waiverOfSignature;
	private String separateReceiptPage;
	private String pOZipCode;
	private String imageType;
	private String labelDate;
	private String customerRefNo;
	private String addressServiceRequested;
	private String senderName;
	private String senderEMail;
	private String recipientName;
	private String recipientEMail;
	private String allowNonCleansedDestAddr;
	private String holdForManifest;
	private String container;
	private String size;
	private String width;
	private String length;
	private String height;
	private String girth;
	private String machinable;
	private String commercialPrice;
	private String extraServices;
	private String carrierRelease;
	private String returnCommitments;
	private String groundOnly;
	private String content;
	private String contentType;
	private String contentDescription;
	private String meterData;
	/**
	 * @return the option
	 */
	public String getOption() {
		return option;
	}
	/**
	 * @param option the option to set
	 */
	@XmlElement(name="Option")
	public void setOption(String option) {
		this.option = option;
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
	/**
	 * @return the imageParameters
	 */
	public String getImageParameters() {
		return imageParameters;
	}
	/**
	 * @param imageParameters the imageParameters to set
	 */
	@XmlElement(name="ImageParameters")
	public void setImageParameters(String imageParameters) {
		this.imageParameters = imageParameters;
	}
	/**
	 * @return the fromName
	 */
	public String getFromName() {
		return fromName;
	}
	/**
	 * @param fromName the fromName to set
	 */
	@XmlElement(name="FromName")
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}
	/**
	 * @return the fromFirm
	 */
	public String getFromFirm() {
		return fromFirm;
	}
	/**
	 * @param fromFirm the fromFirm to set
	 */
	@XmlElement(name="FromFirm")
	public void setFromFirm(String fromFirm) {
		this.fromFirm = fromFirm;
	}
	/**
	 * @return the fromAddress1
	 */
	public String getFromAddress1() {
		return fromAddress1;
	}
	/**
	 * @param fromAddress1 the fromAddress1 to set
	 */
	@XmlElement(name="FromAddress1")
	public void setFromAddress1(String fromAddress1) {
		this.fromAddress1 = fromAddress1;
	}
	/**
	 * @return the fromAddress2
	 */
	public String getFromAddress2() {
		return fromAddress2;
	}
	/**
	 * @param fromAddress2 the fromAddress2 to set
	 */
	@XmlElement(name="FromAddress2")
	public void setFromAddress2(String fromAddress2) {
		this.fromAddress2 = fromAddress2;
	}
	/**
	 * @return the fromCity
	 */
	public String getFromCity() {
		return fromCity;
	}
	/**
	 * @param fromCity the fromCity to set
	 */
	@XmlElement(name="FromCity")
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	/**
	 * @return the fromState
	 */
	public String getFromState() {
		return fromState;
	}
	/**
	 * @param fromState the fromState to set
	 */
	@XmlElement(name="FromState")
	public void setFromState(String fromState) {
		this.fromState = fromState;
	}
	/**
	 * @return the fromZip5
	 */
	public String getFromZip5() {
		return fromZip5;
	}
	/**
	 * @param fromZip5 the fromZip5 to set
	 */
	@XmlElement(name="FromZip5")
	public void setFromZip5(String fromZip5) {
		this.fromZip5 = fromZip5;
	}
	/**
	 * @return the fromZip4
	 */
	public String getFromZip4() {
		return fromZip4;
	}
	/**
	 * @param fromZip4 the fromZip4 to set
	 */
	@XmlElement(name="FromZip4")
	public void setFromZip4(String fromZip4) {
		this.fromZip4 = fromZip4;
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
	 * @return the toContactPreference
	 */
	public String getToContactPreference() {
		return toContactPreference;
	}
	/**
	 * @param toContactPreference the toContactPreference to set
	 */
	@XmlElement(name="ToContactPreference")
	public void setToContactPreference(String toContactPreference) {
		this.toContactPreference = toContactPreference;
	}
	/**
	 * @return the toContactMessaging
	 */
	public String getToContactMessaging() {
		return toContactMessaging;
	}
	/**
	 * @param toContactMessaging the toContactMessaging to set
	 */
	@XmlElement(name="ToContactMessaging")
	public void setToContactMessaging(String toContactMessaging) {
		this.toContactMessaging = toContactMessaging;
	}
	/**
	 * @return the toContactEMail
	 */
	public String getToContactEMail() {
		return toContactEMail;
	}
	/**
	 * @param toContactEMail the toContactEMail to set
	 */
	@XmlElement(name="ToContactEMail")
	public void setToContactEMail(String toContactEMail) {
		this.toContactEMail = toContactEMail;
	}
	/**
	 * @return the weightInOunces
	 */
	public String getWeightInOunces() {
		return weightInOunces;
	}
	/**
	 * @param weightInOunces the weightInOunces to set
	 */
	@XmlElement(name="WeightInOunces")
	public void setWeightInOunces(String weightInOunces) {
		this.weightInOunces = weightInOunces;
	}
	/**
	 * @return the serviceType
	 */
	public String getServiceType() {
		return serviceType;
	}
	/**
	 * @param serviceType the serviceType to set
	 */
	@XmlElement(name="ServiceType")
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	/**
	 * @return the insuredAmount
	 */
	public String getInsuredAmount() {
		return insuredAmount;
	}
	/**
	 * @param insuredAmount the insuredAmount to set
	 */
	@XmlElement(name="InsuredAmount")
	public void setInsuredAmount(String insuredAmount) {
		this.insuredAmount = insuredAmount;
	}
	/**
	 * @return the waiverOfSignature
	 */
	public String getWaiverOfSignature() {
		return waiverOfSignature;
	}
	/**
	 * @param waiverOfSignature the waiverOfSignature to set
	 */
	@XmlElement(name="WaiverOfSignature")
	public void setWaiverOfSignature(String waiverOfSignature) {
		this.waiverOfSignature = waiverOfSignature;
	}
	/**
	 * @return the separateReceiptPage
	 */
	public String getSeparateReceiptPage() {
		return separateReceiptPage;
	}
	/**
	 * @param separateReceiptPage the separateReceiptPage to set
	 */
	@XmlElement(name="SeparateReceiptPage")
	public void setSeparateReceiptPage(String separateReceiptPage) {
		this.separateReceiptPage = separateReceiptPage;
	}
	/**
	 * @return the pOZipCode
	 */
	public String getpOZipCode() {
		return pOZipCode;
	}
	/**
	 * @param pOZipCode the pOZipCode to set
	 */
	@XmlElement(name="POZipCode")
	public void setpOZipCode(String pOZipCode) {
		this.pOZipCode = pOZipCode;
	}
	/**
	 * @return the imageType
	 */
	public String getImageType() {
		return imageType;
	}
	/**
	 * @param imageType the imageType to set
	 */
	@XmlElement(name="ImageType")
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	/**
	 * @return the labelDate
	 */
	public String getLabelDate() {
		return labelDate;
	}
	/**
	 * @param labelDate the labelDate to set
	 */
	@XmlElement(name="LabelDate")
	public void setLabelDate(String labelDate) {
		this.labelDate = labelDate;
	}
	/**
	 * @return the customerRefNo
	 */
	public String getCustomerRefNo() {
		return customerRefNo;
	}
	/**
	 * @param customerRefNo the customerRefNo to set
	 */
	@XmlElement(name="CustomerRefNo")
	public void setCustomerRefNo(String customerRefNo) {
		this.customerRefNo = customerRefNo;
	}
	/**
	 * @return the addressServiceRequested
	 */
	public String getAddressServiceRequested() {
		return addressServiceRequested;
	}
	/**
	 * @param addressServiceRequested the addressServiceRequested to set
	 */
	@XmlElement(name="AddressServiceRequested")
	public void setAddressServiceRequested(String addressServiceRequested) {
		this.addressServiceRequested = addressServiceRequested;
	}
	/**
	 * @return the senderName
	 */
	public String getSenderName() {
		return senderName;
	}
	/**
	 * @param senderName the senderName to set
	 */
	@XmlElement(name="SenderName")
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	/**
	 * @return the senderEMail
	 */
	public String getSenderEMail() {
		return senderEMail;
	}
	/**
	 * @param senderEMail the senderEMail to set
	 */
	@XmlElement(name="SenderEMail")
	public void setSenderEMail(String senderEMail) {
		this.senderEMail = senderEMail;
	}
	/**
	 * @return the recipientName
	 */
	public String getRecipientName() {
		return recipientName;
	}
	/**
	 * @param recipientName the recipientName to set
	 */
	@XmlElement(name="RecipientName")
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	/**
	 * @return the recipientEMail
	 */
	public String getRecipientEMail() {
		return recipientEMail;
	}
	/**
	 * @param recipientEMail the recipientEMail to set
	 */
	@XmlElement(name="RecipientEMail")
	public void setRecipientEMail(String recipientEMail) {
		this.recipientEMail = recipientEMail;
	}
	/**
	 * @return the allowNonCleansedDestAddr
	 */
	public String getAllowNonCleansedDestAddr() {
		return allowNonCleansedDestAddr;
	}
	/**
	 * @param allowNonCleansedDestAddr the allowNonCleansedDestAddr to set
	 */
	@XmlElement(name="AllowNonCleansedDestAddr")
	public void setAllowNonCleansedDestAddr(String allowNonCleansedDestAddr) {
		this.allowNonCleansedDestAddr = allowNonCleansedDestAddr;
	}
	/**
	 * @return the holdForManifest
	 */
	public String getHoldForManifest() {
		return holdForManifest;
	}
	/**
	 * @param holdForManifest the holdForManifest to set
	 */
	@XmlElement(name="HoldForManifest")
	public void setHoldForManifest(String holdForManifest) {
		this.holdForManifest = holdForManifest;
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
	 * @return the width
	 */
	public String getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	@XmlElement(name="Width")
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
	@XmlElement(name="Length")
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
	@XmlElement(name="Height")
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
	@XmlElement(name="Girth")
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
	@XmlElement(name="Machinable")
	public void setMachinable(String machinable) {
		this.machinable = machinable;
	}
	/**
	 * @return the commercialPrice
	 */
	public String getCommercialPrice() {
		return commercialPrice;
	}
	/**
	 * @param commercialPrice the commercialPrice to set
	 */
	@XmlElement(name="CommercialPrice")
	public void setCommercialPrice(String commercialPrice) {
		this.commercialPrice = commercialPrice;
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
	 * @return the returnCommitments
	 */
	public String getReturnCommitments() {
		return returnCommitments;
	}
	/**
	 * @param returnCommitments the returnCommitments to set
	 */
	@XmlElement(name="ReturnCommitments")
	public void setReturnCommitments(String returnCommitments) {
		this.returnCommitments = returnCommitments;
	}
	/**
	 * @return the groundOnly
	 */
	public String getGroundOnly() {
		return groundOnly;
	}
	/**
	 * @param groundOnly the groundOnly to set
	 */
	@XmlElement(name="GroundOnly")
	public void setGroundOnly(String groundOnly) {
		this.groundOnly = groundOnly;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	@XmlElement(name="Content")
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}
	/**
	 * @param contentType the contentType to set
	 */
	@XmlElement(name="ContentType")
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	/**
	 * @return the contentDescription
	 */
	public String getContentDescription() {
		return contentDescription;
	}
	/**
	 * @param contentDescription the contentDescription to set
	 */
	@XmlElement(name="ContentDescription")
	public void setContentDescription(String contentDescription) {
		this.contentDescription = contentDescription;
	}
	/**
	 * @return the meterData
	 */
	public String getMeterData() {
		return meterData;
	}
	/**
	 * @param meterData the meterData to set
	 */
	@XmlElement(name="MeterData")
	public void setMeterData(String meterData) {
		this.meterData = meterData;
	}
}
