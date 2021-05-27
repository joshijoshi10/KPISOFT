package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.LoggerHelper;

public class NotificationEditorPage extends BasePage {

	Logger log = LoggerHelper.getLogger(LoggerHelper.class);

	public NotificationEditorPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how=How.XPATH, using="//a[contains(text(),'Notification Editor')]")
	private WebElement notificationEditor_lnk;

	@FindBy(how=How.XPATH, using="(//input[@type='text'])[1]")
	private WebElement search_textField;

	@FindBy(how=How.XPATH, using="//button[contains(text(),'Search')]")
	private WebElement search_btn;

	@FindBy(how=How.XPATH, using="(//i[@class='fa fa-ellipsis-h'])[1]")
	private WebElement actions_elipsis;

	@FindBy(how=How.XPATH, using="//li[contains(text(),'Edit')]")
	private WebElement edit_btn;

	@FindBy(how=How.XPATH, using="//label[contains(text(),'Default Subject template')]/following-sibling:: textarea")
	private WebElement defaultSubjectTemplate_txtArea;

	@FindBy(how=How.XPATH, using="(//email-notification//h6)[8]")
	private WebElement notificationDesc_txt;


	public void moveToNotificationEditor() {

		try{
			log.info("Entered moveToNotificationEditor succesfully");
			click(notificationEditor_lnk);
			log.info("Executed moveToNotificationEditor Successfully");
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed moveToNotificationEditor"); 
			e.printStackTrace(); 
			throw e;
		}

	}
	public void enterTextinSearchBox(String value) {
		try{
			log.info("Entered enterTextinSearchBox succesfully");
			writeText(search_textField, value);
			log.info("Executed enterTextinSearchBox Successfully");
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed enterTextinSearchBox");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnSearch() {
		try{
			log.info("Entered clickOnSearch succesfully");
			click(search_btn);
			log.info("Executed clickOnSearch Successfully");
		}
		catch(Exception e)
		{
			log.error("Not Executed clickOnSearch"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	public void clickOnEllipsis() {
		try{
			log.info("Entered clickOnEllipsis succesfully");

			clickOnElementByJs(actions_elipsis);

			log.info("Executed clickOnEllipsis Successfully");
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed clickOnEllipsis"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	public void clickOnEdit() {
		try{
			log.info("Entered clickOnEdit succesfully");

			click(edit_btn);

			log.info("Executed clickOnEdit Successfully");
		}
		catch  (Exception e) 
		{

			log.error("Not Executed clickOnEdit");
			e.printStackTrace(); 
			throw e;
		}
	}
	public void editNotification(String text) {

		try{
			log.info("Entered editNotification succesfully");
			writeText(defaultSubjectTemplate_txtArea, text);
			log.info("Executed editNotification Successfully");
		} 
		catch  (Exception e)
		{

			log.error("Not Executed editNotification");
			e.printStackTrace(); 
			throw e;
		}

	}
	public String getNotificationDescText() 
	{

		String desc = null;
		log.info("Entered getNotificationDescText succesfully");
		try 
		{
			desc = notificationDesc_txt.getText().trim();
			log.info("Executed getNotificationDescText Successfully");

		} 
		catch (Exception e) 
		{
			log.error("Not Executed getNotificationDescText");
			e.printStackTrace(); 
			throw e;
		}
		return desc;



	}
}