package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.shared.Data;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialTextBox;

public class Registered extends Composite {

	private static RegisteredUiBinder uiBinder = GWT.create(RegisteredUiBinder.class);

	interface RegisteredUiBinder extends UiBinder<Widget, Registered> {}
	
	
	public Registered() {
	initWidget(uiBinder.createAndBindUi(this));
    b.setText("SUBMIT");
    b1.setText("BACK");
	
		/*
		 * //panel.add(l1); panel.add(t1); //panel.add(l2); panel.add(t2);
		 * //panel.add(l3); panel.add(t3); //panel.add(l4); panel.add(t4);
		 * //panel.add(l5); panel.add(t5); //panel.add(l6); panel.add(t6);
		 * //panel.add(l7); panel.add(t7); panel.add(b); panel.add(b1);
		 */
		
	b.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
		GreetingServiceAsync a1 = GWT.create(GreetingService.class);
		String s1 = t1.getText();
		String s2 = t2.getText();
		String s3 = t3.getText();
		String s4 = t4.getText();
		int s5 = Integer.parseInt(t5.getText());
		String s6 = t6.getText();
		String s7 = t7.getText();
		
				Data d= new Data();
				d.setFname(s1);
				d.setLname(s2);
				d.setEadd(s3);
				d.setAdd(s4);
				d.setPno(s5);
				d.setPass(s6);
				d.setCpass(s7);
				
				
				a1.p(d, new AsyncCallback <Data>() {
					
					@Override
					public void onSuccess(Data result) {
						// TODO Auto-generated method stub
						
						
						t1.setText(result.getFname());
						t2.setText(result.lname);
						t3.setText(result.eadd);
						t4.setText(result.add);
						t5.setText(Integer.toString(result.pno));
						t6.setText(result.pass);
						t7.setText(result.cpass);
						Window.alert("REGISTRATION SUCCESSFUL");
						
					}
					
					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						Window.alert(caught.getMessage());
					}
				});
			}
	

	});
	}
	@UiField
	MaterialTextBox t1;
	@UiField
	MaterialTextBox t2;
	@UiField
	MaterialTextBox t3;
	@UiField
	MaterialTextBox t4;
	@UiField
	MaterialTextBox t5;
	@UiField
	MaterialTextBox t6;
	@UiField
	MaterialTextBox t7;
	//@UiField VerticalPanel panel;
	@UiField
    MaterialButton b,b1 ;
	@UiHandler("b1")
	void onClick(ClickEvent event)
	{ 
		  RootPanel.get("t1").clear(); RootPanel.get("t1").add(new Dashboard());
		 
	}
	
}