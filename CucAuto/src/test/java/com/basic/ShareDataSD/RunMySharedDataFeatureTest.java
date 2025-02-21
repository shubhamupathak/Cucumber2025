package com.basic.ShareDataSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true, //removes junk characters from logs.
		//dryRun = true, //check the syntax line by line in stepdef file.
		features = {"src/test/resources/com/basic/SharedFF/"},
	    glue = {"com.basic.ShareDataSD"},
		plugin = {"pretty",
				"html:target/cucumber-reports/shareddata.html",
				"json:target/shareddata.json",	
		}
		)
public class RunMySharedDataFeatureTest 
{

}
