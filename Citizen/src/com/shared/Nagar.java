package com.shared;

import java.io.Serializable;

public class Nagar implements Serializable{
   String res;
   String date;

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getRes() {
	return res;
}

public void setRes(String res) {
	this.res = res;
}
	
}
