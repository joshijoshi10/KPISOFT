package pageObjects;

import static org.testng.Assert.assertEquals;
import config.ConfigFileReader;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MailTrapPage extends BasePage {

	String mailtrap_url;

	public MailTrapPage(WebDriver webdriver, String mailtrap_url) {

		super(webdriver);
		this.mailtrap_url = mailtrap_url;
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Log in')]")
	private WebElement login_btn;

	@FindBy(how = How.ID, using = "user_email")
	private WebElement email_txt;

	@FindBy(how = How.ID, using = "user_password")
	private WebElement password_txt;

	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	private WebElement signin_btn;

	/*
	 * @FindBy(how=How.XPATH,using="//span[contains(text(),'Demo inbox')]") private
	 * WebElement demoInbox_lnk;
	 */
	@FindBy(how = How.XPATH, using = "(//tbody//tr)[1]")
	private WebElement firstMsg_lnk;

	@FindBy(how = How.TAG_NAME, using = "iframe")
	private WebElement iframe;

	@FindBy(how = How.XPATH, using = "/html/body/a")
//	@FindBy(how = How.XPATH, using = "//a[contains(text(),'${TENANT_URL!}')]")
	private WebElement passwordReset_lnk;

	@FindBy(how = How.XPATH, using = "//a[@title='Refresh']")
	private WebElement refresh_btn;

	@FindBy(how = How.XPATH, using = "//a[.='Clear']")
	private WebElement delete_btn;

	@FindBy(how = How.XPATH, using = "((//tbody//tr)[1]//td)[2]")
	private WebElement Verify_username;

	@FindBy(how = How.XPATH, using = "((//tbody//tr)[1]//td)[3]")
	private WebElement Verify_Subject;

	public void goToMailTrapPage() {
		try {
			log.info("Entered goToMailTrapPage");
			log.info("Browsing URL " + mailtrap_url);
			webDriver.get(mailtrap_url);
			log.info("Browsed URL " + mailtrap_url);
			waitFor(1000);
			log.info("Executed goToMailTrapPage Successfully");
		} catch (Exception e) {
			log.error("Executed goToMailTrapPage Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getlogin() {
		try {
			log.info("Entered getlogin");
			log.info("Clicking login_btn");
			click(login_btn);
			log.info("Clicked login_btn");
			log.info("Executed getlogin Successfully");
		} catch (Exception e) {
			log.error("Executed getlogin Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void email(String email) {
		try {
			log.info("Entered email");
			log.info("Typing email " + email);
			writeText(email_txt, email);
			log.info("Typed email " + email);
			log.info("Executed email Successfully");
		} catch (Exception e) {
			log.error("Executed email Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void password(String pwd) {
		try {
			log.info("Entered password");
			log.info("Typing password " + pwd);
			writeText(password_txt, pwd);
			log.info("Typed password " + pwd);
			log.info("Executed password Successfully");
		} catch (Exception e) {
			log.error("Executed password Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void signin() {
		try {
			log.info("Entered signin");
			log.info("Clicking signin");
			click(signin_btn);
			log.info("Clicked signin");
			log.info("Executed signin Successfully");
		} catch (Exception e) {
			log.error("Executed signin Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * public void clickOnDemoInbox() { try{ click(demoInbox_lnk); waitFor(2000);
	 * }catch(Exception e) { e.printStackTrace(); } }
	 */
	public void getFirstMail(String expected, String Subject) {
		try {
			WebElement element;
			boolean element1, element2;
			log.info("Entered getFirstMail");
			String firstStr = "((//tbody//tr)[";
			int forLoopCount = 1;
			int forLoopCount2 = 5;
			String thirdStr = "]//td)[2]";
			String fourthStr = "]//td)[3]";
			
			String msgStr = "(//tbody//tr)[";
			String msgStr2 = "]";
			String msgXpath;
			
			String finalXpath = firstStr + forLoopCount + thirdStr;
			element1 = webDriver.findElement(By.xpath(finalXpath)).isDisplayed();
			String finalXpath2 = firstStr + forLoopCount2 + thirdStr;
			element2 = webDriver.findElement(By.xpath(finalXpath2)).isDisplayed();
			
			for(int i=1;i<=5;i++) {
				finalXpath = firstStr + i + thirdStr;
				String val = webDriver.findElement(By.xpath(finalXpath)).getText();
//				System.out.println(val+forLoopCount);
				finalXpath2 = firstStr + i + fourthStr;
				if(webDriver.findElement(By.xpath(finalXpath)).isDisplayed()) {
					String text1 = webDriver.findElement(By.xpath(finalXpath)).getText();
					String text2 = webDriver.findElement(By.xpath(finalXpath2)).getText();
					
					if(text1.equals(expected) || text2.equals(Subject)) {
						msgXpath = msgStr + i +msgStr2; 
						System.out.println("before clicking on mail=======");
						webDriver.findElement(By.xpath(msgXpath)).click();
						System.out.println("after clicking++++++++");
						break;
					}
				}
			}
//			System.out.println(element1+"_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
//			System.out.println(element2+"_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
//
//			waitUntilElementVisible(Verify_username);
//			String removedone = Verify_username.getText().replace("<", "");
//			String actualusername = removedone.replace(">", "");
//			System.out.println(actualusername);
//			System.out.println(Verify_Subject.getText());
//			log.info("Checking if email with subject "+Subject+" for user " + expected + " available!");
//			
//			if (actualusername.equalsIgnoreCase(expected) || Verify_Subject.getText().equalsIgnoreCase(Subject)) {
//				log.info("Clicking firstMsg_lnk");
//				click(firstMsg_lnk);
//				log.info("Clicked firstMsg_lnk");
//				waitFor(5000);
//			} else {
//				System.out.println("mail doesnot excist");
//				log.info("email with subject "+Subject+" for user " + expected + " not available!");
//			}
			log.info("Executed getFirstMail Successfully");
		} catch (Exception e) {
			log.error("Executed getFirstMail Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getResetPasswordLink() {
		try {
			log.info("Entered getResetPasswordLink");
			waitFor(3000);
			log.info("Switching to iframe");
			SwitchTOFrame(iframe);
			log.info("Switched to iframe");
			waitFor(500);
			log.info("Clicking passwordReset_lnk");
			click(passwordReset_lnk);
//			webDriver.getCurrentUrl().startsWith("https://gradientqa.kpisoft.com/"))
//			String urlOld = webDriver.getCurrentUrl();
//			System.out.println(urlOld);
//			String mailtrapbaseurl = ConfigFileReader.getApplicationUrlForReset();
//			System.out.println(mailtrapbaseurl);
//			webDriver.navigate().to(mailtrapbaseurl);
			log.info("Clicked passwordReset_lnk");
			log.info("Executed getResetPasswordLink Successfully");
		} catch (Exception e) {
			log.error("Executed getResetPasswordLink Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void changeUrlEnter() {
		try {
			log.info("Entered changeUrlEnter");
			log.info("Getting mail trap url");
			String mailtrapbaseurl = ConfigFileReader.getApplicationUrlForReset();
			log.info("Got mail trap url: " + mailtrapbaseurl);
			String urlOld = webDriver.getCurrentUrl();
			System.out.println(urlOld+"_+_+_+_+_+_+_+_+_+_+_+_");
			String finalUrl = urlOld.substring(55);
			System.out.println(mailtrapbaseurl+finalUrl+"_+_+_+_+_+_+_+_+_+_+_+_");
			String endUrl = mailtrapbaseurl+finalUrl;
			webDriver.navigate().to(endUrl);
//			waitFor(3000);
//			log.info("Switching to iframe");
//			SwitchTOFrame(iframe);
//			log.info("Switched to iframe");
//			waitFor(2000);
//			log.info("Waiting for password reset link");
//			waitUntilElementVisible(passwordReset_lnk);
//			String url = passwordReset_lnk.getText().trim();
//			System.out.println(url);
//			int limit = url.length() - 82;
//			System.out.println(limit);
//			String[] splited = url.split("", limit + 1);
//			int length = splited.length;
//			String end = splited[length - 1];
//			System.out.println(end);
//			String add = "https://" + mailtrapbaseurl;
//			String reseturl = add + end;
//			System.out.println(reseturl);
//			log.info("Navigating to Reset URL "+reseturl);
//			webDriver.navigate().to(reseturl);
			log.info("Executed changeUrlEnter Successfully");
		} catch (Exception e) {
			log.error("Executed changeUrlEnter Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

//	public void ChangeEnterCurrentUrl() {
//		try {
//			log.info("Entered ChangeEnterCurrentUrl");
//			log.info("Getting ChangeEnterCurrentUrl");
//			
//			log.info("Executed ChangeEnterCurrentUrl Successfully");
//		}catch (Exception e) {
//			log.error("Executed ChangeEnterCurrentUrl Not Successfully");
//			e.printStackTrace();
//			throw e;
//		}
	
	public void clickOnRefresh() {
		try {
			log.info("Entered clickOnRefresh");
			waitUntilElementToBeClickable(refresh_btn);
			log.info("Clicking refresh_btn");
			click(refresh_btn);
			waitFor(3000);
			log.info("Executed clickOnRefresh Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnRefresh Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnDelete() {
		try {
			log.info("Entered clickOnDelete");
			waitUntilElementToBeClickable(delete_btn);
			log.info("Clicking delete_btn");
			click(delete_btn);
			log.info("Clicked delete_btn");
			waitFor(2000);
			webDriver.switchTo().alert().accept();
			log.info("Executed clickOnDelete Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnDelete Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
}
