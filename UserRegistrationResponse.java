package com.rest.springboot.bean;

public class UserRegistrationResponse {
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getUserregistrationnumber() {
		return userregistrationnumber;
	}
	public void setUserregistrationnumber(String userregistrationnumber) {
		this.userregistrationnumber = userregistrationnumber;
	}
	public String getRegistrationStatus() {
		return registrationStatus;
	}
	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}
	String name;
	 int phonenumber;
	 String userregistrationnumber;
	 String registrationStatus;
	
	
}
