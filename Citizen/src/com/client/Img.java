package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialSlider;

public class Img extends Composite  {

	private static ImgUiBinder uiBinder = GWT.create(ImgUiBinder.class);

	interface ImgUiBinder extends UiBinder<Widget, Img> {
	}

	public Img() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	@UiField  
   MaterialSlider slider;
	
}
