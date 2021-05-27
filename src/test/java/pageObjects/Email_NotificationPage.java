package pageObjects;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import config.ConfigFileReader;

public class Email_NotificationPage extends BasePage {

	public Email_NotificationPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);

	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Email Notification')]")
	private WebElement EmailNotificationlink;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'»»')]")
	private WebElement GotoLastPage;

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Change your password')])[1]") //"(//h6[contains(text(),'Change your password')])[1]")
	private WebElement veerifyStatus;

	@FindBy(how = How.XPATH, using = "(//i[contains(@class,'fa fa-envelope')])[1]")
	private WebElement LastMail_icon;

	@FindBy(how = How.XPATH, using = "//p//a")
	private WebElement passwordReset_lnk;

	public void ClickOnEmailNotification() {
		try {
			log.info("Entered ClickOnEmailNotification");
			waitUntilElementToBeClickable(EmailNotificationlink);
			log.info("Clicking EmailNotificationlink");
			click(EmailNotificationlink);
			waitFor(3000);
			log.info("Executed ClickOnEmailNotification Successfully");
		} catch (Exception e) {
			log.info("Executed ClickOnEmailNotification Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void GotoLastpage() {
		try {
			log.info("going to last page!!");
			waitUntilElementToBeClickable(GotoLastPage);
			click(GotoLastPage);
			scrollUp();
			waitFor(2000);
			log.info("went to last page!!");
		} catch (Exception e) {
			log.error("error going to last page!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnMail() {
		try {
			log.info("Entered clickOnMail");
			waitFor(2000);
			assertTrue(veerifyStatus.getText().equalsIgnoreCase("Change your password"),
					"<<status is not matching hence failed>>");
			waitUntilElementToBeClickable(LastMail_icon);
			log.info("Clicking LastMail_icon");
			click(LastMail_icon);
			log.info("Executed clickOnMail Successfully");
		} catch (Exception e) {
			log.info("Executed clickOnMail Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getResetPasswordLink() {
		try {
			log.info("Entered getResetPasswordLink");
			String mailtrapbaseurl = ConfigFileReader.getApplicationUrlForReset();
			waitFor(2000);
			waitUntilElementVisible(passwordReset_lnk);
			String url = passwordReset_lnk.getText().trim();
			System.out.println(url);
			int limit = url.length() - 82;
			System.out.println(limit);
			String[] splited = url.split("", limit + 1);
			int length = splited.length;
			String end = splited[length - 1];
			System.out.println(end);
			String add = "https://" + mailtrapbaseurl;
			String reseturl = add + end;
			System.out.println(reseturl);
			webDriver.navigate().to(reseturl);
			log.info("Browsing reset password link: "+reseturl);
			log.info("Executed getResetPasswordLink Successfully");
		} catch (Exception e) {
			log.info("Executed getResetPasswordLink Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
}
