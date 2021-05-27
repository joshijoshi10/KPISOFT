package stepdefs;

import config.ExcelFileReader;
import cucumber.api.java8.En;
import pageObjects.CheckInCreationPage;
import pageObjects.CustomerOnBoardingPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProgramManagement;
import util.TestContext;

public class ProgramManagementStepDefinition implements En {

	TestContext testContext;
	LoginPage loginPage;
	HomePage homePage;
	CheckInCreationPage checkinPage;
	ProgramManagement program;
	CustomerOnBoardingPage customeronboadring;


	public ProgramManagementStepDefinition(TestContext testContext) {
		this.testContext = testContext;
		this.program = testContext.getPageObjectManager().getProgramManagement();
		this.loginPage = testContext.getPageObjectManager().getLoginPage();
		this.homePage = testContext.getPageObjectManager().getHomePage();
		this.checkinPage = testContext.getPageObjectManager().getCheckInCreationPage();
		this.customeronboadring=testContext.getPageObjectManager().getCustomerOnBoardingPage();

		String empCode1 = ExcelFileReader.getCellValue
				("Checkin.xlsx", "Program", 6, "A");
		String empCode2 = ExcelFileReader.getCellValue
				("Checkin.xlsx", "Program", 7, "A");
		
		When("^User click on More Menu box$", () -> {
			program.getProgramManagement();
			System.out.println("Clicked on More Menu");

		});

		When("^user clicks on Program Management under dropdown$", () -> {

			System.out.println("Clicked on Program management");

		});

		When("^User clicks on Create Program$", () -> {
			program.clickOnCreateProgram();
			System.out.println("Clicked on Created Program");
		});

		Then("^Create Program displays and User enters all the mandatory Details$", () -> {
			program.enterProgramDetails(ExcelFileReader.getCellValue("Checkin.xlsx", "Program", 2, "A"));
			program.enterDates();
			program.clickOnAddDeliverables(ExcelFileReader.getCellValue("Checkin.xlsx", "Program", 2, "A"));
			System.out.println("*******Mandatory details added**********");
		});

		Then("^User clicks on Next button$", () -> {
			program.clickonNextbutton();
			System.out.println("clicked on next button");

		});

		Then("^User should be able to see and click on Add Owner button$", () -> {
			program.addowner();
			System.out.println("clicked on Addowner button");
		});

		Then("^User enters the employee and Selects the Employee entered$", () -> {
			program.searchOnwer(empCode1);
			// program.SearchOnwer(ExcelFileReader.getCellValue("Checkin.xlsx", "Program",
			// 6, "A"));

			System.out.println("*******Searched Owner**********");

		});
		
		Then("^User enters the employee and Selects the Employee entered!$", () -> {
			program.searchOnwer(empCode2);
			// program.SearchOnwer(ExcelFileReader.getCellValue("Checkin.xlsx", "Program",
			// 6, "A"));

			System.out.println("*******Searched Owner**********");

		});
		

		Then("^user Clicks on Create button$", () -> {
			program.createButton();

		});

		Then("^User should be able to see Created Program Management Page and Click on View Details$", () -> {
			program.clickOnViewDetails();
			System.out.println("*******Clicked on View Details button **********");
		});

		Then("^User should be able to see and Click on Edit Icon$", () -> {
			program.clickOnEditDetails();
			System.out.println("*******Clicked on edit Details button **********");
		});

		When("^User is on edit page click on Risks Tab$", () -> {
			program.clickRiskTab();
			System.out.println("*******Clicked on Risk TAB  **********");
		});

		Then("^User clicks on Add Risk button$", () -> {
			program.clickAddRisk();
			System.out.println("*******Clicked on  Add Risk button  **********");
		});

		Then("^User is populates all Mandatory details in Add Risk page$", () -> {
			program.addRiskDetails(ExcelFileReader.getCellValue("Checkin.xlsx", "Program", 3, "A"));

			System.out.println("******All mandatory fields in Add Risk added **********");
		});

		Then("^user clicks on Add button$", () -> {
			program.clickAddRiskPage();
			System.out.println("*******Clicked on  Add Risk button  **********");
			System.out.println("*******Risk Related Details Added on clicking Add button  **********");
		});

		Then("^User click on Issues TAb$", () -> {
			program.clickIssuesTab();
			System.out.println("*******Clicked on Issues TAB  **********");
		});

		Then("^User click on Add Issue button$", () -> {
			program.clickAddIssuesbutton();
			System.out.println("*******Clicked on  Add Issue button  **********");

		});

		Then("^User is populates all Mandatory details in Add Issue page$", () -> {
			program.addIssuesDetails(ExcelFileReader.getCellValue("Checkin.xlsx", "Program", 4, "A"));
			System.out.println("******All mandatory fields in Add Issues added **********");

		});

		Then("^User should be able to Click on Delete Icon and Delete program$", () -> {
			program.clickOnDeleteProgram();

		});

		When("^user should naviagte back to Program Details page$", () -> {
			program.backtoProgramManagementDetails();

		});

		Then("^User should Click on Add Budget button$", () -> {
			program.clickonAddBudget();
		});

		Then("^User should be able to populate budget name and type$", () -> {
			program.clickonAddBudgetDetails(ExcelFileReader.getCellValue("Checkin.xlsx", "Program", 4, "A"), "OPEX");
		});

		Then("^User should be able to click on Next button$", () -> {
			program.clickonNextInAddBudget();
		});

		Given("^Period of Project User adds the Budget values$", () -> {
			program.enterBudgetCosts("2000", "3000");

		});

		Given("^User clicks on Add button to add budget values$", () -> {
			program.clickAddRiskPage();
		});

		Given("^the budget is added User clicks on Edit Icon for budget$", () -> {
			program.clickOnEdtitBudgetIcon();

		});

		Then("^User Updates or modifies values and Clicks on Next$", () -> {
			System.out.println("User Updates or modifies values and Clicks on Next");
		});

		Then("^User Updates the Budget  values and Clicks on Update button$", () -> {
			program.ClickOnUpdateBudget();
		});

		Then("^User Clicks on Delete Budget button$", () -> {
			program.clickOnDeleteBudgetIcon();
		});

		Then("^User Click should Click on Add Initaitive button$", () -> {
			program.clickOnCreateInitiative();
		});

		Then("^All Initiative Details$", () -> {

			program.addInitiativeDetails(ExcelFileReader.getCellValue("Checkin.xlsx", "Program", 4, "A"));

		});

		Then("^User Clicks on InitiativeCreated$", () -> {
			program.clickOnInitiativeCreated();

		});

		Given("^User is on Edit Initiative page modify the values required$", () -> {
			program.modifyInitiativeValues(ExcelFileReader.getCellValue("Checkin.xlsx", "Program", 3, "A"));
		});

		Then("^user clicks on Update button for inititaitive modified$", () -> {
			program.clickOnUpdateInitiative();
		});

		Given("^User has created initiative Click on Create MileStone button$", () -> {
			program.clickOnCreateMileStone();
		});

		Given("^User should be able to populate all the MileStone Details$", () -> {
			program.enterMileStoneDetails(ExcelFileReader.getCellValue("Checkin.xlsx", "Program", 3, "A"));
		});

		Then("^User enters the MileStone values for respective period$", () -> {
			program.enterMileStone("100");
		});

		Then("^User Updates or modifies MileStone values and Clicks on Next$", () -> {
			program.ClickOnEdtitMilestonetIcon();
			program.modifyMileStoneValue(ExcelFileReader.getCellValue("Checkin.xlsx", "Program", 4, "A"));
		});

		Then("^User Clicks on plus button for budget added$", () -> {

		});

		Then("^Click on Edit Icon  to Update Budget Spent values$", () -> {
			program.ClickOnEdtitBudgetSpentIcon();
		});

		Given("^User is able to see the Comments Icon and User sees a Post page$", () -> {
			program.clickOnCommentsAttachmentIcon();
		});

		Then("^User Adds a comment$", () -> {
			program.addCommentsForPost(ExcelFileReader.getCellValue("Checkin.xlsx", "Program", 3, "A"));

		});

		Then("^User chooses an attachment$", () -> {
//			program.clickOnChooseFileForPost();
			try {
				customeronboadring.UploadCobFile("src\\test\\resources\\Data\\QA\\COBAutomation.xlsx");
			} catch (Exception e) {
				e.printStackTrace();
			}

		});

		Then("^User clicks on Post button$", () -> {
			program.clickOnPostButton();
		});

		Then("^User Clicks on Confirm button in Confirmation POPUP$", () -> {
			program.clickOnConfirm();
		});

		Then("^User clicks on Publish button$", () -> {
			program.clickOnPublish_button();
		});

	}

}