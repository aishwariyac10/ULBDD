package com.urbanladder.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = {".//Features"},
glue = {"com.urbanladder.StepDefinition"},
plugin = { "pretty", "html:target/cucumber-reports" },
monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests{

}
