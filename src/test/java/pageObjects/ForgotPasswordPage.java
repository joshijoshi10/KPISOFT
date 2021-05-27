package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import config.ConfigFileReader;
import helper.LoggerHelper;

public class ForgotPasswordPage extends BasePage {


	public ForgotPasswordPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Forgot Password')]")
	private WebElement forgotPwd_lkn;

	@FindBy(how = How.ID, using = "float-input")
	private WebElement email_lkn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Send reset email')]")
	private WebElement sendResetMail_Btn;

	// Reset password window

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Reset password?')]")
	private WebElement resetPassword_lbl;

	@FindBy(how = How.ID, using = "newPassword")
	private WebElement newPassword_txt;

	@FindBy(how = How.ID, using = "reEnterPassword")
	private WebElement reEnterPassword_txt;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Reset Password')]")
	private WebElement resetPassword_btn;

	public void forgotPassword() {
		try {
			log.info("Entered forgotPassword");
			log.info("Clicking forgotPwd_lkn");
			click(forgotPwd_lkn);
			log.info("Clicked forgotPwd_lkn");
			log.info("Executed forgotPassword Successfully");
		} catch (Exception e) {
			log.error("Executed forgotPassword Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void email(String email) {
		try {
			log.info("Entered email");
			log.info("Typing email" + email);
			writeText(email_lkn, email);
			log.info("Typed email" + email);
			log.info("Executed email Successfully");
		} catch (Exception e) {
			log.error("Executed email Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void sendResetMail() {
		try {
			log.info("Entered sendResetMail");
			log.info("Clicking sendResetMail_Btn");
			click(sendResetMail_Btn);
			log.info("Clicked sendResetMail_Btn");
			waitFor(1000);
			log.info("Executed sendResetMail Successfully");
		} catch (Exception e) {
			log.error("Executed sendResetMail Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void verifyResetpasswordWindow() {
		try {
			log.info("Entered verifyResetpasswordWindow");
			log.info("Asserting resetPassword_lbl is Reset password?");
			Assert.assertEquals(resetPassword_lbl.getText(), "Reset password?",
					"Failed to verify reset password window.");
			log.info("Asserted resetPassword_lbl is Reset password?");
			log.info("Executed verifyResetpasswordWindow Successfully");
		} catch (Exception e) {
			log.error("Executed verifyResetpasswordWindow Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void switchToNewWindow() {
		try {
			log.info("Entered switchToNewWindow");
			log.info("Switching to new window/tab");
			getWindowHandle(webDriver);
			log.info("Switched to new window/tab");
			log.info("Executed switchToNewWindow Successfully");
		} catch (Exception e) {
			log.error("Executed switchToNewWindow Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getNewPasword(String newpwd) {
		try {
			log.info("Entered getNewPasword");
			log.info("Typing newPassword_txt = " + newpwd);
			writeText(newPassword_txt, newpwd);
			log.info("Typed newPassword_txt = " + newpwd);
			log.info("Executed getNewPasword Successfully");
		} catch (Exception e) {
			log.error("Executed getNewPasword Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getNewReEnterPasword(String newrepwd) {
		try {
			log.info("Entered getNewReEnterPasword");
			log.info("Writing reEnterPassword_txt = " + newrepwd);
			writeText(reEnterPassword_txt, newrepwd);
			log.info("Written reEnterPassword_txt = " + newrepwd);
			log.info("Executed getNewReEnterPasword Successfully");
		} catch (Exception e) {
			log.error("Executed getNewReEnterPasword Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnResetPassword() {
		try {
			log.info("Entered clickOnResetPassword");
			log.info("Clicking clickOnResetPassword" + resetPassword_btn);
			click(resetPassword_btn);
			log.info("Clicked clickOnResetPassword" + resetPassword_btn);
			log.info("Executed clickOnResetPassword Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnResetPassword Not Successfully");
			e.printStackTrace();
			throw e;
		}

	}

}
