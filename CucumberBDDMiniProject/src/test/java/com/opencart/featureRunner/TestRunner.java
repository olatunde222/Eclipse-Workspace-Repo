package com.opencart.featureRunner;

import org.testng.annotations.DataProvider;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/com/opencart/featureRunner",
				glue = {"com.opencart.stepdefinationsfiles"},
				plugin= {"pretty", "html:/target/cumcumber-report.html", "json:target/cucmber.json"}, 
				monochrome = true,
				publish = true)

public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
}
