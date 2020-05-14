package Demo_Cucumber.CucumberSample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "NDD4C18926014588");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\kunal\\Downloads\\Chrome Downloads\\Calculator_v7.8 (271241277)_apkpure.com.apk");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementById("com.google.android.calculator:id/digit_7").click();
		driver.findElementById("com.google.android.calculator:id/op_add").click();
		driver.findElementById("com.google.android.calculator:id/digit_5").click();
		driver.findElementById("com.google.android.calculator:id/eq").click();
	    String result=	driver.findElementById("com.google.android.calculator:id/result_final").getText();
	    System.out.println(result); 
		driver.quit();

	}

}
