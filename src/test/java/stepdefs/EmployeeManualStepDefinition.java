package stepdefs;

import config.ConfigFileReader;
import config.ExcelFileReader;
import cucumber.api.java8.En;
import pageObjects.EmployeePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import util.TestContext;

public class EmployeeManualStepDefinition implements En {

	TestContext testcontext;
	LoginPage loginPage;
	HomePage homePage;
	EmployeePage employeePage;

	public EmployeeManualStepDefinition(TestContext testContext) throws Exception {
		this.testcontext = testContext;
		this.loginPage = testContext.getPageObjectManager().getLoginPage();
		this.homePage = testContext.getPageObjectManager().getHomePage();
		this.employeePage = testContext.getPageObjectManager().getemployeepage();

		String employeeId = ExcelFileReader.getCellValue
				("Employee.xlsx", "Employee_Detail", 2, "A");
		String displayName = ExcelFileReader.getCellValue
				("Employee.xlsx", "Employee_Detail", 2, "B");
		String emailId = ExcelFileReader.getCellValue
				("Employee.xlsx", "Employee_Detail", 2, "C");
		String userName = ExcelFileReader.getCellValue
				("Employee.xlsx", "Employee_Detail", 2, "E");
		String finalEmpId = employeeId+"_"+ConfigFileReader.getExecutionRunCount();
		String finalDisplayName = displayName+"_"+ConfigFileReader.getExecutionRunCount();
		String finalEmailId = ConfigFileReader.getExecutionRunCount()+"_"+emailId;
		String finalUserName = userName+"_"+ConfigFileReader.getExecutionRunCount();
		
		When("^click on EmployeesLink$", () -> 
		{
			employeePage.ClickOnEmployeeLink();
		});
		
		And("^click on AddEmployee Button$", () -> 
		{
			employeePage.ClickonAddEmployeeButton();
		});
		
		And("^enter all the mandatory details$", () -> 
		{
			employeePage.EnterEmployeeId(finalEmpId);
			employeePage.EnterDisplayName(finalDisplayName);
			employeePage.EnterEmployeeEmail(finalEmailId);
			employeePage.EnterOrganizationUnit
			(ExcelFileReader.getCellValue("Employee.xlsx", "Employee_Detail", 2, "D"));
			employeePage.EnterEmployeeUserName(finalUserName);
			employeePage.calenderBtnClick(2019,03,10);
		});

		And("^click on Save Employee button$", () -> 
		{
             employeePage.ClickOnSaveButton();
		});
		
		When("^enter the name of employeename which you want to search in the list$", () -> 
		{
		    employeePage.EnterSearchField(ExcelFileReader.getCellValue("Employee.xlsx","Employee_Detail",2,"B"));
		});

		
		Then("^click on search button$", () -> 
		{
			employeePage.ClickOnSearchButton();
		});

		Then("^verify added Employee$", () -> 
		{
			//employeePage.verifyData();
			employeePage.EnterSearchField(finalEmpId);
			employeePage.ClickOnSearch();
			employeePage.VerifySearchEmployee();
		});

//		
//		Then("^click on actionlink$", () -> {
//		    employeePage.ClickonACtions();
//		});
//
//		
//		Then("^click on suspendlink$", () -> {
//		    employeePage.ClickOnSuspend();
//		    employeePage.ClickOnConfirm();
//		});
//
//		
//		Then("^on click of actions link acivelink should display$", () -> {
//		    employeePage.ClickonACtions();
//		    employeePage.VerifyActiveLink();
//		});


	}

}
