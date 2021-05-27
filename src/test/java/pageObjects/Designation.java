package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;

public class Designation extends BasePage {

	public Designation(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//button[@id='dropdownMenuButton']")
	private WebElement dropDown;

	@FindBy(how = How.LINK_TEXT, using = "EPMS-Admin")
	private WebElement Epmsadminlink;

	@FindBy(how = How.XPATH, using = "//a[text()='Designation ']")
	private WebElement designatioLink;

	@FindBy(how = How.XPATH, using = "//button[@name='addDesignation']")
	private WebElement AddDesignationBtn;

	@FindBy(how = How.XPATH, using = "//input[@name='desName']")
	private WebElement designationNameTb;

	@FindBy(how = How.XPATH, using = "//input[@name='desCode']")
	private WebElement designationCodeTb;

	@FindBy(how = How.XPATH, using = "//input[@name='desNameLoc']")
	private WebElement designationLocaleNameTb;

	@FindBy(how = How.XPATH, using = "//input[@name='desDesc']")
	private WebElement designationDesctiptionTb;

	@FindBy(how = How.XPATH, using = "//input[@name='desDescLoc']")
	private WebElement designationLocalDescitpionTb;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Level']")
	private WebElement designatioLevelTb;

	@FindBy(how = How.XPATH, using = "//button[text()=' Add ']")
	private WebElement finaladdBtn;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Junior ')]/../..//i[@class='fa fa-ellipsis-h']")
	private WebElement Actionlink;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'»»')]")
	private WebElement lastPageLnk;	

	@FindBy(how = How.XPATH, using = " //h6[contains(text(),'Junior')]")
	private WebElement designationName_txt;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-pencil mr-2']")
	private WebElement EditButton;

	@FindBy(how = How.XPATH, using = "//button[@name='desEdit']")
	private WebElement UpdateButton;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Designation Name']")
	private WebElement editDesignationNameTb;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Designation Code']")
	private WebElement editDesignationCodeTb;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Designation Level']")
	private WebElement editDesignatioLevelTb;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-trash mr-2']")
	private WebElement deleteLink;

	@FindBy(how = How.XPATH, using = "//button[@name='desDelete']")
	private WebElement deleteButton;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Show items per page')]/following-sibling::select")
	private WebElement PagedropDown;

	public void DropDownClick() {
		try {
			log.info("clicking on drop down!!");
			dropDown.click();
			log.info("clicked on drop down!!");
		} catch (Exception e) {
			log.error("error clicking on drop down!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void EpmsAdminClick() throws InterruptedException {
		try {
			log.info("clicking on epms admin!!");
			Epmsadminlink.click();
			wait(5000);
			log.info("clicked on epms admin!!");
		} catch (Exception e) {
			log.error("error clicking on epms admin!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void designationClick() {
		try {
			log.info("Entered designationClick");
			waitUntilElementToBeClickableRepeated(designatioLink,2);
			log.info("Clicking designatioLink");
			click(designatioLink);
			log.info("Executed designationClick Successfully");
		} catch (Exception e) {
			log.info("Executed designationClick Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void AddDesignationClick() {
		try {
			log.info("clicking on add designation!!");
			AddDesignationBtn.click();
			log.info("clicked on add designation!!");
		} catch (Exception e) {
			log.error("error clicking on add designation!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void designationNameTextBox(String value) {
		try {
			log.info("writing designation name!!");
			writeText(designationNameTb, value);
			log.info("written designation name!!");
		} catch (Exception e) {
			log.info("error writing designation name!!");
			e.printStackTrace();
		}

	}

	public void designatioCodeTextBox(String value) {
		try {
			log.info("entering designation code!");
			writeText(designationCodeTb, value);
			log.info("entered designation code!");
		} catch (Exception e) {
			log.error("error entering designation code!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void designationLevelTextBox(String value) {
		try {
			log.info("entering designation level!");
			writeText(designatioLevelTb, value);
			log.info("entered designation level!");
		} catch (Exception e) {
			log.error("error entering designation level!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void designDescritptionTextBox(String value) {
		try {
			log.info("entering description!!");
			writeText(designationDesctiptionTb, value);
			log.info("entered description!!");
		} catch (Exception e) {
			log.error("error entering description!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void localDescriptionTextBox(String value) {
		try {
			log.info("entering description locale!!");
			writeText(designationLocalDescitpionTb, value);
			log.info("entered description locale!!");
		} catch (Exception e) {
			log.info("error entering description locale!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void localNameTextBox(String value) {
		try {
			log.info("entering locale name");
			writeText(designationLocaleNameTb, value);
			log.info("entered locale name");
		} catch (Exception e) {
			log.error("error entering locale name");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void AddButtonClick() {
		try {
			log.info("Entered AddButtonClick");
			//waitFor(3000);
			waitUntilElementToBeClickableRepeated(finaladdBtn,2);
			log.info("Clicking finaladdBtn");
			click(finaladdBtn);
			waitFor(3000);
			log.info("Executed AddButtonClick Successfully");
		} catch (Exception e) {
			log.info("Executed AddButtonClick Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void ActionsLinkButton() {
		try {
			log.info("click on actions");
			if (designationName_txt.getText().length() > 0) {
				click(Actionlink);
			}
		} catch (Exception e) {
//			do {
//				scrollUpAndDown(150);
//				setValueInDropdownText(PagedropDown, "20");
//			} while (!Actionlink.isDisplayed());
//			click(Actionlink);
			waitFor(2000);
			waitUntilElementToBeClickable(lastPageLnk);
			doHoverandClick(lastPageLnk);
			waitFor(4000);
			click(Actionlink);
			log.info("clicked on actions link!!");
		}

	}

	public void EditButtonClick() {
		try {
			log.info("clicking on edit button!!");
			EditButton.click();
			log.info("clicked on edit button!!");
		} catch (Exception e) {
			log.error("error clicking on edit button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void updateButtonClick() {
		try {
			log.info("clicking on update button!!");
			UpdateButton.click();
			log.info("clicked on update button!!");
		} catch (Exception e) {
			log.error("error clicking on update button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void deleteDesignationLink() {
		try {
			log.info("click on delete!!");
			deleteLink.click();
			log.info("clicked on delete!!");
		} catch (Exception e) {
			log.info("error clicking on delete!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void deleteDesignationButton() {
		try {
			log.info("clicking on delete button!!");
			deleteButton.click();
			log.info("clicked on delete button!!");
		} catch (Exception e) {
			log.info("error clicking on delete button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

}
