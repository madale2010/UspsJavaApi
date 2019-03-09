/*******************************************************
 * Copyright (C) 2012-2019 Adam Dale adamdale2018@gmail.com
 * 
 * This file is part of Madbox Solutions.
 * 
 * USPS Java Api can not be copied and/or distributed without the express
 * permission of Madbox Solutions.
 *******************************************************/
package com.madbox.usps;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Address")
@XmlType(propOrder = {"address1", "address2", "city", "state","zip","zip2"})
public class Address {
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String zip2;
	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	@XmlElement(name="Address1")
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	@XmlElement(name="Address2")
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	@XmlElement(name="City")
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	@XmlElement(name="State")
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	@XmlElement(name="Zip5")
	public void setZip(String zip) {
		this.zip = zip;
	}
	/**
	 * @return the zip2
	 */
	public String getZip2() {
		return zip2;
	}
	/**
	 * @param zip2 the zip2 to set
	 */
	@XmlElement(name="Zip4")
	public void setZip2(String zip2) {
		this.zip2 = zip2;
	}

}
