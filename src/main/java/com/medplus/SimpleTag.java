package com.medplus;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTag extends SimpleTagSupport{
	private String text;
	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		JspWriter out = getJspContext().getOut();
		System.out.println("jspBody:"+getJspBody());
		System.out.println();
		out.write(text.toUpperCase());
	}
	public void setText(String text) {
		this.text = text;
	}
}
