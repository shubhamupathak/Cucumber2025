package com.basic.BackgroundSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true, //removes junk characters from logs.
		//dryRun = true, //check the syntax line by line in stepdef file.
		features = {"src/test/resources/com/basic/BackgroundFF/"},
	    glue = {"com.basic.BackgroundSD"},
		plugin = {"pretty",
				"html:target/cucumber-reports/background.html",
				"json:target/cucumber-report-background.json",
		}
		)
public class RunMyBackgroundFeatureTest 
{

}
