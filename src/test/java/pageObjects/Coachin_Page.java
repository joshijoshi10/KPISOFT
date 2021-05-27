package pageObjects;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import helper.LoggerHelper;
import util.ManagerUtil;


       public class Coachin_Page extends BasePage {
	    Logger log = LoggerHelper.getLogger(LoggerHelper.class);
		public Coachin_Page(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(how=How.ID, using="coachinBtn")
	private WebElement coachIn_btn;

   @FindBy(how=How.XPATH, using="//p[text()='Attendee']/preceding-sibling::img")
   private WebElement attendee_btn;
	
	@FindBy(how=How.XPATH, using="//div[@class='card-body']//button[@class='btn btn-primary']")
	private WebElement selectAttendees_btn;

	@FindBy(how=How.XPATH, using="//input[@placeholder='Search']")
	private WebElement search_txtBox;

    @FindBy(how=How.XPATH, using="(//div[@class='media-body']//p)[1]")
    private WebElement firstEmp;
	
	@FindBy(how=How.XPATH, using="(//input[@type='checkbox'])[1]")
	private WebElement emp_checkBox;

   @FindBy(how=How.XPATH, using="//span[contains(text(),'Select Coach')]/..")
   private WebElement selectCoach_btn;

   @FindBy(how=How.XPATH, using="//button[contains(text(),'Add')]")
	private WebElement add_btn;
	
	@FindBy(how=How.XPATH, using="(//textarea[@id='float-input'])[1]")
	private WebElement inputtitle;
	
	@FindBy(how=How.XPATH, using="(//textarea[@id='float-input'])[2]")
	private WebElement inputdescription;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Submit')]")
	private WebElement submit_btn;
	
	@FindBy(how=How.XPATH, using="//div[@class='upload-btn-wrapper w-auto']//input")
	private WebElement attach_btn;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Tenant Preference ')]")
	private WebElement TenantPrefrences;
	
	@FindBy(how=How.XPATH, using="//label[@for='id_canCoachMultipleUsers']")
	private WebElement Coachmultipleusers;

   @FindBy(how=How.ID, using="id_canCoachMultipleUsers")
   private WebElement CoachmultipleusersTypeChk;

	@FindBy(how=How.XPATH, using="//button[contains(text(),' Save ')]")
	private WebElement SaveButton;
	
	@FindBy(how=How.XPATH, using="//i[@class='fonticon-home m-2']")
	private WebElement Home;

    @FindBy(how=How.XPATH, using="(//h5[contains(text(),'View Coach-In Details')]/../..)[1]/../..//p")
    private WebElement CoachMessage;
	
//	@FindBy(how=How.XPATH, using="(//input[@type='checkbox']/..//label)[1]")
//	private WebElement SelectingMultiplemeployees;
	
	
	
	
	
	
	
	
	public void ClickConductcoachin() {
	try {
		log.info("Clicking on coachin button!!");
		click(coachIn_btn);
		waitFor(2000);
		log.info("Clicked on coachin button!!");
		}catch(Exception e)
	{
		log.error("Error clicking on coachin button!!");
		e.printStackTrace();
		Assert.fail();
	}
	  }

	   public void ClickAttendee() {
		   try {
			   log.info("Clicking on Attendee!!");
			   click(attendee_btn);
			   waitFor(2000);
			   log.info("Clicked on Attendee!!");
		   }catch(Exception e)
		   {
			   log.error("Error clicking on Attendee!!");
			   e.printStackTrace();
			   Assert.fail();
		   }
	   }

	
	public void ClickSelectAttendees() {
	try {
		log.info("Clicking on select attendees!!");
		click(selectAttendees_btn);
		waitFor(2000);
		log.info("Clicked on select attendees!!");
		}catch(Exception e)
	{
		log.error("Error clciking on select attendees!!");
		e.printStackTrace();
		Assert.fail();
	}
}

   public void ClickSelectCoach() {
	   try {
		   log.info("Clicking on select coach!!");
		   click(selectCoach_btn);
		   waitFor(2000);
		   log.info("Clicked on select coach!!");
	   }catch(Exception e)
	   {
		   log.error("Error clciking on select coach!!");
		   e.printStackTrace();
		   Assert.fail();
	   }
   }
	
	
	public void selectEmployees(String empName) {
		try {
			log.info("selecting employee::"+empName);
			typeTextToGetDropdown(search_txtBox,empName,null);
			waitFor(1000);
			clickOnElementByJs(emp_checkBox);
			
			log.info("selecting employee::"+empName);
			} catch (Exception e) {
			
			log.error("Error clicking on select employees!!");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void clickOnAdd() {
		try {
			log.info("Clicking on add!!");
			click(add_btn);
			log.info("Clicked on add button!!");
		} catch (Exception e) {
			log.error("Error clicking on add button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void enterCoachInTitle(String title) {
		try {
			log.info("Entering coachin title!!");
			waitUntilElementVisible(inputtitle);
			writeText(inputtitle, title);
			log.info("entered coachin title!!");
		} catch (Exception e) {
			log.error("Error on entering title!!");
			e.printStackTrace();
			Assert.fail();
			
		}
	}
	public void enterCoachInDescription(String description) {
		try {
			log.info("Entering description!!");
			waitUntilElementVisible(inputdescription);
			writeText(inputdescription, description);
			log.info("Entered description!!");
			} catch (Exception e) {
			log.error("Error on entering description!!");	
			e.printStackTrace();
			Assert.fail();
			
		}
	}
	
	public void clickOnSubmit() {
		try {
			log.info("Clicking on submit button!!");
			click(submit_btn);
			waitFor(3000);
			log.info("Clikced on submit button!!");
			} catch (Exception e) {
				log.error("Error on clicking submit button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void attachFile(String filePath) {
		try {
			//File file = new File(filePath);       
            //String attach = file.getAbsolutePath().replace("\\", "\\\\");
			log.info("Attaching file!!");;
			String abspath1=new File(filePath).getAbsolutePath();
            waitFor(3000);
			attach_btn.sendKeys(abspath1);
			log.info("Attached file!!");
			} catch (Exception e) {
				log.error("Error in attaching file!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

   public void validateCoachMessage(String coach, String tenant) {
	   try {
		   log.info("Validating coach message!!");;
		   waitFor(3000);
		   String actualMess = CoachMessage.getText();
		   Assert.assertTrue(actualMess.matches(coach+" has conducted Coach-in for "+tenant.trim()),
				   actualMess + " does not contain "+coach+" has conducted Coach-in for "+tenant);
		   log.info("Validated coach message!!");
	   } catch (Exception e) {
		   log.error("Error in attaching file!!");
		   e.printStackTrace();
		   Assert.fail();
	   }
   }
	
	public void ClickTenant()
	{
		
	try {
		log.info("Clicking on tenant!!");
		click(TenantPrefrences);
		waitFor(3000);
		log.info("Clicked on tenant!!");;
		} catch (Exception e) {
			log.error("Error on clicking tenant!!");
		e.printStackTrace();
		Assert.fail();
	}
}
	
	public void ClickCanCoachMultipleUsers()
	{
		
	try {
		log.info("Clicking on coachmultiple users!!");
		waitFor(3000);
		if (!CoachmultipleusersTypeChk.isSelected()) {
			clickOnElementByJs(Coachmultipleusers);
		}
		waitFor(3000);
		log.info("Clicked on coachmultiple users!!");
		} catch (Exception e) {
			log.error("Error on clicking on coachmultiple users!!");
		e.printStackTrace();
		Assert.fail();
	}
}
	public void ClickSaveButton() {
	try {
		log.info("Clicking on save button!!");
		click(SaveButton);
		waitFor(2000);
		log.info("Clicked on save button!!");
		}catch(Exception e)
	{
			log.error("Error on clicking save button!!");
		e.printStackTrace();
		Assert.fail();
	}
}
	
	public void ClickHomeIcon() {
	try {
		log.info("Clicking on Home icon!!");
		waitFor(3000);
		click(Home);
		waitFor(3000);
		log.info("Clicked on home icon!!");
		}catch(Exception e)
	{
			log.info("Error on clicking home icon!!");
		e.printStackTrace();
		Assert.fail();
	}
}
//	
//	public void selectTheUserToselect(String empcode) {
//		try {
//			waitFor(2000);
//			click(selectAttendees_btn);
//			//String[] letter = userToSelect.split("");
//			String array[] = empcode.split("");
//			//for (int i = 0; i <= letter.length; i++) {
//			for (int i = 0; i < empcode.length(); i++) {
//				//search_txtBox.sendKeys(letter[i]);
//				search_txtBox.sendKeys(array[i]);
//				waitFor(2000);
//			}
//			assertTrue(SelectingMultiplemeployees.isDisplayed(), "There is no user to select");
//			scroll(webDriver, "down");
//			//waitUntilElementToBeClickable(SelectingMultiplemeployees);
//			clickOnElementByJs(SelectingMultiplemeployees);
//			search_txtBox.clear();
//			System.out.println("clicked");
//			waitFor(3000);
//			//waitUntilElementToBeClickable(add_btn);
//			//click(add_btn);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	

	public void ClickonSelectAttendees()
	{
		
	try {
		log.info("Clicking on attendees!!");
		click(selectAttendees_btn);
		//waitFor(3000);
		log.info("Clicked on attendees!!");;
		} catch (Exception e) {
			log.error("Error on clicking attendees!!");
		e.printStackTrace();
		Assert.fail();
	}
}
//	public void selectEmployee(String empId) {
//        try {
//        	//click(selectAttendees_btn);
//            log.info("selecting the employee!!");
//            WebElement ele = webDriver.findElement(By.xpath("//p[contains(text(),'" + empId + "')]//..//..//label"));
//            clickOnElementByJs(ele);
//            log.info("selected the employee!!");
//        } catch (Exception e) {
//            log.error("error selecting the employee!!");
//            e.printStackTrace();
//            Assert.fail();
//        }
//    }
//	
	
	public void selectEmployee(String empID) {
        try {
            log.info("selecting employee: " + empID);
            WebElement ele = webDriver.findElement(By.xpath("//p[contains(text(),'"+empID+"')]//..//..//div[@class='custom-checkbox']//label"));
            clickOnElementByJs(ele);
            log.info("selected employee: "+ empID);
        } catch (Exception e) {
            log.error("error selecting employee!!");
            e.printStackTrace();
            Assert.fail();
        }
    }
       }
       