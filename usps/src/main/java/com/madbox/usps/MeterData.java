package com.madbox.usps;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author madal
 *
 */
@XmlRootElement(name="MeterData")
@XmlType(propOrder = {"meterVendorID","meterSerialNumber","meterModelID","rateCategory","indiciumCreationRecordDate","ibi"})
public class MeterData {
	private String meterVendorID;
	private String meterSerialNumber;
	private String meterModelID;
	private String rateCategory;
	private String indiciumCreationRecordDate;
	private String ibi;
	/**
	 * @return the meterVendorID
	 */
	public String getMeterVendorID() {
		return meterVendorID;
	}
	/**
	 * @param meterVendorID the meterVendorID to set
	 */
	@XmlElement(name="MeterVendorID")
	public void setMeterVendorID(String meterVendorID) {
		this.meterVendorID = meterVendorID;
	}
	/**
	 * @return the meterSerialNumber
	 */
	public String getMeterSerialNumber() {
		return meterSerialNumber;
	}
	/**
	 * @param meterSerialNumber the meterSerialNumber to set
	 */
	@XmlElement(name="MeterSerialNumber")
	public void setMeterSerialNumber(String meterSerialNumber) {
		this.meterSerialNumber = meterSerialNumber;
	}
	/**
	 * @return the meterModelID
	 */
	public String getMeterModelID() {
		return meterModelID;
	}
	/**
	 * @param meterModelID the meterModelID to set
	 */
	@XmlElement(name="MeterModelID")
	public void setMeterModelID(String meterModelID) {
		this.meterModelID = meterModelID;
	}
	/**
	 * @return the rateCategory
	 */
	public String getRateCategory() {
		return rateCategory;
	}
	/**
	 * @param rateCategory the rateCategory to set
	 */
	@XmlElement(name="RateCategory")
	public void setRateCategory(String rateCategory) {
		this.rateCategory = rateCategory;
	}
	/**
	 * @return the indiciumCreationRecordDate
	 */
	public String getIndiciumCreationRecordDate() {
		return indiciumCreationRecordDate;
	}
	/**
	 * @param indiciumCreationRecordDate the indiciumCreationRecordDate to set
	 */
	@XmlElement(name="IndiciumCreationRecordDate")
	public void setIndiciumCreationRecordDate(String indiciumCreationRecordDate) {
		this.indiciumCreationRecordDate = indiciumCreationRecordDate;
	}
	/**
	 * @return the ibi
	 */
	public String getIbi() {
		return ibi;
	}
	/**
	 * @param ibi the ibi to set
	 */
	@XmlElement(name="IBI")
	public void setIbi(String ibi) {
		this.ibi = ibi;
	}
}
