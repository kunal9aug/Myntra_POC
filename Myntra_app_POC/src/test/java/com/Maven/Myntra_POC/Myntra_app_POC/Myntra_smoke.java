package com.Maven.Myntra_POC.Myntra_app_POC;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Myntra_smoke {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "NDD4C18926014588");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		dc.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"\\Utilities\\com.myntra.android.apk");
		dc.setCapability("appPackage", "com.myntra.android");
		dc.setCapability("appActivity", "com.myntra.android.activities.LoginRegisterActivity");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc="+'"'+"leftElement"+'"'+"]/android.widget.TextView").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup").click();
		driver.findElementById("com.myntra.android:id/et_email_or_phone").sendKeys("Rashikas331@gmail.com");
		driver.findElementById("com.myntra.android:id/et_loginregister_password").sendKeys("Demo@123");
		driver.findElementById("com.myntra.android:id/btn_loginregister_continue_signin").click();
		System.out.println("Success run");
		
		driver.quit();

	}

}
