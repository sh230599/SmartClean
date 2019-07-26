package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.shared.se;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialTextBox;

public class serv extends Composite  {

	private static servUiBinder uiBinder = GWT.create(servUiBinder.class);

	interface servUiBinder extends UiBinder<Widget, serv> {
	}

	public serv() {
		initWidget(uiBinder.createAndBindUi(this));
		GreetingServiceAsync a1=GWT.create(GreetingService.class);
		
		b1.setText("Submit");
		//l1.setText("Enter Username");
		
		//l2.setText("Enter Password");
		//panel.add(l1);
		//panel.add(t1);
		//panel.add(l2);
		//panel.add(t2);
		//panel.add(b1);
		
		b1.addClickHandler(new ClickHandler() 
			{
			GreetingServiceAsync a1=GWT.create(GreetingService.class);
				@Override
				public void onClick(ClickEvent event) {
					// TODO Auto-generated method stub
					RootPanel.get("t2").clear();
					RootPanel.get("t1").clear();

					String k1 = t1.getText();
					String k2 = t2.getText();
					//Boolean cb=t.getValue();
					a1.chec(k1,k2,new AsyncCallback<String>()
							{

								@Override
								public void onFailure(Throwable caught) {
									// TODO Auto-generated method stub
									
								}
								@Override
								public void onSuccess(String result) {
									// TODO Auto-generated method stub
									/*if(t.getValue().equals(true))*/ 
									if(result.equals("YES"))
									{
										RootPanel.get("t2").clear();
										//RootPanel.get("t1").clear();
										Window.alert("Success");
										RootPanel.get("t2").add(new Dash());
									    RootPanel.get("t1").clear();
										RootPanel.get("t1").add(new Dashboard());
									}
										else {
											Window.alert("TRY AGAINNN");
											RootPanel.get("t2").clear();
											RootPanel.get("t1").clear();
											RootPanel.get("t2").add(new Dashboard());
										}
											
								}
							});
				}
				});
			}
			

	@UiField
	MaterialButton b1;
	/*
	 * @UiField MaterialLabel l1;
	 * 
	 * @UiField MaterialLabel l2;
	 */
	/*
	 * @UiField VerticalPanel panel;
	 */
   @UiField MaterialLink t3;
	@UiField
	MaterialTextBox t1;
	@UiField
	MaterialCheckBox t;
	@UiField
	MaterialTextBox t2;
}
