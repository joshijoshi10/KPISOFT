package pageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ApproveReviewPage extends BasePage {
	public ApproveReviewPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Review') or contains(text(),'Verify Performance')]/..")
	private WebElement lnk_approveWidget;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Approve Review')]")
	private WebElement lbl_approveReview;

	@FindBy(how = How.XPATH, using = "//div[@class='w-100 text-truncate']")
	private List<WebElement> scrollToKpi;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Send Back')]")
	private WebElement btn_sendback;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Approve')]")
	private WebElement btn_approve;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement btn_Next;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Comment')]/../textarea")
	private WebElement txt_SupComment;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'OK, Confirm')]")
	private WebElement btn_Confirm;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Approve Review') or contains(text(),'Performance Review')]/following-sibling::i | //h5[contains(text(),'Approve Scorecard')]/i")
	private WebElement downloadScorecard_btn;

	@FindBy(how = How.XPATH, using = "//span[text()='Download as PDF']/parent::button")
	private WebElement downloadAsPDF_btn;

	@FindBy(how = How.XPATH, using = "//span[text()='Download as Excel']/parent::button")
	private WebElement downloadAsExcel_btn;

	// Performance review
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'performance review comments')]")
	private WebElement lnk_performanceReview;

	@FindBy(how = How.XPATH, using = "//textarea")
	private List<WebElement> performanceReviewComments;

	@FindBy(how = How.XPATH, using = "//h5[.='Scorecard']")
	private WebElement scorecardTab;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Things to do')]/..")
	private WebElement Things_to_do;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ask Review')]")
	private WebElement btn_KpiReview;

	// Askreview
	@FindBy(how = How.XPATH, using = "(//img[@class='w-50 c-p'])[1]")
	private WebElement Star_smbl;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Reviews')]")
	private WebElement btn_Reviews;

	String lnk_sup_comm = "(//small[contains(text(),'Supervisor actual / Comments')])";
	
	@FindBy(how = How.XPATH, using = "//small[contains(text(),'Review Label')]/../p")
	private WebElement lbl_reviewname;

	public void clickOnApproveWidget() {
		try {
			log.info("clicking on approve widget!!!");
			waitUntilElementToBeClickable(lnk_approveWidget);
			click(lnk_approveWidget);
			log.info("clicked on approve widget!!!");
		} catch (Exception e) {
			log.error("error clicking on approve widget!!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyApproveReview() {
		try {
			log.info("verifying approve review label!!");
			assertEquals(lbl_approveReview.getText(), "Approve Review", "Not in approve review page");
			log.info("verified approve review label!!");
		} catch (Exception e) {
			log.error("error clicking on approve widget!!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterSupervisorActual(int i, String Supactual, String SupComments) {
		try {
			
			ScrollUpToElement(scrollToKpi.get(i - 1));
			WebElement lbl_SupCommentsActaul = webDriver.findElement(By.xpath(lnk_sup_comm + "[" + i + "]"));
			waitUntilElementToBeClickable(lbl_SupCommentsActaul);
			log.info("clicking on supervisor comments actual");
			click(lbl_SupCommentsActaul);
			log.info("clicked on supervisor comments actual");
			waitFor(2000);
			WebElement SupervisorActual = webDriver
					.findElement(By.xpath("//label[contains(text(),'Enter Actual')]/../input"));
			if (i == 8 || i == 9) {

				ScrollUpToElement(SupervisorActual);
			}
			waitFor(2000);
			click(SupervisorActual);
			log.info("entering supervisor actuals!!");
			writeText(SupervisorActual, Supactual);
			log.info("entered supervisor actuals!!");
			WebElement SupervisorComment = webDriver
					.findElement(By.xpath("//label[contains(text(),'Supervisor comments')]/../textarea"));
			waitFor(3000);
			log.info("clicking on supervisor comments");
			click(SupervisorComment);
			log.info("clicked on supervisor comments");
			writeText(SupervisorComment, SupComments);
			if (i <= 5) {
				log.info("entering quality rating");
				WebElement quailty = webDriver.findElement(By.xpath("//select[@id='qualityRating']"));
				setValueInDropdownByIndex(quailty, i);
				log.info("entered quality rating");
			}
			WebElement save = webDriver.findElement(By.xpath("//button[contains(text(),'Save')]"));
			click(save);
			waitFor(3000);
			ScrollUpToElement(btn_KpiReview);
		} catch (Exception e) {
			log.error("enterSupervisorActual failed");
			e.printStackTrace();
		}

	}

	public void clickOnNext() {
		try {
			log.info("clicking on next!!");
			waitUntilElementToBeClickable(btn_Next);
			click(btn_Next);
			log.info("clicked on next!!");
		} catch (Exception e) {
			log.error("error clicking on next!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnSendBack() {
		try {
			log.info("clicking on send back!!");
			waitUntilElementToBeClickable(btn_sendback);
			click(btn_sendback);
			log.info("clicked on send back!!");
		} catch (Exception e) {
			log.info("error clicking on send back!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnApprove() {
		try {
			log.info("clicking on approve!!");
			waitUntilElementToBeClickable(btn_approve);
			click(btn_approve);
			waitFor(3000);
			log.info("clicked on approve!!");
		} catch (Exception e) {
			log.error("error clicking on approve!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void verifyPerformanceReviewTab() {
		try {
			log.info("verifying Performance Review Tab");
			assertEquals(lnk_performanceReview.getText(), "Supervisor's performance review comments",
					"In program admin selected no one can review");
			log.info("verified Performance Review Tab");
		} catch (Exception e) {
			log.error("error verifying Performance Review Tab");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterPerformanceReviewComments() {
		try {
			log.info("entering performance review comments!!");
			for (int i = 1; i < 4; i++) {
				writeText(performanceReviewComments.get(i), "performancereviewComments");
			}
			log.info("entered performance review comments!!");
		} catch (Exception e) {
			log.error("error entering performance review comments!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnScorecardTab() {
		try {
			log.info("clicking on score card tab!!");
			waitUntilElementToBeClickable(scorecardTab);
			click(scorecardTab);
			log.info("clicked on score card tab!!");
		} catch (Exception e) {
			log.error("error clicking on score card tab!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnThingsToDo() {
		try {
			log.info("clicking on things to do!!");
			click(Things_to_do);
			log.info("clicked on things to do!!");
		} catch (Exception e) {
			log.error("error clicking on things to do!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnKpiReview() {
		try {
			log.info("clicking on kpi review ");
			waitUntilElementToBeClickable(btn_KpiReview);
			click(btn_KpiReview);
			waitFor(3000);
			WebElement checkboxForKpiReview = webDriver.findElement(By.xpath("(//input[@type='checkbox'])[1]/../.."));
			waitUntilElementToBeClickable(checkboxForKpiReview);
			click(checkboxForKpiReview);
			log.info("clicked on kpi review ");
		} catch (Exception e) {
			log.error("error clicking on kpi review ");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void selectReviewer(String reviewer) {
		try {
			log.info("selecting reviewer!!");
			WebElement selectReviewer = webDriver
					.findElement(By.xpath("//button[contains(text(),'Choose Reviewers')]"));
			waitUntilElementToBeClickable(selectReviewer);
			click(selectReviewer);
			WebElement searchForReviewesr = webDriver.findElement(By.xpath("(//input[@name='searchKey'])[2]"));
			String[] reviewname = reviewer.split("");
			for (int i = 0; i < reviewname.length; i++) {
				searchForReviewesr.sendKeys(reviewname[i]);
				waitFor(3000);
			}
			WebElement checkbox = webDriver.findElement(By.xpath("(//input[@type='checkbox'])[1]/../.."));
			waitUntilElementVisible(checkbox);
			click(checkbox);
			log.info("selected reviewer!!");
		} catch (Exception e) {
			log.info("error selecting reviewer!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void clickOnSend() {
		try {
			log.info("clicking on send!");
			WebElement SendKpiReview = webDriver.findElement(By.xpath("//button[contains(text(),'Send') and not(contains(text(),'Back'))]"));
			waitUntilElementToBeClickable(SendKpiReview);
			click(SendKpiReview);
			waitFor(3000);
			log.info("clicked on send!");
		} catch (Exception e) {
			log.error("error clicking on send!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnStarSymbol() {
		try {
			log.info("clicking on star label!!");
			waitUntilElementToBeClickable(Star_smbl);
			click(Star_smbl);
			log.info("clicked on star label!!");
		} catch (Exception e) {
			log.error("error clicking on star label!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnReviews() {
		try {
			log.info("clicking on reviews!!");
			waitUntilElementToBeClickable(btn_Reviews);
			click(btn_Reviews);
			log.info("clicked on reviews!!");
		} catch (Exception e) {
			log.error("error clicking on reviews!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void VerifyRating() {
		try {
			log.info("verifying rating!!");
			WebElement verfiyactaul = webDriver.findElement(By.xpath("//p[contains(text(),'Actual:')]/../p/b"));
			assertEquals(verfiyactaul.getText(), "20", "review is not given");
			WebElement close = webDriver.findElement(By.xpath("//button[contains(text(),'Close')]"));
			waitUntilElementToBeClickable(close);
			click(close);
			log.info("verified rating!!");

		} catch (Exception e) {
			log.error("error verifying rating!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterFinalSupervisorComment() {
		try {
			log.info("entering final supervisor comments");
			writeText(txt_SupComment, "final supervisor comment in approve review");
			log.info("entered final supervisor comments");

		} catch (Exception e) {
			log.error("error entering final supervisor comments!!");
			e.printStackTrace();
			Assert.fail();
		}
		
	}

	public void clickOnOkConfirm() {
		try {
			log.info("clicking on ok confirm");
			waitUntilElementToBeClickable(btn_Confirm);
			click(btn_Confirm);
			waitFor(3000);
			log.info("clicked on ok confirm");
		} catch (Exception e) {
			log.error("error clicking on ok confirm");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnDownloadButton() {
		try {
			// WebElement
			// downloadScorecard_btn=webDriver.findElement(By.xpath("//h5[contains(text(),'Approve
			// Review') or contains(text(),'Performance Review')]/following-sibling::i"));
			log.info(" clicking on download scorecard button!!");
			click(downloadScorecard_btn);
			waitFor(3000);
			log.info(" clicked on download scorecard button!!");
		} catch (Exception e) {
			log.error("error clicking on download scorecard button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnDownloadAsPDFBtn() {
		try {
			log.info("clicking on download as pdf button!!");
			click(downloadAsPDF_btn);
			waitFor(6000);
			log.info("clicking on download as pdf button!!");
		} catch (Exception e) {
			log.error("error clicking on download as pdf button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnDownloadAsExcelBtn() {
		try {
			log.info("clicking on download as excel button!!");
			click(downloadAsExcel_btn);
			waitFor(6000);
			log.info("clicked on download as excel button!!");
		} catch (Exception e) {
			log.error("error clicking on download as excel button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyPDFFileDownloaded() {
		try {
			log.info("verifying PDF File Downloaded");
			Assert.assertTrue(getDownloadedFileName().toLowerCase().endsWith("pdf"),
					"Downloaded file not pdf hence >>> Failed");
			log.info("verified PDF File Downloaded");
		} catch (Exception e) {
			log.error("error verifying PDF File Downloaded");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyExcelFileDownloaded() {
		try {
			log.info("verifying Excel File Downloaded");
			Assert.assertTrue(
					getDownloadedFileName().toLowerCase().endsWith("xls")
							|| getDownloadedFileName().toLowerCase().endsWith("xlsx"),
					"Downloaded file not xls/xlsx hence >>> Failed");
			log.info("verified Excel File Downloaded");
		} catch (Exception e) {
			log.error("error verifying Excel File Downloaded");
			e.printStackTrace();
			Assert.fail();
		}
	}
	public void verifyReviewLabel() {
		try {
			log.info("verifying verifyReviewLabel");
			assertEquals(lbl_reviewname.getText(), "finalreview_label", "review label is not matching hence failed");
			log.info("verified verifyReviewLabel");
		} catch (Exception e) {
			log.error("error verifying verifyReviewLabel");
			e.printStackTrace();
			Assert.fail();
		}
	}


}
