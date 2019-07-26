package com.client;

import java.sql.SQLException;

import com.gargoylesoftware.htmlunit.javascript.host.event.Event;
import com.shared.Display;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.user.client.ui.FileUpload;
import com.shared.Complaint;
import com.shared.Data;
import com.shared.Nagar;
import com.shared.Profile;
import com.shared.se;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	
	
  public Complaint xyz(Complaint c) throws IllegalArgumentException;
  
  
  Data p(Data n) throws IllegalArgumentException;
  Nagar nigam(Nagar n) throws IllegalArgumentException;
  
  Nagar nigam1(String n) throws IllegalArgumentException;
  
  String chec(String s1,String s2) throws IllegalArgumentException;
  String chec1(String s1,String s2) throws IllegalArgumentException;
  Profile insert(Profile c) throws IllegalArgumentException;
  Profile[] insert1(String c) throws IllegalArgumentException;

  
  Display[] check(String d) throws IllegalArgumentException;


}
