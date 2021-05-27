package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VerifyTheirScorecardPage extends BasePage {

	public VerifyTheirScorecardPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Verify all')]/..")
	private WebElement verifyAll_btn;

	@FindBy(how = How.ID, using = "float-input")
	private WebElement verifycomment_txt;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Send Back All')]")
	private WebElement sendBackAll_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok, Confirm')]")
	private WebElement okConfirm_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'OK, Confirm')]")
	private WebElement okConfirmverify_btn;

	@FindBy(how = How.XPATH, using = "//reject-confirmation/div/button[contains(text(),'Send Back')]")
	private WebElement rejectConfirmSendBack_btn;

	@FindBy(how = How.XPATH, using = "//h5[text()='Verify Scorecard']/i")
	private WebElement downloadScorecard_btn;

	@FindBy(how = How.XPATH, using = "//span[text()='Download as PDF']/parent::button")
	private WebElement downloadAsPDF_btn;

	@FindBy(how = How.XPATH, using = "//span[text()='Download as Excel']/parent::button")
	private WebElement downloadAsExcel_btn;


	public void clickOnVerifyAll() {
		try {
			waitUntilElementToBeClickable(verifyAll_btn);
			click(verifyAll_btn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getVerifyComment(String verifyComment) {
		try {
			waitUntilElementToBeClickable(verifycomment_txt);
			writeText(verifycomment_txt, verifyComment);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnOkConfirm() {
		try {
			waitUntilElementToBeClickable(okConfirm_btn);
			click(okConfirm_btn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void clickOnOkConfirmforVerify() {
		try {
			waitUntilElementToBeClickable(okConfirmverify_btn);
			click(okConfirmverify_btn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnDownloadButton() {
		try {
			click(downloadScorecard_btn);
			waitFor(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnDownloadAsPDFBtn() {
		try {
			click(downloadAsPDF_btn);
			waitFor(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnDownloadAsExcelBtn() {
		try {
			click(downloadAsExcel_btn);
			waitFor(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPDFFileDownloaded() {
		try {
			Assert.assertTrue(getDownloadedFileName().toLowerCase().endsWith("pdf"),
					"Downloaded file not pdf hence >>> Failed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyExcelFileDownloaded() {
		try {
			Assert.assertTrue(
					getDownloadedFileName().toLowerCase().endsWith("xls")
							|| getDownloadedFileName().toLowerCase().endsWith("xlsx"),
					"Downloaded file not xls/xlsx hence >>> Failed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getSendBackAllButton() {
		try{
			log.info("Entered getSendBackAllButton succesfully");
			waitUntilElementToBeClickable(sendBackAll_btn);
			click(sendBackAll_btn);
			log.info("Executed getSendBackAllButton Successfully");
		} catch  (Exception e) {

			log.error("Not Executed getSendBackAllButton");
			e.printStackTrace();
			throw e;
		}
	}


	public void getSendBackComment(String rejectComm) {
		try{
			log.info("Entered getSendBackComment succesfully");
			// waitUntilElementToBeClickable(Comment_txt);
			waitFor(3000);
			writeText(verifycomment_txt, rejectComm);
			log.info("Executed getSendBackComment Successfully");
		} catch  (Exception e) {

			log.error("Not Executed getSendBackComment");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnSendBackButton() {
		try{
			log.info("Entered clickOnSendBackButton succesfully");
			waitFor(2000);
			click(rejectConfirmSendBack_btn);
			waitFor(2000);
			log.info("Executed clickOnSendBackButton Successfully");
		} catch  (Exception e) {

			log.error("Not Executed clickOnSendBackButton");
			e.printStackTrace();
			throw e;
		}
	}
}
