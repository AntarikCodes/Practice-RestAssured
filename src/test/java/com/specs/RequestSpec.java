package com.specs;

import com.utils.ConfigReader;

import  io.restassured.builder.RequestSpecBuilder;

import io.restassured.specification.RequestSpecification;

public class RequestSpec {

    public static RequestSpecification ReqSpec(){
        RequestSpecification reqSpec= new RequestSpecBuilder().setBaseUri(ConfigReader.getConfigValue("baseURI")).setContentType("application/json").build();
        return reqSpec; 
    }

}
