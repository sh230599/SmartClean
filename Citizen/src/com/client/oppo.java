package com.client;

import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;

public class oppo {

static oppo o=null;
static	serv s1=null;
static Registered r=null;
static Login l=null;
private oppo() {}

static oppo getInstance()
{
	if(o==null)
		o=new oppo();
	return o;
}

		
public void xyz()
{
 if(History.getToken().equals("a"))
 {
	  RootPanel.get("t2").clear();
	  RootPanel.get("t2").add(getServ());
 }
 else if(History.getToken().equals("b"))
 {
	  RootPanel.get("t2").clear();
	  RootPanel.get("t2").add(getRegistered());  
 }
 else if(History.getToken().equals("c"))
 {
	  RootPanel.get("t2").clear();
	  RootPanel.get("t2").add(getLogin());  
 }



}
serv getServ() {
 if(s1==null)
   s1=new serv();
 return s1;
}
Registered getRegistered()
{
 if(r==null)
	  r=new Registered();
 return r;
}
Login  getLogin()
{
	if(l==null)
	{
		l=new Login();
	}
	return l;
}
/*Dash getDash()
{
 if(d==null)
	 d=new Dash();
 return d;
	  
}
city getCity()
{
 if(c==null)
	  c=new city();
 return c;
}
Sar getSar()
{
 if(s2==null)
 s2=new Sar();
 return s2;
}
Notify getNotify()
{
 if(n==null)
 {
	  n=new Notify();
	 
 }
return n;*/
}



