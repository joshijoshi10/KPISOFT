package stepdefs;

import pageObjects.DBConnection;
import pageObjects.ForgotPasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MailTrapPage;
import pageObjects.SwitchUserPage;
import util.ManagerUtil;
import util.TestContext;
import config.ExcelFileReader;
import cucumber.api.java8.En;

public class ForgotPasswordStepDefinition implements En{
	
	TestContext testContext;
    LoginPage loginPage;
    HomePage homePage;
    ForgotPasswordPage forgotPage;
    MailTrapPage mailTrapPage;
    DBConnection dbConnect;
    SwitchUserPage switchuserPage;

    public ForgotPasswordStepDefinition(TestContext testContext) {
        this.testContext = testContext;
        this.loginPage = testContext.getPageObjectManager().getLoginPage();
        this.forgotPage = testContext.getPageObjectManager().getForgotPasswordPage();
        this.mailTrapPage = testContext.getPageObjectManager().getMailTrapPage();
        this.dbConnect = testContext.getPageObjectManager().getdbConnectionPage();
		this.switchuserPage = testContext.getPageObjectManager().getSwitchUserPage();

        String validUser = ExcelFileReader.getCellValue("Employee.xlsx", "Reset_Password",3, "A");
        String oldPwd = ExcelFileReader.getCellValue("Employee.xlsx", "Reset_Password",3, "B");
        String newPwd = ExcelFileReader.getCellValue("Employee.xlsx", "Reset_Password",3, "C");
        String subject = "Change your password";
        
        When("^click on forgot password$", () -> {
        	
        	forgotPage.forgotPassword();
        	
        });

        Then("^Enter Username or Email$", () -> {
        	
        	forgotPage.email(validUser);
        	
        });
        
        When("^Click on Send ResetEmail$", () -> {
        	
        	forgotPage.sendResetMail();
        	
        });
        
        Then("^Open MailTrap Url$", () -> {
        	
        	mailTrapPage.goToMailTrapPage();
        	
        });

//       When("^Enter mailTrap username and password$", () -> {
//        	mailTrapPage.email(validUser);
//        	mailTrapPage.password(validPwd);
//        });
//
//        Then("^Click on Login button$", () -> {
//        	mailTrapPage.signin();
//        });
//
//       When("^Click on Demo Inbox$", () -> {
////        	mailTrapPage.clickOnDemoInbox();
//        	mailTrapPage.clickOnRefresh();
//        	
//        });
        
        Then("^Click on Active mail and subject$", () -> {
            
        	mailTrapPage.getFirstMail(validUser,subject);
        }); 

       Then("^Click on Resetpassword link$", () -> {
    	   
        	mailTrapPage.getResetPasswordLink();
        });

        And("^Verify Reset password Window$", () -> {
        	
        	forgotPage.switchToNewWindow();
        	ManagerUtil.waitFor(5000);
            mailTrapPage.changeUrlEnter();
        	forgotPage.verifyResetpasswordWindow();
        	
        });

        When("^Enter New Password and re-enter Password$", () -> {
        	
        	forgotPage.getNewPasword(newPwd);
        	forgotPage.getNewReEnterPasword(newPwd);
        	
        });

        Then("^Click on reset Password button$", () -> {
        	
        	forgotPage.clickOnResetPassword();
        });
        
        When("^user enters Username and Password$", () -> {
        	
        	loginPage.txtBx_Username(validUser);
        	loginPage.txtBx_password(newPwd);
        	
        });
       
        
        When("^logout and close browser$", () -> {
        	
        	switchuserPage.logOut();

        });
        
        
        When("^reset back to old password$", () -> {
        	
        	forgotPage.forgotPassword();
        	forgotPage.email(validUser);
        	forgotPage.sendResetMail();
        	mailTrapPage.goToMailTrapPage();
        	mailTrapPage.getFirstMail(validUser,subject);
        	mailTrapPage.getResetPasswordLink();
        	ManagerUtil.waitFor(5000);
        	forgotPage.switchToNewWindow();
            mailTrapPage.changeUrlEnter();
        	forgotPage.verifyResetpasswordWindow();
        	forgotPage.getNewPasword(oldPwd);
        	forgotPage.getNewReEnterPasword(oldPwd);
        	forgotPage.clickOnResetPassword();
        	loginPage.txtBx_Username(validUser);
        	loginPage.txtBx_password(oldPwd);
        	loginPage.clickSubmitButton();
        	switchuserPage.logOut();
        });
    	
//        Then("^change the url$", () -> {
//        	mailTrapPage.changeUrlEnter();
        	
//        });
//        Then("^click on delete messages$", () -> {
//        	mailTrapPage.clickOnDelete();
//        });

    }
}
