package com.java.jwt;

import com.auth0.jwk.JwkException;

public class Test {
    


    public Test() {
    }

    public void validateAccesToken() throws JwkException {
   
        //String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyLCJ1c24iOiIxSlQxOENTMDE1In0.TET-AbEgiaEtU1g4_ChDDfbKwEjj_tVL0jGo8Go5Sa4";
       String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyLCJ1c24iOiIxSlQxOENTMDE1In0.TET-AbEgiaEtU1g4_ChDDfbKwEjj_tVL0jGo8Go5Sa4";
        secuuthAccessToken obj = new secuuthAccessToken(null,null,0,null);
         System.out.println(obj.decodePayload(token).iat);
        System.out.println(obj.decodePayload(token).name);
        System.out.println(obj.decodePayload(token).sub);
        System.out.println(obj.decodePayload(token).usn);
        System.out.println(obj.decodePayload(token).payload);
      
        

    }
    
}
