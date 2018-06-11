package com.medplus;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomImgTag extends SimpleTagSupport implements DynamicAttributes{
private static final String STATICPORT="https://silverspaceship.com/"; 
private String attributes=" ";

@Override
public void doTag() throws JspException, IOException {
	super.doTag();
	getJspContext().getOut().write("<img "+attributes+">");
}

@Override
public void setDynamicAttribute(String uri, String localName, Object value) throws JspException {
	System.out.println(uri+" -"+localName+"--"+value);
	if(localName.equalsIgnoreCase("src"))
		value=STATICPORT+"static/shot_1_thumb.png";
	attributes+=localName+"="+value+" ";
}
}
