package pageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AppersialFeedbackPage extends BasePage {
	public AppersialFeedbackPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'Submit Appraisal Satisfaction Feedback')])[1]")
	private WebElement AppersialCard;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Appraisal Satisfaction')]")
	private WebElement appersialpage_lbl;

	@FindBy(how = How.XPATH, using = "(//i[contains(@class,'fas fa-star')])[3]")
	private WebElement Star_rating;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Comments')]/..//textarea")
	private WebElement Comment_txt;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Choose File')]/..//input")
	private WebElement Attachement_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit')]")
	private WebElement Submit_btn;

	// verify appersial feedback in veriy performance card

	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'Appraisal Satisfaction Feedback')])")
	private WebElement VerifyAppersial_label;

	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Comments')]/../p")
	private WebElement VerifyAppersialComment_text;

	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Please enter satisfaction rating with your manager.')]/..//ngb-rating")
	private WebElement VerifyAppersialstarrating;

	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Attachment(s)')]/..//p")
	private WebElement verifyAppersialAttachment;

	public void AppersialFeedbackWidget() {
		try {
			log.info("clicking on appraisal feedback widget!!");
			waitUntilElementVisible(AppersialCard);
			click(AppersialCard);
			log.info("clicked on appraisal feedback widget!!");
		} catch (Exception e) {
			log.error("error clicking on appraisal feedback widget!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void verifyAppersialPage() {
		try {
			log.info("verifying appraisal label!!");
			waitUntilElementVisible(appersialpage_lbl);
			assertTrue(appersialpage_lbl.getText().equalsIgnoreCase("Appraisal Satisfaction"),
					"since its not appersial page hence failing");
			log.info("verified appraisal label!!");
		} catch (Exception e) {
			log.error("error verifying appraisal label!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void VerifySubmitDisable() {
		try {
			log.info("verifying submit button is disabled!!");
			assertFalse(Submit_btn.isEnabled(), "Submit button is enabled");
			log.info("verified submit button is disabled!!");

		} catch (Exception e) {
			log.error("error verifying submit button is disabled!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnStarRating() {
		try {
			log.info("clicking on star rating!!");
			waitUntilElementToBeClickable(Star_rating);
			click(Star_rating);
			log.info("clicked on star rating!!");
		} catch (Exception e) {
			log.error("error clicking on star rating!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnSubmit() {
		try {
			log.info("clicking on submit!!");
			if (Submit_btn.isEnabled()) {
				waitUntilElementToBeClickable(Submit_btn);
				click(Submit_btn);
				log.info("clicked on submit!!");
			}
		} catch (Exception e) {
			log.error("error clicking on submit!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterTheComment() {
		try {
			log.info("entering the comments!!");
			waitUntilElementVisible(Comment_txt);
			writeText(Comment_txt, "Comment for the appersial");
			log.info("entered the comments!!");
		} catch (Exception e) {
			log.error("error entering the comments!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void AddAttachement() {
		try {
			log.info("adding attachment!!");
			File file = new File("src\\test\\resources\\Data\\Attach_review\\Alfahim Abdul_kpiUploadTemplate (1).xlsx");
			String attach = file.getAbsolutePath().replace("\\", "\\\\");
			waitFor(3000);
			Attachement_btn.sendKeys(attach);
			log.info("added attachment!!");

		} catch (Exception e) {
			log.error("error adding attachment!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyAppersialFeedbackInVerifier() {
		try {
			log.info("verifying appraisal feedback for verifier!!");
			ScrollUpToElement(VerifyAppersial_label);
			waitUntilElementVisible(VerifyAppersial_label);
			log.info("verified appraisal feedback for verifier!!");
		} catch (Exception e) {
			log.error("error verifying appraisal feedback for verifier!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyCommentsGivenByUser() {
		try {
			log.info("verifying comments given by user!!");
			waitUntilElementVisible(VerifyAppersialComment_text);
			assertEquals(VerifyAppersialComment_text.getText(), "Comment for the appersial",
					"Since comments are not same--> hence failed");
			log.info("verified comments given by user!!");

		} catch (Exception e) {
			log.error("error verifying comments given by user!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyAttachmentGivenByUser() {
		try {
			log.info("verifying user attachment");
			waitUntilElementVisible(verifyAppersialAttachment);
			assertEquals(verifyAppersialAttachment.getText(), "Alfahim Abdul_kpiUploadTemplate (1).xlsx",
					"Since Attachment are not same--> hence failed");
			log.info("verified user attachment");

		} catch (Exception e) {
			log.error("error verifying user attachment");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyStarRatingGivenByUser() {
		try {
			log.info("verifying star rating given by user!!");
			String text = VerifyAppersialstarrating.getAttribute("aria-valuetext");
			String[] star = text.split("out");
			System.out.println(star[0]);
			assertEquals(star[0].trim(), "3", "Since star are not same--> hence failed");
			log.info("verified star rating given by user!!");

		} catch (Exception e) {
			log.error("error verifying star rating given by user!!");
			e.printStackTrace();

			Assert.fail();
		}
	}
}
