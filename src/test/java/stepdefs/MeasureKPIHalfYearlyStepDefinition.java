package stepdefs;

import config.ConfigFileReader;
import config.ExcelFileReader;
import cucumber.api.java8.En;
import pageObjects.CreateKpiPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PerformanceProgramPage;
import pageObjects.SwitchUserPage;
import util.TestContext;

public class MeasureKPIHalfYearlyStepDefinition implements En {

	TestContext testContext;
	CreateKpiPage createKpi;
	HomePage homePage;
	LoginPage loginPage;
	PerformanceProgramPage performancePage;
	SwitchUserPage switchuserPage;
	
	public MeasureKPIHalfYearlyStepDefinition(TestContext testContext) throws Exception {
		this.testContext = testContext;
		this.createKpi = testContext.getPageObjectManager().getCreateKpiPage();
		this.homePage = testContext.getPageObjectManager().getHomePage();
		this.performancePage = testContext.getPageObjectManager().getPerforamceProgram();
		this.switchuserPage = testContext.getPageObjectManager().getSwitchUserPage();
        this.loginPage = testContext.getPageObjectManager().getLoginPage();

		
		String pName = ExcelFileReader.getCellValue
				("programdata.xlsx", "Create_Program",2, "A");
		String progrmName = pName+"_"+ConfigFileReader.getExecutionRunCount();
		String empCode = ExcelFileReader.getCellValue
				("COBAutomation.xlsx", "Employee", 2, "A");
		String empPwd = "AutoEmp801_123";
		String supervisor = ExcelFileReader.getCellValue
				("COBAutomation.xlsx", "Employee", 3, "A");
		String supPwd = "AutoEmp802_123";
		String verifier = ExcelFileReader.getCellValue
				("COBAutomation.xlsx", "Employee", 4, "A");
		String verPwd = "AutoEmp803_123";

		
		When("^Enter all manditory fields on Measurekpi-HalfYearly Program detail page$", () -> 
		{
			try {
				performancePage.enterValueProgramNameText(progrmName);
			} catch (Exception e) {
				e.printStackTrace();
			}
			performancePage.setStartDate(Integer
					.parseInt(ExcelFileReader.getCellValue(
							"programdata.xlsx", "Create_Program", 6,
							"B")), Integer.parseInt(ExcelFileReader
									.getCellValue("programdata.xlsx", "Create_Program",
											6, "C")), Integer.parseInt(ExcelFileReader
													.getCellValue("programdata.xlsx", "Create_Program",
															6, "D")));
			performancePage.setEndDate(Integer.parseInt(ExcelFileReader
					.getCellValue("programdata.xlsx", "Create_Program",
							6, "E")), Integer.parseInt(ExcelFileReader
									.getCellValue("programdata.xlsx", "Create_Program",
											6, "F")), Integer.parseInt(ExcelFileReader
													.getCellValue("programdata.xlsx", "Create_Program",
															6, "G")));

			performancePage.selectModel(ExcelFileReader.getCellValue(
					"programdata.xlsx", "Create_Program", 2, "H"));
			performancePage.Dd_approvalStage_click();
			performancePage.NumberOfApprovalStages(2);
			performancePage.NumberOfReviewStages(2);
			/*performancePage.approvalStageConfiguration(ExcelFileReader.getCellValue(
					"programdata.xlsx", "Create_Program", 2,
					"I"));
			performancePage.reviewStageConfiguration(Integer
					.parseInt(ExcelFileReader.getCellValue(
							"programdata.xlsx", "Create_Program", 2,
							"J")));
			performancePage.FirstLevelWorkFlow(ExcelFileReader.getCellValue(
					"programdata.xlsx", "Create_Program", 2,
					"K"));*/
		});
		
		When("^Click on createMyKpi-HalfYearly button and create individual and Measurekpi's$", () -> 
		{
			for (int i = 1; i < 2; i++) {
				//for (int i = 1; i <= 8; i++) {
				createKpi.clickOnCreateMyKpi();

				String kpiName = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", i + 1, "A");
				String description = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", i + 1, "B");
				String perspectiveName = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", i + 1, "C");
				String weightage = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", i + 1, "D");
				String target = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", i + 1, "E");
//				String howoften = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", i + 1, "F");
				String mytargetAddsUp = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", i + 1, "G");
				String uom = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", i + 1, "H");
				createKpi.getKpiName(kpiName);
				createKpi.getDescription(description);
				createKpi.getWeightage(weightage);
				createKpi.clickOnNext();				
				createKpi.getPerspective(perspectiveName);

				createKpi.getUom(uom);
				if (!uom.equalsIgnoreCase("Date")) {
					createKpi.getTarget(target);
				} else {
					createKpi.getDateTarget(
							Integer.parseInt(ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", 2, "I")),
							Integer.parseInt(ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", 2, "J")),
							Integer.parseInt(ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", 2, "K")));
				}
				for (int j = 1; j <= 5; j++) {
					if (!uom.equalsIgnoreCase("Date")) {
						String scaledata = ExcelFileReader.getCellValue("CreateKpi.xlsx", "ScaleData", j + 1, "A");
						createKpi.getscaleData(j, scaledata);
					} else {
						createKpi.getscaleDataInDate(j,
								Integer.parseInt(ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", j + 2, "I")),
								Integer.parseInt(ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", j + 2, "J")),
								Integer.parseInt(ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", j + 2, "K")));
					}
				}
				if (!uom.equalsIgnoreCase("Date")) 
				{

					createKpi.clickOnNext();
					createKpi.howOftenNeedToUpdateActual("Half Yearly");
					createKpi.getMyTargetsAddsUp(mytargetAddsUp);
				} else {
					System.out.println("It's Date Base kpi!!");
				}
				createKpi.clickOnCreateKpi();
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			createKpi.clickOnSubmitScorecard();
			createKpi.clickOnSubmit();
		});
		
		When("^program should be submited for half-yearly review$", () -> 
		{
			homePage.clickOnthingToknow();
			homePage.clickOnThingsToDo();
			homePage.clickSubmitYourPerformance();
//			homePage.Click_UpdatePerformanceLabel();
			performancePage.select_Period(4);
			performancePage.click_PeriodActualComments();
			performancePage.text_EnterActual("50");
			performancePage.textEditSubmitPerformanceComment("achieved");
			performancePage.clickOnCommentSaveButton();
			performancePage.submitSubmitPerformance();
			performancePage.textEdit_submitReivewComment("review submitted");
			performancePage.clicksubmitReviewSubmitButton();
		});
		
		Then("^supervisor will approve Measurekpi-halfYearly review scorecard$", () -> 
		{	
			switchuserPage.logOut();
        	loginPage.txtBx_Username(supervisor);
        	loginPage.txtBx_password(supPwd);
        	loginPage.clickSubmitButton();
			homePage.click_verifyReviewPerformanceLabel();
			performancePage.select_verifierPeriod(4);
			performancePage.clickSupervisorActualComments();
//			performancePage.Text_EnterActual("50");
			performancePage.textEditSubmitPerformanceComment("supervisor comments");
			performancePage.clickOnCommentSaveButton();
			performancePage.clickOnNext();
			//performancePage.overAllPerformanceDropdown(1);
			performancePage.text_OverallPerformanceReviewFeedback("satisfied");
			performancePage.approvePerformanceReviewButton();
			performancePage.textEdit_submitReivewComment("Approved from supervisor");
			performancePage.clickBtn_OkConfirm();

		});
		
		And("^verifier will approve Measurekpi-halfYearly review scorecard$", () -> 
		{
			switchuserPage.logOut();
        	loginPage.txtBx_Username(verifier);
        	loginPage.txtBx_password(verPwd);
        	loginPage.clickSubmitButton();
			performancePage.clickVerifyTheirPerformanceLabel();
			performancePage.select_verifierPeriod(4);
			performancePage.clickOnNext();
			performancePage.clickBtn_VerifyPerformanceReview();
			performancePage.textEdit_submitReivewComment("Approved from verifier");
			performancePage.clickBtn_OkConfirm();

		});
		
		And("^Employee will verify Measurekpi-halfYearly Scorecard published Label$", () ->
		{
			switchuserPage.logOut();
        	loginPage.txtBx_Username(empCode);
        	loginPage.txtBx_password(empPwd);
        	loginPage.clickSubmitButton();
			homePage.clickOnthingToknow();
			homePage.clickOnpublish();
			performancePage.select_verifierPeriod(4);
			performancePage.Verify_reviewPublishedLabel();
//			performancePage.Click_reviewPublished();
//			performancePage.Click_kpiMatrix();
//			homePage.VerifyScorecardPublishedLabel1();

		});
}}