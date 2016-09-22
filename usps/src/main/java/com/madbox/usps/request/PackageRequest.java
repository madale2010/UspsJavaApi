package com.madbox.usps.request;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.madbox.usps.Content;
import com.madbox.usps.SpecialServices;

@XmlRootElement(name="Package")
@XmlType(propOrder = {"service",
		  "firstClassMailType",
		  "zipOrigination",
		  "zipDestination",
		  "pounds",
		  "ounces",
		  "container",
		  "size",
		  "width",
		  "length",
		  "height",
		  "girth",
		  "value",
		  "amountToCollect",
		  "specialServices",
		  "content",
		  "groundOnly",
		  "sortBy",
		  "machinable",
		  "returnLocations",
		  "returnServiceInfo",
		  "dropOffTime",
		  "shipDate"})

public class PackageRequest {
	private String ID;
	private String service;
	private String firstClassMailType;
	private String zipOrigination;
	private String zipDestination;
	private String pounds;
	private String ounces;
	private String container;
	private String size;
	private String width;
	private String length;
	private String height;
	private String girth;
	private String value;
	private String amountToCollect;
	private SpecialServices specialServices;
	private Content content;
	private String groundOnly;
	private String sortBy;
	private String machinable;
	private String returnLocations;
	private String returnServiceInfo;
	private String dropOffTime;
	private String shipDate;

	
	public PackageRequest(){
		
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
	 * @return the services
	 */
	public String getService() {
		return service;
	}
	/**
	 * @param services the services to set
	 */
	@XmlElement(name="Service")
	public void setService(String services) {
		this.service = services;
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
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */

	@XmlElement(name="Value")
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the amountToCollect
	 */
	
	public String getAmountToCollect() {
		return amountToCollect;
	}
	/**
	 * @param amountToCollect the amountToCollect to set
	 */
	@XmlElement(name="AmountToCollect")
	public void setAmountToCollect(String amountToCollect) {
		this.amountToCollect = amountToCollect;
	}
	/**
	 * @return the specialServices
	 */
	public SpecialServices getSpecialServices() {
		return specialServices;
	}
	/**
	 * @param specialServices the specialServices to set
	 */
	@XmlElement(name="SpecialServices")
	public void setSpecialServices(SpecialServices specialServices) {
		this.specialServices = specialServices;
	}
	/**
	 * @return the content
	 */
	public Content getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	@XmlElement(name="Content")
	public void setContent(Content content) {
		this.content = content;
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
	 * @return the sortBy
	 */
	public String getSortBy() {
		return sortBy;
	}
	/**
	 * @param sortBy the sortBy to set
	 */
	@XmlElement(name="SortBy")
	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}
	/**
	 * @return the returnServiceInfo
	 */
	public String getReturnServiceInfo() {
		return returnServiceInfo;
	}
	/**
	 * @param returnServiceInfo the returnServiceInfo to set
	 */
	@XmlElement(name="ReturnServiceInfo")
	public void setReturnServiceInfo(String returnServiceInfo) {
		this.returnServiceInfo = returnServiceInfo;
	}
	/**
	 * @return the returnLocations
	 */
	public String getReturnLocations() {
		return returnLocations;
	}
	/**
	 * @param returnLocations the returnLocations to set
	 */
	@XmlElement(name="ReturnLocations")
	public void setReturnLocations(String returnLocations) {
		this.returnLocations = returnLocations;
	}
	/**
	 * @return the dropOffTime
	 */
	public String getDropOffTime() {
		return dropOffTime;
	}
	/**
	 * @param dropOffTime the dropOffTime to set
	 */
	@XmlElement(name="DropOffTime")
	public void setDropOffTime(String dropOffTime) {
		this.dropOffTime = dropOffTime;
	}
	/**
	 * @return the shipDate
	 */
	public String getShipDate() {
		return shipDate;
	}
	/**
	 * @param shipDate the shipDate to set
	 */
	@XmlElement(name="ShipDate")
	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}
	public String toXML() {
		try {
		JAXBContext jaxbContext = JAXBContext.newInstance(PackageRequest.class);
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
		JAXBContext jaxbContext = JAXBContext.newInstance(PackageRequest.class);
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
	public String[] getValidContainers(String service){
		String[] validcontainers=null;
		if(service.equalsIgnoreCase("Priority")){
			if(this.size!=null){
				if(this.size.equalsIgnoreCase("Regular")){
					validcontainers=new String[]{"VARIABLE", 
												 "FLAT RATE ENVELOPE", 
												 "LEGAL FLAT RATE ENVELOPE", 
												 "PADDED FLAT RATE ENVELOPE", 
												 "SM FLAT RATE ENVELOPE", 
												 "WINDOW FLAT RATE ENVELOPE", 
												 "GIFT CARD FLAT RATE ENVELOPE", 
												 "SM FLAT RATE BOX",
												 "MD FLAT RATE BOX",
												 "LG FLAT RATE BOX"};
					
				}
				else if(this.size.equalsIgnoreCase("Large")){
					validcontainers=new String[]{"Rectangular"};
				}
			}
		}
		if(service.equalsIgnoreCase("First Class")){
			//Only for parcel if under 13 oz and size is large
			if(this.pounds!=null && this.ounces!=null && this.size!=null){
				if(this.pounds.equals("0") && Integer.valueOf(this.ounces)<=13 && this.size.equalsIgnoreCase("large")){
					validcontainers=new String[]{"Rectangular","Nonrectangular"};
				}
			}
		}
		if(service.equalsIgnoreCase("Priority Mail Express")){
			if(this.size!=null){
				if(this.size.equalsIgnoreCase("Regular")){
					validcontainers=new String[]{"Flat Rate Box",
												 "Flat Rate Env.",
												 "Legal Flat Rate Env.",
												 "Padded Flat Rate Env.",
												 "Flat Rate Box",
												 "Variable/Null"};
				}
				if(this.size.equalsIgnoreCase("Large")){
					validcontainers=new String[]{"Rectangular","Nonrectangular"};
				}
			}
		}
		return validcontainers;
	}
}
