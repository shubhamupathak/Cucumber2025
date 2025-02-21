package com.basic.DataTableSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true, //removes junk characters from logs.
		//dryRun = true, //check the syntax line by line in stepdef file.
		features = {"src/test/resources/com/basic/DataTableFF/"},
	    glue = {"com.basic.DataTableSD"},
		plugin = {"pretty",
				"html:target/cucumber-reports/DataTable.html",
				"json:target/DataTable.json",	
		}
		)
public class RunDataTableFeatureTest 
{

}
