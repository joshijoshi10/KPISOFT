package pageObjects;

import static org.junit.Assert.fail;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.google.common.cache.Weigher;

import helper.LoggerHelper;

public class PushKpiPage extends BasePage
{

	Logger log = LoggerHelper.getLogger(LoggerHelper.class);

	public PushKpiPage(WebDriver webDriver) 
	{
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how=How.XPATH, using="//h5[contains(text(),'Push Kpi to Subordinate')]")
	private WebElement PushKpiCard;

	@FindBy(how=How.XPATH, using="//span[contains(text(),'PushKpi')]")
	private WebElement VerifyPushKpiCard;

	@FindBy(how=How.XPATH, using="(//i[contains(@class,'fas fa-file-export')])[1]")
	private WebElement PusshKpi_icon;

	@FindBy(how=How.XPATH, using="(//i[contains(@class,'fas fa-file-export')])[2]")
	private WebElement PusshKpiForShare_icon;

	//subordinate_page
	@FindBy(how=How.XPATH, using="(//h5[contains(text(),'Subordinates')]/ancestor::div)[last()-2]")
	private WebElement Verify_Suordinate_page;

	@FindBy(how=How.XPATH, using="//select[@id='push_kpi_select_program']")
	private WebElement programname_dd;

	/*	@FindBy(how=How.XPATH, using="(//input[contains(@id,'subordinate')]/../..)[1]")
	private WebElement Subordinate_chbx;*/

	@FindBy(how=How.XPATH, using="//input[contains(@id,'Own')]/../..")
	private WebElement Own_chbx;

	@FindBy(how=How.XPATH, using="//input[contains(@id,'Share')]/../..")
	private WebElement Share_chbx;

	@FindBy(how=How.XPATH, using="//input[contains(@id,'Support')]/../..")
	private WebElement Support_chbx;

	//listofsubordinate_page
	@FindBy(how=How.XPATH, using="//h5[contains(text(),'List of subordinates')]/ancestor::push-kpi-details//li//b")
	private WebElement VerifySuordinateInListOfSubordinate_page;

	@FindBy(how=How.XPATH, using="//button[contains(text(),'Next')]")
	private WebElement Next_btn;

	/*@FindBy(how=How.XPATH, using="//small[contains(text(),'owned:')]//span")
	private List<WebElement> Own_count;

	@FindBy(how=How.XPATH, using="//small[contains(text(),'shared:')]//span")
	private List<WebElement> Share_count;

	@FindBy(how=How.XPATH, using="//small[contains(text(),'supported:')]//span")
	private List<WebElement> Support_count;*/

	@FindBy(how=How.XPATH, using="//label[contains(text(),'Cascade Type')]/../div//label")
	private WebElement VerifyOnlySupport_chbx;

	@FindBy(how=How.XPATH, using="//button[contains(text(),'Back')]")
	private WebElement back_btn;

	@FindBy(how=How.XPATH, using="//button[contains(text(),'Cancel')]")
	private WebElement cancel_btn;

	@FindBy(how=How.XPATH, using="//button[contains(text(),'Confirm')]")
	private WebElement confirm_btn;

	@FindBy(how=How.XPATH, using="//h5[contains(text(),'Cancel Confirmation')]/../..")
	private WebElement verifyPopup;


	//puskpi_page

