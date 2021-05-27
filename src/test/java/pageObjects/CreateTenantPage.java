package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import helper.LoggerHelper;

public class CreateTenantPage extends BasePage {

	public CreateTenantPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Add Tenant ')]")
	private WebElement AddTenant_Btn;

	@FindBy(how = How.LINK_TEXT, using = "Tenant")
	private WebElement lnk_tenant;

	@FindBy(how = How.XPATH, using = "//input[@name='orgName']")
	private WebElement tenant_txt;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Create Tenant')]")
	private WebElement cerateTenant_lbl;

	@FindBy(how = How.XPATH, using = "//input[@name='shortName']")
	private WebElement tenantShortName_txt;

	@FindBy(how = How.XPATH, using = "//div[@class='selected-list']")
	private WebElement language_Drp;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'App')]/..//select[@name='lanId']")
	private WebElement App_Drp;

	@FindBy(how = How.XPATH, using = "//select[@name='timeZone']")
	private WebElement time_Drp;

	@FindBy(how = How.XPATH, using = "//input[@name='firstname']")
	private WebElement firstName_txt;

	@FindBy(how = How.XPATH, using = "//input[@name='lastName']")
	private WebElement lastName_txt;

	@FindBy(how = How.XPATH, using = "//input[@name='displayName']")
	private WebElement displayName_txt;

	@FindBy(how = How.XPATH, using = "//input[@name='email']")
	private WebElement email_txt;

	@FindBy(how = How.XPATH, using = "//input[@name='baseUrl']")
	private WebElement tenantBaseUrl_txt;

	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	private WebElement userName_txt;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Create Tenant']")
	private WebElement createTenant_Btn;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Competency')]/../label/../input")
	private WebElement isCompetencySelected_chk;

	@FindBy(how = How.XPATH, using = "//span[text()='Select All']")
	private WebElement selectAll_chkBox;

	public void addTenant() {
		try {
			log.info("Entered addTenant");
			waitUntilElementToBeClickableRepeated(AddTenant_Btn, 2);
			if (AddTenant_Btn.isDisplayed()) {
				log.info("Clicking AddTenant_Btn");
				click(AddTenant_Btn);
				log.info("Clicked AddTenant_Btn");
			} else {
				System.out.println("skip");
			}
			log.info("Executed addTenant Successfully");
		} catch (Exception e) {
			log.error("Executed addTenant Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getTenantlink() {
		try {
			log.info("Entered getTenantlink");
			waitUntilElementToBeClickableRepeated(lnk_tenant, 2);
			log.info("Clicking on lnk_tenant");
			click(lnk_tenant);
			log.info("Clicked on lnk_tenant");
			log.info("Executed getTenantlink Successfully");
		} catch (Exception e) {
			log.error("Executed getTenantlink Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateCretaTenant() {
		try {
			log.info("Entered validateCretaTenant");
			log.info("Asserting on cerateTenant_lbl");
			Assert.assertEquals(cerateTenant_lbl.getText(), "Create Tenant",
					"Create Tenant lebel is not matching hence >> Failed");
			log.info("Asserted on cerateTenant_lbl");
			log.info("Executed validateCretaTenant Successfully");
		} catch (Exception e) {
			log.error("Executed validateCretaTenant Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void tenantName(String tenantName) {
		try {
			log.info("Entered tenantName");
			log.info("Writing tenantName "+tenantName);
			writeText(tenant_txt, tenantName);
			log.info("Written tenantName "+tenantName);
			log.info("Executed tenantName Successfully");
		} catch (Exception e) {
			log.error("Executed tenantName Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void language() {
		try {
			log.info("Entered language");
			waitUntilElementToBeClickableRepeated(language_Drp, 2);
			log.info("Clicking language_Drp");
			click(language_Drp);
			log.info("Clicked language_Drp");
			waitUntilElementToBeClickableRepeated(selectAll_chkBox, 2);
			log.info("Clicking selectAll_chkBox");
			click(selectAll_chkBox);
			log.info("Clicked selectAll_chkBox");
			waitUntilElementToBeClickableRepeated(language_Drp, 2);
			log.info("Clicking language_Drp");
			click(language_Drp);
			log.info("Clicked language_Drp");
			log.info("Executed language Successfully");
		} catch (Exception e) {
			log.error("Executed language Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void TenantShortName(String tenantShtName) {
		try {
			log.info("Entered TenantShortName");
			log.info("Writing tenantShortName_txt as "+tenantShtName);
			writeText(tenantShortName_txt, tenantShtName);
			log.info("Written tenantShortName_txt as "+tenantShtName);
			log.info("Executed TenantShortName Successfully");
		} catch (Exception e) {
			log.error("Executed TenantShortName Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void timeZone(String timeZone) {
		try {
			log.info("Entered timeZone");
			log.info("Setting timeZone " + timeZone);
			setValueInDropdownText(time_Drp, timeZone);
			log.info("Setting timeZone " + timeZone + " is done");
			log.info("Executed timeZone Successfully");
		} catch (Exception e) {
			log.error("Executed timeZone Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void selectApp(String app) {
		try {
			log.info("Entered selectApp");
			log.info("Setting selectApp as " + app);
			setValueInDropdownText(App_Drp, app);
			log.info("Setting selectApp as " + app + " is done");
			log.info("Executed selectApp Successfully");
		} catch (Exception e) {
			log.error("Executed selectApp Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void firstName(String firstName) {
		try {
			log.info("Entered firstName");
			writeText(firstName_txt, firstName);
			log.info("Executed firstName Successfully");
		} catch (Exception e) {
			log.error("Executed firstName Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void lastName(String lastName) {
		try {
			log.info("Entered lastName");
			writeText(lastName_txt, lastName);
			log.info("Executed lastName Successfully");
		} catch (Exception e) {
			log.error("Executed lastName Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void displayName(String displayName) {
		try {
			log.info("Entered displayName");
			log.info("Typing displayName " + displayName);
			writeText(displayName_txt, displayName);
			log.info("Typed displayName " + displayName);
			log.info("Executed displayName Successfully");
		} catch (Exception e) {
			log.error("Executed displayName Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void email(String email) {
		try {
			log.info("Entered email");
			log.info("Entering email " + email);
			writeText(email_txt, email);
			log.info("Entered email " + email);
			log.info("Executed email Successfully");
		} catch (Exception e) {
			log.error("Executed email Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void tenantBaseUrl(String tenanturl) {
		try {
			log.info("Entered tenantBaseUrl");
			log.info("Entering tenantBaseUrl " + tenanturl);
			writeText(tenantBaseUrl_txt, tenanturl);
			log.info("Entered tenantBaseUrl " + tenanturl);
			log.info("Executed tenantBaseUrl Successfully");
		} catch (Exception e) {
			log.error("Executed tenantBaseUrl Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void userName(String userName) {
		try {
			log.info("Entered userName");
			log.info("Typing userName " + userName);
			writeText(userName_txt, userName);
			log.info("Typed userName " + userName);
			log.info("Executed userName Successfully");
		} catch (Exception e) {
			log.error("Executed userName Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void createTenant() {
		try {
			log.info("Entered createTenant");
			log.info("Clicking createTenant_Btn");
			click(createTenant_Btn);
			log.info("Clicked createTenant_Btn");
			waitFor(3000);
			waitForPageLoad();
			Assert.assertTrue(waitForMessageLonger("Success"), "Success did not appear");
			log.info("Executed createTenant Successfully");
		} catch (Exception e) {
			log.error("Executed createTenant Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}



	public void isCompetencySelected() {
		try {
			log.info("Entered isCompetencySelected");
			log.info("Asserting isCompetencySelected_chk checked: " + isCompetencySelected_chk.isSelected());
			Assert.assertTrue(isCompetencySelected_chk.isSelected(), "Expected: Competancy check box check, Actual: Competancy checkbox unchecked");
		} catch (Exception e) {
			log.error("Executed isCompetencySelected Not Successfully");
			e.printStackTrace();
			throw e;
		}

	}
}
