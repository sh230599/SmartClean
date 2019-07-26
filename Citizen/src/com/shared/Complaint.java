package com.shared;

import java.io.Serializable;
import java.util.Date;

public class Complaint implements Serializable {
String des;
int aadhar;
public int getAadhar() {
	return aadhar;
}
public void setAadhar(int aadhar) {
	this.aadhar = aadhar;
}
String loc;
String date;
String f;
String res;
public String getRes() {
	return res;
}
public void setRes(String res) {
	this.res = res;
}
public String getF() {
	return f;
}
public void setF(String f) {
	this.f = f;
}


public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}


public String getDes() {
	return des;
}
public void setDes(String des) {
	this.des = des;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}

	// TODO Auto-generated method stub
}
