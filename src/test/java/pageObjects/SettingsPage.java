package pageObjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;

import helper.LoggerHelper;

public class SettingsPage extends BasePage {
	String userName;
	String empId;
	String employeeEmail;

	public SettingsPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	WebDriverWait wait = new WebDriverWait(webDriver, 40);
	Logger log = LoggerHelper.getLogger(getClass());
	@FindBy(how = How.ID, using = "profile")
	private WebElement profile_dropDown;
	@FindBy(how = How.XPATH, using = "//a[@name='Tap Settings']")
	private WebElement settings_lnk;

	@FindBy(how = How.XPATH, using = "//div[@id='myTabContent']//div[@class='tab-pane fade show active']//h5")
	private WebElement activeTab_lbl;
	// my details
	@FindBy(how = How.XPATH, using = "//div[@class='username']//h5")
	private WebElement userName_homePage;

	@FindBy(how = How.XPATH, using = "(//div[@class='media-body text-truncate']//p)[1]")
	private WebElement empID_homePage;

	@FindBy(how = How.XPATH, using = "(//div[@class='media-body text-truncate']//p)[2]")
	private WebElement employeeEmail_homePage;

	@FindBy(how = How.XPATH, using = "(//p)[6]")
	private WebElement empId_settings;

	@FindBy(how = How.XPATH, using = "(//p)[8]")
	private WebElement employeeEmail_settings;

	@FindBy(how = How.ID, using = "my-details-tab")
	private WebElement myDetails_tab;

	// change password
	@FindBy(how = How.ID, using = "change-password-tab")
	private WebElement changePassword_tab;

	@FindBy(how = How.ID, using = "oldPassword")
	private WebElement oldPassword_txtfield;

	@FindBy(how = How.ID, using = "newPassword")
	private WebElement newPassword_txtfield;

	@FindBy(how = How.ID, using = "confirmPassword")
	private WebElement confirmPassword_txtfield;

	@FindBy(how = How.XPATH, using = "//button[@name='Submit Change Password']")
	private WebElement save_btn;
	
	@FindBy(how=How.XPATH, using="//a[@name='Tap Log Out']")
	private WebElement logout_btn;
	
	@FindBy(how=How.XPATH, using="//p[contains(text(),'Minimum Length')]//b")
	private WebElement minimumPassword_txt;
	
	@FindBy(how=How.XPATH, using="//p[contains(text(),'Maximum Length')]//b")
	private WebElement maximumPassword_text;
	
	@FindBy(how=How.XPATH, using="//p[contains(text(),'Minimum Capital Letter')]//b")
	private WebElement minimumCaps_text;
	
	@FindBy(how=How.XPATH, using="//p[contains(text(),'Minimum Lower Letter')]//b")
	private WebElement minimumLower_text;
	
	@FindBy(how=How.XPATH, using="//p[contains(text(),'Minimum Number')]//b")
	private WebElement minimumNumber_txt;
	
	@FindBy(how=How.XPATH, using="//p[contains(text(),'Minimum Special Character')]//b")
	private WebElement minSpecialChar_text;

	public void clickOnSettings() {
		try {
			log.info("Entered clickOnSettings");
			log.info("Clicking profile_dropDown");
			click(profile_dropDown);
			log.info("Clicking settings_lnk");
			click(settings_lnk);
			log.info("Executed clickOnSettings");
		} catch (Exception e) {
			log.error("Executed clickOnSettings");
			e.printStackTrace();
			throw e;
		}
	}

	public boolean verifyActiveLabel(String expected) {
		try {
			log.info("Entered verifyActiveLabel");
			log.info("Executed verifyActiveLabel");
		if (activeTab_lbl.getText().trim().equalsIgnoreCase(expected))
			return true;
		else
			return false;

		} catch (Exception e) {
			log.error("Executed verifyActiveLabel");
			e.printStackTrace();
			throw e;
		}
	}

	public void getEmployeeDetailsFromHomePage() {
		try {
			log.info("Entered getEmployeeDetailsFromHomePage");
			userName = userName_homePage.getText().trim();
			empId = empID_homePage.getText().trim();
			employeeEmail = employeeEmail_homePage.getText().trim();
			log.info("Executed getEmployeeDetailsFromHomePage");
		} catch (Exception e) {
			log.error("Executed getEmployeeDetailsFromHomePage");
			e.printStackTrace();
			throw e;
		}
	}

