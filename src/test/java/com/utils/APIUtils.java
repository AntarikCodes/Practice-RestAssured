package com.utils;

import static io.restassured.RestAssured.given;

import com.payload.LoginPayload;
import com.specs.RequestSpec;
import com.specs.ResponseSpec;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class APIUtils{

    public static Response getRequest(RequestSpecification reqSpec,String endpoint){
        Response response= given().spec(reqSpec).header("Content-Type","application/json").
                            when().get(endpoint);
        return response;
    }
    public static Response postRequest(String endpoint){
    LoginPayload loginData= new LoginPayload();
    loginData.setCred(ConfigReader.getConfigValue("email"),ConfigReader.getConfigValue("password"));
        return given().spec(RequestSpec.ReqSpec()).header("Content-Type","application/json").body(loginData).
                            when().post(endpoint);
    }

    public static ValidatableResponse getLoginRequest(RequestSpecification reqSpec,String endpoint,String token, int code){
        return given().spec(reqSpec).header("Authorization", "Bearer " + token).
                when().get(endpoint).
                then().spec(ResponseSpec.ResSpec(code));
    }   
}