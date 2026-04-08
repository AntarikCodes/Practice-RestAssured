package com.payload;

public class LoginPayload {
    public static String login(){
        String data="{\n" + "  \"email\": \"13564@example.com\",\n" + "  \"password\": \"secret123\"\n" +"}";
        return data;
    }
}
