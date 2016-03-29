<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
<link href="one.css" rel="stylesheet" type="text/css">
<link href="CSS3 Menu_files/css3menu1/style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
  <script language="javascript" src="protoplasm-0.2b2/protoplasm.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
<link href="one.css" rel="stylesheet" type="text/css">
<link href="CSS3 Menu_files/css3menu1/style.css" rel="stylesheet" type="text/css">
<link href="CSS3 Menu_files/css3menu1/register.css" rel="stylesheet" type="text/css">


  <script>
  

      Protoplasm.use('timepicker').transform('input.timepicker');

  </script>
 
</head>

<body >
<div class="transbox">
  <table  width="100%">
  <tbody>
    <tr>
    	<td width="33%"><span style="text-align: justify"></span><span style="text-align: right"></span><span style="text-align: center"></span>
    	  <table width="100%">
    	    <tbody>
    	      <tr>
    	        <td height="108"><img alt="" src="coollogo_com-154522155.png" width="308px" height="130"></td>
  	        </tr>
    	      <tr>
    	        <td height="50">&nbsp;</td>
  	        </tr>
  	      </tbody>
  	    </table>    	  <span style="text-align: left"></span></td>
   	  <td width="67%" height="66" scope="col"><table width="100%" height="157">
          <tbody>
            <tr>
              <th height="40" scope="col">&nbsp;</th>
            </tr>
            <tr>
              <td height="73"><object type="text/html" data="CSS3 Menu.html" width="100%"></object></td>
            </tr>
          </tbody>
    </table>
    </tr>
  </tbody>
</table>
<div align="left">
    <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/taxibookingsystem"
        user="root" password="password"
    />
     
    <sql:query var="listUsers"   dataSource="${myDS}">
        SELECT * FROM car;
    </sql:query>
  <table width="100%" height="545" >
    <tbody>
      <tr>
        <th width="32%" height="434" scope="row"><table width="98%" height="535">
          <tbody>
            <tr>
              <th height="178" scope="col"><img src="innova.jpg" width="205" height="148" alt=""/></th>
            </tr>
            <tr>
              <td><img src="download.jpg" width="267" height="164" alt=""/></td>
            </tr>
            <tr>
              <td><img src="Chevrolet Tavera.jpg" width="275" height="153" alt=""/></td>
            </tr>
          </tbody>
        </table></th>
        <td width="44%">
          
          <table width="98%" height="345" >
            <tbody>
            <tr>
            
              <th width="47%" height="238" scope="col"><table>
                <tbody>
                  <tr>
                    <th height="347" scope="col"><div id="wrapper">
                      <table width="19%" border="1" class="table">
                        <tbody>
                                     <caption><h2>List of available options</h2></caption>
                                     <tr class="tr">
                <th class="th">Name</th>
                <th class="th">Rate/km($)</th>
                <th class="th">Select</th>
                
            </tr>
            <c:forEach var="user" items="${listUsers.rows}">
                <tr class="tr">
                   
                    <td class="td"><c:out value="${user.name}" /></td>
                    <td class="td"><c:out value="${user.rateperkm}" /></td>
                    <td class="td"><a href="payment.jsp"><c:out value="select" /></a></td>
                </tr>
            </c:forEach>
                        </tbody>
                      </table>
                    </div></th>
                    </tr>
                  </tbody>
</table></th>
              </tr>
            <tr>
              <td height="99"><img src="images.jpg" width="192" height="125" alt=""/><img src="download (3).jpg" width="194" height="125" alt=""/></td>
              </tr>
          </tbody>
</table></td>
        <td width="24%"><table width="96%" height="555">
          <tbody>
            <tr>
              <th height="204" scope="col"><img src="download (1).jpg" width="193" height="153" alt=""/></th>
            </tr>
            <tr>
              <td height="149"><img src="tata_indigo_manza_wallpaper.jpg" width="210" height="131" alt=""/></td>
            </tr>
            <tr>
              <td height="186"><img src="download (2).jpg" width="247" height="151" alt=""/></td>
            </tr>
          </tbody>
        </table></td>
      </tr>
    </tbody>
  </table>
</div>
<table width="100%" >
  <tbody>
    <tr>
      <th height="177" scope="col">&nbsp;</th>
    </tr>
  </tbody>
</table>
</div> 
</body>
</html>