	@FindBy(how=How.XPATH, using="//h5[contains(text(),'Push Kpi')]/ancestor::editscorecard")
	private WebElement VerifyPushkpi_page;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'KPI Name')]/../textarea")
	private WebElement txt_kpiname;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Description')]/../textarea")
	private WebElement txt_kpidesc;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Weightage')]/../input")
	private WebElement txt_kpiwtg;

	@FindBy(how = How.XPATH, using = "//label[.='Target']/../input")
	private WebElement txt_kpiTarget;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Toggle')]")
	private WebElement chk_toogle;

	@FindBy(how=How.XPATH, using="//button[contains(text(),'Push Kpi')]")
	private WebElement PushKpi_btn;

	@FindBy(how=How.XPATH, using="//button[contains(text(),'OK, Confirm')]")
	private WebElement OkConfirm_btn;

	@FindBy(how=How.XPATH, using="//b[@placement='bottom']")
	private List<WebElement> ListOfSuborinate;

	//Afterpush
	@FindBy(how=How.XPATH, using="(//span[contains(text(),'pushed')])[1]")
	private WebElement pushed_label;

	@FindBy(how=How.XPATH, using="(//div[@class='openhover'])/i[4]")
	private List<WebElement> delete_btn;


	public void clickOnPushKpiCard() 
	{
		try{
			log.info("Entered clickOnPushKpiCard succesfully");
			waitUntilElementToBeClickable(PushKpiCard);
			click(PushKpiCard);
			waitFor(2000);
			log.info("Executed clickOnPushKpiCard Successfully"); 
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed clickOnPushKpiCard");
			e.printStackTrace(); 
			throw e;
		}
	}
	public void VerifyPushKpiPage()
	{
		try 
		{
			log.info("Entered VerifyPushKpiPage succesfully");
			Assert.assertEquals(VerifyPushKpiCard.getText().trim(), "PushKpi");
			log.info("Executed VerifyPushKpiPage Successfully"); 
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed VerifyPushKpiPage");
			e.printStackTrace(); 
			throw e;

		}
	}

	public void clickOnPushKpiIcon(String Type)
	{
		try{
			log.info("Entered clickOnPushKpiIcon succesfully");
			if(Type.equalsIgnoreCase("Own") || Type.equalsIgnoreCase("Support"))
			{
				waitUntilElementToBeClickable(PusshKpi_icon);
				click(PusshKpi_icon);
			}
			else
			{
				waitUntilElementToBeClickable(PusshKpi_icon);
				click(PusshKpiForShare_icon);
			}
			log.info("Executed clickOnPushKpiIcon Successfully"); 
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed clickOnPushKpiIcon");
			e.printStackTrace(); 
			throw e;


		}
	}
	public void verifySubordinatePageAndGoToNext()
	{
		try{
			log.info("Entered verifySubordinatePageAndGoToNext succesfully");
			waitUntilElementVisible(Verify_Suordinate_page);
			if(Verify_Suordinate_page.isDisplayed())
			{
				System.out.println("verfied");
			}
			log.info("Executed verifySubordinatePageAndGoToNext Successfully"); 
		} 
		catch  (Exception e) 
		{

			log.error("Not Executed verifySubordinatePageAndGoToNext");
			e.printStackTrace(); 
			throw e;


		}
	}
	public void selectTheProgram(String Programname)
	{
		try{
			log.info("Entered selectTheProgram succesfully");
			waitUntilElementVisible(programname_dd);
			setValueInDropdownText(programname_dd,Programname );
	/*		log.info("Clicking programname_dd");
			click(programname_dd);
			waitUntilElementToBeClickableRepeated(
					webDriver.findElement(By.xpath("//select[@id='push_KPI']/option[1]")),2);
			WebElement option = webDriver.findElement(By.xpath("//select[@id='push_KPI']/option[contains(text(),'"+Programname+"')][last()]"));
			log.info("Clicking option");
			option.click();
			log.info("Clicking programname_dd");
			click(programname_dd);*/

			log.info("Executed selectTheProgram Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed selectTheProgram");
			e.printStackTrace();
			System.out.println("program name is not displayed in fropdown" + e.getMessage());
			throw e;

		}
	}
	public void selectTheSubordinate(String Subordinatename)
	{
		try{
			log.info("Entered selectTheSubordinate succesfully");
			boolean value=false;
			//	List<WebElement> Totalsubordinatesnames = webDriver.findElements(By.xpath("//b[@placement='bottom']"));

			Iterator<WebElement> nameofsubordinates = ListOfSuborinate.iterator();

			while(nameofsubordinates.hasNext())
			{
				if(nameofsubordinates.next().getText().equalsIgnoreCase(Subordinatename))
				{

					value=true;
				}


			}
			if(value)
			{
				WebElement Subordinate_chbx=webDriver.findElement(By.xpath("//b[contains(text(),'"+Subordinatename+"')]/ancestor::div[3]//input[contains(@id,'subordinate')]/../.."));
				waitUntilElementVisible(Subordinate_chbx);
				click(Subordinate_chbx);
			}
			else
			{
				throw new NoSuchElementException("Since " +Subordinatename+ " not presenteed in the list--hence failed");
			}



			log.info("Executed selectTheSubordinate Successfully"); 
		} catch  (Exception e) 
		{

			log.error("Not Executed selectTheSubordinate");
			e.printStackTrace(); 
			throw e;

		}
	}
	public void ClickOnOwn()
	{
		try{
			log.info("Entered ClickOnOwn succesfully");

			waitUntilElementToBeClickable(Own_chbx);	
			click(Own_chbx);
			log.info("Executed ClickOnOwn Successfully"); 
		} catch  (Exception e) {

			log.error("Not Executed ClickOnOwn");
			e.printStackTrace(); 
			throw e;

		}
	}
	public void ClickOnShare()
	{
		try{
			log.info("Entered ClickOnShare succesfully");
			waitUntilElementToBeClickable(Share_chbx);
			click(Share_chbx);


			log.info("Executed ClickOnShare Successfully"); 
		} catch  (Exception e) {

			log.error("Not Executed ClickOnShare");
			e.printStackTrace(); 
			throw e;

		}
	}
	public void ClickOnSupport()
	{
		try{
			log.info("Entered ClickOnSupport succesfully");
			waitUntilElementToBeClickable(Support_chbx);
			clickOnElementByJs(Support_chbx);


			log.info("Executed ClickOnSupport Successfully"); 
		} catch  (Exception e) {

			log.error("Not Executed ClickOnSupport");
			e.printStackTrace(); 
			throw e;

		}
	}
	public void ClickOnNextButtonForPushKpi()
	{
		try{
			log.info("Entered ClickOnNextButtonForPushKpi succesfully");
			waitUntilElementToBeClickable(Next_btn);
			click(Next_btn);


			log.info("Executed ClickOnNextButtonForPushKpi Successfully"); 
		} catch  (Exception e) {

			log.error("Not Executed ClickOnNextButtonForPushKpi");
			e.printStackTrace(); 
			throw e;

		}
	}

	public void VerifyListOfSubordinate(String subordinatename)
	{
		try{
			log.info("Entered VerifyListOfSubordinate succesfully");
			assertTrue(VerifySuordinateInListOfSubordinate_page.getText().trim().equalsIgnoreCase(subordinatename), 
					"Subodinate is mission in the listof subordinate page");
			log.info("Executed VerifyListOfSubordinate Successfully"); 	
		} 
		catch (Exception e) {
			log.error("Not Executed VerifyListOfSubordinate");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void checkForFieldsAndEnter(String Kpiname, String kpidesc, String wtg, String target) 
	{

		try{
			log.info("Entered checkForFieldsAndEnter succesfully");
			if (txt_kpiname.isEnabled()) {
				click(txt_kpiname);
				writeText(txt_kpiname, Kpiname);
			}
			if (txt_kpidesc.isEnabled()) {
				click(txt_kpidesc);
				writeText(txt_kpidesc, kpidesc);
			}
			if (txt_kpiwtg.isEnabled()) {
				click(txt_kpiwtg);
				writeText(txt_kpiwtg, wtg);
			}
			log.info("Executed checkForFieldsAndEnter Successfully"); 	
		}
		catch (Exception e) {

			log.error("Not Executed checkForFieldsAndEnter");
			e.printStackTrace(); 
			throw e;

		}
	}
	public void ClickOnPushKpiButton()
	{
		try{
			log.info("Entered ClickOnPushKpiButton succesfully");
			waitUntilElementToBeClickable(PushKpi_btn);
			click(PushKpi_btn);
			waitFor(3000);
			log.info("Executed ClickOnPushKpiButton Successfully"); 
		} catch  (Exception e) {

			log.error("Not Executed ClickOnPushKpiButton");
			e.printStackTrace(); 
			throw e;
		}
	}
	public void ClickOnOkConfirm()
	{
		try{
			log.info("Entered ClickOnOkConfirm succesfully");
			waitUntilElementToBeClickable(OkConfirm_btn);
			click(OkConfirm_btn);
			waitFor(3000);
			log.info("Executed ClickOnOkConfirm Successfully"); 
		} catch  (Exception e) {

			log.error("Not Executed ClickOnOkConfirm");
			e.printStackTrace(); 
			throw e;
		}
	}
	public void verifyThePushedLabel()
	{
		try{
			log.info("Entered verifyThePushedLabel succesfully");
			waitUntilElementVisible(pushed_label);

			log.info("Executed verifyThePushedLabel Successfully"); 
		} catch  (Exception e) 
		{

			log.error("Not Executed verifyThePushedLabel");
			e.printStackTrace(); 
			throw e;
		}
	}
	public void verifyDeleteButtonForPushedKpi()
	{
		try{
			log.info("Entered verifyDeleteButtonForPushedKpi succesfully");
			Assert.assertTrue(delete_btn.size()==0, " delete option is displayed---> failed");

			log.info("Executed verifyDeleteButtonForPushedKpi Successfully"); 
		} catch  (Exception e) 
		{

			log.error("Not Executed verifyDeleteButtonForPushedKpi");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void ClickOnBack()
	{
		try{
			log.info("Entered ClickOnBack succesfully");

			waitUntilElementToBeClickable(back_btn);	
			click(back_btn);
			log.info("Executed ClickOnBack Successfully"); 
		} catch  (Exception e) {

			log.error("Not Executed ClickOnBack");
			e.printStackTrace(); 
			throw e;

		}
	}
	public void ClickOnCancel()
	{
		try{
			log.info("Entered ClickOnCancel succesfully");

			waitUntilElementToBeClickable(cancel_btn);	
			click(cancel_btn);
			log.info("Executed ClickOnCancel Successfully"); 
		} catch  (Exception e) {

			log.error("Not Executed ClickOnCancel");
			e.printStackTrace(); 
			throw e;

		}
	}
	public void verifyTheCount(String Type,String subordinatename)
	{


		try{
			log.info("Entered verifyTheCount succesfully");
			if(Type.equalsIgnoreCase("Own"))
			{
				WebElement Own_count = webDriver.findElement(By.xpath("//b[contains(text(),'"+subordinatename+"')]/..//small[contains(text(),'owned:')]//span"));
				assertEquals(Own_count.getText().trim(), "1", "Since the own count is not proper hence failed");
			}
			else if(Type.equalsIgnoreCase("Support"))
			{
				WebElement Support_count = webDriver.findElement(By.xpath("//b[contains(text(),'"+subordinatename+"')]/..//small[contains(text(),'supported:')]//span"));
				assertEquals(Support_count.getText().trim(), "1", "Since the support count is not proper hence failed");
			}
			else
			{
				WebElement Share_count = webDriver.findElement(By.xpath("//b[contains(text(),'"+subordinatename+"')]/..//small[contains(text(),'shared:')]//span"));
				assertEquals(Share_count.getText().trim(), "1", "Since the share count is not proper hence failed");
			}


			log.info("Executed verifyTheCount Successfully"); 
		} catch  (Exception e) {

			log.error("Not Executed verifyTheCount");
			e.printStackTrace(); 
			throw e;
		}
	}
	public void verifyConfirmPopup()
	{
		try{
			log.info("Entered verifyConfirmPopup succesfully");
			waitUntilElementVisible(verifyPopup);
			log.info("Executed verifyConfirmPopup Successfully"); 
		} catch (Exception e) {

			log.error("Not Executed verifyConfirmPopup");
			e.printStackTrace(); 
			throw e;
		}
	}
	public void verifySubordinatePageAfterClickOnConfirm()
	{
		try{
			log.info("Entered verifySubordinatePageAfterClickOnConfirm succesfully");
			waitUntilElementToBeClickable(confirm_btn);
			click(confirm_btn);

			log.info("Executed verifySubordinatePageAfterClickOnConfirm Successfully"); 
		} catch  (Exception e) {

			log.error("Not Executed clickOverifySubordinatePageAfterClickOnConfirmnJobCategoryLink");
			e.printStackTrace(); 
			throw e;
		}
	}

}
