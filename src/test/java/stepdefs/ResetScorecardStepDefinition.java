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

	public class ResetScorecardStepDefinition implements En{

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
		
		
		public ResetScorecardStepDefinition(TestContext testContext) throws Exception {
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
			String supervisor = ExcelFileReader.getCellValue
					("COBAutomation.xlsx", "Employee", 3, "A");
			String supPwd = "AutoEmp802_123";
			String verifier = ExcelFileReader.getCellValue
					("COBAutomation.xlsx", "Employee", 4, "A");
			String verPwd = "AutoEmp803_123";

			
			When("^Verifier shall not approve review scorecard$", () -> 
			{
				switchuserPage.logOut();
				loginPage.txtBx_Username(verifier);
				loginPage.txtBx_password(verPwd);
				loginPage.clickSubmitButton();
				performancePage.clickVerifyPerformanceLabel();
				performancePage.clickOnNext();
				performancePage.clickBtn_VerifyPerformanceReview();
				performancePage.textEdit_submitReivewComment("satisfied");
				performancePage.clickBtn_OkConfirm();
				
			});
			
			Given("^Reset for pending approval$", () -> {
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
				performanceProgramMonitorPage.textEdit_filterToSearch(empCode);
				performanceProgramMonitorPage.actions_dropDown();
				performanceProgramMonitorPage.reset_btn();
				performanceProgramMonitorPage.resetToPendingAproval();
				performanceProgramMonitorPage.txt_CommentReason("Not achieved");
				performanceProgramMonitorPage.clickOnChange();

			});
			
			And("^Verify for Approve Scorecard Label$", () -> {
				homePage.doLogoutwithConfirm();
				loginPage.txtBx_Username(supervisor);
				loginPage.txtBx_password(supPwd);
				loginPage.clickSubmitButton();
				homePage.clickOnReviewTheirScorecard();
				performancePage.verifyApproveScorecardLabel();
			
			});
		}
	}
