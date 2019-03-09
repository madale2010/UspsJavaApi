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

@XmlRootElement(name="SpecialServices")
public class SpecialServices {
	private String specialService;
	 SpecialServices(){
		
	}
	/**
	 * @return the specialService
	 */
	public String getSpecialService() {
		return specialService;
	}
	/**
	 * @param specialService the specialService to set
	 */
	@XmlElement(name="SpecialService")
	public void setSpecialService(String specialService) {
		this.specialService = specialService;
	}
	
}
