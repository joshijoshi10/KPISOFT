package pageObjects;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.LoggerHelper;

public class PositionPage extends BasePage {

	Logger log = LoggerHelper.getLogger(LoggerHelper.class);

	public PositionPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[.='Position']")
	private WebElement lnk_position;

	@FindBy(how = How.XPATH, using = "//button[starts-with(.,'Add')]")
	private WebElement btn_addposition;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Code']")
	private WebElement btn_positioncode;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	private WebElement txt_positionname;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name locale']")
	private WebElement txt_positionnameloc;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Description']")
	private WebElement txt_positiondesc;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Description Locale']")
	private WebElement txt_positiondescloc;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Level']")
	private WebElement txt_positionlevel;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add')]")
	private WebElement txt_positionadd;

	@FindBy(how = How.XPATH, using = "//button[.=' Cancel  ']")
	private WebElement txt_positioncancel;

	@FindBy(how = How.XPATH, using = "//button[text()=' Back ']")
	private WebElement txt_positionback;

	@FindBy(how = How.XPATH, using = "((//div[@class='w-100 float-left mt-3']/div)[last()-1]/div)[last()]/h6/i")
	private WebElement lnk_more;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Delete')]")
	private WebElement btn_deletedropdown;

	@FindBy(how = How.XPATH, using = "//button[.='Delete']")
	private WebElement btn_delete;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),' Edit')]")
	private WebElement btn_editdropdown;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Update Changes')]")
	private WebElement btn_edit;

	@FindBy(how = How.XPATH, using = "//a[.='Employees']")
	private WebElement lnk_employee;

	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Edit Profile']")
	private WebElement btn_editprofile;

	@FindBy(how = How.ID, using = "position")
	private WebElement txt_postion;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Update Employee']")
	private WebElement btn_updateemployee;

	@FindBy(how = How.XPATH, using = "//div[@class='ng2-auto-complete-wrapper']//ng2-auto-complete//ul//li")
	private List<WebElement> position_list_dropdown;

	public void clickOnPosition() {
		try{
			log.info("Entered clickOnPosition succesfully");
			waitUntilElementToBeClickable(lnk_position);
			click(lnk_position);
			log.info("Executed clickOnPosition Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed clickOnPosition");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnAddPosition() {
		try{
			log.info("Entered clickOnAddPosition succesfully");
			waitUntilElementToBeClickable(btn_addposition);
			click(btn_addposition);
			log.info("Executed clickOnAddPosition Successfully");
		} 
		catch  (Exception e)
		{

			log.error("Not Executed clickOnAddPosition");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterCode(String code) {
		try{
			log.info("Entered enterCode succesfully");
			writeText(btn_positioncode, code);
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
			writeText(txt_positionname, name);
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
		try{
			log.info("Entered enterNameloc succesfully");
			writeText(txt_positionnameloc, nameloc);
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
			writeText(txt_positiondesc, desc);
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
			writeText(txt_positiondescloc, descloc);
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
			writeText(txt_positionlevel, level);
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
			waitUntilElementToBeClickable(txt_positionadd);
			click(txt_positionadd);
			waitFor(3000);
			assertTrue(btn_addposition.isDisplayed(), "position is not added");
			log.info("Executed clickOnAdd Successfully");
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed clickOnAdd");
			e.printStackTrace();
			throw e;
		}
	}

	// edit
	public void clickOnMore() {
		try{
			log.info("Entered clickOnMore succesfully");
			waitUntilElementToBeClickable(lnk_more);
			click(lnk_more);
			log.info("Executed clickOnMore Successfully");
		}
		catch  (Exception e) 
		{

			log.error("Not Executed clickOnMore");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnEditInDropdown() {
		try{
			log.info("Entered clickOnEditInDropdown succesfully");
			waitUntilElementToBeClickable(btn_editdropdown);
			click(btn_editdropdown);
			log.info("Executed clickOnEditInDropdown Successfully");
		}
		catch  (Exception e) 
		{

			log.error("Not Executed clickOnEditInDropdown");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnEdit() {
		try{
			log.info("Entered clickOnEdit succesfully");
			waitUntilElementToBeClickable(btn_edit);
			click(btn_edit);
			assertTrue(btn_addposition.isDisplayed(), "position is not edited");
			log.info("Executed clickOnEdit Successfully");
		}
		catch  (Exception e) 
		{

			log.error("Not Executed clickOnEdit");
			e.printStackTrace();
			throw e;
		}
	}

	// delete
	public void clickOnDeleteInDropdown() {
		try{
			log.info("Entered clickOnDeleteInDropdown succesfully");
			waitUntilElementToBeClickable(btn_deletedropdown);
			click(btn_deletedropdown);
			waitFor(3000);
			log.info("Executed clickOnDeleteInDropdown Successfully");
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed clickOnDeleteInDropdown");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnDelete() {
		try{
			log.info("Entered clickOnDelete succesfully");
			waitUntilElementToBeClickable(btn_delete);
			click(btn_delete);
			assertTrue(btn_addposition.isDisplayed(), "position is not deleted");
			log.info("Executed clickOnDelete Successfully");
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed clickOnDelete");
			e.printStackTrace();
			throw e;
		}
	}

	// delete with alternative
	public void clickOnEmployee() {
		try{
			log.info("Entered clickOnEmployee succesfully");
			waitUntilElementToBeClickable(lnk_employee);
			click(lnk_employee);
			log.info("Executed clickOnEmployee Successfully");
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed clickOnEmployee");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnEditProfile() {
		try{
			log.info("Entered clickOnEditProfile succesfully");
			scroll(webDriver, "down");
			waitUntilElementToBeClickable(lnk_more);
			click(lnk_more);
			waitUntilElementToBeClickable(btn_editprofile);
			click(btn_editprofile);
			waitFor(3000);
			log.info("Executed clickOnEditProfile Successfully");
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed clickOnEditProfile");
			e.printStackTrace();
			throw e;
		}
	}

	public void addPositionToEmployee(String addposition) {
		try{
			log.info("Entered addPositionToEmployee succesfully");
			waitFor(2000);
			txt_postion.clear();
			typeTextToGetDropdown(txt_postion, addposition, position_list_dropdown);
			waitFor(2000);
			log.info("Executed addPositionToEmployee Successfully");
		} 
		catch  (Exception e)
		{

			log.error("Not Executed addPositionToEmployee");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnsaveEmployees() {
		try{

			log.info("Entered clickOnsaveEmployees succesfully");
			waitUntilElementToBeClickable(btn_updateemployee);
			click(btn_updateemployee);
			waitFor(3000);
			log.info("Executed clickOnsaveEmployees Successfully");
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed clickOnsaveEmployees");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterAlternative(String alterposition) {
		try{

			log.info("Entered enterAlternative succesfully");
			typeTextToGetDropdown(txt_postion, alterposition, position_list_dropdown);
			waitFor(2000);
			log.info("Executed enterAlternative Successfully");
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed enterAlternative");
			e.printStackTrace();
			throw e;
		}
	}

	public void removePosition() {
		try{
			log.info("Entered removePosition succesfully");
			waitUntilElementToBeClickable(lnk_more);
			click(lnk_more);
			waitUntilElementToBeClickable(btn_editprofile);
			click(btn_editprofile);
			waitFor(3000);
			txt_postion.clear();
			log.info("Executed removePosition Successfully");
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed removePosition");
			e.printStackTrace();
			throw e;
		}
	}

}
