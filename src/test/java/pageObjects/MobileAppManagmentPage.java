package pageObjects;

import config.ConfigFileReader;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import helper.LoggerHelper;

public class MobileAppManagmentPage extends BasePage {

	public MobileAppManagmentPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Mobile App Management')]")
	private WebElement MobileApp_lnk;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create Mobile Application')]")
	private WebElement CreateApp_btn;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Application Name')]/../input")
	private WebElement AppName_txt;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'App Key')]/../input")
	private WebElement AppKey_txt;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Android Version')]/../input")
	private WebElement AndroidVersion_txt;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'iOS Version')]/../input")
	private WebElement IOSVersion_txt;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Firebase Key')]/../input")
	private WebElement FirebaseKey_txt;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Redirect URL Android')]/../input")
	private WebElement RedirectURLAndroid_txt;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Redirect URL iOS')]/../input")
	private WebElement RedirectURLiOS_txt;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save')]")
	private WebElement save_btn;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-edit']")
	private WebElement edit_btn;

	public void clickOnMobileAppManagement() {
		try {
			log.info("Entered clickOnMobileAppManagement");
			waitUntilElementToBeClickableRepeated(MobileApp_lnk, 2);
			log.info("Clicking on MobileApp_lnk");
			click(MobileApp_lnk);
			log.info("Clicked on MobileApp_lnk");
			log.info("Executed clickOnMobileAppManagement Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnMobileAppManagement Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnCreateApp() {
		try {
			log.info("Entered clickOnCreateApp");
			waitUntilElementToBeClickableRepeated(CreateApp_btn, 2);
			log.info("Clicking on CreateApp_btn");
			click(CreateApp_btn);
			log.info("Clicked on CreateApp_btn");
			log.info("Executed clickOnCreateApp Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnCreateApp Not Successfully");
			e.printStackTrace();
			throw e;
		}

	}

	public void enterApplicationName(String appname) {
		try {
			log.info("Entered enterApplicationName");
			log.info("Writing "+appname);
			writeText(AppName_txt, appname);
			log.info("Written "+appname);
			log.info("Executed enterApplicationName Successfully");
		} catch (Exception e) {
			log.error("Executed enterApplicationName Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterAppKey(String Appkey) {
		try {
			log.info("Entered enterAppKey");
			log.info("Writing "+Appkey);
			writeText(AppKey_txt, Appkey);
			log.info("Written "+Appkey);
			log.info("Executed enterAppKey Successfully");
		} catch (Exception e) {
			log.error("Executed enterAppKey Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterAndroidVersiontxt(String AndroidVersion) {
		try {
			log.info("Entered enterAndroidVersiontxt");
			log.info("Writing "+AndroidVersion);
			writeText(AndroidVersion_txt, AndroidVersion);
			log.info("Written "+AndroidVersion);
			log.info("Executed enterAndroidVersiontxt Successfully");
		} catch (Exception e) {
			log.error("Executed enterAndroidVersiontxt Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterIOSVersiontxt(String IOSVersion) {
		try {
			log.info("Entered enterIOSVersiontxt");
			log.info("Writing "+IOSVersion);
			writeText(IOSVersion_txt, IOSVersion);
			log.info("Written "+IOSVersion);
			log.info("Executed enterIOSVersiontxt Successfully");
		} catch (Exception e) {
			log.error("Executed enterIOSVersiontxt Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterFirebaseKeytxt(String FirebaseKey) {
		try {
			log.info("Entered enterFirebaseKeytxt");
			log.info("Writing "+FirebaseKey);
			writeText(FirebaseKey_txt, FirebaseKey);
			log.info("Written "+FirebaseKey);
			log.info("Executed enterFirebaseKeytxt Successfully");
		} catch (Exception e) {
			log.error("Executed enterFirebaseKeytxt Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterRedirectURLAndroid(String RedirectURLAndroid) {
		try {
			log.info("Entered enterRedirectURLAndroid");
			log.info("Writing "+RedirectURLAndroid);
			writeText(RedirectURLAndroid_txt, RedirectURLAndroid);
			log.info("Written "+RedirectURLAndroid);
			log.info("Executed enterRedirectURLAndroid Successfully");
		} catch (Exception e) {
			log.error("Executed enterRedirectURLAndroid Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterRedirectURLiOS(String RedirectURLiOS) {
		try {
			log.info("Entered enterRedirectURLiOS");
			log.info("Writing "+RedirectURLiOS);
			writeText(RedirectURLiOS_txt, RedirectURLiOS);
			log.info("Written "+RedirectURLiOS);
			log.info("Executed enterRedirectURLiOS Successfully");
		} catch (Exception e) {
			log.error("Executed enterRedirectURLiOS Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnSave() {
		try {
			log.info("Entered clickOnSave");
			log.info("Clicking Save");
			click(save_btn);
			log.info("Clicked Save");
//			waitFor(3000);
//			waitForPageLoad();
			Assert.assertTrue(waitForMessageLonger( "Success"), "Success did not appear");
			log.info("Executed clickOnSave Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnSave Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	// edit
	public void clickOnEdit() {
		try {
			log.info("Entered clickOnEdit");
			log.info("Clicking Edit");
			click(edit_btn);
			log.info("Clicked Edit");
			log.info("Executed clickOnEdit Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnEdit Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void editAppName(String editAppName) {
		try {
			log.info("Entered editAppName");
			log.info("Clicking Edit App Name");
			writeText(AppName_txt, editAppName);
			log.info("Clicked Edit App Name");
			log.info("Executed editAppName Successfully");
		} catch (Exception e) {
			log.error("Executed editAppName Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

}
