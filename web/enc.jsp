<%@page import="com.beans.EncryptedText"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Encrypted Data</title>
</head>
<body>

<%
String EncryptedName = (String )request.getAttribute("ename");
String EncryptedCardNumber = (String )request.getAttribute("enumber");
String EncryptedExpiration = (String )request.getAttribute("expiration");
EncryptedText encObject=(EncryptedText)session.getAttribute("encryptedData");
out.println(encObject.getEncryptExpiration()+encObject.getEncrypteName()+encObject.getEncryptNumber());

System.out.println(EncryptedName+EncryptedCardNumber+EncryptedExpiration);
 %>
</body>
</html>