package com.payload;



public class LoginPayload {
   private String dataEmail;
    private String dataPassword;
    
    //Getters
    public void setCred(String email, String password){
        this.dataEmail=email;
        this.dataPassword=password;

    }

    //Setters
    public String getEmail(){
        return dataEmail;
    }
    public String getPassword(){
        return dataPassword;
    }
}
