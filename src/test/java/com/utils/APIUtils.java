package com.utils;

import static io.restassured.RestAssured.given;

import com.specs.RequestSpec;
import com.specs.ResponseSpec;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class APIUtils {
    public static Response getRequest(String endpoint){
        Response response= given().spec(RequestSpec.ReqSpec()).header("Content-Type","application/json").
                            when().get(endpoint);
        return response;
    }
    public static Response postRequest(String endpoint, String payload){
        return given().spec(RequestSpec.ReqSpec()).header("Content-Type","application/json").body(payload).
                            when().post(endpoint);
    }

    public static ValidatableResponse getLoginRequest(String endpoint,String token, int code){
        return given().spec(RequestSpec.ReqSpec()).header("Authorization", "Bearer " + token).
                when().get(endpoint).
                then().spec(ResponseSpec.ResSpec(code));
    }   
}