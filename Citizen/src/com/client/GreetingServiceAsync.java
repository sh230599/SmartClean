package com.client;

import com.gargoylesoftware.htmlunit.javascript.host.event.Event;
import com.shared.Display;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FormPanel;
import com.shared.Complaint;
import com.shared.Data;
import com.shared.Nagar;
import com.shared.Profile;
import com.shared.se;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
  void xyz(Complaint c, AsyncCallback<Complaint> callback)
	      throws IllegalArgumentException;
  void p(Data n, AsyncCallback<Data> callback)
	      throws IllegalArgumentException;
  void nigam(Nagar n, AsyncCallback<Nagar> callback) throws IllegalArgumentException;
  void nigam1(String n, AsyncCallback<Nagar> callback) throws IllegalArgumentException;
	void chec(String s1,String s2, AsyncCallback <String> callback) throws IllegalArgumentException;
	void chec1(String s1,String s2, AsyncCallback <String> callback) throws IllegalArgumentException;
	 void  insert(Profile c, AsyncCallback<Profile> asyncCallback)
		      throws IllegalArgumentException;
	 void  insert1(String c, AsyncCallback<Profile[]> asyncCallback)
		      throws IllegalArgumentException;
	 
	void check(String d,AsyncCallback<Display[]> Callback) throws IllegalArgumentException;	 
	 
}
