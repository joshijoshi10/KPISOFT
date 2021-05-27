package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class SwitchUserPage extends BasePage {

	public SwitchUserPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	//Switch user

	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	private WebElement logout_btn1;
	
	@FindBy(how = How.XPATH, using = "//input[@name ='searchTeam']")
    private WebElement switchusertoo;
	
	@FindBy(how = How.ID,using ="profile")
	public WebElement drpDwnMenuButton;

	@FindBy(how = How.NAME, using = "searchTeam")
	public WebElement searchForUser;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Switch User')]")
	private WebElement switchuserlnk;

	//@FindBy(how = How.XPATH, using = "(//div[@class='media-body text-truncate'])[last()]")
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'EMP12 (EMP12)') or contains(text(),'AutoEmp10 (AutoEmp10)')]")
	private WebElement user_name;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	private WebElement switchuserbtn;

	@FindBy(how = How.CSS, using = ".plServiceItemsList-listViewPort div ul li")
	private WebElement selectSearchUser;

	@FindBy(how = How.XPATH, using = " //a[contains(text(),'Back to me')]")
	private WebElement backtomelnk;

	//Back to me
	public void SelectUserFromDropdown(String user) {
		try {
			log.info("Entered select user successfully");	
			waitFor(2000);
			//			List<WebElement> liUser = webDriver.findElements(By.cssSelector(".plServiceItemsList-listViewPort div ul li"));
			//			for(WebElement liUser1 : liUser ) {
			//				if(liUser1.getText().trim().equals(user)) {
			//					liUser1.click();
			//				}
			//			}
//			waitUntilElementToBeClickable(selectSearchUser);
			selectSearchUser.click();
			log.info("Executed select user successfully");
//			waitFor(1000);
		} catch (Exception e) {
			log.error("Executed switch user not successfully");
			e.printStackTrace();
			throw e;	
		}	}
	public void SearchForUser(String user) {
		try {
			log.info("Entered switch user successfully");	
//			waitFor(3000);
//			waitUntilElementToBeClickable(searchForUser);
			searchForUser.sendKeys(user);
			waitFor(3000);
			log.info("Executed switch user successfully");
		} catch (Exception e) {
			log.error("Executed switch user not successfully");
			e.printStackTrace();
			throw e;		
		}
	}

	public void clickprofilebanner() 
	{
		try {
			log.info("Entered clickprofilebanner successfully");	
//			waitFor(500);
			waitUntilElementToBeClickable(drpDwnMenuButton);
			doHover(drpDwnMenuButton);
			click(drpDwnMenuButton);
			log.info("Executed clickprofilebanner successfully");
		}catch (Exception e) {
			log.error("Executed clickprofilebanner not successfully");
			e.printStackTrace();
			throw e;
		}
	}
	//Validation switch user

	public void validateswitchuser() 
	{
		waitFor(3000);
		Assert.assertTrue(switchuserlnk.isDisplayed(), "Switch User acccess is not there");
	}
	public void clickSwitchUser()
	{		
		try {
			log.info("Entered clickprofilebanner successfully");	
			waitFor(2000);
			waitUntilElementToBeClickable(switchuserlnk);
			switchuserlnk.click();
		}catch (Exception e) {
			log.error("Executed clickprofilebanner not successfully");
			e.printStackTrace();
			throw e;
		}
	}
//	public void clickuser(String string){

//		ScrollUpToElement(user_name);
//		waitUntilElementToBeClickable(user_name);
//		user_name.click();
//	}
	public void clickuser(String user){
	    	switchusertoo.sendKeys(user);
	    	waitUntilElementVisible(user_name);
	    	waitUntilElementToBeClickable(user_name);
	    	waitFor(5000);
//	    	Actions as = new Actions(webDriver);
//	    	as.moveToElement(user_name).click().build().perform();
	    	Reporter.log("User switched", true);
	    	user_name.click();
	    	}

	public void clickswitchuser()
	{
		try {

			log.info("Entered clickprofilebanner successfully");	
			waitFor(2000);
			waitUntilElementToBeClickable(switchuserbtn);
			switchuserbtn.click();
			waitFor(2000);
		}catch (Exception e) {
			log.error("Executed clickprofilebanner not successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void clickprofilesym()
	{

		waitUntilElementToBeClickable(drpDwnMenuButton);
		click(drpDwnMenuButton);

	}

	public void clickbcktome(){
		waitUntilElementToBeClickable(backtomelnk);
		backtomelnk.click();
		waitFor(3000);

	}

	public void logOut() {
		try {
			log.info("Entered Logout");
			log.info("Clicking drpDwnMenuButton");
			waitUntilElementToBeClickable(drpDwnMenuButton);
			doHover(drpDwnMenuButton);
			click(drpDwnMenuButton);
			log.info("Clicking Logout");
			waitUntilElementToBeClickable(logout_btn1);
			click(logout_btn1);
			log.info("Executed Logout Successfully");
		} catch (Exception e) {
			log.error("Executed Logout Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

}
