package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.listener.Reporter;

//import commonlibrary.LinkedList;
//import commonlibrary.List;

@SuppressWarnings("deprecation")
public class ZomatosearchPageStepDefinition extends Base{

	
	public AndroidDriver<AndroidElement> ad;
	MobileElement search;
	hooks h1 = new hooks();
	Scenario scenario;
	
	//AndroidDriver<AndroidElement> driver1;
	//Utility u1 = new Utility();
	
	//ZomatosearchPage zomatosearchPage = new ZomatosearchPage(driver1);

//	public ZomatosearchPageStepDefinition(AndroidDriver<AndroidElement> ti) {
//		this.zomatosearchPage = new ZomatosearchPage(ti);
//	}

	@Given("^launch zomato app$")
	public void launch_zomato_app() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		ad = getDriver();
		System.out.println("exec1");
		System.out.println("exec2");
		ad.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	@When("^close get started screen$")
	public void close_get_started_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//AndroidDriver<AndroidElement> ad = getDriver();
		MobileElement loginwithgmail = (MobileElement)ad.findElementById("com.application.zomato:id/layout_connect_using_google");
		loginwithgmail.click();
		MobileElement selectid = (MobileElement)ad.findElement(By.xpath("//android.widget.TextView[@text='ramaadarsh94@gmail.com']"));
		selectid.click();
		//ad.findElementByName("adarsh4selenium@gmail.com").click();
	}

	@When("^select allow only while using the app$")
	public void select_allow_only_while_using_the_app() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		MobileElement allownetwork = (MobileElement)ad.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
		
		allownetwork.click();
		

	}

	@Given("^click on search box$")
	public void click_on_search_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		MobileElement search = (MobileElement)ad.findElementById("com.application.zomato:id/edittext");
		search.click();
	}

	@When("^User inputs \"([^\"]*)\" in search box$")
	public void user_inputs_in_search_box(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		MobileElement inputsearch = (MobileElement)ad.findElementByClassName("android.widget.EditText");
		inputsearch.sendKeys("anna");
	}

	@When("^User should view search results displayed$")
	public void user_should_view_search_results_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^User should select (\\d+)nd suggestion from search result displayed$")
	public void user_should_select_nd_suggestion_from_search_result_displayed(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		MobileElement serachlist = (MobileElement)ad.findElementByXPath("//android.view.ViewGroup[@index='1']");
		serachlist.click();
//		h1.afterScenario(scenario);
//		ad.closeApp();
		Thread.sleep(10000);
	}
	
	

@When("^user selects login with Gaccount and select corresponding account$")
public void user_selects_login_with_Gaccount_and_select_corresponding_account() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	MobileElement loginwithgmail = (MobileElement)ad.findElementById("com.application.zomato:id/layout_connect_using_google");
	loginwithgmail.click();
	MobileElement selectid = (MobileElement)ad.findElement(By.xpath("//android.widget.TextView[@text='ramaadarsh94@gmail.com']"));
	selectid.click();
}

@Given("^user will navigate to profile section$")
public void user_will_navigate_to_profile_section() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(4000);
	MobileElement profile = (MobileElement)ad.findElementByXPath("//android.widget.LinearLayout[@index='4']");
	profile.click();
}

@Then("^user will select the profile picture$")
public void user_will_select_the_profile_picture() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	MobileElement selectprofile = (MobileElement)ad.findElementById("com.application.zomato:id/image");
	selectprofile.click();
}

@Then("^user will select edit profile$")
public void user_will_select_edit_profile() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	MobileElement editprofile = (MobileElement)ad.findElementById("com.application.zomato:id/edit_details");
	editprofile.click();
}

@Then("^user will select edit photo button and click change photo from the list$")
public void user_will_select_edit_photo_button_and_click_change_photo_from_the_list() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	MobileElement editphoto = (MobileElement)ad.findElement(By.xpath("//android.widget.Button[@text='Edit Photo']"));
	editphoto.click();
	MobileElement changephoto = (MobileElement)ad.findElement(By.xpath("//android.widget.TextView[@text='Change Photo']"));
	changephoto.click();
}

@Then("^user will allow permissions$")
public void user_will_allow_permissions() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	MobileElement allowpermission = (MobileElement)ad.findElementById("com.android.permissioncontroller:id/permission_allow_button");
	allowpermission.click();
}

@Then("^user should select a profile picture from gallery and preview$")
public void user_should_select_a_profile_picture_from_gallery_and_preview() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	MobileElement selectphoto = (MobileElement)ad.findElementById("com.application.zomato:id/image_view");
	selectphoto.click();
	MobileElement previewphoto = (MobileElement)ad.findElementById("com.application.zomato:id/button_preview");
	previewphoto.click();
}

@When("^user clicks Done profile picture should be updated as expected$")
public void user_clicks_Done_profile_picture_should_be_updated_as_expected() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	MobileElement Done = (MobileElement)ad.findElement(By.xpath("//android.widget.TextView[@text='Done']"));
	Done.click();
//	h1.afterScenario(scenario);
//	ad.closeApp();
	Thread.sleep(2000);
}




}
