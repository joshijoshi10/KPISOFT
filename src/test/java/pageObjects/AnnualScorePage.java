package pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import helper.LoggerHelper;

public class AnnualScorePage extends BasePage {
	Logger log = LoggerHelper.getLogger(LoggerHelper.class);

	public AnnualScorePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Annual Score']")
	private WebElement annualscore_link;

	@FindBy(how = How.XPATH, using = "(//div[@role='group']//button)[1]")
	private WebElement annualscore_dropdown;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create Scale')]")
	private WebElement createscale_btn;

	@FindBy(how = How.XPATH, using = "//button[text()=' Create New Scale']")
	private WebElement createnewscale_btn;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-trash']")
	private List<WebElement> delete_btn;

	@FindBy(how = How.XPATH, using = "(//scalecreationpopup//input[@name='description'])[1]")
	private WebElement scaleName_txtField;

	@FindBy(how = How.XPATH, using = "//scalecreationpopup//button[contains(text(),'Create')]")
	private WebElement create_btn;

	@FindBy(how = How.XPATH, using = "//scalecreationpopup//input[@name='title']")
	private List<WebElement> title_txtBox;

	@FindBy(how = How.XPATH, using = "//scalecreationpopup//input[@name='fromPoint']")
	private List<WebElement> score_txtBox;

	@FindBy(how = How.XPATH, using = "//scalecreationpopup//input[@name='description']")
	private List<WebElement> description_txtBox;

	@FindBy(how = How.XPATH, using = "//input[@name='searchKey']")
	private WebElement searchDropDown;

	@FindBy(how = How.XPATH, using = "//div[@class='ng2-auto-complete-wrapper']//ng2-auto-complete//ul//li")
	private List<WebElement> employeeList;

	@FindBy(how = How.XPATH, using = "//input[@name='title']")
	private WebElement scoreTextbox;

	@FindBy(how = How.XPATH, using = "//label[@for='name ']//..//select")
	private WebElement year_dropDown;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add')]")
	private WebElement add_btn;

	@FindBy(how = How.XPATH, using = "//input[@class='browse-btn']")
	private WebElement browse_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Refresh')]")
	private WebElement refresh_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Upload')]")
	private WebElement upload_btn;

