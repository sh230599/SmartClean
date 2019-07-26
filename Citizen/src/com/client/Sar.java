package com.client;

import java.util.Date;


import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DatePicker;
import com.shared.Profile;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialListBox;
import gwt.material.design.client.ui.MaterialTextArea;

public class Sar extends Composite {

	private static SarUiBinder uiBinder = GWT.create(SarUiBinder.class);

	interface SarUiBinder extends UiBinder<Widget, Sar> {
	}

	/*
	 * @UiField MaterialLabel l;
	 */
	@UiField
	MaterialTextArea t1;
	@UiField
	MaterialButton b;
	 @UiField MaterialLabel label;
	
	
	@UiField
	MaterialListBox listBox2;
	/*
	 * @UiField VerticalPanel panel,v;
	 */
	@UiField
	MaterialDatePicker db;
	String temp;
	public Sar() {
		initWidget(uiBinder.createAndBindUi(this));
	
	GreetingServiceAsync a1=GWT.create(GreetingService.class);
	
		/*
		 * l.setText("LOCATION");
		 */
	 b.setText("submit");
	 listBox2.setTitle("categories");
 // ListBox listBox2=new ListBox();
	 listBox2.addItem("Choose event Categories");
  listBox2.addItem("Public Painting Area");

  listBox2.addItem("Lake Clean Up");

  listBox2.addItem("Garbage Segregation");

  listBox2.addItem("Park Clean Up");
  listBox2.addItem("other");
  listBox2.setVisibleItemCount(1);
  
 
 
 

//  VerticalPanel panel = new VerticalPanel();

  //panel.setSpacing(10);
  
 
		/*
		 * panel.add(l);
		 * 
		 * 
		 * panel.add(t1); panel.add(db); panel.add(label);
		 * 
		 * v.add(listBox2); panel.add(b);
		 */
 

 



b.addClickHandler(new ClickHandler()
{
	 
	@Override
public void onClick(ClickEvent event)
		 {
		GreetingServiceAsync a1=GWT.create(GreetingService.class);
	    String l=t1.getText();
	    Date s3=db.getValue();
		 String ss=s3.toString();
	    String j=listBox2.getSelectedItemText();
	   Profile c=new Profile();
				 c.setLocation(l);
				  c.setDate(ss);
				  c.setCategories(j);
        a1.insert(c,new AsyncCallback<Profile> () {
				public void onSuccess(Profile result) {
					
					t1.setText(result.getLocation());
					
					Window.alert("EVENTS DONE");
				}
				
				public void onFailure(Throwable caught) {
				}
		
			
		});

}
});

	}
	
	

}




