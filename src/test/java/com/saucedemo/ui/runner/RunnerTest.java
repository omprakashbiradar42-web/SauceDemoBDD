package com.saucedemo.ui.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ={"src\\test\\java\\com\\saucedemo\\ui\\featuresFile\\saucedemo.feature"},
		glue ={"com.saucedemo.ui.stepDefinations"},
		dryRun= false,
		plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		
		)

public class RunnerTest extends AbstractTestNGCucumberTests{

}
