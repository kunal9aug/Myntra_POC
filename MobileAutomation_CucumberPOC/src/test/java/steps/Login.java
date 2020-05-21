package steps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Assert;

public class Login {
	AndroidDriver<WebElement> driver;
	
	@Before("@Login")
	public void SetUp() throws MalformedURLException {
		System.out.println("Before method executed");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "NDD4C18926014588");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		dc.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"\\Utilities\\com.myntra.android.apk");
		dc.setCapability("appPackage", "com.myntra.android");
		dc.setCapability("appActivity", "com.myntra.android.activities.LoginRegisterActivity");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		driver = new AndroidDriver<WebElement>(url,dc);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	@After("@Login")
	public void TearDown() {
		System.out.println("After method executed");
		driver.quit();
	}
	
	@Given("^User is on Myntra Home Page$")
	public void user_is_on_Myntra_Home_Page() throws Exception {
		System.out.println("Application Opens With Home Page");
	    
	}

	@When("^User clicks the Login button and enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_clicks_the_Login_button_and_enters_and(String username, String password) throws Exception {
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc="+'"'+"leftElement"+'"'+"]/android.widget.TextView").click();
		Thread.sleep(5000);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup").click();
		driver.findElementById("com.myntra.android:id/et_email_or_phone").sendKeys(username);
		driver.findElementById("com.myntra.android:id/et_loginregister_password").sendKeys(password);
		driver.findElementById("com.myntra.android:id/btn_loginregister_continue_signin").click();
	}

	@Then("^User Should be able to login$")
	public void user_Should_be_able_to_login() throws Exception {
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup").click();
		String Name=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView").getText();
	    Assert.assertEquals(Name, "Demo");
	}
	
	@Then("^A message is shown saying Incorrect User id and password$")
	public void a_message_is_shown_saying_Incorrect_User_id_and_password() throws Exception {
	    String ErrorMessage=driver.findElementById("com.myntra.android:id/sb__text").getText();
	    System.out.println(ErrorMessage);
	    Assert.assertEquals("Incorrect user id or password", ErrorMessage);
	}

}
