package com.rest.springboot.bean;

public class User {
 String name;
 int phonenumber;
 String userregistrationnumber;
public String getUserregistrationnumber() {
	return userregistrationnumber;
}
public void setUserregistrationnumber(String userregistrationnumber) {
	this.userregistrationnumber = userregistrationnumber;
}
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

}
