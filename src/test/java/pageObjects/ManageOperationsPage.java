package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.LoggerHelper;

public class ManageOperationsPage extends BasePage {

	Logger log = LoggerHelper.getLogger(LoggerHelper.class);
	
	public ManageOperationsPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(ManageOperationsPage.webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Manage Operations')]")
	private WebElement manageOperations_lnk;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Operation ')]")
	private WebElement addOperations_btn;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Name')]/following-sibling::input")
	private WebElement name_textField;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'External URL')]/following-sibling::input")
	private WebElement externalUrl_textfield;
	
	@FindBy(how=How.XPATH, using="//input[@name='pic']")
	private WebElement logo_Btn;
	
	@FindBy(how=How.XPATH, using="//label[contains(text(),'Select Operation ')]//..//select")
	private WebElement selectOperations_Dropdown;
	
	public void movetoManageOperations() {
		try{
			log.info("Entered movetoManageOperations succesfully");
			
			click(manageOperations_lnk);
			
		log.info("Executed movetoManageOperations Successfully");
		} 
		catch  (Exception e) 
		{
			
			log.error("Not Executed movetoManageOperations"); 
			e.printStackTrace(); 
			throw e;
			
		}
	}
	
	public void clickOnAddOperations() {
		try{
			log.info("Entered clickOnAddOperations succesfully");
			
			click(addOperations_btn);
			
		log.info("Executed clickOnAddOperations Successfully");
		} 
		catch  (Exception e) 
		{
			
			log.error("Not Executed clickOnAddOperations");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void enterOperationName(String name) {
		
		try{
			log.info("Entered enterOperationName succesfully");
			writeText(name_textField, name);
		log.info("Executed enterOperationName Successfully");
		} 
		catch  (Exception e) 
		{
			
			log.error("Not Executed enterOperationName"); 
			e.printStackTrace(); 
			throw e;
		}
		
	}
	public void enterUrl(String url) 
	{
		
		try{
			log.info("Entered enterUrl succesfully");
			writeText(externalUrl_textfield, url);
		log.info("Executed enterUrl Successfully");
		} 
		catch  (Exception e) 
		{
			
			log.error("Not Executed enterUrl");
			e.printStackTrace(); 
			throw e;
		}
		
	}
	public void selectOperationType(String type) 
	{
		try{
			log.info("Entered selectOperationType succesfully");
			setValueInDropdownText(selectOperations_Dropdown, type);
		log.info("Executed selectOperationType Successfully");
		} 
		catch  (Exception e) 
		{
		
			log.error("Not Executed selectOperationType"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void attachLogo(String file)
	{
		try{
			log.info("Entered attachLogo succesfully");
			logo_Btn.sendKeys(file);
		log.info("Executed attachLogo Successfully");
		} 
		catch  (Exception e)
		{
		
			log.error("Not Executed attachLogo"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	
}
