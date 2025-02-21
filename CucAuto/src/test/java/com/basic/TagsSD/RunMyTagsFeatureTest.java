package com.basic.TagsSD;

import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true, //removes junk characters from logs.
		//dryRun = true, //check the syntax line by line in stepdef file.
		tags = "@Important",
		features = {"src/test/resources/com/basic/TagsFF/"},
	    glue = {"com.basic.TagsSD"},
		plugin = {"pretty",
				"html:target/cucumber-reports/tags.html",
				"json:target/tags.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				}
		)
public class RunMyTagsFeatureTest 
{
	}
