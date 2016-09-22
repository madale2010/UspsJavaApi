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
