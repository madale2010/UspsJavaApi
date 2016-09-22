package com.madbox.usps;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Postage")
@XmlType(propOrder = {"mailService", "rate"})
public class Postage {
 private String mailService;
 private String rate;
 private String CLASSID;
/**
 * @return the mailService
 */
public String getMailService() {
	return mailService;
}
/**
 * @param mailService the mailService to set
 */
@XmlElement(name="MailService")
public void setMailService(String mailService) {
	this.mailService = mailService;
}
/**
 * @return the rate
 */
public String getRate() {
	return rate;
}
/**
 * @param rate the rate to set
 */
@XmlElement(name="Rate")
public void setRate(String rate) {
	this.rate = rate;
}
/**
 * @return the cLASSID
 */
public String getCLASSID() {
	return CLASSID;
}
/**
 * @param cLASSID the cLASSID to set
 */
@XmlAttribute(name="CLASSID")
public void setCLASSID(String cLASSID) {
	CLASSID = cLASSID;
}
}
