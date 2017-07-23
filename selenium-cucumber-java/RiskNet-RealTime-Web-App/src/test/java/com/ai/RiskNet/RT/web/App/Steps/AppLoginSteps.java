package com.ai.RiskNet.RT.web.App.Steps;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Assert;

import com.ai.RiskNet.RT.web.env.BaseTest;
import com.ai.RiskNet.RT.web.utilities.RequirmentUtils;
import com.ai.RiskNet.RT.web.utilities.TestCaseFailed;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppLoginSteps implements BaseTest {
	private static String RiskNetRT_URL="RiskNetRT_URL";
	private static String AppLoginUserName="AppLoginUserName";
	private static String AppLoginPassword="AppLoginPassword";
	
	public 	boolean _bool=false;
	
	RequirmentUtils requtil = new RequirmentUtils();
	
	
	@Given("^I navigate to to RiskNet RealTime web application$")
	public void i_navigate_to_to_RiskNet_RealTime_web_application() throws Throwable {
	    String RST_URL = requtil.getEnvPropertyValue("AppLogin.properties", RiskNetRT_URL);
	    navigationObj.navigateTo(RST_URL);
	}

	@When("^I enter valid email and passord$")
	public void i_enter_valid_email_and_passord() throws Throwable {
		
		_bool = assertionObj.isElementDisplayed("xpath", "//*[@id='login-menu-options']");
		if(_bool) {
			String UserName = requtil.getEnvPropertyValue("AppLogin.properties", AppLoginUserName);
			String Password = requtil.getEnvPropertyValue("AppLogin.properties", AppLoginPassword);
			inputObj.enterText("id", UserName, "inputEmail3");
			inputObj.enterText("id", Password, "inputPassword3");
		}else {
			Assert.fail("Login form not visiable.");
		}
	}

	@Then("^I am logged in$")
	public void i_am_logged_in() throws Throwable {
		try {
			assertionObj.checkElementPresence("xpath", "//*[(@id='sign-out')]", true);
		} catch (TestCaseFailed e) {
			e.printStackTrace();
		}
	}
	
//	@Given("^I navigate to to RiskNet RealTime web application$")
//	public void i_navigate_to_to_RiskNet_RealTime_web_application() throws Throwable {
//	    System.out.println("@GIVEN");
//	    System.out.println(System.getProperty("user.dir")); 
//	    System.out.println(System.getProperty("user.dir")+"/BrowserConfig/BrowserDrivers/");
//	}
//
//	@When("^I enter valid email and passord$")
//	public void i_enter_valid_email_and_passord() throws Throwable {
//		System.out.println("@WHEN");
//	}
//
//	@Then("^I am logged in$")
//	public void i_am_logged_in() throws Throwable {
//		System.out.println("@THEN");
//	}
//	
}
