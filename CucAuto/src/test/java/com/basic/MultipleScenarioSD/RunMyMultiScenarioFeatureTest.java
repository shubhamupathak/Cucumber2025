package com.basic.MultipleScenarioSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true, //removes junk characters from logs.
		//dryRun = true, //check the syntax line by line in stepdef file.
		features = {"src/test/resources/com/basic/MultipleScenarioFF/"},
	    glue = {"com.basic.MultipleScenarioSD"},
		plugin = {"pretty",
				"html:target/cucumber-reports/multiscenario.html",
				"json:target/multiscenario.json",	
		}
		)
public class RunMyMultiScenarioFeatureTest 
{

}
