<%-- 
    Document   : homepage
    Created on : Nov 26, 2014, 8:07:01 PM
    Author     : Aakriti

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
<link href="one.css" rel="stylesheet" type="text/css">
<link href="CSS3 Menu_files/css3menu1/style.css" rel="stylesheet" type="text/css">
<link href="CSS3 Menu_files/css3menu1/register.css" rel="stylesheet" type="text/css">
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

  
      
<table width="100%" >
  <tbody>
    <tr>
      <th height="347" scope="col"><div id="wrapper">
        <form method="post" name="payment" action="PaymentServlet">
          <p>Name on the Card :
  <input type="text" name="name_on_card" value="">
            <br>
            Card Number </p>
          <p>
            <input type="text" name="card1" value="" maxlength="4"><br>
            Card Expiration:
            <select name='expireMM' id='expireMM'>
              <option value=''>Month</option>
              <option value='01'>January</option>
              <option value='02'>February</option>
              <option value='03'>March</option>
              <option value='04'>April</option>
              <option value='05'>May</option>
              <option value='06'>June</option>
              <option value='07'>July</option>
              <option value='08'>August</option>
              <option value='09'>September</option>
              <option value='10'>October</option>
              <option value='11'>November</option>
              <option value='12'>December</option>
            </select> 
            <select name='expireYY' id='expireYY'>
              <option value=''>Year</option>
              <option value='10'>2010</option>
              <option value='11'>2011</option>
              <option value='12'>2012</option>
            </select> 
            <input class="inputCard" type="hidden" name="expiry" id="expiry" maxlength="4"/>
            <input type="submit" name="submit" value="submit">
          </p>
        </form>
    </div></th>
    </tr>
  </tbody>
</table>
<table width="100%" height="181" border="1">
  <tbody>
    <tr>
      <th scope="col">&nbsp;</th>
    </tr>
  </tbody>
</table>
</body>
</html>
