package com.medplus;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;

public class simple implements SimpleTag{

	@Override
	public void doTag() throws JspException, IOException {
		
	}

	@Override
	public void setParent(JspTag parent) {
		// TODO Auto-generated method stub
	}

	@Override
	public JspTag getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setJspContext(JspContext pc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setJspBody(JspFragment jspBody) {
		// TODO Auto-generated method stub
		
	}
}
