package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import util.DateUtil;
import util.ManagerUtil;

public class AnnouncementsPage extends BasePage {

  public AnnouncementsPage(WebDriver webDriver) {
    super(webDriver);
    PageFactory.initElements(webDriver, this);
  }

  @FindBy(how = How.XPATH, using = "//a[@href='#/menu/announcementProgram']")
  private WebElement lnk_Annoucment;

  @FindBy(how = How.XPATH, using = "//h5[@class='medium m-0']") //"//h5[@class='medium float-left mb-4 b-b pb-2 w-100']")
  private WebElement lbl_annoucment;

  @FindBy(how = How.XPATH, using = "//textarea[@name='announceTitle']") //"//label[contains(text(),'Announcement Title')]/../input")
  private WebElement txtbx_annoucmnetTiitle;

  @FindBy(how = How.XPATH, using = "//input[@id='AnnouncementImageTittle']")
  private WebElement txtbx_annoucmnetTiitleimagelink;

  @FindBy(how = How.XPATH, using = "//label[@for='content']/../div/quill-editor/div[2]/div[1]/p")
  private WebElement txtbx_anncoumnetContent;

  @FindBy(how = How.XPATH, using = "//button[normalize-space()='Make Announcement Now']")
  private WebElement btn_makeAnnoucment;
  
  @FindBy(how = How.XPATH, using = "//label[contains(text(),'Pin Announcement')]/preceding-sibling::div/label")
  private WebElement pinAnnouncment;

  @FindBy(how = How.XPATH, using = "//input[@name='myFile']") //"//button[@class='ql-image']//*[name()='svg']")
  private WebElement btn_image;

  @FindBy(how = How.XPATH, using = "(//label[@class='normal'])[2]")
  private WebElement btn_inculdeExcept;

  @FindBy(how = How.XPATH, using = "(//textarea)[2]")
  private WebElement txtbx_employee;

  @FindBy(how = How.XPATH, using = "//label[@for='everyonein']")
  private WebElement btn_includein;

  @FindBy(how = How.XPATH, using = "//button[@class='ql-video']//*[name()='svg']")
  private WebElement btn_vediotab;

  @FindBy(how = How.XPATH, using = "//input[@id='announcementVid']")  //"//input[@data-video='Embed URL']")
  private WebElement txtbx_vedioLink;

  @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']") //"//a[@class='ql-action']")
  private WebElement btn_Save;

  @FindBy(how = How.XPATH, using = "//a[@id='tab-selectbyid2']")
  private WebElement tab_image;

  @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter web address']")
  private WebElement txtbx_imagelnk;

  @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary dropdown-toggle-split dropdown-toggle']")
  private WebElement dd_announcemnet;

  @FindBy(how = How.XPATH, using = "//button[normalize-space()='Schedule Announcement']")
  private WebElement btn_sheduleAnno;

  @FindBy(how = How.XPATH, using = "//button[@class='iga-right']")
  private WebElement dp_shedDateBtn;

  @FindBy(how = How.XPATH, using = "(//input[@class='form-control'])[1]")
  private WebElement txtbx_hourtime;

  @FindBy(how = How.XPATH, using = "(//input[@class='form-control'])[2]")
  private WebElement txtbx_minutetime;

  @FindBy(how = How.XPATH, using = "//button[@class='btn btn-outline-primary']")
  private WebElement btn_ampm;

  @FindBy(how = How.XPATH, using = "//button[normalize-space()='Confirm']")
  private WebElement btn_sheduleAnnounce;

  @FindBy(how = How.XPATH, using = "//a[@id='ThingsToKnow']")
  private WebElement btn_thinkToKnow;
  String btn_thingToKnowLoc = "//a[@id='ThingsToKnow']";

  @FindBy(how = How.XPATH, using = "(//announcement/descendant::h5)[1]")
  private WebElement lbl_annoucmenttittle;
  private String lbl_announcmenttittleLoc = "(//announcement/descendant::h5)[1]";

  @FindBy(how = How.XPATH, using = "(//announcement/descendant::p[2])[1]")
  private WebElement lbl_annoucmentcontent;

  @FindBy(how = How.XPATH, using = "(//announcement/descendant::img)[2]")
  private WebElement img_imageAnnoucement;

  @FindBy(how = How.XPATH, using = "//div[@id='ThingsToKnow-panel']/descendant::iframe")
  private WebElement vedio_vedioAnnouncement;

  public void clickOnAnnouncement() {
    try {
    	log.info("clicking on announcement!!");
      waitUntilElementToBeClickable(lnk_Annoucment);
      doHoverandClick(lnk_Annoucment);
      log.info("clicked on announcement!!");
    } catch (Exception e) {
    	log.error("clicking on announcement!!");
      e.printStackTrace();
    }
  }

