package stepdefs;

	import config.ExcelFileReader;
	import cucumber.api.java8.En;
	import pageObjects.CreateKpiPage;
	import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PerformanceProgramListPage;
	import pageObjects.PerformanceProgramMonitorPage;
	import pageObjects.PerformanceProgramPage;
	import pageObjects.SwitchUserPage;
	import util.TestContext;

	public class ResetScorecardStepDefinition_48 implements En {

		TestContext testContext;
		HomePage homePage;
		LoginPage loginPage;
		SwitchUserPage switchuserPage;
		PerformanceProgramListPage performanceProgramListPage;
		PerformanceProgramPage performancePage;
		CreateKpiPage createKpi;
		PerformanceProgramMonitorPage performanceProgramMonitorPage;
		
		
		public ResetScorecardStepDefinition_48(TestContext testContext) throws Exception {
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
			String verifier = ExcelFileReader.getCellValue
					("COBAutomation.xlsx", "Employee", 4, "A");
			String empPwd = "AutoEmp801_123";
			
			Then("^Reset scorecard from Approve Scorecard to Scorecard Created$", () -> 
			{
				switchuserPage.logOut();
	            loginPage.enter_Username();
	            loginPage.enter_Password();
	            loginPage.clickSubmitButton();
				homePage.getDropDownMenuButton();
				performanceProgramListPage.goToPerformanceProgramPage();
				try {
					performancePage.findProgramName();
				} catch (Exception e) {
					e.printStackTrace();
				}
				performanceProgramMonitorPage.click_EmployeeNameFromList();
				performanceProgramMonitorPage.clickOnResetScorecard();
				performanceProgramMonitorPage.resetToScorecardCreated();
				performanceProgramMonitorPage.txt_CommentReason(verifier);
				performanceProgramMonitorPage.clickOnChange();
				homePage.doLogoutwithConfirm();
			});
			
			And("^Verify for Create Scorecard Label$", () -> {
				loginPage.txtBx_Username(empCode);
				loginPage.txtBx_password(empPwd);
				loginPage.clickSubmitButton();
				homePage.resubmit_scorecard_lbl();
				createKpi.verifyCreateScorecardLable();
				
			});
		}
	}
