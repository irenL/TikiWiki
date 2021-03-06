package com.tikiwiki.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty",
				"html:target/cucumber-report",
				"json:target/cucumber.json"},
		tags="@smoke",
		features="src/test/resources/com/tikiwiki/features/",
		glue="com/tikiwiki/step_definitions/",
		dryRun=false)
public class SmokeTestsRunner extends AbstractTestNGCucumberTests{

}