	public boolean verifyMyDetails() {

		try {
			log.info("Entered verifyMyDetails");
			if (empId_settings.getText().trim().equals(empId)
					&& (employeeEmail_settings.getText().trim().equals(employeeEmail))) {
				log.info("Executed verifyMyDetails");
				return true;
			} else {
				log.info("Executed verifyMyDetails");
				return false;
			}

		} catch (Exception e) {
			log.error("Executed verifyMyDetails");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnMyDetails() {

		try {
			log.info("Entered clickOnMyDetails");
			log.info("clicking on my details");
			click(myDetails_tab);
			log.info("clicked on my details");
			log.info("Executed clickOnMyDetails");
		} catch (Exception e) {
			log.error("Executed clickOnMyDetails");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnChangePassword() {
		try {
			log.info("Entered clickOnChangePassword");
			log.info("clicking on change password!!");
			click(changePassword_tab);
			log.info("clicked on change password!!");
			log.info("Executed clickOnChangePassword");
		} catch (Exception e) {
			log.error("Executed clickOnChangePassword");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterOldPassword(String password) {
		try {
			log.info("Entered enterOldPassword");
			log.info("entering  old pwd" + password);
			writeText(oldPassword_txtfield, password);
			log.info("entered old pwd" + password);
			log.info("Executed enterOldPassword");
		} catch (Exception e) {
			log.error("Executed enterOldPassword");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterNewPassword(String password) {
		try {
			log.info("Entered enterNewPassword");
			log.info("entering  new pwd" + password);
			writeText(newPassword_txtfield, password);
			log.info("entered new pwd" + password);
			log.info("Executed enterNewPassword");
		} catch (Exception e) {
			log.error("Executed enterNewPassword");
			e.printStackTrace();
			throw e;
		}
	}

	public void reEnterPassword(String password) {
		try {
			log.info("Entered reEnterPassword");
			log.info("re-entering  new pwd" + password);
			writeText(confirmPassword_txtfield, password);
			log.info("re-entering new pwd" + password);
			log.info("Executed reEnterPassword");
		} catch (Exception e) {
			log.error("Executed reEnterPassword");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnSave() {
		try {
			log.info("Entered clickOnSave");
			log.info("clicking on save");
			waitFor(3000);
			click(save_btn);
			log.info("clicked on save");
			log.info("Executed clickOnSave");
		} catch (Exception e) {
			log.error("Executed clickOnSave");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnLogout() {
		try {
			log.info("Entered clickOnLogout");
			log.info("clicking on logout!!");
			click(profile_dropDown);
			click(logout_btn);
			log.info("clicked on logout!!");
			log.info("Executed clickOnLogout");
		} catch (Exception e) {
			log.error("Executed clickOnLogout");
			e.printStackTrace();
			throw e;
		}
	}

	public String getMinimumPasswordLength() {
		try {
			log.info("Entered getMinimumPasswordLength");
			log.info("Executed getMinimumPasswordLength");
			return minimumPassword_txt.getText().trim();
		} catch (Exception e) {
			log.error("Executed getMinimumPasswordLength");
			e.printStackTrace();
			return null;
		}
	}

	public String getMaximumPasswordLength() {
		try {
			log.info("Entered getMaximumPasswordLength");
			log.info("Executed getMaximumPasswordLength");
			return maximumPassword_text.getText().trim();
		} catch (Exception e) {
			log.error("Executed getMaximumPasswordLength");
			e.printStackTrace();
			return null;
		}
	}

	public String getMinimumCapitalLetterLength() {
		try {
			log.info("Entered getMinimumCapitalLetterLength");
			log.info("Executed getMinimumCapitalLetterLength");
			return minimumCaps_text.getText().trim();
		} catch (Exception e) {
			log.error("Executed getMinimumCapitalLetterLength");
			e.printStackTrace();
			return null;
		}
	}

	public String getMinimumLowerLetterLength() {
		try {
			log.info("Entered getMinimumLowerLetterLength");
			log.info("Executed getMinimumLowerLetterLength");
			 return minimumLower_text.getText().trim();
		} catch (Exception e) {
			return null;
		}
	}

	public String getMinimumSpecialCharacterLength() {
		try {
			log.info("Entered getMinimumSpecialCharacterLength");
			log.info("Executed getMinimumSpecialCharacterLength");
			return minSpecialChar_text.getText().trim();
		} catch (Exception e) {
			log.error("Executed clickOnMobileAppManagement");
			e.printStackTrace();
			return null;
		}
	}

	public String getMinimumNumberLength() {
		try {
			log.info("Entered getMinimumNumberLength");
			log.info("Executed getMinimumNumberLength");
			return minimumNumber_txt.getText().trim();
		} catch (Exception e) {
			log.error("Executed getMinimumNumberLength");
			e.printStackTrace();
			return null;
		}
	}
}