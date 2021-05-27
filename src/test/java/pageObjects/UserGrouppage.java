package pageObjects;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.apache.log4j.Logger;
import helper.LoggerHelper;

public class UserGrouppage extends BasePage {

	public UserGrouppage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'User Group')]")
	private WebElement usergroup_menu_link;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Create User Group ')]")
	private WebElement adduser_btn;

	@FindBy(how = How.XPATH, using = "//input[@name='name']")
	private WebElement username_txt;

	@FindBy(how = How.XPATH, using = "//textarea[@name='description']")
	private WebElement descp_txt;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Cancel')]")
	private WebElement cancel_txt;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create')]")
	private WebElement create_btn;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-secondary float-right mb-2']")
	private WebElement back_btn;

	@FindBy(how = How.XPATH, using = "((//div[@class='w-100 float-left mt-3']/div)[last()-1]/div)[last()]/h6/i")
	private WebElement usergroup_more_btn;

	@FindBy(how = How.XPATH, using = "(//div[@class='empActions m-t-nsmd']//ul/li)[1]")
	private WebElement editusergroup_btn;

	@FindBy(how = How.XPATH, using = "(//div[@class='empActions m-t-nsmd']//ul/li)[2]")
	private WebElement deleteusergroup_btn;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Add Users')]")
	private WebElement addusertogroup_btn;

	@FindBy(how = How.XPATH, using = "(//div[@class='empActions m-t-nsmd']//ul/li)[4]")
	private WebElement removeuser_btn;

	@FindBy(how = How.XPATH, using = "//button[.='Update']")
	private WebElement update_btn;

	@FindBy(how = How.XPATH, using = "//button[.=' Confirm ']")
	private WebElement deleteconfirm_btn;

	@FindBy(how = How.XPATH, using = "//button[.='Add']")
	private WebElement add_btn;

	@FindBy(how = How.XPATH, using = "//button[.='Remove']")
	private WebElement remove_btn;

	@FindBy(how = How.XPATH, using = "//button[.=' Confirm ']")
	private WebElement confirm_btn;

	@FindBy(how = How.XPATH, using = "//div[@class='w-100 float-left my-4']//div[1]//label[1]")
	private WebElement includeeveryone_chb;

	@FindBy(how = How.XPATH, using = "//div[@class='w-100 float-left my-4']//div[2]//label[1]")
	private WebElement includeeveryoneexcpet_chb;

	@FindBy(how = How.ID, using = "everyonein")
	private WebElement includeeveryonein_chb;

	@FindBy(how = How.XPATH, using = "//textarea")
	private WebElement txtarea;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Employees')]")
	private WebElement employee_link;

	@FindBy(how = How.XPATH, using = "//div[@class='w-100 float-left p-md-2 grid-details']/div[1]")
	private List<WebElement> list_of_employee;

	@FindBy(how = How.XPATH, using = "(//ul[@class='pagination']/li)[last()-1]")
	private WebElement next;

	public void clickOnuserGroupLInk() {
		try {
			log.info("Entered clickOnuserGroupLInk");	
			scroll(webDriver, "down");
			waitUntilElementToBeClickable(usergroup_menu_link);
			log.info("Clicking usergroup_menu_link");
			click(usergroup_menu_link);
			Assert.assertTrue(adduser_btn.isDisplayed(), "adduser_btn not displayed");
			log.info("Executed clickOnuserGroupLInk Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnuserGroupLInk Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOncreateUserGroupButton() {
		try {
			log.info("Entered clickOncreateUserGroupButton");
			log.info("Clicking adduser_btn");
			click(adduser_btn);
			log.info("Executed clickOncreateUserGroupButton Successfully");
		} catch (Exception e) {
			log.error("Executed clickOncreateUserGroupButton Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void enterName(String name) {
		try {
			log.info("Entered enterName");
			log.info("Writing to writeText: "+name);
			writeText(username_txt, name);
			log.info("Executed enterName Successfully");
		} catch (Exception e) {
			log.error("Executed enterName Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void enterDesc(String desc) {
		try {
			log.info("Entered enterDesc");
			log.info("Writing to descp_txt: "+desc);
			writeText(descp_txt, desc);
			log.info("Executed enterDesc Successfully");
		} catch (Exception e) {
			log.error("Executed enterDesc Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickCreate() {
		try {
			log.info("Entered clickCreate");
			log.info("Clicking create_btn");
			click(create_btn);
			assertTrue(adduser_btn.isDisplayed(), "create user group failed");
			log.info("Executed clickCreate Successfully");
		} catch (Exception e) {
			log.error("Executed clickCreate Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickMore() {
		try {
			log.info("Entered clickMore");	
			waitUntilElementToBeClickable(usergroup_more_btn);
			log.info("Clicking usergroup_more_btn");
			click(usergroup_more_btn);
			log.info("Executed clickMore Successfully");
		} catch (Exception e) {
			log.error("Executed clickMore Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickEditInDropdown() {
		try {
			log.info("Entered clickEditInDropdown");
			log.info("Clicking editusergroup_btn");
			click(editusergroup_btn);
			log.info("Executed clickEditInDropdown Successfully");
		} catch (Exception e) {
			log.error("Executed clickEditInDropdown Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickUpadte() {
		try {
			log.info("Entered clickUpadte");
			log.info("Clicking update_btn");
			click(update_btn);
			log.info("Executed clickUpadte Successfully");
		} catch (Exception e) {
			log.error("Executed clickUpadte Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	// add user to group
	public void clickAddUserInDropdown() {
		try {
			log.info("Entered clickAddUserInDropdown");	
			waitUntilElementToBeClickable(addusertogroup_btn);
			log.info("Clicking addusertogroup_btn");
			clickOnElementByJs(addusertogroup_btn);
			log.info("Executed clickAddUserInDropdown Successfully");
		} catch (Exception e) {
			log.error("Executed clickAddUserInDropdown Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void selectincludeEveryoneIn() {
		try {
			log.info("Entered selectincludeEveryoneIn");	
			waitFor(1000);
			log.info("Clicking includeeveryonein_chb");
			clickOnElementByJs(includeeveryonein_chb);
			log.info("Executed selectincludeEveryoneIn Successfully");
		} catch (Exception e) {
			log.error("Executed selectincludeEveryoneIn Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void enterCode(String code) {
		try {
			log.info("Entered enterCode");
			log.info("Clicking txtarea");
			click(txtarea);
			log.info("Writing to txtarea: "+code);
			writeText(txtarea,code);
			waitFor(2000);
			log.info("Executed enterCode Successfully");
		} catch (Exception e) {
			log.error("Executed enterCode Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnadd_btn() {
		try {
			log.info("Entered clickOnadd_btn");	
			log.info("Clicking add_btn");
			click(add_btn);
			assertTrue(adduser_btn.isDisplayed(), "not succesfully");
			log.info("Executed clickOnadd_btn Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnadd_btn Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void selectincludeEveryoneExcept() {
		try {
			log.info("Entered selectincludeEveryoneExcept");	
			log.info("Clicking includeeveryoneexcpet_chb");
			click(includeeveryoneexcpet_chb);
			log.info("Executed selectincludeEveryoneExcept Successfully");
		} catch (Exception e) {
			log.error("Executed selectincludeEveryoneExcept Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void selectincludeEveryone() {
		try {
			log.info("Entered selectincludeEveryone");
			log.info("Clicking includeeveryone_chb");
			click(includeeveryone_chb);
			log.info("Executed selectincludeEveryone Successfully");
		} catch (Exception e) {
			log.error("Executed selectincludeEveryone Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnremoveUser() {
		try {
			log.info("Entered clickOnremoveUser");	
			log.info("Clicking removeuser_btn");
			click(removeuser_btn);
			log.info("Executed clickOnremoveUser Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnremoveUser Not Successfully");
			e.printStackTrace();
			throw e;			
		}

	}

	public void clickOnremoveUserBtn() {
		try {
			log.info("Entered clickOnremoveUserBtn");	
			scroll(webDriver, "down");
			log.info("Clicking remove_btn");
			click(remove_btn);
			assertTrue(adduser_btn.isDisplayed(), "remove not succeful");
			log.info("Executed clickOnremoveUserBtn Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnremoveUserBtn Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOndeleteUserGroup() {
		try {
			log.info("Entered clickOndeleteUserGroup");	
			waitFor(5000);
			waitUntilElementToBeClickable(deleteusergroup_btn);
			log.info("Clicking deleteusergroup_btn");
			click(deleteusergroup_btn);
			log.info("Clicking confirm_btn");
			click(confirm_btn);
			log.info("Executed clickOndeleteUserGroup Successfully");
		} catch (Exception e) {
			log.error("Executed clickOndeleteUserGroup Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

}
