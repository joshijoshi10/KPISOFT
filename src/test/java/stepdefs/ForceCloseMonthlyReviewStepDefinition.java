package stepdefs;

import config.ConfigFileReader;
import cucumber.api.java8.En;
import pageObjects.CloneKpiPage;
import pageObjects.CreateKpiPage;
import pageObjects.HomePage;
import pageObjects.PerformanceProgramListPage;
import pageObjects.PerformanceProgramMonitorPage;
import pageObjects.PerformanceProgramPage;
import pageObjects.SwitchUserPage;
import util.TestContext;

public class ForceCloseMonthlyReviewStepDefinition implements En {

	TestContext testContext;
	HomePage homePage;
	SwitchUserPage switchuserPage;
	PerformanceProgramListPage performanceProgramListPage;
	PerformanceProgramPage performancePage;
	CreateKpiPage createKpi;
	CloneKpiPage cloneKpi;
	ConfigFileReader configFileReader;
	PerformanceProgramMonitorPage performanceProgramMonitorPage;


	public ForceCloseMonthlyReviewStepDefinition(TestContext testContext) throws Exception {
		this.testContext = testContext;
		this.homePage = testContext.getPageObjectManager().getHomePage();
		this.performancePage = testContext.getPageObjectManager().getPerforamceProgram();
		this.switchuserPage = testContext.getPageObjectManager().getSwitchUserPage();
		this.performanceProgramListPage = testContext.getPageObjectManager().getPerformanceProgramListPage();
		this.createKpi = testContext.getPageObjectManager().getCreateKpiPage();
		this.performanceProgramMonitorPage = testContext.getPageObjectManager().getPerformanceProgramMonitorPage();


//		String empCode = ExcelFileReader.getCellValue
//				("COBAutomation.xlsx", "Employee", 2, "C");

		
		Given("^force close by user$", () -> 
		{
			switchuserPage.clickprofilebanner();
			homePage.ClickBackToMeLink();
			switchuserPage.clickprofilebanner();
			homePage.getDropDownMenuButton();
			performanceProgramListPage.goToPerformanceProgramPage();
			try {
				performancePage.findProgramName();
			} catch (Exception e) {
				e.printStackTrace();
			}
			performanceProgramMonitorPage.click_EmployeeNameFromList();
			performanceProgramMonitorPage.Link_forceClose();
			performanceProgramMonitorPage.Confirm_popUpBtn();
		});

		
	}
}