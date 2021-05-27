package pageObjects;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.LoggerHelper;

public class OrgUnitTypePage extends BasePage 
{
	Logger log = LoggerHelper.getLogger(LoggerHelper.class);
	
	public OrgUnitTypePage(WebDriver WebDriver) {
		super(WebDriver);
		PageFactory.initElements(WebDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Org Unit Type')]")
	private WebElement lnk_orgunittype;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Org Unit Type ')]")
	private WebElement btn_addorgunittype;

	@FindBy(how = How.XPATH, using = "//input[@name='codeOrgUnit']")
	private WebElement btn_orgunittypecode;

	@FindBy(how = How.XPATH, using = "//input[@name='nameOrgUnit']")
	private WebElement btn_orgunittypename;

	@FindBy(how = How.XPATH, using = "//input[@name='nameLocOrgUnit']")
	private WebElement btn_orgunittypenameloc;

	@FindBy(how = How.XPATH, using = "//input[@name='descOrgUnit']")
	private WebElement btn_orgunittypedesc;

	@FindBy(how = How.XPATH, using = "//input[@name='descLocOrgUnit']")
	private WebElement btn_orgunittypedescloc;

	@FindBy(how = How.XPATH, using = "//input[@name='levOrgUnit']")
	private WebElement btn_orgunittypelevel;

	@FindBy(how = How.XPATH, using = "//button[.=' Add ']")
	private WebElement btn_orgunittypeadd;

	@FindBy(how = How.XPATH, using = "//button[.=' Cancel  ']")
	private WebElement btn_orgunittypecancel;

	@FindBy(how = How.XPATH, using = "//button[@name='backOrgUnit']")
	private WebElement btn_orgunittypeback;

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

	public void clickOnOrgUnitType() {
		try{
			log.info("Entered clickOnOrgUnitType succesfully");
			waitUntilElementToBeClickable(lnk_orgunittype);
			click(lnk_orgunittype);
		log.info("Executed clickOnOrgUnitType Successfully");
		} 
		catch  (Exception e) 
		{
			 log.error("Not Executed clickOnOrgUnitType"); 
			 e.printStackTrace();
			 throw e;
		}
	}

	public void clickOnAddOrgUnitType() {
		try{
			log.info("Entered clickOnAddOrgUnitType succesfully");
			waitUntilElementToBeClickable(btn_addorgunittype);
			click(btn_addorgunittype);
		log.info("Executed clickOnAddOrgUnitType Successfully");
		} 
		catch  (Exception e) 
		{
			 log.error("Not Executed clickOnAddOrgUnitType"); 
			 e.printStackTrace(); 
			 throw e;
		}
	}

	public void enterCode(String code) {
		try{
			log.info("Entered enterCode succesfully");
			writeText(btn_orgunittypecode, code);
		log.info("Executed enterCode Successfully");
		} 
		catch  (Exception e) 
		{
			 log.error("Not Executed enterCode"); 
			 e.printStackTrace(); 
			 throw e;
		}
	}

	public void enterName(String name) {
		try{
			log.info("Entered enterName succesfully");
			writeText(btn_orgunittypename, name);
		log.info("Executed enterName Successfully");
		} 
		catch  (Exception e)
		{
			 log.error("Not Executed enterName");
			 e.printStackTrace();
			 throw e;
		}
	}

	public void enterNameloc(String nameloc) {
		try{log.info("Entered enterNameloc succesfully");
			writeText(btn_orgunittypenameloc, nameloc);
		log.info("Executed enterNameloc Successfully");
		} 
		catch  (Exception e) 
		{
			 log.error("Not Executed enterNameloc"); 
			 e.printStackTrace(); 
			 throw e;
		}
	}

	public void enterDesc(String desc) {
		try{
			log.info("Entered enterDesc succesfully");
			writeText(btn_orgunittypedesc, desc);
		log.info("Executed enterDesc Successfully");
		} 
		catch  (Exception e) 
		{
			 log.error("Not Executed enterDesc"); 
			 e.printStackTrace(); 
			 throw e;
		}
	}

	public void enterDescloc(String descloc) {
		try{
			log.info("Entered enterDescloc succesfully");
			writeText(btn_orgunittypedescloc, descloc);
		log.info("Executed enterDescloc Successfully");
		} 
		catch  (Exception e) 
		{
			 log.error("Not Executed enterDescloc"); 
			 e.printStackTrace();
			 throw e;
		}
	}

	public void enterLevel(String level) {
		try{
			log.info("Entered enterLevel succesfully");
			writeText(btn_orgunittypelevel, level);
		log.info("Executed enterLevel Successfully");
		} 
		catch  (Exception e) 
		{
			 log.error("Not Executed enterLevel"); 
			 e.printStackTrace(); 
			 throw e;
		}
	}

	public void clickOnAdd() {
		try{
			log.info("Entered clickOnAdd succesfully");
			waitUntilElementToBeClickable(btn_orgunittypeadd);
			click(btn_orgunittypeadd);
			waitFor(3000);
			assertTrue(btn_addorgunittype.isDisplayed(), "orgunit type is not added");
		log.info("Executed clickOnAdd Successfully");
		} 
		catch  (Exception e) 
		{
			 log.error("Not Executed clickOnAdd"); 
			 e.printStackTrace(); 
			 throw e;
		}
	}

	// delete
	public void clickOnMore() {
		try{
			log.info("Entered clickOnMore succesfully");
			waitUntilElementToBeClickable(lnk_more);
			click(lnk_more);
			waitFor(2000);
		log.info("Executed clickOnMore Successfully");
		} 
		catch  (Exception e) 
		{
			 log.error("Not Executed clickOnMore"); 
			 e.printStackTrace(); 
			 throw e;
		}
	}

	public void clickOnDeleteInDrop() {
		try{
			log.info("Entered clickOnDeleteInDrop succesfully");
			waitUntilElementToBeClickable(btn_deletedropdown);
			click(btn_deletedropdown);
			waitFor(2000);
		log.info("Executed clickOnDeleteInDrop Successfully");
		} 
		catch  (Exception e) 
		{
			 log.error("Not Executed clickOnDeleteInDrop"); 
			 e.printStackTrace(); 
			 throw e;
		}
	}

	public void clicOnDelete() {
		try{
			log.info("Entered clicOnDelete succesfully");
			waitUntilElementToBeClickable(btn_delete);
			click(btn_delete);
			assertTrue(btn_addorgunittype.isDisplayed(), "org unit type is not deleted");
		log.info("Executed clicOnDelete Successfully");
		} 
		catch  (Exception e) 
		{
			 log.error("Not Executed clicOnDelete"); 
			 e.printStackTrace(); 
			 throw e;
		}
	}

	// edit
	public void clickOnEditInDrop() {
		try{
			log.info("Entered clickOnEditInDrop succesfully");
			waitUntilElementToBeClickable(btn_editdropdown);
			click(btn_editdropdown);
			waitFor(2000);
		log.info("Executed clickOnEditInDrop Successfully");
		} 
		catch  (Exception e) 
		{
			 log.error("Not Executed clickOnEditInDrop"); 
			 e.printStackTrace(); 
			 throw e;
		}
	}

	public void clickOnEdit() {
		try{
			log.info("Entered clickOnEdit succesfully");
			waitUntilElementToBeClickable(btn_edit);
			click(btn_edit);
			waitFor(3000);
			assertTrue(btn_addorgunittype.isDisplayed(), "org unit type is not edited");
		log.info("Executed clickOnEdit Successfully");
		} 
		catch  (Exception e) 
		{
			 log.error("Not Executed clickOnEdit");
			 e.printStackTrace(); 
			 throw e;
		}
	}

}
