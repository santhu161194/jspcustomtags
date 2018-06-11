package com.medplus;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class ReplaceBody extends BodyTagSupport{
	@Override
	public int doEndTag() throws JspException {
		String str = getBodyContent().getString();
		getBodyContent().clearBody();
		try {
			getPreviousOut().write("This is replaced text previous text was"+str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doEndTag();
	}
}
