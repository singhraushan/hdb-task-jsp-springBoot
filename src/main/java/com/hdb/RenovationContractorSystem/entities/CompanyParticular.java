package com.hdb.RenovationContractorSystem.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompanyParticular implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hdbRegistrationNumber;

	private String companyName;
	private String modeOfBusiness;
	private String businessRegistrationNumber;

	private LocalDate businessRegistrationEffectiveDate;

	private LocalDate businessRegistrationExpiryDate;

	public Integer getHdbRegistrationNumber() {
		return hdbRegistrationNumber;
	}

	public void setHdbRegistrationNumber(Integer hdbRegistrationNumber) {
		this.hdbRegistrationNumber = hdbRegistrationNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getModeOfBusiness() {
		return modeOfBusiness;
	}

	public void setModeOfBusiness(String modeOfBusiness) {
		this.modeOfBusiness = modeOfBusiness;
	}

	public String getBusinessRegistrationNumber() {
		return businessRegistrationNumber;
	}

	public void setBusinessRegistrationNumber(String businessRegistrationNumber) {
		this.businessRegistrationNumber = businessRegistrationNumber;
	}

	public LocalDate getBusinessRegistrationEffectiveDate() {
		return businessRegistrationEffectiveDate;
	}

	public void setBusinessRegistrationEffectiveDate(LocalDate businessRegistrationEffectiveDate) {
		this.businessRegistrationEffectiveDate = businessRegistrationEffectiveDate;
	}

	public LocalDate getBusinessRegistrationExpiryDate() {
		return businessRegistrationExpiryDate;
	}

	public void setBusinessRegistrationExpiryDate(LocalDate businessRegistrationExpiryDate) {
		this.businessRegistrationExpiryDate = businessRegistrationExpiryDate;
	}

	@Override
	public String toString() {
		return "CompanyParticular [hdbRegistrationNumber=" + hdbRegistrationNumber + ", companyName=" + companyName
				+ ", modeOfBusiness=" + modeOfBusiness + ", businessRegistrationNumber=" + businessRegistrationNumber
				+ ", businessRegistrationEffectiveDate=" + businessRegistrationEffectiveDate
				+ ", businessRegistrationExpiryDate=" + businessRegistrationExpiryDate + "]";
	}

}
