package com.madbox.usps.utils;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Error")
@XmlType(propOrder = {"error", "number", "description", "source","helpFile","helpContext"})
public class Error {
	
	private String error;
	private String number;
	private String description;
	private String source;
	private String helpFile;
	private String helpContext;
	
	public Error(){
		
	}

	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	@XmlElement(name="Error")
	public void setError(String error) {
		this.error = error;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	@XmlElement(name="Number")
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	@XmlElement(name="Description")
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	@XmlElement(name="Source")
	public void setSource(String source) {
		this.source = source;
	}
	public String toXML() {
		try {
		JAXBContext jaxbContext = JAXBContext.newInstance(Error.class);
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
		JAXBContext jaxbContext = JAXBContext.newInstance(Error.class);
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

	/**
	 * @return the helpFile
	 */
	public String getHelpFile() {
		return helpFile;
	}

	/**
	 * @param helpFile the helpFile to set
	 */
	@XmlElement(name="HelpFile")
	public void setHelpFile(String helpFile) {
		this.helpFile = helpFile;
	}

	/**
	 * @return the helpContext
	 */
	public String getHelpContext() {
		return helpContext;
	}

	/**
	 * @param helpContext the helpContext to set
	 */
	@XmlElement(name="HelpContext")
	public void setHelpContext(String helpContext) {
		this.helpContext = helpContext;
	}
}
