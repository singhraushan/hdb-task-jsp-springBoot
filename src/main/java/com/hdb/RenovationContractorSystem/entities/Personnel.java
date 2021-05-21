package com.hdb.RenovationContractorSystem.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Personnel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer identityNumber;

	private String personnelName;
	private String appointment;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dateOfAppointment;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dateOfResignation;
	
	private String status;
	private long mobileNumber;
	private String emailAddress;
	
	
	private String userId;
	private Integer companyId;//hdbRegistrationNumber;
	private boolean isActive;
	
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(Integer identityNumber) {
		this.identityNumber = identityNumber;
	}
	public String getPersonnelName() {
		return personnelName;
	}
	public void setPersonnelName(String personnelName) {
		this.personnelName = personnelName;
	}
	public String getAppointment() {
		return appointment;
	}
	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}
	public LocalDate getDateOfAppointment() {
		return dateOfAppointment;
	}
	public void setDateOfAppointment(LocalDate dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}
	public LocalDate getDateOfResignation() {
		return dateOfResignation;
	}
	public void setDateOfResignation(LocalDate dateOfResignation) {
		this.dateOfResignation = dateOfResignation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "Personnel [identityNumber=" + identityNumber + ", personnelName=" + personnelName + ", appointment="
				+ appointment + ", dateOfAppointment=" + dateOfAppointment + ", dateOfResignation=" + dateOfResignation
				+ ", status=" + status + ", mobileNumber=" + mobileNumber + ", emailAddress=" + emailAddress
				+ ", userId=" + userId + ", companyId=" + companyId + ", isActive=" + isActive + "]";
	}

	
}
