package stepdefs;

import config.ExcelFileReader;
import cucumber.api.java8.En;
import pageObjects.CheckInCreationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import util.TestContext;

public class CheckInStepDefinition implements En {

	TestContext testContext;
	LoginPage loginPage;
	HomePage homePage;
	CheckInCreationPage checkinPage;

	public CheckInStepDefinition(TestContext testContext) {
		this.testContext = testContext;
		this.loginPage = testContext.getPageObjectManager().getLoginPage();
		this.homePage = testContext.getPageObjectManager().getHomePage();
		this.checkinPage = testContext.getPageObjectManager().getCheckInCreationPage();

		When("^Click on CheckIn menu link$", () -> {
			checkinPage.getCheckInLink();
		});
		When("^Click on Add Checkin$", () -> {
			checkinPage.addCheckin();
		});
		Then("^It should navigate to Create CheckIn Program Page$", () -> {
			checkinPage.validateCreateCheckinProgramPageHeading();
		});
		Then("^Basic Information page should be loaded$", () -> {
			checkinPage.validateforBasicInformation();
			System.out.println("*******Basic Information is validated**********");
		});
		When("^Enter all field on Basic Information page$", () -> {
			checkinPage.programName(ExcelFileReader.getCellValue("Checkin.xlsx", "CheckinData", 2, "A"));
			System.out.println("*******Check in name is entered**********");
			checkinPage.startDate();
			System.out.println("*******start date is entered**********");
			checkinPage.endDate();
			System.out.println("*******end date is entered**********");
		//	checkinPage.howOftenDoYouWantYourEmployeesToCheckIn(
				//	ExcelFileReader.getCellValue("Checkin.xlsx", "CheckinData", 2, "B"));
		//	checkinPage.whichDayOfTheWeekDoYouWantThemToCheckIn();
			System.out.println("*******period is seleceted **********");
			checkinPage.clickOnContinue();
			System.out.println("*******clicked on continue in Baisc Info page**********");
		});
		Then("^Template page Should Load$", () -> {
			checkinPage.validateforTemplate();
		});
		When("^Enter all field on Template page and click on save$", () -> {
			//checkinPage.selectTemplate();
			//checkinPage.includeSelfRating();
			//checkinPage.addCharacterLimit(ExcelFileReader.getCellValue("Checkin.xlsx", "CheckinData", 2, "C"));
			checkinPage.clickOnSave();
			System.out.println("*******Selected Self Star and clicked on Save in Baisc Info page**********");
		});
		When("^Click on ellipsis of a checkIn Program$", () -> {
			
			checkinPage.clickOnEllipsis();
			System.out.println("*******clicked on three dots**********");
		});
		Then("^click on Start button$", () -> {
			checkinPage.clickOnStart();
			System.out.println("*******clicked on Start checkin **********");
		});
		Then("^Choose Which employees you want to start program$", () -> {
			checkinPage.ChooseWhichemployeesyouwanttostartprogram();
		});
		Then("^Click on validate Start program$", () -> {
			checkinPage.clickOnValidateStartProgram();
			checkinPage.clickonStartProgram();
			System.out.println("*******clicked on validate and start program **********");
		});
	}

}
