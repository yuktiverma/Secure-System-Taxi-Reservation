package com.beans;

import java.security.PublicKey;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yukti
 * This bean stores the encrypted text after encryption is done
 */
public class EncryptedText 
{
 PublicKey EncryptedPrivateKey; //encrypted private key by public key
 String encrypteName;//name after encryption
 String encryptNumber;//number after encryption
 String encryptExpiration;//expiration date after encryption


    public String getEncrypteName() {
        return encrypteName;
    }

    public void setEncrypteName(String encrypteName) {
        this.encrypteName = encrypteName;
    }

    public String getEncryptNumber() {
        return encryptNumber;
    }

    public void setEncryptNumber(String encryptNumber) {
        this.encryptNumber = encryptNumber;
    }

    public String getEncryptExpiration() {
        return encryptExpiration;
    }

    public void setEncryptExpiration(String encryptExpiration) {
        this.encryptExpiration = encryptExpiration;
    }
 

    public PublicKey getEncryptedPrivateKey() {
        return EncryptedPrivateKey;
    }

    public void setEncryptedPrivateKey(PublicKey EncryptedPrivateKey) {
        this.EncryptedPrivateKey = EncryptedPrivateKey;
    }
 
}
