//package parallelSteps;
//
//import org.junit.runner.RunWith;
//import org.testng.annotations.DataProvider;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//
//@RunWith(Cucumber.class)
////https://github.com/cucumber/cucumber-jvm/tree/v4.0.0/testng
//@CucumberOptions(features = "src/test/resources/parallel/", glue = { "src/test/java/parallelSteps/" },
//		
////		// @SmokeTest @OnlyFunctionality
////		"pretty", "html:target/cucumber-reports/cucumber-pretty",
////		"json:target/cucumber-reports/CucumberTestReport.json",
////		"rerun:target/cucumber-reports/rerun.txt" },
//		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//				"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"})
//
//public class RunCucumberTest extends AbstractTestNGCucumberTests{
//
//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
//    
//}
