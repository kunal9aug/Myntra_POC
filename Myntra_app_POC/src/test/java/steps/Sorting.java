package steps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;

public class Sorting extends CommonSteps {
	
	public Sorting() throws Exception{
		super();
		AndroidDriver<WebElement> driver = getDriver();
		// TODO Auto-generated constructor stub
	}
	
	String PriceOfFirstItem;
	String PriceOfSortedFirstItem;
	
	@When("^User Clicks on a Product Category$")
	public void user_Clicks_on_a_Product_Category() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"leftElement\"]/android.widget.TextView").click();
	    Thread.sleep(3000);
	    driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").click();
	    driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup").click();
	    driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"biro_banner|https://www.myntra.com/essentialspcc\"]/android.widget.ImageView").click();
	    //driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.TextView").click();
	}

	@When("^User Clicks on Sort Option and choose price low to high$")
	public void user_Clicks_on_Sort_Option_and_choose_price_low_to_high() throws Exception {
	   PriceOfFirstItem=driver.findElementByXPath("(//android.widget.TextView[@content-desc=\"text_price\"])[1]").getText();
	   driver.findElementByAccessibilityId("touchable_sort").click();
	   driver.findElementByAccessibilityId("text_sort_item-4").click();
	   PriceOfSortedFirstItem=driver.findElementByXPath("(//android.widget.TextView[@content-desc=\"text_price\"])[1]").getText();
	   PriceOfFirstItem=PriceOfFirstItem.replace("?", "");
	   PriceOfSortedFirstItem=PriceOfSortedFirstItem.replace("?", "");
	}

	@Then("^Products get sorted from lowest to highest price products$")
	public void products_get_sorted_from_lowest_to_highest_price_products() throws Exception {
		System.out.println(PriceOfSortedFirstItem + " ----"+ PriceOfFirstItem);
	    Assert.assertNotEquals(PriceOfSortedFirstItem,PriceOfFirstItem);
	}

}
