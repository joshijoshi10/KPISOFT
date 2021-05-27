package pageObjects;

import config.ExcelFileReader;
import helper.LoggerHelper;
import util.ManagerUtil;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;


public class HomePage extends BasePage {

	Logger log = LoggerHelper.getLogger(LoggerHelper.class);
	
	public HomePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Verify all')]")
	private WebElement clickOnVerifyAllBtn;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Scorecard Published')]")
	private WebElement verifyScorecardPublishedLabel;
	
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Scorecard Published')]")
	private WebElement verifyScorecardPublishedLabel1;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Back to me')]")
	private WebElement clickBackToMeLink;
	
	//@FindBy(how = How.CSS, using = "div[class='btn-group mt-2 skylark-show'] button[name='approveIndividual0']")
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Accept')])[2]")
	private WebElement acceptButton;
			
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Approve all')]")
	private WebElement clickApproveAllButton;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Confirm')]")
	private WebElement confirmButton;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'OK, Confirm')]")
	private WebElement okConfirmButton;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Update Performance')]")
	private WebElement clk_UpdatePerformance;	
	
	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'Update Performance')])[1]")
	private WebElement clk_UpdatePerformanceLabel;
	
	@FindBy(how = How.XPATH, using = "//li[@id='profile']")
	public WebElement drpDwnMenuButton;

	@FindBy(how = How.XPATH, using = "//li[@id='profile']//div[@id='dropdownMenuButton']") //"(//div[@id='dropdownMenuButton'])[2]")
	public WebElement drpDwnMenuButtonSuperAdmin;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Things to know')]/..")  //"//h5[contains(text(),'Things to know')]/.."
	private WebElement lnk_thingsToKnow;

	@FindBy(how = How.XPATH, using = "//div[@id='ThingsToKnow-panel']/div/div/p[contains(text(),'Filter')]")
	private WebElement lnk_thingsToKnowFilter;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Select All')]/../div[2]")
	private WebElement chk_thingsToKnowFilterSelectAll;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Announcement')]/../div[2]")
	private WebElement chk_thingsToKnowFilterAnnouncement;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Performance Program')]/../div[3]")
	private WebElement chk_thingsToKnowFilterPerfProg;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Check-ins')]/../div[2]")
	private WebElement chk_thingsToKnowFilterCheckin;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Apply')]")
	private WebElement btn_thingsToKnowFilterApply;

	@FindBy(how = How.ID, using = "thingstodo")
	private WebElement lnk_thingsToDo;

	@FindBy(how = How.LINK_TEXT, using = "Logout")
	private WebElement lnk_logOut;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'EPMS-Admin')]")
	private WebElement lnk_epmsAdmin;
	String lnk_epmsAdmin_ltr = "//a[contains(text(),'EPMS-Admin')]";

	@FindBy(how = How.XPATH, using = "//a[text()='Profile']")
	private WebElement lnk_Profile;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Settings')]")
	private WebElement clickLnk_settings;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Select Year:')]/../div[1]/select")
	private WebElement select_YearInProfile;

	@FindBy(how = How.ID, using = "ThingsToKnow")
	private WebElement thingsToKnow_Btn;

	@FindBy(how = How.ID, using = "ThingsToDo")
	private WebElement thingsToDo_Btn;

	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'Create your Own Scorecard')])[1]")
	private WebElement createYourOwnScorecard_Btn;
	
	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'Re-submit scorecard')])[1]")
	private WebElement resubmit_scorecard_lbl;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Review')]/../..")
	private WebElement reviewTheirScorecard_lbl;
	
	@FindBy(how = How.XPATH, using = "//body//app-root//approve-scorecard//h5[1]")
	private WebElement reviewTheirScorecard_Btn;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Re-submit scorecard')]")
	private WebElement resubmitScorecard_Btn;

	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'Verify ')][descendant-or-self::text()])[1]")
//	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Their Scorecard')]")
//	@FindBy(how = How.XPATH, using = "//body//app-root//verify-scorecard//h5[1]")
	private WebElement verifyTheirScorecard_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='ThingsToDo-panel']/app-things-to-do/div/div[1]/create-base-checkins/div/div/div/div")
	private WebElement lnk_checkinUser;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"card-header\"]/h5")
	private WebElement lbl_checkIn;

	@FindBy(how = How.XPATH, using = "(//textarea[@id=\"progress\"])[1]")
	private WebElement txtbx_heading1;

	@FindBy(how = How.XPATH, using = "(//textarea[@id=\"progress\"])[2]")
	private WebElement txtbx_heading2;

	@FindBy(how = How.XPATH, using = "(//textarea[@id=\"progress\"])[3]")
	private WebElement txtbx_heading3;

	@FindBy(how = How.XPATH, using = "(//span[@class='star'])[1]") //"(//label[@class='full'])[1]")
	private WebElement tag_Star;

	@FindBy(how = How.XPATH, using = "//button[normalize-space() = 'Check-in']")
	private WebElement btn_check_in;

	@FindBy(how = How.XPATH, using = "(//p[contains(text(),'(Check-ins)')])[1]/../../..")
	private WebElement btn_checkSubmitWidget;

	@FindBy(how = How.XPATH, using = "//div[@class='media-body']/textarea")
	private WebElement txtbx_feedback;

	
	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'View your published scorecard')])[1]")
