package pageObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import config.ExcelFileReader;
import helper.LoggerHelper;

public class ActualScorecardPage extends BasePage {
	
	Logger log = LoggerHelper.getLogger(LoggerHelper.class);

	public ActualScorecardPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'Update Performance for December month') or contains(text(),'Submit your performance for this period')])[1]")
	// @FindBy(how=How.XPATH,using="(//h5[contains(text(),'Update Performance
	// for')])[1]")
	private WebElement lnk_actualUpdate;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Update Performance')]")
	private WebElement lbl_UpdatePerf;

	@FindBy(how = How.XPATH, using = "//*[@id='scorecard-panel']//i")
	private WebElement downloadScorecard_btn;

	@FindBy(how = How.XPATH, using = "//span[text()='Download as PDF']/parent::button")
	private WebElement downloadAsPDF_btn;

	@FindBy(how = How.XPATH, using = "//span[text()='Download as Excel']/parent::button")
	private WebElement downloadAsExcel_btn;

	//Historical data

	@FindBy(how = How.XPATH, using = "//img[contains(@ngbtooltip,'Edit for all months')]")
	private List<WebElement> Edit_All_Month_btn;

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'Target')]")
	private List<WebElement> VerifyTypeOfKpi_txt;

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'Actual')]//ancestor::table//tr/td[3]/input")
	private List<WebElement> Actual_constant;

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'User Comment')]//ancestor::table//tr/td[5]/textarea")
	private List<WebElement> constant_comment_txt;
	
	@FindBy(how = How.XPATH, using = "//th[contains(text(),'User Comment')]//ancestor::table//tr/td[6]/textarea")
	private List<WebElement> Supervisor_constant_comment_txt;

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'User Comment')]//ancestor::table//tr/td[7]/textarea")
	private List<WebElement> summation_comment_txt;

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'User Comment')]//ancestor::table//tr/td[8]/textarea")
	private List<WebElement> Supervisor_summation_comment_txt;

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'Period Actual')]//ancestor::table//tr/td[4]/input")
	private List<WebElement> PeriodActual;

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'Cummulative Actual')]//ancestor::table//tr/td[5]/input")
	private List<WebElement> Cummulative_Actual;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save') and not(@disabled)]") //"//button[contains(text(),'Save')]")
	private WebElement save_btn;

	//verify
	@FindBy(how = How.XPATH, using = "(//img[contains(@ngbtooltip,'Edit for all months')]/../../../../preceding-sibling::div//p)")
	private List<WebElement> clickOnAllKpi_lnk;

	
	@FindBy(how = How.XPATH, using = "(//img[contains(@ngbtooltip,'Edit for all months')]/../..//preceding-sibling::div//p)")
	private List<WebElement> clickOnAllKpi_lnkInApproveReview;

	
	@FindBy(how = How.XPATH, using = "//a[@id='allMonthData']")
	private WebElement AllkpiData_lnk;

	@FindBy(how = How.XPATH, using = "//span[text()='×']")
	private WebElement close_lnk;

	@FindBy(how = How.XPATH, using = "//span[text()='Back']")
	private WebElement back_btn;

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'Actual')]//ancestor::table//tr/td[3]")
	private List<WebElement> Verify_Actual;

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'User Comment')]//ancestor::table//tr/td[6]")
	private List<WebElement> Verify_Comment;

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'Period Actual')]//ancestor::table//tr/td[4]")
	private List<WebElement> Verify_periodActual;

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'User Comment')]//ancestor::table//tr/td[7]")
	private List<WebElement> Verifysummation_comment_txt;

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'Period Actual')]//ancestor::table//tr/td[4]")
	private List<WebElement> verify_PeriodActual;

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'Period Actual')]//ancestor::table//tr/td[5]")
	private List<WebElement> Verify_cummalativeActual;

	String pagename;

	/*
	 * @FindBy(how=How.XPATH,using="//div[@class='mr-2 fas fa-chevron-right']")
	 * private WebElement arrow_btn;
	 */

	private String Typeofkpi;

	private List<WebElement> clickonKpiname;

	public void clickOnUpdateActual() {
		try {
			log.info("clicking on update actuals!!");
			// click(lnk_actualUpdate);
			clickOnElementByJs(lnk_actualUpdate);
			waitFor(3000);
			log.info("clicked on update actuals!!");
		} catch (Exception e) {
			log.info("error clicking on update actuals!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyPerformancelbl() {
		try {
			log.info("verifying performance label!!");
			Assert.assertEquals(lbl_UpdatePerf.getText().trim(), "Update Performance",
					"Performance label is not matching hence >>> Failed");
			/*
			 * WebElement arrow_btn=webDriver.findElement(By.
			 * xpath("//div[@class='mr-2 fas fa-chevron-down']"));
			 * if(arrow_btn.isDisplayed()) { waitUntilElementToBeClickable(arrow_btn);
			 * click(arrow_btn); }
			 */
			log.info("verified performance label!!");
		} catch (Exception e) {
			log.error("error verifying performance label");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterAlltheValueforActual(String actual, String desc) {

		try {
			log.info("entering all the values for actuals!!");
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
					.findElement(By.xpath("//textarea[@id='update_Perf_Note' or @id='Update_Grp_Note']")); ////label[contains(text(),'Write a note')]/../textarea
			click(txtbx_Desc);
			writeText(txtbx_Desc, desc);
			log.error("entered value for actuals!!");
		} catch (Exception e) {
			log.error("error entering actual  values!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterAlltheValueforKpi_KpiRelationship(String actual, String desc) {

		try {
			log.info("entering value for kpi-kpi relationship!!");
			WebElement clickOnPeriod = webDriver
					.findElement(By.xpath("(//small[contains(text(),'Period actual / Comments')])[1]"));
			ScrollUpToElement(clickOnPeriod);
			waitUntilElementToBeClickable(clickOnPeriod);
			log.info("clicking on period!!");
			click(clickOnPeriod);
			implicitwaitFor(3);
			WebElement txtbx_Actual = webDriver.findElement(By.xpath("//label[contains(text(),'Actual')]/../input"));
			ScrollUpToElement(txtbx_Actual);
			waitUntilElementToBeClickable(txtbx_Actual);
			click(txtbx_Actual);
			log.info("clicked on text box actual!!");
			writeText(txtbx_Actual, actual);
			implicitwaitFor(3);
			WebElement txtbx_Desc = webDriver.findElement(By.xpath("//label[contains(text(),'Comments')]/../textarea"));
			ScrollUpToElement(txtbx_Desc);
			waitUntilElementToBeClickable(txtbx_Desc);
			click(txtbx_Desc);
			writeText(txtbx_Desc, desc);
			log.info("entered values for kpi kpi relationship!!");
		} catch (Exception e) {
			log.error("error entering kpi kpi relationship!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void attach(int i) {
		try {
			log.info("attaching files");
			File folderpath = new File("src\\test\\resources\\Data\\Attach_review");
			File[] listOfFile = folderpath.listFiles();
			String attach = listOfFile[i - 1].getAbsolutePath().replace("\\", "\\\\");
			waitFor(3000);
			WebElement btn_attachmnet = webDriver
					.findElement(By.xpath("//button[contains(text(),'Attach document')]/../input"));
			btn_attachmnet.sendKeys(attach);
			log.info("attached files");
		} catch (Exception e) {
			log.error("error attaching files!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnSave() {
		try {
			log.info("clicking on save!!");
			WebElement btn_indivSave = webDriver.findElement(By.xpath("//button[contains(text(),'Save')]"));
			click(btn_indivSave);
			waitFor(3000);
			scrollUpAndDown(100);
			log.info("clicked on save!!");
		} catch (Exception e) {
			log.error("error clicking on save!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnDownloadButton() {
		try {
			log.info("clicking on download scorecard button!");
			click(downloadScorecard_btn);
			waitFor(3000);
			log.info("clicked on download scorecard button!");
		} catch (Exception e) {
			log.error("error clicking on download scorecard button!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnDownloadAsPDFBtn() {
		try {
			log.info("clicking on download as pdf!");
			click(downloadAsPDF_btn);
			waitFor(6000);
			log.info("clicked on download as pdf!");
		} catch (Exception e) {
			log.error("error clicking on download as pdf!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnDownloadAsExcelBtn() {
		try {
			log.info("clicking on download as excel");
			click(downloadAsExcel_btn);
			waitFor(6000);
			log.info("clicked on download as excel");
		} catch (Exception e) {
			log.error("error clicking on download as excel");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyPDFFileDownloaded() {
		try {
			log.info("verifying pdf is downloaded!!");
			Assert.assertTrue(getDownloadedFileName().toLowerCase().endsWith("pdf"),
					"Downloaded file not pdf hence >>> Failed");
			log.info("verified pdf is downloaded!!");
		} catch (Exception e) {
			log.error("error verifying pdf is downloaded!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyExcelFileDownloaded() {
		try {
			log.info("verifying excel file is downloaded!!");
			Assert.assertTrue(
					getDownloadedFileName().toLowerCase().endsWith("xls")
					|| getDownloadedFileName().toLowerCase().endsWith("xlsx"),
					"Downloaded file not xls/xlsx hence >>> Failed");
			log.info("verified excel file is downloaded!!");
		} catch (Exception e) {
			log.error("error verifying excel file is downloaded!!");
			e.printStackTrace();
			Assert.fail();
		}
	}


	//Histroical_data


	public void EditDataInHistroicalData(String Typepagename)
	{
		try 
		{
			log.info("editing data in historical data for type:"+Typepagename);
			switch(Typepagename)
			{
			case "update performance":
				pagename="Update_performance";
				break;
			case "submit performance":
				pagename="Submit_performance";
				break;
			case "approve performance":
				pagename="Approve_performance";
				break;
			}


			for(int i=1;i<=Edit_All_Month_btn.size();i++)
			{
				log.info("click on the edit all month");
				WebElement Edit_All_Month_button=webDriver.findElement(By.xpath("(//img[contains(@ngbtooltip,'Edit for all months')])"+"["+i+"]"));
				waitUntilElementToBeClickable(Edit_All_Month_button);
				ScrollUpToElement(Edit_All_Month_button);
				//click(Edit_All_Month_button);
				clickOnElementByJs(Edit_All_Month_button);
				log.info("verify whether selected kpi is constant or summation");
				String type=verifyTypeOfKpi();
				System.out.println(type);
				

				if(type.equalsIgnoreCase("constant"))
				{
					log.info("entering the data for the constant kpi");
					EnterDataInconstantKpiData(pagename);
				}
				else
				{

					if(PeriodActual.get(0).isEnabled())
					{
						log.info("entering the data for the mtd summation kpi");
						System.out.println("KPI IS MTD SUMMATION");	
						EnterDataInMTD_summationkpi(pagename);

					}
					else
					{
						log.info("entering the data for the ytd summation kpi");
						System.out.println("KPI IS YTD SUMMATION");	
						EnterDataInYTD_summationkpi(pagename);
					}
				}
				waitUntilElementToBeClickable(save_btn);
				click(save_btn);
				waitFor(5000);
				log.info("edited data for type:" +Typepagename);
			}


		} 
		catch (Exception e) {
			log.error("error editing historical data for: "+Typepagename);
			e.printStackTrace();
			Assert.fail();
		}
	}
	public  String verifyTypeOfKpi()
	{


		try 
		{		log.info("verifying type of kpi");
			if(VerifyTypeOfKpi_txt.size()==1)
			{
				
				System.out.println("selected kpi is a constant kpi");
				Typeofkpi="constant";
			}
			else
			{
				System.out.println("selected kpi is a summation kpi");
				Typeofkpi="Summation";
			}
			
			log.info("verified type of kpi as "+ Typeofkpi);
		} 
		catch (Exception e) {
			log.error("error verifying type of kpi!!");
			e.printStackTrace();
			Assert.fail();

		}
		return Typeofkpi;
	}
	public void EnterDataInconstantKpiData(String pagename)
	{
		try 
		{
			log.info("entering data for constant kpi data for:"+ pagename);

			for(int i=0;i<Actual_constant.size();i++)
			{
				if(Actual_constant.size()==12)
				{
					log.info("enter the data fro monthly constant");
					enteractual("HISTROICALDATA.xlsx", pagename, i+3, "A", Actual_constant.get(i));
					if(!pagename.equalsIgnoreCase("Approve_performance"))
					{
					enterUserComment("HISTROICALDATA.xlsx",pagename, i+3, "B", constant_comment_txt.get(i));
					}
					else
					{
						enterUserComment("HISTROICALDATA.xlsx",pagename, i+3, "B", Supervisor_constant_comment_txt.get(i));
					}
					


				}
				else if(Actual_constant.size()==4)
				{	
					log.info("enter the data fro quaterly constant");
					enteractual("HISTROICALDATA.xlsx", pagename, i+3, "G", Actual_constant.get(i));
					
					if(!pagename.equalsIgnoreCase("Approve_performance"))
					{
					enterUserComment("HISTROICALDATA.xlsx",pagename, i+3, "H", constant_comment_txt.get(i));
					}
					else
					{
						enterUserComment("HISTROICALDATA.xlsx",pagename, i+3, "H", Supervisor_constant_comment_txt.get(i));
					}
				}
				else
				{
					log.info("enter the data fro half yearly constant");
					enteractual("HISTROICALDATA.xlsx", pagename, i+3, "D", Actual_constant.get(i));
					
					if(!pagename.equalsIgnoreCase("Approve_performance"))
					{
					enterUserComment("HISTROICALDATA.xlsx",pagename, i+3, "E", constant_comment_txt.get(i));
					}
					else
					{
						enterUserComment("HISTROICALDATA.xlsx",pagename, i+3, "E", Supervisor_constant_comment_txt.get(i));
					}
				}
				log.info("entered data for constant kpi data:"+ pagename);
			}

		} 
		catch (Exception e) {
			log.error("error entering constant kpi data for:"+pagename);
			e.printStackTrace();
			Assert.fail();
		}
	}
	public void EnterDataInMTD_summationkpi(String pagename)
	{
		try {


			log.info("entering MTD data for summation kpi for:"+pagename);
			for(int i=0;i<PeriodActual.size();i++)
			{
				if(PeriodActual.size()==12)
				{		
					log.info("enter the data for mtd monthly summation");
					enteractual("HISTROICALDATA.xlsx", pagename, i+18, "A", PeriodActual.get(i));
					if(!pagename.equalsIgnoreCase("Approve_performance"))
					{
					enterUserComment("HISTROICALDATA.xlsx",pagename, i+3, "B", summation_comment_txt.get(i));
					}
					else
					{
						enterUserComment("HISTROICALDATA.xlsx",pagename, i+3, "B", Supervisor_summation_comment_txt.get(i));
					}
				
				}
				else if(PeriodActual.size()==4)
				{
					log.info("enter the data for mtd quaterly summation");
					enteractual("HISTROICALDATA.xlsx", pagename, i+18, "G", PeriodActual.get(i));
					if(!pagename.equalsIgnoreCase("Approve_performance"))
					{
					enterUserComment("HISTROICALDATA.xlsx",pagename, i+3, "H", summation_comment_txt.get(i));
					}
					else
					{
						enterUserComment("HISTROICALDATA.xlsx",pagename, i+3, "H", Supervisor_summation_comment_txt.get(i));
					}
					
				}
				else
				{		
					log.info("enter the data for mtd half yearly summation");
					enteractual("HISTROICALDATA.xlsx", pagename, i+18, "D", PeriodActual.get(i));
					if(!pagename.equalsIgnoreCase("Approve_performance"))
					{
					enterUserComment("HISTROICALDATA.xlsx",pagename, i+3, "E", summation_comment_txt.get(i));
					}
					else
					{
						enterUserComment("HISTROICALDATA.xlsx",pagename, i+3, "E", Supervisor_summation_comment_txt.get(i));
					}
				}
				log.info("entered MTD data for summation kpi for:"+pagename);
			}



		} 
		catch (Exception e) {
			log.error("error entering MTD data for summation kpi for:"+pagename);
			e.printStackTrace();
			Assert.fail();
		}
	}
	public void EnterDataInYTD_summationkpi(String pagename)
	{
		try {


			log.info("entering YTD data for summation kpi for"+pagename);
			for(int i=0;i<Cummulative_Actual.size();i++)
			{
				if(Cummulative_Actual.size()==12)
				{
					log.info("enter the data for ytd monthly summation");
					enteractual("HISTROICALDATA.xlsx", pagename, i+18, "A", Cummulative_Actual.get(i));
					enterUserComment("HISTROICALDATA.xlsx",pagename, i+18, "B", summation_comment_txt.get(i));

				}
				else if(Cummulative_Actual.size()==4)
				{
					log.info("enter the data for ytd qauterly summation");
					enteractual("HISTROICALDATA.xlsx",pagename, i+18, "G", Cummulative_Actual.get(i));
					enterUserComment("HISTROICALDATA.xlsx",pagename, i+18, "H", summation_comment_txt.get(i));
				}
				else
				{
					log.info("enter the data for ytd half yearly summation");
					enteractual("HISTROICALDATA.xlsx", pagename, i+18, "D", Cummulative_Actual.get(i));
					enterUserComment("HISTROICALDATA.xlsx",pagename, i+18, "E", summation_comment_txt.get(i));
				}
			}
			log.info("entered YTD data for summation kpi for"+pagename);
		} 
		catch (Exception e) {
			log.error("error entering YTD data for summation kpi for"+pagename);
			e.printStackTrace();
			Assert.fail();
		}
	}
	public  void enterUserComment(String filename,String sheetname,int row,String col,WebElement comment_txt)
	{
		try 
		{
			String comment=ExcelFileReader.getCellValue(filename, sheetname, row, col);
			waitUntilElementVisible(comment_txt);
			log.info("entering the user comment");
			writeText(comment_txt, comment);
			log.info("entered the user comment");
		} 
		catch (Exception e) {
			log.error("error entering user comment");
			e.printStackTrace();
			Assert.fail();
		}
	}
	public  void enteractual(String filename,String sheetname,int row,String col,WebElement actual)
	{
		try 
		{log.info("entering the actual");
			String actualfromexcel=ExcelFileReader.getCellValue(filename, sheetname, row, col);
			
			waitUntilElementVisible(actual);
			writeText(actual, actualfromexcel);	
			log.info("entered the actual");
		} 
		catch (Exception e) {
			log.error("error entering the actual");
			e.printStackTrace();
			Assert.fail();
		}
	}


	//verify the histroical data
	public void verifyTheHistroicalDataInAllKpiDataTab(String Typepagename)
	{
		try 
		{
			log.info("verifying historical data for all kpi data for:"+ Typepagename);
			String pagename = null;
			switch(Typepagename)
			{
			case "update performance":
				pagename="Update_performance";
				break;
			case "submit performance":
				pagename="Submit_performance";
				break;
			case "approve performance":
				pagename="Approve_performance";	
				break;
			}

			
			
			if(!pagename.equalsIgnoreCase("Approve_performance"))
			{
				this.clickonKpiname=clickOnAllKpi_lnk;
			}
			else
			{
				this.clickonKpiname=clickOnAllKpi_lnkInApproveReview;
			}
			
			
			
			
			for(int i=0;i<clickonKpiname.size();i++)
			{
				log.info("click on kpi for kpi for all kpi data tab");
			//	WebElement kpiname=webDriver.findElement(By.xpath(clickonKpiname +"["+i+"]"));
				waitUntilElementToBeClickable(clickonKpiname.get(i));
				ScrollUpToElement(clickonKpiname.get(i));
			//	click(kpiname);
				clickOnElementByJs(clickonKpiname.get(i));
				waitUntilElementToBeClickable(AllkpiData_lnk);
				log.info("click on all kpi data");
				click(AllkpiData_lnk);
				log.info("verify the kpi is constant or summation");
				String type=verifyTypeOfKpi();
				System.out.println(type);
				
				if(type.equalsIgnoreCase("constant"))
				{
					log.info("verify data for constant kpi");
					VerifyDataInconstantKpiData(pagename);
				}
				else
				{

					if(verify_PeriodActual.get(0).isDisplayed())
					{
						System.out.println("KPI IS MTD SUMMATION");	
						VerifyDataInMTD_summationkpiInAllKpiData(pagename);
						calculationOfCummlativeActual(pagename);

					}
					else
					{
						System.out.println("KPI IS YTD SUMMATION");

					}
				}
				log.info("clicking on back button!!");
				click(back_btn);  //click(close_lnk);
				waitFor(3000);
				log.info("clicked on back button!!");


			}
			log.info("verified historical data for all kpi data for:"+ Typepagename);
		} 
		catch (Exception e) {
			log.error("error verifying historical data for all kpi data for:"+ Typepagename);
			e.printStackTrace();
			Assert.fail();
		}
	}
	public void VerifyDataInconstantKpiData(String pagename)
	{
		try 
		{
			log.info("verifying Data in constant Kpi Data for:"+ pagename);

			for(int i=0;i<Verify_Actual.size();i++)
			{
				if(Verify_Actual.size()==12)
				{

					String actual = ExcelFileReader.getCellValue("HISTROICALDATA.xlsx", pagename, i+3, "A");
					//String comment = ExcelFileReader.getCellValue("HISTROICALDATA.xlsx", pagename, i+3, "B");
					System.out.println("actual of monthly constant  " +Verify_Actual.get(i).getText());

					assertEquals(actual, Verify_Actual.get(i).getText().trim(), "histroical  value data is not matching for monthly constant");
					//assertEquals(comment, Verify_Comment.get(i).getText().trim(), "histroical comment data is not matching for monthly constant");


				}
				else if(Verify_Actual.size()==4)
				{	

					String actual = ExcelFileReader.getCellValue("HISTROICALDATA.xlsx", pagename, i+3, "G");
					//	String comment = ExcelFileReader.getCellValue("HISTROICALDATA.xlsx", pagename, i+3, "H");
					System.out.println("actual of quaterly constant  "+  Verify_Actual.get(i).getText());
					assertEquals(actual, Verify_Actual.get(i).getText().trim(), "histroical value  data is not matching for qauterly constant");
					//assertEquals(comment, Verify_Comment.get(i).getText().trim(), "histroical coment data is not matching for qauterly constant");
				}
				else
				{

					String actual = ExcelFileReader.getCellValue("HISTROICALDATA.xlsx", pagename, i+3, "D");
					//	String comment = ExcelFileReader.getCellValue("HISTROICALDATA.xlsx", pagename, i+3, "E");
					System.out.println("actual of half yearly constant  "+  Verify_Actual.get(i).getText());
					assertEquals(actual, Verify_Actual.get(i).getText().trim(), "histroical value data is not matching for halfyearly constant");
					//	assertEquals(comment, Verify_Comment.get(i).getText().trim(), "histroical comment data is not matching for halfyearly constant");
				}
				log.info("verified Data in constant Kpi Data for:"+ pagename);
			}

		} 
		catch (Exception e) {
			log.error("error verifying Data in constant Kpi Data for:"+ pagename);
			e.printStackTrace();
			Assert.fail();
		}

	}
	public void VerifyDataInMTD_summationkpiInAllKpiData(String pagename)
	{
		try {

			log.info("verifying MTD Data in summation Kpi Data for:"+ pagename);

			for(int i=0;i<Verify_periodActual.size();i++)
			{
				if(Verify_periodActual.size()==12)
				{			
					String actual = ExcelFileReader.getCellValue("HISTROICALDATA.xlsx", pagename, i+18, "A");
					//	String comment = ExcelFileReader.getCellValue("HISTROICALDATA.xlsx", pagename, i+18, "B");
					System.out.println("actual of monthly constant  "+  Verify_periodActual.get(i).getText());
					assertEquals(actual, Verify_periodActual.get(i).getText().trim(), "histroical  value data is not matching for monthly constant");
					//	assertEquals(comment, Verifysummation_comment_txt.get(i).getText().trim(), "histroical comment data is not matching for monthly constant");

				}
				else if(Verify_periodActual.size()==4)
				{
					String actual = ExcelFileReader.getCellValue("HISTROICALDATA.xlsx", pagename, i+18, "G");
					//	String comment = ExcelFileReader.getCellValue("HISTROICALDATA.xlsx", pagename, i+18, "H");
					System.out.println("actual of quaterly constant  "+  Verify_periodActual.get(i).getText());
					assertEquals(actual, Verify_periodActual.get(i).getText().trim(), "histroical  value data is not matching for quaterly constant");
					//	assertEquals(comment, Verifysummation_comment_txt.get(i).getText().trim(), "histroical comment data is not matching for quaterly constant");

				}
				else
				{		
					String actual = ExcelFileReader.getCellValue("HISTROICALDATA.xlsx", pagename, i+18, "D");
					//	String comment = ExcelFileReader.getCellValue("HISTROICALDATA.xlsx", pagename, i+18, "E");
					System.out.println("actual of half yearly constant  "+  Verify_periodActual.get(i).getText());
					assertEquals(actual, Verify_periodActual.get(i).getText().trim(), "histroical  value data is not matching for halfyearly constant");
					//	assertEquals(comment, Verifysummation_comment_txt.get(i).getText().trim(), "histroical comment data is not matching for halfyearly constant");
				}

			}
			log.info("verified MTD Data in summation Kpi Data for:"+ pagename);


		} 
		catch (Exception e) {
			log.error("error verifying MTD Data in summation Kpi Data for:"+ pagename);
			e.printStackTrace();
			Assert.fail();
		}
	}
	public void calculationOfCummlativeActual(String pagename)
	{
		try 
		{
			log.info("calculating cumulative actual for:"+ pagename); 
			if(verify_PeriodActual.size()==12)
			{
				double first_cummulativevalue=Double.parseDouble(Verify_cummalativeActual.get(0).getText().trim());
				double second_periodactualvalue=Double.parseDouble(verify_PeriodActual.get(1).getText().trim());
				double sum;

				for(int i=2;i<=verify_PeriodActual.size();i++)
				{
					sum=first_cummulativevalue + second_periodactualvalue;
					if(i!=12)
					{
						first_cummulativevalue=sum;
						second_periodactualvalue=Double.parseDouble(verify_PeriodActual.get(i).getText().trim());
					}
					
					 BigDecimal cumulative_total = new BigDecimal(sum).setScale(2, RoundingMode.HALF_UP);
					 System.out.println("cumulative actual score for monthly summation  "+  cumulative_total);
					 //verify from excel
					
					 String excepeted_cum_act=ExcelFileReader.getCellValue("HISTROICALDATA.xlsx", pagename, i+17, "C");
					 System.out.println(excepeted_cum_act);
					 assertEquals(cumulative_total.toString(), excepeted_cum_act, "cumulative   value data is not matching for quaterly summation");
				}
			} 
			else if(verify_PeriodActual.size()==4)
			{
				double first_cummulativevalue=Double.parseDouble(Verify_cummalativeActual.get(0).getText().trim());
				double second_periodactualvalue=Double.parseDouble(verify_PeriodActual.get(1).getText().trim());
				double sum;

				for(int i=2;i<=verify_PeriodActual.size();i++)
				{
					sum=first_cummulativevalue + second_periodactualvalue;
					if(i!=4)
					{
						first_cummulativevalue=sum;
						second_periodactualvalue=Double.parseDouble(verify_PeriodActual.get(i).getText().trim());
					}
					BigDecimal cumulative_total = new BigDecimal(sum).setScale(2, RoundingMode.HALF_UP);
					System.out.println("cumulative actual score for quaterly  summation  "+cumulative_total);
					
					String excepeted_cum_act=ExcelFileReader.getCellValue("HISTROICALDATA.xlsx", pagename, i+17, "I");
					 assertEquals(cumulative_total.toString(), excepeted_cum_act, "cumulative   value data is not matching for quaterly summation");
				}
			}
			else
			{
				double first_cummulativevalue=Double.parseDouble(Verify_cummalativeActual.get(0).getText().trim());
				double second_periodactualvalue=Double.parseDouble(verify_PeriodActual.get(1).getText().trim());
				double sum=first_cummulativevalue + second_periodactualvalue;
				
				BigDecimal cumulative_total = new BigDecimal(sum).setScale(2, RoundingMode.HALF_UP);
				System.out.println("cumulative actual score for half yearly summation  "+ cumulative_total);
				
				String excepeted_cum_act=ExcelFileReader.getCellValue("HISTROICALDATA.xlsx", pagename, 19, "F");
				 assertEquals(cumulative_total.toString(), excepeted_cum_act, "cumulative   value data is not matching for halfyearly summation");
			}
			log.info("calculated cumulative actual for:"+ pagename); 
		}
		catch (Exception e) {
			log.error("error calculating cumulative actual for:"+ pagename); 
			e.printStackTrace();
			Assert.fail();
		}
	}




}
