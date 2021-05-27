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

public class JobGradepage extends BasePage 
{
	Logger log = LoggerHelper.getLogger(LoggerHelper.class);
	
	public JobGradepage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[text()='Job Grade']")
	private WebElement link_jobgrade_menu;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Job Grade')]")
	private WebElement btn_addjobgrade;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-secondary']")
	private WebElement btn_back;

	@FindBy(how = How.XPATH, using = "//input[@name='jobGradeName']")
	private WebElement txt_jobname;

	@FindBy(how = How.XPATH, using = "//input[@name='jobGradeNameLoc']")
	private WebElement txt_jobgarde_nameloc;

	@FindBy(how = How.XPATH, using = "//input[@name='jobGradeCat']")
	private WebElement txt_jobgrade_cat;

	@FindBy(how = How.XPATH, using = "//input[@name='jobGradeDesc']")
	private WebElement txt_jobgrade_descrp;

	@FindBy(how = How.XPATH, using = "//input[@name='jobGradeDescLoc']")
	private WebElement txt_jobgrade_descrploc;

	@FindBy(how = How.XPATH, using = "//input[@name='jobGradeCode']")
	private WebElement txt_jobgradecode;

	@FindBy(how = How.XPATH, using = "//input[@name='jobGradeLev']")
	private WebElement txt_jobgradelevel;

	@FindBy(how = How.XPATH, using = "//button[.=' Add ']")
	private WebElement btn_jodadd;

	@FindBy(how = How.XPATH, using = "//button[.=' Cancel  ']")
	private WebElement btn_jobgradecancel;

	@FindBy(how = How.XPATH, using = "((//div[@class='w-100 float-left mt-3']/div)[last()-1]/div)[last()]/h6/i")
	private WebElement btn_more;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Edit')]")
	private WebElement btn_grade_edit;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Delete')]")
	private WebElement btn1_grade_delete;

	@FindBy(how = How.XPATH, using = "//button[.='Update Changes ']")
	private WebElement btn_grade_update;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Delete')]")
	private WebElement btn2_grade_delete;

	@FindBy(how = How.XPATH, using = "//input[@id='gradeAutoComplete']")
	private WebElement txt_altergrade;

	@FindBy(how = How.XPATH, using = "//div[@class='ng2-auto-complete-wrapper']//ng2-auto-complete//ul//li")
	private List<WebElement> txt_altergradedropdown;

	@FindBy(how = How.XPATH, using = "//div[@class='w-100 float-left p-md-2 grid-details']/div[1]")
	private List<WebElement> list_of_grade;

	// for alternative
	@FindBy(how = How.XPATH, using = "//a[.='Employees']")
	private WebElement link_employee;

	@FindBy(how = How.XPATH, using = "((//div[@class='w-100 float-left mt-3']/div)[last()-1]/div)[last()]/h6/i")
	private WebElement btn_employeemore;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Edit Profile')]")
	private WebElement btn_edit_profile;

	@FindBy(how = How.XPATH, using = "//input[@name='gradeModel']")
	private WebElement txt_addjobgradetoemloyee;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement btn_updateemployee;

