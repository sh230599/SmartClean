package com.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Citizen implements EntryPoint {

	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		
		RootPanel.get("t1").add(new Dashboard());
	}


		/*
		 * b2.addClickHandler(new ClickHandler() {
		 * 
		 * @Override public void onClick(ClickEvent event) { // TODO Auto-generated
		 * method stub RootPanel.get("t2").clear(); Registered a12=new Registered();
		 * RootPanel.get("t2").add(a12); } }); b3.addClickHandler(new ClickHandler() {
		 * 
		 * @Override public void onClick(ClickEvent event) { // TODO Auto-generated
		 * method stub RootPanel.get("t2").clear(); Dash a2=new Dash();
		 * RootPanel.get("t2").add(a2); } }); b4.addClickHandler(new ClickHandler() {
		 * 
		 * @Override public void onClick(ClickEvent event) { // TODO Auto-generated
		 * method stub RootPanel.get("t2").clear(); city a2=new city();
		 * RootPanel.get("t2").add(a2); } }); b5.addClickHandler(new ClickHandler() {
		 * 
		 * @Override public void onClick(ClickEvent event) { // TODO Auto-generated
		 * method stub RootPanel.get("t2").clear(); Sar a2=new Sar();
		 * RootPanel.get("t2").add(a2); } }); b6.addClickHandler(new ClickHandler() {
		 * 
		 * @Override public void onClick(ClickEvent event) { // TODO Auto-generated
		 * method stub RootPanel.get("t2").clear(); Notify a2=new Notify();
		 * RootPanel.get("t2").add(a2); } });
		 * 
		 */
		
		
		/*  */
 
}

