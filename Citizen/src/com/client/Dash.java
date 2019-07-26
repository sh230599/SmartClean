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
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormPanel.SubmitEvent;
import com.google.gwt.user.client.ui.HasName;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.shared.Complaint;
import com.shared.Display;
import com.shared.Nagar;

import gwt.material.design.addins.client.fileuploader.MaterialFileUploader;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialTextArea;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class Dash extends Composite {

	private static DashUiBinder uiBinder = GWT.create(DashUiBinder.class);

	interface DashUiBinder extends UiBinder<Widget, Dash> {
	}

	   
	@UiField FormPanel form; 
	@UiField
	MaterialLabel l1;

	@UiField
	MaterialLabel l2;
	@UiField
	MaterialLabel l;
	@UiField
	FileUpload file;
	@UiField
	MaterialTextBox t1,t2,t3;
	@UiField
	MaterialTextArea t;
	@UiField
	MaterialButton b1;
	@UiField
	FormPanel f;
	//@UiField
	//MaterialButton Date1;
	//@UiField Button insert;
	@UiField
	MaterialDatePicker db;
  //@UiField MaterialTimePicker tp;
	 @UiField
	 MaterialButton b2 ,b3;
	
//	@UiField
//	VerticalPanel v;
	String temp;
	public Dash() {
		initWidget(uiBinder.createAndBindUi(this));
		 GreetingServiceAsync a1=GWT.create(GreetingService.class);
		 
		    l.setText("Post Complaint");
			l2.setText("Description");
			l1.setText("Enter Location");
			b2.setText("Submit");
			b1.setText("upload file");
			b3.setText("Response received");
			//Date1.setText("Show Date");
			file.setEnabled(true);
			
		/*
		 * v.add(l); v.add(file); v.add(b1); v.add(label); // v.add(dp); v.add(db); //
		 * v.add(slabel); // v.add(Date1); v.add(l2); v.add(t); v.add(l1); v.add(t1);
		 * v.add(b2); v.add(db1);
		 * 
		 * v.add(b3); v.add(t2);
		 */
			b2.addClickHandler(new ClickHandler() {

				@Override
				public void onClick(ClickEvent event) {
					// TODO Auto-generated method stub
					GreetingServiceAsync a1 = GWT.create(GreetingService.class);
					int s=Integer.parseInt(t3.getText());
					String s1 = t.getText();
					String s2 = t1.getText();
					 Date s3=db.getValue();
					 String ss=s3.toString();
					//String date=db.getText();
					
					String fname =   file.getFilename();
					Complaint c = new Complaint();
					c.setAadhar(s);
					c.setDes(s1);
					c.setLoc(s2);
				     c.setF(fname);
					c.setDate(ss);
					//String fname = file.getFilename();
					
					a1.xyz(c, new AsyncCallback<Complaint>() {

						@Override
						public void onFailure(Throwable caught) {
							// TODO Auto-generated method stub

						}

						@Override
						public void onSuccess(Complaint result) {
							// TODO Auto-generated method stub
	                      //  temp="";
	                        
	                            // t.setText(result.getDes());
	                             Window.alert("Details are inserted");
						
						  //MaterialToast.fireToast(k); RootPanel.get("t1").clear();
						  //RootPanel.get("t1").add(new Dashboard());
						 
						}
					});
				}

					});
		}

	/*
	 * @UiHandler("Date1")
	 * 
	 * void onClick(ClickEvent event) { Date d=db.getValue(); String s=d.toString();
	 * s=s.toString(); label.setText("Date-"+s); slabel.setText(temp); }
	 * 
	 */

		@UiHandler("b1")
		void onClick1(ClickEvent e) {
			final FormPanel form = new FormPanel();
			String sss="http://127.0.0.1:8888/citizen/FileUpload";
			//form.setAction("http://127.0.0.1//Dashboard/FileUpload");
			form.setAction(sss);
			
			form.setEncoding(FormPanel.ENCODING_MULTIPART);
			
			form.setMethod(FormPanel.METHOD_POST);

			VerticalPanel panel = new VerticalPanel();
			form.setWidget(panel);

			panel.add(new Button("Submit", new ClickHandler() {
				public void onClick(ClickEvent event) {

					form.submit();
				}
			}));

			
			form.addSubmitHandler(new FormPanel.SubmitHandler() {
				public void onSubmit(SubmitEvent event) {
					
				}
			});
			form.addSubmitCompleteHandler(new FormPanel.SubmitCompleteHandler() {
				public void onSubmitComplete(SubmitCompleteEvent event) {
					Window.alert("Good to go");
					Window.alert(event.getResults());
				}
			});

			RootPanel.get().add(form);
			  }
			 
		/*
		 * String fname= file.getFilename(); if (fname.length() == 0) {
		 * Window.alert("No file specified");
		 * 
		 * } else { f.submit(); }
		 * 
		 * f.addSubmitCompleteHandler(new FormPanel.SubmitCompleteHandler() {
		 * 
		 * @Override public void onSubmitComplete(SubmitCompleteEvent event) { // When
		 * the form submission is successfully completed, this //event is fired.
		 * Assuming the service returned a response //of type text/html, we can get the
		 * result text here Window.alert(event.getResults()); } });
		 * RootPanel.get("gwtContainer").add(f);
		 */
	
		@UiHandler("b3")
		void onClick2(ClickEvent e)
		{	
			GreetingServiceAsync a1 = GWT.create(GreetingService.class);
			 
			Date ss=db.getValue();
			 String s1=ss.toString();
		    //MaterialToast.fireToast(s1);
		    a1.nigam1(s1, new AsyncCallback<Nagar>() {

			@Override
			public void onFailure(Throwable caught) {
				}

			@Override
			public void onSuccess(Nagar result) {
				
				  t2.setText(result.getRes());
				
			}
		});
			
		}
}
			
            //Window.alert("Response given");
		
