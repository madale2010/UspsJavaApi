/*******************************************************
 * Copyright (C) 2012-2019 Adam Dale adamdale2018@gmail.com
 * 
 * This file is part of Madbox Solutions.
 * 
 * USPS Java Api can not be copied and/or distributed without the express
 * permission of Madbox Solutions.
 *******************************************************/
package com.madbox.usps;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ZipCode")
@XmlType(propOrder = {"zip5","city","state"})
public class ZipCode {
	private String zip5;
	private String city;
	private String state;
	private String ID;


	/**
	 * @return the zip5
	 */
	public String getZip5() {
		return zip5;
	}

	/**
	 * @param zip5 the zip5 to set
	 */
	@XmlElement(name="Zip5")
	public void setZip5(String zip5) {
		this.zip5 = zip5;
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
		ID = iD;
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
}
