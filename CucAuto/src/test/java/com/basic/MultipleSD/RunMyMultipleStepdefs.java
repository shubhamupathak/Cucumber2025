package com.basic.MultipleSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true, //removes junk characters from logs.
		//dryRun = true, //check the syntax line by line in stepdef file.
		features = {"src/test/resources/com/basic/MultipleFF/"},
	    glue = {"com.basic.MultipleSD"},
		plugin = {"pretty",
				"html:target/cucumber-reports/multistepdefs.html",
				"json:target/multistepdefs.json",	
		}
		)
public class RunMyMultipleStepdefs 
{

}