//	@FindBy(how = How.XPATH, using = "//button[contains(text(),'View your published scorecard')]")
	private WebElement btn_publishScorecard;
	
	@FindBy(how =How.XPATH,using = "//button[contains(text(),'Publish')]")
	private  WebElement btn_publish;
	
	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'Submit your performance for this period')])[1]")
	private WebElement btn_submitYourPerformance;

	@FindBy(how = How.XPATH, using = "//div[@class='card-body']/div[1]/p[2]")
	private WebElement lbl_heading;

	@FindBy(how = How.XPATH, using = "//h5[text()='Supervisor has reviewed your checkin and commented']")
	private WebElement lnk_reviewCheckin;

	@FindBy(how = How.XPATH, using = "//div/b[text()='Comment']/../following-sibling::div/p") //"//div[@class=\"media-body comments\"]/p")
	private WebElement lbl_feedback;

	@FindBy(how = How.XPATH, using = "//span[text()='Logout ']")
	private WebElement logout_btn;
	@FindBy(how = How.XPATH, using = "//take-kpi-from-supervisor//b")
	private WebElement lbl_takeKpiSupervisorName;
	
	@FindBy(how = How.XPATH, using = "//small[text()='Primary Supervisor']/../div/div/b")
	private WebElement lbl_primary_supervisor_val;

	@FindBy(how = How.ID, using = "userGroup")
	private WebElement userGroup_btn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"float-input\"]")
	private WebElement shareMessage_txtArea;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement next_btn;

	@FindBy(how = How.XPATH, using = "//button[@name='Submit Share']")
	private WebElement share_Btn;

	@FindBy(how = How.ID, using = "search")
	private WebElement search_textBox;

	@FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[2]")
	private WebElement checkBox;

	@FindBy(how = How.XPATH, using = "(//div[@class='ql-editor viewMode']//..//..//button[@id='shareBtn'])[1]")
	private WebElement announcement_ShareBtn;

	//verifyThingstodo
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Things to do')]")
	private List<WebElement> lnk_verifyThingstodo;

	//verify like share comment
	@FindBy(how = How.XPATH, using = "//button[contains(@id,'shareBtn')]")
	private List<WebElement> lnk_verifyShare;

	@FindBy(how = How.XPATH, using = "//button[contains(@id,'likeBtn')]")
	private List<WebElement> lnk_verifyLike;

	@FindBy(how = How.XPATH, using = "//textarea[contains(@id,'comment')]")
	private List<WebElement> lnk_verifyComment;

	@FindBy(how = How.XPATH, using = "(//div[contains(@id,'employees-panel')]//p)[position() mod 2=1]")
	private List<WebElement> verify_ShareRecipts;

	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),' announcement_Title')])[1]/ancestor::div[3]//showcomment//textarea")
	private List<WebElement> searchForAdminAnn;

	@FindBy(how = How.XPATH, using = "//img[contains(@src,'TENANT_IMAGE')]")
	private WebElement TenantLogo_lnk;

	@FindBy(how = How.XPATH, using = "//html")
	private WebElement TenantFont_lnk;

	@FindBy(how = How.XPATH, using = "//img[contains(@class,'pic rounded-top ')]")
	private WebElement DisplayPicture_lnk;

	@FindBy(how = How.XPATH, using = "//small[contains(text(),'My Rating')]/../p")
	private WebElement verifyOverallScoreAsDescription;

	@FindBy(how = How.XPATH, using = "//h6")
	private WebElement thingsToDoReviewLabel;
	
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),\"KPI's\")]")
	private WebElement verifyKpiLabel;

	@FindBy(how = How.XPATH, using = "//card-header//p")
	private WebElement thingsToDoReviewRequest;
	
	@FindBy(how = How.XPATH, using = "//body//app-root//approve-review//h5[1]")
	private WebElement reviewPerformanceLabel;
	
	@FindBy(how = How.XPATH, using = "//body//app-root//approve-review//h5[1]")
