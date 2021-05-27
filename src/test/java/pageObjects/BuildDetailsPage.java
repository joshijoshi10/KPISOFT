package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BuildDetailsPage extends BasePage {

	public BuildDetailsPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
		
	
	@FindBy(how=How.XPATH, using="//a[text()='Build details ']")
	private WebElement buildDetails_lnk;
	
	@FindBy(how=How.XPATH, using="//div[@class='col-lg-3 col-md-6 col-sm-6 col-3 float-left']//h6")
	private WebElement uiBuildNumber;
	
	@FindBy(how=How.XPATH, using="(//div[@class='col-lg-3 col-md-3 col-sm-3 col-3 float-left']//h6)[3]")
	private WebElement backendBuildNumber;
	
	public void clickOnBuildDetails() {
		try {
			log.info("clicking on build details!!");
			click(buildDetails_lnk);
			log.info("clicked on build details!!");
		} catch (Exception e) {
			log.error("error clicking on build details!!");
			e.printStackTrace();
			Assert.fail();
		}
	}
	public String getUIbuildDetails() {
		try {
			log.info("ui build number"+uiBuildNumber.getText());
			System.out.println(uiBuildNumber.getText());
			return uiBuildNumber.getText();
		} catch (Exception e) {
			log.info("error getting build number!!");
			e.printStackTrace();
			return null;
		}
	}
	public String getBackendbuildDetails() {
		try {
			log.info("backend build numnber"+backendBuildNumber.getText());
			return backendBuildNumber.getText();
		} catch (Exception e) {
			log.info("cant get build details!!");
			e.printStackTrace();
			return null;
		}
	}
	
}
