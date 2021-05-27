package pageObjects;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import helper.LoggerHelper;

public class PasswordPolicyPage extends BasePage 
{

	Logger log = LoggerHelper.getLogger(LoggerHelper.class);
	
	public PasswordPolicyPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Password Policy')]")
	private WebElement passwordPolicy_lnk;
	
	@FindBy(how=How.XPATH, using="//label[contains(text(),'Minimum Password Length')]/following-sibling::input")
	private WebElement minimumPassword_txtField;
	
	@FindBy(how=How.XPATH, using="//label[contains(text(),'Maximum Password Length')]/following-sibling::input")
	private WebElement maximumPassword_txtField;
	
	@FindBy(how=How.XPATH, using="//label[contains(text(),'Minimum Number Length')]/following-sibling::input")
	private WebElement minimumNumber_txtField;
	
	@FindBy(how=How.XPATH, using="//label[contains(text(),'Minimum Upper Case Letters')]/following-sibling::input")
	private WebElement minimumUpperCaseletters_txtfield;
	
	@FindBy(how=How.XPATH, using="//label[contains(text(),'Minimum Lower Case Letters')]/following-sibling::input")
	private WebElement minimumLowerCaseletters_txtfield;
	
	@FindBy(how=How.XPATH, using="//label[contains(text(),'Minimum Special Characters')]/following-sibling::input")
	private WebElement minimumSpecialletters_txtfield;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Save')]")
	private WebElement save_btn;
	
	@FindBy(how=How.XPATH, using="//i[@class='fonticon-home m-2']")
	private WebElement homeIcon_btn;
	
	
	
		public void moveToPasswordPolicy() {
		try {
			log.info("moving to password policy!!");
			click(passwordPolicy_lnk);
			log.info("moved to password policy!!");
		} catch (Exception e) {
			log.error("error moving to password policy!!");
			e.printStackTrace();
			throw e;
			
		}
	}
		public void enterMinimumPasswordLength(String minimumPwd) 
		{
			try {
				log.info("entering the minimum password length!!");
				writeText(minimumPassword_txtField, minimumPwd);
				log.info("entered the minimum password length!!");
			} catch (Exception e) {
				log.error("error entering the minimum pwd length!!");
				e.printStackTrace();
				throw e;
			}
		}
		public void enterMaximumPasswordLength(String maximumPwd) {
			try {
				log.info("entering the maximum password length!!");
				writeText(maximumPassword_txtField, maximumPwd);
				log.info("entered the maximum password length!!");
			} catch (Exception e) {
				log.error("error entering the maximum pwd length!!");
				e.printStackTrace();
				throw e;
			}
		}
		public void enterMinimumNumberLength(String minimumNum) {
			try {
				log.info("entering the minimum Number length!!");
				writeText(minimumNumber_txtField, minimumNum);
				log.info("entered the minimum Number length!!");
			} catch (Exception e) {
				log.error("error entering the minimum Number length!!");
				e.printStackTrace();
				throw e;
			}
		}
			
		public void enterMinimumUpperCase(String minUpperCase) {
			try {
				
				log.info("entering the minimum upper case");
				writeText(minimumUpperCaseletters_txtfield, minUpperCase);
				log.info("entered the minimum upper case");
			} catch (Exception e) {
				log.error("error enterMinimumUpperCaseh!!");
				e.printStackTrace();
				throw e;
			}
		}
		public void enterMinimumLowerCase(String minLowerCase) {
			try {
				log.info("entering the minimum lower case");
				writeText(minimumLowerCaseletters_txtfield, minLowerCase);
				log.info("entered the minimum lower case");
			} catch (Exception e) {
				log.error("error enterMinimumLowerCase!!");
				e.printStackTrace();
				throw e;
			}
		}
		public void enterMinimumSpecialLetters(String minSpecial) {
			try {
				log.info("entering the minimum special letters");
				writeText(minimumSpecialletters_txtfield, minSpecial);
				log.info("entered the minimum special letters");
			} catch (Exception e) {
				log.error("error enterMinimumSpecialLetters!!");
				e.printStackTrace();
				throw e;
			}
		}
		
		public void clickOnHome() {
			try {
				log.info("enterted clickOnHome!!");
				clickOnElementByJs(homeIcon_btn);
				log.info("excuted clickOnHome!!");
			} catch (Exception e) {
				log.error("error clickOnHome!!");
				e.printStackTrace();
				throw e;
			}
		}
		
		
		
		}
	

