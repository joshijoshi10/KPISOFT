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

public class PerformanceProgramStepDefinition implements En {

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


	public PerformanceProgramStepDefinition(TestContext testContext) throws Exception {
		this.testContext = testContext;
		this.homePage = testContext.getPageObjectManager().getHomePage();
		this.performancePage = testContext.getPageObjectManager().getPerforamceProgram();
		this.switchuserPage = testContext.getPageObjectManager().getSwitchUserPage();
		this.performanceProgramListPage = testContext.getPageObjectManager().getPerformanceProgramListPage();
		this.createKpi = testContext.getPageObjectManager().getCreateKpiPage();
		this.performanceProgramMonitorPage = testContext.getPageObjectManager().getPerformanceProgramMonitorPage();
		this.loginPage = testContext.getPageObjectManager().getLoginPage();


		String pName = ExcelFileReader.getCellValue
				("programdata.xlsx", "Create_Program",2, "A");
		String progrmName = pName+"_"+ConfigFileReader.getExecutionRunCount();
		String empCode = ExcelFileReader.getCellValue
				("COBAutomation.xlsx", "Employee", 2, "A");
		String empPwd = "AutoEmp801_123";
		String addUnenrolledEmployee = ExcelFileReader.getCellValue
				("COBAutomation.xlsx", "Employee", 5, "C");
		String supervisor = ExcelFileReader.getCellValue
				("COBAutomation.xlsx", "Employee", 3, "A");
		String supPwd = "AutoEmp802_123";
		String verifier = ExcelFileReader.getCellValue
				("COBAutomation.xlsx", "Employee", 4, "A");
		String verPwd = "AutoEmp803_123";


		Given("^Validate if it navigates to Create performance Program$", () -> 
		{
			performanceProgramListPage.goToPerformanceProgramPage();
		});

		When("^Click on Create Program Button$", () -> 
		{
			performancePage.getCreateProgram();
		});

		Then("^It should navigate to Create Performance Program Page$", () -> 
		{
			performancePage.validateCreatePerformanceProgramPageHeading();
		});

		And("^Program Details page should be loaded$", () -> 
		{
			performancePage.validateProgramDetailPage();
		});

		When("^Enter all manditory fields on Program detail page$", () -> 
		{
			try {
				performancePage.enterValueProgramNameText(progrmName);
			} catch (Exception e) {
				e.printStackTrace();
			}
			performancePage.setStartDate(Integer
					.parseInt(ExcelFileReader.getCellValue(
							"programdata.xlsx", "Create_Program", 2,
							"B")), Integer.parseInt(ExcelFileReader
									.getCellValue("programdata.xlsx", "Create_Program",
											2, "C")), Integer.parseInt(ExcelFileReader
													.getCellValue("programdata.xlsx", "Create_Program",
															2, "D")));
			performancePage.setEndDate(Integer.parseInt(ExcelFileReader
					.getCellValue("programdata.xlsx", "Create_Program",
							2, "E")), Integer.parseInt(ExcelFileReader
									.getCellValue("programdata.xlsx", "Create_Program",
											2, "F")), Integer.parseInt(ExcelFileReader
													.getCellValue("programdata.xlsx", "Create_Program",
															2, "G")));

			performancePage.selectModel(ExcelFileReader.getCellValue(
					"programdata.xlsx", "Create_Program", 2, "H"));
			performancePage.Dd_approvalStage_click();
			performancePage.NumberOfApprovalStages(2);
			performancePage.NumberOfReviewStages(2);
			performancePage.approvalStageConfiguration(ExcelFileReader.getCellValue(
					"programdata.xlsx", "Create_Program", 2,
					"I"));
			performancePage.reviewStageConfiguration(Integer
					.parseInt(ExcelFileReader.getCellValue(
							"programdata.xlsx", "Create_Program", 2,
							"J")));
			performancePage.FirstLevelWorkFlow(ExcelFileReader.getCellValue(
					"programdata.xlsx", "Create_Program", 2,
					"K"));
		});

		And("^Click on continue button on Program detail page$", () -> 
		{
			performancePage.clickOnContinue();
		});

		Then("^Program configuration page should load$", () -> 
		{
			performancePage.validateProgramConfiguration();
		});

		When("^Enter all manditory field on Program configuration page$", () -> 
		{
			performancePage.enterMinKpiBox(ExcelFileReader.getCellValue(
					"programdata.xlsx", "Create_Program", 2, "L"));
			performancePage.enterMaxKpiBox(ExcelFileReader.getCellValue(
					"programdata.xlsx", "Create_Program", 2, "M"));
			performancePage.clickOnMTD();
			//			performancePage.clickOnYTD();
			performancePage.enterMinWeightageKpi(ExcelFileReader.getCellValue(
					"programdata.xlsx", "Create_Program", 2, "N"));
			performancePage.enterMaxWeightageKpi(ExcelFileReader.getCellValue(
					"programdata.xlsx", "Create_Program", 2, "O"));
		});

		And("^Click on Advance Setting an fill all the fields$", () -> {
			performancePage.clickOnAdvanceSetting();
			performancePage
			.ratio_Core_and_individual_KPI(ExcelFileReader
					.getCellValue("programdata.xlsx",
							"Create_Program", 2, "P"));
			performancePage
			.max_Initiative_Kpi_Weightage(ExcelFileReader
					.getCellValue("programdata.xlsx",
							"Create_Program", 2, "Q"));
			performancePage.allowQualityRating(Integer
					.parseInt(ExcelFileReader.getCellValue(
							"programdata.xlsx", "Create_Program", 2,
							"R")));
			performancePage.selectTemplates(200, Integer
					.parseInt(ExcelFileReader.getCellValue(
							"programdata.xlsx", "Create_Program", 2,
							"S")));
			performancePage.selectStrategy(ExcelFileReader.getCellValue(
					"programdata.xlsx", "Create_Program", 2,
					"T"));
			performancePage.attachmentMandatory();
			performancePage.allowToReject();
			performancePage.aggregateTeamScore();
			performancePage.userCommentMand();
		});

		And("^Click on continue button on Program configuration page$", () -> 
		{
			performancePage.clickOnContinue();
		});

		Then("^Program Scale page should load$", () -> 
		{
			performancePage.validationForScalePage();
		});

		When("^Enter all field on Scale page$",
				() -> {
					performancePage.clickOnAddMore();

					for (int i = 1; i <= 6; i++) {
						String levelName = ExcelFileReader.getCellValue(
								"programdata.xlsx", "Scale", i, "A");
						String score = ExcelFileReader.getCellValue(
								"programdata.xlsx", "Scale", i, "B");
						String levelDesc = ExcelFileReader.getCellValue(
								"programdata.xlsx", "Scale", i, "C");
						String pot = ExcelFileReader.getCellValue(
								"programdata.xlsx", "Scale", i, "D");
						String color = ExcelFileReader.getCellValue(
								"programdata.xlsx", "Scale", i, "E");
						performancePage.enterScaleData(i, levelName, score,
								levelDesc, pot, color);
					}
					performancePage.clickOnDeleteButton();
				});

		And("^Click on continue button on Program configuration$", () -> 
		{
			performancePage.clickOnContinue();
		});

		Then("^Save program button by clicking save button$", () -> 
		{
			performancePage.clickOnSaveButton();
		});

		Then("^to verify created Program$", () -> 
		{

			try {
				performancePage.verifycreatedProgram();
				performancePage.findProgramName();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		When("^Click On Action more option and select Start from drop down$", () ->
		{
			performancePage.clickActionButton();
			performancePage.clickStartButton();

		});

		Then("^Program Start Details page should be loaded$", () ->
		{
			performancePage.validateStartProgramPage();
		});

		When("^Select Include Everyone,Include Everyone Except,Include everyone in one by one$", () ->
		{
			//	performancePage.selectIncludeEveryoneExcept();
			performancePage.selectIncludeEveryoneIn();
			performancePage.textEditEnterEmployeeCode(ExcelFileReader
					.getCellValue("COBAutomation.xlsx", "Employee",
							2, "C"));
		});

		And("^Click on Do not have employee codes link$", () ->
		{
			//	performancePage.clickdonot_have_employee_codes();
			performancePage.clickOnValidateAndStart();
		});

		Then("^it should navigate to employee Employee Advanced Search$", () ->
		{
			//	performancePage.verifyforEmployeeAdvanceSearchPage();
		});

		When("^Verify all the field of filter$", () ->
		{
			// performancePage.clickOnFilter();
			// performancePage.clickOnIncludeEmployeeCode("EMP6");
			// performancePage.clickOnExcludeEmplloyeeCode("EMP3");
			// performancePage.clickOnDesignationDD();
			// performancePage.clickOnDesSearch("Temporary");
			// ManagerUtil.waitFor(200);
			// performancePage.clickOnDesCheckBox();
			// performancePage.clickOnGradeDD();
			// performancePage.clickOngradeSearch("G1");
			// ManagerUtil.waitFor(200);
			// performancePage.clickOngradeCheckBox();
			// performancePage.clickOnCatogeryDD();
			// performancePage.clickOncatogerySearch("Management");
			// ManagerUtil.waitFor(200);
			// performancePage.clickOncatogeryCheckBox();
			// performancePage.clickOnApply();
		});

		And("^Start the performance program$", () ->
		{
			performancePage.clickOnStart();
			performancePage.clickonconfirm();
			//	performancePage.verifyStartProgram();			
		});

		Then("^Validate and trigger review$", () ->
		{
			performancePage.clickActionButton();
			performancePage.clickTriggerReview();
			//	performancePage.clickTriggerNewReview();
			performancePage.setEndDateCal(Integer.parseInt(ExcelFileReader
					.getCellValue("programdata.xlsx", "Create_Program",
							4, "E")), Integer.parseInt(ExcelFileReader
									.getCellValue("programdata.xlsx", "Create_Program",
											4, "F")), Integer.parseInt(ExcelFileReader
													.getCellValue("programdata.xlsx", "Create_Program",
															4, "G")));
			performancePage.clickValidateAndTriggerReview();
		});

		When("^Validate if create scorecard widget is listed under all I need to do$", () -> 
		{
			performancePage.clickOnHomeImg();
			switchuserPage.logOut();
			loginPage.txtBx_Username(empCode);
			loginPage.txtBx_password(empPwd);
			loginPage.clickSubmitButton();
			homePage.clickOnCreateYourOwnScorecardByProgranName(progrmName);
		});

		Then("^Employee verifies create KPI's$", () ->
		{
			createKpi.verifyCreateScorecardLable();

		});

		When("^Click on createMyKpi button and create individual and Measurekpi$", () -> 
		{
//			for (int i = 1; i < 8; i++) {
				for (int i = 1; i <= 8; i++) {
				createKpi.clickOnCreateMyKpi();

				String kpiName = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", i + 1, "A");
				String description = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", i + 1, "B");
				String perspectiveName = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", i + 1, "C");
				String weightage = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", i + 1, "D");
				String target = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", i + 1, "E");
				String howoften = ExcelFileReader.getCellValue("CreateKpi.xlsx", "KpiData", i + 1, "F");
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
					createKpi.howOftenNeedToUpdateActual(howoften);
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

		Then("^Supervisor verifies the Scorecard$", () -> 
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

		And("^Verifier verifies the scorecard$", () -> 
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

		And("^Employee publishes the scorecard$", () -> 
		{
			switchuserPage.logOut();
			loginPage.txtBx_Username(empCode);
			loginPage.txtBx_password(empPwd);
			loginPage.clickSubmitButton();
			homePage.clickOnthingToknow();
			homePage.clickOnpublish();
		});

		And("^verifies for scorecard published label$", () -> 
		{
			homePage.verifyScorecardPublishedLabel();

		});


		When("^program should be submit for review$", () -> 
		{
			homePage.clickOnthingToknow();
			homePage.clickOnThingsToDo();
			homePage.clickSubmitYourPerformance();
			performancePage.click_PeriodActualComments();
			performancePage.text_EnterActual("50");
			performancePage.textEditSubmitPerformanceComment("achieved");
			performancePage.clickOnCommentSaveButton();
			performancePage.submitSubmitPerformance();
			performancePage.textEdit_submitReivewComment("review submitted");
			performancePage.clicksubmitReviewSubmitButton();		

		});

		Then("^supervisor will approve review scorecard$", () -> 
		{
			switchuserPage.logOut();
			loginPage.txtBx_Username(supervisor);
			loginPage.txtBx_password(supPwd);
			loginPage.clickSubmitButton();
			homePage.click_verifyReviewPerformanceLabel();
			performancePage.clickSupervisorActualComments();
			performancePage.textEditSubmitPerformanceComment("supervisor actual comments");
			performancePage.clickOnCommentSaveButton();
			performancePage.clickOnNext();
			//			performancePage.overAllPerformanceDropdown(1);
			performancePage.text_OverallPerformanceReviewFeedback("satisfied");
			performancePage.approvePerformanceReviewButton();
			performancePage.textEdit_submitReivewComment("Approved from supervisor");
			performancePage.clickBtn_OkConfirm();

		});

		And("^verifier will approve review scorecard$", () -> 
		{
			switchuserPage.logOut();
			loginPage.txtBx_Username(verifier);
			loginPage.txtBx_password(verPwd);
			loginPage.clickSubmitButton();
			performancePage.clickVerifyTheirPerformanceLabel();
			performancePage.clickOnNext();
			performancePage.clickBtn_VerifyPerformanceReview();
			performancePage.textEdit_submitReivewComment("Approved from verifier");
			performancePage.clickBtn_OkConfirm();

		});

		And("^Employee will verify Scorecard published Label$", () -> 
		{
			switchuserPage.logOut();
			loginPage.txtBx_Username(empCode);
			loginPage.txtBx_password(empPwd);
			loginPage.clickSubmitButton();
			homePage.clickOnthingToknow();
			homePage.clickOnpublish();
			performancePage.click_reviewPublished();
			performancePage.click_kpiMatrix();
			homePage.verifyScorecardPublishedLabel1();

		});

		And("^Add unenrolled employees$", () -> {
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
			performanceProgramMonitorPage.addEmployeeToProgram(addUnenrolledEmployee);
		});

	}
}
