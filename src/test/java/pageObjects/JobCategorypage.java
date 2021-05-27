package pageObjects;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.NoSuchElementException;

import config.ConfigFileReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import helper.LoggerHelper;

public class JobCategorypage extends BasePage {
	
	Logger log = LoggerHelper.getLogger(LoggerHelper.class);
	
	
	public JobCategorypage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Job Category')]")
	private WebElement link_JobCategory_memu;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Add Job Category']")
	private WebElement Btn_Add_JobCategory;

	@FindBy(how = How.XPATH, using = "//input[@name='empTypeCode']")
	private WebElement txt_code;

	@FindBy(how = How.XPATH, using = "//input[@name='empTypeName']")
	private WebElement txt_name;

	@FindBy(how = How.XPATH, using = "//input[@name='empTypeNameLoc']")
	private WebElement txt_nameloc;

	@FindBy(how = How.XPATH, using = "//input[@name='empTypeDes']")
	private WebElement txt_desc;

	@FindBy(how = How.XPATH, using = "//input[@name='empTypeDesLoc']")
	private WebElement txt_descloc;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Level']")
	private WebElement txt_box_level;

	@FindBy(how = How.XPATH, using = "//button[text()=' Add ']")
	private WebElement add_btn;

	@FindBy(how = How.XPATH, using = "((//div[@class='w-100 float-left mt-3']/div)[last()-1]/div)[last()]/h6/i")
	private WebElement btn_more;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'»»')]")
	private WebElement last_page;
	private String one_page = "//a[@tabindex='-1']//span[contains(text(),'»»')]";


	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Edit')]")
	private WebElement btn_edit;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Update Changes']")
	private WebElement btn_update;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-secondary']")
	private WebElement btn_back;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Delete')]")
	private WebElement link_delete;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type and choose the Job Category']")
	private WebElement txt_alter;

	@FindBy(how = How.XPATH, using = "//div[@class='ng2-auto-complete-wrapper']//ng2-auto-complete//ul//li")
	private List<WebElement> txt_drop_alter;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Delete')]")
	private WebElement btn_delete;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Cancel')]")
	private WebElement btn_cancel;

	@FindBy(how = How.XPATH, using = "//div[@class='w-100 float-left p-md-2 grid-details']/div[1]")
	private List<WebElement> list_of_emptype;

	// for add_jobcategory to employee
	@FindBy(how = How.XPATH, using = "//a[.='Employees']")
	private WebElement link_employee;

	@FindBy(how = How.XPATH, using = "((//div[@class='w-100 float-left mt-3']/div)[last()-1]/div)[last()]/h6/i")
	private WebElement btn_employeemore;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Edit Profile')]")
	private WebElement btn_edit_profile;

	@FindBy(how = How.XPATH, using = "//input[@name='categoryModel']")
	private WebElement txt_addjobgcattoemloyee;

	@FindBy(how = How.XPATH, using = "//div[@class='ng2-auto-complete-wrapper']//ng2-auto-complete//ul//li")
	private List<WebElement> txt_alterjobcatdropdown;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement btn_updateemployee;

	// create
	public void clickOnJobCategoryLink() {
		try {
			log.info("Entered clickOnJobCategoryLink succesfully");
			waitUntilElementToBeClickableRepeated(link_JobCategory_memu,2);
			click(link_JobCategory_memu);
			log.info("Executed clickOnJobCategoryLink Successfully");
		} catch (Exception e) {
			log.error("Not Executed clickOnJobCategoryLink");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnAddJobCategoryButton() {
		try {
			log.info("Entered clickOnAddJobCategoryButton succesfully");
			waitUntilElementVisibleRepeated(Btn_Add_JobCategory,2);
			click(Btn_Add_JobCategory);
			log.info("Executed clickOnAddJobCategoryButton Successfully");
		} catch (Exception e) {
			log.error("Not Executed clickOnAddJobCategoryButton");
			e.printStackTrace();
			throw e;
		}
	}

	public void Entercode(String string) {
		try {
			log.info("Entered Entercode succesfully");
			writeText(txt_code, string);
			log.info("Executed Entercode Successfully");
		} catch (Exception e) {
			log.error("Not Executed Entercode");
			e.printStackTrace();
			throw e;
		}
	}

	public void Entername(String string) {
		try {
			log.info("Entered Entername succesfully");
			writeText(txt_name, string);
			log.info("Executed Entername Successfully");
		} catch (Exception e) {
			log.error("Not Executed Entername");
			e.printStackTrace();
			throw e;
		}
	}

	public void Enternameloc(String string) {
		try {
			log.info("Entered Enternameloc succesfully");
			writeText(txt_nameloc, string);
			log.info("Executed Enternameloc Successfully");
		} catch (Exception e) {
			log.error("Not Executed Enternameloc");
			e.printStackTrace();
			throw e;
		}
	}

	public void Enterdesc(String string) {
		try {
			log.info("Entered Enterdesc succesfully");
			writeText(txt_desc, string);
			log.info("Executed Enterdesc Successfully");
		} catch (Exception e) {
			log.error("Not Executed Enterdesc");
			e.printStackTrace();
			throw e;
		}
	}

	public void Enterdescloc(String string) {
		try {
			log.info("Entered Enterdescloc succesfully");
			writeText(txt_descloc, string);
			log.info("Executed Enterdescloc Successfully");
		} catch (Exception e) {
			log.error("Not Executed Enterdescloc");
			e.printStackTrace();
			throw e;
		}
	}

	public void Enterlevel(String string) {
		try {
			log.info("Entered Enterlevel succesfully");
			writeText(txt_box_level, string);
			log.info("Executed Enterlevel Successfully");
		} catch (Exception e) {
			log.error("Not Executed Enterlevel");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnAddJobCategory() {
		try {
			log.info("Entered clickOnAddJobCategory succesfully");
			click(add_btn);
			//assertTrue(Btn_Add_JobCategory.isDisplayed(), "add jobcatergory is fail");
			assertTrue(waitForMessage(
					"Saved Successfully"),"add jobcatergory is fail.  No message: Saved Successfully");
			log.info("Executed clickOnAddJobCategory Successfully");
		} catch (Exception e) {
			log.error("Not Executed clickOnAddJobCategory");
			e.printStackTrace();
			throw e;
		}
	}

	// edit

	public void MoreButton() {
		try {
			log.info("Entered MoreButton succesfully");
			waitUntilElementToBeClickable(Btn_Add_JobCategory);
			boolean last_page_clickable = false;
			try {
				webDriver.findElement(By.xpath(one_page));
			}catch(org.openqa.selenium.NoSuchElementException exe) {
				last_page_clickable = true;
			}
			if (last_page_clickable) {
				log.info("Clicking last_page");
				click(last_page);
				waitFor(2000);
				waitUntilElementToBeClickable(btn_more);
			}
			log.info("Clicking more button");
			click(btn_more);
			log.info("Executed MoreButton Successfully");
		} catch (Exception e) {
			log.error("Not Executed MoreButton");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnEditButton() {
		try {
			log.info("Entered clickOnEditButton succesfully");
			waitUntilElementToBeClickable(btn_edit);			
			click(btn_edit);
			log.info("Executed clickOnEditButton Successfully");
		} catch (Exception e) {
			log.error("Not Executed clickOnEditButton");
			e.printStackTrace();
			throw e;
		}
	}

	public void EditEntercode(String string) {
		try {
			log.info("Entered EditEntercode succesfully");
			writeText(txt_code, string);
			log.info("Executed EditEntercode Successfully");
		} catch (Exception e) {
			log.error("Not Executed EditEntercode");
			e.printStackTrace();
			throw e;
		}
	}

	public void EditEntername(String string) {
		try {
			log.info("Entered EditEntername succesfully");
			writeText(txt_name, string);
			log.info("Executed EditEntername Successfully");
		} catch (Exception e) {
			log.error("Not Executed EditEntername");
			e.printStackTrace();
			throw e;
		}
	}

	public void EditEnternameloc(String string) {
		try {
			log.info("Entered EditEnternameloc succesfully");
			writeText(txt_nameloc, string);
			log.info("Executed EditEnternameloc Successfully");
		} catch (Exception e) {
			log.error("Not Executed EditEnternameloc");
			e.printStackTrace();
			throw e;
		}
	}

	public void EditEnterdesc(String string) {
		try {
			log.info("Entered EditEnterdesc succesfully");
			writeText(txt_desc, string);
			log.info("Executed EditEnterdesc Successfully");
		} catch (Exception e) {
			log.error("Not Executed EditEnterdesc");
			e.printStackTrace();
			throw e;
		}
	}

	public void EditEnterdescloc(String string) {
		try {
			log.info("Entered EditEnterdescloc succesfully");
			writeText(txt_descloc, string);
			log.info("Executed EditEnterdescloc Successfully");
		} catch (Exception e) {
			log.error("Not Executed EditEnterdescloc");
			e.printStackTrace();
			throw e;
		}
	}

	public void EditEnterlevel(String string) {
		try {
			log.info("Entered EditEnterlevel succesfully");
			writeText(txt_box_level, string);
			log.info("Executed EditEnterlevel Successfully");
		} catch (Exception e) {
			log.error("Not Executed EditEnterlevel");
			e.printStackTrace();
			throw e;
		}
	}

	public void ClickOnUpdateButton() {
		try {
			log.info("Entered ClickOnUpdateButton succesfully");
			click(btn_update);
			//assertTrue(Btn_Add_JobCategory.isDisplayed(), "edit is failed");
			assertTrue(waitForMessage(
					"Saved Successfully"),"edit jobcatergory is fail.  No message: Saved Successfully");
			log.info("Executed ClickOnUpdateButton Successfully");
		} catch (Exception e) {
			log.error("Not Executed ClickOnUpdateButton");
			e.printStackTrace();
			throw e;
		}
	}

	// delete
	public void clickOnDeleteLink() {
		try {
			log.info("Entered clickOnDeleteLink succesfully");
			waitUntilElementToBeClickable(link_delete);
			click(link_delete);
			log.info("Executed clickOnDeleteLink Successfully");
		} catch (Exception e) {
			log.error("Not Executed clickOnDeleteLink");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnDeleteButton() {
		try {
			log.info("Entered clickOnDeleteButton succesfully");
			click(btn_delete);
			//assertTrue(Btn_Add_JobCategory.isDisplayed(), "delete is  failed");
			assertTrue(waitForMessage(
					"Deleted Successfully"),"delete jobcatergory is fail. No message: Deleted Successfully");
			log.info("Executed clickOnDeleteButton Successfully");
		} catch (Exception e) {
			log.error("Not Executed clickOnDeleteButton");
			e.printStackTrace();
			throw e;
		}
	}

	// delete with alternative job_catergory

	public void Enteremployeelink() {
		try {
			log.info("Entered Enteremployeelink succesfully");
			waitUntilElementToBeClickable(link_employee);
			click(link_employee);
			log.info("Executed Enteremployeelink Successfully");
		} catch (Exception e) {
			log.error("Not Executed Enteremployeelink");
			e.printStackTrace();
			throw e;
		}
	}

	public void ClickEmployeMore() {
		try {
			log.info("Entered ClickEmployeMore succesfully");
			scroll(webDriver, "down");
			waitUntilElementToBeClickable(btn_employeemore);
			click(btn_employeemore);
			log.info("Executed ClickEmployeMore Successfully");
		} catch (Exception e) {
			log.error("Not Executed ClickEmployeMore");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnEditemployee() {
		try {
			log.info("Entered clickOnEditemployee succesfully");
			waitUntilElementToBeClickable(btn_edit_profile);
			click(btn_edit_profile);
			waitFor(3000);
			log.info("Executed clickOnEditemployee Successfully");
		} catch (Exception e) {
			log.error("Not Executed clickOnEditemployee");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnUpdateemployee(String jobcat2) {
		try {
			log.info("Entered clickOnUpdateemployee succesfully");
			txt_addjobgcattoemloyee.clear();
			//typeTextToGetDropdown(txt_addjobgcattoemloyee, jobcat2, txt_alterjobcatdropdown);
			clear(txt_addjobgcattoemloyee);
			writeText(txt_addjobgcattoemloyee, jobcat2);
			waitFor(1000);
			typeDownKey(txt_addjobgcattoemloyee);
			waitFor(1000);
			typeEnterKey(txt_addjobgcattoemloyee);


			waitFor(3000);
			waitForPageLoad();;
			//waitUntilElementToBeClickable(btn_updateemployee);
			doHoverandClick(btn_updateemployee);
			waitFor(3000);
			log.info("Executed clickOnUpdateemployee Successfully");
		} catch (Exception e) {
			log.error("Not Executed clickOnUpdateemployee");
			e.printStackTrace();
			throw e;
		}
	}

	public void Clickjobcat() {
		try {
			log.info("Entered Clickjobcat succesfully");
			waitUntilElementToBeClickable(link_JobCategory_memu);
			click(link_JobCategory_memu);
			log.info("Executed Clickjobcat Successfully");
		} catch (Exception e) {
			log.error("Not Executed Clickjobcat");
			e.printStackTrace();
			throw e;
		}
	}

	public void NavigateToDeletepage() {
		try {
			log.info("Entered NavigateToDeletepage succesfully");
			waitUntilElementToBeClickable(Btn_Add_JobCategory);
			boolean last_page_clickable = false;
			try {
				webDriver.findElement(By.xpath(one_page));
			}catch(org.openqa.selenium.NoSuchElementException exe) {
				last_page_clickable = true;
			}
			if (last_page_clickable) {
				log.info("Clicking last page button");
				click(last_page);
				waitUntilElementToBeClickable(btn_more);
			}
			log.info("Clicking more button");
			click(btn_more);
			waitUntilElementToBeClickable(link_delete);
			log.info("Clicking delete button");
			click(link_delete);
			waitFor(2000);
			log.info("Executed NavigateToDeletepage Successfully");
		} catch (Exception e) {
			log.error("Not Executed NavigateToDeletepage");
			e.printStackTrace();
			throw e;
		}

	}

	public void AlterButton(String alterjobcat) {
		try {
			log.info("Entered AlterButton succesfully");
			scroll(webDriver, "down");
			if (txt_alter.isEnabled()) {
				System.out.println(alterjobcat);
				//typeTextToGetDropdown(txt_alter, alterjobcat, txt_drop_alter);
				clear(txt_alter);
				writeText(txt_alter, alterjobcat);
				waitFor(1000);
				typeDownKey(txt_alter);
				waitFor(1000);
				typeEnterKey(txt_alter);
				waitFor(3000);
				click(btn_delete);
				assertTrue(Btn_Add_JobCategory.isDisplayed(), "delete is not suceesfull");
				log.info("Executed AlterButton Successfully");
			}
		} catch (Exception e) {
			log.error("Not Executed AlterButton");
			e.printStackTrace();
			throw e;
		}
	}

	public void removeJobCat() {
		try {
			log.info("Entered removeJobCat succesfully");
			txt_addjobgcattoemloyee.clear();
			waitFor(3000);
			click(btn_updateemployee);
			log.info("Executed removeJobCat Successfully");
		} catch (Exception e) {
			log.error("Not Executed removeJobCat");
			e.printStackTrace();
			throw e;
		}
	}
}
