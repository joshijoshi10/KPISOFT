package pageObjects;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import helper.LoggerHelper;

public class LoginPage extends BasePage {

	String baseURL;
	Logger log = LoggerHelper.getLogger(LoggerHelper.class);
	public LoginPage(WebDriver webDriver,String baseURL){
		super(webDriver);
		this.baseURL = baseURL;
		PageFactory.initElements(webDriver,this);
	}

	@FindBy(how = How.NAME, using = "username")
	private WebElement txtBx_Username;

	@FindBy(how = How.NAME, using = "password")
	private  WebElement txtBx_Password;

	@FindBy(how = How.XPATH, using = "//button[normalize-space() = 'Login']")
	private  WebElement btn_LogIn;

	@FindBy(how=How.XPATH, using="//button[contains(text(),'Sign in with Google')]")
	private WebElement signInWithGoogle_lnk;

	@FindBy(how=How.XPATH, using="//div[text()='Sign in with Google']")
	private WebElement signInWithGoogle_lbl;

	@FindBy(how=How.XPATH, using="//div[contains(text(),'To continue, Google will share your name,')]")
	private WebElement googlePrivacy_txt;

	@FindBy(how=How.XPATH, using="//input[@type='email']")
	private WebElement googleEmail_txtField;

	@FindBy(how=How.XPATH, using="//span[text()='Next']")
	private WebElement next_btn;

	@FindBy(how=How.XPATH, using="//input[@type='password']")
	private WebElement googlePassword_txtField;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"toast-container\"]/div/div/span")
	private WebElement toast_message;
	

	public void enter_Username(){
		try{
			log.info("Entered enter_Username succesfully");
			String username;
			 String userKey;
			 String targetEnv;
			 
			    FileReader reader = null;
				try {
					reader = new FileReader("src/test/resources/configs/Environment.properties");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}  	      
			    Properties p=new Properties();  
			    try {
					p.load(reader);
				} catch (IOException e) {
					e.printStackTrace();
				}  
			      targetEnv = p.getProperty("target_env");
//			      
			      userKey = targetEnv+"_AdminUsername";
			      username = p.getProperty(userKey);
			txtBx_Username.clear();
			txtBx_Username.sendKeys(username);		
			log.info("Executed enter_Username Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed enter_Username"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void enter_Password(){
		try{
			log.info("Entered enter_Password succesfully");
			 String password;
			 String passKey;
			 String targetEnv;

			    FileReader reader = null;
				try {
					reader = new FileReader("src/test/resources/configs/Environment.properties");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}  
			      
			    Properties p=new Properties();  
			    try {
					p.load(reader);
				} catch (IOException e) {
					e.printStackTrace();
				}  
			      targetEnv = p.getProperty("target_env");
 
			      passKey = targetEnv+"_AdminPassword";
			      password = p.getProperty(passKey);
			      
			    System.out.println(p.getProperty("password")); 
			txtBx_Password.clear();
			txtBx_Password.sendKeys(password);
			log.info("Executed enter_Password Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed enter_Password");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickSubmitButton(){
		try{
			log.info("Entered clickSubmitButton succesfully");
			btn_LogIn.click();
			waitForMessageLonger("Logout");
			waitForMessageLonger("Logout");
			waitFor(2000);
			log.info("Executed clickSubmitButton Successfully");
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed clickSubmitButton"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void goToLoginPage(){
		try{
			log.info("Entered goToLoginPage succesfully");	
//			webDriver.get(baseURL);
			webDriver.get(baseURL);
			log.info("Executed goToLoginPage Successfully");
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed goToLoginPage"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	

	
	public void txtBx_Username(String username) {
		try{
			log.info("Entered TxtBx_Username succesfully");
			txtBx_Username.clear();
			txtBx_Username.sendKeys(username);
			log.info("Executed TxtBx_Username Successfully");
		} 
		catch  (Exception e)
		{
			log.error("Not Executed TxtBx_Username"); 
			e.printStackTrace(); 
			throw e;

		}
	}
	
	public void txtBx_password(String password) {
		try{
			log.info("Entered TxtBx_password succesfully");
			txtBx_Password.clear();
			txtBx_Password.sendKeys(password);
			log.info("Executed TxtBx_password Successfully");
		} 
		catch  (Exception e)
		{
			log.error("Not Executed TxtBx_password"); 
			e.printStackTrace(); 
			throw e;

		}
	}

	public void clickOnSignInWithGoogle() {
		try{
			log.info("Entered clickOnSignInWithGoogle succesfully");

			waitUntilElementVisible(signInWithGoogle_lnk);
			click(signInWithGoogle_lnk);

			log.info("Executed clickOnSignInWithGoogle Successfully");
		} 
		catch  (Exception e)
		{
			log.error("Not Executed clickOnSignInWithGoogle"); 
			e.printStackTrace(); 
			throw e;

		}
	}

	public boolean verifySignWithGooglePage(String expectedtitle) {
		try{
			log.info("Entered verifySignWithGooglePage succesfully");
			String actualTitle=webDriver.getTitle();
			if(actualTitle.equals(expectedtitle))
			{
				log.info("Executed verifySignWithGooglePage Successfully");
				return true;

			}
			else
			{
				log.info("Executed verifySignWithGooglePage Successfully");
				return false;
			}

		} 
		catch  (Exception e) 
		{

			log.error("Not Executed verifySignWithGooglePage");	
			e.printStackTrace(); 
			throw e;

		}
	}

	public void enterGoogleEmail(String email) {
		try{
			log.info("Entered enterGoogleEmail succesfully");
			writeText(googleEmail_txtField, email);
			waitFor(1000);
			log.info("Executed enterGoogleEmail Successfully");
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed enterGoogleEmail"); 
			e.printStackTrace(); 
			throw e;

		}
	}

	public void clickOnNext() {
		try{
			log.info("Entered clickOnNext succesfully");	
			click(next_btn);	
			waitFor(1000);
			log.info("Executed clickOnNext Successfully");
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed clickOnNext"); 
			e.printStackTrace(); 
			throw e;
		}

	}
	public void enterGooglePassword(String password) {
		try{
			log.info("Entered enterGooglePassword succesfully");			
			writeText(googleEmail_txtField, password);			
			waitFor(1000);
			log.info("Executed enterGooglePassword Successfully");
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed enterGooglePassword"); 
			e.printStackTrace(); 
			throw e;

		}
	}
	public void verifyKpisoftUrl() {
		try{
			log.info("Entered verifyKpisoftUrl succesfully");
			String url=webDriver.getCurrentUrl();
			String [] urlSplit=url.split(".");
			System.out.println(urlSplit);
			log.info("Executed verifyKpisoftUrl Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed verifyKpisoftUrl"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	public void clickOnLoginAndVerifyErrorMessage(String expected) {
		try{
			log.info("Entered clickOnLoginAndVerifyErrorMessage succesfully");
			btn_LogIn.click();
			Assert.assertTrue(waitForMessage(expected),
					"Error message did not appear: "+expected);
			log.info("Executed clickOnLoginAndVerifyErrorMessage Successfully");
			waitFor(3000);
//			closeWebBrowser();
//			webDriver.close();
//			webDriver.quit();
		}
		catch  (Exception e) 
		{

			log.error("Not Executed clickOnLoginAndVerifyErrorMessage");
			e.printStackTrace(); 
			throw e;
		}
	}
}
