package com.base;

import org.testng.annotations.BeforeClass;

import com.specs.RequestSpec;
import com.specs.ResponseSpec;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseTest {
    protected RequestSpecification reqSpec;
    protected ResponseSpecification resSpec;
    @BeforeClass
    public void setUp(){
        reqSpec=RequestSpec.ReqSpec();
        resSpec=ResponseSpec.ResSpec(200);
    }

}
