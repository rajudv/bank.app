package com.ai.RiskNet.RT.web.env;

import com.ai.RiskNet.RT.web.utilities.AssertionMethods;
import com.ai.RiskNet.RT.web.utilities.ClickElementsMethods;
import com.ai.RiskNet.RT.web.utilities.ConfigurationMethods;
import com.ai.RiskNet.RT.web.utilities.InputMethods;
import com.ai.RiskNet.RT.web.utilities.JavascriptHandlingMethods;
import com.ai.RiskNet.RT.web.utilities.MiscMethods;
import com.ai.RiskNet.RT.web.utilities.NavigateMethods;
import com.ai.RiskNet.RT.web.utilities.ProgressMethods;
import com.ai.RiskNet.RT.web.utilities.ScreenShotMethods;
import com.ai.RiskNet.RT.web.utilities.TestCaseFailed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface BaseTest 
{
	public static WebDriver driver = Env.CreateWebDriver(Env.getBrowserName());
	public static WebDriverWait wait = new WebDriverWait(driver, 30);
	
	
	MiscMethods miscmethodObj = new MiscMethods();
	NavigateMethods navigationObj = new NavigateMethods();
	AssertionMethods assertionObj = new AssertionMethods();
	ClickElementsMethods clickObj = new ClickElementsMethods();
	ConfigurationMethods configObj = new ConfigurationMethods();
	InputMethods inputObj = new InputMethods();
	ProgressMethods progressObj = new ProgressMethods();
	JavascriptHandlingMethods javascriptObj = new JavascriptHandlingMethods();
	ScreenShotMethods screenshotObj = new ScreenShotMethods();
}
