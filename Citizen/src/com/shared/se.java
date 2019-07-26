package com.shared;

import java.io.Serializable;

public class se implements Serializable {

	private static final long serialVersionUID = 1L;
	String name;
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	String pass;
	
	
}
