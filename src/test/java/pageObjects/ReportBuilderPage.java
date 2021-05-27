package pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.Scenario;
import helper.LoggerHelper;

public class ReportBuilderPage extends BasePage {
	List<String> selectedColumns;
	Logger log = LoggerHelper.getLogger(LoggerHelper.class);

	public ReportBuilderPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	Scenario scenario;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Report Management')]")
	private WebElement reportManagement_link;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Report Management')]")
	private WebElement reportManagement_lbl;

	@FindBy(how = How.ID, using = "perspective")
	private WebElement module_dropDown;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Search By Module')]")
	private WebElement searchByModule_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create Report')]")
	private WebElement createReport_btn;

	@FindBy(how = How.XPATH, using = "//textarea[@name='reportName']")
	private WebElement reportName_textArea;

	@FindBy(how = How.XPATH, using = "//select[@name='moduleName']")
	private WebElement moduleName_dropDown;

	@FindBy(how = How.XPATH, using = "//textarea[@name='description']")
	private WebElement description_textArea;

	@FindBy(how = How.XPATH, using = "//input[@name='previewRecordCount']")
	private WebElement previewRecordCount_textField;

	@FindBy(how = How.XPATH, using = "//div[@class='selected-list']")
	private WebElement selectColumn_dropDown;

	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']//..")
	private List<WebElement> Column_checkboxes;

	@FindBy(how = How.XPATH, using = "//div[@class='d-flex align-items-center tags p-2']//p")
	private List<WebElement> selectedColumns_lbl;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save Report')]")
	private WebElement saveReport_btn;

