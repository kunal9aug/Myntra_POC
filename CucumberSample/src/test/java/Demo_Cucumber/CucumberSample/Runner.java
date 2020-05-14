package Demo_Cucumber.CucumberSample;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\kunal\\eclipse-workspace\\CucumberSample\\src\\test\\java\\Demo_Cucumber\\CucumberSample\\Second.feature",plugin={"html:src\\reports\\rep.html"}, glue="")
public class Runner {

}
