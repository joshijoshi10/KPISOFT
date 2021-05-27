package pageObjects;

import static org.testng.Assert.assertTrue;
import net.bytebuddy.implementation.bind.annotation.Super;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.Pageable;
import org.apache.log4j.Logger;
import helper.LoggerHelper;

public class TriggerReviewPage extends BasePage {

  public TriggerReviewPage(WebDriver webDriver) {
    super(webDriver);
    PageFactory.initElements(webDriver, this);

  }

  @FindBy(how = How.XPATH, using = "(//i[@class='fa fa-ellipsis-h'])[1]")
  private WebElement btn_actionList;

  @FindBy(how = How.XPATH, using = "//li[text()=' Trigger Review ']")
  private WebElement btn_triggerReview;

  @FindBy(how = How.XPATH, using = "//label[contains(text(),'End Date')]/..//button")
  private WebElement btn_endDate;

  @FindBy(how = How.XPATH, using = "//label[contains(text(),'Include everyone in')]")
  private WebElement btn_inculdeEveryoneIn;

  @FindBy(how = How.XPATH, using = "//textarea")
  private WebElement txtbx_includeIn;

  @FindBy(how = How.XPATH, using = "//button[text()[normalize-space() = 'Validate and Trigger Review']]")
  private WebElement btn_trigger;

  @FindBy(how = How.XPATH, using = "//label[contains(@for,'existing_Radio_')]")
  private WebElement chbx_excisting_review;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Review Label')]/..//input")
	private WebElement reviewlabel_txtbx;


  public void clickOnTrigger() {
	try {
	  log.info("Entered clickOnTrigger");	
      waitUntilElementToBeClickable(btn_actionList);
	  log.info("Clicking btn_actionList");
      click(btn_actionList);
      waitUntilElementToBeClickable(btn_triggerReview);
	  log.info("Clicking btn_triggerReview");
      click(btn_triggerReview);
		log.info("Executed clickOnTrigger Successfully");
	} catch (Exception e) {
		log.error("Executed clickOnTrigger Not Successfully");
		e.printStackTrace();
		throw e;
	}
  }
  public void clickOnTriggerbasrdonprogramname(String programname) {
		try {
		  log.info("Entered clickOnTrigger");	
		  WebElement actions_btn = webDriver.findElement(By.xpath("(//h6[contains(text(),'"+programname+"')])[1]/../following-sibling::div[last()]"));
			waitUntilElementVisible(actions_btn);
			click(actions_btn);
	      waitUntilElementToBeClickable(btn_triggerReview);
		  log.info("Clicking btn_triggerReview");
	      click(btn_triggerReview);
			log.info("Executed clickOnTrigger Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnTrigger Not Successfully");
			e.printStackTrace();
			throw e;
		}
	  }

  public void setEndDate(int year, int month, int day) {
	try {
	  log.info("Entered setEndDate");	
      setDateInDatePicker(btn_endDate, year, month, day);
		log.info("Executed setEndDate Successfully");
	} catch (Exception e) {
		log.error("Executed setEndDate Not Successfully");
		e.printStackTrace();
		throw e;
	}
  }

  public void includeEveryOneIn(String empcode) {
	try {
	  log.info("Entered includeEveryOneIn");	
      click(btn_inculdeEveryoneIn);
	  log.info("Writing text to txtbx_includeIn: "+empcode);
      writeText(txtbx_includeIn, empcode);
	  log.info("Executed includeEveryOneIn Successfully");
	} catch (Exception e) {
		log.error("Executed includeEveryOneIn Not Successfully");
		e.printStackTrace();
		throw e;
	}
  }

  public void clickOnValidateandTriggerReview() {
	try {
		log.info("Entered clickOnValidateandTriggerReview");
		log.info("Clicking btn_trigger");
        click(btn_trigger);
        waitFor(4000);
	    assertTrue(btn_actionList.isDisplayed(), "Trigger is not succesfull");
		log.info("Executed clickOnValidateandTriggerReview Successfully");
	} catch (Exception e) {
		log.error("Executed clickOnValidateandTriggerReview Not Successfully");
		e.printStackTrace();
		throw e;
	}
  }

  public void clickOnExcisitingReview() {
    try {
	  log.info("Entered clickOnExcisitingReview");
	  log.info("Clicking chbx_excisting_review");	  
      click(chbx_excisting_review);
	  log.info("Executed clickOnExcisitingReview Successfully");
	} catch (Exception e) {
		log.error("Executed clickOnExcisitingReview Not Successfully");
		e.printStackTrace();
		throw e;
	}
  }
	public void enterThereviewLabel()
	{
		try
		{
			log.info("Entered enterThereviewLabel");
			writeText(reviewlabel_txtbx, "finalreview_label");
			log.info("Executed enterThereviewLabel Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Executed enterThereviewLabel Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

}