	public void clickOnjobGradeLink() {
		try{
			log.info("Entered clickOnjobGradeLink succesfully");
			click(link_jobgrade_menu);
			waitFor(2000);
			log.info("Executed clickOnjobGradeLink Successfully");
		}
		catch (Exception e) 
		{
			log.error("Not Executed clickOnjobGradeLink");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnaddJobGrade() {
		try{
			log.info("Entered clickOnaddJobGrade succesfully");
			click(btn_addjobgrade);
			log.info("Executed clickOnaddJobGrade Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed clickOnaddJobGrade");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void entergradeName(String string) {
		try{
			log.info("Entered entergradeName succesfully");
			writeText(txt_jobname, string);
			log.info("Executed entergradeName Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed entergradeName");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void entergradeNameloc(String string) {
		try{
			log.info("Entered entergradeNameloc succesfully");
			writeText(txt_jobgarde_nameloc, string);
			log.info("Executed entergradeNameloc Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed entergradeNameloc");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void entergradecat(String string) {
		try{
			log.info("Entered entergradecat succesfully");
			writeText(txt_jobgrade_cat, string);
			log.info("Executed entergradecat Successfully");
		} 
		catch (Exception e) {
			log.error("Not Executed entergradecat");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void entergradeDescp(String string) {
		try{log.info("Entered entergradeDescp succesfully");
		writeText(txt_jobgrade_descrp, string);
		log.info("Executed entergradeDescp Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed entergradeDescp");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void entergradeDescrploc(String string) {
		try{
			log.info("Entered entergradeDescrploc succesfully");
			writeText(txt_jobgrade_descrploc, string);
			log.info("Executed entergradeDescrploc Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed entergradeDescrploc");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void entergradeCode(String string) {
		try{
			log.info("Entered entergradeCode succesfully");
			writeText(txt_jobgradecode, string);
			log.info("Executed entergradeCode Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed entergradeCode");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void entergradeLevel(String string) {
		try{
			log.info("Entered entergradeLevel succesfully");
			writeText(txt_jobgradelevel, string);
			log.info("Executed entergradeLevel Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed entergradeLevel");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickonaddGrade() {
		try{
			log.info("Entered clickonaddGrade succesfully");
			click(btn_jodadd);
			assertTrue(btn_addjobgrade.isDisplayed(), "add job grade is failed");
			log.info("Executed clickonaddGrade Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed clickonaddGrade");
			e.printStackTrace();
			throw e;
		}
	}

	public void moreOption() {
		try{
			log.info("Entered moreOption succesfully");
			waitUntilElementToBeClickable(btn_more);
			click(btn_more);
			log.info("Executed moreOption Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed moreOption");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickongradeBack() {
		try{
			log.info("Entered clickongradeBack succesfully");
			click(btn_back);
			log.info("Executed clickongradeBack Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed clickongradeBack");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void gradeCancel() {
		try{
			log.info("Entered gradeCancel succesfully");
			click(btn_jobgradecancel);
			log.info("Executed gradeCancel Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed gradeCancel");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickonedit() {
		try{
			log.info("Entered clickonedit succesfully");
			click(btn_grade_edit);
			log.info("Executed clickonedit Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed clickonedit");
			e.printStackTrace(); 
			throw e;
		}

	}

	public void clickondeleteInDropdown() {
		try{
			log.info("Entered clickondeleteInDropdown succesfully");
			click(btn1_grade_delete);
			log.info("Executed clickondeleteInDropdown Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed clickondeleteInDropdown");
			e.printStackTrace(); 
			throw e;
		}

	}

	public void clickOndeleteBtn() {
		try{
			log.info("Entered clickOndeleteBtn succesfully");
			waitFor(2000);
			click(btn2_grade_delete);
			assertTrue(btn_addjobgrade.isDisplayed(), "delete job garde is failed");
			log.info("Executed clickOndeleteBtn Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed clickOndeleteBtn");
			e.printStackTrace(); 
			throw e;
		}

	}

	public void clickOnupdateChanges() {
		try{
			log.info("Entered clickOnupdateChanges succesfully");
			click(btn_grade_update);
			assertTrue(btn_addjobgrade.isDisplayed(), "edit  job grade is failed");
			log.info("Executed clickOnupdateChanges Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed clickOnupdateChanges");
			e.printStackTrace(); 
			throw e;
		}
	}

	// Alternative job grade
	public void clickOnemployeeLink() {
		try{
			log.info("Entered clickOnemployeeLink succesfully");
			click(link_employee);
			log.info("Executed clickOnemployeeLink Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed clickOnemployeeLink");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnemployeeMore() {
		try{
			log.info("Entered clickOnemployeeMore succesfully");
			waitUntilElementToBeClickable(btn_more);
			click(btn_more);
			log.info("Executed clickOnemployeeMore Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed clickOnemployeeMore");
			e.printStackTrace(); throw e;
		}
	}

	public void clickOneditEmployee() {
		try{
			log.info("Entered clickOneditEmployee succesfully");
			click(btn_edit_profile);
			log.info("Executed clickOneditEmployee Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed clickOneditEmployee");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void addJobGradeToEmployee(String type1) {
		try{
			log.info("Entered addJobGradeToEmployee succesfully");
			System.out.println(type1);
			txt_addjobgradetoemloyee.clear();
			//typeTextToGetDropdown(txt_addjobgradetoemloyee, type1, txt_altergradedropdown);
			clear(txt_addjobgradetoemloyee);
			writeText(txt_addjobgradetoemloyee, type1);
			waitFor(1000);
			typeDownKey(txt_addjobgradetoemloyee);
			waitFor(1000);
			typeEnterKey(txt_addjobgradetoemloyee);			
			click(btn_updateemployee);
			waitFor(2000);
			log.info("Executed addJobGradeToEmployee Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed addJobGradeToEmployee");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void enterAlterJobGrade(String type2) {
		try{
			log.info("Entered enterAlterJobGrade succesfully");
			scroll(webDriver, "down");
			//typeTextToGetDropdown(txt_altergrade, type2, txt_altergradedropdown);
			clear(txt_altergrade);
			writeText(txt_altergrade, type2);
			waitFor(1000);
			typeDownKey(txt_altergrade);
			waitFor(1000);
			typeEnterKey(txt_altergrade);			

			waitFor(3000);
			click(btn2_grade_delete);
			assertTrue(btn_addjobgrade.isDisplayed(), "delete job grade is failed");
			log.info("Executed enterAlterJobGrade Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed enterAlterJobGrade");
			e.printStackTrace(); 
			throw e; 
		}
	}

	public void removeJobGrade() {
		try{
			log.info("Entered removeJobGrade succesfully");
			typeDeleteToClearTextInDropdown(txt_addjobgradetoemloyee);
			waitUntilElementToBeClickable(btn_updateemployee);
			click(btn_updateemployee);
			waitFor(3000);
			log.info("Executed removeJobGrade Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed removeJobGrade");
			e.printStackTrace(); 
			throw e;
		}
	}
}
