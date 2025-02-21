package com.basic.DataDrivenSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true, //removes junk characters from logs.
		//dryRun = true, //check the syntax line by line in stepdef file.
		features = {"src/test/resources/com/basic/DataDrivenFF/"},
	    glue = {"com.basic.DataDrivenSD"},
		plugin = {"pretty",
				"html:target/cucumber-reports/DDCucumberReport.html",
				"json:target/DDCucumberReport.json",	
		}
		)
public class RunMyDataDrivenFeatureTest 
{

}
