package com.java.jwt;

import com.auth0.jwk.JwkException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JwkException {
        System.out.println( "Hello World!" );
        Test test=new Test();
        test.validateAccesToken();
        
      
    }
}
