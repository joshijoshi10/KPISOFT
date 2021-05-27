package pageObjects;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EmployeeCustomEntityPage extends BasePage {
	public EmployeeCustomEntityPage(WebDriver WebDriver) {
		super(WebDriver);
		PageFactory.initElements(WebDriver, this);

	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Employee custom entity')]")
	private WebElement lnk_employeecustomentity;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create employee custom entity')]")
	private WebElement btn_createEmpCustomEntity;

	@FindBy(how = How.XPATH, using = "//input[@name='cusEntCode']")
	private WebElement txt_code;

	@FindBy(how = How.XPATH, using = "//input[@name='cusEntName']")
	private WebElement txt_name;

	@FindBy(how = How.XPATH, using = "//input[@name='cusEntNameLoc']")
	private WebElement txt_nameloc;

	@FindBy(how = How.XPATH, using = "//input[@name='cusEntDes']")
	private WebElement txt_desc;

	@FindBy(how = How.XPATH, using = "//input[@name='cusEntDesLoc']")
	private WebElement txt_descloc;

	@FindBy(how = How.XPATH, using = "//input[@name='cusEntLevel']")
	private WebElement txt_level;

	@FindBy(how = How.XPATH, using = "//select[@name='cusEntType']")
	private WebElement txt_type;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add')]")
	private WebElement btn_add;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Close ')]")
	private WebElement btn_close;

	@FindBy(how = How.XPATH, using = "(((//div[@class='w-100 float-left mt-3']/div)[last()])/div)[last()]/h6/i")
	private WebElement btn_more;

	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Edit']")
	private WebElement btn_editInDropDown;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Update Changes']")
	private WebElement btn_update;

	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Delete']")
	private WebElement btn_deleteInDropDown;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Delete']")
	private WebElement btn_delete;

	// create
	public void clickOnEmployeeCustomEntity() {
		try {
			log.info("Entered clickOnEmployeeCustomEntity");
			waitUntilElementToBeClickableRepeated(lnk_employeecustomentity, 2);
			log.info("Clicking lnk_employeecustomentity");
			click(lnk_employeecustomentity);
			log.info("Executed clickOnEmployeeCustomEntity Successfully");
		} catch (Exception e) {
			log.info("Executed clickOnEmployeeCustomEntity Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnCreate() {
		try {
			log.info("clicking on create!!");
			waitUntilElementVisible(btn_createEmpCustomEntity);
			click(btn_createEmpCustomEntity);
			log.info("clicked on create!!");
		} catch (Exception e) {
			log.error("error clicking on create!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterCode(String code) {
		try {
			log.info("entering the code as"+ code);
			writeText(txt_code, code);
			log.info("entered the code!!");
		} catch (Exception e) {
			log.error("error entering the code!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterName(String name) {
		try {
			log.info("entering the name!!");
			writeText(txt_name, name);
			log.info("entered the name!!");
		} catch (Exception e) {
			log.info("error entering the name!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterNameloc(String nameloc) {
		try {
			log.info("enter name locale!!");
			writeText(txt_nameloc, nameloc);
			log.info("entered name locale!!");
		} catch (Exception e) {
			log.info("error entering name locale!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterDesc(String desc) {
		try {
			log.info("entering description!!");
			writeText(txt_desc, desc);
			log.info("entered description!!");
		} catch (Exception e) {
			log.error("error entering description!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterDescloc(String descloc) {
		try {
			log.info("entering description locale!!");
			writeText(txt_descloc, descloc);
			log.info("entered description locale!!");
		} catch (Exception e) {
			log.error("error entering description locale!!");
			e.printStackTrace();
		}
	}

	public void enterLevel(String level) {
		try {
			log.info("entering level!!");
			writeText(txt_level, level);
			log.info("entered level!!");
		} catch (Exception e) {
			log.info("error entering level!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void selectType(String type) {
		try {
			log.info("selecting type as:"+type);
			setValueInDropdownText(txt_type, type);
			waitFor(3000);
			log.info("selected type as:"+type);
		} catch (Exception e) {
			log.error("error selecting type as:"+type);
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnAdd() {
		try {
			log.info("clicking on add!!");
			waitUntilElementToBeClickable(btn_add);
			click(btn_add);
			log.info("clicked on add!!");
			assertTrue(btn_createEmpCustomEntity.isDisplayed(), "employee custom entity is not added");
			log.info("employee custom entity is displayed");
		} catch (Exception e) {
			log.info("error clicking on add!!");
			e.printStackTrace();
		}
	}

	// edit
	public void clickOnMore() {
		try {
			log.info("clicking on more!!");
			waitUntilElementToBeClickable(btn_more);
			click(btn_more);
			log.info("clicked on more!!");
		} catch (Exception e) {
			log.error("error clicking on more!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnEditInDropdown() {
		try {
			log.info("clicking on edit in dropdown!!");
			waitUntilElementToBeClickable(btn_editInDropDown);
			click(btn_editInDropDown);
			waitFor(3000);
			log.info("clicked on edit in dropdown!!");
		} catch (Exception e) {
			log.error("clicking on edit in dropdown!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnUpdate() {
		try {
			log.info("clicking on update!!");
			waitUntilElementToBeClickable(btn_update);
			click(btn_update);
			assertTrue(btn_createEmpCustomEntity.isDisplayed(), "employee custom entity is not edited");
		} catch (Exception e) {
			log.error("error clicking on update!!");
			e.printStackTrace();
		}
	}

	// delete

	public void clickOnDeleteInDropdown() {
		try {
			log.info("clicking on delete in dropdown!!");
			waitUntilElementToBeClickable(btn_deleteInDropDown);
			click(btn_deleteInDropDown);
			waitFor(2000);
			log.info("clicked on delete in dropdown!!");
		} catch (Exception e) {
			log.error("error clicking on delete in dropdown!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnDelete() {
		try {
			log.info("clicking on delete");
			waitUntilElementToBeClickable(btn_delete);
			click(btn_delete);
			waitFor(3000);
			assertTrue(btn_createEmpCustomEntity.isDisplayed(), "employee custom entity is not deleted");
			log.info("clicked on delete");
		} catch (Exception e) {
			log.error("error clicking on delete");
			e.printStackTrace();
			Assert.fail();
		}
	}

}
