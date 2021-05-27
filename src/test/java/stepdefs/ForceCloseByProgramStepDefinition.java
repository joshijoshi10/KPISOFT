package stepdefs;

import config.ConfigFileReader;
import config.ExcelFileReader;
import cucumber.api.java8.En;
import pageObjects.CloneKpiPage;
import pageObjects.CreateKpiPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PerformanceProgramListPage;
import pageObjects.PerformanceProgramMonitorPage;
import pageObjects.PerformanceProgramPage;
import pageObjects.SwitchUserPage;
import util.TestContext;

public class ForceCloseByProgramStepDefinition implements En {

	TestContext testContext;
	HomePage homePage;
	LoginPage loginPage;
	SwitchUserPage switchuserPage;
	PerformanceProgramListPage performanceProgramListPage;
	PerformanceProgramPage performancePage;
	CreateKpiPage createKpi;
	CloneKpiPage cloneKpi;
	ConfigFileReader configFileReader;
	PerformanceProgramMonitorPage performanceProgramMonitorPage;


	public ForceCloseByProgramStepDefinition(TestContext testContext) throws Exception {
		this.testContext = testContext;
		this.homePage = testContext.getPageObjectManager().getHomePage();
		this.performancePage = testContext.getPageObjectManager().getPerforamceProgram();
		this.switchuserPage = testContext.getPageObjectManager().getSwitchUserPage();
		this.performanceProgramListPage = testContext.getPageObjectManager().getPerformanceProgramListPage();
		this.createKpi = testContext.getPageObjectManager().getCreateKpiPage();
		this.performanceProgramMonitorPage = testContext.getPageObjectManager().getPerformanceProgramMonitorPage();
        this.loginPage = testContext.getPageObjectManager().getLoginPage();


		String empCode = ExcelFileReader.getCellValue
				("COBAutomation.xlsx", "Employee", 2, "A");
		String empPwd = "AutoEmp801_123";


		Given("^force close by program$", () -> 
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

		Given("^Verify for Scorecard published Label after force close$", () -> 
		{
			performancePage.clickOnHomeImg();
//			switchuserPage.clickprofilebanner();
//			switchuserPage.clickSwitchUser();
//			switchuserPage.SearchForUser(empCode);
//			switchuserPage.searchForUser.sendKeys(Keys.DOWN);
//			switchuserPage.SelectUserFromDropdown(empCode);
//			switchuserPage.clickswitchuser();
			switchuserPage.logOut();
        	loginPage.txtBx_Username(empCode);
        	loginPage.txtBx_password(empPwd);
        	loginPage.clickSubmitButton();
			homePage.clickOnthingToknow();
			homePage.clickOnpublish();
			homePage.verifyScorecardPublishedLabel();
			
		}); 
	}
}