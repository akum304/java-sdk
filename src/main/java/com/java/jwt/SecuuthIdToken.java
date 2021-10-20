package com.java.jwt;

import java.io.IOException;
import java.util.Base64;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SecuuthIdToken extends secuuthJwt{

    String sub;
    String name;
    int iat;
    String usn;

    public SecuuthIdToken(String sub, String name, int iat, String usn) {

        this.sub = sub;
        this.name = name;
        this.iat = iat;
        this.usn = usn;
    }
    String token;

    public SecuuthIdToken(){

    }
    public String getSub() {
        return this.decodePayload(token).sub;
    }

    public String getName() {
        return this.decodePayload(token).name;
    }

    public int getIat() {
        return this.decodePayload(token).iat;
    }

    public String getUsn() {
        return this.decodePayload(token).usn;
    }

    

    public SecuuthIdToken decodePayload(String token) {
        String[] chunks = token.split("\\.");
        Base64.Decoder decoder = Base64.getDecoder();
        String payload = new String(decoder.decode(chunks[1]));
        ObjectMapper g = new ObjectMapper();

        SecuuthIdToken baseClaims = null;
        try {
            baseClaims = g.readValue(payload, SecuuthIdToken.class);
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
