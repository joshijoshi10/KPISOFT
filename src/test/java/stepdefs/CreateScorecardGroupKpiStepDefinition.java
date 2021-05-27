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

public class CreateScorecardGroupKpiStepDefinition implements En {

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
	
	
	public CreateScorecardGroupKpiStepDefinition(TestContext testContext) throws Exception {
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
		String supervisor = ExcelFileReader.getCellValue
				("COBAutomation.xlsx", "Employee", 3, "A");
		String supPwd = "AutoEmp802_123";
		String verifier = ExcelFileReader.getCellValue
				("COBAutomation.xlsx", "Employee", 4, "A");
		String verPwd = "AutoEmp803_123";

		
		When("^Click on createGroupKpi button and create Groupkpi$", () ->
		{	
			createKpi.clickOnCreateGroupKpi();
			createKpi.getGroupKpiName(ExcelFileReader.getCellValue("CreateKpi.xlsx", "GroupKpiData", 2, "A"));
			createKpi.getGroupDescription(ExcelFileReader.getCellValue("CreateKpi.xlsx", "GroupKpiData", 2, "B"));
			createKpi.getGroupWeightage(ExcelFileReader.getCellValue("CreateKpi.xlsx", "GroupKpiData", 2, "C"));
			createKpi.clickOnCreate();
		});
		
		And("^Click on createMyKpi button and create Measurekpi$", () ->
		{
			createKpi.clickOnCreateMyKpi();

			String kpiName = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", 2, "A");
			String description = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", 2, "B");
			String weightage = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", 2, "D");
//			String perspectiveName = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", 2, "C");
			String groupkpiName = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", 2, "L");
			String uom = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", 8, "H");			
//			String howoften = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", 10, "F");
//			String mytargetAddsUp = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", 2, "G");
			createKpi.getKpiName(kpiName);
			createKpi.getDescription(description);
			createKpi.getWeightage(weightage);
			createKpi.clickOnNext();
			// createKpi.getPerspective(perspectiveName);
			createKpi.getParentGroupKpiName(groupkpiName);
			createKpi.getUom(uom);
			createKpi.setTargetDate(Integer
					.parseInt(ExcelFileReader.getCellValue(
							"programdata.xlsx", "Create_Program", 3,
							"B")), Integer.parseInt(ExcelFileReader
									.getCellValue("programdata.xlsx", "Create_Program",
											3, "C")), Integer.parseInt(ExcelFileReader
													.getCellValue("programdata.xlsx", "Create_Program",
															3, "D")));
			//createKpi.getTarget(target);
//			for (int j = 1; j <= 5; j++) {
//				String scaledata = ExcelFileReader.getCellValue("CreateKpi.xlsx", "ScaleData", j + 1, "A");
//				createKpi.getscaleData(j, scaledata);
//		}
//			createKpi.clickOnNext();
//			createKpi.howOftenNeedToUpdateActual(howoften);
//			createKpi.getMyTargetsAddsUp(mytargetAddsUp);
			createKpi.clickOnCreateKpi();
			createKpi.clickOnSubmitScorecard();
			createKpi.clickOnSubmit();
		});
		
		Then("^Supervisor verifies the Scorecard for groupKPI$", () -> 
		{
			switchuserPage.logOut();
			loginPage.txtBx_Username(supervisor);
			loginPage.txtBx_password(supPwd);
			loginPage.clickSubmitButton();
			homePage.clickOnReviewTheirScorecard();
			homePage.acceptButton();
			homePage.clickApproveAllButton();
			homePage.writeShareMessage("achieved");
			homePage.okConfirmButton();
		});
		
		And("^Verifier verifies the scorecard for groupKPI$", () -> 
		{
			switchuserPage.logOut();
			loginPage.txtBx_Username(verifier);
			loginPage.txtBx_password(verPwd);
			loginPage.clickSubmitButton();
			homePage.clickOnverifyTheirScorecard();
			homePage.clickOnVerifyAllBtn();
			homePage.writeShareMessage("verified");
			homePage.okConfirmButton();
		});
		
		And("^User Verifies Group kpi in All I need to do$", () -> 
		{
			switchuserPage.logOut();
        	loginPage.txtBx_Username(empCode);
        	loginPage.txtBx_password(empPwd);
        	loginPage.clickSubmitButton();
			homePage.Verify_UpdatePerformanceLabel();
			
		});
		
	}
}
