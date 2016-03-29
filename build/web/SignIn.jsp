<%-- 
    Document   : SignIn
    Created on : Nov 26, 2014, 6:05:22 PM
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
        <form action="LoginServlet" method="post">
            <fieldset>
                <legend>Sign In</legend>
                <div>
                    <input type="text" name="Username" placeholder="Username"/>
                </div>
                <div>
                    <input type="text" name="password" placeholder="Password"/>
                </div>
                
                
                <input type="submit" name="submit" value="Sign In"/>
            </fieldset>    
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

