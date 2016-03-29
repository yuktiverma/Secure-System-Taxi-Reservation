/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.beans.CardDetails;
import com.beans.EncryptedText;
import com.security.EncryptPayment;
import java.io.IOException;
import java.security.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class PaymentServlet
 */
@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private byte[] key = {0x74,0x68,0x69,0x73,0x49,0x73,0x41,0x53,0x65,0x63,0x72,0x65,0x74,0x4b,0x65,0x79};
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
		String name = request.getParameter("name_on_card");
		String card_number = request.getParameter("card1");
		String expiration1 = request.getParameter("expireMM");
                String expiration2=request.getParameter("expireYY");
                String expiration=expiration1+expiration2;
		          
                CardDetails cd = new CardDetails();
		cd.setCust_name(name);
		cd.setCard_num(card_number);
		cd.setCard_expiration(expiration);
		EncryptedText encObject=new EncryptedText();
		EncryptPayment ep=null;
		try {
			ep = new EncryptPayment();
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchProviderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try 
                {
			Object keyIv=ep.InitCiphers();
                        HttpSession session=request.getSession();
                        session.setAttribute("AESKeyandIV", keyIv);
                        
		}
               catch(Exception e)
               {
                   e.printStackTrace();
               }
		String enc_name = ep.encrypt(cd.getCust_name());
                encObject.setEncrypteName(enc_name);
                request.setAttribute("ename", enc_name );
                System.out.println("enc_name"+enc_name);
               
                String enc_number = ep.encrypt(cd.getCard_num());
                request.setAttribute("enumber", enc_number);
                encObject.setEncryptNumber(enc_number);
                System.out.println("enc_num"+enc_number);
                
                String enc_expiration = ep.encrypt(cd.getCard_expiration());
		request.setAttribute("expiration", enc_expiration);
                encObject.setEncryptExpiration(enc_expiration);
                System.out.println("enc_exp"+enc_expiration);
                request.getSession().setAttribute("encryptedData", encObject);
		
		RequestDispatcher view = request.getRequestDispatcher("/AuthenticatePaymentServlet");
		view.forward(request, response);
		
	}
	}
	
	
	
	