//	@FindBy(how = How.XPATH, using = "//div[@class='hub-cards']//div//approve-review//div[@class='btn-card']")
	private WebElement clk_verifyReviewPerformanceLabel;
	
	
	public void VerifyKpiLabel() {
		try {
			log.info("Entered VerifyKpiLabel");
			Assert.assertTrue(verifyKpiLabel.getText().contains("KPI's"),
					"VerifyKpiLabel missing");
			log.info("Executed VerifyKpiLabel Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyKpiLabel Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	
	public void ClickBackToMeLink() {
		try {
			log.info("Entered ClickBackToMeLink");
			log.info("clicking on ClickBackToMeLink");
			click(clickBackToMeLink);
			log.info("Executed ClickBackToMeLink successfully");
		} catch (Exception e) {
			log.error("Executed ClickBackToMeLink not successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void clickOnVerifyAllBtn() {
		try {
			log.info("Entered clickOnVerifyAllBtn successfully");
			click(clickOnVerifyAllBtn);
			log.info("Executed clickOnVerifyAllBtn successfully");
		} catch (Exception e) {
			log.error("Not executed clickOnVerifyAllBtn");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void ClickreviewPerformanceLabel() {
		try {
			log.info("Entered ClickreviewPerformanceLabel successfully");
			click(reviewPerformanceLabel);
			log.info("Executed ClickreviewPerformanceLabel successfully");
		} catch (Exception e) {
			log.error("Not executed ClickreviewPerformanceLabel");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void click_verifyReviewPerformanceLabel() {
		try {
			log.info("Entered Click_verifyReviewPerformanceLabel successfully");
			waitFor(1000);
//			pageRefresh();
			waitUntilElementToBeClickable(clk_verifyReviewPerformanceLabel);
			click(clk_verifyReviewPerformanceLabel);
//			waitFor(1000);
			log.info("Executed Click_verifyReviewPerformanceLabel successfully");
		} catch (Exception e) {
			log.error("Not executed Click_verifyReviewPerformanceLabel");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void clickLnk_settings() {
		try {
			log.info("Entered ClickLnk_settings successfully");
			click(clickLnk_settings);
			log.info("Executed ClickLnk_settings successfully");
		} catch (Exception e) {
			log.error("Not executed ClickLnk_settings");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void acceptButton() {
		try {
			log.info("Entered AcceptButton");
			log.info("clicking on AcceptButton");
			waitFor(2000);
			click(acceptButton);
			log.info("Executed AcceptButton successfully");
		} catch (Exception e) {
			log.error("Executed AcceptButton not successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void verifyScorecardPublishedLabel() {
		try {
			log.info("Entered verifyScorecardPublishedLabel");
			Assert.assertTrue(verifyScorecardPublishedLabel.getText().contains("Scorecard Published"),
					"finalreview_label missing");
			log.info("Executed verifyScorecardPublishedLabel Successfully");
		} catch (Exception e) {
			log.error("Executed verifyScorecardPublishedLabel Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void verifyScorecardPublishedLabel1() {
		try {
			log.info("Entered VerifyScorecardPublishedLabel1");
			Assert.assertTrue(verifyScorecardPublishedLabel1.getText().contains("Scorecard Published"),
					"finalreview_label missing");
			log.info("Executed VerifyScorecardPublishedLabel1 Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyScorecardPublishedLabel1 Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	
	public void okConfirmButton() {
		try {
			log.info("Entered OkConfirmButton");
			log.info("clicking on OkConfirmButton");
			click(okConfirmButton);
			log.info("Executed OkConfirmButton successfully");
		} catch (Exception e) {
			log.error("Executed OkConfirmButton not successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void clickApproveAllButton() {
		try {
			log.info("Entered ClickApproveAllButton");
			log.info("clicking on ClickApproveAllButton");
			click(clickApproveAllButton);
			log.info("Executed ClickApproveAllButton successfully");
		} catch (Exception e) {
			log.error("Executed ClickApproveAllButton not successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void Click_UpdatePerformanceLabel() {
		try {
			log.info("Entered Click_UpdatePerformanceLabel successfully");
			click(clk_UpdatePerformanceLabel);
			log.info("Executed Click_UpdatePerformanceLabel successfully");
		} catch (Exception e) {
			log.error("Executed Click_UpdatePerformanceLabel not successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void Verify_UpdatePerformanceLabel() {
		try {
			log.info("Entered Verify_UpdatePerformanceLabel");
			Assert.assertTrue(clk_UpdatePerformance.getText().contains("Update Performance"),
					"update Performane_label missing");
			log.info("Executed Verify_UpdatePerformanceLabel successfully");
		} catch (Exception e) {
			log.error("Executed Verify_UpdatePerformanceLabel not successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void doLogout() {
		try {
			log.info("Entered doLogout");
			log.info("Clicking drpDwnMenuButton");
			click(drpDwnMenuButton);
			log.info("Clicking lnk_logOut");
			click(lnk_logOut);
			log.info("Executed doLogout Successfully");
		} catch (Exception e) {
			log.error("Executed doLogout Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	
	public void doLogoutwithConfirm() {
		try {
			log.info("Entered doLogoutwithConfirm");
			/*
			 * log.info("clicking on profile drop down"); //click(drpDwnMenuButton);
			 * log.info("clicked on profile drop down");
			 */
			//screenshot("doLogoutwithConfirm!!!!");
			waitUntilElementToBeClickable(lnk_logOut);
			// log.info("clicking on logout !!!!!!");
			click(lnk_logOut);
			// log.info("clicking on confirm button!!!!!");
			click(confirmButton);
			// log.info("clicking on confirm button!!!!!");
			log.info("Executed doLogoutwithConfirm Successfully");
		} catch (Exception e) {
			log.error("Executed doLogoutwithConfirm Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	
	
	public void doAdminLogoutwithConfirm() {
		try {
			log.info("Entered doAdminLogoutwithConfirm ");
			click(lnk_logOut);
			click(confirmButton);
			log.info("Executed doAdminLogoutwithConfirm Successfully");
		} catch (Exception e) {
			log.error("Executed doAdminLogoutwithConfirm Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickEPMSAdmin() {
		try {
			log.info("Entered clickEPMSAdmin");
			waitUntilElementToBeClickable(lnk_epmsAdmin);
			doHover(lnk_epmsAdmin);
			log.info("Executed clickEPMSAdmin Successfully");
		} catch (Exception e) {
			log.error("Executed clickEPMSAdmin Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getDropDownMenuButton() {
		try {
			log.info("Entered getDropDownMenuButton");
			log.info("Waiting for drpDwnMenuButton");
//			waitUntilElementVisibleRepeated(drpDwnMenuButton,2);
//			log.info("Scrolling to drpDwnMenuButton");
//			ScrollUpToElement(drpDwnMenuButton);
//			log.info("Clicking to drpDwnMenuButton");
			doHoverandClick(drpDwnMenuButton);
			//screenshot("getDropDownMenuButton");
			//waitForPageLoad();
//			waitUntilElementToBeClickableRepeated(By.xpath(lnk_epmsAdmin_ltr),2);
//			log.info("Clicking to lnk_epmsAdmin");
			clickOnElementByJs(lnk_epmsAdmin);
//			waitForMessage("MANAGE EMPLOYEE");
//			waitFor(1000);
//			waitForPageLoad();
			log.info("Executed getDropDownMenuButton Successfully");
		} catch (Exception e) {
			log.error("Executed getDropDownMenuButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getOptionsDropDownMenuButton() {
		try {
			log.info("Entered getOptionsDropDownMenuButton");
			waitUntilElementToBeClickable(drpDwnMenuButton);
			ScrollUpToElement(drpDwnMenuButton);
			doHoverandClick(drpDwnMenuButton);
			//screenshot("getOptionsDropDownMenuButton");
			waitForPageLoad();
			log.info("Executed getOptionsDropDownMenuButton Successfully");
		} catch (Exception e) {
			log.error("Executed getOptionsDropDownMenuButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getProfileDropDownMenuButton() {
		try {
			log.info("Entered getProfileDropDownMenuButton");
			waitFor(1000);
			waitUntilElementVisible(drpDwnMenuButton);
			waitUntilElementToBeClickable(drpDwnMenuButton);
			doHoverandClick(drpDwnMenuButton);
			click(lnk_Profile);
			log.info("Executed getProfileDropDownMenuButton Successfully");
		} catch (Exception e) {
			log.error("Executed getProfileDropDownMenuButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void selectYearInProfilePage(String year) {
		try {
			log.info("Entered selectYearInProfilePage");
			waitUntilElementToBeClickable(drpDwnMenuButton);
			setValueInDropdownText(select_YearInProfile,year);
			log.info("Executed selectYearInProfilePage Successfully");
		} catch (Exception e) {
			log.error("Executed selectYearInProfilePage Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getDropDownMenuButtonSuperAdmin() {
		try {
			log.info("Entered getDropDownMenuButtonSuperAdmin");
			waitForMessage("Logout");
			waitFor(2000);
			//waitForPageLoad();
//			waitUntilElementVisible(drpDwnMenuButtonSuperAdmin);
//			waitUntilElementToBeClickable(drpDwnMenuButtonSuperAdmin);
			doHoverandClick(drpDwnMenuButtonSuperAdmin);
			click(lnk_epmsAdmin);
			// click(drpDwnMenuButton);
			log.info("Executed getDropDownMenuButtonSuperAdmin Successfully");
		} catch (Exception e) {
			log.error("Executed getDropDownMenuButtonSuperAdmin Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnThingsToDo() {
		try {
			log.info("Entered clickOnThingsToDo");
			waitUntilElementToBeClickable(thingsToDo_Btn);
			click(thingsToDo_Btn);
			log.info("Executed clickOnThingsToDo Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnThingsToDo Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void verifyThingsToDoReviewLabel() {
		try {
			log.info("Entered verifyThingsToDoReviewLabel");
			Assert.assertTrue(thingsToDoReviewLabel.getText().contains("finalreview_label"),
					"finalreview_label missing");
			log.info("Executed verifyThingsToDoReviewLabel Successfully");
		} catch (Exception e) {
			log.error("Executed verifyThingsToDoReviewLabel Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void verifyThingsToDoReviewRequest(String supervisor, String appraisee) {
		try {
			log.info("Entered verifyThingsToDoReviewLabel");
			String expected = supervisor+" has asked your review on "+appraisee;
			String actual = thingsToDoReviewRequest.getText();
			Assert.assertTrue(actual.contains(expected),
					"Expected: "+expected+", Actual: "+actual);
			log.info("Executed verifyThingsToDoReviewLabel Successfully");
		} catch (Exception e) {
			log.error("Executed verifyThingsToDoReviewLabel Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	
	public void clickOnCheckInProgram() {
		try {
			log.info("Entered clickOnCheckInProgram");
		Actions checkin = new Actions(webDriver);
		checkin.moveToElement(lnk_checkinUser).build().perform();
		checkin.moveToElement(lnk_checkinUser).doubleClick().perform();
		Reporter.log("clicked on daily checkin widget",true);
		log.info("Executed clickOnCheckInProgram Successfully");
		}catch(Exception e) {
			log.error("Executed clickOnCheckInProgram Not Successfully");
			Reporter.log(e.getMessage());
		}
	}
	

	public void validateForCheckIn() {
		try {
			log.info("Entered validateForCheckIn");
			Assert.assertTrue(lbl_checkIn.getText().contains("TestCheckin"), "Check Program is loaded");
			log.info("Executed validateForCheckIn Successfully");
		} catch (Exception e) {
			log.error("Executed validateForCheckIn Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	
	public void writeOnHeadingone(String value){
		try {
			log.info("Entered writeOnHeadingone");
       webDriver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys(value);
       webDriver.findElement(By.xpath("//textarea[@name='userComment']")).sendKeys(value);
       log.info("Executed writeOnHeadingone Successfully");
		}catch(Exception e) {
			log.error("Executed writeOnHeadingone Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnStarRating(String star) {
		try {
			log.info("Entered clickOnStarRating");
			scrollDown();
			doHoverandClick(tag_Star);
			log.info("Executed clickOnStarRating Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnStarRating Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnCheckinbutton() {
		try {
			log.info("Entered clickOnCheckinbutton");
			waitUntilElementToBeClickable(btn_check_in);
			click(btn_check_in);
			//waitFor(3000);
			String[] messages = {"success","Success"};
			waitForOneOfMessages(messages);
			log.info("Executed clickOnCheckinbutton Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnCheckinbutton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnSubmitWidget() {
		try {
			log.info("Entered clickOnSubmitWidget");
			waitUntilElementToBeClickable(btn_checkSubmitWidget);
			click(btn_checkSubmitWidget);
			waitFor(3000);
			log.info("Executed clickOnSubmitWidget Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnSubmitWidget Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateforHeading() {
		try {
			log.info("Entered validateforHeading");
			for (int i = 1; i < 4; i++) {
//				Assert.assertEquals(
//						(webDriver.findElement(By.xpath("//div[@class='card-body']/div[" + i + "]/p[2]"))).getText(),
//						ExcelFileReader.getCellValue("Checkin.xlsx", "UserFlow", i + 1, "A"),
//						"Not matching with given heading");
				Assert.assertEquals(
						(webDriver.findElement(By.xpath("(//div[@class='card-body']/p/p)[" + i + "]"))).getText(),
						ExcelFileReader.getCellValue("Checkin.xlsx", "UserFlow", i + 1, "A"),
						"Not matching with given heading");

			}
			log.info("Executed validateforHeading Successfully");
		} catch (Exception e) {
			log.error("Executed validateforHeading Not Successfully");
			e.printStackTrace();
			//throw e;
		}
	}

	public void provideFeedBack(String value) {
		try {
			log.info("Entered provideFeedBack");
			writeText(txtbx_feedback, value);
			log.info("Executed provideFeedBack Successfully");
		} catch (Exception e) {
			log.error("Executed provideFeedBack Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnpublish() {
		try {
			log.info("Entered clickOnpublish");
			waitUntilElementToBeClickable(btn_publishScorecard);
			click(btn_publishScorecard);
			waitFor(2000);
			log.info("Executed clickOnpublish Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnpublish Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void ClickOnpublishButton() {
		try {
			log.info("Entered clickOnpublish");
			waitUntilElementToBeClickable(btn_publish);
			click(btn_publish);
			waitFor(2000);
			log.info("Executed clickOnpublish Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnpublish Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void clickSubmitYourPerformance() {
		try {
			log.info("Entered ClickSubmitYourPerformance");
			waitUntilElementToBeClickable(btn_submitYourPerformance);
			click(btn_submitYourPerformance);
			waitFor(2000);
			log.info("Executed ClickSubmitYourPerformance Successfully");
		} catch (Exception e) {
			log.error("Executed ClickSubmitYourPerformance Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void clickOnreviewedCheckIn() {
		try {
			log.info("Entered clickOnreviewedCheckIn");
			click(lnk_reviewCheckin);
			waitFor(2000);
			log.info("Executed clickOnreviewedCheckIn Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnreviewedCheckIn Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateforfeedback(String value) {
		try {
			log.info("Entered validateforfeedback");
			Assert.assertEquals(lbl_feedback.getText(), value, "Given feedback is not same as showing");
			log.info("Executed validateforfeedback Successfully");
		} catch (Exception e) {
			log.error("Executed validateforfeedback Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnCreateYourOwnScorecard() {
		try {
			log.info("Entered clickOnCreateYourOwnScorecard");
			waitUntilElementToBeClickable(createYourOwnScorecard_Btn);
			click(createYourOwnScorecard_Btn);
			waitFor(2000);
			log.info("Executed clickOnCreateYourOwnScorecard Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnCreateYourOwnScorecard Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void resubmit_scorecard_lbl() {
		try {
			log.info("Entered Resubmit_scorecard_lbl");
			waitUntilElementToBeClickable(resubmit_scorecard_lbl);
			click(resubmit_scorecard_lbl);
			waitFor(1000);
			log.info("Executed Resubmit_scorecard_lbl Successfully");
		} catch (Exception e) {
			log.error("Executed Resubmit_scorecard_lbl Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnReviewTheirScorecard() {
		// the try catch block passing the script even if there is no scorecard to click
		try {
			log.info("Entered clickOnReviewTheirScorecard");
			waitUntilElementToBeClickable(reviewTheirScorecard_Btn);
			click(reviewTheirScorecard_Btn);
//			waitFor(2000);
			log.info("Executed clickOnReviewTheirScorecard Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnReviewTheirScorecard Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void clickOnCreateYourOwnScorecardByProgranName(String programname) {
		try {
			log.info("Entered clickOnCreateYourOwnScorecardByProgranName");
//			waitFor(2000);
//			webDriver.navigate().refresh();
			clickonCard(programname);
			log.info("Executed clickOnCreateYourOwnScorecardByProgranName Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnCreateYourOwnScorecardByProgranName Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void clickOnResubmitScorecard() {
		try {
			log.info("Entered clickOnResubmitScorecard");
			waitUntilElementToBeClickable(resubmitScorecard_Btn);
			click(resubmitScorecard_Btn);
			waitFor(2000);
			log.info("Executed clickOnResubmitScorecard Successfully");
		} catch (Exception e) {
			clickOnElementByJs(resubmitScorecard_Btn);
			log.error("Executed clickOnResubmitScorecard Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void clickOnResubmitScorecardLabel() {
		try {
			log.info("Entered clickOnResubmitScorecardLabel Successfully");
			waitUntilElementToBeClickable(reviewTheirScorecard_lbl);
			click(reviewTheirScorecard_lbl);
			waitFor(2000);
			log.info("Executed clickOnResubmitScorecardLabel Successfully");
		} catch (Exception e) {
			clickOnElementByJs(reviewTheirScorecard_lbl);
			log.error("Executed clickOnResubmitScorecardLabel Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnResubmitScorecard(String programName) {
		try {
			log.info("Entered clickOnResubmitScorecard");
			waitForPageLoad();
			clickOnCard(programName);
			waitFor(2000);
			log.info("Executed clickOnResubmitScorecard Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnResubmitScorecard Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnverifyTheirScorecard() {
		// the try catch block passing the script even if there is no scorecard to click
		try {
			log.info("Entered clickOnverifyTheirScorecard");
			waitFor(1000);
			waitUntilElementToBeClickable(verifyTheirScorecard_Btn);
			click(verifyTheirScorecard_Btn);
			log.info("Executed clickOnverifyTheirScorecard Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnverifyTheirScorecard Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnthingToknow() {
		try {
//			webDriver.navigate().refresh();
			waitFor(1000);
			log.info("Entered clickOnthingToknow");
			waitUntilElementToBeClickable(lnk_thingsToKnow);
			click(lnk_thingsToKnow);
			waitFor(2000);
			log.info("Executed clickOnthingToknow Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnthingToknow Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void SetThingToknowFilterForAnnouncements() {
		try {
			log.info("Entered SetThingToknowFilterForAnnouncements");
			waitUntilElementToBeClickable(lnk_thingsToKnowFilter);
			click(lnk_thingsToKnowFilter);
			click(chk_thingsToKnowFilterSelectAll);
			click(chk_thingsToKnowFilterAnnouncement);
			click(btn_thingsToKnowFilterApply);
			waitFor(3000);
			log.info("Executed SetThingToknowFilterForAnnouncements Successfully");
		} catch (Exception e) {
			log.error("Executed SetThingToknowFilterForAnnouncements Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void SetThingToknowFilterForCheckin() {
		try {
			log.info("Entered SetThingToknowFilterForCheckin");
			waitUntilElementToBeClickable(lnk_thingsToKnowFilter);
			click(lnk_thingsToKnowFilter);
			waitUntilElementToBeClickable(chk_thingsToKnowFilterSelectAll);
			click(chk_thingsToKnowFilterSelectAll);
			click(chk_thingsToKnowFilterCheckin);
			click(btn_thingsToKnowFilterApply);
			waitFor(3000);
			log.info("Executed SetThingToknowFilterForCheckin Successfully");
		} catch (Exception e) {
			log.error("Executed SetThingToknowFilterForCheckin Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void SetThingToknowFilterForPerfProg() {
		try {
			log.info("Entered SetThingToknowFilterForPerfProg");
			waitUntilElementToBeClickable(lnk_thingsToKnowFilter);
			click(lnk_thingsToKnowFilter);
			waitUntilElementToBeClickable(chk_thingsToKnowFilterSelectAll);
			click(chk_thingsToKnowFilterSelectAll);
			click(chk_thingsToKnowFilterPerfProg);
			click(btn_thingsToKnowFilterApply);
			waitFor(3000);
			log.info("Executed SetThingToknowFilterForPerfProg Successfully");
		} catch (Exception e) {
			log.error("Executed SetThingToknowFilterForPerfProg Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}



	public void clickOnCard(String value) {
		try {
			log.info("Entered clickOnCard");
			clickonCard(value);
			log.info("Executed clickOnCard Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnCard Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void verifyPrimarySupervisor(String supervisor) {
		try {
			log.info("Entered verifyPrimarySupervisor");
			// log.info("Waiting for primary user value to appear!!!");
			waitUntilElementVisible(lbl_primary_supervisor_val);
			// log.info("Verifing primary user value" + supervisor + "!!!");
			Assert.assertEquals(lbl_primary_supervisor_val.getText(), supervisor,
					"supervisor not matching hence >>> Failed");
			log.info("Executed verifyPrimarySupervisor Successfully");
		} catch (Exception e) {
			log.error("Executed verifyPrimarySupervisor Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	// click on share for performance program different stages
	// card description example: "Click to view scorecard info"

	public void clickOnShareForCardType(String cardDescription) 
	{
		log.info("Entered clickOnShareForCardType");
		waitUntilElementToBeClickableScrolling(By.xpath(
				"(//h5[contains(text(),'" + cardDescription + "')]//..//../..//..//..//button[@id='shareBtn'])[1]"));
		WebElement ele = webDriver.findElement(By.xpath(
				"(//h5[contains(text(),'" + cardDescription + "')]//..//../..//..//..//button[@id='shareBtn'])[1]"));
		try {
			waitFor(5000);

			click(ele);
			log.info("Executed clickOnShareForCardType Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnShareForCardType Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public boolean verifyCardTypeReviewflow(String programName, String cardType) {
		WebElement ele = webDriver.findElement(By.xpath("//b[contains(text(),'" + programName
				+ "')]//..//..//..//..//..//h5[contains(text(),'" + cardType + "')]"));
		try {
			log.info("Entered verifyingcardtype!!" + ele.getText());
			ele.isDisplayed();
			log.info("Executed verifyCardTypeReviewflow Successfully" + ele.getText());
			return true;
		} catch (Exception e) {
			log.error("Executed verifyCardTypeReviewflow Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnUserGroup() {
		try {
			log.info("Entered clickingonusergroup!!");
			click(userGroup_btn);
			log.info("Executed clickOnUserGroup Successfully");
		} catch (Exception e) {
			log.error("error clicking on user group!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void writeShareMessage(String message) {
		try {
			log.info("entering share message!!");
			writeText(shareMessage_txtArea, message);
			log.info("Executed writeShareMessage Successfully");
		} catch (Exception e) {
			log.error("error entering the share message!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnNext() {
		try {
			log.info("Entered clicking on next!!");
			click(next_btn);
			log.info("Executed clickOnNext Successfully");
		} catch (Exception e) {
			log.error("error clicking on next!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnShare() {
		try {
			log.info("Entered clicking on share!!");
			click(share_Btn);
			waitFor(2000);
			log.info("Executed clickOnShare Successfully");
		} catch (Exception e) {
			log.error("error clicking on share!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterUsergroupName(String userGroup) {
		try {
			log.info("entering user group name!!");
			writeText(search_textBox, userGroup);
			log.info("Executed enterUsergroupName Successfully");
		} catch (Exception e) {
			log.error("error entering user group name!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickonCheckBox() {
		try {
			log.info("Entered clickonCheckBox");
			waitFor(2000);
			clickOnElementByJs(checkBox);
			log.info("Executed clickonCheckBox Successfully");
		} catch (Exception e) {
			log.error("Executed clickonCheckBox Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public boolean verifySharedCardMessage(String message) {
		try {
			WebElement ele = webDriver.findElement(By.xpath("(//p[contains(text(),'" + message + "')])[1]"));
			log.info("Entered verifySharedCardMessage");
			log.info("verifying the share message " + ele.getText());
			if (ele.isDisplayed())
				return true;
			else
				return false;
			
		} catch (Exception e) {
			log.error("error verifying shared message!!");
			e.printStackTrace();
			throw e;

		}
	}

	public void clickOnShareForAnnouncement() {
		try {
			log.info("clicking on share for announcement!!");
			click(announcement_ShareBtn);
			log.info("Executed clickOnShareForAnnouncement Successfully");
		} catch (Exception e) {
			log.error("error clickinhg on share for announcement!!");
			e.printStackTrace();
			throw e;
		}
	}
	public boolean verifyCardTypeGoalsetting(String cardType) {
		WebElement ele = webDriver.findElement(By.xpath("//h5[contains(text(),'" + cardType + "')]"));
		try {
			log.info("verifying card type!!" + ele.getText());
			ele.isDisplayed();
			log.info("Executed verifyCardTypeGoalsetting Successfully");
			return true;
		} catch (Exception e) {
			log.error("Executed verifyCardTypeGoalsetting Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void verifyThingsToDoTabAfterDisbaled()
	{
		try
		{
			log.info("Entered verifyThingsToDoTabAfterDisbaled");
			boolean present;
			present= lnk_verifyThingstodo.size()==0 ? true : false;
			assertTrue(present);
			log.info("Executed verifyThingsToDoTabAfterDisbaled Successfully");

		} catch (Exception e) {
			log.error("Executed verifyThingsToDoTabAfterDisbaled Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void verifyThingsToDoTabAfterenaled()
	{
		try
		{
			log.info("Entered verifyThingsToDoTabAfterenaled");
			boolean present;
			present= lnk_verifyThingstodo.size()==1 ? true : false;
			assertTrue(present);
			log.info("Executed verifyThingsToDoTabAfterenaled Successfully");

		} catch (Exception e) {
			log.error("Executed verifyThingsToDoTabAfterenaled Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyShareButtonAfterdisable()
	{
		try
		{
			log.info("Entered VerifyShareButtonAfterdisable");
			assertTrue(lnk_verifyShare.size()==0);
			log.info("Executed VerifyShareButtonAfterdisable Successfully");
		}
		catch (Exception e) {
			log.error("Executed VerifyShareButtonAfterdisable Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyLikeButtonAfterdisable()
	{
		try
		{
			log.info("Entered VerifyLikeButtonAfterdisable");
			assertTrue(lnk_verifyLike.size()==0);
			log.info("Executed VerifyLikeButtonAfterdisable Successfully");
		}
		catch (Exception e) {
			log.error("Executed VerifyLikeButtonAfterdisable Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyCommentButtonAfterdisable()
	{
		try
		{
			log.info("Entered VerifyLikeButtonAfterenable");
			assertTrue(lnk_verifyComment.size()==0);
			log.info("Executed VerifyLikeButtonAfterenable Successfully");
		}
		catch (Exception e) {
			log.error("Executed VerifyLikeButtonAfterenable Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	//verify after enable
	public void VerifyShareButtonAfterenable()
	{
		try
		{
			log.info("Entered VerifyLikeButtonAfterenable");
			waitUntilElementToBeClickableScrolling(By.xpath("//button[contains(@id,'shareBtn')]"));
			assertTrue(lnk_verifyShare.size()>=1);
			log.info("Executed VerifyLikeButtonAfterenable Successfully");
		}
		catch (Exception e) {
			log.error("Executed VerifyLikeButtonAfterenable Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyLikeButtonAfterenable()
	{
		try
		{
			log.info("Entered VerifyLikeButtonAfterenable");
			waitUntilElementToBeClickableScrolling(By.xpath("//button[contains(@id,'likeBtn')]"));
			assertTrue(lnk_verifyLike.size()>=1);
			log.info("Executed VerifyLikeButtonAfterenable Successfully");
		}
		catch (Exception e) {
			log.error("Executed VerifyLikeButtonAfterenable Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyCommentButtonAfterenable()
	{
		try
		{
			log.info("Entered VerifyCommentButtonAfterenable");
			waitUntilElementToBeClickableScrolling(By.xpath("//textarea[contains(@id,'comment')]"));
			assertTrue(lnk_verifyComment.size()>=1);
			log.info("Executed VerifyCommentButtonAfterenable Successfully");
		}
		catch (Exception e) {
			log.error("Executed VerifyCommentButtonAfterenable Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void verifyTheShareRecieptsForMyTeam(String ShareReciepts)
	{
		try
		{
			log.info("Entered verifyTheShareRecieptsForMyTeam");
			boolean value1 = false;
			Iterator<WebElement> listofrecepits = verify_ShareRecipts.iterator();
			ArrayList<String> listofrecepitsUsers = new ArrayList<>();
			while(listofrecepits.hasNext())
			{
				String recepit = listofrecepits.next().getText();
				if(recepit.equalsIgnoreCase(ShareReciepts))
				{
					value1=true;
				}
				listofrecepitsUsers.add(recepit);
			}
			assertTrue(value1, ShareReciepts+" not matching with any of the recipets "+listofrecepitsUsers+" hence failed");
		
			//assertEquals(verify_ShareRecipts.get(i-1).getText(), ShareReciepts, "share recipets is not equal hence failed");
			log.info("Executed verifyTheShareRecieptsForMyTeam Successfully");
		}
		catch (Exception e) {
			log.error("Executed verifyTheShareRecieptsForMyTeam Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void verifyCommentSectionAfterDisable()
	{
		try
		{
			log.info("Entered verifyCommentSectionAfterDisable");
			waitFor(2000);
			waitUntilElementToBeClickableScrolling(By.xpath("(//h5[contains(text(),' announcement_Title')])[1]/ancestor::div[3]//showcomment//textarea"));
			assertTrue(searchForAdminAnn.size()==0, "failed--> because after enable also comment section is coming");
			log.info("Executed verifyCommentSectionAfterDisable Successfully");
		}
		catch (Exception e) {
			log.error("Executed verifyCommentSectionAfterDisable Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void verifyCommentSectionAfterEnable()
	{
		try
		{
			log.info("Entered verifyCommentSectionAfterEnable");
			waitFor(2000);
			waitUntilElementToBeClickableScrolling(By.xpath("(//h5[contains(text(),' announcement_Title')])[1]/ancestor::div[3]//showcomment//textarea"));
			assertTrue(searchForAdminAnn.size()==1, "failed--> because after enable also comment section is coming");
			log.info("Executed verifyCommentSectionAfterEnable Successfully");
		}
		catch (Exception e) {
			log.error("Executed verifyCommentSectionAfterEnable Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void verifyTheTenantLogo()
	{
		try
		{
			log.info("Entered verifyTheTenantLogo");
			String pathofImage="src\\\\test\\\\resources\\\\Data\\\\pictues\\\\TenantPreferences\\\\TenantLoder.png";
			waitUntilElementVisible(TenantLogo_lnk);
			VerifyTheImage(pathofImage, TenantLogo_lnk);
			log.info("Executed verifyTheTenantLogo Successfully");
		}
		catch (Exception e) {
			log.error("Executed verifyTheTenantLogo Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void VerifyTheFont(String font)
	{
		try
		{
			log.info("Entered VerifyTheFont");
			waitUntilElementVisible(TenantFont_lnk);
			assertTrue(TenantFont_lnk.getAttribute("style").contains(font), "font is not changed");
			log.info("Executed VerifyTheFont Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyTheFont Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyTheImageForDisplayPicture()
	{
		try
		{
			log.info("Entered VerifyTheImageForDisplayPicture");
			String pathofImage="src\\test\\resources\\Data\\pictues\\TenantPreferences\\TenantLoder.png";
			waitUntilElementVisibleRepeated(DisplayPicture_lnk,2);
			VerifyTheImage(pathofImage, DisplayPicture_lnk);
			log.info("Executed VerifyTheImageForDisplayPicture Successfully");


		} catch (Exception e) {
			log.error("Not Executed VerifyTheImageForDisplayPicture  Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void verifyThePrimaryThemeColor()
	{
		try
		{
			log.info("Entered verifyThePrimaryThemeColor");
			waitUntilElementVisible(TenantFont_lnk);
			assertTrue(TenantFont_lnk.getAttribute("style").contains("79,204,49"), "theme color is not matching");
			log.info("Executed verifyThePrimaryThemeColor Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed verifyThePrimaryThemeColor  Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void verifyTheOverallScoreAsDescription()
	{
		try
		{
			log.info("Entered verifyTheOverallScoreAsDescription");
			waitUntilElementVisible(verifyOverallScoreAsDescription);
			assertTrue(verifyOverallScoreAsDescription.getText().matches(".*(Far Exceeds Expectations|Below Expectations|Development Needed|Achieve Expectations|EXCEEDS EXPECTATIONS).*"), "description is not matching with expected description");
			log.info("Executed getOptionsDropDownMenuButton Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed verifyTheOverallScoreAsDescription Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void verifyVerifierRejectMessage(String message) {
		try {
			log.info("Verifying verifier rejection message!!");;
			waitFor(3000);
			WebElement element = webDriver.findElement(By.xpath("(//card-header/div/div/p)[1]"));
			String actualMess = element.getText();
			Assert.assertTrue(actualMess.contains(message),
					actualMess + " does not contain "+message);
			log.info("Verifying verifier rejection message!!");
		} catch (Exception e) {
			log.error("Error in Verifying message!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

}
