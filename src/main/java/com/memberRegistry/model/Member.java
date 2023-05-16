package com.memberRegistry.model;

public class Member {

	private String memberId;
	private String firstName;
	private String lastName;
	private String address;
	private String dateOfBirth;
	private String contactDetails;
	private String gender;
	private String maritalStatus;
	private String baptismDate;
	private String baptismLocation;
	private String pastorName;
	
	
	
	public Member(String memberId, String firstName, String lastName, String address, String dateOfBirth,
			String contactDetails, String gender, String maritalStatus, String baptismDate, String baptismLocation,
			String pastorName) {
		
		this.memberId = memberId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.contactDetails = contactDetails;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.baptismDate = baptismDate;
		this.baptismLocation = baptismLocation;
		this.pastorName = pastorName;
	}
	
	
	
	public Member() {
		
	}



	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getBaptismDate() {
		return baptismDate;
	}
	public void setBaptismDate(String baptismDate) {
		this.baptismDate = baptismDate;
	}
	public String getBaptismLocation() {
		return baptismLocation;
	}
	public void setBaptismLocation(String baptismLocation) {
		this.baptismLocation = baptismLocation;
	}
	public String getPastorName() {
		return pastorName;
	}
	public void setPastorName(String pastorName) {
		this.pastorName = pastorName;
	}
	
	
}
