package com.specs;

import  io.restassured.builder.RequestSpecBuilder;

import io.restassured.specification.RequestSpecification;

public class RequestSpec {

    public static RequestSpecification ReqSpec(){
        RequestSpecification reqSpec= new RequestSpecBuilder().setBaseUri("https://api.eventhub.rahulshettyacademy.com/api").setContentType("application/json").build();
        return reqSpec; 
    }

}
