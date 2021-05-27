package pageObjects;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.LoggerHelper;

public class ChangeLanguagepage extends BasePage
{
	 Logger log = LoggerHelper.getLogger(LoggerHelper.class);
	public ChangeLanguagepage(WebDriver WebDriver)
	{
		super(WebDriver);
		PageFactory.initElements(WebDriver, this);
	}

	@FindBy(how=How.ID,using="profile")
	private WebElement dropdown_profile;

	@FindBy(how=How.XPATH,using="//a[.='Settings']")
	private WebElement btn_setting;

	@FindBy(how=How.XPATH,using="//div[.='Change Language']")
	private WebElement btn_changelanguage;

	@FindBy(how=How.XPATH,using="((//ul[@class='nav flex-column'])[2]/li)[last()]")
	private WebElement btn_arabic;

	@FindBy(how=How.XPATH,using="(//button[.=' Save'])[2]") //"//button[.=' Submit']")
	private WebElement btn_submit;

	@FindBy(how=How.XPATH,using="//button[@id='announcementBtn']") //"//div[@class='btn btn-icon']/b")
	private WebElement announcement;

	@FindBy(how=How.ID,using="language")
	private WebElement dropdownMenuButton_home;

	@FindBy(how=How.XPATH,using="//a[contains(text(),'English')]")
	private WebElement dropdown_english;

	public void clickOnProfiledropdown()
	{log.info("clicking on profile dropdown!!!!!!");
		try {
			waitUntilElementToBeClickable(dropdown_profile);
			click(dropdown_profile);
			log.info("clicked on profile dropdown!!!!!!");
			log.info("clicking on settings!!!!");
			waitUntilElementToBeClickable(btn_setting);
			click(btn_setting);
			log.info("clicked on settings!!!!");
		} catch (Exception e) {
			log.error("error in clicking on settings!!!" + e.getMessage());
			e.printStackTrace();
			throw e;
		}
	}
	public void SelectChangelanguage()
	{
		try {
			log.info("clicking on change language!!!!");
			waitUntilElementToBeClickable(btn_changelanguage);
			click(btn_changelanguage);
			waitFor(3000);
			log.info("clicked on change language!!!");
		} catch (Exception e) {
			log.error("error in clicking on change language!!!");
			e.printStackTrace();
			throw e;
		}
	}
	public void Selectlanguage()
	{
		try {
			log.info("selecting the language to change!!!!");
			waitUntilElementToBeClickable(btn_arabic);
			click(btn_arabic);
			waitFor(3000);
			log.info("selected the language to change!!!!");
		} catch (Exception e) {
			log.info("error in selecting the language to change!!!!");
			e.printStackTrace();
			throw e;
		}
	}
	public void clickOnSubmit()
	{
		log.info("clicking on submit!!!!");
		try {
			waitUntilElementToBeClickable(btn_submit);
			click(btn_submit);
			waitUntilElementVisible(announcement);
			assertTrue(announcement.isDisplayed(), "not in home page");
			log.info("clicked on submit!!!");
		} catch (Exception e) {
			log.info("error while clicking on submit!!!!!");
			e.printStackTrace();
			throw e;
		}
	}
	public void CheckForLanguageToArabic()
	{
		log.info("changing language from english to arabic!!!!!");
		try {
			waitUntilElementVisible(announcement);
			String check=announcement.getText();
			System.out.println(check);
			String validate="Announcement";
			if(check.equalsIgnoreCase(validate))
			{
				System.out.println("language not changed from english to arabic");
			}
			else
			{
				System.out.println("language  changed from english to arabic");
			}
			log.info("Language changed from english to arabic!!!");
		} catch (Exception e) {
			log.info("error while changing language!!!!");
			e.printStackTrace();
			throw e;
		}
	}


	public void CheckForLanguageToEnglish()
	{log.info("changing language to english!!!!");
		try {
			waitUntilElementToBeClickable(dropdownMenuButton_home);
			click(dropdownMenuButton_home);
			waitUntilElementToBeClickable(dropdown_english);
			click(dropdown_english);
			waitFor(3000);
			String check=announcement.getText();
			String validate="Announcement";
			if(check.equalsIgnoreCase(validate))
			{
				System.out.println("language changed from arabic to english succesfully");
			}
			else
			{
				System.out.println("language not changed from arabic to  english");
			}
			log.info("changed language to english!!!!");
		} catch (Exception e) {
			log.info("language change failed!!!!");
			e.printStackTrace();
			throw e;
		}
	}


}
