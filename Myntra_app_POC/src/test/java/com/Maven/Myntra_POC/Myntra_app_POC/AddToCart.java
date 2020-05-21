package com.Maven.Myntra_POC.Myntra_app_POC;

import java.net.MalformedURLException;
import java.sql.Driver;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class AddToCart extends CommonSteps{
	
	public AddToCart() throws Exception{
		super();
		AndroidDriver<WebElement> driver = getDriver();
		// TODO Auto-generated constructor stub
	}

	
	
	@Given("^User is Successfully logged into the application\\.$")
	public void user_is_Successfully_logged_into_the_application() throws Exception {
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc="+'"'+"leftElement"+'"'+"]/android.widget.TextView").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup").click();
		driver.findElementById("com.myntra.android:id/et_email_or_phone").sendKeys("Rashikas331@gmail.com");
		driver.findElementById("com.myntra.android:id/et_loginregister_password").sendKeys("Demo@123");
		driver.findElementById("com.myntra.android:id/btn_loginregister_continue_signin").click();
		System.out.println("Success run");
	}
	
	@When("^User clicks on Add to Bag for a Product$")
	public void user_clicks_on_Add_to_Bag_for_a_Product() throws Exception {
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]").click();
		driver.findElementByXPath("(//android.widget.TextView[@content-desc=\"text_brand\"])[1]").click();
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"buy_button\"]/android.view.ViewGroup/android.widget.TextView").click();
	   
	}

	@Then("^The Product gets added in Cart$")
	public void the_Product_gets_added_in_Cart() throws Exception {
		Thread.sleep(3000);
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc="+'"'+"buy_button"+'"'+"]/android.view.ViewGroup/android.widget.TextView").click();
		String productName=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]").getText();
	    Assert.assertEquals("BEARDO", productName);
	    quit();
	}

}
