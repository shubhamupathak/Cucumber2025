package com.basic.ParameterizeSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true, //removes junk characters from logs.
		//dryRun = true, //check the syntax line by line in stepdef file.
		features = {"src/test/resources/com/basic/ParametersFF/"},
	    glue = {"com.basic.ParameterizeSD"},
		plugin = {"pretty",
				"html:target/cucumber-reports/paramters.html",
				"json:target/parameters.json",	
		}
		)
public class RunMyParameterizedFeatureTest 
{

}
