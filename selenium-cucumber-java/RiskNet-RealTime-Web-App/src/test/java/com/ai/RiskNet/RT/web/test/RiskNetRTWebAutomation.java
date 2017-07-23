package com.ai.RiskNet.RT.web.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//plugin = {"html:target/cucumberHtmlReport"},
		//pretty:target/cucumber-json-report.json
		plugin		= {"pretty"}, strict = false, dryRun = false,
		features	= {"src/test/resources/features"},
		glue		= {"com.ai.RiskNet.RT.web.App.Steps"} 		
)

public class RiskNetRTWebAutomation {
}
