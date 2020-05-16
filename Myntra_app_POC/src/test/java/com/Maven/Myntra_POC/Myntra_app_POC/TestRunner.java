package com.Maven.Myntra_POC.Myntra_app_POC;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"Features/Login.feature"},plugin={"html:Reports/rep.html"})


public class TestRunner {

}
