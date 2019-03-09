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

@XmlRootElement(name="ExtraServices")
public class ExtraServices {
	private String extraService;

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
}
