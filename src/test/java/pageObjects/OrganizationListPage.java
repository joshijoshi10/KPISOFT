package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.LoggerHelper;

import java.util.List;

public class OrganizationListPage extends BasePage {

	Logger log = LoggerHelper.getLogger(LoggerHelper.class);

	public OrganizationListPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);

	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Organization Units')]")
	private WebElement mnu_Organization;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Org Unit')]")
	private WebElement btn_AddOrgUnit;

	@FindBy(how = How.XPATH, using = "//addparentorganization//input[@placeholder='Organization Name']")
	private WebElement txtBx_OrgName;

	@FindBy(how = How.XPATH, using = "//addparentorganization//input[@placeholder='Organization Code']")
	private WebElement txtBx_OrgCode;

	@FindBy(how = How.XPATH, using = "//addparentorganization//input[@placeholder='Type and choose Organization Type']")
	private WebElement txtBx_OrgType;

	@FindBy(how = How.XPATH, using = "Type and choose the HOU")
	private WebElement txtBx_OrgHOU;

	@FindBy(how = How.XPATH, using = "Type and choose the HR SPOC")
	private WebElement txtBx_OrgHRSPOC;

	@FindBy(how = How.XPATH, using = "//addparentorganization//button[contains(text(),'Add')]")
	private WebElement btn_AddOrg;

	@FindBy(how = How.XPATH, using = "//addparentorganization//button[contains(text(),'Close')]")
	private WebElement btn_CancelOrg;

	@FindBy(how = How.XPATH, using = "//div[@class='w-100 float-left text-13x']//div[1]//org[1]//div[1]//div[1]//div[1]//div[1]//p[1]")
	private WebElement lbl_DefaultParentOrgUnit;

	@FindBy(how = How.XPATH, using = "//toolsmenu//h5[contains(text(),'Organization Units')]")
	private WebElement lbl_orgUnitPage;

	@FindBy(how = How.XPATH, using = "//addparentorganization//div[@class='modal-header']")
	private WebElement mdLbl_AddNewOrgUnit;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Name')]//span")
	private WebElement mdLbl_OrgNameMand;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Code')]//span")
	private WebElement mdLbl_OrgCodeMand;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Org Unit Type')]//span")
	private WebElement mdLbl_OrgUnitTypeMand;

	@FindBy(how = How.XPATH, using = "//div[@class='ng2-auto-complete-wrapper']//ng2-auto-complete//ul//li")
	private List<WebElement> dd_OrgType;

	public void getOrganizationLink() {
		try{
			log.info("Entered getOrganizationLink succesfully");
			/* Clicking on Organization Menu Link in EPMS-Admin Page */
			click(mnu_Organization);
			log.info("Executed getOrganizationLink Successfully");
		} 
		catch  (Exception e)
		{
			log.error("Not Executed getOrganizationLink"); 
			e.printStackTrace();
			throw e;
		}
	}

	public void getAddOrgUnit() {
		try{
			log.info("Entered getAddOrgUnit succesfully");
			/*
			 * Clicking on Add OrgUnit Button from Organization Menu Link in EPMS-Admin Page
			 */
			click(btn_AddOrgUnit);
			log.info("Executed getAddOrgUnit Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed getAddOrgUnit"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void geTypeIntoOrgName(String OrgName) {
		try{
			log.info("Entered geTypeIntoOrgName succesfully");
			/* Writing Text into OrgName */
			writeText(txtBx_OrgName, OrgName);
			log.info("Executed geTypeIntoOrgName Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed geTypeIntoOrgName"); 
			e.printStackTrace();
			throw e;
		}
	}

	public void getTypeIntoOrgCode(String OrgCode) {
		try{
			log.info("Entered getTypeIntoOrgCode succesfully");
			/* Writing Text into OrgCode */
			writeText(txtBx_OrgCode, OrgCode);
			log.info("Executed getTypeIntoOrgCode Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed getTypeIntoOrgCode"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void getTypeIntoOrgType(String OrgType) {
		try{
			log.info("Entered getTypeIntoOrgType succesfully");
			/* Writing Text into OrgType */
			// writeText(txtBx_OrgType,OrgType);
			typeTextToGetDropdown(txtBx_OrgType, OrgType, dd_OrgType);
			log.info("Executed getTypeIntoOrgType Successfully");
		} 
		catch  (Exception e)
		{
			log.error("Not Executed getTypeIntoOrgType");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void getTypeIntoHOU(String OrgHOU) 
	{
		try{log.info("Entered getTypeIntoHOU succesfully");
		/* Writing Text into OrgHOU */
		writeText(txtBx_OrgHOU, OrgHOU);
		log.info("Executed getTypeIntoHOU Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed getTypeIntoHOU"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void getTypeIntoHRSPOC(String HRSPOC) {
		try{
			log.info("Entered getTypeIntoHRSPOC succesfully");
			/* Writing Text into OrgHOU */
			writeText(txtBx_OrgHRSPOC, HRSPOC);
			log.info("Executed getTypeIntoHRSPOC Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed getTypeIntoHRSPOC"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void getAddNewOrgUnit() {
		try{
			log.info("Entered getAddNewOrgUnit succesfully");
			/* Click on Add new Org Creation */
			click(btn_AddOrg);
			log.info("Executed getAddNewOrgUnit Successfully");
		}
		catch  (Exception e) 
		{
			log.error("Not Executed getAddNewOrgUnit");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void getCancelNewOrgUnit() {
		try{
			log.info("Entered getCancelNewOrgUnit succesfully");
			/* Click on Cancel new Org Creation */
			click(btn_CancelOrg);
			log.info("Executed getCancelNewOrgUnit Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed getCancelNewOrgUnit");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void getVerifyDefaultParentOrgUnit(String DefaultParentOrg) {
		try{
			log.info("Entered getVerifyDefaultParentOrgUnit succesfully");
			/* Verify Parent Org */
			softAssert(lbl_DefaultParentOrgUnit, DefaultParentOrg);
			log.info("Executed getVerifyDefaultParentOrgUnit Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed getVerifyDefaultParentOrgUnit"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void getWhichpageamIIn(String PageName) {
		try{
			log.info("Entered getWhichpageamIIn succesfully");
			softAssert(lbl_orgUnitPage, PageName);
			log.info("Executed getWhichpageamIIn Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed getWhichpageamIIn"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void getOrgTemplateLoaded() {
		try{
			log.info("Entered getOrgTemplateLoaded succesfully");
			lbl_orgUnitPage.isDisplayed();
			log.info("Executed getOrgTemplateLoaded Successfully");
		} 
		catch  (Exception e) {
			log.error("Not Executed getOrgTemplateLoaded");
			e.printStackTrace();
			throw e;
		}
	}

	public void getAllNewOrgMandatoryandNonMandatoryField() {
		try{
			log.info("Entered getAllNewOrgMandatoryandNonMandatoryField succesfully");
			softAssert(mdLbl_OrgUnitTypeMand, "*");
			softAssert(mdLbl_OrgCodeMand, "*");
			softAssert(mdLbl_OrgNameMand, "*");
			log.info("Executed getAllNewOrgMandatoryandNonMandatoryField Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed getAllNewOrgMandatoryandNonMandatoryField"); 
			e.printStackTrace(); 
			throw e;
		}
	}

}
