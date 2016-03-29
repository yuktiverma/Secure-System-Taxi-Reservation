/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

/**
 *
@author Yukti
 * This bean sets and returns the card details as and when required
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class CardDetails {
	
	private String cust_name;//customer's name
	private String card_num;//card's number
	private String card_expiration;//card's expiration
        
	
	public String getCard_expiration() {
		return card_expiration;
	}
	public void setCard_expiration(String card_expiration) {
		this.card_expiration = card_expiration;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
		System.out.println(cust_name);
		
	}
	public String getCard_num() {
		return card_num;
	}
	public void setCard_num(String card_num) {
		this.card_num = card_num;
	}
	
	

}

