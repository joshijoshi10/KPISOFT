package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.LoggerHelper;

public class BulkEmployeeResignPage extends BasePage {

	public BulkEmployeeResignPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	Logger log = LoggerHelper.getLogger(getClass());
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Bulk Employee Resign')]")
	private WebElement bulkEmployeeResign_lnk;
	
	@FindBy(how=How.XPATH, using="//input[@name='browseFile']")
	private WebElement browse_btn;
	
	@FindBy(how=How.XPATH, using="//textarea[@name='bulkUploadComments']")
	private WebElement comments_txtArea;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Upload')]")
	private WebElement upload_btn;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'forceResign')]")
	private WebElement forceResign_btn;
	
	@FindBy(how=How.XPATH, using="(//button[contains(text(),'Resign')])[1]")
	private WebElement resign_btn;
	
	
	public void clickOnBulkEmployeeResign() {
		try {
			log.info("clicking on bulk employee resign!!");
			click(bulkEmployeeResign_lnk);
			log.info("clicked on bulk employee resign!!");
			
		} catch (Exception e) {
			log.info("error clicking on bulk employee resign!!");
		}
	}
	
	public void attachFile(String filePath) {
		try {
			log.info("uploading the file!!");
			browse_btn.sendKeys(filePath);
			log.info("uploaded the file!!");
			
		} catch (Exception e) {
			log.info("error uploading the file!!");
			e.printStackTrace();
		}
	}
	public void enterComments(String comments) {
		try {
			log.info("entering comments!!");
			writeText(comments_txtArea, comments);
			log.info("entered comments!!");
		} catch (Exception e) {
			log.info("error entering the comments!!");
			e.printStackTrace();
		}
	}
	public void clickOnUpload() {
		try {
			log.info("clicking on upload!!");
			click(upload_btn);
			log.info("clicked on upload!!");
		} catch (Exception e) {
			log.info("error clicking on upload!!");
			e.printStackTrace();
		}
	}
	public void clickOnResign() {
		try {
			log.info("clicking on resign!!");
			click(resign_btn);
			log.info("clicked on resign!!");
		} catch (Exception e) {
			log.info("error clicking on resign!!");
			e.printStackTrace();
		}
	}
	public void clickOnForceResign() {
		try {
			log.info("clicking on force resign!!");
			click(forceResign_btn);
			log.info("clicked on force resign!!");
		} catch (Exception e) {
			log.info("error clicking on force resign!!");
			e.printStackTrace();
		}
	}
}
