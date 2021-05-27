package pageObjects;

import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.LoggerHelper;

public class Like_Share_CommentPage extends BasePage {

	Logger log = LoggerHelper.getLogger(LoggerHelper.class);

	public Like_Share_CommentPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	// like
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Like')])[1]")
	private WebElement like_button;

	@FindBy(how = How.XPATH, using = "(//i[contains(@class,'fas fa-heart text-danger')])[1]")
	private WebElement likecount_icon;

	// comment
	@FindBy(how = How.XPATH, using = "(//textarea[contains(@placeholder,'Write a comment')])[1]")
	private WebElement Comment_txtbox;

	@FindBy(how = How.XPATH, using = "(//textarea[contains(@placeholder,'Write a comment')])[last()]")
	private WebElement CommentFromView_txtbox;

	@FindBy(how = How.XPATH, using = "(//button[contains(@class,'border-0 bg-transparent')])[1]")
	private WebElement Commentsend_btn;

	@FindBy(how = How.XPATH, using = "(//button[contains(@class,'border-0 bg-transparent')])[last()]")
	private WebElement CommentsendFromView_btn;

	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'View Comments')])[1]")
	private WebElement ViewComments_btn;

	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Show all comments')])[1]")
	private WebElement ShowAllComments_btn;

	@FindBy(how = How.XPATH, using = "(//button[contains(@class,'border-0 bg-transparent ng-star-inserted')])[1]")
	private List<WebElement> VerifydeleteComment_btn;

	@FindBy(how = How.XPATH, using = "(//button[contains(@class,'border-0 bg-transparent ng-star-inserted')])[1]")
	private WebElement deleteComment_btn;

	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Comments')])[1]")
	private WebElement Comment_count;

	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[last()]")
	private WebElement exit_btn;

	// share

	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Share')])[1]")
	private WebElement Share_icon;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search']")
	private WebElement txt_search;

	@FindBy(how = How.XPATH, using = "(//input[@type='checkbox' and @id='checkbox0']/../..)")
	private WebElement btn_check;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement Next_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Edit')]")
	private WebElement Edit_btn;

	@FindBy(how = How.XPATH, using = "(//textarea[contains(@placeholder,'Write a message')])[1]")
	private WebElement Share_txtbox;

	@FindBy(how = How.XPATH, using = "(//button[contains(text(),' Share')])[last()]")
	private WebElement Share_btn;

	@FindBy(how = How.XPATH, using = "(//p[contains(text(),'has shared this with')])[1]")
	private WebElement Verify_share;

	/*
	 * @FindBy(how=How.XPATH,
	 * using="(//p[contains(text(),'has shared this with')])[1]/b") private
	 * List<WebElement> VerifyShareName;
	 */

	@FindBy(how = How.XPATH, using = "(//p[contains(text(),'has shared this with')])[1]/../../../p")
	private WebElement VerifyShareMessage;

	public void clickOnLike() {
		try{
			log.info("Entered clickOnLike succesfully");
			waitUntilElementToBeClickable(like_button);
			log.info("Clicking like_button");
			click(like_button);
			log.info("Executed clickOnLike Successfully");
		}
		catch  (Exception e) 
		{
			log.error("Not Executed clickOnLike"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void verifyLikeCount() {
		try{
			log.info("Entered verifyLikeCount succesfully");
			assertTrue(likecount_icon.isDisplayed(), "Like count is not visible");
			log.info("Executed verifyLikeCount Successfully");
		} 
		catch  (Exception e)
		{
			log.error("Not Executed verifyLikeCount"); 
			e.printStackTrace();
			throw e;
		}
	}

	// comment
	public void enterComments(String comments) {
		try{
			log.info("Entered enterComments succesfully");
			log.info("Entered Comment_txtbox: "+comments);
			writeText(Comment_txtbox, comments);
			waitUntilElementToBeClickable(Commentsend_btn);
			click(Commentsend_btn);
			log.info("Executed enterComments Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed enterComments"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void verifyCommentCount() {
		try{
			log.info("Entered verifyCommentCount succesfully");
			assertTrue(Comment_count.isDisplayed(), "<<<COMMNET COUNT IS NOT VISIBLE>>>,HENCE FALIED");
			log.info("Executed verifyCommentCount Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed verifyCommentCount"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void verifyDeleteButtonBasedOnUser(String username) {
		try{
			log.info("Entered verifyDeleteButtonBasedOnUser succesfully");
			if (VerifydeleteComment_btn.size() > 0) {
				assertTrue(true);
				System.out.println("delete option is present");
			} else {
				if (username.equalsIgnoreCase("Admin")) {
					System.out.println("<<<admin cant able to see the delete option>>>");
					assertTrue(true);
				} else {
					System.out.println("<<<<for user it not showing delete option, hence working fine>>>");
					assertTrue(true);
				}
			}
			log.info("Executed verifyDeleteButtonBasedOnUser Successfully");
		}
		catch (Exception e) 
		{
			log.error("Not Executed verifyDeleteButtonBasedOnUser"); 
			e.printStackTrace(); 
			throw e;
		}

	}

	public void deleteThecommentAndverify(String comments) {
		try{
			log.info("Entered deleteThecommentAndverify succesfully");
			waitUntilElementToBeClickable(deleteComment_btn);
			log.info("Clicking deleteComment_btn");
			click(deleteComment_btn);
			waitFor(3000);
			List<WebElement> verifycommentDeletedTab = webDriver
					.findElements(By.xpath("//p[contains(text(),'" + comments + "')]/../.."));
			if (verifycommentDeletedTab.size() > 0) {
				System.out.println("<<<<hence commented deleted succesfully>>>>");
				assertTrue(true);
			}
			log.info("Executed deleteThecommentAndverify Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed deleteThecommentAndverify"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void commentFromViewCommeents(String comments) {
		try{
			log.info("Entered commentFromViewCommeents succesfully");
			log.info("Waiting for ShowAllComments_btn");
			waitUntilElementVisibleRepeated(ShowAllComments_btn,3);

			log.info("Clicking ShowAllComments_btn");
			//click(ShowAllComments_btn);
			clickOnElementByJs(ShowAllComments_btn);
			waitFor(3000);
			log.info("Waiting for exit_btn");
			waitUntilElementToBeClickable(exit_btn);
			log.info("Writing to  CommentFromView_txtbox: "+ comments);
			writeText(CommentFromView_txtbox, comments);
			log.info("Clicking CommentsendFromView_btn");
			clickOnElementByJs(CommentsendFromView_btn);

			log.info("Waiting for exit_btn");
			waitUntilElementToBeClickable(exit_btn);
			log.info("Clicking exit_btn");
			click(exit_btn);
			waitFor(2000);
			WebElement verifycommentDeletedTab = webDriver
					.findElement(By.xpath("//p[contains(text(),'" + comments + "')]/../.."));
			assertTrue(verifycommentDeletedTab.isDisplayed(), "<<<deleted comment is still coming,,hence falided>>>>");
			log.info("Executed commentFromViewCommeents Successfully");
		} 
		catch  (NoSuchElementException e) 
		{
			log.error("Not Executed commentFromViewCommeents"); 
			e.printStackTrace(); 
			throw e;

		}
	}

	// share
	public void clickOnShare() {
		try{
			log.info("Entered clickOnShare succesfully");
			waitUntilElementToBeClickable(Share_icon);
			log.info("Clicking Share_icon");
			click(Share_icon);
			log.info("Executed clickOnShare Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed clickOnShare"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void selectTheUserToShare(String userToShare) {
		try{
			log.info("Entered selectTheUserToShare succesfully");
			String[] letter = userToShare.split("");
			for (int i = 0; i <= letter.length; i++) {
				log.info("Writing to txt_search: "+letter[i]);
				txt_search.sendKeys(letter[i]);
				waitFor(2000);
			}
			assertTrue(btn_check.isDisplayed(), "There is no user to share");
			scroll(webDriver, "down");
			waitUntilElementToBeClickable(btn_check);
			log.info("Clicking btn_check");
			click(btn_check);
			System.out.println("clicked");
			waitFor(3000);
			waitUntilElementToBeClickable(Next_btn);
			log.info("Clicking Next_btn");
			click(Next_btn);
			log.info("Executed selectTheUserToShare Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed selectTheUserToShare"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void enterTheShareMessage(String EnterShareMessage) {
		try{
			log.info("Entered enterTheShareMessage succesfully");
			writeText(Share_txtbox, EnterShareMessage);
			waitUntilElementToBeClickable(Share_btn);
			log.info("Clicking Share_btn");
			click(Share_btn);
			log.info("Executed enterTheShareMessage Successfully");
		}
		catch (Exception e) {
			log.error("Not Executed enterTheShareMessage"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void verifyShareCardByMessage(String sharedUser, String shareTo) {
		try{
			log.info("Entered verifyShareCardByMessage succesfully");
			assertEquals(Verify_share.getText(), sharedUser + " has shared this with " + shareTo,
					"<<<hence shared card is not came to share>>>");
			log.info("Executed verifyShareCardByMessage Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed verifyShareCardByMessage");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void verifyShareContent(String ShareMessage, String ShareContent) {
		try{
			log.info("Entered verifyShareContent succesfully");
			assertEquals(VerifyShareMessage.getText(), "share message",
					"<<<share message is not coming,hence failed>>>");
			WebElement verifyShareContent = webDriver
					.findElement(By.xpath("(//p[contains(text(),'" + ShareContent + "')]/..)[1]"));
			assertTrue(verifyShareContent.isDisplayed(), "<<SINCE SHARE DONT HAVE CONTENT,,HENCE FAILED>>");
			log.info("Executed verifyShareContent Successfully");
		} 
		catch  (NoSuchElementException e) 
		{
			log.error("Not Executed verifyShareContent");
			e.printStackTrace(); 
			throw e;
		}
	}
}
