package StepDefinition;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> ad;
	//s@Before
	public static AndroidDriver<AndroidElement> getDriver() throws MalformedURLException {
		// TODO Auto-generated method stub
		File src = new File(System.getProperty("user.dir")+"\\src\\test\\java\\");
		File src1 = new File(src,"Zomato-1710014440-14.4.4.apk");
		//File src2 = new File(src,"ApiDemos-debug.apk");
		
		DesiredCapabilities d1 = new DesiredCapabilities();
		DesiredCapabilities caps = new DesiredCapabilities();
		
		d1.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		//d1.setCapability(MobileCapabilityType.APP , src1.getAbsolutePath());
		d1.setCapability("appPackage", "com.application.zomato");
		d1.setCapability("appActivity", "com.application.zomato.activities.Splash");
		
		
		ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), d1);
		//ad.navigate().back();
		//ad.findElementByXPath("//android.widget.TextView(@text='Media')").click();
		//return ad;
		return ad;
		

	}

}
