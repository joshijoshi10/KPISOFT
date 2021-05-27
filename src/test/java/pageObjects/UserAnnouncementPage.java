package pageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.File;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.apache.log4j.Logger;
import helper.LoggerHelper;

public class UserAnnouncementPage extends BasePage {

	public UserAnnouncementPage(WebDriver WebDriver) {
		super(WebDriver);
		PageFactory.initElements(WebDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//div[@class='announcement']")
	private WebElement btn_Announcement;

	@FindBy(how = How.XPATH, using = "//textarea[@id='announcementTitle']")
	private WebElement txt_AnnouncemenTitle;

	@FindBy(how = How.XPATH, using = "//quill-editor[@id='announcementDesc']//p")
	private WebElement txt_Announcementdesc;

	@FindBy(how = How.XPATH, using = "//textarea[@id='announcementVid']")
	private WebElement txt_Announcementvid;

	@FindBy(how = How.XPATH, using = "//input[@name='myfile']")
	private WebElement btn_AnnouncementAttach;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Preview')]")
	private WebElement btn_preview;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Edit announcement')]")
	private WebElement lnk_editAnnouncement;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Post')]")
	private WebElement btn_post;

	@FindBy(how = How.XPATH, using = "//button[.='Edit announcement']")
	private WebElement btn_EditAnnouncement;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Post')]")
	private WebElement btn_chooserecipient;

	@FindBy(how = How.XPATH, using = "//i[@href='#collapseExample']")
	private WebElement lnk_search;

	@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Search employees')]")
	private WebElement txt_search;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Announce now')]")
	private WebElement btn_announcenow;

	@FindBy(how = How.XPATH, using = "//label[text()='Toggle']")
	private WebElement chk_pin;

	@FindBy(how = How.XPATH, using = "//button[.='Choose time for post']")
	private WebElement btn_schedule;

	@FindBy(how = How.XPATH, using = "//button[.='Back']")
	private WebElement btn_back;

	@FindBy(how = How.XPATH, using = "//button[.='Things to do']")
	private WebElement btn_todo;

	@FindBy(how = How.XPATH, using = "//input[@name='list.id' and @type='checkbox']/../..")
	private WebElement btn_check;

	@FindBy(how = How.XPATH, using = "//button[.='Save']")
	private WebElement btn_save;

	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'announcement_Title')])[1]")
	private WebElement validatefortitle;

	@FindBy(how = How.XPATH, using = "(//div[@id='ThingsToKnow-panel']/descendant::iframe)[1]")
	private WebElement validateforvideo;

	@FindBy(how = How.XPATH, using = "(//div[@class='password-eye m-3'])[1]/i")
	private WebElement validateforMoreOption;

	@FindBy(how = How.XPATH, using = "(//a[.='Delete'])[1]")
	private WebElement validatefordelete_btn;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Unpin')]")
	private WebElement unpin_btn;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Unpin')]")
    private WebElement confirm_unpin_btn;

	@FindBy(how = How.XPATH, using = "//div[@class='col-5 pr-0 pl-2']//div[2]//img[1]")
	private WebElement validateforattach;

	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'announcement_Title')]/../..)[1]")
	private WebElement validateforAnnouncentBody;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Things to do')]")
	private WebElement Things_tO_do_btn;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Things to know')]")
	private WebElement Things_tO_know_btn;

	// Archive
	@FindBy(how = How.XPATH, using = "(//a[.='Archive'])[1]")
	private WebElement validateforArchive_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Archive')]")
	private WebElement validateforArchiveConfirm_btn;

	@FindBy(how = How.XPATH, using = "(//div[@id='dropdownMenuButton'])[1]")
	private WebElement dropdown_profile;

	@FindBy(how = How.XPATH, using = "//a[.='Settings']")
	private WebElement btn_setting;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Archived Cards')]")
	private WebElement validateforArchiveCardPage;

	@FindBy(how = How.XPATH, using = "(//i[@class='fas fa-ellipsis-v'])[1]")
	private WebElement ArchiveCardPageMore_icon;

	@FindBy(how = How.XPATH, using = "(//a[.='Restore'])")
	private WebElement Restore_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Restore')]")
	private WebElement RestoreConfirm_btn;

	@FindBy(how = How.ID, using = "home")
	private WebElement Home_btn;

	public void clickAnnouncement() {
		try {
			log.info("Entered clickAnnouncement");	
			if (btn_Announcement.isDisplayed()) {
				waitUntilElementToBeClickable(btn_Announcement);
				log.info("Clicking btn_Announcement");
				click(btn_Announcement);
			} else {
				System.out.println("User dont have the announcement permission");
			}
			log.info("Executed clickAnnouncement Successfully");
		} catch (Exception e) {
			log.error("Executed clickAnnouncement Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void enterAnnouncementTitle(String title) {
		try {
			log.info("Entered enterAnnouncementTitle");	
			log.info("Writing to txt_AnnouncemenTitle: "+title);
			writeText(txt_AnnouncemenTitle, title);
			log.info("Executed enterAnnouncementTitle Successfully");
		} catch (Exception e) {
			log.error("Executed enterAnnouncementTitle Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void enterDescription() {
		try {
			log.info("Entered enterDescription");	
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
			js.executeScript("arguments[0].innerText = 'description'", txt_Announcementdesc);
			log.info("Executed enterDescription Successfully");
		} catch (Exception e) {
			log.error("Executed enterDescription Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void enterVideoLink(String link) {
		try {
			log.info("Entered enterVideoLink");
			log.info("Writing to txt_Announcementvid: "+link);
			writeText(txt_Announcementvid, link);
			waitFor(3000);
			log.info("Executed enterVideoLink Successfully");
		} catch (Exception e) {
			log.error("Executed enterVideoLink Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void enterAttachement() {
		try {
			log.info("Entered enterAttachement");	
			changeSingleToDoubleSlash("src\\test\\resources\\Data\\pictues\\userAnnouncemnt", btn_AnnouncementAttach);
			log.info("Executed enterAttachement Successfully");
		} catch (Exception e) {
			log.error("Executed enterAttachement Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnPreview() {
		try {
			log.info("Entered clickOnPreview");	
			log.info("Clicking btn_preview");
			click(btn_preview);
			waitFor(5000);
			log.info("Executed clickOnPreview Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnPreview Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnEditAnnouncement() {
		try {
			log.info("Entered clickOnEditAnnouncement");
			log.info("Clicking lnk_editAnnouncement");
			click(lnk_editAnnouncement);
			waitFor(5000);
			log.info("Executed clickOnEditAnnouncement Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnEditAnnouncement Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnPost() {
		try {
			log.info("Entered clickOnPost");	
			waitUntilElementToBeClickable(btn_post);
			log.info("Clicking btn_post");
			click(btn_post);
			log.info("Executed clickOnPost Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnPost Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnChooseRecipiet() {
		try {
			log.info("Entered clickOnChooseRecipiet");	
			waitUntilElementToBeClickable(btn_chooserecipient);
			log.info("Clicking btn_chooserecipient");
			click(btn_chooserecipient);
			waitFor(3000);
			log.info("Executed clickOnChooseRecipiet Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnChooseRecipiet Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnSearch(String empcode) {
		try {
			log.info("Entered clickOnSearch");	
			waitUntilElementToBeClickable(lnk_search);
			log.info("Clicking lnk_search");
			click(lnk_search);
			waitFor(2000);
			String array[] = empcode.split("");
			for (int i = 0; i < empcode.length(); i++) {
				txt_search.sendKeys(array[i]);
				waitFor(1000);
			}
			Assert.assertTrue(btn_check.isDisplayed(),
					"user dont have any subordinate goto tenant preference and change to everyone");
			scroll(webDriver, "down");
			log.info("Clicking btn_check");
			click(btn_check);
			waitFor(3000);
			log.info("Executed clickOnSearch Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnSearch Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnPin() {
		try {
			log.info("Entered clickOnPin");
			waitUntilElementToBeClickable(chk_pin);
			log.info("Clicking chk_pin");
			chk_pin.click();
			waitFor(3000);
			log.info("Executed clickOnPin Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnPin Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}


	public void clickOnAnnounceNow() {
		try {
			log.info("Entered clickOnAnnounceNow");	
			waitUntilElementToBeClickable(btn_announcenow);
			log.info("Clicking btn_announcenow");
			click(btn_announcenow);
			waitFor(3000);
			log.info("Executed clickOnAnnounceNow Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnAnnounceNow Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void validateTiltle(String announcement_title) {
		try {
			log.info("Entered validateTiltle");	
			waitUntilElementVisible(validateforAnnouncentBody);
			if (validateforAnnouncentBody.isDisplayed()) {
				Assert.assertEquals(validatefortitle.getText(), announcement_title, "announcemnet is not trriggered");
				System.out.println("announcement trriggered succesfully ");
			} else {
				System.out.println("no announcement for this user");
			}
			log.info("Executed validateTiltle Successfully");
		} catch (Exception e) {
			log.error("Executed validateTiltle Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void validateVideo() {
		try {
			log.info("Entered validateVideo");	
			if (validateforAnnouncentBody.isDisplayed()) {
				waitUntilElementVisible(validateforvideo);
				Assert.assertTrue(validateforvideo.isDisplayed(), "video is not announced");
				System.out.println("video is announced succesfully");
			} else {
				System.out.println("No Announcemnt for user");
			}
			log.info("Executed validateVideo Successfully");
		} catch (Exception e) {
			log.error("Executed validateVideo Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void validateAction() {
		try {
			log.info("Entered validateAction");	
			log.info("Clicking Things_tO_do_btn");
			click(Things_tO_do_btn);
			waitFor(3000);
			log.info("Clicking Things_tO_know_btn");
			click(Things_tO_know_btn);
			Assert.assertTrue(validateforMoreOption.isDisplayed(), "More option is missing");
			waitUntilElementToBeClickable(validateforMoreOption);
			log.info("Clicking validateforMoreOption");
			click(validateforMoreOption);
			doHover(validatefordelete_btn);
			waitUntilElementToBeClickable(validatefordelete_btn);
			log.info("Clicking validatefordelete_btn");
			click(validatefordelete_btn);
			waitFor(3000);
			log.info("Executed validateAction Successfully");
		} catch (Exception e) {
			log.error("Executed validateAction Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void unPin() {
		try {
			log.info("Entered unPin");
			log.info("Clicking Things_tO_do_btn");
			click(Things_tO_do_btn);
			waitFor(3000);
			log.info("Clicking Things_tO_know_btn");
			click(Things_tO_know_btn);
			Assert.assertTrue(validateforMoreOption.isDisplayed(), "More option is missing");
            log.info("Waiting for validateforMoreOption");
			waitUntilElementToBeClickable(validateforMoreOption);
			log.info("Clicking validateforMoreOption");
			click(validateforMoreOption);
            log.info("Hovering unpin_btn");
			doHover(unpin_btn);
            log.info("Waiting for unpin_btn");
			waitUntilElementToBeClickable(unpin_btn);
			log.info("Clicking unpin_btn");
			click(unpin_btn);
            log.info("Waiting for confirm_unpin_btn");
			waitUntilElementToBeClickable(confirm_unpin_btn);
            log.info("Clicking confirm_unpin_btn");
			click(confirm_unpin_btn);
			waitForMessage("success");
			log.info("Executed unPin Successfully");
		} catch (Exception e) {
			log.error("Executed unPin Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void ValidateDelete() {
		try {
			log.info("Entered ValidateDelete");	
			if (validateforAnnouncentBody.isDisplayed()) {
				assertTrue(!validatefortitle.getText().equalsIgnoreCase("announcement_Title_delete"),
						"Announcement is not deleted");
			} else {
				System.out.println("No announcemnt for user");
			}
			log.info("Executed ValidateDelete Successfully");
		} catch (Exception e) {
			log.error("Executed ValidateDelete Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void validateActionForArchive() {
		try {
			log.info("Entered validateActionForArchive");
			log.info("Clicking Things_tO_do_btn");			
			click(Things_tO_do_btn);
			waitFor(3000);
			log.info("Clicking Things_tO_know_btn");
			click(Things_tO_know_btn);
			Assert.assertTrue(validateforMoreOption.isDisplayed(), "delete option is missing");
			waitUntilElementToBeClickable(validateforMoreOption);
			log.info("Clicking validateforMoreOption");
			click(validateforMoreOption);
			doHover(validateforArchive_btn);
			waitUntilElementToBeClickable(validateforArchive_btn);
			log.info("Clicking validateforArchive_btn");
			click(validateforArchive_btn);
			waitFor(3000);
			waitUntilElementToBeClickable(validateforArchiveConfirm_btn);
			log.info("Clicking validateforArchiveConfirm_btn");
			click(validateforArchiveConfirm_btn);
			waitFor(3000);
			log.info("Executed validateActionForArchive Successfully");
		} catch (Exception e) {
			log.error("Executed validateActionForArchive Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnProfiledropdownForArchive() {
		try {
			log.info("Entered clickOnProfiledropdownForArchive");	
			waitUntilElementToBeClickable(dropdown_profile);
			log.info("Clicking dropdown_profile");
			click(dropdown_profile);
			// waitUntilElementToBeClickable(btn_setting);
			// click(btn_setting);
			waitUntilElementVisible(validateforArchiveCardPage);
			log.info("Clicking validateforArchiveCardPage");
			click(validateforArchiveCardPage);
			log.info("Executed clickOnProfiledropdownForArchive Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnProfiledropdownForArchive Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void restoreArchiveCard() {
		try {
			log.info("Entered restoreArchiveCard");	
			waitUntilElementVisible(ArchiveCardPageMore_icon);
			Assert.assertTrue(validateforMoreOption.isDisplayed(), "archive is missing");
			waitUntilElementToBeClickable(ArchiveCardPageMore_icon);
			log.info("Clicking ArchiveCardPageMore_icon");
			click(ArchiveCardPageMore_icon);
			waitUntilElementToBeClickable(Restore_btn);
			log.info("Clicking Restore_btn");
			click(Restore_btn);
			waitFor(3000);
			waitUntilElementToBeClickable(RestoreConfirm_btn);
			log.info("Clicking RestoreConfirm_btn");
			click(RestoreConfirm_btn);
			waitFor(2000);
			log.info("Clicking Home_btn");
			click(Home_btn);
			waitUntilElementVisible(Things_tO_know_btn);
			log.info("Executed restoreArchiveCard Successfully");
		} catch (Exception e) {
			log.error("Executed restoreArchiveCard Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}
}
