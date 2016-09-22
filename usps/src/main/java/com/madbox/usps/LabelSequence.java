package com.madbox.usps;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author madal
 *
 */
@XmlRootElement(name="LabelSequence")
@XmlType(propOrder = {"packageNumber","totalPackages"})
public class LabelSequence {
	private String packageNumber;
	private String totalPackages;
	/**
	 * @return the packageNumber
	 */
	public String getPackageNumber() {
		return packageNumber;
	}
	/**
	 * @param packageNumber the packageNumber to set
	 */
	@XmlElement(name="PackageNumber")
	public void setPackageNumber(String packageNumber) {
		this.packageNumber = packageNumber;
	}
	/**
	 * @return the totalPackages
	 */
	public String getTotalPackages() {
		return totalPackages;
	}
	/**
	 * @param totalPackages the totalPackages to set
	 */
	@XmlElement(name="TotalPackages")
	public void setTotalPackages(String totalPackages) {
		this.totalPackages = totalPackages;
	}
}
