package pageObjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;
import helper.LoggerHelper;

public class UOMPage extends BasePage {

	public UOMPage(WebDriver WebDriver) {
		super(WebDriver);
		PageFactory.initElements(WebDriver, this);

	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'UOM')]")
	private WebElement lnk_UOM;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'New UOM')]")
	private WebElement btn_createUOM;

	@FindBy(how = How.XPATH, using = "//input[@name='unit name']")
	private WebElement txt_unit;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save')]")
	private WebElement btn_save;

	@FindBy(how = How.XPATH, using = "(//h6[@class='mb-lg-0 text-truncate text-primary'])[1]")
	private WebElement verfiry;

	@FindBy(how = How.XPATH, using = "//div[@class='w-100 float-left p-md-2 grid-details'][1]/div[2]/h6/i")
	private WebElement lnk_more;

	@FindBy(how = How.XPATH, using = "//li[.='Edit']")
	private WebElement lnk_editInDropdown;

	@FindBy(how = How.XPATH, using = "//li[.='Delete']")
	private WebElement lnk_deleteInDropdown;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Update Changes')]")
	private WebElement btn_update;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Delete')]")
	private WebElement btn_delete;

	// create
	public void clickOnUom() {
		try {
			log.info("Entered clickOnUom");	
			waitUntilElementToBeClickable(lnk_UOM);
			log.info("Clicking lnk_UOM");
			click(lnk_UOM);
			log.info("Executed clickOnUom Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnUom Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnNewUom() {
		try {
			log.info("Entered clickOnNewUom");	
			waitUntilElementToBeClickable(btn_createUOM);
			log.info("Clicking btn_createUOM");
			click(btn_createUOM);
			waitFor(3000);
			log.info("Executed clickOnNewUom Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnNewUom Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void enterUnit(String unit) {
		try {
			log.info("Entered enterUnit");
			log.info("Writing to txt_unit: "+unit);
			writeText(txt_unit, unit);
			log.info("Executed enterUnit Successfully");
		} catch (Exception e) {
			log.error("Executed enterUnit Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnSave() {
		try {
			log.info("Entered clickOnSave");	
			waitUntilElementToBeClickable(btn_save);
			log.info("Clicking btn_save");
			click(btn_save);
			assertTrue(btn_createUOM.isDisplayed(), "UOM is not created");
			waitFor(3000);
			log.info("Executed clickOnSave Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnSave Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void verfiyCreateUom(String unit) {
		try {
			log.info("Entered verfiyCreateUom");	
			assertTrue(verfiry.getText().equalsIgnoreCase(unit), "created Uom is not created and not in uom list");
			log.info("Executed verfiyCreateUom Successfully");
		} catch (Exception e) {
			log.error("Executed verfiyCreateUom Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	// edit
	public void clickOnMore() {
		try {
			log.info("Entered clickOnMore");	
			waitUntilElementToBeClickable(lnk_more);
			log.info("Clicking lnk_more");
			click(lnk_more);
			waitFor(3000);
			log.info("Executed clickOnMore Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnMore Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnEditInDropdown() {
		try {
			log.info("Entered clickOnEditInDropdown");	
			waitUntilElementToBeClickable(lnk_editInDropdown);
			log.info("Clicking lnk_editInDropdown");
			click(lnk_editInDropdown);
			waitFor(3000);
			log.info("Executed clickOnEditInDropdown Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnEditInDropdown Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void enterUnitToEdit(String unit) {
		try {
			log.info("Entered enterUnitToEdit");
			log.info("Writing to txt_unit: "+unit);
			writeText(txt_unit, unit);
			log.info("Executed enterUnitToEdit Successfully");
		} catch (Exception e) {
			log.error("Executed enterUnitToEdit Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnUpdate() {
		try {
			log.info("Entered clickOnUpdate");	
			waitUntilElementToBeClickable(btn_update);
			log.info("Clicking btn_update");
			click(btn_update);
			waitFor(3000);
			assertTrue(btn_createUOM.isDisplayed(), "Uom is not edited");
			log.info("Executed clickOnUpdate Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnUpdate Not Successfully");
			e.printStackTrace();
			throw e;			
		}

	}

	public void verfiyEditUom(String unit) {
		try {
			log.info("Entered verfiyEditUom");	
			assertTrue(verfiry.getText().equalsIgnoreCase(unit), "UOM is edited but not not changed");
			log.info("Executed verfiyEditUom Successfully");
		} catch (Exception e) {
			log.error("Executed verfiyEditUom Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	// delete
	public void clickOnDeleteInDropdown() {
		try {
			log.info("Entered clickOnDeleteInDropdown");	
			waitUntilElementToBeClickable(lnk_deleteInDropdown);
			log.info("Clicking lnk_deleteInDropdown");
			click(lnk_deleteInDropdown);
			log.info("Executed clickOnDeleteInDropdown Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnDeleteInDropdown Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnDelete() {
		try {
			log.info("Entered clickOnDelete");	
			waitUntilElementToBeClickable(btn_delete);
			log.info("Clicking btn_delete");
			click(btn_delete);
			waitFor(3000);
			assertTrue(btn_createUOM.isDisplayed(), "UOM is not deleted");
			log.info("Executed clickOnDelete Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnDelete Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

}
