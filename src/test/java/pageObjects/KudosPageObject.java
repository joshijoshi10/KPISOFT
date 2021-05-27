package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class KudosPageObject extends BasePage {

	public KudosPageObject(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Give Kudos')]")
	private WebElement giveKudos_btn;

	@FindBy(how = How.XPATH, using = "//p[@class='b my-4']")
	private WebElement individualKudos_txt;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement next_btn;

	@FindBy(how = How.XPATH, using = "//label[@for='kudosType2']")
	private WebElement teamKudos_btn;
	
	@FindBy(how=How.XPATH, using="//textarea[contains(@class,'kudos')]")
	private WebElement message_txtArea;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Post')]")
	private WebElement post_btn;
	
	@FindBy(how=How.ID, using="name")
	private WebElement whyAreYouSendingKudos_textfield;
	
	@FindBy(how=How.XPATH, using="//div[contains(text(),'Save')]")
	private WebElement save_btn;
	
	
	
	
	

	public void clickOnGiveKudos() {
		try {
			log.info("clicking on Give Kudos!!");
			click(giveKudos_btn);
			log.info("clicked on Give Kudos!!");
		} catch (Exception e) {
			log.error("error clicking on Give Kudos!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public boolean verifyIndividualKudosSelected(String value) {
		try {
			log.info("verifying individual kudos is selected!!");
			if ((verifyData(value, individualKudos_txt)))
				return true;
			else
				return false;

		} catch (Exception e) {
			log.info("error verifying text!!");
			return false;
		}
	}

	public void clickOnNext() {
		try {
			log.info("clicking on next!!");
			click(next_btn);
			log.info("clicked on next!!");
		} catch (Exception e) {
			log.error("error clicking on next!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnTeamKudos() {
		try {
			log.info("clicking on team kudos!!");
			clickOnElementByJs(teamKudos_btn);
			log.info("clicked on team kudos!!");

		} catch (Exception e) {
			log.error("error clicking on team kudos!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void selectEmployee(String empId) {
		try {
			log.info("selecting employee: " + empId);
			WebElement ele = webDriver.findElement(By
					.xpath("//label[contains(text(),'" + empId + "')]//..//..//div[@class='custom-checkbox']//label"));
			clickOnElementByJs(ele);
			log.info("selected employee: "+ empId);
		} catch (Exception e) {
			log.error("error selecting employee!!");
			e.printStackTrace();
			Assert.fail();
		}
	}
	public void selectBadge(String badgeName) {
		try {
			log.info("selecting badge: "+badgeName);
			WebElement ele=webDriver.findElement(By.xpath("//p[contains(text(),'"+badgeName+"')]//..//img"));
			clickOnElementByJs(ele);
			log.info("selected badge: "+ badgeName);
		} catch (Exception e) {
			log.error("error selecting badge");
			e.printStackTrace();
			Assert.fail();
		}
	}
	public void enterMessage(String message) {
		try {
			log.info("entering message");
			writeText(message_txtArea, message);
			log.info("entered message");
		} catch (Exception e) {
			log.error("error entering message");
			e.printStackTrace();
			Assert.fail();
		}
	}
	public void clickOnPost() {
		try {
			log.info("clicking on post!!");
			click(post_btn);
			log.info("clicked on post!!");
		} catch (Exception e) {
			log.error("error clicking on post!!");
			e.printStackTrace();
			Assert.fail();
		}
	}
	public void enterKudosReason(String message) {
		try {
			log.info("entering reason for kudos");
			writeText(whyAreYouSendingKudos_textfield, message);
			log.info("entered reason for kudos");
		} catch (Exception e) {
			log.error("error entering reason for kudos");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void clickOnSave() {
		try {
			log.info("clicking on save!!");
			click(save_btn);
			log.info("clicked on save!!");
		} catch (Exception e) {
			log.error("error clicking on save!!");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public boolean verifyKudosByBadgeType(String badgeName) {
		try {
			log.info("verifying kudos card by badge name");
			WebElement ele=webDriver.findElement(By.xpath("//p[contains(text(),'"+badgeName+"')]"));
			if(ele.getText().trim().equalsIgnoreCase(badgeName))
				return true;
			else
				return false;
		} catch (Exception e) {
			log.error("error verifying kudos card by badge name!!");
			e.printStackTrace();
			Assert.fail();
			return false;
		}
	}
	public boolean verifyNumberOfBadges(String a) {
		try {
			log.info("verifying badge size!!");
			List<WebElement> ele=webDriver.findElements(By.xpath("//input[@name='badgeSelect']"));
			int i=ele.size();
			String b=Integer.toString(i);
			if(a.equals(b)) {
				log.info("badge size verified!!");
				return true;}
				else {
					log.info("badge size not equal!!");
					return false;
				}
		} catch (Exception e) {
			log.error("error verifying badge size!!");
			e.printStackTrace();
			return false;
		}
	}
	public boolean verifyNumberOfBanners(String a) {
		try {
			log.info("verifying badge size!!");
			List<WebElement> ele=webDriver.findElements(By.xpath("//input[@name='bannerSelect']"));
			int i=ele.size();
			String b=Integer.toString(i);
			if(a.equals(b)) {
				log.info("banner size verified!!");
				return true;}
				else {
					log.info("banner size not equal!!");
					return false;
				}
		} catch (Exception e) {
			log.error("error verifying banner size!!");
			e.printStackTrace();
			return false;
		}
	}
	
}
