package com.java.jwt;

import java.security.PublicKey;


import java.security.interfaces.RSAPublicKey;


import com.auth0.jwk.JwkException;

import com.auth0.jwk.UrlJwkProvider;
import com.auth0.jwt.JWT;

import com.auth0.jwt.algorithms.Algorithm;

import com.auth0.jwt.interfaces.DecodedJWT;

import com.auth0.jwt.interfaces.Verification;



public class SecuuthValidate {

    




    

    public SecuuthValidate() {
    }

    public Boolean validate(String token) throws JwkException {
        



        DecodedJWT jwt = JWT.decode(token);
        System.out.println(jwt.getAlgorithm()); 
         UrlJwkProvider provider = new UrlJwkProvider("http://localhost:5000/tokens/jwks");
    
        PublicKey jwk = provider.get("secuuth").getPublicKey();
        
        
        final RSAPublicKey publickkey=(RSAPublicKey) jwk;

  
        
        
        System.out.println(publickkey);
        Algorithm algorithm = Algorithm.RSA256((RSAPublicKey) publickkey,null);
        Verification verifier = JWT.require(algorithm);
        


        
        try {

            
            verifier.build().verify(jwt);
           

        }
        catch(Exception e){
            System.out.println("not verified"+e);
        }
        


        

        return true;

    }





    


       





}

        
 

    
    
