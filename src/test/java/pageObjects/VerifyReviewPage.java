package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;
import helper.LoggerHelper;

public class VerifyReviewPage extends BasePage {
	
	public VerifyReviewPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Verify Performance') or contains(text(),'Verify Their Performance')]/..")
	private WebElement lnk_verifyPerformance;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Verify Their Performance')]/..")
	private WebElement lnk_verifyTheirPerformance;	

	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'Performance Review')])[2]")
	private WebElement lbl_verifyPerformance;

	@FindBy(how = How.XPATH, using = "//button[.='Next']")
	private WebElement btn_Next;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Verify')]")
	private WebElement btn_Verify;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Comment')]/../textarea")
	private WebElement txt_verifyComments;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'OK, Confirm')]")
	private WebElement btn_ConfirmVerify;

	public void clickOnVerifyPerformance() {
		try {
			log.info("Entered clickOnVerifyPerformance");	
			waitUntilElementToBeClickable(lnk_verifyPerformance);
			log.info("Clicking lnk_verifyPerformance");
			click(lnk_verifyPerformance);
			log.info("Executed clickOnVerifyPerformance Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnVerifyPerformance Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void VerifyTheVerifyreviewPage() {
		try {
			log.info("Entered VerifyTheVerifyreviewPage");	
			assertEquals(lbl_verifyPerformance.getText(), "Performance Review", "Not in verify performance  page");
			log.info("Executed VerifyTheVerifyreviewPage Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyTheVerifyreviewPage Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnNext() {
		try {
			log.info("Entered clickOnNext");	
			waitUntilElementToBeClickable(btn_Next);
			log.info("Clicking btn_Next");
			click(btn_Next);
			log.info("Executed clickOnNext Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnNext Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnVerify() {
		try {
			log.info("Entered clickOnVerify");	
			waitUntilElementToBeClickable(btn_Verify);
			log.info("Clicking btn_Verify");
			click(btn_Verify);
			log.info("Executed clickOnVerify Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnVerify Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void EnterTheCooments(String verifyCooments) {
		try {
			log.info("Entered EnterTheCooments");
			log.info("Writing to txt_verifyComments: "+verifyCooments);
			writeText(txt_verifyComments, verifyCooments);
			log.info("Executed EnterTheCooments Successfully");
		} catch (Exception e) {
			log.error("Executed EnterTheCooments Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void clickOnVerifyConfirm() {
		try {
			log.info("Entered clickOnVerifyConfirm");	
			waitUntilElementToBeClickable(btn_ConfirmVerify);
			log.info("Clicking btn_ConfirmVerify");
			click(btn_ConfirmVerify);
			waitFor(3000);
			log.info("Executed clickOnVerifyConfirm Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnVerifyConfirm Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

}