	@FindBy(how = How.XPATH, using = "((//div[contains(@class,'w-100 float-left p-md-2 grid-details')])[3]//h6)[3]")
	private WebElement reportName_lbl;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-ellipsis-h'])[last()]")
	private WebElement lastMoreOptions_btn;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'»»')]")
	private WebElement lastPage_btn;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Active')]")
	private WebElement active_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Column')]")
	private WebElement addColumn_btn;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Edit')]")
	private WebElement editColumn_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Update report')]")
	private WebElement updateReport_btn;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'View')]")
	private WebElement view_btn;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Report Builder')]")
	private WebElement reportBuilder_lnk;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create Report')]")
	private WebElement createReport_btn2;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'copy')]")
	private WebElement copy_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Back')]")
	private WebElement back_btn;

	@FindBy(how = How.XPATH, using = "//tr")
	private List<WebElement> previewTableRows;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Preview')]")
	private WebElement preview_btn;

	@FindBy(how = How.XPATH, using = "//button[@class='close']")
	private WebElement close_btn;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Send Mail')]")
	private WebElement sendMail_btn;

	@FindBy(how = How.ID, using = "to")
	private WebElement to_textArea;

	@FindBy(how = How.ID, using = "bcc")
	private WebElement cc_textArea;

	@FindBy(how = How.XPATH, using = "cc")
	private WebElement bcc_textArea;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Validate Mail Ids')]")
	private WebElement validateMailIds_btn;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Send Mail')]")
	private WebElement sendMail_btn1;
	
	@FindBy(how=How.ID, using="select_KPI")
	private WebElement selectDropdown;
	
	@FindBy(how=How.XPATH, using="//button[@class='iga-right']")
	private WebElement calendar_btn;
	
	public void moveToReportManagement() {

		try {
			log.info("Entering the moveToReportManagement ");
			click(reportManagement_link);
			log.info("Excuted the moveToReportManagement");
		} catch (Exception e) {
			log.error("Not excute moveToReportManagement failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void moveToReportBuilder() {

		try {
			log.info("Entering the moveToReportBuilder");
			click(reportBuilder_lnk);
			log.info("Excuted the moveToReportBuilder");
		} catch (Exception e) {
			log.error("Not excute moveToReportBuilder failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public boolean verifyReportManagement() {
		try {
			log.info("Entering the verifyReportManagement");
			if (reportManagement_lbl.isDisplayed())
			{
				log.info("Excuted the verifyReportManagement");
				return true;
			}			
			else
			{
				log.info("Excuted the verifyReportManagement");
				return false;
			}			
		} catch (Exception e) {
			log.error("Not excute verifyReportManagement failed!!");
			e.printStackTrace();
			Assert.fail("unable to verify Report Management!!");
			return false;
		}

	}

	public boolean verifyCreateReportbutton() {
		try {
			log.info("Entering the verifyReportManagement");
			if (createReport_btn.isDisplayed())
			{
				log.info("Excuted the verifyReportManagement");
				return true;
			}				
			else
			{
				log.info("Excuted the verifyReportManagement");
				return false;			
			}
				
		} catch (Exception e) {
			log.error("Not excute verifyReportManagement failed!!");
			e.printStackTrace();
			Assert.fail("verify Create Report button failed!!!");
			return false;
		}
	}

	public boolean verifySearchByModulesButton() {
		try {
			log.info("Entering the verifySearchByModulesButton");
			if (searchByModule_btn.isDisplayed())
			{
				log.info("Excuted the verifySearchByModulesButton");
				return true;
			}
				
			else
			{
				log.info("Excuted the verifySearchByModulesButton");
				return false;
			}
				
		} catch (Exception e) {
			log.error("Not excute verifySearchByModulesButton failed!!");
			e.printStackTrace();
			Assert.fail("verifySearchByModulesButton failed");
			return false;
		}
	}

	public boolean verifySelectModuleDropdown() {
		try {
			log.info("Entered  verifySelectModuleDropdown");
			if (module_dropDown.isDisplayed())
			{
				log.info("Excuted the verifySelectModuleDropdown");
				return true;
			}
			else
			{
				log.info("Excuted the verifySelectModuleDropdown");
				return false;
			}
				
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("verifySelectModuleDropdown failed" + e.getMessage());
			return false;
		}

	}

	public void clickOnCreateReport() {
		try {
			log.info("Entered  clickOnCreateReport");
			createReport_btn.click();
			log.info("Excuted the clickOnCreateReport");
		} catch (Exception e) {
			log.error("Not excute clickOnCreateReport failed!!");
			e.printStackTrace();
			throw e;
		}

	}

	public void enterDescription() {
		try {
			log.info("entering enterDescription!!");
			writeText(description_textArea, "Test Report for smoke test");
			log.info("Excuted the enterDescription");
		} catch (Exception e) {
			log.error("Not excute enterDescription failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterReportName(String reportName) {
		try {
			log.info("entering enterReportName" + reportName);
			writeText(reportName_textArea, reportName);
			log.info("Excuted the enterReportName");
		} catch (Exception e) {
			log.error("Not excute enterReportName failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterPreviewRecordCount(int count) {
		try {
			log.info("Entered  On enterPreviewRecordCount!!");
			String previewCount = Integer.toString(count);			
			writeText(previewRecordCount_textField, previewCount);
			log.info("Excuted the enterPreviewRecordCount");
		} catch (Exception e) {
			log.error("Not excute enterPreviewRecordCount failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void selectModule(String moduleName) {
		try {
			log.info("Entered  On selectModule!!");
			setValueInDropdownText(moduleName_dropDown, moduleName);
			log.info("Excuted the selectModule");
		} catch (Exception e) {
			log.error("Not excute selectModule failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void selectColumns() {
		try {
			log.info("Entered  On selectColumns!!");
			click(selectColumn_dropDown);
			for (int i = 1; i <= 4; i++) {
				waitFor(3000);
				click(Column_checkboxes.get(i));
			}
			click(selectColumn_dropDown);
			log.info("Excuted the selectColumns");
		} catch (Exception e) {
			log.error("Not excute selectColumns failed!!");
			e.printStackTrace();
			throw e;
		}

	}

	public List<String> getSelectedColumns() {

		try {
			log.info("Entered  On getSelectedColumns!!");
			for (int i = 0; i < selectedColumns_lbl.size(); i++) {

				selectedColumns.add(selectedColumns_lbl.get(i).getText());

			}
			log.info("Excuted the getSelectedColumns");
			return selectedColumns;
			
		} catch (Exception e) {
			log.error("Not excute getSelectedColumns failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnSaveReport() {
		
		try {
			log.info("Entered  On clickOnSaveReport!!");
			waitUntilElementToBeClickable(saveReport_btn);
			click(saveReport_btn);
			log.info("Excuted the clickOnSaveReport");
		} catch (Exception e) {
			log.error("Not excute clickOnSaveReport failed!!");
			e.printStackTrace();
			throw e;
		}

	}

	public void verifyReportName(String reportName) {
		try {
			log.info("Entered  On verifyReportName!!");
			verifyData(reportName, reportName_lbl);
			System.out.println(reportName_lbl.getText().trim());
			log.info("Excuted the verifyReportName");
		} catch (Exception e) {
			log.error("Not excute verifyReportName failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnAddColumn() {
		try {
			log.info("clicking On clickOnAddColumn!!");
			click(addColumn_btn);
			log.info("excuted the clickOnAddColumn");
		} catch (Exception e) {
			log.error("Not excute clickOnAddColumn failed!!");
			e.printStackTrace();
			throw e;
		}
	}


	public void clickOnMoreOptionsOnLastItem() {
		try {
			
			log.info("clicking On clickOnMoreOptionsOnLastItem!!");
			waitFor(2000);
			doHoverandClick(lastPage_btn);
			waitFor(4000);
			clickOnElementByJs(lastMoreOptions_btn);
			log.info("excuted the clickOnMoreOptionsOnLastItem");
		}

		catch (Exception e) {
			log.error("Not excute clickOnMoreOptionsOnLastItem failed!!");
			e.printStackTrace();
			throw e;

		}
	}

	public void clickOnActive() {
		try {
			log.info("clicking On Active!!");
			waitFor(2000);
			doHoverandClick(active_btn);
			waitFor(3000);
			log.info("clicked On Active!!");
		} catch (Exception e) {
			log.error("Not excute clickOnActive failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnEdit() {
		try {
			log.info("clickOnEdit entered!!");
			waitUntilElementToBeClickable(editColumn_btn);
			doHoverandClick(editColumn_btn);
			log.info("clickOnEdit exited!!");
		} catch (Exception e) {
			log.error("Not excute clickOnEdit failed!!");
			e.printStackTrace();
			throw e;

		}
	}

	public void clickOnUpdate() {
		try {
			log.info("clicking on update!!");
			waitUntilElementToBeClickable(updateReport_btn);
			click(updateReport_btn);
			log.info("clicked on update!!");
		} catch (Exception e) {
			log.error("Not excute clickOnUpdate failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void editReportName(String reportName) {
		try {
			log.info("editing report name!!");
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
			js.executeScript("arguments[0].setAttribute('ng-reflect-model', '')", reportName_textArea);	
			writeText(reportName_textArea, reportName);
			waitFor(2000);
			log.info("Excuteded  editReportName");
		} catch (Exception e) {
			log.error("Not excute editReportName failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnView() {
		try {
			log.info("clicking on view button!!");
			waitUntilElementToBeClickable(view_btn);
			click(view_btn);
			log.info("clicked on view button!!");
		} catch (Exception e) {
			log.error("Not excute clickOnView failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnCreateReportAdmin() {
		try {
			log.info("clicking on create report Admin!!!");
			waitUntilElementToBeClickable(createReport_btn2);
			click(createReport_btn2);
			log.info("clicked on create report Admin!!!");
		} catch (Exception e) {
			
			log.error("Not excute clickOnCreateReportAdmin failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnCopyButton() {
		try {
			log.info(" entered clickOnCopyButton !!");
			waitUntilElementToBeClickable(copy_btn);
			click(copy_btn);
			log.info("excuited clickOnCopyButton!!");
		} catch (Exception e) {
			log.error("Not excute clickOnCopyButton failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnBackButton() {
		try {
			log.info("clicking On Back Button");
			waitUntilElementToBeClickable(back_btn);
			click(back_btn);
			log.info("clicked On Back Button");
		} catch (Exception e) {
			log.error("clickOnBackButton failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public int getPreviewCount() {
		try {
			log.info("getting Preview Count" + (previewTableRows.size() - 2));
			waitFor(1000);
			log.info("got Preview Count");
			return previewTableRows.size() - 2;
		} catch (Exception e) 
		{
			log.error("error in clickOnPreviewButton");
			e.printStackTrace();
			Assert.fail();
			return -1;
		}
	}

	public void clickOnPreviewButton() {
		try {
			log.info("clicking on preview button!!");
			waitFor(1000);
			click(preview_btn);
			log.info("clicked on preview button!!");
		} catch (Exception e) {
			log.error("error in clickOnPreviewButton");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnCloseButton() {
		try {
			log.info("clicking On Close Button!!");
			waitUntilElementToBeClickable(close_btn);
			click(close_btn);
			log.info("clicking On Close Button!!");
		} catch (Exception e) {
			log.error("error clicking on Close button!!");
			e.printStackTrace();
			throw e;

		}
	}

	public void clickonSendMailMoreOptions() {
		try {
			log.info("clicking on send mail!!");
			waitUntilElementToBeClickable(sendMail_btn);
			click(sendMail_btn);
			log.info("clicked on send mail!!");
		} catch (Exception e) {
			log.error("error clicking on send mail!!");
			e.printStackTrace();
			throw e;
		}

	}

	public void enterEmailIdinToTextArea(String toEmailId) {
		try {
			log.info("entering to: email id");
			writeText(to_textArea, toEmailId);
			log.info("entered to : email id");
		} catch (Exception e) {
			log.error("enterEmailIdinToTextArea failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterEmailIdinCcTextArea(String toEmailId) {
		try {
			log.info("entering cc: email id");
			writeText(cc_textArea, toEmailId);
			log.info("entered cc : email id");
		} catch (Exception e) {
			log.error("enterEmailIdinCcTextArea failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterEmailIdinBccTextArea(String toEmailId) {
		try {
			log.info("entering bcc: email id");
			writeText(bcc_textArea, toEmailId);
			log.info("entered bcc : email id");
		} catch (Exception e) {
			log.error("enterEmailIdinBccTextArea failed!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnValidateMailIds() {
		try {
			log.info("clicking on validate mail ids!!!");
			click(validateMailIds_btn);
			log.info("clicked on validate mail ids!!!");
		} catch (Exception e) {
			log.error("clickOnValidateMailIds failed!!");
			e.printStackTrace();
			throw e;
		}
	}
	public void clickOnSendMail() {
		try {
			log.info("sending mail!!");
			waitUntilElementToBeClickable(sendMail_btn1);
			click(sendMail_btn1);
			log.info("mail sent!!");
		} catch (Exception e) {
			log.error("sending mail failed!!");
			e.printStackTrace();
			throw e;
			
		}
	}
	public void selectFrequency(String frequency ) {
		try {
			log.info("selecting frequency!!");
			setValueInDropdownText(selectDropdown, frequency);
			log.info("frequency selected!!");
		} catch (Exception e) {
			log.error("unable to select frequency!!");
			e.printStackTrace();
			throw e;
		}
	}
	public void selectDate(int year,String month, int day) {
		try {
			log.info("selecting date!!");
			setDateInDatePicker(calendar_btn, year, month, day);
			log.info("date selected!!");
		} catch (Exception e) {
			log.error("error in selecting date!!");
			e.printStackTrace();
			throw e;
		}
	}
}
