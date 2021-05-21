package com.hdb.ABC;

public class ABCSystemDataDto {

	private String companyName;
	private Integer identityNumber;
	private String personnelName;
	private String appointment;
	private long mobileNumber;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "ABCSystemDataDto [companyName=" + companyName + ", identityNumber=" + identityNumber
				+ ", personnelName=" + personnelName + ", appointment=" + appointment + ", mobileNumber=" + mobileNumber
				+ "]";
	}
	
	

}
