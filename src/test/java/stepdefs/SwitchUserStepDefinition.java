package stepdefs;

import org.openqa.selenium.Keys;

import cucumber.api.java8.En;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SwitchUserPage;
import util.TestContext;

public class SwitchUserStepDefinition implements En {
	TestContext testContext;
	LoginPage loginPage;
	HomePage homePage;
	SwitchUserPage switchuserPage;

	public SwitchUserStepDefinition(TestContext testContext) {
		this.testContext = testContext;
		this.loginPage = testContext.getPageObjectManager().getLoginPage();
		this.homePage = testContext.getPageObjectManager().getHomePage();
		this.switchuserPage = testContext.getPageObjectManager().getSwitchUserPage();

		When("^Click on user image in Banner$", () -> {
			switchuserPage.clickprofilebanner();
		});
		When("^validate the switch user option in the dropdown menu$", () -> {
			switchuserPage.validateswitchuser();
		});
		When("^click on Switch User in dropdown menu$", () -> {
			switchuserPage.clickSwitchUser();
		});

		Then("^Select the user and click on switch user button$", () -> {
			switchuserPage.SearchForUser("EMP12");
			switchuserPage.searchForUser.sendKeys(Keys.DOWN);
			switchuserPage.SelectUserFromDropdown("EMP12");
//			switchuserPage.clickuser("EMP12");//as per configuration
			switchuserPage.clickswitchuser();
		});

		When("^Click on Back to me in dropdown menu$", () -> {

			switchuserPage.clickbcktome();
		});

		Then("^Select again the user and click on switch user button$", () -> {
			switchuserPage.SearchForUser("AutoEmp10");
			switchuserPage.searchForUser.sendKeys(Keys.DOWN);
			switchuserPage.SelectUserFromDropdown("AutoEmp10");
//			switchuserPage.clickuser("AutoEmp10");//as per configuaration
			switchuserPage.clickswitchuser();
		});

	}
}
