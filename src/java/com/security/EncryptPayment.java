/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.security;

/**
 *
 * @author Yukti
 * This class uses bouncy castle AES 256 to encrypt the data
 */







import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;
import org.bouncycastle.crypto.paddings.PKCS7Padding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class EncryptPayment {
	public int blockSize= 16;
	
	BufferedBlockCipher encryptCipher = null;
	PaddedBufferedBlockCipher decryptCipher = null;
	
	//key
	byte[] key = null;
	
	//IV
	byte[] IV = null;
	
	public EncryptPayment() throws NoSuchAlgorithmException, NoSuchProviderException{
		KeyGenerator keyGen = KeyGenerator.getInstance("AES", "BC");
		keyGen.init(256);
		key = keyGen.generateKey().getEncoded();//key generation
		IV = new byte[blockSize];//initialization of iv
		Security.addProvider(new BouncyCastleProvider());
		if(Security.getProvider("BC")!=null)//checking of bouncy castle provider
		{
			System.out.println("provider founded : Bouncy Castle");
		
		}
		else{
			System.out.println("provider not founded");
		
		}
	}
	
 
	public Object InitCiphers()
            throws NoSuchAlgorithmException,
            NoSuchProviderException,
            NoSuchProviderException,
            NoSuchPaddingException,
            InvalidKeyException,
            InvalidAlgorithmParameterException{
		
		
		
		
       //1. create the cipher using Bouncy Castle Provider
            System.out.println("initiaaalizing");
		BlockCipherPadding padding = new PKCS7Padding();
		 encryptCipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new AESEngine()), padding);
	    encryptCipher.reset();
	    
		//encryptCipher = new PaddedBufferedBlockCipher(
            //    (BlockCipher) new CBCBlockCipher(new AESEngine()));
       //encryptCipher =
         //      Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");
       //2. create the key
       SecretKey keyValue = new SecretKeySpec(key,"AES");
       //3. create the IV
       ParametersWithIV parameterIV =
               new ParametersWithIV(new KeyParameter(key),IV);
       
       //AlgorithmParameterSpec IVspec = new IvParameterSpec(IV);
       //4. init the cipher
       encryptCipher.reset();
       encryptCipher.init(true, parameterIV);
       
      // encryptCipher.init(Cipher.ENCRYPT_MODE, keyValue, IVspec);
 
       
       //1 create the cipher
      /* decryptCipher =
               Cipher.getInstance("AES/CBC/PKCS5Padding", "BC");
       //2. the key is already created
       //3. the IV is already created
       //4. init the cipher
       decryptCipher.init(Cipher.DECRYPT_MODE, keyValue, IVspec);*/
       return keyValue+","+parameterIV;
    }
	
	public String encrypt(String strToEncrypt){
		try{
			//System.out.println("Reached encrypt+"+strToEncrypt.getBytes().length);
			//byte[] encData = toByte(strToEncrypt.substring(32));
			byte[] buf = new byte[encryptCipher.getOutputSize(strToEncrypt.getBytes().length)];
			
			System.out.println(buf+"buffer");
		    int len = encryptCipher.processBytes(strToEncrypt.getBytes(), 0, strToEncrypt.getBytes().length, buf, 0);
		    len += encryptCipher.doFinal(buf, len);
		    
		    byte[] out = new byte[len];
		    System.arraycopy(buf, 0, out, 0, len);
		    return out.toString();

		    // return string representation of decoded bytes
		    //return new String(out, "UTF-8");
			//int es=  encryptCipher.doFinal(strToEncrypt.getBytes(), encryptCipher.getOutputSize(strToEncrypt.length()));
			//String encryptedName = Integer.toString(es);
			//return encryptedName;
			
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}