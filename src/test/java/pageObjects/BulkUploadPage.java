package pageObjects;

import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import helper.LoggerHelper;

public class BulkUploadPage extends BasePage 
{
	Logger log = LoggerHelper.getLogger(LoggerHelper.class);
	public BulkUploadPage(WebDriver webdriver) 
	{
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-upload mr-2']")
	private WebElement BulkUpload_btn;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Bulk upload')]")
	private WebElement BulkUpload_lnk;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Choose Process :')]/../select")
	private WebElement BulkUpload_dpdn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Browse')]/../input")
	private WebElement Browser_btn;

	@FindBy(how = How.XPATH, using = "//textarea[@name='bulkUploadComments']")
	private WebElement comments_txt;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Upload')]")
	private WebElement upload_btn;

	@FindBy(how = How.XPATH, using = "(//div[contains(@class,'w-100 float-left p-2 grid-details')][2]/div)[5]")
	private WebElement upload_status;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Refresh')]")
	private WebElement refresh_btn;

	@FindBy(how = How.XPATH, using = "(//div[contains(@class,'w-100 float-left p-2 grid-details')][2]/div)[6]")
	private WebElement upload_message;


	public void clickOnBulkUpload() {
		try {
			log.info(" Enterted clickOnBulkUpload succesfully");
			waitUntilElementVisible(BulkUpload_btn);
			clickOnElementByJs(BulkUpload_btn);
			log.info(" Excuted  clickOnBulkUpload succesfully");
		} catch (Exception e) {
			log.error("failed  clickOnBulkUpload ");
			e.printStackTrace();

			throw e;
		}
	}
	public void VerifyUploadPage()
	{
		try {

			log.info(" Enterted clickOnBulkUpload succesfully");
			waitUntilElementVisible(BulkUpload_lnk);
			log.info(" Excuted  clickOnBulkUpload succesfully");
		} catch (Exception e) {
			log.error("failed  VerifyUploadPage ");
			e.printStackTrace();				
			throw e;
		}
	}
	public void SelectTheOptionBasedOnGivenNmae(String uploadtypename)
	{
		try 
		{
			log.info("----Entered SelectTheOptionAsKpiUpload succesfully-----");
			waitUntilElementVisible(BulkUpload_dpdn);
			setValueInDropdownText(BulkUpload_dpdn, uploadtypename);
			log.info(" Excuted  clickOnBulkUpload succesfully");


		} catch (Exception e) {
			log.error("failed  SelectTheOptionAsKpiUpload ");
			e.printStackTrace();
			throw e;
		}
	}
	public void UploadAKpiUploadFile()
	{
		try 
		{
			log.info("----Entered UploadAKpiUploadFile succesfully-----");

			File uploadfile=new File("src\\test\\resources\\Data\\TestEdit_kpiUploadTemplate.xlsx");
			Browser_btn.sendKeys(uploadfile.getAbsolutePath().replace("\\", "\\\\"));	
			waitFor(2000);
			log.info(" Excuted  UploadAKpiUploadFile succesfully");


		} catch (Exception e) {
			log.error("failed  UploadAKpiUploadFile ");
			e.printStackTrace();
			throw e;
		}
	}
	public void enterTheComments(String comments)	
	{
		try 
		{
			log.info("----Entered enterTheComments succesfully-----");
			waitUntilElementVisible(comments_txt);
			writeText(comments_txt, comments);
			log.info(" Excuted  clickOnBulkUpload succesfully");

		} catch (Exception e) {
			log.error("failed  enterTheComments ");
			e.printStackTrace();
			throw e;
		}
	}
	public void clickOnUploadButton() {
		try {
			log.info("----Entered clickOnUploadButton succesfully-----");
			waitUntilElementVisible(upload_btn);
			click(upload_btn);
			log.info(" Excuted  clickOnBulkUpload succesfully");
		} catch (Exception e) {
			log.error("failed  clickOnUploadButton ");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyTheStatus()
	{
		try 
		{
			log.info(" Enterted VerifyTheStatus succesfully");
			waitUntilElementVisible(upload_status);
			if (upload_status.getText().equalsIgnoreCase("Started")) {

				log.info("clicking on refresh!!");
				click(refresh_btn);
				waitFor(2000);

				if (upload_status.getText().equalsIgnoreCase("Success")) {
					log.info("cob file uplaoded!!");
					System.out.println("COB file uploaded succesfully");
				}
				else
				{
					log.info("cob file failed!!");
					Assert.fail("uploaded file is failed , please check");
				}
			}

			System.out.println("status of file upload" + ":-" + upload_status.getText() + "," + upload_message.getText());
			log.info(" Excuted  clickOnBulkUpload succesfully");
		} catch (Exception e) {
			log.error("failed  VerifyTheStatus ");
			e.printStackTrace();
			throw e;
		}
	}

	//UploadA bulkkpidelete
	public void UploadABulkKpiDeleteFile()
	{
		try 
		{
			log.info("----Entered UploadABulkKpiDeleteFile succesfully-----");

			File uploadfile=new File("src\\test\\resources\\Data\\TestEdit_bulkKpiDeleteTemplate.xlsx");
			Browser_btn.sendKeys(uploadfile.getAbsolutePath().replace("\\", "\\\\"));	
			waitFor(2000);
			log.info(" Excuted  UploadABulkKpiDeleteFile succesfully");


		} catch (Exception e) {
			log.error("failed  UploadABulkKpiDeleteFile ");
			e.printStackTrace();
			throw e;
		}
	}
	//bulkprogramruleupload
	public void UploadAprogramRuleFile()
	{
		try 
		{
			log.info("----Entered UploadAprogramRuleFile succesfully-----");

			File uploadfile=new File("src\\test\\resources\\Data\\BulkProgramRuleUploadTemplate.XLSX");
			Browser_btn.sendKeys(uploadfile.getAbsolutePath().replace("\\", "\\\\"));	
			waitFor(2000);
			log.info(" Excuted  UploadAprogramRuleFile succesfully");


		} catch (Exception e) {
			log.error("failed  UploadAprogramRuleFile ");
			e.printStackTrace();
			throw e;
		}
	}
	public void UploadAScoreuploadFile()
	{
		try 
		{
			log.info("----Entered UploadAprogramRuleFile succesfully-----");

			File uploadfile=new File("src\\test\\resources\\Data\\kpiScoreUploadTemplate.xlsx");
			Browser_btn.sendKeys(uploadfile.getAbsolutePath().replace("\\", "\\\\"));	
			waitFor(2000);
			log.info(" Excuted  UploadAprogramRuleFile succesfully");


		} catch (Exception e) {
			log.error("failed  UploadAprogramRuleFile ");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyTheStatusForScoreupload()
	{
		try 
		{
			log.info(" Enterted VerifyTheStatus succesfully");
			waitUntilElementVisible(upload_status);
			if (upload_status.getText().equalsIgnoreCase("Started")) {

				log.info("clicking on refresh!!");
				click(refresh_btn);
				waitFor(2000);
				if(upload_status.getText().equalsIgnoreCase("Validated"))
				{
					log.info("clicking on refresh!!");
					click(refresh_btn);
					waitFor(2000);
					if (upload_status.getText().equalsIgnoreCase("Success")) {
						log.info("cob file uplaoded!!");
						System.out.println("COB file uploaded succesfully");
					}
					else
					{
						log.info("cob file failed!!");
						Assert.fail("uploaded file is failed , please check");
					}
				}
			}

			System.out.println("status of file upload" + ":-" + upload_status.getText() + "," + upload_message.getText());
			log.info(" Excuted  clickOnBulkUpload succesfully");
		} catch (Exception e) {
			log.error("failed  VerifyTheStatus ");
			e.printStackTrace();
			throw e;
		}
	}
}
