package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import util.ManagerUtil;

public class Roles_PermissionPage extends BasePage {
	public Roles_PermissionPage(WebDriver webDriver)

	{
		super(webDriver);
		PageFactory.initElements(webDriver, this);

	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Roles & Permission ')]")
	private WebElement Roles_PermissionLink;

	@FindBy(how = How.XPATH, using = "//button[text()=' Create Role ']")
	private WebElement createbutton;

	@FindBy(how = How.XPATH, using = "//input[@name='nameInR&P']")
	private WebElement NameTb;

	@FindBy(how = How.XPATH, using = "//input[@name='codeInR&P']")
	private WebElement CodeTb;

	@FindBy(how = How.XPATH, using = "//textarea[@name='descriptionInR&P']")
	private WebElement DescriptionTb;

	@FindBy(how = How.XPATH, using = "//label[@for='USER_MANAGEMENT']")
	private WebElement UserManagementCheckBox;

	@FindBy(how = How.XPATH, using = "//label[@for='PROGRAM_MANAGEMENT']")
	private WebElement ProgramManagementCheckBox;

	@FindBy(how = How.XPATH, using = "//label[@for='TOOLS']")
	private WebElement ToolsCheckBox;

	@FindBy(how = How.XPATH, using = "//label[@for='USER_OPERATIONS']")
	private WebElement UserOperationCheckBox;

	@FindBy(how = How.XPATH, using = "//label[@for='BI_USER']")
	private WebElement BIUserCheckBox;

	@FindBy(how = How.XPATH, using = "//label[@for='BI_ADMIN_OPERATIONS']")
	private WebElement BIAdminCheckBox;

	@FindBy(how = How.XPATH, using = "//button[text()='Create']")
	private WebElement CreateButton;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-ellipsis-h'])[last()]")
	private WebElement ActionsLink;

	@FindBy(how = How.XPATH, using = "//li[text()=' Add Users ']")
	private WebElement AddUserOption;

	@FindBy(how = How.XPATH, using = "//label[text()=' Include everyone  ']")
	private WebElement includeEveryoneRadioBUtton;

	@FindBy(how = How.XPATH, using = "//label[text()=' Include everyone except']")
	private WebElement includeEveryoneExceptRadioButton;

	@FindBy(how = How.XPATH, using = "//textarea[@name='enterCodeR&P']")
	private WebElement CodeTextBox;

	@FindBy(how = How.XPATH, using = "//label[text()=' Include everyone in ']")
	private WebElement includeEveryoneInRadioButton;

	@FindBy(how = How.XPATH, using = "//button[text()='Add']")
	private WebElement AdduserButtonClick;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Performance Program')]")
	private WebElement PerformanceProgramLink;

	@FindBy(how=How.XPATH, using="//label[@for='CALIBRATION_MANAGEMENT']")
	private WebElement calibration_chkbx;

	public void verifyPerformancePgmText() {
		try {
			log.info("Entered verifyPerformancePgmText");
			waitFor(3000);
			System.out.println(PerformanceProgramLink.getText());
			log.info("Assertion expted: Performance Program, actual: "+PerformanceProgramLink.getText());
			Assert.assertEquals(verifyData("Performance Program", PerformanceProgramLink),
					true);
			log.info("Executed verifyPerformancePgmText Successfully");
		} catch (Exception e) {
			log.error("Executed verifyPerformancePgmText Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void rolesPermissionLinkClick() {
		try {
			log.info("Entered rolesPermissionLinkClick");
			waitUntilElementToBeClickable(Roles_PermissionLink);
			log.info("Clicking rolesPermissionLinkClick");
			click(Roles_PermissionLink);
			ManagerUtil.waitFor(3000);
			log.info("Executed rolesPermissionLinkClick Successfully");
		} catch (Exception e) {
			log.error("Executed rolesPermissionLinkClick Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void CreateButtonClick()
	{
		try {
			log.info("Entered CreateButtonClick");
			waitUntilElementToBeClickable(createbutton);
			click(createbutton);
			waitFor(3000);
			log.info("Executed CreateButtonClick Successfully");
		} catch (Exception e) {
			log.error("Executed CreateButtonClick Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void NameTextBox(String value) {
		try {
			log.info("Entered NameTextBox");
			log.info("Typing NameTb = " + value);
			writeText(NameTb, value);
			log.info("Executed NameTextBox Successfully");
		} catch (Exception e) {
			log.error("Executed NameTextBox Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void CodeTextBox(String value) {
		try {
			log.info("Entered NameTextBox");
			writeText(CodeTb, value);
			log.info("Executed NameTextBox Successfully");
		} catch (Exception e) {
			log.error("Executed NameTextBox Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void descriptionTextBox(String value) {
		try {
			log.info("Entered descriptionTextBox");
			writeText(DescriptionTb, value);
			log.info("Executed descriptionTextBox Successfully");
		} catch (Exception e) {
			log.error("Executed descriptionTextBox Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void UserManagementCheckBoxSelect() {
		try {
			log.info("Entered UserManagementCheckBoxSelect");
			waitUntilElementToBeClickable(UserManagementCheckBox);
			click(UserManagementCheckBox);
			ManagerUtil.waitFor(3000);
			log.info("Executed UserManagementCheckBoxSelect Successfully");
		} catch (Exception e) {
			log.error("Executed UserManagementCheckBoxSelect Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void ProgramManagementCheckBoxSelect() {
		try {
			log.info("Entered ProgramManagementCheckBoxSelect");
			waitUntilElementToBeClickable(ProgramManagementCheckBox);
			click(ProgramManagementCheckBox);
			ManagerUtil.waitFor(3000);
			log.info("Executed ProgramManagementCheckBoxSelect Successfully");
		} catch (Exception e) {
			log.error("Executed ProgramManagementCheckBoxSelect Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void ToolsCheckBoxClick() {
		try {
			log.info("Entered ToolsCheckBoxClick");
			waitUntilElementToBeClickable(ToolsCheckBox);
			click(ToolsCheckBox);
			waitFor(3000);
			log.info("Executed ToolsCheckBoxClick Successfully");
		} catch (Exception e) {
			log.error("Executed ToolsCheckBoxClick Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void UserOperationCheckBoxClick() {
		try {
			log.info("Entered UserOperationCheckBoxClick");
			waitUntilElementToBeClickable(UserOperationCheckBox);
			click(UserOperationCheckBox);
			waitFor(3000);
			log.info("Executed UserOperationCheckBoxClick Successfully");
		} catch (Exception e) {
			log.error("Executed UserOperationCheckBoxClick Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void BIuserCheckBoxClick() {
		try {
			log.info("Entered BIuserCheckBoxClick");
			waitUntilElementToBeClickable(BIUserCheckBox);
			click(BIUserCheckBox);
			waitFor(3000);
			log.info("Executed BIuserCheckBoxClick Successfully");
		} catch (Exception e) {
			log.error("Executed BIuserCheckBoxClick Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void BIAdminCheckBoxClick() {
		try {
			log.info("Entered BIAdminCheckBoxClick");
			waitUntilElementToBeClickable(BIAdminCheckBox);
			click(BIAdminCheckBox);
			waitFor(3000);
			scrollUpAndDown(3000);
			log.info("Executed BIAdminCheckBoxClick Successfully");
		} catch (Exception e) {
			log.error("Executed BIAdminCheckBoxClick Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void CreateButtonClickforR_P() {
		try {
			log.info("Entered CreateButtonClickforR_P");
			waitUntilElementToBeClickable(CreateButton);
			log.info("Clicking CreateButton");
			click(CreateButton);
			log.info("Executed CreateButtonClickforR_P Successfully");
		} catch (Exception e) {
			log.error("Executed CreateButtonClickforR_P Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void ActionLinkClick() {
		try {
			log.info("Entered ActionLinkClick");
			waitUntilElementToBeClickable(ActionsLink);
			log.info("Clicking ActionsLink");
			click(ActionsLink);
			waitFor(3000);
			log.info("Executed ActionLinkClick Successfully");
		} catch (Exception e) {
			log.error("Executed ActionLinkClick Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void AdduserClick() {
		try {
			log.info("Entered AdduserClick");
			waitUntilElementToBeClickable(AddUserOption);
			click(AddUserOption);
			log.info("Executed AdduserClick Successfully");
		} catch (Exception e) {
			log.error("Executed AdduserClick Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void includeEveryoneRadioButtonClick() {
		try {
			log.info("Entered includeEveryoneRadioButtonClick");
			waitUntilElementToBeClickable(includeEveryoneRadioBUtton);
			log.info("Clicking includeEveryoneRadioBUtton");
			click(includeEveryoneRadioBUtton);
			log.info("Executed includeEveryoneRadioButtonClick Successfully");
		} catch (Exception e) {
			log.error("Executed includeEveryoneRadioButtonClick Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void includeEveryoneExceptCheckbox() {
		try {
			log.info("Entered includeEveryoneExceptCheckbox");
			waitUntilElementToBeClickable(includeEveryoneExceptRadioButton);
			click(includeEveryoneExceptRadioButton);
			log.info("Executed includeEveryoneExceptCheckbox Successfully");
		} catch (Exception e) {
			log.error("Executed includeEveryoneExceptCheckbox Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void includeEveryoneInRadioBUttonClick() {
		try {
			log.info("Entered includeEveryoneInRadioBUttonClick");
			waitUntilElementToBeClickable(includeEveryoneInRadioButton);
			click(includeEveryoneInRadioButton);
			log.info("Executed includeEveryoneInRadioBUttonClick Successfully");
		} catch (Exception e) {
			log.error("Executed includeEveryoneInRadioBUttonClick Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void CodeEnterTextBox(String value) {
		try {
			log.info("Entered CodeEnterTextBox");
			writeText(CodeTextBox, value);
			log.info("Executed CodeEnterTextBox Successfully");
		} catch (Exception e) {
			log.error("Executed CodeEnterTextBox Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void AddButtonClick() {
		try {
			log.info("Entered AddButtonClick");
			waitUntilElementToBeClickable(AdduserButtonClick);
			click(AdduserButtonClick);
			log.info("Executed AddButtonClick Successfully");
		} catch (Exception e) {
			log.error("Executed AddButtonClick Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnCaliberation() {
		try {
			log.info("Entered clickOnCaliberation");
			waitUntilElementToBeClickable(calibration_chkbx);
			click(calibration_chkbx);
			log.info("Executed clickOnCaliberation Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnCaliberation Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
}
