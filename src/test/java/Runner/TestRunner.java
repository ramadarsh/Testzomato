package Runner;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;


import Runner.test;
import StepDefinition.Base;
//import StepDefinition.ServiceHooks;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.de.Aber;
import cucumber.api.junit.Cucumber;



//public String Path = System.getProperty("user.dir")+ "\\src\\test\\Testdata.xlsx";
@RunWith(Cucumber.class)
@CucumberOptions(
		format = "pretty",
	    tags = {
	    		//"@now",
	    		},
	   	features = {
	   		   
	   			"src\\test\\feature\\zomatotc1.feature",
	   			
	   			},
	   	glue = {"StepDefinition"}, 
	  	plugin = { "com.cucumber.listener.ExtentCucumberFormatter:","junit:target/cucumber-results.xml","rerun:target/rerun/failed_scenarios.txt"},
	  //plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","junit:target/cucumber-results.xml"},
	   	monochrome = true

// format= {"pretty,html:test-output"}

)

@test
public class TestRunner
{
//	Utility u1 = new Utility();
	ExtentTest extentTest;
	
	
	
	@BeforeClass
	public static void beforeScenario()
	{
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm").format(new Date());
	    String fileName = "Report-" + timeStamp;
	   // ExtentReports extent = new ExtentReports("user.dir" + "target\\cucumber-reports\\"+ fileName+ ".html", true);
	        
	    ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setReportPath("target/cucumber-reports/"+fileName+".html"); //used same string name to create the file with the same name.
        
	}
	
	
	
	
	@AfterClass
	 public static void writeExtentReport() throws IOException, InterruptedException {
	  String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm").format(new Date());
	  String fileName = "Report-" + timeStamp;
     // Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	  String reportConfigPath = System.getProperty("user.dir")+"\\src\\main\\java\\Config\\Extent_Config.xml";
	  Reporter.loadXMLConfig("reportConfigPath");
      Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
      Reporter.setSystemInfo("User Name", "Adarsh Ramesh");
      Reporter.setSystemInfo("Application Name", "Test zomato ");
      Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
      Reporter.setSystemInfo("Environment", "QA Environment");
      Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
     // Reporter.addScreenCaptureFromPath(Utility.capture(driver, Utility.capture(driver,fileName )));  
      
      
	}
	 
	
	 
	
	 
		 
	 
	 
	 
	
	/* String report = new SimpleDateFormat("yyyyMMddHHmm'.html'").format(new Date());*/
   
}

