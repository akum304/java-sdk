package com.java.jwt;

import java.io.IOException;
import java.util.Base64;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class secuuthJwt {

    String aud;
    int exp;
    int iat;
    String iss;
    String sub;
    String jti;
    String token;

    

    public secuuthJwt(String aud, int exp, int iat, String iss, String sub, String jti, String token) {
        this.aud = aud;
        this.exp = exp;
        this.iat = iat;
        this.iss = iss;
        this.sub = sub;
        this.jti = jti;
        this.token = token;
    }

    

   



    public secuuthJwt() {
    }







    public String getAud() {
        return this.decodePayload().aud;
    }











    public int getExp() {
        return this.decodePayload().exp;
    }











    public int getIat() {
        return this.decodePayload().iat;
    }











    public String getIss() {
        return this.decodePayload().iss;
    }










    public String getSub() {
        return this.decodePayload().sub;
    }






    





    public String getJti() {
        return this.decodePayload().jti;
    }






    












    






    public secuuthJwt decodePayload() {

        String[] chunks = token.split("\\.");
        Base64.Decoder decoder = Base64.getDecoder();
        String payload = new String(decoder.decode(chunks[1]));
        ObjectMapper g = new ObjectMapper();
     


    
            secuuthJwt baseClaims=null;
            try {
                baseClaims = g.readValue(payload, secuuthJwt.class);
            } catch (JsonParseException e) {
                System.out.println("AMITOSH KUMAR");
            
                e.printStackTrace();
            } catch (JsonMappingException e) {
                
                e.printStackTrace();
            } catch (IOException e) {
                
                e.printStackTrace();
            }
            return baseClaims;
            
            
        
        
        
      
       
}




}
