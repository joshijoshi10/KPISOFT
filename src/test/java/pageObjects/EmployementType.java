package pageObjects;

import static org.testng.Assert.assertTrue;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import util.ManagerUtil;

public class EmployementType extends BasePage {

	public EmployementType(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[text()='Employment type']")
	private WebElement EmployementTypeLink;

	@FindBy(how = How.XPATH, using = "//button[@name='addEmpType']")
	private WebElement addEmployeButton;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Code']")
	private WebElement employementCodeTB;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	private WebElement employementNameTB;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name locale']")
	private WebElement employementLocalNameTB;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Description']")
	private WebElement employementDescriptionTB;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Description Locale']")
	private WebElement employementLocalDescriptionTB;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Level']")
	private WebElement employementLevelTB;

	@FindBy(how = How.XPATH, using = "//button[text()=' Add ']")
	private WebElement FinalAddbtn;

	@FindBy(how = How.XPATH, using = "((//div[@class='w-100 float-left mt-3']/div)[last()-1]/div)[last()]")
	private WebElement ActionsLink;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-pencil mr-2']")
	private WebElement EditButton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Update')]")
	private WebElement updateButton;

	@FindBy(how = How.XPATH, using = "//li[text()=' Delete']")
	private WebElement deleteLink;

	@FindBy(how = How.XPATH, using = "//button[text()=' Delete ']")
	private WebElement deletebutton;

	public void employmentTypeLinkClick() {
		try {
			log.info("Entered employmentTypeLinkClick");
			waitUntilElementToBeClickableRepeated(EmployementTypeLink,2);
			log.info("Clicking employmentTypeLinkClick");
			click(EmployementTypeLink);
			waitFor(4000);
			log.info("Executed employmentTypeLinkClick Successfully");
		} catch (Exception e) {
			log.info("Executed employmentTypeLinkClick Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void addEmploybuttonClick() {
		try {
			log.info("clicking on add employee button!!");
			addEmployeButton.click();
			log.info("clicked on add employee button!!");
		} catch (Exception e) {
			log.error("error clicking on add employee button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void employementCodeTextBox(String value) {
		try {
			log.info("entering employment code !!");
			writeText(employementCodeTB, value);
			log.info("entered employment code !!");
		} catch (Exception e) {
			log.error("error entering employment code");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void employeNameTextBox(String value) {
		try {
			log.info("entering employee name!!");
			writeText(employementNameTB, value);
			log.info("entered employee name!!");
		} catch (Exception e) {
			log.error("error entering employee name!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void employeLocalNameTextBox(String value) {
		try {
			log.info("entering locale name");
			writeText(employementLocalNameTB, value);
			log.info("entered locale name");
		} catch (Exception e) {
			log.error("error entering locale name");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void employementDescriptionTextBox(String value) {
		try {
			log.info("entering employement description!!");
			writeText(employementDescriptionTB, value);
			log.info("entered employement description!!");
		} catch (Exception e) {
			
			log.error("error entering employement description!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void employementLocalDescriptionTextBox(String value) {
		try {
			log.info("entering employment description!");
			writeText(employementLocalDescriptionTB, value);
			log.info("entered employment description!");
		} catch (Exception e) {
			log.info("error entering employment description!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void employementLevelTextBox(String value) {

		try {
			log.info("entering employment level");
			writeText(employementLevelTB, value);
			log.info("entered employment level");
		} catch (Exception e) {
			log.error("error entering employment level");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void addBtnClick() {
		try {log.info("click on add button!!");
			scrollUpAndDown(40);
			FinalAddbtn.click();
			assertTrue(addEmployeButton.isDisplayed(), "Add employementType is passed");
			log.info("clicked on add button!!");
		} catch (Exception e) {
			log.error("error clicking on add button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void actionsLinkClick() {
		try {
			log.info("clicking on actions link!!");
			doHoverandClick(ActionsLink);
			ManagerUtil.waitFor(2000);
			log.info("clicked on actions link!!");
		} catch (Exception e) {
			log.error("clicking on actions link!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void editButtonClick() {
		try {
			log.info("clicking on edit");
			ManagerUtil.waitFor(3000);
			EditButton.click();
			log.info("clicked on edit");
		} catch (Exception e) {
			log.error("error clicking on edit");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void updateButtonClick() {
		try {
			log.info("clicking on update button!!");
			ManagerUtil.waitFor(3000);
			updateButton.click();
			assertTrue(addEmployeButton.isDisplayed(), "Add employementType is passed");
			log.info("clicked on update button!!");
		} catch (Exception e) {
			log.error("error clicking on update button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void deleteLinkClick() {
		try {
			log.info("clicking on delete!!");
			deleteLink.click();
			log.info("clicked on delete!!");
		} catch (Exception e) {
			log.error("error clicking on delete!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void deleteButtonClick() {
		try {
			log.info("clicking on delete button!!");
			scrollUpAndDown(3000);
			ManagerUtil.waitFor(3000);
			deletebutton.click();
			log.info("clicked on delete button!!");
		} catch (Exception e) {
			log.error("error clicking on delete button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}
}
