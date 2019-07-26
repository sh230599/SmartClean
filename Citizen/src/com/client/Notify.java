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
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.shared.Profile;

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

public class Notify extends Composite  {

	private static NotifyUiBinder uiBinder = GWT.create(NotifyUiBinder.class);

	interface NotifyUiBinder extends UiBinder<Widget, Notify> {
	}

	/*
	 * @UiField MaterialTextBox t1;
	 * 
	 * @UiField MaterialTextBox t2;
	 */
	@UiField
	MaterialPanel mp;
	
	@UiField
	MaterialRow mr;
	@UiField
	MaterialCardContent mcd;
@UiField
MaterialDatePicker db;
@UiField
MaterialButton b;
	/*
	 * @UiField VerticalPanel panel;
	 */

	public Notify() {
		initWidget(uiBinder.createAndBindUi(this));
		/*
		 * panel.add(db); panel.add(b); panel.add(t1); panel.add(t2);
		 */

	}

	@UiHandler("b")
	void onClick8(ClickEvent e) {
		GreetingServiceAsync a1 = GWT.create(GreetingService.class);
		
		 Date s1=db.getValue();
		 String c=s1.toString();
		 MaterialToast.fireToast(c);
			a1.insert1(c, new AsyncCallback<Profile[]>() {

				@Override
				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub

				}
                 int i=0;
				@Override
				public void onSuccess(Profile[] result) {
					// TODO Auto-generated method stub
					//
					for (i = 0; i < result.length; i++) {
			               
						MaterialButton b = new MaterialButton();
						 //HorizontalPanel hp=new HorizontalPanel();
						 b.setText("Done");
	                     b.addClickHandler(new ClickHandler() {
						
						@Override
						public void onClick(ClickEvent event) {
							// TODO Auto-generated method stub
						
							//Window.alert(result[i].getDes());
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
						
						MaterialCardContent mcd = new MaterialCardContent();
						ad.add(mcd);
						// MaterialLabel l=new MaterialLabel();
						// mcd.add(l);
						MaterialCardTitle t1 = new MaterialCardTitle();
						mcd.add(t1);
						t1.setTextColor(Color.BLACK);
						MaterialLabel t2 = new MaterialLabel();
						//MaterialLabel t3 = new MaterialLabel();
						//// ad.add(t1);
						mcd.add(t2);
						//mcd.add(t3);
						mcd.add(b);
						t1.setText(result[i].getLocation());
						t2.setText(result[i].getCategories());
						//t3.setText(result[i].getF());
					}
				    mp.add(mr);
				}

			});
	}
	

}
