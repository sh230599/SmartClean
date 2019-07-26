package com.client;

import java.util.Date;

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
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.shared.Complaint;
import com.shared.Display;
import com.shared.Nagar;

import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCard;
import gwt.material.design.client.ui.MaterialCardContent;
import gwt.material.design.client.ui.MaterialCardTitle;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTextArea;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class city extends Composite {

	private static cityUiBinder uiBinder = GWT.create(cityUiBinder.class);

	interface cityUiBinder extends UiBinder<Widget, city> {

	}

	@UiField
	MaterialButton b1;

	/*
	 * @UiField MaterialButton b2;
	 * 
	 * @UiField MaterialTextArea ta;
	 * 
	 * @UiField MaterialLabel Response;
	 */

	@UiField
	MaterialDatePicker db;
	// @UiField
	// FileUpload file;
	/*
	 * @UiField VerticalPanel panel;
	 */
	@UiField
	MaterialCardContent mcd;

	public city() {
		initWidget(uiBinder.createAndBindUi(this));
		GreetingServiceAsync a12 = GWT.create(GreetingService.class);
		//Response.setText("Give Response");

		//b2.setText("Submit");
		/*
		 * panel.add(b1); panel.add(t1); panel.add(t2); panel.add(t3);
		 * 
		 * panel.add(Response); panel.add(db1); panel.add(ta); panel.add(b2);
		 */
		/*
		 * b2.addClickHandler(new ClickHandler() {
		 * 
		 * @Override public void onClick(ClickEvent event) { // TODO Auto-generated
		 * method stub GreetingServiceAsync a12 = GWT.create(GreetingService.class);
		 * 
		 * Nagar n = new Nagar();
		 * 
		 * String d1=db.getDate().toString(); //String sss=d1. //Window.alert(d1);
		 * n.setDate(db1.getValue().toString()); n.setDate(d1); n.setRes(ta.getText());
		 * a12.nigam(n, new AsyncCallback<Nagar>() {
		 * 
		 * public void onFailure(Throwable caught) { }
		 * 
		 * @Override public void onSuccess(Nagar result) {
		 * 
		 * Window.alert("RESPONSE GENERATED");
		 * 
		 * }
		 * 
		 * }); } });
		 */

	}

	@UiField
	MaterialPanel mp;

	@UiField
	MaterialRow mr;

	GreetingServiceAsync a1 = GWT.create(GreetingService.class);

	@UiHandler("b1")
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub

		// MaterialToast.toast(db.getValue());

		Date s1 = db.getValue();
		String ss = s1.toString();
		// MaterialToast.fireToast(ss);

		a1.check(ss, new AsyncCallback<Display[]>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub

			}

			int i = 0;

			@Override
			public void onSuccess(Display result[]) {
				// TODO Auto-generated method stub
				//

				// RootPanel.get("t2").add(mr);
				for (i = 0; i < result.length; i++) {

					MaterialButton b = new MaterialButton();
					// HorizontalPanel hp=new HorizontalPanel();
					b.setText("Response");
					b.addClickHandler(new ClickHandler() {

						@Override
						public void onClick(ClickEvent event) {
							// TODO Auto-generated method stub
							GreetingServiceAsync a12 = GWT.create(GreetingService.class);
							MaterialCard ad = new MaterialCard();
							MaterialColumn mc = new MaterialColumn();
							mr.add(mc);
							mc.add(ad);
							MaterialCardTitle mt = new MaterialCardTitle();
							mt.setText("DASHBOARD");
							ad.add(mt);
							MaterialLabel l = new MaterialLabel();
							l.setText("Response");
							ad.add(l);
							MaterialButton bb=new MaterialButton();
							bb.setText("Submit");
							MaterialTextArea ta = new MaterialTextArea();
							ad.add(ta);
							ad.add(bb);
							bb.addClickHandler(new ClickHandler() {
								
								@Override
								public void onClick(ClickEvent event) {
							
								
								Nagar n = new Nagar();
							

							String d1 = db.getDate().toString();
							n.setDate(d1);
							n.setRes(ta.getText());
							a12.nigam(n, new AsyncCallback<Nagar>() {

								public void onFailure(Throwable caught) {
								}

								@Override
								public void onSuccess(Nagar result) {

									Window.alert("RESPONSE GENERATED");

								}

							});
						
								
							}
						});
						}

					});

					// RootPanel.get("t4").add(mcd);
					// MaterialImage img=new MaterialImage(result[i].getF());
					MaterialImage img = new MaterialImage("p.jpg");
					img.setSize("75px", "75px");
					MaterialColumn mc = new MaterialColumn();
					MaterialCard ad = new MaterialCard();
					mr.add(mc);
					mc.add(ad);
					ad.add(img);
					// RootPanel.get("t2").add(hp);
					// ad.setBackgroundColor(Color.SK)
					MaterialCardContent mcd = new MaterialCardContent();
					ad.add(mcd);
					// MaterialLabel l=new MaterialLabel();
					// mcd.add(l);
					MaterialCardTitle t1 = new MaterialCardTitle();
					MaterialCardTitle t = new MaterialCardTitle();
					mcd.add(t1);
					mcd.add(t);
					t1.setTextColor(Color.BLACK);
					MaterialLabel t2 = new MaterialLabel();
					MaterialLabel t3 = new MaterialLabel();
					//// ad.add(t1);
					mcd.add(t2);
					mcd.add(t3);
					mcd.add(b);
					t.setText(result[i].getAadhar());
					t1.setText(result[i].getDes());
					t2.setText(result[i].getLoc());
					t3.setText(result[i].getF());
				}
				mp.add(mr);
			}

		});
	}
}
