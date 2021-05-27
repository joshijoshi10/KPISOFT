package pageObjects;

import static org.testng.Assert.assertFalse;

import java.io.File;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.LoggerHelper;


public class TenantPreferencePage extends BasePage {
	
	

	public TenantPreferencePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	String myteam;
	int teamNumber;
	int numberOfRecipients;
	@FindBy(how = How.XPATH, using = "//a[text()='Tenant Preference ']")
	private WebElement tenantPreference_lnk;

	@FindBy(how = How.XPATH, using = "(//div[@class='b-b pb-2 w-100 mb-3 float-left align-v-center']//h5)[1]")
	private WebElement tenantPreference_header;

	@FindBy(how = How.XPATH, using = "//select[@name='userCanShareWith']")
	private WebElement userCanShareWith_dropdown;

	@FindBy(how = How.XPATH, using = "//button[text()=' Save ']")
	private WebElement save_Btn;

	@FindBy(how=How.XPATH, using="//span[@class='text-grey-lt']")
	private WebElement myTeam_num;

	@FindBy(how=How.XPATH, using="//input[@id='PUSH_KPI_OPTION_ENABLED_ID']")
	private WebElement Verifypushkpienable;
	
	@FindBy(how=How.XPATH, using="//label[@for='PUSH_KPI_OPTION_ENABLED_ID']") //"//div[contains(text(),'Enabled')]//label")
	private WebElement PushKpi_chbx;
	
	//general setting
	@FindBy(how=How.XPATH, using="//input[contains(@name,'displayPref')]")
	private WebElement DisplayPerference_txt;
	
	@FindBy(how=How.XPATH, using="//label[contains(text(),'Disable Things to do')]/../div/input")
	private WebElement ThingsToDo_chbx;

	@FindBy(how=How.XPATH, using="//label[contains(text(),'Disable Things to do')]/../div//label") //"//label[contains(text(),'Things to do:')]/../div//label")
	private WebElement ThingsToDo_chbx_lbl;
	
	//sharing option
	@FindBy(how=How.XPATH, using="//div[text()=' Share ']/input")
	private WebElement VerifyShare_chbx;
	
	@FindBy(how=How.XPATH, using="//div[text()=' Like ']/input")
	private WebElement verifylike_chbx;
	
	@FindBy(how=How.XPATH, using="//div[text()=' Comment ']/input")
	private WebElement Verifycomment_chbx;
	
	
	@FindBy(how=How.XPATH, using="//div[text()=' Share ']//label")
	private WebElement Share_chbx;
	
	@FindBy(how=How.XPATH, using="//div[text()=' Like ']//label")
	private WebElement like_chbx;
	
	@FindBy(how=How.XPATH, using="//div[text()=' Comment ']//label")
	private WebElement comment_chbx;
	
	@FindBy(how=How.XPATH, using="//p[contains(text(),'Ability To Comment On Admin Announcement')]/..//label")
	private WebElement AbilityToCommentOnAdminAnnouncement_chbx;
	
	@FindBy(how=How.XPATH, using="//p[contains(text(),'Ability To Comment On Admin Announcement')]/..//input")
	private WebElement VerifyAbilityToCommentOnAdminAnnouncement_chbx;
	//share option
	@FindBy(how=How.XPATH, using="//select[@name='shareWith']")
	private WebElement shareoption_drpdn;
	
	//tenantloader
	
	@FindBy(how=How.XPATH, using="(//label[contains(text(),' Upload Tenant logo:')]/..//input)[1]")
	private WebElement teanatlogo_button;
	
	@FindBy(how=How.XPATH, using="(//label[contains(text(),'Upload Tenant Login logo:')]/..//input)[1]")
	private WebElement teanatloginlogo_button;
	
	@FindBy(how=How.XPATH, using="(//label[contains(text(),' Upload Tenant Loader:')]/..//input)[1]")
	private WebElement teanatloder_button;
	
	@FindBy(how=How.XPATH, using="//select[contains(@name,'tenantFont')]")
	private WebElement font_drdpn;
	
