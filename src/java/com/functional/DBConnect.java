/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.functional;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Yukti
 * this class simply returns the connection object
 */
public class DBConnect 
{
 Connection connect=null;
    public Connection getConnection()
    {
        try
        {
            //gets the connection fron driver manager and assigns to connect
      connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/taxibookingsystem","root","password");
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
           System.out.println("Exception in connection");
        }
        return connect;//connect returns the connection object
    }    
}
