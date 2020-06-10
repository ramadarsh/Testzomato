package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
//import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;


public class hooks extends Base {

	public AndroidDriver<AndroidElement> ad;
	

	
	
	//@Before
	public void setup() throws MalformedURLException
	{
		//initialization();
	}

	// capture and add to reports

	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		String dest = null;
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm").format(new Date());
		String currentdate = new SimpleDateFormat("yyyy_MM_dd").format(new Date());
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
			Date date = new Date();
			TakesScreenshot ts = (TakesScreenshot) Base.ad;
			File source = ts.getScreenshotAs(OutputType.FILE);
			System.out.println("scenario name :" + screenshotName);
			dest = System.getProperty("user.dir") + "\\target\\" + "Screenshots" + currentdate + "\\" + screenshotName
					+ timeStamp + ".png";
			File destination = new File(dest);
			FileUtils.copyFile(source, destination);
			Reporter.addScreenCaptureFromPath(dest);
		} catch (Exception e) {
			e.getMessage();
			System.out.println(e.getMessage());
		}
	}

	@After(order = 0)
	public void AfterSteps() throws MalformedURLException {
		Base.ad.quit();
	}

}
