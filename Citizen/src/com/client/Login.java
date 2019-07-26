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
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialTextBox;

public class Login extends Composite {

	private static LoginUiBinder uiBinder = GWT.create(LoginUiBinder.class);

	interface LoginUiBinder extends UiBinder<Widget, Login> {
	}

	public Login() {
		initWidget(uiBinder.createAndBindUi(this));

		b1.setText("Submit");
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
					Boolean cb=t.getValue();
					a1.chec(k1,k2,new AsyncCallback<String>()
							{

								@Override
								public void onFailure(Throwable caught) {
									// TODO Auto-generated method stub
									
								}
								@Override
								public void onSuccess(String result) {
									// TODO Auto-generated method stub
						/* if(t.getValue().equals(true)) { */
										//RootPanel.get("t2").clear();
										if(result.equals("YES"))
										{
											RootPanel.get("t2").clear();
											//RootPanel.get("t1").clear();
											Window.alert("Success");
											RootPanel.get("t2").add(new city());
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

