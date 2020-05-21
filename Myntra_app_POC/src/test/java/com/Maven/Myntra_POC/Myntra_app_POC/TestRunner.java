package com.Maven.Myntra_POC.Myntra_app_POC;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"Features"},//"Features/Login.feature"
plugin={"html:Reports/rep.html"},
monochrome=true,
glue= {"com.Maven.Myntra_POC.Myntra_app_POC"})

//plugin={"html:Reports/rep.html"}
public class TestRunner {
	
//	@AfterClass
//	public static void writeExtentReport() {
//		com.vimalselvam.cucumber.listener.Reporter.loadXMLConfig("extent-config.xml");
//	}

}
