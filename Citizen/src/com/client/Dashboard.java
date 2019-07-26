package com.client;

import java.util.Date;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.shared.Display;
import com.shared.Profile;
import com.google.gwt.user.client.History;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialHeader;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialSlider;
import gwt.material.design.client.ui.MaterialTextBox;
import com.client.oppo;
import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialNavSection;

public class Dashboard extends Composite {

	private static DashboardUiBinder uiBinder = GWT.create(DashboardUiBinder.class);

	interface DashboardUiBinder extends UiBinder<Widget, Dashboard> {
	}


	public Dashboard() {
		initWidget(uiBinder.createAndBindUi(this));

	}
	@UiHandler("b1")
	void onClick1(ClickEvent e) {
		
		  History.newItem("a"); oppo.getInstance().xyz();
		 
		/*
		 * RootPanel.get("t2").clear(); RootPanel.get("t2").add(new serv());
		 */

	}

	@UiHandler("b2")
	void onClick2(ClickEvent e) {
		History.newItem("b");
		oppo.getInstance().xyz();
		/*
		 * RootPanel.get("t2").clear(); RootPanel.get("t2").add(new Registered());
		 */
	}
 

	@UiHandler("b4")
	void onClick4(ClickEvent e) {
		History.newItem("c");
		oppo.getInstance().xyz();
	}

	@UiHandler("b5")
	void onClick5(ClickEvent e) {
		RootPanel.get("t2").clear();
		RootPanel.get("t2").add(new Registered());
	}

	@UiHandler("b7")
	void onClick7(ClickEvent e) {
		RootPanel.get("t2").clear();
		RootPanel.get("t2").add(new Sar());
	}

	@UiHandler("b8")
	void onClick8(ClickEvent e) {
		RootPanel.get("t2").clear();
		RootPanel.get("t2").add(new Notify());
	}
	@UiHandler("b9")
	void onClick9(ClickEvent e) {
		RootPanel.get("t2").clear();
		RootPanel.get("t2").add(new Img());
	}

	@UiField
	MaterialLink b1, b2, b4, b5, t1, t2, b7, t3, b8,b9;
	
}

/*
 * RootPanel.get("t1").add(b1); RootPanel.get("t1").add(b2);
 * RootPanel.get("t1").add(b3); RootPanel.get("t1").add(b4);
 * RootPanel.get("t1").add(b5); b1.addClickHandler(new ClickHandler() {
 * 
 * @Override public void onClick(ClickEvent event) { // TODO Auto-generated
 * method stub RootPanel.get("t2").clear(); serv a2=new serv();
 * RootPanel.get("t2").add(a2); } }); b2.addClickHandler(new ClickHandler() {
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
 * RootPanel.get("t2").add(a2); } });
 * 
 * 
 * 
 * }
 */