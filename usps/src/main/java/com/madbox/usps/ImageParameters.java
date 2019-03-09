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

/**
 * @author madal
 *
 */
@XmlRootElement(name="ImageParameters")
@XmlType(propOrder = {"labelSequence","imageParameter"})

public class ImageParameters {
	private LabelSequence labelSequence;
	private String imageParameter;

	/**
	 * @return the labelSequence
	 */
	public LabelSequence getLabelSequence() {
		return labelSequence;
	}

	/**
	 * @param labelSequence the labelSequence to set
	 */
	@XmlElement(name="LabelSequence")
	public void setLabelSequence(LabelSequence labelSequence) {
		this.labelSequence = labelSequence;
	}

	/**
	 * @return the imageParameter
	 */
	public String getImageParameter() {
		return imageParameter;
	}

	/**
	 * @param imageParameter the imageParameter to set
	 */
	@XmlElement(name="ImageParameter")
	public void setImageParameter(String imageParameter) {
		this.imageParameter = imageParameter;
	}

}
