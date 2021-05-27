package pageObjects;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.LoggerHelper;

public class OrgCategory extends BasePage
{
	Logger log = LoggerHelper.getLogger(LoggerHelper.class);
	
	public OrgCategory(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Organization Category')]")
	private WebElement lnk_orgcategory;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Organization Category ')]")
	private WebElement btn_addorgcategory;

	@FindBy(how = How.XPATH, using = "//input[@name='orgCatCode']")
	private WebElement btn_orgcategorycode;

	@FindBy(how = How.XPATH, using = "//input[@name='orgCatName']")
	private WebElement btn_orgcategoryname;

	@FindBy(how = How.XPATH, using = "//input[@name='orgCatNameLoc']")
	private WebElement btn_orgcatnameloc;

	@FindBy(how = How.XPATH, using = "//input[@name='orgCatDesc']")
	private WebElement btn_orgcatdesc;

	@FindBy(how = How.XPATH, using = "//input[@name='orgCatDescLoc']")
	private WebElement btn_orgcatdescloc;

	@FindBy(how = How.XPATH, using = "//input[@name='orgCatLev']")
	private WebElement btn_orgcatlevel;

	@FindBy(how = How.XPATH, using = "//button[.=' Add ']")
	private WebElement btn_orgcatadd;

	@FindBy(how = How.XPATH, using = "//button[.=' Cancel  ']")
	private WebElement btn_orgcatcancel;

	@FindBy(how = How.XPATH, using = "//button[@name='backOrgCat']")
	private WebElement btn_orgcatback;

	@FindBy(how = How.XPATH, using = "((//div[@class='w-100 float-left p-md-2 grid-details'])[last()]/div)[last()]/h6/i")
	private WebElement lnk_more;

	@FindBy(how = How.XPATH, using = "(//div[@class='empActions m-t-nsmd']//li)[last()]")
	private WebElement btn_deletedropdown;

	@FindBy(how = How.XPATH, using = "//button[.='Delete']")
	private WebElement btn_delete;

	@FindBy(how = How.XPATH, using = "//div[@class='empActions m-t-nsmd']//li[1]")
	private WebElement btn_editdropdown;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Update Changes')]")
	private WebElement btn_edit;

	public void clickOnOrgcategory() {
		try {
			log.info("Entered clickOnOrgcategory");
			waitUntilElementToBeClickableRepeated(lnk_orgcategory,2);
			log.info("Clicking lnk_orgcategory");
			click(lnk_orgcategory);
			log.info("Executed clickOnOrgcategory Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnOrgcategory Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnAddOrgCategory() {
		try {
			log.info("Entered clickOnAddOrgCategory");
			waitUntilElementToBeClickable(btn_addorgcategory);
			log.info("Clicking btn_addorgcategory");
			click(btn_addorgcategory);
			log.info("Executed clickOnAddOrgCategory Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnAddOrgCategory Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterCode(String code) {
		try {
			log.info("Entered enterCode");
			log.info("Typing org category Code "+code);
			writeText(btn_orgcategorycode, code);
			log.info("Executed enterCode Successfully");
		} catch (Exception e) {
			log.error("Executed enterCode Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterName(String name) {
		try {
			log.info("Entered enterName");
			log.info("Typing org category Name "+name);
			writeText(btn_orgcategoryname, name);
			log.info("Executed enterName Successfully");
		} catch (Exception e) {
			log.error("Executed enterName Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterNameloc(String nameloc) {
		try {
			log.info("Entered enterNameloc");
			log.info("Typing org category name location "+nameloc);
			writeText(btn_orgcatnameloc, nameloc);
			log.info("Executed enterNameloc Successfully");
		} catch (Exception e) {
			log.error("Executed enterNameloc Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterDesc(String desc) {
		try {
			log.info("Entered enterNameloc");
			log.info("Typing org category desc "+desc);
			writeText(btn_orgcatdesc, desc);
			log.info("Executed enterNameloc Successfully");
		} catch (Exception e) {
			log.error("Executed enterNameloc Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterDescloc(String descloc) {
		try {
			log.info("Entered enterDescloc");
			log.info("Typing org category desc loc "+descloc);
			writeText(btn_orgcatdescloc, descloc);
			log.info("Executed enterDescloc Successfully");
		} catch (Exception e) {
			log.error("Executed enterDescloc Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterLevel(String level) {
		try {
			log.info("Entered enterLevel");
			log.info("Typing orgcatlevel "+level);
			writeText(btn_orgcatlevel, level);
			log.info("Executed enterLevel Successfully");
		} catch (Exception e) {
			log.error("Executed enterLevel Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnAdd() {
		try {
			log.info("Entered clickOnAdd");
			waitUntilElementToBeClickable(btn_orgcatadd);
			log.info("Clicking btn_orgcatadd");
			click(btn_orgcatadd);
			waitFor(3000);
			log.info("Checking btn_addorgcategory displaying");
			assertTrue(btn_addorgcategory.isDisplayed(), "orgcategory is not added");
			log.info("Executed clickOnAdd Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnAdd Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	// delete
	public void clickOnMore() {
		try {
			log.info("Entered clickOnMore");
			waitUntilElementToBeClickable(lnk_more);
			click(lnk_more);
			waitFor(2000);
			log.info("Executed clickOnMore Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnMore Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnDeleteInDrop() {
		try {
			log.info("Entered clickOnDeleteInDrop");
			waitUntilElementToBeClickable(btn_deletedropdown);
			click(btn_deletedropdown);
			waitFor(2000);
			log.info("Executed clickOnDeleteInDrop Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnDeleteInDrop Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clicOnDelete() {
		try {
			log.info("Entered clicOnDelete");
			waitUntilElementToBeClickable(btn_delete);
			click(btn_delete);
			assertTrue(btn_addorgcategory.isDisplayed(), "orgcategory is not deleted");
			log.info("Executed clicOnDelete Successfully");
		} catch (Exception e) {
			log.error("Executed clicOnDelete Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	// edit
	public void clickOnEditInDrop() {
		try {
			log.info("Entered clickOnEditInDrop");
			waitUntilElementToBeClickable(btn_editdropdown);
			click(btn_editdropdown);
			waitFor(2000);
			log.info("Executed clickOnEditInDrop Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnEditInDrop Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnEdit() {
		try {
			log.info("Entered clickOnEdit");
			waitUntilElementToBeClickable(btn_edit);
			click(btn_edit);
			waitFor(3000);
			assertTrue(btn_addorgcategory.isDisplayed(), "orgcategory is not edited");
			log.info("Executed clickOnEdit Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnEdit Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

}
