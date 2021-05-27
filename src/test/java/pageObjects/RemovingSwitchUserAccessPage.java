package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import helper.LoggerHelper;

public class RemovingSwitchUserAccessPage extends BasePage 
{
	Logger log = LoggerHelper.getLogger(LoggerHelper.class);

	public RemovingSwitchUserAccessPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-ellipsis-h'])[last()-1]")
	private WebElement action_btn;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Switch User Permission')] ")
	private WebElement switchuserpermission_lnk;

	@FindBy(how = How.XPATH, using = "//h6[@class='mb-lg-0 text-truncate']/../..//label[@for='checkbox6']")
	private WebElement selectuser_checkbox;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Remove Permission ')]")
	private WebElement removepermission_button;

	public void clickActionButton() {
		try{
			log.info("Entered clickActionButton succesfully");
			waitUntilElementToBeClickable(action_btn);
			action_btn.click();
			log.info("Executed clickActionButton Successfully"); 
		} catch (Exception e) {

			log.error("Not Executed clickActionButton");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickSwitchUserPermission() {
		try{
			log.info("Entered clickSwitchUserPermission succesfully");
			waitUntilElementToBeClickable(switchuserpermission_lnk);
			switchuserpermission_lnk.click();
			log.info("Executed clickSwitchUserPermission Successfully"); 
		} catch (Exception e) {

			log.error("Not Executed clickSwitchUserPermission");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickcheckboxofuser() {
		try{
			log.info("Entered clickcheckboxofuser succesfully");
			waitFor(2000);
			waitUntilElementToBeClickable(selectuser_checkbox);
			selectuser_checkbox.click();
			log.info("Executed clickcheckboxofuser Successfully"); 
		} catch (Exception e) {

			log.error("Not Executed clickcheckboxofuser");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickRemovePermissionButton() {
		try{
			log.info("Entered clickRemovePermissionButton succesfully");
			waitFor(2000);
			waitUntilElementToBeClickable(removepermission_button);
			removepermission_button.click();
			waitFor(3000);
			log.info("Executed clickRemovePermissionButton Successfully"); 
		} catch (Exception e) {

			log.error("Not Executed clickRemovePermissionButton");
			e.printStackTrace(); 
			throw e;
			
		}
	}

}
