/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database;

import com.beans.User;
import com.functional.DBConnect;
import com.functional.PasswordSalt;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Yukti
 * This class is used to check the login details which are entered by the customers
 */
public class LoginDB 
{
    //function login check take the user bean as argument that contains user name and password. Returns success if everything is correct
    //else returns failures
  public String loginCheck(User user)
  {
      int flag=0;
       Connection connection=null;
      
      try
      {
          Class.forName("com.mysql.jdbc.Driver");//registers driver
        //gets connection using driver manager from dattabase
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/taxibookingsystem","root","password");
        
      Statement statement=connection.createStatement();
      //rs gets the resultset from user table of database which contains usernames and passwords
      ResultSet rs=statement.executeQuery("select * from user");
      while(rs.next())
      {
          String email=rs.getString(1);
          String hash=rs.getString(3);
          PasswordSalt pass=new PasswordSalt();
           if(pass.validatePassword(user.getPassword(), hash)) //method return flg=1 if passwords are correct
           {
                    
                    flag=1;
                    
           }
        
      }
      if(flag==1)
      {
          return "success";
      }
      
     
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
     
      finally
      {
          
          try {
              connection.close();
          } catch (SQLException ex) {
              Logger.getLogger(LoginDB.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
      return "failure";
  }    
}
