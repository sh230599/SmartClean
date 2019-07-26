package com.shared;


import java.io.Serializable;
import java.util.Date;

public class Profile implements Serializable {
	
	public String Location,categories;
	String date;
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}

	
	}
			

