package stepdefs;

import config.ConfigFileReader;
import config.ExcelFileReader;
import cucumber.api.java8.En;
import pageObjects.EmployeePage;
import pageObjects.HomePage;
import pageObjects.PerformanceProgramListPage;
import pageObjects.PerformanceProgramMonitorPage;
import pageObjects.PerformanceProgramPage;
import pageObjects.SwitchUserPage;
import util.TestContext;

public class EditRelationshipStepDefinition implements En{
	TestContext testContext;
	HomePage homePage;
	SwitchUserPage switchuserPage;
	PerformanceProgramListPage performanceProgramListPage;
	PerformanceProgramPage performancePage;
	ConfigFileReader configFileReader;
	PerformanceProgramMonitorPage performanceProgramMonitorPage;
	EmployeePage employeePage;
	
	public EditRelationshipStepDefinition(TestContext testContext) throws Exception {
		this.testContext = testContext;
		this.homePage = testContext.getPageObjectManager().getHomePage();
		this.performancePage = testContext.getPageObjectManager().getPerforamceProgram();
		this.switchuserPage = testContext.getPageObjectManager().getSwitchUserPage();
		this.performanceProgramListPage = testContext.getPageObjectManager().getPerformanceProgramListPage();
		this.performanceProgramMonitorPage = testContext.getPageObjectManager().getPerformanceProgramMonitorPage();
		this.employeePage = testContext.getPageObjectManager().getemployeepage();

		String employeeId = ExcelFileReader.getCellValue
				("Employee.xlsx", "Employee_Detail", 2, "A");
		String finalEmpId = employeeId+"_"+ConfigFileReader.getExecutionRunCount();
		String empCode = ExcelFileReader.getCellValue
				("COBAutomation.xlsx", "Employee", 10, "C");
		String supervisor = ExcelFileReader.getCellValue
				("COBAutomation.xlsx", "Employee", 12, "C");
		String verifier = ExcelFileReader.getCellValue
				("COBAutomation.xlsx", "Employee", 13, "C");
//		String resetSupervisor = ExcelFileReader.getCellValue
//				("COBAutomation.xlsx", "Employee", 11, "C");
//		String resetVerifier = ExcelFileReader.getCellValue
//				("COBAutomation.xlsx", "Employee", 12, "C");
		
		
		And("^Click Employee for the created Program$", () ->
		{
			try {
				performancePage.findProgramName();
			} catch (Exception e) {
				e.printStackTrace();
			}
			performanceProgramMonitorPage.click_EmployeeNameFromList();
		
		});
		
		And("^Edit the supervisor and verifier for that User$", () ->
		{
			performanceProgramMonitorPage.clickOnChangeApprover();
			performanceProgramMonitorPage.enterPrimaryApprover(supervisor);
			performanceProgramMonitorPage.enterSecondaryApprover(verifier);
			performanceProgramMonitorPage.enterChangeApproverComments("changed..");
			performanceProgramMonitorPage.clickChangeApproverSave();
		
		});
		
		And("^Verify for supervisor and verifier is changed in User login$", () ->
		{
			employeePage.ClickOnEmployeeLink();
			employeePage.EnterSearchField(empCode);
			employeePage.ClickOnSearch();
			employeePage.ClickonACtions();
			employeePage.ClickOnEditProfile();
			employeePage.Verify_SupervisorID();
			employeePage.Verify_VerifierID();
		});
		
		And("^update the supervisor and verifier in the Employee page$", () -> {

			employeePage.ClickOnEmployeeLink();
			employeePage.EnterSearchField(finalEmpId);
			employeePage.ClickOnSearch();
			employeePage.ClickonACtions();
			employeePage.ClickOnEditProfile();
			performanceProgramMonitorPage.enterPrimaryApprover(supervisor);
			performanceProgramMonitorPage.enterSecondaryApprover(verifier);
			employeePage.ClickOnUpdateButton();
		});
		
		/*And("^verify for supervisor and verifier added in the Employee page$", () -> {	
			employeePage.EnterSearchField(finalEmpId);
			employeePage.ClickOnSearch();
			employeePage.ClickonACtions();
			employeePage.ClickOnEditProfile();
			employeePage.Verify_SupervisorID();
			employeePage.Verify_VerifierID();
		
		});*/
	}
}