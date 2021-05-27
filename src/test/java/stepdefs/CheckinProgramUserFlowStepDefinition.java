package stepdefs;

import config.ExcelFileReader;
import cucumber.api.java8.En;
import pageObjects.CheckInCreationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SwitchUserPage;
import util.TestContext;

public class CheckinProgramUserFlowStepDefinition implements En {

	TestContext testContext;
	LoginPage loginPage;
	HomePage homePage;
	CheckInCreationPage checkinPage;
	SwitchUserPage switchuserPage;

	
	public CheckinProgramUserFlowStepDefinition(TestContext testContext) {
		this.testContext = testContext;
		this.loginPage = testContext.getPageObjectManager().getLoginPage();
		this.homePage = testContext.getPageObjectManager().getHomePage();
		this.checkinPage = testContext.getPageObjectManager().getCheckInCreationPage();
		this.switchuserPage = testContext.getPageObjectManager().getSwitchUserPage();


		String empCode1 = ExcelFileReader.getCellValue
				("COBAutomation.xlsx", "Employee", 14, "A");
		String empCode1Pwd = "AutoEmp10_123";
		String empCode2 = ExcelFileReader.getCellValue
				("COBAutomation.xlsx", "Employee", 15, "A");
		String empCode2Pwd = "Emp12_123";
		
		
		When("^Login with user EMP12$", () -> {
			
			switchuserPage.logOut();
        	loginPage.txtBx_Username(empCode2);
        	loginPage.txtBx_password(empCode2Pwd);
        	loginPage.clickSubmitButton();
        	
		});
		
		When("^Login with user EMP10$", () -> {
			
			switchuserPage.logOut();
        	loginPage.txtBx_Username(empCode1);
        	loginPage.txtBx_password(empCode1Pwd);
        	loginPage.clickSubmitButton();
        	
		});
		When("^Click on Thing to Do page$", () -> {
			
			homePage.clickOnThingsToDo();
		});
		
		Then("^Select the check-in program and click on it$", () -> {
			
			homePage.clickOnCheckInProgram();
		});
		
		Then("^Validate for check-in program name$", () -> {
			
			homePage.validateForCheckIn();
		});
		Then("^Fill all the value in check in Template$", () -> {

			homePage.writeOnHeadingone(ExcelFileReader.getCellValue("Checkin.xlsx", "UserFlow", 5, "A"));
			System.out.print("**********template text added************");

		});
		Then("^Give the self star and click on check -in button$", () -> {
			// homePage.clickOnStarRating(ExcelFileReader.getCellValue("Checkin.xlsx",
			// "UserFlow", 2, "D"));
			System.out.print("**********self rating given added*************");
			homePage.clickOnCheckinbutton();
			System.out.print("**********Check in clicked*************");
		});

		When("^Click on submited widget of check-in program$", () -> {
			homePage.clickOnSubmitWidget();
		});

		When("^Validate all field which filled by user$", () -> {
			homePage.validateforHeading();
			System.out.print("**********Heading valdiated*************");
		});

		When("^Enter the feedback and click on publish button$", () -> {
			homePage.provideFeedBack(ExcelFileReader.getCellValue("Checkin.xlsx", "UserFlow", 2, "E"));
			homePage.ClickOnpublishButton();
			System.out.print("**********Clicked on Checkin Published button*************");
			
		});

		When("^Click on Thing to Know page$", () -> {
			homePage.clickOnthingToknow();
		});

		When("^Click on supervisor reviewed widget$", () -> {
			homePage.clickOnreviewedCheckIn();
		});

		When("^Validate for supervisor feedback$", () -> {
			homePage.validateforfeedback(ExcelFileReader.getCellValue("Checkin.xlsx", "UserFlow", 2, "E"));
		});

		Then("^Validate whether card has been sent the supervisor$", () -> {
			
		});

	}

}
