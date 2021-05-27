package pageObjects;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BulkImageUploadPage extends BasePage {
	public BulkImageUploadPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Bulk employee image upload')]")
	private WebElement lnk_BulkImageUpload;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Select Images')]/../input")
	private WebElement btn_browrse;

	public void clickOnBulkImageUpload() {
		try {
			log.info("clicking on bulk image upload!!");
			click(lnk_BulkImageUpload);
			log.info("clicked on bulk image upload!!");
		} catch (Exception e) {
			log.error("error clicking on bulk image upload!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void UploadPicture() {
		try {
			log.info("uploading picture!!");
			changeSingleToDoubleSlash("src\\test\\resources\\Data\\pictues\\BulkImageUpload", btn_browrse);
			log.info("uploaded picture!!");
		} catch (Exception e) {
			log.error("error uploading picture!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

}