  public void validateAnnouncement(String value) {
    try {
    	log.info("validating announcement label!!");
      Assert.assertEquals(lbl_annoucment.getText(), value,
          "After click on Annoucment tab it is not navigating to Anncoumnet page");
      log.info("validated announcement label!!");
    } catch (Exception e) {
    	log.error("error validating announcement label!!");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void enterDataAtAnnouncementTitle(String value) {
    try {
    	log.info("entering announcement title!!");
      log.info("Writing to txtbx_annoucmnetTiitle: "+value);
      writeText(txtbx_annoucmnetTiitle, value);
      log.info("entered announcement title!!");
    } catch (Exception e) {
    	log.error("error entering announcement title!!");
      e.printStackTrace();
      Assert.fail();
    }
  }
  
  public void setPinAnnouncement() {
	    try {
	      log.info("Entered setPinAnnouncement");
	      log.info("Clicking pinAnnouncment");
	      click(pinAnnouncment);
	      waitFor(3000);
	      log.info("Executed setPinAnnouncement Successfully");
	    } catch (Exception e) {
	      log.error("Executed setPinAnnouncement Not Successfully");
	      e.printStackTrace();
	      throw e;
	    }
	  }

  public void enterContentAnnouncement(String value) {
    try {
    	log.info("entering announcement content!");
      Actions actions = new Actions(webDriver);
      actions.moveToElement(txtbx_anncoumnetContent);
      log.info("Clicking actions");
      actions.click();
      log.info("Writing to actions: "+value);
      actions.sendKeys(value);
      actions.build().perform();
      log.info("entered announcement content!");
    } catch (Exception e) {
    	log.error("error entering announcement content!");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void clickOnMakeAnnouncementButton() {
    {
      try {
    	  log.info("clicking on make announcement!!");
        scrollUpAndDown(200);
        waitUntilElementToBeClickable(btn_makeAnnoucment);
        log.info("clicking btn_makeAnnoucment");
        click(btn_makeAnnoucment);
        ManagerUtil.waitFor(3000);
        log.info("clicked on make announcement!!");
      } catch (Exception e) {
    	  log.error("error clicking on make announcement!!");
        e.printStackTrace();
        Assert.fail();
      }

    }
  }

  public void clickOnImageLogoButton() {
    try {
//    	log.info("clicking on image logo button!");
//      waitUntilElementToBeClickable(btn_image);
//      click(btn_image);
//      log.info("clicked on image logo button!");
//      log.info("adding image to the announcement");
//      UploadFiles(System.getProperty("user.dir") + "\\src\\test\\resources\\Image\\Announcement.jpg");
      waitFor(1000);
      writeText(btn_image,System.getProperty("user.dir") + "\\src\\test\\resources\\Image\\Announcement.jpg");
      log.info("scrollUpAndDown");
      scrollUpAndDown(300);
      log.info("added image to the announcement");
    } catch (Exception e) {
    	log.error("error adding image to the announcement!!");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void clickOnExcludeIn() {
    try {
    	log.info("clicking on include everybody except!!");
      waitUntilElementToBeClickable(btn_inculdeExcept);
      log.info("clicking on btn_inculdeExcept!!");
      click(btn_inculdeExcept);
      log.info("clicked on include everybody except!!");
    } catch (Exception e) {
    	log.info("error clicking on include everybody except!!");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void enterTheUserInfo(String value) {
    try {
    	log.info("entering empId");
      log.info("scrollUpAndDown");
      scrollUpAndDown(200);
      log.info("scrollUpAndDown");
      log.info("Writing to txtbx_employee:"+value);
      writeText(txtbx_employee, value);
      log.info("entered empId");
    } catch (Exception e) {
    	log.error("error entering empId");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void clickincludein() {
    try {
    	log.info("clicking on include everyone in");
      waitUntilElementToBeClickable(btn_includein);
      log.info("clicking on btn_includein");
      click(btn_includein);
      log.info("clicked on include everyone in");
    } catch (Exception e) {
    	log.error("error clicking on include everyone in");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void clickonVedioTab() {
    try {
    	log.info("clicking on video tab!");
      waitUntilElementToBeClickable(btn_vediotab);
      log.info("clicking on btn_vediotab!");
      click(btn_vediotab);
      log.info("clicked on video tab!");
    } catch (Exception e) {
    	log.error("error clicking on video tab!");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void enterVedioLink(String value) {
    try {
    	log.info("entering video link!!");
      log.info("Wrting to txtbx_vedioLink: "+value);
      writeText(txtbx_vedioLink, value);
      log.info("entered video link!!");
    } catch (Exception e) {
    	log.error("error entering video link!!");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void clickOnSave() {
    try {
    	log.info("clicking on save!");
      waitUntilElementToBeClickable(btn_Save);
      log.info("clicking btn_Save!");
      click(btn_Save);
      log.info("clicked on save!");
    } catch (Exception e) {
    	log.error("error clicking on save!");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void clickonImageTab() {
    try {
    	log.info("clicking on image tab!!");
      waitUntilElementToBeClickable(tab_image);
      log.info("clicking tab_image!");
      click(tab_image);
      log.info("clicked on image tab!!");
    } catch (Exception e) {
    	log.error("error clicking on image tab!!");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void selectSheduleAnnoce() {
    try {
    	log.info("clicking on schedule announcement!");
      //waitUntilElementToBeClickable(dd_announcemnet);
      //click(dd_announcemnet);
      waitUntilElementToBeClickable(btn_sheduleAnno);
      log.info("clicking btn_sheduleAnno!");
      click(btn_sheduleAnno);
      waitUntilElementVisible(dp_shedDateBtn);
      log.info("clicked on schedule announcement!");
    } catch (Exception e) {
    	log.error("error clicking on schedule announcement!");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void setdateSheduleAnn() {
    try {
    	log.info("setting schedule date for announcement");
      setDateInDatePicker(dp_shedDateBtn, DateUtil.getCurrentYear(), DateUtil.getCurrentMonth(),
          DateUtil.getCurrentDay());
      log.info("set schedule date for announcement");
    } catch (Exception e) {
    	log.error("error setting schedule date for announcement");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void setTimeSheduleAnn() {
    try {
    	log.info("selecting time for scheduling announcement!!");
      log.info("Writing to txtbx_hourtime:"+DateUtil.getCurrentHour());
      writeText(txtbx_hourtime, DateUtil.getCurrentHour());
      log.info("Writing to txtbx_minutetime:"+DateUtil.getCurrentMin());
      writeText(txtbx_minutetime, DateUtil.getCurrentMin());
		if (!btn_ampm.getText().equalsIgnoreCase(DateUtil.getCurrentAmPm())) {
            log.info("clicking btn_ampm!");
            btn_ampm.click();
            waitFor(2000);
        }
		log.info("selected time for scheduling announcement!!");
    } catch (Exception e) {
    	log.error("error selecting time for scheduling announcement!!");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void clickOnConfirmsheduleAnnocume() {
    try {
    	log.info("clicking on schedule announcement");
      waitUntilElementToBeClickable(btn_sheduleAnnounce);
      log.info("clicking btn_sheduleAnnounce!");
      click(btn_sheduleAnnounce);
      waitFor(125000);
      log.info("clicked on schedule announcement");
    } catch (Exception e) {
    	log.error("error clicking on schedule announcement");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void clickOnThingToKnow() {
    try {
    	log.info("clicking on things to know!!");
      waitUntilElementToBeClickableRepeated(By.xpath(btn_thingToKnowLoc),2);
      log.info("clicking btn_thinkToKnow!");
      clickOnElementByJs(btn_thinkToKnow);
      waitFor(3000);
      log.info("clicked on things to know!");
    } catch (Exception e) {
    	log.error("error clicking on things to know!");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void verifyforTiitle(String value) {
    try {
    	log.info("verifying announcement title!!");
    	waitUntilElementToBeClickableRepeated(By.xpath("lbl_announcmenttittleLoc"),2);
      Assert.assertEquals(lbl_annoucmenttittle.getText(), value, "Showing tittle is not same as per given");
      log.info("verified announcement title!!");
    } catch (Exception e) {
    	log.error("verifying announcement title!!");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void verifyForContent(String value) {
    try {
    	log.info("verifying announcement content!!");
      Assert.assertEquals(lbl_annoucmentcontent.getText(), value, "Showing Content is not same per Given");
      log.info("verified announcement content!!");
    } catch (Exception e) {
    	log.error("error verifying announcement!!");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void verifyAnnoucmentimage() {
    try {
    	log.info("verifying announcement image!!");
      Assert.assertTrue(img_imageAnnoucement.isEnabled(), "Image is not visible");
      log.info("verified announcement image!!");
    } catch (Exception e) {
    	log.error("error verifying announcement image!!");
      e.printStackTrace();
      Assert.fail();
    }
  }

  public void verifyAnnoucmentVedio() {
    try {
    	log.info("verifying announcement video!!");
      Assert.assertTrue(vedio_vedioAnnouncement.isEnabled(), "Vedio is not visible");
      log.info("verified announcement video!!");
    } catch (Exception e) {
    	log.error("error verifying announcement video!!");
      e.printStackTrace();
    }
  }

}
