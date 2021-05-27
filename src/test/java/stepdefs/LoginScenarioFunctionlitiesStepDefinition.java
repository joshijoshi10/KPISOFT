package stepdefs;

import config.ExcelFileReader;
import cucumber.api.java8.En;
import pageObjects.ForgotPasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MailTrapPage;
import pageObjects.SettingsPage;
import pageObjects.SwitchUserPage;
import util.TestContext;

public class LoginScenarioFunctionlitiesStepDefinition implements En {

    TestContext testContext;
    LoginPage loginPage;
    HomePage homePage;
    SwitchUserPage switchuserPage;
    SettingsPage settingsPage;
    ForgotPasswordPage forgotPage;
    MailTrapPage mailTrapPage;
    
    
    public LoginScenarioFunctionlitiesStepDefinition(TestContext testContext) {
        this.testContext = testContext;
        this.loginPage = testContext.getPageObjectManager().getLoginPage();
        this.homePage = testContext.getPageObjectManager().getHomePage();
		this.switchuserPage = testContext.getPageObjectManager().getSwitchUserPage();
		this.settingsPage = testContext.getPageObjectManager().getSettingsPage();

        String validUser = ExcelFileReader.getCellValue("Employee.xlsx", "Reset_Password",2, "A");
        String validPwd = ExcelFileReader.getCellValue("Employee.xlsx", "Reset_Password",2, "B");
        String invalidPwd = ExcelFileReader.getCellValue("Employee.xlsx", "Reset_Password",3, "B");
        String oldPwd = ExcelFileReader.getCellValue("Employee.xlsx", "Reset_Password",2, "B");
        String newPwd = ExcelFileReader.getCellValue("Employee.xlsx", "Reset_Password",2, "C");
        String reassign_oldPwd = ExcelFileReader.getCellValue("Employee.xlsx", "Reset_Password",2, "D");
        String reassign_newPwd = ExcelFileReader.getCellValue("Employee.xlsx", "Reset_Password",2, "E");

        
        When("^user enters invalid Username and Password$", () -> {
        
        	loginPage.txtBx_Username(validUser);
        	loginPage.txtBx_password(invalidPwd);
        });
        
        And("^user verifies error message$", () -> {
        	
//        	loginPage.clickOnLoginAndVerifyErrorMessage("Invalid Username or Password");

        });
        
        And("^user enters valid Username and Password$", ()-> {
        	
        	loginPage.goToLoginPage();
        	loginPage.txtBx_Username(validUser);
        	loginPage.txtBx_password(validPwd);
        	
        });
        
        And("^User click submit button$", () -> {
        	
        	loginPage.clickSubmitButton();

        });
        
        And("^user moves to settings$", () -> {
        	
        	switchuserPage.clickprofilebanner();
        	homePage.clickLnk_settings();
        	
        });

        And("^clicks on change password$", () -> {
        	
        	settingsPage.clickOnChangePassword();
        	
        });

        And("^enter the details$", () -> {
        	
        	settingsPage.enterOldPassword(oldPwd);
        	settingsPage.enterNewPassword(newPwd);
        	settingsPage.reEnterPassword(newPwd);
        	
        });
        
        And("^click on save password", ()-> {
        	settingsPage.clickOnSave();

        });
        

        Then("^user verifies success message$", () -> {

        	settingsPage.verifySuccessMessage("Password has been changed succesfully");
        	
        });

        And("^logout$", () -> {
        	
        	homePage.doLogout();
        });

        When("^user enters valid Username and new Password$", () -> {
        	
        	loginPage.txtBx_Username(validUser);
        	loginPage.txtBx_password(newPwd);

        });
        
        And("^user clicks on submit button$", () -> {
        	
        	loginPage.clickSubmitButton();
        	
        });

        Then("^set back to default password$", () -> {
        	
        	switchuserPage.clickprofilebanner();
        	homePage.clickLnk_settings();
        	settingsPage.clickOnChangePassword();
        	settingsPage.enterOldPassword(reassign_oldPwd);
        	settingsPage.enterNewPassword(reassign_newPwd);
        	settingsPage.reEnterPassword(reassign_newPwd);
        	settingsPage.clickOnSave();
        	homePage.doLogout();
        });

    }}