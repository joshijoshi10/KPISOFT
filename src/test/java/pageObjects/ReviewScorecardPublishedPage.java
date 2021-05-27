package pageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.LoggerHelper;

public class ReviewScorecardPublishedPage extends BasePage 
{
	Logger log = LoggerHelper.getLogger(LoggerHelper.class);

	public ReviewScorecardPublishedPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),' View your published scorecard review')])[1]")
	private WebElement lnk_reviewscorecard;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Review Completed')] | //h5[contains(text(),'Review Published')]")
	private WebElement lbl_reviewscorecardPage;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Review Completed')] | //h5[contains(text(),'Review Published')]")
	private List<WebElement> lbl_reviewscorecardPageToVerify;

	@FindBy(how = How.XPATH, using = "//p[contains(@class,'text-truncate')]")
	private List<WebElement> txt_scorecardkpi;

	@FindBy(how = How.XPATH, using = "//h1[contains(@class,'ml-auto') and @style]")
	private WebElement txt_scorecardkpiOverallScore;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'score-pill ml-3')]")
	private List<WebElement> txt_scorecardkpiscore;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'View all')]")
	private WebElement verify_all_btn;

	@FindBy(how=How.XPATH,using="//h5[contains(text(),'Scorecard History')]")
	private List<WebElement> verify_ScorecardHistoryTab;


	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'Review Completed')]/ancestor::div)[last()-2]//h1[2] | (//h5[contains(text(),'Review Published')]/ancestor::div)[last()-2]//h1[2]")
	private WebElement lnk_sccore;

	//scrollandclick
	@FindBy(how=How.XPATH,using="//div[contains(@class,'infoCard')]/../../following-sibling::div[1]/h5")
	private List<WebElement> Count_of_cards;

	@FindBy(how=How.XPATH,using="//i[contains(@class,'fa fa-arrow-up')]")
	private WebElement scrollup_btn;


	public void clickOnReviewPublishedScorecard() {
		try{
			log.info("Entered clickOnReviewPublishedScorecard succesfully");

			waitUntilElementVisible(lnk_reviewscorecard);
			click(lnk_reviewscorecard);
			log.info("Executed clickOnReviewPublishedScorecard Successfully"); 
		} catch  (Exception e) {

			log.error("Not Executed clickOnReviewPublishedScorecard");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void ScrollAndClickOnReviewPublished()
	{
		try{
			log.info("Entered ScrollAndClickOnReviewPublished succesfully");

			scroll(webDriver, "down");
			waitFor(2000);
			scroll(webDriver, "down");
			int i=Count_of_cards.size();
			System.out.println(i);
			click(scrollup_btn);
			for(WebElement cards:Count_of_cards)
			{

				System.out.println(cards.getText());			
				if(cards.getText().equalsIgnoreCase("View your published scorecard review"))
				{

					click(cards);
					break;
				}

			}
			if(lbl_reviewscorecardPageToVerify.size()==1)
			{
				System.out.println("clicked on review published card");
			}
			else
			{
				throw new org.openqa.selenium.NoSuchElementException("Since review published card is not there henace failing");
			}


			log.info("Executed ScrollAndClickOnReviewPublished Successfully"); 
		} catch (Exception e) {

			log.error("Not Executed ScrollAndClickOnReviewPublished");
			e.printStackTrace(); 
			throw e;

		}
	}

	public void verifyTheReviewCompletedPage() {
		try{
			log.info("Entered verifyTheReviewCompletedPage succesfully");
			assertEquals(lbl_reviewscorecardPage.getText(), "Review Published", "Not in Review scorecard page");
			log.info("Executed verifyTheReviewCompletedPage Successfully"); 
		} catch  (Exception e) {

			log.error("Not Executed verifyTheReviewCompletedPage");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void verifyTheReviewPublishedPage() {
		try{
			log.info("Entered verifyTheReviewPublishedPage succesfully");
			assertEquals(lbl_reviewscorecardPage.getText(), "Review Published", "Not in Review scorecard page");
			log.info("Executed verifyTheReviewPublishedPage Successfully");
		} catch  (Exception e) {

			log.error("Not Executed verifyTheReviewPublishedPage");
			e.printStackTrace();
			throw e;
		}
	}

	public void VerifyTheKpi(String ExceptedKpiname, int i) {
		try{
			log.info("Entered VerifyTheKpi succesfully");
			ArrayList<String> actualKpinames = new ArrayList<String>();
			for (WebElement element:txt_scorecardkpi) {
				actualKpinames.add(element.getText().trim());
			}
			System.out.println(actualKpinames);
			assertTrue(actualKpinames.contains(ExceptedKpiname), ExceptedKpiname + " Kpi is not in " + actualKpinames);
			waitFor(3000);
			log.info("Executed VerifyTheKpi Successfully"); 
		} catch  (Exception e) {

			log.error("Not Executed VerifyTheKpi");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void VerifyTheKpiScore(String ExceptedKpiname, String soore) {
		try{
			log.info("Entered VerifyTheKpiScore succesfully");
			ArrayList<String> actualKpinames = new ArrayList<String>();
			for (WebElement element:txt_scorecardkpi) {
				actualKpinames.add(element.getText().trim());
			}
			ArrayList<String> actualKpiscores = new ArrayList<String>();
			for (WebElement element:txt_scorecardkpiscore) {
				actualKpiscores.add(element.getText().trim());
			}
			System.out.println(actualKpiscores);
			assertTrue(actualKpinames.contains(ExceptedKpiname), ExceptedKpiname + " Kpi is not in " + actualKpinames);
			assertTrue(actualKpiscores.get(actualKpinames.indexOf(ExceptedKpiname)).equals(soore),
					ExceptedKpiname + " kpi score expd: " + soore + ", actual: " + actualKpiscores.get(actualKpinames.indexOf(ExceptedKpiname)));
			log.info("Executed VerifyTheKpiScore Successfully");
		} catch  (Exception e) {

			log.error("Not Executed VerifyTheKpiScore");
			e.printStackTrace();
			throw e;
		}
	}

	public void VerifyTheKpiScoreColor(String ExceptedKpiname, String sooreColor) {
		try{
			log.info("Entered VerifyTheKpiScore succesfully");
			ArrayList<String> actualKpinames = new ArrayList<String>();
			for (WebElement element:txt_scorecardkpi) {
				actualKpinames.add(element.getText().trim());
			}
			ArrayList<String> actualKpiscorecolors = new ArrayList<String>();
			for (WebElement element:txt_scorecardkpiscore) {
				actualKpiscorecolors.add(element.getCssValue("background"));
			}
			System.out.println(actualKpiscorecolors);
			assertTrue(actualKpinames.contains(ExceptedKpiname), ExceptedKpiname + " Kpi is not in " + actualKpinames);
			assertTrue(actualKpiscorecolors.get(actualKpinames.indexOf(ExceptedKpiname)).contains(sooreColor),
					ExceptedKpiname + " kpi score color expd: " + sooreColor + ", actual: " + actualKpiscorecolors.get(actualKpinames.indexOf(ExceptedKpiname)));
			log.info("Executed VerifyTheKpiScore Successfully");
		} catch  (Exception e) {

			log.error("Not Executed VerifyTheKpiScore");
			e.printStackTrace();
			throw e;
		}
	}


	public void VerifyTheKpiOverallScore(String soore) {
		try{
			log.info("Entered VerifyTheKpiOverallScore succesfully");
			System.out.println(txt_scorecardkpiOverallScore.getText());
			assertEquals(txt_scorecardkpiOverallScore.getText(), soore, "Overall score mismatch");
			log.info("Executed VerifyTheKpiOverallScore Successfully");
		} catch  (Exception e) {

			log.error("Not Executed VerifyTheKpiOverallScore");
			e.printStackTrace();
			throw e;
		}
	}

	public void verifyTheDecimalInScore()
	{
		try{
			log.info("Entered verifyTheDecimalInScore succesfully");
			waitUntilElementVisible(lnk_sccore);
			System.out.println(lnk_sccore.getText());
			String[] score=lnk_sccore.getText().trim().split("\\.");
			//	System.out.println(score[0]+  score[0].length());
			assertTrue(score[1].length()==5, "not showing the display preferneces as 5 --> hence failing");
			log.info("Executed verifyTheDecimalInScore Successfully"); 
		} catch (Exception e) {

			log.error("Not Executed verifyTheDecimalInScore");
			e.printStackTrace(); 
			throw e;
		}
	}
	public void clickOnViewAll()
	{
		try{
			log.info("Entered clickOnViewAll succesfully");
			waitUntilElementToBeClickable(verify_all_btn);
			click(verify_all_btn);
			log.info("Executed clickOnViewAll Successfully"); 
		} catch  (Exception e) {

			log.error("Not Executed clickOnViewAll");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void VerifyTheScorecardHistoryData(String comments, int i)
	{
		try{
			log.info("Entered VerifyTheScorecardHistoryData succesfully");


			List<WebElement> verify_comments_txt=webDriver.findElements(By.xpath("//scorecard-history-view-all//div[contains(@class,'comments')]/p"));
			waitFor(3000);
			System.out.println(verify_comments_txt.get(i-1).getText());
			assertEquals(verify_comments_txt.get(i-1).getText(), comments, "Scorecard histor is failing. Expected: " + comments
					+ ", Actual: " + verify_comments_txt.get(i-1).getText());

			log.info("Executed VerifyTheScorecardHistoryData Successfully"); 
		} catch  (Exception e) {


			log.error("Not Executed VerifyTheScorecardHistoryData");
			e.printStackTrace(); 
			throw e;
		}
	}
	public void VerifyTheScorecardHistoryTab()
	{
		try{
			log.info("Entered VerifyTheScorecardHistoryTab succesfully");
			assertTrue(verify_ScorecardHistoryTab.size()==0, "After disbaled also scorecare history is coming");


			log.info("Executed VerifyTheScorecardHistoryTab Successfully"); 
		} catch  (Exception e) {

			log.error("Not Executed VerifyTheScorecardHistoryTab");
			e.printStackTrace(); 
			throw e;
		}
	}


}
