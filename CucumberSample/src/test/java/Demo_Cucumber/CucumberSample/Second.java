package Demo_Cucumber.CucumberSample;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Assert;


public class Second {
	
	AndroidDriver<WebElement> driver;
	String result;
	
	
	@Given("^User opens Calculator app$")
	public void user_opens_Calculator_app() throws Exception {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "NDD4C18926014588");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\kunal\\Downloads\\Chrome Downloads\\Calculator_v7.8 (271241277)_apkpure.com.apk");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		driver = new AndroidDriver<WebElement>(url,dc);
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    
	}

	@When("^User inputs two numbers and add them$")
	public void user_inputs_two_numbers_and_add_them() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementById("com.google.android.calculator:id/digit_7").click();
		driver.findElementById("com.google.android.calculator:id/op_add").click();
		driver.findElementById("com.google.android.calculator:id/digit_5").click();
		driver.findElementById("com.google.android.calculator:id/eq").click();
	    result=	driver.findElementById("com.google.android.calculator:id/result_final").getText();

	    
	}

	@Then("^Calculator will show result of addition$")
	public void calculator_will_show_result_of_addition() throws Exception {
		if (result.equals("12")){
			System.out.println("Test Passed...");
		}
		else {
			System.out.println("Test Failed...");
		}
		driver.quit();
	}
	}
