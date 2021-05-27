package pageObjects;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AskKpiReviewPage extends BasePage {
	public AskKpiReviewPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Review KPI')]")
	private WebElement lnk_ReviewKpi;

	@FindBy(how = How.XPATH, using = "(//i[@class='fas fa-star'])[3]")
	private WebElement StarRatingForKpi;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Enter Actual')]/../input")
	private WebElement txt_EnterActaul;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Comments')]/..//textarea")
	private WebElement txt_Comments;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save')]")
	private WebElement btn_Save;

	public void verifyReviewWidget() {
		try {
			log.info("verifying review widget!!");
			assertTrue(lnk_ReviewKpi.isDisplayed(), "kpi review is not working hence failed>>>");
			log.info("verified review widget!!");
		} catch (Exception e) {
			log.error("error verifying review widget!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnReviewKpi() {
		try {
			log.info("clicking on review kpi!!");
			waitUntilElementToBeClickable(lnk_ReviewKpi);
			click(lnk_ReviewKpi);
			log.info("clicked on review kpi!!");
		} catch (Exception e) {
			log.error("error clicking on review kpi!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterStarRating() {
		try {
			log.info("entering star rating!!");
			waitUntilElementToBeClickable(StarRatingForKpi);
			click(StarRatingForKpi);
			log.info("entered star rating!!");
		} catch (Exception e) {
			log.error("error entering star rating!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterReviewActual(String reviewActual) {
		try {
			log.info("entering review actual!!");
			writeText(txt_EnterActaul, reviewActual);
			log.info("entered review actual!!");
		} catch (Exception e) {
			log.error("error entering review actual!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterReviewComments(String reviewComments) {
		
		try {
			log.info("entering review comments as "+ reviewComments);
			writeText(txt_Comments, reviewComments);
			log.info("entered review comments as "+ reviewComments);
		} catch (Exception e) {
			log.error("error entering review comments as "+ reviewComments);
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnSave() {
		try {
			log.info("clicking on save!!");
			waitUntilElementToBeClickable(btn_Save);
			click(btn_Save);
			waitFor(3000);
			log.info("clicked on save!!");
		} catch (Exception e) {
			log.error("error clicking on save!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

}
