package stepdefs;

import config.ExcelFileReader;
import cucumber.api.java8.En;
import pageObjects.CreateKpiPage;
import pageObjects.HomePage;
import pageObjects.PerformanceProgramPage;
import pageObjects.SwitchUserPage;
import util.TestContext;

public class MeasureKPIOnceStepDefinition implements En {

	TestContext testContext;
	CreateKpiPage createKpi;
	HomePage homePage;
	SwitchUserPage switchuserPage;
	PerformanceProgramPage performancePage;
	
	public MeasureKPIOnceStepDefinition(TestContext testContext) throws Exception {
		this.testContext = testContext;
		this.createKpi = testContext.getPageObjectManager().getCreateKpiPage();
		this.homePage = testContext.getPageObjectManager().getHomePage();
		this.performancePage = testContext.getPageObjectManager().getPerforamceProgram();
		this.switchuserPage = testContext.getPageObjectManager().getSwitchUserPage();
		
		
//		String pName = ExcelFileReader.getCellValue
//				("programdata.xlsx", "Create_Program",2, "A");
//		String progrmName = pName+"_"+ConfigFileReader.getExecutionRunCount();
//		String empCode = ExcelFileReader.getCellValue
//				("COBAutomation.xlsx", "Employee", 2, "A");
//		String supervisor = ExcelFileReader.getCellValue
//				("COBAutomation.xlsx", "Employee", 3, "A");
//		String verifier = ExcelFileReader.getCellValue
//				("COBAutomation.xlsx", "Employee", 4, "A");
		
		
		When("^Click on createMyKpi-Once button and create individual and Measurekpi's$", () -> 
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
					createKpi.howOftenNeedToUpdateActual("Once (For whole program duration)");
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
		
		/*When("^Once \\(For whole program duration\\) program should be submit for review$", () -> 
		{
			homePage.clickOnthingToknow();
			homePage.clickOnThingsToDo();
//			homePage.ClickSubmitYourPerformance();
			homePage.Click_UpdatePerformanceLabel();
			performancePage.Click_PeriodActualComments();
			performancePage.Text_EnterActual("50");
			performancePage.TextEditSubmitPerformanceComment("achieved");
			performancePage.clickOnCommentSaveButton();
			performancePage.submitSubmitPerformance();
			performancePage.TextEdit_submitReivewComment("review submitted");
			performancePage.clicksubmitReviewSubmitButton();

		});

		Then("^supervisor will approve Once \\(For whole program duration\\) review scorecard$", () -> 
		{
			switchuserPage.clickprofilebanner();
			homePage.ClickBackToMeLink();
			switchuserPage.clickprofilebanner();
			switchuserPage.clickSwitchUser();
			switchuserPage.SearchForUser(supervisor);
			switchuserPage.searchForUser.sendKeys(Keys.DOWN);
			switchuserPage.SelectUserFromDropdown(supervisor);
			switchuserPage.clickswitchuser();
			homePage.Click_verifyReviewPerformanceLabel();
			performancePage.ClickSupervisorActualComments();
			performancePage.TextEditSubmitPerformanceComment("supervisor actual comments");
			performancePage.clickOnCommentSaveButton();
			performancePage.clickOnNext();
			//			performancePage.overAllPerformanceDropdown(1);
			performancePage.Text_OverallPerformanceReviewFeedback("satisfied");
			performancePage.ApprovePerformanceReviewButton();
			performancePage.TextEdit_submitReivewComment("Approved from supervisor");
			performancePage.clickBtn_OkConfirm();

		});

		And("^verifier will approve Once \\(For whole program duration\\) review scorecard$", () -> 
		{

			switchuserPage.clickprofilebanner();
			homePage.ClickBackToMeLink();
			switchuserPage.clickprofilebanner();
			switchuserPage.clickSwitchUser();
			switchuserPage.SearchForUser(verifier);
			switchuserPage.searchForUser.sendKeys(Keys.DOWN);
			switchuserPage.SelectUserFromDropdown(verifier);
			switchuserPage.clickswitchuser();
			performancePage.ClickVerifyTheirPerformanceLabel();
			performancePage.clickOnNext();
			performancePage.clickBtn_VerifyPerformanceReview();
			performancePage.TextEdit_submitReivewComment("Approved from verifier");
			performancePage.clickBtn_OkConfirm();
			//			performancePage.Click_PerformanceReview();
			//			performancePage.clickBtn_VerifyPerformanceReview();
			//			performancePage.TextEdit_submitReivewComment("Approved from verifier");
			//			performancePage.clickBtn_OkConfirm();

		});

		And("^Employee will verify Once \\(For whole program duration\\) Scorecard published Label$", () -> 
		{
			switchuserPage.clickprofilebanner();
			homePage.ClickBackToMeLink();
			switchuserPage.clickprofilebanner();
			switchuserPage.clickSwitchUser();
			switchuserPage.SearchForUser(empCode);
			switchuserPage.searchForUser.sendKeys(Keys.DOWN);
			switchuserPage.SelectUserFromDropdown(empCode);
			switchuserPage.clickswitchuser();
			homePage.clickOnthingToknow();
			homePage.ClickOnpublish();
			performancePage.Click_reviewPublished();
			performancePage.Click_kpiMatrix();
			homePage.VerifyScorecardPublishedLabel1();

		});*/
}}