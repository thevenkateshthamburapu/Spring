package com.springcore.pe.bean;

import java.beans.PropertyEditorSupport;

public class AddNumberEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String value) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if (null != value) {
			String[] values = value.split(",");
			int i = Integer.parseInt(values[0]);
			int j = Integer.parseInt(values[1]);
			AddNumber an = new AddNumber(i, j);
			setValue(an);
		}
	}

}
