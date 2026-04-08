package com.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpec {
    public static ResponseSpecification ResSpec(int code){
        ResponseSpecification resSpec= new ResponseSpecBuilder().expectStatusCode(code).expectContentType("application/json").build();
        return resSpec;
    }
}
