package Runner;
import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import config.ConfigFileReader;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = "src/test/resources/features", glue = { "stepdefs" },
tags = { "@02_04_05_Login_Valid_Invalid_ChangePassword" }, format = {
			
		"pretty", "html:target/cucumber-reports/cucumber-pretty",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/rerun.txt" },
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"})
public class TestRunner {
	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		ConfigFileReader.ExecutionRoundCount();
		//ConfigFileReader.getTargetData();
		//ConfigFileReader.getDataDir();
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider(parallel=false)
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		Reporter.loadXMLConfig(new File("extent-config.xml"));
		Reporter.assignAuthor(System.getProperty("user.name"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("Windows", "64 bit");
		Reporter.setTestRunnerOutput("Test Case");
		testNGCucumberRunner.finish();
	}
}