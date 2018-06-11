package com.medplus;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloTag extends TagSupport {
	/*	private Integer number;
	public void setNumber(Integer number) {
		this.number = number;
	}

	public void doTag() throws JspException, IOException {
      StringWriter sw=new StringWriter();
	  JspWriter out = getJspContext().getOut();
      out.println("Hello Custom Tag!");
      getJspBody().invoke(sw);
      for(int i=0;i<number;i++)
      out.println(sw+"\n");
   }*/
	private int number;  
	private int power;  
	private static int counter=0;  
	private static int result=1;  
	  
	public void setPower(int power) {  
	    this.power = power;  
	}  
	  
	public void setNumber(int number) {  
	    this.number = number;  
	}  
	  
	public int doStartTag() throws JspException {  
	    return EVAL_BODY_INCLUDE;  
	}  
	  
	public int doAfterBody() {  
	    counter++;   
	    result *= number;   
	    if (counter==power) {
	    	return SKIP_BODY;}   
	    else   
	      return EVAL_BODY_AGAIN;   
	  }   
	  
	public int doEndTag() throws JspException {  
	    JspWriter out=pageContext.getOut();  
	    try{  
	        out.print(result); 
	        counter=0;
	        result=1;
	    }catch(Exception e){e.printStackTrace();} 
	    return EVAL_PAGE;  
	}  
}