	@FindBy(how = How.XPATH, using = "(//div[@class='score']//h5)[last()]")
	private WebElement score_lbl;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='score']//p)[last()]")
	private WebElement scale_lbl;

	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Add Annual Score')])[1]")
	private WebElement addAnnualScore_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Upload Annual Score')]")
	private WebElement uploadAnnualScore_btn;

	@FindBy(how = How.XPATH, using = "//select[@name='scale']")
	private WebElement scaleDropdown;

	@FindBy(how = How.XPATH, using = "(//div[@class='w-100 float-left p-2 grid-details'])[1]/div[3]/h6")
	private WebElement success_lbl;

	@FindBy(how = How.XPATH, using = "//input[@name='currentScaleName']")
	private WebElement scale_txtBox;

	@FindBy(how = How.XPATH, using = "//select[@name='scale']")
	private WebElement scale_dropDown;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Save')]")
	private WebElement save_btn;

	public void moveToAnnualScore() {
		try {
			log.info("moving to annual score!!");
			click(annualscore_link);
			log.info("moved to annual score!!");
		} catch (Exception e) {
			log.error("error moving to annual score!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void clickOnCreateScale() {
		try {
			log.info("clicking on annual score dropdown!!");
			click(annualscore_dropdown);
			log.info("clicking on annual score dropdown!!");
			log.info("clicking on create scale!!");
			click(createscale_btn);
			log.info("clicked on create scale!!");
		} catch (Exception e) {
			log.error("error clicking on create scale!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void deleteDefaultScales() {

		try {
			log.info("deleting default scales!!");
			while (delete_btn.size() > 0)
				clickOnElementByJs(delete_btn.get(1));
			log.info("deleted default scales!!");
		} catch (Exception e) {
			log.error("error deleting default scales!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnCreateNewScale() {
		try {
			log.info("clicking on create new scale!!");
			click(createnewscale_btn);
			log.info("clicked on create new scale!!");
			waitFor(5000);
		} catch (Exception e) {
			log.error("error clicking on create new scale!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterScaleName(String scaleName) {
		try {
			log.info("entering scale name!!");
			writeText(scaleName_txtField, scaleName);
			log.info("entered the scale name!!");
		} catch (Exception e) {
			log.error("error entering scale name!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void clickOnCreate() {
		try {
			log.info("clicking on create button!!");
			click(create_btn);
			log.info("clicked on create button!!");
			waitFor(3000);
		} catch (Exception e) {
			log.error("error clicking on create button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterTitle(String titleName) {
		try {

			for (int i = 0; i < title_txtBox.size(); i++) {
				log.info("entering title!!" + i);
				WebElement ele = title_txtBox.get(i);
				writeText(ele, titleName + i);
				log.info("entering title!!" + i);
			}
		} catch (Exception e) {
			log.error("error entering title!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterDescription(String description) {
		try {

			for (int i = 1; i < description_txtBox.size(); i++) {
				log.info("entering description!!" + i);
				WebElement ele = description_txtBox.get(i);
				writeText(ele, description + i);
				log.info("entering description!!" + i);
			}
		} catch (Exception e) {
			log.error("error entering description!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterScore() {
		try {
			int score1;
			for (int i = 0; i < score_txtBox.size(); i++) {
				log.info("entering score!!" + i);
				WebElement ele = score_txtBox.get(i);
				score1 = (i + 1) * 10;
				String score = String.valueOf(score1);
				writeText(ele, score);
				log.info("entering score!!" + i);
			}
		} catch (Exception e) {
			log.error("error entering score!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void selectEmployee(String empCode) {
		try {
			log.info("entering empId!!");
			//typeTextToGetDropdown(searchDropDown, empCode, employeeList);
			clear(searchDropDown);
			writeText(searchDropDown, empCode);
			waitFor(1000);
			typeDownKey(searchDropDown);
			waitFor(1000);
			typeEnterKey(searchDropDown);	
			log.info("entered empId!!");
		} catch (Exception e) {
			log.error("error entering empId!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterScore(String score, String scaleName) {
		try {
			WebElement ele = webDriver
					.findElement(By.xpath("//label[contains(text(),'" + scaleName + "')]/following-sibling::input"));
			log.info("entering score!!");
			writeText(ele, score);
			log.info("entered score!!");
		} catch (Exception e) {
			log.error("error entering score!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void selectYear(String year) {
		try {
			log.info("selecting year!!");
			setValueInDropdownText(year_dropDown, year);
			log.info("selected year!!");
		} catch (Exception e) {
			log.error("error selecting year!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void clickOnAdd() {
		try {
			log.info("clicking on add!!");
			click(add_btn);
			log.info("clicked on add!!");
			waitFor(5000);
		} catch (Exception e) {
			log.error("error clicking on Add!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void uploadfile(String file) {
		try {
			log.info("uploading file!!");
			browse_btn.sendKeys(file);
			log.info("file uploaded!!");
			waitFor(5000);
		} catch (Exception e) {
			log.error("error uploading file!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnRefresh() {
		try {
			waitFor(3000);
			log.info("clicking on refresh!!");
			click(refresh_btn);
			waitFor(3000);
			log.info("clicked on refresh!!");
		} catch (Exception e) {
			log.error("error clicking on refresh!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnUpload() {
		try {
			log.info("clicking on upload!!");
			//click(upload_btn);
			clickOnElementByJs(upload_btn);
			log.info("clicked on upload!!");
		} catch (Exception e) {
			log.error("error clicking on upload!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnAddAnnualScore() {
		try {
			log.info("clicking on Add Annual Score!!");
			click(addAnnualScore_btn);
			log.info("clicked on Add Annual Score!!");
		} catch (Exception e) {
			log.error("error clicking on Add Annual Score!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnUploadAnnualScore() {
		try {
			log.info("clicking on annual score dropdown!!");
			click(annualscore_dropdown);
			log.info("clicking on annual score dropdown!!");
			log.info("clicking on upload annual score!!");
			click(uploadAnnualScore_btn);
			waitFor(3000);
			log.info("clicked on upload annual score!!");
		} catch (Exception e) {
			log.error("error clicking on upload annual score!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyScore(String expected) {
		try {
			log.info("verifying score: " + expected);
			Assert.assertTrue(verifyData(expected, score_lbl));
			log.info("verified score: " + score_lbl.getText());
		} catch (Exception e) {
			log.error("error verifying score: " + score_lbl.getText());
			e.printStackTrace();
			Assert.fail();
		}
	}

	public String getAnnualScore() {
		try {
			log.info("fetching scores!!");
			String score = score_lbl.getText().trim();
			return score;
		} catch (Exception e) {
			return null;
		}
	}

	public void getSuccessMessage(String expected) {
		try {
			String message = webDriver.findElement(By.xpath("//div[@id='toast-container']//div//span")).getText();
			log.info(message);
			Assert.assertTrue(
					verifyData(expected, webDriver.findElement(By.xpath("//div[@id='toast-container']//div//span"))));
		} catch (Exception e) {
			Assert.fail();
			e.printStackTrace();
		}
	}

	public void verifyFileUploadStatus(String status) {
		try {
			log.info("verifying file upload status!!" + success_lbl.getText());
			Assert.assertTrue(verifyData(status, success_lbl));
			log.info("verified file upload status!!");
		} catch (Exception e) {
			log.error("error verifying file upload status: " + success_lbl.getText());
			e.printStackTrace();
		}
	}
	public void editScaleName(String scaleName) {
		try {
			log.info("double clicking on Scale name!!");
			doubleClick(scaleDropdown);
			log.info("double clicked on Scale name!!");
			waitFor(1000);
			log.info("editing scale name!");
			writeText(scale_txtBox, scaleName);
			log.info("edited scale name!!");
		} catch (Exception e) {
			log.error("error editing scale!!");
			e.printStackTrace();
			Assert.fail();
			
		}
	}
	public void clickOnSave() {
		try {
			log.info("clicking on save!!");
			click(save_btn);
			log.info("clicked on save!!");
			waitFor(5000);
		} catch (Exception e) {
			log.error("error clicking on save!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public String getScaleName() {
		try {
			log.info("fetching scale name!!");
			String actual=scale_lbl.getText().trim();
			log.info("fetched scale name: "+ actual);
			return actual;
		} catch (Exception e) {
			return null;
		}
	}
}
