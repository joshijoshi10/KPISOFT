package pageObjects;

import java.io.File;
import java.util.List;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import config.ExcelFileReader;

public class SubmitPerformancePage extends BasePage {
	public SubmitPerformancePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'Submit your performance')])[1]")
	private WebElement lnk_submitperformance_actual;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Submit Performance')]")
	private WebElement lbl_SubmitPerf;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit')] | //span[contains(text(),'Submit')]/..")//"//span[contains(text(),'Submit')]/.."
	private WebElement btn_Submit;

	@FindBy(how = How.XPATH, using = "//confirmation//button[contains(text(),'Submit')]") //"(//button[contains(text(),'Submit')])[2]")
	private WebElement btn_FinalSubmit;

	@FindBy(how = How.XPATH, using = "(//label[contains(text(),'Comment')]/../textarea)")
	private WebElement txt_comment;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Actual:')]/../b")
	private List<WebElement> Actual_txt;

	//self review and competency enabled
	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'Performance Review')])/..")
	private WebElement lnk_performancereview;

	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'360 Feedback')])/..")
	private WebElement lnk_360feedback;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Choose Feedback :')]")
	private List<WebElement> lnk_Verifyprogram;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'No Programs Available')]")
	private List<WebElement> lnk_VerifyNoprogram;

	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'Dialog')])/..")
	private List<WebElement> lnk_dailog_template;

	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'Dialog')])/..//textarea")
	private WebElement lnk_dailog_template_comment;



	String edit = "(//i[@ngbtooltip='Edit'])";

	public void clickOnSubmitPerfomance() {
		try {
			log.info("Entered clickOnSubmitPerfomance");	

			log.info("Waiting for lnk_submitperformance_actual");
			waitUntilElementToBeClickable(lnk_submitperformance_actual);
			log.info("Clicking lnk_submitperformance_actual");
			click(lnk_submitperformance_actual);
			waitFor(3000);
			log.info("Executed clickOnSubmitPerfomance Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnSubmitPerfomance Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void verifySubmitPerformancelbl() {
		try {
			log.info("Entered verifySubmitPerformancelbl");	
			Assert.assertEquals(lbl_SubmitPerf.getText(), "Submit Performance",
					"Performance label is not matching hence >>> Failed");
			log.info("Executed verifySubmitPerformancelbl Successfully");
		} catch (Exception e) {
			log.error("Executed verifySubmitPerformancelbl Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void enterAlltheValueforActualInSubmitperformance(int i, String actual, String desc) {
		try {
			log.info("Entered enterAlltheValueforActualInSubmitperformance");	

			WebElement clickOnEdit = webDriver.findElement(By.xpath(edit + "[" + i + "]"));
			scrollUpAndDown(200);
			waitFor(2000);
			waitUntilElementToBeClickableRepeated(clickOnEdit,2);
			log.info("Clicking clickOnEdit");
			click(clickOnEdit);
			implicitwaitFor(3);
			if (i == 5) {
				scrollUpAndDown(100);
			}
			WebElement txtbx_Actual = webDriver.findElement(By.xpath("//label[contains(text(),'Actual')]/../input"));
			waitUntilElementToBeClickable(txtbx_Actual);
			log.info("Clicking txtbx_Actual");
			click(txtbx_Actual);
			log.info("Writing text to txtbx_Actual: "+actual);
			writeText(txtbx_Actual, actual);
			implicitwaitFor(3);
			WebElement txtbx_Desc = webDriver.findElement(By.xpath("//label[contains(text(),'Comment')]/../textarea"));
			waitUntilElementToBeClickable(txtbx_Desc);
			log.info("Clicking txtbx_Desc");
			click(txtbx_Desc);
			log.info("Writing text to txtbx_Desc: "+desc);
			writeText(txtbx_Desc, desc);
			log.info("Executed enterAlltheValueforActualInSubmitperformance Successfully");
		} catch (Exception e) {
			log.error("Executed enterAlltheValueforActualInSubmitperformance Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void deleteAttach() {
		try {
			log.info("Entered deleteAttach");	

			WebElement clickOnDelete = webDriver.findElement(By.xpath("//i[@class='fas fa-trash-alt']"));
			if (clickOnDelete.isDisplayed()) {
				log.info("Clicking clickOnDelete");
				click(clickOnDelete);
				implicitwaitFor(3);
			}
			log.info("Executed deleteAttach Successfully");
		} catch (Exception e) {
			log.error("Executed deleteAttach Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnSubmit() {
		try {
			log.info("Entered clickOnSubmit");	

			waitUntilElementToBeClickable(btn_Submit);
			waitUntilElementVisible(btn_Submit);
			log.info("Clicking btn_Submit");
			click(btn_Submit);
			implicitwaitFor(3);
			log.info("Writing text to txt_comment: "+"submit to supervisor");
			writeText(txt_comment, "submit to supervisor");
			log.info("Clicking btn_FinalSubmit");
			click(btn_FinalSubmit);
			waitFor(2000);
			log.info("Executed clickOnSubmit Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnSubmit Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void attach(int i) {
		try {
			log.info("Entered attach");	

			File folderpath = new File("src\\test\\resources\\Data\\Attach_review");
			File[] listOfFile = folderpath.listFiles();
			String attach = listOfFile[i - 1].getAbsolutePath().replace("\\", "\\\\");
			waitFor(3000);
			WebElement btn_attachmnet = webDriver
					.findElement(By.xpath("//button[contains(text(),'Attach document')]/../input"));
			btn_attachmnet.sendKeys(attach);
			log.info("Executed attach Successfully");
		} catch (Exception e) {
			log.error("Executed attach Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnSave() {
		try {
			log.info("Entered clickOnSave");	

			WebElement btn_indivSave = webDriver.findElement(By.xpath("//button[contains(text(),'Save')]"));
			log.info("Clicking btn_indivSave");
			click(btn_indivSave);
			waitFor(3000);
			log.info("Executed clickOnSave Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnSave Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}
	public void verifyTheActulDataAfterScoreUpload()
	{
		try 
		{
			log.info("Entered  verifyTheActulDataAfterScoreUpload succesfully");
			
			for(int i=1;i<=6;i++)			
			{
				String actualdata = ExcelFileReader.getCellValue("ReviewFlowData.xlsx", "Scoreuploaddata", i, "A");
				
				System.out.println("excel"+ actualdata);
				String expected_result=Actual_txt.get(i-1).getText();
				System.out.println("app"+ expected_result);
				assertTrue(actualdata.equalsIgnoreCase(expected_result), "data is not proper hence failed");
			}
		
			log.info("Exteneded   verifyTheActulDataAfterScoreUpload succesfully");
		} 
		catch (Exception e) 
		{
			log.error("failed  verifyTheActulDataAfterScoreUpload ");
			e.printStackTrace();
			//throw e;
		}
	}
	//self review and competency enabled
	public void VeriyAndTheCommentForDailog()
	{
		try 
		{
			log.info("Entered  VeriyAndTheCommentForDailog succesfully");
			waitUntilElementVisible(lnk_performancereview);
			click(lnk_performancereview);
			assertTrue(lnk_dailog_template.size()==1, "expected [dailog template] but found [other template]");
			writeText(lnk_dailog_template_comment, "dailog_template_comment");

			log.info("Exteneded   VeriyAndTheCommentForDailog succesfully");
		} catch (Exception e) 
		{
			log.error("failed  VeriyAndTheCommentForDailog ");
			e.printStackTrace();
			throw e;
		}
	}
	public void verifyThe360FeedbackTemplate()
	{
		try 
		{
			log.info("Entered  verifyThe360FeedbackTemplate succesfully");
			click(lnk_360feedback);
			assertTrue(lnk_VerifyNoprogram.size()==1 || lnk_VerifyNoprogram.size()==1, "No data is displayed in competency tab hence failed");
			log.info("Exteneded   verifyThe360FeedbackTemplate succesfully");
		} 
		catch (Exception e) {
			log.error("failed  verifyThe360FeedbackTemplate ");
			e.printStackTrace();
			throw e;
		}
	}
	public void clickOnSubmitForselfreview()
	{
		try 
		{
			log.info("Entered  clickOnSubmitForselfreview succesfully");
			click(btn_Submit);
			implicitwaitFor(3);
			log.info("Writing text to txt_comment: "+"submit to supervisor");
			writeText(txt_comment, "submit to supervisor");
			log.info("Clicking btn_FinalSubmit");
			click(btn_FinalSubmit);

			log.info("Exteneded   clickOnSubmitForselfreview succesfully");

		} catch (Exception e) {
			log.error("failed  clickOnSubmitForselfreview ");
			e.printStackTrace();
			throw e;
		}
	}
	public void enterActualInSubmitperformance(String actual, String desc)
	{
		try {
			log.info("entering enterActualInSubmitperformance!!");
			WebElement clickOnPeriod = webDriver
					.findElement(By.xpath("(//small[contains(text(),'Period actual / Comments')])[1]"));
			ScrollUpToElement(clickOnPeriod);
			click(clickOnPeriod);
			implicitwaitFor(3);
			WebElement txtbx_Actual = webDriver.findElement(By.xpath("//label[contains(text(),'Actual')]/../input"));
			click(txtbx_Actual);
			writeText(txtbx_Actual, actual);
			implicitwaitFor(3);
			WebElement txtbx_Desc = webDriver
					.findElement(By.xpath("//label[contains(text(),'Comments')]/../textarea"));
			ScrollUpToElement(txtbx_Desc);
			click(txtbx_Desc);
			writeText(txtbx_Desc, desc);
			log.error("entered value for actuals!!");
		} catch (Exception e) {
			log.error("error entering actual  values!!");
			e.printStackTrace();
			throw e;
		}
	}
}