	@FindBy(how=How.XPATH, using="//label[contains(@for,'id_showTenantLogoAsDisplayPicture')]")
	private WebElement TenantLogoAsPicture_chbx;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id,'id_showTenantLogoAsDisplayPicture')]")
	private WebElement VerifyTenantLogoAsPicture_chbx;
	
	@FindBy(how=How.XPATH, using="(//label[contains(text(),'Primary Color:')]/../..//input)[1]")
	private WebElement ThemeColor_lnk;
	
	@FindBy(how=How.XPATH, using="//label[contains(@for,'id_OverallScoreAsDescription')]")
	private WebElement overallscoreAsDescp_chbx;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id,'id_OverallScoreAsDescription')]")
	private WebElement VerifyoverallscoreAsDescp_chbx;
	
	//scorecard history
	@FindBy(how=How.XPATH, using="//label[contains(text(),'Hide scorecard History')]/../div") //"//label[contains(text(),'Scorecard History:')]/../div")
	private WebElement scorecardHistory_chbx;
	
	@FindBy(how=How.XPATH, using="//label[contains(text(),'Hide scorecard History')]/../div/input") //"//label[contains(text(),'Scorecard History:')]/../div/input")
	private WebElement VerifyscorecardHistory_chbx;
	
	@FindBy(how=How.XPATH, using="//label[contains(text(),'Hide scorecard History')]/../div/label") //"//label[contains(text(),'Scorecard History:')]/../div/label")
	private WebElement scorecardHistory_chbx1;
	
	//allow multiple strategy
	@FindBy(how=How.XPATH, using="//label[contains(text(),' Allow multiple strategy')]/../div/label")
	private WebElement AllowMultipleStrategy_chbx;

	@FindBy(how=How.XPATH, using="//label[contains(text(),' Allow multiple strategy')]/../div/input")
	private WebElement AllowMultipleStrategy_chbx_verify;
	
	public boolean movetoTenantPreference() {
		try {
			log.info("----------- started movetoTenantPreference method--------------");
			log.info("Clicking movetoTenantPreference");
			click(tenantPreference_lnk);
			waitFor(5000);
			if (tenantPreference_header.getText().trim().equals("Tenant Preference"))
			{
				log.info("Executed movetoTenantPreference Successfully");
				return true;
			}			
			else
			{
				log.info("Executed movetoTenantPreference Not Successfully");
				return false;
				
			}

		} catch (Exception e)
		{
			log.error("--------movetoTenantPreference failed-------------- ");
			e.printStackTrace();
			throw e;
			
		}
	}

	public void selectShareOption(String value) {
		try {
			log.info("----------- started selectShareOption method--------------");
			setValueInDropdownText(userCanShareWith_dropdown, value);
			waitFor(5000);
			log.info("----------- ended  selectShareOption method--------------");
		} catch (Exception e) {
			log.error("--------selectShareOption failed-------------- ");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnSave() {
		try {
			log.info("Entered clickOnSave");	
			waitUntilElementToBeClickableRepeated(save_Btn,2);
			scrollDown();
			log.info("Clicking clickOnSave");
			clickOnElementByJs(save_Btn);
			waitFor(5000);		
			log.info("Executed clickOnSave Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnSave Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public String getMyTeamValue() {
		try {
			log.info("Entered getMyTeamValue");	
			myteam=myTeam_num.getText();
			//teamNumber=Integer.parseInt(myteam);
			System.out.println(myteam);
			log.info("Executed getMyTeamValue Successfully");
			return myteam;
		} catch (Exception e) {
			log.error("Executed getMyTeamValue Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public String validateNumberofRecipients() {
		try {
			log.info("Entered validateNumberofRecipients");	
			List<WebElement> list=webDriver.findElements(By.xpath("//div[@class='media-body text-truncate']"));
			numberOfRecipients=list.size();
			System.out.println(numberOfRecipients);
			String numberOfRecipients_string=String.valueOf(numberOfRecipients);
			log.info("Executed validateNumberofRecipients Successfully");
			return numberOfRecipients_string;
		} catch (Exception e) {
			log.error("Executed validateNumberofRecipients Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void  verifyThePushKpiCheckbox()
	{
		try {
			log.info("Entered verifyThePushKpiCheckbox");
			ScrollUpToElement(Verifypushkpienable);
			if(!Verifypushkpienable.isSelected())
			{
				System.out.println("clicked");
				this.clickOnPushKpiButton();
			}
			else
			{
				System.out.println("selcted");
			}
			
			
			log.info("Executed verifyThePushKpiCheckbox Successfully");
		} catch (Exception e) {
			log.error("Executed verifyThePushKpiCheckbox Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void clickOnPushKpiButton()
	{
		try {
			log.info("Entered clickOnPushKpiButton");
			waitUntilElementToBeClickable(PushKpi_chbx);
			log.info("Clicking PushKpi_chbx");
			clickOnElementByJs(PushKpi_chbx);
			log.info("Executed clickOnPushKpiButton Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnPushKpiButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	
	//general setting
	public void DisabletheThingstodoByenableTheOption()
	{
		try {
			log.info("Entered DisabletheThingstodoByenableTheOption");
			waitUntilElementVisible(ThingsToDo_chbx_lbl);
			if(!ThingsToDo_chbx.isSelected())
			{
				log.info("Clicking ThingsToDo_chbx");
				click(ThingsToDo_chbx_lbl);
			}
			
			log.info("Executed DisabletheThingstodoByenableTheOption Successfully");
		} catch (Exception e) {
			log.error("Executed DisabletheThingstodoByenableTheOption Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void enabletheThingstodoByDisableTheOption()
	{
		try {
			log.info("Entered enabletheThingstodoByDisableTheOption");
			waitUntilElementVisible(ThingsToDo_chbx_lbl);
			
			if(ThingsToDo_chbx.isSelected())
			{
				log.info("Clicking ThingsToDo_chbx_lbl");
				click(ThingsToDo_chbx_lbl);
			}
			
			
			log.info("Executed enabletheThingstodoByDisableTheOption Successfully");
		} catch (Exception e) {
			log.error("Executed enabletheThingstodoByDisableTheOption Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void EnterValueInDisplayPrefereneces(String Number)
	{
		try {
			log.info("Entered EnterValueInDisplayPrefereneces");
			waitUntilElementVisible(DisplayPerference_txt);
			log.info("Writing text to DisplayPerference_txt: "+Number);
			writeText(DisplayPerference_txt,Number);
						
			log.info("Executed EnterValueInDisplayPrefereneces Successfully");
		} catch (Exception e) {
			log.error("Executed EnterValueInDisplayPrefereneces Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	//verifyAndDisable
	public void VerifyAndDisableTheShare()
	{
		try {
			log.info("Entered VerifyAndDisableTheShare");
			waitUntilElementToBeClickable(Share_chbx);
			if(VerifyShare_chbx.isSelected())
			{
				log.info("Clicking Share_chbx");
				click(Share_chbx);
				System.out.println("its enabled so im disabling");
			}
				
			log.info("Executed VerifyAndDisableTheShare Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyAndDisableTheShare Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyAndDisableTheLike()
	{
		try {
			log.info("Entered VerifyAndDisableTheLike");
			waitUntilElementToBeClickable(like_chbx);
			if(verifylike_chbx.isSelected())
			{
				System.out.println("its enabled so im disabling");
				log.info("Clicking like_chbx");
				click(like_chbx);
			}
					
			log.info("Executed VerifyAndDisableTheLike Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyAndDisableTheLike Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyAndDisableTheComment()
	{
		try {
			log.info("Entered VerifyAndDisableTheComment");
			waitUntilElementToBeClickable(comment_chbx);
			if(Verifycomment_chbx.isSelected())
			{
				System.out.println("its enabled so im disabling");
				log.info("Clicking comment_chbx");
				click(comment_chbx);
			}
					
			log.info("Executed VerifyAndDisableTheComment Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyAndDisableTheComment Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyAndEnableTheShare()
	{
		try {
			log.info("Entered VerifyAndEnableTheShare");
			waitUntilElementToBeClickable(Share_chbx);
			if(!VerifyShare_chbx.isSelected())
			{
				log.info("Clicking Share_chbx");
				click(Share_chbx);
				System.out.println("its disabled  so im enabling");
			}
				
			log.info("Executed VerifyAndEnableTheShare Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyAndEnableTheShare Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyAndEnableTheLike()
	{
		try {
			log.info("Entered VerifyAndEnableTheLike");
			waitUntilElementToBeClickable(like_chbx);
			if(!verifylike_chbx.isSelected())
			{
				System.out.println("its disbaled  so im enabling");
				log.info("Clicking like_chbx");
				click(like_chbx);
			}
					
			log.info("Executed VerifyAndEnableTheLike Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyAndEnableTheLike Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyAndEnableTheComment()
	{
		try {
			log.info("Entered VerifyAndEnableTheComment");
			waitUntilElementToBeClickable(comment_chbx);
			if(!Verifycomment_chbx.isSelected())
			{
				System.out.println("its disbaled  so im enabling");
				log.info("Clicking comment_chbx");
				click(comment_chbx);
			}
					
			log.info("Executed VerifyAndEnableTheComment Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyAndEnableTheComment Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//shareoption
	public void selectTheShareoptionAsEveryone()
	{
		try {
			log.info("Entered selectTheShareoptionAsEveryone");	
			waitUntilElementVisible(shareoption_drpdn);
			setValueInDropdownText(shareoption_drpdn, "Everyone");
			log.info("Executed selectTheShareoptionAsEveryone Successfully");
		} catch (Exception e) {
			log.error("Executed selectTheShareoptionAsEveryone Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void selectTheShareoptionAsMyTeam()
	{
		try {
			log.info("Entered selectTheShareoptionAsMyTeam");	
			waitUntilElementVisible(shareoption_drpdn);
			setValueInDropdownText(shareoption_drpdn, "My Team");
			log.info("Executed selectTheShareoptionAsMyTeam Successfully");
		} catch (Exception e) {
			log.error("Executed selectTheShareoptionAsMyTeam Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void selectTheShareoptionAsMyWorkCircle()
	{
		try {
			log.info("Entered selectTheShareoptionAsMyWorkCircle");	
			waitUntilElementVisible(shareoption_drpdn);
			setValueInDropdownText(shareoption_drpdn, "My Work Circle");
			log.info("Executed selectTheShareoptionAsMyWorkCircle Successfully");
		} catch (Exception e) {
			log.error("Executed selectTheShareoptionAsMyWorkCircle  Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void selectTheShareoptionAsMyImmediateWorkCircle()
	{
		try {
			log.info("Entered selectTheShareoptionAsMyImmediateWorkCircle");	
			waitUntilElementVisible(shareoption_drpdn);
			setValueInDropdownText(shareoption_drpdn, "My Immediate Work Circle");
			log.info("Executed selectTheShareoptionAsMyImmediateWorkCircle Successfully");
		} catch (Exception e) {
			log.error("Executed selectTheShareoptionAsMyImmediateWorkCircle Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void VerifyAndDisaableclickOnAbilityToCommentOnAdminAnnouncement()
	{
		try {
			log.info("Entered VerifyAndDisaableclickOnAbilityToCommentOnAdminAnnouncement");
			waitUntilElementVisible(AbilityToCommentOnAdminAnnouncement_chbx);
			if(VerifyAbilityToCommentOnAdminAnnouncement_chbx.isSelected())
			{
				log.info("Clicking AbilityToCommentOnAdminAnnouncement_chbx");
				click(AbilityToCommentOnAdminAnnouncement_chbx);
			}
			
			log.info("Executed VerifyAndDisaableclickOnAbilityToCommentOnAdminAnnouncement Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyAndDisaableclickOnAbilityToCommentOnAdminAnnouncement Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyAndEnaableclickOnAbilityToCommentOnAdminAnnouncement()
	{
		try {
			log.info("Entered VerifyAndEnaableclickOnAbilityToCommentOnAdminAnnouncement");
			waitUntilElementVisible(AbilityToCommentOnAdminAnnouncement_chbx);
			if(!VerifyAbilityToCommentOnAdminAnnouncement_chbx.isSelected())
			{
				log.info("Clicking AbilityToCommentOnAdminAnnouncement_chbx");
				click(AbilityToCommentOnAdminAnnouncement_chbx);
			}
			
			log.info("Executed VerifyAndEnaableclickOnAbilityToCommentOnAdminAnnouncement Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyAndEnaableclickOnAbilityToCommentOnAdminAnnouncement Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void uploadATenantLogo()
	{	
		try {
			log.info("Entered uploadATenantLogo");
			waitUntilElementVisible(teanatloder_button);
			File file = new File("src\\test\\resources\\Data\\pictues\\TenantPreferences\\TenantLoder.png");		
			String attach = file.getAbsolutePath().replace("\\", "\\\\");
			teanatlogo_button.sendKeys(attach);
	
			log.info("Executed uploadATenantLogo Successfully");
		} catch (Exception e) {
			log.error("Executed uploadATenantLogo Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void uploadALoginTenantLogo()
	{	
		try {
			log.info("Entered uploadALoginTenantLogo");
			waitUntilElementVisible(teanatloginlogo_button);
			File file = new File("src\\test\\resources\\Data\\pictues\\TenantPreferences\\TenantLoder.png");		
			String attach = file.getAbsolutePath().replace("\\", "\\\\");
			teanatloginlogo_button.sendKeys(attach);
	
			log.info("Executed uploadALoginTenantLogo Successfully");
		} catch (Exception e) {
			log.error("Executed uploadALoginTenantLogo Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void uploadATenantLoader()
	{	
		try {
			log.info("Entered uploadATenantLoader");
			waitUntilElementVisible(teanatloder_button);
			File file = new File("src\\test\\resources\\Data\\pictues\\TenantPreferences\\ajax-loader.gif");		
			String attach = file.getAbsolutePath().replace("\\", "\\\\");
			teanatloder_button.sendKeys(attach);
	
			log.info("Executed uploadATenantLoader Successfully");
		} catch (Exception e) {
			log.error("Executed uploadATenantLoader Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	//font
	public void selectFontByText(String Font)
	{
		try {
			log.info("Entered selectFontByText");
			waitUntilElementVisible(font_drdpn);
			setValueInDropdownText(font_drdpn, Font);
			
			log.info("Executed selectFontByText Successfully");
		} catch (Exception e) {
			log.error("Executed selectFontByText Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	//tenantlogo as display picture
	public void VerifyAndEnableclickOnTenantLogoAsDisplayPreferences()
	{
		try {
			log.info("Entered VerifyAndEnableclickOnTenantLogoAsDisplayPreferences");
			waitUntilElementToBeClickable(TenantLogoAsPicture_chbx);
			if(!VerifyTenantLogoAsPicture_chbx.isSelected())
			{
				log.info("Clicking TenantLogoAsPicture_chbx");
				click(TenantLogoAsPicture_chbx);	
			}
				
			log.info("Executed VerifyAndEnableclickOnTenantLogoAsDisplayPreferences Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyAndEnableclickOnTenantLogoAsDisplayPreferences Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyAndDisableclickOnTenantLogoAsDisplayPreferences()
	{
		try {
			log.info("Entered VerifyAndDisableclickOnTenantLogoAsDisplayPreferences");
			waitUntilElementToBeClickable(TenantLogoAsPicture_chbx);
			if(VerifyTenantLogoAsPicture_chbx.isSelected())
			{
				log.info("Clicking TenantLogoAsPicture_chbx");
				click(TenantLogoAsPicture_chbx);	
			}
				
			log.info("Executed VerifyAndDisableclickOnTenantLogoAsDisplayPreferences Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyAndDisableclickOnTenantLogoAsDisplayPreferences Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void ChangeThePrimaryThemeColor()
	{
		try {
			log.info("Entered ChangeThePrimaryThemeColor");
			waitUntilElementVisible(ThemeColor_lnk);
			ThemeColor_lnk.sendKeys("#4fcc31");
			
			
			log.info("Executed ChangeThePrimaryThemeColor Successfully");
		} catch (Exception e) {
			log.error("Executed ChangeThePrimaryThemeColor Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyTheScorecardHistoryIsEnabled()
	{
		// if checkbox is not checked then its enabled
		try {
			log.info("Entered VerifyTheScorecardHistoryIsEnabled");
			waitUntilElementVisible(scorecardHistory_chbx);
			if(VerifyscorecardHistory_chbx.isSelected())
			{
				waitUntilElementVisible(scorecardHistory_chbx1);
				log.info("Clicking scorecardHistory_chbx1");
				clickOnElementByJs(scorecardHistory_chbx1);
			}
			
			
			
			log.info("Executed VerifyTheScorecardHistoryIsEnabled Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyTheScorecardHistoryIsEnabled Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void DisbaleTheScorecardHistory()
	{
		//if checkbox is checked then scorecard history is disabled
		try {
			log.info("Entered DisbaleTheScorecardHistory");
			if(!VerifyscorecardHistory_chbx.isSelected())
			{
				waitUntilElementVisible(scorecardHistory_chbx1);
				log.info("Clicking scorecardHistory_chbx1");
				clickOnElementByJs(scorecardHistory_chbx1);
			}
			
			
			log.info("Executed DisbaleTheScorecardHistory Successfully");
		} catch (Exception e) {
			log.error("Executed DisbaleTheScorecardHistory Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void enableTheOverallScoreAsDescription()
	{
		
		try {
			log.info("Entered enableTheOverallScoreAsDescription");
			waitUntilElementVisible(overallscoreAsDescp_chbx);
			if(!VerifyoverallscoreAsDescp_chbx.isSelected())
			{
				log.info("Clicking overallscoreAsDescp_chbx");
				clickOnElementByJs(overallscoreAsDescp_chbx);
			}
			
			
			log.info("Executed enableTheOverallScoreAsDescription Successfully");
		} catch (Exception e) {
			log.error("Executed enableTheOverallScoreAsDescription Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void disableTheOverallScoreAsDescription()
	{
		
		try {
			log.info("Entered disableTheOverallScoreAsDescription");
			waitUntilElementVisible(overallscoreAsDescp_chbx);
			if(VerifyoverallscoreAsDescp_chbx.isSelected())
			{
				log.info("Clicking overallscoreAsDescp_chbx");
				clickOnElementByJs(overallscoreAsDescp_chbx);
			}
			
			
			log.info("Executed disableTheOverallScoreAsDescription Successfully");
		} catch (Exception e) {
			log.error("Executed disableTheOverallScoreAsDescription Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void enableTheAllowMultipleStrategyOption()
	{
		
		try {
			log.info("Entered enableTheAllowMultipleStrategyOption");
			waitUntilElementVisible(AllowMultipleStrategy_chbx);
			if (!AllowMultipleStrategy_chbx_verify.isSelected()) {
				log.info("Clicking AllowMultipleStrategy_chbx");
				click(AllowMultipleStrategy_chbx);
			}
			
			log.info("Executed enableTheAllowMultipleStrategyOption Successfully");
		} catch (Exception e) {
			log.error("Executed enableTheAllowMultipleStrategyOption Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void disableTheAllowMultipleStrategyOption()
	{

		try {
			log.info("Entered disableTheAllowMultipleStrategyOption");
			waitUntilElementVisible(AllowMultipleStrategy_chbx);
			if (AllowMultipleStrategy_chbx_verify.isSelected()) {
				log.info("Clicking AllowMultipleStrategy_chbx");
				click(AllowMultipleStrategy_chbx);
			}

			log.info("Executed disableTheAllowMultipleStrategyOption Successfully");
		} catch (Exception e) {
			log.error("Executed disableTheAllowMultipleStrategyOption Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	
}
