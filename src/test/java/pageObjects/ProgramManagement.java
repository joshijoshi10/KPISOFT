package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import util.DateUtil;

public class ProgramManagement extends BasePage {

	public ProgramManagement(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

//Adding Xpaths for Program Management 

	@FindBy(how = How.XPATH, using = "//li[@id='moremenu']")
	private WebElement Moremenu_btn;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),' Program Management')]")
	private WebElement ProgrmMangmt_btn;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Create Program')]")
	private WebElement Createpgm_btn;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Create Program')]")
	private WebElement Createpgm_header;

	@FindBy(how = How.XPATH, using = "//input[@name='programName']")
	private WebElement Programname;

	@FindBy(how = How.XPATH, using = "//textarea[@name='desc']")
	private WebElement Description;//

	@FindBy(how = How.XPATH, using = "//textarea[@name='objective']")
	private WebElement Objective;

	@FindBy(how = How.XPATH, using = "//input[@name='sDate']")
	private WebElement startdate;

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-calendar'])[1]")
	private WebElement dp_startDateBtn;

//	@FindBy(how = How.XPATH, using = "//input[@name='endDate']/following-sibling::button")
	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-calendar'])[2]")
	private WebElement dp_endDateBtn;

	@FindBy(how = How.XPATH, using = "//input[@name='eDate']")
	private WebElement endDate;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),' Add Deliverables ')]")
	private WebElement AddDeliverable_btn;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Key Deliverables')]")
	private WebElement keyDeliverableslbl;

	@FindBy(how = How.XPATH, using = "//textarea[@id='0']")
	private WebElement keyDeliverables;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Next')]")
	private WebElement Next_btn;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Add Owners')]")
	private WebElement AddOnwers_btn;

	@FindBy(how = How.XPATH, using = "//input[@name='displayName']")
	private WebElement SearchOwner;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'EMP')]")
	private WebElement SearchedOwner;

	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Create')])[2]")
	private WebElement createButton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'View Details')]")
	private WebElement ViewDetails_Button;

	@FindBy(how = How.XPATH, using = "//i[@class='fas fa-pen ml-3 ng-star-inserted']")
	private WebElement EditProgram_Icon;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Update')]")
	private WebElement Update_Button;

	// ****************Risk PAGE Objects***********************
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Risks')]")
	private WebElement Risks_TAB;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Risk')]")
	private WebElement AddRisk_Button;

	@FindBy(how = How.XPATH, using = "//input[@class='form-control ng-pristine ng-valid ng-touched']")
	private WebElement Risk_name;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Name')]")
	private WebElement Risk_name_label;

	@FindBy(how = How.XPATH, using = "//input[@class='form-control ng-untouched ng-pristine ng-valid']")
	private WebElement Risk_Description;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Description')]")
	private WebElement Risk_Desc_label;

	@FindBy(how = How.XPATH, using = "(//input[@name='dp'])[1]")
	private WebElement Risk_DateReported;

	@FindBy(how = How.XPATH, using = "//div[@class='p-2']")
	private WebElement Risk_AssignedtoBox;

	@FindBy(how = How.XPATH, using = "//a[@class='dropdown-item ng-star-inserted']")
	private WebElement Risk_Assignedto_Employee;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Mitigation Plan')]")
	private WebElement Mitigation_plan;

	@FindBy(how = How.XPATH, using = "//select[@id='probability']")
	private WebElement Probability_dropdown;

	@FindBy(how = How.XPATH, using = "//select[@id='impact']")
	private WebElement Impact_dropdown;

	@FindBy(how = How.XPATH, using = "//select[@id='status']")
	private WebElement Status_dropdown;

	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Add')])[2]")
	private WebElement Add_Riskbutton_newrisk;

	// *****************Issue PAGE OBJECTS******************
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Issues')]")
	private WebElement iSSUES_TAB;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Add issue')]")
	private WebElement ADDiSSUES_btn;

	@FindBy(how = How.XPATH, using = "//input[@class='form-control ng-pristine ng-valid ng-touched']")
	private WebElement issue_name;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Description')]")
	private WebElement issue_Description;

	@FindBy(how = How.XPATH, using = "(//input[@name='dp'])[2]")
	private WebElement Issue_resolution_date;

	@FindBy(how = How.XPATH, using = "//i[@class='fas fa-trash ml-3 ng-star-inserted']")
	private WebElement Delete_ICON;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Yes')]")
	private WebElement yes_delete_button;

	// ***********************88Add budget section********************

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Details')]")
	private WebElement Details_TAB;

	@FindBy(how = How.XPATH, using = "//i[@class='fas fa-arrow-left mr-2']")
	private WebElement Back_to_ProgramDeatails;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Add Budget')]")
	private WebElement add_budget_button;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Budget name')]")
	private WebElement budget_name;

	@FindBy(how = How.XPATH, using = "//select[@name='selectBudget']")
	private WebElement budget_type_dropdown;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id,'name')]")
	private WebElement budget_q1_spent;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id,'name')]")
	private WebElement budget_q2_spent;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement nextbuton_budget;

	@FindBy(how = How.XPATH, using = "//i[@class='fas fa-pen text-light ng-star-inserted']")
	private WebElement edit_budget_icon;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'UPDATE')]")
	private WebElement update_budget_button;

	@FindBy(how = How.XPATH, using = "//i[@class='fas fa-trash text-light ml-3 ng-star-inserted']")
	private WebElement delete_budget_icon;

	// **************Initiative WebElements********************

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create Initiative')]")
	private WebElement Create_Initiative__button;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Initiative Name')]")
	private WebElement Initiative_name;

	@FindBy(how = How.XPATH, using = "//input[@name='wtg']")
	private WebElement weightage_value;

	@FindBy(how = How.XPATH, using = "//p[@class='b text-link ng-star-inserted']")
	private WebElement inititativeAdded_value;

	@FindBy(how = How.XPATH, using = "//input[@name='wtg']")
	private WebElement inititativeWeightge_value;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Update')]")
	private WebElement update_initiative_button;

	// **************Initiative Milestones WebElements********************

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create Milestone')]")
	private WebElement Create_Milestone_button;

	@FindBy(how = How.XPATH, using = "//input[@name='weightage']")
	private WebElement Milestone_Weightage;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id,'plan')]")
	private WebElement Milestone_planvalues;//// *[@id='plan_3']//..

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Update Plan')]")
	private WebElement UpdatePlan_Header;

	@FindBy(how = How.XPATH, using = "//milestonedetailstable/div[2]/div/div/div/div[3]/p/i[1]")
	private WebElement Edit_MiletstoneIcon;

	@FindBy(how = How.XPATH, using = "//i[@class='mr-3 fas fa-plus']")
	private WebElement Budget_plussymbol;

	@FindBy(how = How.XPATH, using = "//i[@class='fas fa-pen text-light form-right-lock p-3 ng-star-inserted']")
	private WebElement Edit_spent_values;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Confirm')]")
	private WebElement Confirm_button;

	@FindBy(how = How.XPATH, using = "//i[@class='fas fa-angle-double-down text-primary ml-3']")
	private WebElement MileStone_downarrows;

	@FindBy(how = How.XPATH, using = "//i[@class='far fa-comments c-p ng-star-inserted']")
	private WebElement mileStone_comments;

	@FindBy(how = How.XPATH, using = "//textarea[@id='float-input']")
	private WebElement WriteComment;

	@FindBy(how = How.XPATH, using = "//input[@id='files']")
	private WebElement choosefile_icon;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Post')]")
	private WebElement post_button;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Publish')]")
	private WebElement Publish_button;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'OK')]")
	private WebElement OK_button;

	@FindBy(how = How.XPATH, using = "//i[@class='fas fa-file-upload mr-2']")
	private WebElement upload_filebutton;
	

	public void getProgramManagement() {

		try {
			log.info("Entering getProgramManagement successfully");
			waitUntilElementVisible(Moremenu_btn);
			waitUntilElementToBeClickable(Moremenu_btn);
			doHoverandClick(Moremenu_btn);
			click(ProgrmMangmt_btn);
			Reporter.log("Program management clicked", true);
			log.info("Executed getProgramManagement successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed getProgramManagement not successfully");
		}
	}

	public void clickOnCreateProgram() {
		try {
			log.info("Entering clickOnCreateProgram successfully");
			Actions prm = new Actions(webDriver);
			prm.moveToElement(Createpgm_btn).build().perform();
			prm.moveToElement(Createpgm_btn).click().perform();
			Reporter.log("Create Program  clicked", true);
			log.info("Executed clickOnCreateProgram successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickOnCreateProgram not successfully");
		}
	}

	public void enterProgramDetails(String progName) {
		try {
			log.info("Entering enterProgramDetails successfully");
			writeText(Programname, progName + BasePage.getTimestamp());
			writeText(Description, progName + BasePage.getTimestamp());
			writeText(Objective, progName + BasePage.getTimestamp());
			Reporter.log("add all madatory details", true);
			log.info("Executed enterProgramDetails successfully");
		} catch (Exception e) {
			Reporter.log(e.getMessage());
			log.info("Executed clickOnCreateProgram not successfully");
		}
	}

	public void enterDates() {
		// click(startdate);
		try {
			log.info("Entering enterDates successfully");
			setDateInDatePicker(startdate, DateUtil.getCurrentYear(), DateUtil.getCurrentMonthName(),
					DateUtil.getCurrentDay());
			Reporter.log("*******start date is entered**********", true);
			// click(endDate);
			setDateInDatePicker(endDate, DateUtil.getCurrentYear(), DateUtil.addDaysAndGetMonth(90),
					DateUtil.getCurrentDay());
			Reporter.log("*******end date is entered**********", true);
			log.info("Executed enterDates successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed enterDates not successfully");
		}

	}

	public void clickOnAddDeliverables(String progName) {
		try {
			log.info("Entering ClickOnAddDeliverables successfully");
			Actions prm = new Actions(webDriver);
			prm.moveToElement(AddDeliverable_btn).build().perform();
			prm.moveToElement(AddDeliverable_btn).click().perform();
			Reporter.log("Add deliverables button clicked", true);
			prm.moveToElement(keyDeliverables).click().build().perform();
			keyDeliverables.sendKeys(progName + BasePage.getTimestamp());
			Reporter.log("add deliverbles clicked and added value", true);
			log.info("Executed ClickOnAddDeliverables successfully");
		} catch (Exception e) {
			Reporter.log(e.getMessage());
			log.info("Executed ClickOnAddDeliverables not successfully");
		}
	}

	public void clickonNextbutton() {
		try {
			log.info("Entering ClickonNextbutton successfully");
			Actions prm = new Actions(webDriver);
			prm.moveToElement(Next_btn).build().perform();
			prm.moveToElement(Next_btn).click().perform();
			Reporter.log("Next button clicked", true);
			log.info("Executed ClickonNextbutton successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed ClickonNextbutton not successfully");
		}
	}

	public void addowner() {
		try {
			log.info("Entering Addowner successfully");
			Actions owner = new Actions(webDriver);
			owner.moveToElement(AddOnwers_btn).click().perform();
			Reporter.log("Add owner button", true);
			log.info("Executed Addowner successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed Addowner not successfully");
		}
	}

	public void searchOnwer(String employee) {
		try {
			log.info("Executed SearchOnwer successfully");
			Actions owner = new Actions(webDriver);
			owner.moveToElement(SearchOwner).click().build().perform();
			owner.moveToElement(SearchOwner).sendKeys(employee).build().perform();
			Reporter.log("Owner to be searched entered", true);
			waitFor(2000);
			owner.moveToElement(SearchedOwner).build().perform();
			owner.moveToElement(SearchedOwner).click().build().perform();
			waitFor(2000);
			Reporter.log("Owner Searched clicked", true);
			log.info("Executed SearchOnwer successfully");
		} catch (Exception e) {
			Reporter.log(e.getMessage());
			log.info("Executed SearchOnwer not successfully");
		}

	}

	public void createButton() {
		try {
			log.info("Entered createButton successfully");
			Actions owner = new Actions(webDriver);
			owner.moveToElement(createButton).click().perform();
			Reporter.log("Create button clicked", true);
			log.info("Executed createButton successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed createButton not successfully");
		}
	}

	public void clickOnViewDetails() {
		try {
			log.info("Entered clickOnViewDetails successfully");
			Actions owner = new Actions(webDriver);
			waitUntilElementVisible(ViewDetails_Button);
			waitUntilElementToBeClickable(ViewDetails_Button);
			owner.moveToElement(ViewDetails_Button).click().perform();
			Reporter.log("ViewDetails_Button  clicked", true);
			log.info("Executed clickOnViewDetails successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickOnViewDetails not successfully");
		}
	}

	public void clickOnEditDetails() {
		try {
			log.info("Entered clickOnEditDetails successfully");
			Actions owner = new Actions(webDriver);
			waitUntilElementVisible(EditProgram_Icon);
			waitUntilElementToBeClickable(EditProgram_Icon);
			owner.moveToElement(EditProgram_Icon).click().perform();
			Reporter.log("EditProgram_Icon  clicked", true);
			log.info("Executed clickOnEditDetails successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickOnEditDetails not successfully");
		}
	}

	public void clickOnDeleteProgram() {
		try {
			log.info("Entered clickOnDeleteProgram successfully");
			Actions owner = new Actions(webDriver);
			waitUntilElementVisible(Delete_ICON);
			waitUntilElementToBeClickable(Delete_ICON);
			owner.moveToElement(Delete_ICON).click().perform();
			Reporter.log("Delete_ICON  clicked", true);
			waitUntilElementToBeClickable(yes_delete_button);
			click(yes_delete_button);
			Reporter.log("Confirmed and  program deleted", true);
			log.info("Executed clickOnDeleteProgram successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickOnDeleteProgram not successfully");
		}

	}

	public void clickRiskTab() {
		try {
			log.info("Entered clickRiskTab successfully");
			Actions owner = new Actions(webDriver);
			owner.moveToElement(Risks_TAB).click().perform();
			Reporter.log("Risks_TAB  clicked", true);
			log.info("Executed clickRiskTab successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickRiskTab not successfully");
		}
	}

	public void clickAddRisk() {
		try {
			log.info("Entered clickAddRisk successfully");
			Actions owner = new Actions(webDriver);
			owner.moveToElement(AddRisk_Button).click().perform();
			Reporter.log("AddRisk_Button  clicked", true);
			log.info("Executed clickAddRisk successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickAddRisk not successfully");
		}
	}

	public void addRiskDetails(String progName) {
		try {
			log.info("Entered addRiskDetails successfully");
			Actions risk = new Actions(webDriver);
			risk.moveToElement(Risk_name_label).doubleClick().build().perform();
			risk.moveToElement(Risk_name_label).sendKeys(progName + BasePage.getTimestamp()).build().perform();
			;
			risk.moveToElement(Risk_Desc_label).doubleClick().build().perform();
			risk.moveToElement(Risk_Desc_label).sendKeys(progName + BasePage.getTimestamp()).build().perform();
			;
			waitUntilElementToBeClickable(Risk_DateReported);
			click(Risk_DateReported);
			WebElement dayEle = webDriver.findElement(By.xpath("(//div[@class='btn-light ng-star-inserted'])[1]"));
			dayEle.click();
			Reporter.log("*******reported  date is entered**********", true);
			Actions owner = new Actions(webDriver);
			owner.moveToElement(Risk_AssignedtoBox).doubleClick().build().perform();
			owner.moveToElement(Risk_AssignedtoBox).sendKeys("EMP6").build().perform();
			Reporter.log("Owner to be searched entered");
			owner.moveToElement(SearchedOwner).build().perform();

			owner.moveToElement(SearchedOwner).click().build().perform();
			risk.moveToElement(Mitigation_plan).doubleClick().build().perform();
			risk.moveToElement(Mitigation_plan).sendKeys(progName + BasePage.getTimestamp()).build().perform();
			;
			Select prob = new Select(Probability_dropdown);
			prob.selectByIndex(1);
			Reporter.log("*******selected Probability as MEDIUM **********", true);
			Select imp = new Select(Impact_dropdown);
			imp.selectByIndex(2);
			Reporter.log("*******selected Impact as High **********", true);
			Select status = new Select(Status_dropdown);
			status.selectByVisibleText("Open");
			Reporter.log("*******selected status as Open **********", true);
			log.info("Executed addRiskDetails successfully");
		} catch (Exception e) {
			Reporter.log(e.getMessage());
			log.info("Executed addRiskDetails not successfully");
		}

	}

	public void clickAddRiskPage() {
		try {
			log.info("Entered clickAddRiskPage successfully");
			Actions owner = new Actions(webDriver);
			owner.moveToElement(Add_Riskbutton_newrisk).click().perform();
			Reporter.log("Add_Riskbutton  clicked", true);
			log.info("Executed clickAddRiskPage successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickAddRiskPage not successfully");
		}
	}

	public void clickIssuesTab() {
		try {
			log.info("Entered clickIssuesTab successfully");
			Actions owner = new Actions(webDriver);
			waitUntilElementToBeClickable(iSSUES_TAB);
			owner.moveToElement(iSSUES_TAB).click().perform();
			Reporter.log("iSSUES_TAB  clicked", true);
			log.info("Executed clickIssuesTab successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickIssuesTab not successfully");
		}
	}

	public void clickAddIssuesbutton() {
		try {
			log.info("Entered clickAddIssuesbutton successfully");
			Actions owner = new Actions(webDriver);
			owner.moveToElement(ADDiSSUES_btn).click().perform();
			Reporter.log("ADDiSSUES_btn  clicked", true);
			log.info("Executed clickAddIssuesbutton successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickAddIssuesbutton not successfully");

		}
	}

	public void addIssuesDetails(String progName) {
		try {
			log.info("Entered addIssuesDetails successfully");
			Actions risk = new Actions(webDriver);
			risk.moveToElement(Risk_name_label).doubleClick().build().perform();
			risk.moveToElement(Risk_name_label).sendKeys(progName + BasePage.getTimestamp()).build().perform();
			;
			risk.moveToElement(Risk_Desc_label).doubleClick().build().perform();
			risk.moveToElement(Risk_Desc_label).sendKeys(progName + BasePage.getTimestamp()).build().perform();
			;
			waitUntilElementToBeClickable(Risk_DateReported);
			click(Risk_DateReported);
			WebElement dayEle = webDriver.findElement(By.xpath("(//div[@class='btn-light ng-star-inserted'])[1]"));
			dayEle.click();
			Reporter.log("*******reported  date is entered**********", true);
			Actions owner = new Actions(webDriver);
			owner.moveToElement(Risk_AssignedtoBox).doubleClick().build().perform();
			owner.moveToElement(Risk_AssignedtoBox).sendKeys("EMP6").build().perform();
			Reporter.log("Owner to be searched entered");
			owner.moveToElement(SearchedOwner).build().perform();
			owner.moveToElement(SearchedOwner).click().build().perform();
			risk.moveToElement(Mitigation_plan).doubleClick().build().perform();
			risk.moveToElement(Mitigation_plan).sendKeys(progName + BasePage.getTimestamp()).build().perform();
			Select prob = new Select(Probability_dropdown);
			prob.selectByIndex(1);
			Reporter.log("*******selected Probability as MEDIUM **********", true);
			Select imp = new Select(Impact_dropdown);
			imp.selectByIndex(2);
			Reporter.log("*******selected Impact as High **********", true);
			Select status = new Select(Status_dropdown);
			status.selectByVisibleText("Open");
			Reporter.log("*******selected status as Open **********", true);
			waitUntilElementToBeClickable(Risk_DateReported);
			click(Issue_resolution_date);
			WebElement dayResolution = webDriver
					.findElement(By.xpath("(//div[@class='btn-light ng-star-inserted'])[2]"));
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
			js.executeScript("arguments[0].click();", dayResolution);
			Reporter.log("*******selected Resolution date **********", true);
			log.info("Executed addIssuesDetails successfully");
		} catch (Exception e) {
			Reporter.log(e.getMessage());
			log.info("Executed addIssuesDetails not successfully");
		}

	}

	public void backtoProgramManagementDetails() {
		try {
			log.info("Entered backtoProgramManagementDetails successfully");
			Actions owner = new Actions(webDriver);
			waitUntilElementToBeClickable(Back_to_ProgramDeatails);
			owner.moveToElement(Back_to_ProgramDeatails).click().build().perform();		
			Reporter.log("Back_to_ProgramDeatails icon  clicked", true);
			log.info("Executed backtoProgramManagementDetails successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed backtoProgramManagementDetails not successfully");
		}

	}

	public void clickonAddBudget() {
		try {
			log.info("Entered clickonAddBudget successfully");
			Actions owner = new Actions(webDriver);
			Assert.assertTrue(add_budget_button.isDisplayed(), "add_budget_button is displayed");
			owner.moveToElement(add_budget_button).click().perform();
			Reporter.log("add_budget_button  clicked", true);
			log.info("Executed clickonAddBudget successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickonAddBudget not successfully");
		}

	}

	public void clickonAddBudgetDetails(String Budget, String type) {
		try {
			log.info("Entered clickonAddBudgetDetails successfully");
			Actions owner = new Actions(webDriver);
			owner.moveToElement(budget_name).click().perform();
			owner.moveToElement(budget_name).sendKeys(Budget + BasePage.getTimestamp()).build().perform();
			Reporter.log("Budget name entered", true);
			Select bgt_type = new Select(budget_type_dropdown);
			bgt_type.selectByVisibleText(type);
			Reporter.log("Budget type selected ", true);
			log.info("Executed clickonAddBudgetDetails successfully");
		} catch (Exception e) {
			Reporter.log(e.getMessage());
			log.info("Executed clickonAddBudgetDetails not successfully");
		}

	}

	public void clickonNextInAddBudget() {
		try {
			log.info("Entered clickonNextInAddBudget successfully");
			Actions owner = new Actions(webDriver);
			owner.moveToElement(nextbuton_budget).click().perform();
			Reporter.log("add_budget_button  clicked", true);
			log.info("Executed clickonNextInAddBudget successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickonNextInAddBudget not successfully");
		}
	}

	public void enterBudgetCosts(String budgetq1, String budgeq2) {
		try {
			log.info("Entered enterBudgetCosts successfully");
			Actions owner = new Actions(webDriver);
			waitUntilElementToBeClickable(budget_q1_spent);
			owner.moveToElement(budget_q1_spent).click().build().perform();
			owner.moveToElement(budget_q1_spent).sendKeys(budgetq1).build();
			Reporter.log("budget entered for q1", true);
			waitUntilElementToBeClickable(budget_q2_spent);
			owner.moveToElement(budget_q2_spent).click().build().perform();
			owner.moveToElement(budget_q2_spent).sendKeys(budgeq2).build();
			Reporter.log("budget entered for q2", true);
			log.info("Executed enterBudgetCosts successfully");
		} catch (Exception e) {
			Reporter.log(e.getMessage());
			log.info("Executed enterBudgetCosts not successfully");
		}
	}

	public void clickOnEdtitBudgetIcon() {
		try {
			log.info("Entered ClickOnEdtitBudgetIcon successfully");
			Actions owner = new Actions(webDriver);
			Assert.assertTrue(edit_budget_icon.isDisplayed(), "Edit Icon is displayed");
			owner.moveToElement(edit_budget_icon).click().perform();
			Reporter.log("edit_budget_icon  clicked", true);
			clickonNextInAddBudget();
			enterBudgetCosts("3000", "4000");
			log.info("Executed ClickOnEdtitBudgetIcon successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed ClickOnEdtitBudgetIcon not successfully");
		}
	}

	public void ClickOnUpdateBudget() {
		try {
			log.info("Entered ClickOnUpdateBudget successfully");
			Actions owner = new Actions(webDriver);
			owner.moveToElement(update_budget_button).click().build().perform();
			Reporter.log("Update budget  clicked", true);
			log.info("Executed ClickOnUpdateBudget successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed ClickOnUpdateBudget not successfully");
		}

	}

	public void clickOnDeleteBudgetIcon() {
		try {
			log.info("Entered clickOnDeleteBudgetIcon successfully");
			Actions owner = new Actions(webDriver);
			Assert.assertTrue(delete_budget_icon.isDisplayed(), "Delete Icon is displayed");
			owner.moveToElement(delete_budget_icon).click().build().perform();
			Reporter.log("******delete_budget_icon  clicked*******", true);
			waitUntilElementToBeClickable(yes_delete_button);
			click(yes_delete_button);
			Reporter.log("*******Confirmed and Budget deleted*******", true);
			log.info("Executed clickOnDeleteBudgetIcon successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickOnDeleteBudgetIcon not successfully");
		}
	}

	public void clickOnCreateInitiative() {
		try {
			log.info("Entered clickOnCreateInitiative successfully");
			Actions prm = new Actions(webDriver);
			prm.moveToElement(Create_Initiative__button).build().perform();
			prm.moveToElement(Create_Initiative__button).click().perform();
			Reporter.log("*******create initiative clicked*******", true);
			log.info("Executed clickOnCreateInitiative successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickOnCreateInitiative not successfully");
		}

	}

	public void addInitiativeDetails(String progName) {
		try {
			log.info("Entered addInitiativeDetails successfully");
			Actions risk = new Actions(webDriver);
			risk.moveToElement(Initiative_name).doubleClick().build().perform();
			risk.moveToElement(Initiative_name).sendKeys(progName + BasePage.getTimestamp()).build().perform();
			Reporter.log("******* initiative name entered *******", true);

			risk.moveToElement(Risk_Desc_label).doubleClick().build().perform();
			risk.moveToElement(Risk_Desc_label).sendKeys(progName + BasePage.getTimestamp()).build().perform();
			Reporter.log("******* initiative description entered *******", true);
			waitUntilElementToBeClickable(startdate);
			click(startdate);
			WebElement dayEle = webDriver.findElement(By.xpath("(//div[@class='btn-light ng-star-inserted'])[1]"));
			click(dayEle);
			Reporter.log("*******start date is entered**********", true);
			waitUntilElementToBeClickable(endDate);
			click(endDate);
			WebElement dayEle1 = webDriver.findElement(By.xpath("(//div[@class='btn-light ng-star-inserted'])[2]"));
			dayEle1.click();
			risk.moveToElement(weightage_value).doubleClick().build().perform();
			risk.moveToElement(weightage_value).sendKeys("100").build().perform();
			Reporter.log("******* initiative weightage entered *******", true);
			writeText(Objective, progName + BasePage.getTimestamp());
			Reporter.log("******* initiative objective entered *******", true);

			clickOnAddDeliverables(progName);
			log.info("Executed addInitiativeDetails successfully");
		} catch (Exception e) {
			Reporter.log(e.getMessage());
			log.info("Executed addInitiativeDetails not successfully");
		}

	}

	public void clickOnInitiativeCreated() {

		try {
			log.info("Entered clickOnInitiativeCreated successfully");
			waitUntilElementVisible(inititativeAdded_value);
			waitUntilElementToBeClickable(inititativeAdded_value);
			click(inititativeAdded_value);
			Reporter.log("******* initiative created entered *******", true);
			log.info("Executed clickOnInitiativeCreated successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickOnInitiativeCreated not successfully");
		}
	}

	public void modifyInitiativeValues(String progName) {

		try {
			log.info("Entered modifyInitiativeValues successfully");
			writeText(Objective, progName + BasePage.getTimestamp());
			Reporter.log("******* initiative objective modified *******", true);
			log.info("Executed modifyInitiativeValues successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed modifyInitiativeValues not successfully");
		}
	}

	public void clickOnUpdateInitiative() {

		try {
			log.info("Entered clickOnUpdateInitiative successfully");
			waitUntilElementVisible(update_initiative_button);
			waitUntilElementToBeClickable(update_initiative_button);
			click(update_initiative_button);
			Reporter.log("******* initiative modified and clicked on Update button  *******", true);
			log.info("Executed clickOnUpdateInitiative successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickOnUpdateInitiative not successfully");
		}
	}

	public void clickOnCreateMileStone() {

		try {
			log.info("Entered clickOnCreateMileStone successfully");
			waitUntilElementVisible(Create_Milestone_button);
			waitUntilElementToBeClickable(Create_Milestone_button);
			click(Create_Milestone_button);
			Reporter.log("******* Create_Milestone_button clicked *******", true);
			log.info("Executed clickOnCreateMileStone successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickOnCreateMileStone not successfully");
		}
	}

	public void enterMileStoneDetails(String progName) {

		try {
			log.info("Entered enterMileStoneDetails successfully");
			Actions weigtage = new Actions(webDriver);
			writeText(Programname, progName + BasePage.getTimestamp());
			writeText(Description, progName + BasePage.getTimestamp());
			click(startdate);
			WebElement dayEle = webDriver.findElement(By.xpath("(//div[@class='btn-light ng-star-inserted'])[1]"));
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
			js.executeScript("arguments[0].click();", dayEle);
			Reporter.log("*******start date is entered**********", true);
			click(endDate);
			WebElement dayEle1 = webDriver.findElement(By.xpath("(//div[@class='btn-light ng-star-inserted'])[1]"));
			js.executeScript("arguments[0].click();", dayEle1);
			weigtage.moveToElement(Milestone_Weightage).doubleClick().build().perform();
			weigtage.moveToElement(Milestone_Weightage).sendKeys("100").build().perform();
			Reporter.log("******* initiative weightage entered *******", true);
			Reporter.log("******* Milestone deatils entered*******", true);
			log.info("Executed enterMileStoneDetails successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed enterMileStoneDetails not successfully");
		}
	}

	public void enterMileStone(String milestoneV1) {
		try {
			log.info("Entered enterMileStone successfully");
			Actions owner = new Actions(webDriver);
			Assert.assertTrue(UpdatePlan_Header.isDisplayed(), "UpdatePlan_Header in MileStones NOT is displayed");
			Reporter.log("******* Milestone_Update plan Header is displayed*******");
			doHover(Milestone_planvalues);
			Reporter.log("******* Milestone hovered entered*******", true);
			Assert.assertTrue(Milestone_planvalues.isDisplayed(), "Milestone_planvalues  is not displayed");
			owner.moveToElement(Milestone_planvalues).doubleClick().build().perform();
			Reporter.log("******* Milestone clicked entered*******", true);
			owner.moveToElement(Milestone_planvalues).sendKeys(milestoneV1).build().perform();
			Reporter.log("Milestone Value entered", true);
			log.info("Executed enterMileStone successfully");
		} catch (Exception e) {
			Reporter.log(e.getMessage());
			log.info("Executed enterMileStone not successfully");
		}
	}

	public void modifyMileStoneValue(String progName) {

		try {
			log.info("Entered modifyMileStoneValue successfully");
			writeText(Description, progName + BasePage.getTimestamp());
			Reporter.log("******* MileStone Description modified *******", true);
			log.info("Executed modifyMileStoneValue successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed modifyMileStoneValue not successfully");
		}
	}

	public void ClickOnEdtitMilestonetIcon() {
		try {
			log.info("Entered ClickOnEdtitMilestonetIcon successfully");
			Reporter.log("Edit milestone icon clicked");
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
			js.executeScript("arguments[0].click();", Edit_MiletstoneIcon);

			// owner.moveToElement(Edit_MiletstoneIcon).click().build().perform();
			Reporter.log("Edit_Miletstone Icon  clicked", true);
			log.info("Executed ClickOnEdtitMilestonetIcon successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed ClickOnEdtitMilestonetIcon not successfully");
		}

	}

	public void ClickOnEdtitBudgetSpentIcon() {
		try {
			log.info("Entered ClickOnEdtitBudgetSpentIcon successfully");
			Actions owner = new Actions(webDriver);
			Assert.assertTrue(Budget_plussymbol.isDisplayed(), "Budget_plussymbol Icon is displayed");
			owner.moveToElement(Budget_plussymbol).click().perform();
			Reporter.log("Budget_plussymbol  clicked", true);
			owner.moveToElement(Edit_spent_values).click().perform();
			Reporter.log("Edit_spent_values  clicked", true);
			enterBudgetCosts("3000", "4000");
			log.info("Executed ClickOnEdtitBudgetSpentIcon successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed ClickOnEdtitBudgetSpentIcon not successfully");
		}
	}

	public void clickOnConfirm() {
		try {
			log.info("Entered clickOnConfirm successfully");
			click(Confirm_button);
			Reporter.log("Confirm_button  clicked", true);
			log.info("Executed clickOnConfirm successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickOnConfirm not successfully");
		}

	}

	public void clickOnPublish_button() {
		try {
			log.info("Entered clickOnPublish_button successfully");
			click(Publish_button);
			Reporter.log("Publish_button clicked", true);
			click(OK_button);
			Reporter.log("OK_button clicked", true);
			log.info("Executed clickOnPublish_button successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickOnPublish_button not successfully");
		}

	}

	public void clickOnCommentsAttachmentIcon() {
		try {
			log.info("Entered clickOnCommentsAttachmentIcon successfully");
			click(mileStone_comments);
			Reporter.log("mileStone_comments/attachments icon clicked", true);
			log.info("Executed clickOnCommentsAttachmentIcon successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickOnCommentsAttachmentIcon not successfully");
		}

	}

	public void addCommentsForPost(String progName) {
		try {
			log.info("Entered addCommentsForPost successfully");
			writeText(WriteComment, progName + BasePage.getTimestamp());
			Reporter.log("comments added to Post", true);
			log.info("Executed addCommentsForPost successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed addCommentsForPost not successfully");
		}

	}

	public void clickOnChooseFileForPost() {
		click(choosefile_icon);
		Reporter.log("choosefile_icon clicked", true);
		choosefile_icon.sendKeys("C:\\TESTDOC\\DUMMYTEXT.txt");
		Reporter.log("FILE UPLOADED SUCCESFULLY", true);
		Reporter.log("file uploaded ");

	}

	public void clickOnPostButton() {
		try {
			log.info("Entered clickOnPostButton successfully");
			click(post_button);
			Reporter.log("post_button clicked", true);
			log.info("Executed clickOnPostButton successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed clickOnPostButton not successfully");
		}

	}

}
