package com.toyota.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "com.stepdef.product"
		)
public class TestRunners extends AbstractTestNGCucumberTests{

}
