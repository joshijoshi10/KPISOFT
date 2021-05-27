package stepdefs;

import java.io.File;
import java.io.IOException;

import config.ConfigFileReader;
import cucumber.api.java.Before;
import util.TestContext;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumber.api.java.After;
//import util.ATUUtil;
//import util.TestContext;


public class ServiceHooks {

    TestContext testContext;
    private static boolean isFirstVideo = true;
//    private static ATUUtil atuUtil;

    public ServiceHooks(TestContext testContext){
        this.testContext = testContext;
    }

  	@Before(order=0)
    public void startRecording (Scenario scenario){
        if (ConfigFileReader.getRecordVideo().equalsIgnoreCase("Yes")
            && scenario.getName().matches(ConfigFileReader.getRecordScenarioes())) {
            if (isFirstVideo) {
                isFirstVideo = false;
                try {
                    FileUtils.cleanDirectory(new File(System.getProperty("user.dir")
                            + "\\src\\test\\resources\\Record_Videos"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
//                atuUtil = new ATUUtil(System.getProperty("user.dir")
//                        +"\\src\\test\\resources\\Record_Videos", scenario.getName());
//                atuUtil.start();
//                testContext.setAtuRecorder(atuUtil);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
  	

  		

  // ExtentReport Failed Screenshot Code
  	@After(order=1)
  	public void afterScenario(Scenario scenario) {
  		if (scenario.isFailed()) {
  			String screenshotName = scenario.getName();
  			try {
  				// This takes a screenshot from the driver at save it to the specified location
  				File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver())
  						.getScreenshotAs(OutputType.FILE);

  				// Building up the destination path for the screenshot to save
  				// Also make sure to create a folder 'screenshots' with in the cucumber-report
  				// folder
  				File destinationPath = new File(System.getProperty("user.dir") + "/target/" + screenshotName + ".jpg");
  				// Copy taken screenshot from source location to destination location
  				Files.copy(sourcePath, destinationPath);

  				// This attach the specified screenshot to the test
  				Reporter.addScreenCaptureFromPath(destinationPath.toString());
  			} catch (IOException e) {
  				e.printStackTrace();
  			}
  			
  		}
  	}	
    @BeforeMethod
    public void initializeTest(){
    	new WebDriverWait(testContext.getWebDriverManager().getDriver(), 15).until(
    	          webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    	System.out.println("waited for the page to load!!");
    }

    
    @After(order=0)
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                // Code to capture and embed images in test reports (if scenario fails)
                final byte[] screenshot = ((TakesScreenshot) testContext.getWebDriverManager().getDriver())
                        .getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png"); //stick it in the report
                scenario.write("URL at failure: " + testContext.getWebDriverManager().getDriver().getCurrentUrl());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        testContext.getWebDriverManager().closeDriver();
        if (ConfigFileReader.getRecordVideo().equalsIgnoreCase("Yes")
                && scenario.getName().matches(ConfigFileReader.getRecordScenarioes())) {
            try {
//                atuUtil.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
