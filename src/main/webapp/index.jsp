<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "ex" uri = "WEB-INF/custom.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
</head>
<body>
    <a href="hello.html">Hello Spring</a> |   
    <a href="contact.html">Contact</a>
    <p>
    	<ex:Hello/>
    </p>  
    <p>
    	<ex:Body>
    		This is message body
    	</ex:Body>
    </p>
    <p>
    	<ex:Custom message = "This is custom tag" />
    </p>
</body>
</html>
