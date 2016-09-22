package com.madbox.usps;

public class ShippingProfile {
	private int profileId;
	private String profileName;
	private int originZip;
	private String processTime;
	private String shipToCountries;
	private String shippingServices;
	private String freeShippingDomestic;
	private String freeShippingInter;
	private Double handlingFee;
	public ShippingProfile(){
		
	}
	/**
	 * @return the profileId
	 */
	public int getProfileId() {
		return profileId;
	}
	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	/**
	 * @return the profileName
	 */
	public String getProfileName() {
		return profileName;
	}
	/**
	 * @param profileName the profileName to set
	 */
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	/**
	 * @return the originZip
	 */
	public int getOriginZip() {
		return originZip;
	}
	/**
	 * @param originZip the originZip to set
	 */
	public void setOriginZip(int originZip) {
		this.originZip = originZip;
	}
	/**
	 * @return the processTime
	 */
	public String getProcessTime() {
		return processTime;
	}
	/**
	 * @param processTime the processTime to set
	 */
	public void setProcessTime(String processTime) {
		this.processTime = processTime;
	}
	/**
	 * @return the shipToCountries
	 */
	public String getShipToCountries() {
		return shipToCountries;
	}
	/**
	 * @param shipToCountries the shipToCountries to set
	 */
	public void setShipToCountries(String shipToCountries) {
		this.shipToCountries = shipToCountries;
	}
	/**
	 * @return the shippingServices
	 */
	public String getShippingServices() {
		return shippingServices;
	}
	/**
	 * @param shippingServices the shippingServices to set
	 */
	public void setShippingServices(String shippingServices) {
		this.shippingServices = shippingServices;
	}
	/**
	 * @return the freeShippingDomestic
	 */
	public String getFreeShippingDomestic() {
		return freeShippingDomestic;
	}
	/**
	 * @param freeShippingDomestic the freeShippingDomestic to set
	 */
	public void setFreeShippingDomestic(String freeShippingDomestic) {
		this.freeShippingDomestic = freeShippingDomestic;
	}
	/**
	 * @return the freeShippingInter
	 */
	public String getFreeShippingInter() {
		return freeShippingInter;
	}
	/**
	 * @param freeShippingInter the freeShippingInter to set
	 */
	public void setFreeShippingInter(String freeShippingInter) {
		this.freeShippingInter = freeShippingInter;
	}
	/**
	 * @return the handlingFee
	 */
	public Double getHandlingFee() {
		return handlingFee;
	}
	/**
	 * @param handlingFee the handlingFee to set
	 */
	public void setHandlingFee(Double handlingFee) {
		this.handlingFee = handlingFee;
	}
}
