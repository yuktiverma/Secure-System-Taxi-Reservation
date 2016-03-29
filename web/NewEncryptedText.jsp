<%-- 
    Document   : homepage
    Created on : Nov 26, 2014, 8:07:01 PM
    Author     : Yukti

--%>

<%@page import="com.beans.EncryptedText"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
       AuthenticatedBean auth_bean=(AuthenticatedBean)session.getAttribute("authenticatedBean");
       EncryptedText encBean=(EncryptedText)session.getAttribute("encryptedData");
       String encKeys=(String)session.getAttribute("encKeys");
       out.println("Encrypted Text"+"   "+encBean.getEncrypteName()+" \n"+encBean.getEncryptNumber()+" \n "+encBean.getEncryptExpiration());
       out.println("HMAC of Encrypted Text"+"   "+auth_bean.getAuth_name()+"\n "+auth_bean.getAuth_number()+" \n "+auth_bean.getAuth_expiration());
       //out.println("Encrypted Keys\n"+encKeys);
     
       %>
    </body>
     <form action="success.jsp" method="post">
         <input type="submit" value="submit">
              </form>
</html>
