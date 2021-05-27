package parallelSteps;

import cucumber.api.java8.En;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import util.ManagerUtil;
import util.TestContext;

public class LoginStepDefinition implements En {

    TestContext testContext;
    LoginPage loginPage;
    HomePage homePage;

    public LoginStepDefinition(TestContext testContext) {
        this.testContext = testContext;
        this.loginPage = testContext.getPageObjectManager().getLoginPage();
        this.homePage = testContext.getPageObjectManager().getHomePage();
        
        Given("^navigate to target url$", () -> {
        	loginPage.goToLoginPage();
        });

        When("^user logs in as an admin in the target environment$", () -> {
           loginPage.enter_Username();
           loginPage.enter_Password();
        });

        And("^user clicks submit button$", () -> {
        	loginPage.clickSubmitButton();
        });

        Then("^Home page should be displayed$", () -> {
        	ManagerUtil.waitFor(2000);
        });

        And("^Navigate to HR tool box$", () -> {
        	homePage.getDropDownMenuButton();
        });

        And("^admin logout and close browser$", () -> {
        	 homePage.doLogoutwithConfirm();
        });
        
    }
}
