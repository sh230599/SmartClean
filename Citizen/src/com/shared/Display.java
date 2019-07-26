package com.shared;

import java.io.Serializable;
import java.util.Date;

public class Display implements Serializable {
	
	String date;
	String f;
	String aadhar;
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
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
	/*public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getF() {
		return f;
	}
	public void setF(String f) {
		this.f = f;
	}*/
		public String des;
		public String loc;
		//Date date;
		//String f;

}
