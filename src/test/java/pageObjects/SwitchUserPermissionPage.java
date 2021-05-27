package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.apache.log4j.Logger;
import helper.LoggerHelper;

public class SwitchUserPermissionPage extends BasePage {

    public SwitchUserPermissionPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(how = How.XPATH, using = "(//i[@class='fa fa-ellipsis-h'])[last()-1]")
    private WebElement action_btn;

    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Switch User Permission')] ")
    private WebElement switchuserpermission_lnk;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'btn btn-primary float-right mr-4')]")
    private WebElement add_users_btn;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary float-right mr-4']")
    private WebElement validate_and_add_btn;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary float-right mb-4']")
    private WebElement add_emp_btn;

    public void clickActionButton() {
		try {
			log.info("Entered clickActionButton");	
            waitUntilElementToBeClickable(action_btn);
			log.info("Clicking action_btn");
            click(action_btn);
			log.info("Executed clickActionButton");
		} catch (Exception e) {
			log.error("Executed clickActionButton");
			e.printStackTrace();
			throw e;			
		}
    }

    public void clickSwitchUserPermission() {
		try {
			log.info("Entered clickSwitchUserPermission");	
            waitUntilElementToBeClickable(switchuserpermission_lnk);
			log.info("Clicking switchuserpermission_lnk");
            click(switchuserpermission_lnk);
			log.info("Executed clickSwitchUserPermission");
		} catch (Exception e) {
			log.error("Executed clickSwitchUserPermission");
			e.printStackTrace();
			throw e;			
		}
    }
	
    /*
     * public void Validatelistofemployees() {
     * Assert.assertEquals("Filters","Filters is not matching hence >>> Failed" ); }
     */

    public void clickAddUsersButton() {
		try {
			log.info("Entered clickAddUsersButton");	
            waitFor(2000);
            waitUntilElementToBeClickable(add_users_btn);
			log.info("Clicking add_users_btn");
            click(add_users_btn);
			log.info("Executed clickAddUsersButton");
		} catch (Exception e) {
			log.error("Executed clickAddUsersButton");
			e.printStackTrace();
			throw e;			
		}
    }

    public void clickValidateandAddButton() {
		try {
			log.info("Entered clickValidateandAddButton");	
            waitFor(2000);
            waitUntilElementToBeClickable(validate_and_add_btn);
			log.info("Clicking validate_and_add_btn");
            click(validate_and_add_btn);
			log.info("Executed clickValidateandAddButton");
		} catch (Exception e) {
			log.error("Executed clickValidateandAddButton");
			e.printStackTrace();
			throw e;			
		}
    }

    public void clickAddEmployeesButton() {
		try {
			log.info("Entered clickAddEmployeesButton");	
            waitFor(2000);
            waitUntilElementToBeClickable(add_emp_btn);
			log.info("Clicking add_emp_btn");
            click(add_emp_btn);
			waitFor(3000);
			log.info("Executed clickAddEmployeesButton");
		} catch (Exception e) {
			log.error("Executed clickAddEmployeesButton");
			e.printStackTrace();
			throw e;			
		}
    }

}
