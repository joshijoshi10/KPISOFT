package pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import helper.LoggerHelper;

public class KpiLibraryPage extends BasePage {

	
	Logger log = LoggerHelper.getLogger(LoggerHelper.class);
	
	public KpiLibraryPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[text()=' KPI Library ']")
	private WebElement kpiLibrary_link;

	@FindBy(how = How.XPATH, using = "//h5[text()='KPI Library']")
	private WebElement KpiLibrary_header;

	@FindBy(how = How.XPATH, using = "//button[text()='Add KPI ']")
	private WebElement addKpi_btn;

	@FindBy(how = How.XPATH, using = "//input[@name='kpiLibName']")
	private WebElement kpiName_text;

	@FindBy(how = How.XPATH, using = "//input[@name='levOrgUnit']")
	private WebElement create_function_text;

	@FindBy(how = How.XPATH, using = "//button[@name='saveKpi']")
	private WebElement add_Btn;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-ellipsis-h'])[1]")
	private WebElement action_Btn;

	@FindBy(how = How.XPATH, using = "//li[text()='Edit ']")
	private WebElement edit_Btn;

	@FindBy(how = How.XPATH, using = "//button[text()=' Update Changes ']")
	private WebElement update_Btn;

	@FindBy(how = How.XPATH, using = "//li[text()='Push ']")
	private WebElement push_Btn;

	@FindBy(how=How.XPATH, using="//li[text()='Delete ']")
	private WebElement delete_Btn;

	@FindBy(how=How.XPATH, using="//button[text()='Delete']")
	private WebElement deleteKpi;

	@FindBy(how=How.XPATH, using="//div[@class='relative w-50']//input")
	private WebElement searchBox ;

	@FindBy(how=How.XPATH, using="//button[text()=' Search ']")
	private WebElement search_btn;

	@FindBy(how=How.XPATH, using="(//label[@class='mb-0'])[2]")
	private WebElement checkbox;

	@FindBy(how=How.XPATH, using="(//div[@class='b-b pb-2 w-100 mb-3 float-left align-v-center']//button)[1]")
	private WebElement pushKpi_Btn;

	@FindBy(how=How.ID, using="selectProgram")
	private WebElement kpiSearchbox;

	@FindBy(how=How.XPATH, using="//div[@class='ng2-auto-complete-wrapper']//ng2-auto-complete//ul//li")
	private List<WebElement> program_dropdown;

	@FindBy(how=How.XPATH, using="//input[@ng-reflect-name='emplSearch']")
	private WebElement empSearchbox;


	@FindBy(how=How.XPATH, using="//button[text()=' Assign to All Employees ']")
	private WebElement assign_btn;

	public void clickOnKpiLibrary() {
		try{
			log.info("Entered clickOnKpiLibrary succesfully");
			click(kpiLibrary_link);
		log.info("Executed clickOnKpiLibrary Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed clickOnKpiLibrary"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void verifykpiLibraryHeader(String expected) {
		try{
			log.info("Entered verifykpiLibraryHeader succesfully");
			implicitwaitFor(5);
			Assert.assertEquals(verifyData(expected, KpiLibrary_header), "Strings don't match!!");
		log.info("Executed verifykpiLibraryHeader Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed verifykpiLibraryHeader"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnAddKpi() {
		try{
			log.info("Entered clickOnAddKpi succesfully");
			click(addKpi_btn);
		log.info("Executed clickOnAddKpi Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed clickOnAddKpi"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void enterKPIName(String name) {
		try{log.info("Entered enterKPIName succesfully");
			waitUntilElementVisible(kpiName_text);
			clear(kpiName_text);
			writeText(kpiName_text, name);
		log.info("Executed enterKPIName Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed enterKPIName"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void createFunction(String function) {
		try{
			log.info("Entered createFunction succesfully");
			waitUntilElementVisible(create_function_text);
			writeText(create_function_text, function);
		log.info("Executed createFunction Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed createFunction"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnAdd() {
		try{
			log.info("Entered clickOnAdd succesfully");
			waitUntilElementToBeClickable(add_Btn);
			click(add_Btn);
		log.info("Executed clickOnAdd Successfully");
		}
		catch  (Exception e) 
		{
			log.error("Not Executed clickOnAdd"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickonActions() {
		try{
			log.info("Entered clickonActions succesfully");
			waitUntilElementToBeClickable(action_Btn);
			click(action_Btn);
		log.info("Executed clickonActions Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed clickonActions"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickonEdit() {
		try{
			log.info("Entered clickonEdit succesfully");
			waitUntilElementToBeClickable(edit_Btn);
			click(edit_Btn);
		log.info("Executed clickonEdit Successfully");
		} 
		catch  (Exception e)
		{
			log.error("Not Executed clickonEdit"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickonUpdate() {
		try{
			log.info("Entered clickonUpdate succesfully");
			waitFor(2000);
			click(update_Btn);
		log.info("Executed clickonUpdate Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed clickonUpdate"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	public void clickonDeleteActions() {
		try{
			log.info("Entered clickonDeleteActions succesfully");
			waitUntilElementToBeClickable(delete_Btn);
			click(delete_Btn);
		log.info("Executed clickonDeleteActions Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed clickonDeleteActions"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickonDeleteKpi()
	{
		try{
			log.info("Entered clickonDeleteKpi succesfully");
			waitUntilElementToBeClickable(deleteKpi);
			click(deleteKpi);
			waitFor(3000);
		log.info("Executed clickonDeleteKpi Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed clickonDeleteKpi"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void enterTextinSearchbox(String value)
	{
		try{
			log.info("Entered enterTextinSearchbox succesfully");
			waitUntilElementVisible(searchBox);
			writeText(searchBox, value);
		log.info("Executed enterTextinSearchbox Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed enterTextinSearchbox"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickonSearchButton()
	{
		try{
			log.info("Entered clickonSearchButton succesfully");
			implicitwaitFor(3);
			click(search_btn);
		log.info("Executed clickonSearchButton Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed clickonSearchButton");
			e.printStackTrace(); 
			throw e;
		}
	}
	public void selectKpi() {
		try{
			log.info("Entered selectKpi succesfully");
			click(checkbox);
		log.info("Executed selectKpi Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed selectKpi"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	public void clickOnPushKpi() {
		try{
			log.info("Entered clickOnPushKpi succesfully");
			click(pushKpi_Btn);
		log.info("Executed clickOnPushKpi Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed clickOnPushKpi"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	public void enterProgramName(String programName) {
		try{
			log.info("Entered enterProgramName succesfully");
			typeTextToGetDropdown(kpiSearchbox, programName, program_dropdown);
		log.info("Executed enterProgramName Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed enterProgramName"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void searchEmpName(String empId) {
		try{
			log.info("Entered searchEmpName succesfully");
			implicitwaitFor(3);
			writeText(empSearchbox, empId);
		log.info("Executed searchEmpName Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed searchEmpName");
			e.printStackTrace(); 
			throw e;
		}
	}
	public void clickOnAssign() {
		try{
			log.info("Entered clickOnAssign succesfully");
			implicitwaitFor(2);
			click(assign_btn);
		log.info("Executed clickOnAssign Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed clickOnAssign"); 
			e.printStackTrace(); 
			throw e;
		}
	}
}
