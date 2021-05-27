package stepdefs;

import org.openqa.selenium.Keys;

import config.ExcelFileReader;
import cucumber.api.java8.En;
import pageObjects.HomePage;
import pageObjects.ProfilePage;
import pageObjects.SwitchUserPage;
import util.TestContext;

public class ProfileStepDefinition implements En{

		TestContext testContext;
		HomePage homePage;
		SwitchUserPage switchuserPage;
		ProfilePage profilePage;
		
		public ProfileStepDefinition(TestContext testContext) throws Exception {
			this.testContext = testContext;
			this.homePage = testContext.getPageObjectManager().getHomePage();
			this.switchuserPage = testContext.getPageObjectManager().getSwitchUserPage();
			this.profilePage = testContext.getPageObjectManager().getProfilePage();
	
			
			String empCode = ExcelFileReader.getCellValue
					("COBAutomation.xlsx", "Employee", 2, "A");
			
			When("^Click on Menu > Profile$", () -> {
				switchuserPage.clickprofilebanner();
				switchuserPage.clickSwitchUser();
				switchuserPage.SearchForUser(empCode);
				switchuserPage.searchForUser.sendKeys(Keys.DOWN);
				switchuserPage.SelectUserFromDropdown(empCode);
				switchuserPage.clickswitchuser();
				homePage.getProfileDropDownMenuButton();
			});

			Then("^verify status of all scorecard with KPI's$", () -> {
				
//				profilePage.SelectCardToDownload("Review Completed");
				profilePage.SelectCardToDownload("Scorecard Created");
//				profilePage.SelectCardToDownload("Update Due");

				
			});

			Then("^Click on download button and click on pdf report$", () -> {
				
//				profilePage.ClickOnDownloadArrow();
				
			});

			Then("^Click on download button, and click on excel report$", () -> {

//				profilePage.ClickOnDownloadArrow();
				
			});
		}}