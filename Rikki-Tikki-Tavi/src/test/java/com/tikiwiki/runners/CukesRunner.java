package com.tikiwiki.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {
				"html:target/cucumber-report",
				"json:target/cucumber.json"
				},

		tags= "@createWP, @deleteWP,  @upload_file, @delete_file ",
		features="src/test/resources/com/tikiwiki/features/",
		glue="com/tikiwiki/step_definitions/",
		dryRun=false
		)

public class CukesRunner extends AbstractTestNGCucumberTests{

}
