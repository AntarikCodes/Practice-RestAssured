package com.test;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.utils.APIUtils;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class AuthTest extends BaseTest {
    @Test(priority = 1)
      public void postUser(ITestContext context)
    { 
      System.out.println("\n\nRunning post user \n");
      Response response=APIUtils.postRequest("/auth/register");
      String token=response.jsonPath().getString("token");
      context.setAttribute("token", token);
      System.out.println(response.getStatusCode());
      System.out.println("Token: "+token+"\n");
}
@Test(dependsOnMethods = {"postUser"})
public void getLogin(ITestContext context){
  System.out.println("Running get Login \n");
  String token= (String)context.getAttribute("token");
  ValidatableResponse response=APIUtils.getLoginRequest(reqSpec,"/auth/me", token,200);
  Boolean bool=response.extract().path("success" );
  int userID=response.extract().path("user.userId");
  System.out.println("userID "+userID);
  if(bool) System.out.println("Authentication is good ");
  else System.out.println("Failed");
}
}
