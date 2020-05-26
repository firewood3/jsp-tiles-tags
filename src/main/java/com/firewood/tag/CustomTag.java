package com.firewood.tag;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomTag extends SimpleTagSupport{
	
	private String message;
	StringWriter sw = new StringWriter();

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void doTag() throws JspException, IOException {
		if (message != null) {
			/* Use message from attribute */
			JspWriter out = getJspContext().getOut();
			out.println(message);
		} else {
			/* Use message from the body */
			getJspBody().invoke(sw);
			System.out.println(sw.toString());
			getJspContext().getOut().println(sw.toString());
		}
	}
	
	
	
}
