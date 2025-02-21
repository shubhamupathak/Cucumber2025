package com.basic.HooksSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true, //removes junk characters from logs.
		//dryRun = true, //check the syntax line by line in stepdef file.
		features = {"src/test/resources/com/basic/HooksFF/"},
	    glue = {"com.basic.HooksSD"},
		plugin = {"pretty",
				"html:target/cucumber-reports/Hooks.html",
				"json:target/Hooks.json",	
		}
		)
public class RunMyHooksFeatureTest 
{

}
