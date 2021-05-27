package pageObjects;

import static org.testng.Assert.assertTrue;
import helper.LoggerHelper;
import org.apache.log4j.Logger;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PerformanceProgramMonitorPage extends BasePage {

	Logger log = LoggerHelper.getLogger(LoggerHelper.class);

	public PerformanceProgramMonitorPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "(//h6[contains(@class,'text-primary')])[1]")
	private WebElement firstActiveProgram;
	
	@FindBy(how = How.XPATH, using = "//h6[normalize-space()='Force Close']")
	private WebElement lnk_forceClose;
	
	@FindBy(how = How.CSS, using = "h6[class='mb-lg-0 text-truncate text-primary']")
	private WebElement clk_EmployeeNameFromList;
	
	@FindBy(how = How.XPATH, using = "//label[@for='checkbox_0']")
	private WebElement clk_checkboxForEmp;
	
	@FindBy(how = How.XPATH, using = "(//*[@id=\"dropdownBasic1\"])[2]")
	private WebElement actions_dropDown;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Show items per page')]/following-sibling::select")
	private WebElement dd_pagination;

	@FindBy(how = How.XPATH, using = "//i[@ng-reflect-ngb-tooltip='Show Search Options']")
	private WebElement showSearchOpt;

	@FindBy(how = How.XPATH, using = "//button[text()='Reset']") ////a[normalize-space()='Reset']
	private WebElement reset_lnk;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Reset']")
	private WebElement reset_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Search')]")
	private WebElement search_btn;

	@FindBy(how = How.ID, using = "nameOrCode")
	private WebElement enterNameOrCode;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Status')]/../descendant::div[@class='selected-list']")
	private WebElement statusDrpDwn;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Status')]/../descendant::ul/descendant::label[2]")
	private WebElement activeCheck;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Supervisor')]/../descendant::div[@class='selected-list']")
	private WebElement supervisorDrpDwn;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search supervisors' and @type='text']")
	private WebElement selectSupervisorTxt;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Supervisor')]/../descendant::ul/descendant::label[2]")
	private WebElement selectSupervisorFromList;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Designation')]/../descendant::div[@class='selected-list']")
	private WebElement designationDrpDwn;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search designations' and @type='text']")
	private WebElement searchDesignation_Txt;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Designation')]/../descendant::ul/descendant::label[text()='CEO']")
	private WebElement selectDesignationFromList;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Grade')]/../descendant::div[@class='selected-list']")
	private WebElement gradeDrpDwn;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search grades' and @type='text']")
	private WebElement gradeSearch_Txt;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Grade')]/../descendant::ul/descendant::label[text()='G01']")
	private WebElement selectGradeFrom_List;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Job category')]/../descendant::div[@class='selected-list']")
	private WebElement jobcategoryDrpDwn;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Job category')]/../descendant::ul/descendant::label[text()='CEO']")
	private WebElement selectjobcategoryFromList;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search job category' and @type='text']")
	private WebElement jobcategory_Txt;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Employment type')]/../descendant::div[@class='selected-list']")
	private WebElement empTypeDrpDwn;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search employment type' and @type='text']")
	private WebElement empType_Txt;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Employment type')]/../descendant::ul/descendant::label[text()='JMGR']")
	private WebElement selectEmpTypeFromList;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Organisation Unit')]/../descendant::div")
	private WebElement orgUnitDrpDwn;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Apple')]")
	private WebElement apple_Org_Unit;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Apply')]")
	private WebElement applyBtn;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Name')]/../../following-sibling::div/div[2]")
	private List<WebElement> empNameinFirstPage;

	@FindBy(how = How.XPATH, using = "//h6[text()='EMP1']")
	private WebElement filtered_Emp;

	@FindBy(how = How.XPATH, using = "//select[@name='scorecardStatus']")
	private WebElement statusFilter_Drpdwn;

	@FindBy(how = How.XPATH, using = "//h6[contains(@class,'float-left mb-')]")
	private WebElement lbl_pagination;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'relative w-')]//input[@placeholder='Enter Employee Id or Name or Email']")
	private WebElement filter_txt;

	@FindBy(how = How.XPATH, using = "//h6[text()='EMP0056']/../../descendant::i[@class='fa fa-ellipsis-h']")
	private WebElement ellipsis_link;

	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Unenroll']")
	private WebElement unenroll_link;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Confirm')]")
	private WebElement confirm_popUpBtn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Employee to Program')]")
	private WebElement addEmpToProg_Btn;

	@FindBy(how = How.CSS, using = "textarea[class='form-control w-100 float-left resize-text-area ng-untouched ng-pristine ng-valid']")														 
//	@FindBy(how = How.XPATH, using = "//textarea[@class='form-control w-100 float-left resize-text-area ng-pristine ng-valid ng-touched']")
//	@FindBy(how = How.XPATH, using = "//textarea[@name='empCodeToEnroll']")
	private WebElement includeEmpToProg_Txt;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Enroll Employees')]")
	private WebElement enroll_employees;

	/// resetScorecard
	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Code')]/../../following-sibling::div/div[3]//h6")
	private List<WebElement> lnk_username;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Monitor View Program')]")
	private WebElement txt_VerifyMonitorPage;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Reset Scorecard')]")
	private WebElement lnk_resetscorecard;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Scorecard Created')]")
	private WebElement chk_ScorecardCreated;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Pending Approval')]")
	private WebElement chk_PendingApproval;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Scorecard Published')]")
	private WebElement chk_ScorecardPublished;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Review Completed')]")
	private WebElement chk_ReviewCompleted;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Review Published')]")
	private WebElement chk_ReviewPublished;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Pending Review for Approval')]")
	private WebElement chk_PendingReviewforApproval;

	@FindBy(how = How.XPATH, using = "//label[contains(text(), 'Pending Verification')]")
	private WebElement chk_PendingVerification;

	@FindBy(how = How.XPATH, using = "//label[contains(text(), 'Pending Review Verification')]")
	private WebElement chk_PendingReviewVerification;

	@FindBy(how = How.XPATH, using = "//textarea[@name='resetReason']")
	private WebElement txt_resetReason;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Change')]")
	private WebElement btn_reset;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Change Approver')]/i")
	private WebElement btn_changeApprover;

	//@FindBy(how = How.XPATH, using = "//label[contains(text(),'Primary Approver')]/../div[1]/div[1]/input[1]")
	@FindBy(how = How.XPATH, using = "//input[@id='sup']")
	private WebElement txt_changePrimaryApprover;

	//@FindBy(how = How.XPATH, using = "//*[contains(text(),'Secondary Approver')]/../div[1]/div[1]/input[1]")
	@FindBy(how = How.XPATH, using = "//input[@id='verifier']")
	private WebElement txt_changeSecondaryApprover;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'verifier')]/../div[1]/input[1]")
	private WebElement txt_changeEmployeeVerifier;

	@FindBy(how = How.XPATH, using = "//textarea[@name='changeApproverComment']")
	private WebElement txt_changeApproverComments;

	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Comment here..']")
	private WebElement txt_CommentReason;
	
	@FindBy(how = How.XPATH, using = "//button[@name='saveChangeApprover']")
	private WebElement btn_changeApproverSave;

	public void goToProgramMonitorPage() {
		try{
			log.info("Entered goToProgramMonitorPage succesfully");
			click(firstActiveProgram);
			log.info("Executed goToProgramMonitorPage Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed goToProgramMonitorPage"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void verifyEmpNameinFirstPage() {
		try{
			log.info("Entered verifyEmpNameinFirstPage succesfully");
			System.out.println("Employee list count :" + empNameinFirstPage.size());
			Assert.assertEquals(empNameinFirstPage.size(), 1,
					"Employee count is not matching with show item per page hence >>> Failed");
			log.info("Executed verifyEmpNameinFirstPage Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed verifyEmpNameinFirstPage");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void getSearchFilter() {
		try{
			log.info("Entered getSearchFilter succesfully");
			click(showSearchOpt);
			// status
			click(statusDrpDwn);
			click(activeCheck);
			// supervisor
			click(supervisorDrpDwn);
			writeText(selectSupervisorTxt, "Thomas Monroe");
			Thread.sleep(500);
			// waitUntilElementToBeClickable(selectSupervisorFromList);
			click(selectSupervisorFromList);
			// Org unit
			click(orgUnitDrpDwn);
			click(apple_Org_Unit);
			// designation
			click(designationDrpDwn);
			writeText(searchDesignation_Txt, "CEO");
			Thread.sleep(500);
			// waitUntilElementToBeClickable(selectDesignationFromList);
			click(selectDesignationFromList);
			// Gread
			click(gradeDrpDwn);
			writeText(gradeSearch_Txt, "G01");
			Thread.sleep(500);
			// waitUntilElementToBeClickable(selectGradeFrom_List);
			click(selectGradeFrom_List);
			// Jobcategory
			click(jobcategoryDrpDwn);
			writeText(jobcategory_Txt, "CEO");
			Thread.sleep(500);
			// waitUntilElementToBeClickable(selectjobcategoryFromList);
			click(selectjobcategoryFromList);
			// employee type
			click(empTypeDrpDwn);
			writeText(empType_Txt, "JMGR");
			Thread.sleep(500);
			// waitUntilElementToBeClickable(selectEmpTypeFromList);
			click(selectEmpTypeFromList);
			// waitUntilElementToBeClickable(enterNameOrCode);
			Thread.sleep(500);
			// need click on empcode text, bcoz dropdown pop up is not hidding.
			click(enterNameOrCode);
			Thread.sleep(500);
			// waitUntilElementToBeClickable(applyBtn);
			click(applyBtn);
			log.info("Executed getSearchFilter Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed getSearchFilter"); 
			e.printStackTrace(); 
			Assert.fail();
		}
	}

	public void verfiyEmployeeAfterFilter() {
		try{log.info("Entered verfiyEmployeeAfterFilter succesfully");
		waitUntilElementToBeClickable(filtered_Emp);
		Assert.assertEquals(filtered_Emp.getText(), "EMP1",
				"Employee name is not expected after applying filter hence >>> Failed");
		log.info("Executed verfiyEmployeeAfterFilter Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed verfiyEmployeeAfterFilter");
			e.printStackTrace(); 
			throw e;
		}
	}

	public Integer getTotalCount() {
		try{
			log.info("Entered getTotalCount succesfully");
		String paginationTxtStr = readText(lbl_pagination);
		String[] dataSplit = paginationTxtStr.split("items of");
		Integer totalCount = Integer.parseInt(dataSplit[1].trim());
		log.info("Executed getTotalCount Successfully");
		return totalCount;

		} 
		catch  (Exception e) 
		{
			log.error("Not Executed getTotalCount"); 
			e.printStackTrace(); 
			throw e;

		}
	}

	public void verifyStatusOfAnEmp() {
		try{
			log.info("Entered verifyStatusOfAnEmp succesfully");
			String[] status = { "All", "Draft", "Created", "Rejected Scorecard", "Submitted", "Pending Verification",
					"Published", "Update Due", "Submit Review", "Pending Review Verification", "Review Completed",
					"Failed", "Finalized" };
			List<WebElement> listOfOpt = webDriver.findElements(By.xpath("//select[@name='scorecardStatus']/option"));
			for (int i = 0; i < listOfOpt.size(); i++) {
				setValueInDropdownText(statusFilter_Drpdwn, status[i]);
				System.out.println(status[i]);
				if (status[i] == "Created") {
					Assert.assertTrue(getTotalCount().equals(1), "Employee status total count. Expected: 1, Actual: 0");
					System.out.println("Total count is matching hence >>> Passed");
				}
			}
			log.info("Executed verifyStatusOfAnEmp Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed verifyStatusOfAnEmp"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void resetSearchFilter() {
		try{
			log.info("Entered resetSearchFilter succesfully");
			// change status into all
			setValueInDropdownText(statusFilter_Drpdwn, "All");
			waitUntilElementVisible(showSearchOpt);
			// reset filter
			click(showSearchOpt);
			click(reset_lnk);
			click(applyBtn);
			log.info("Executed resetSearchFilter Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed resetSearchFilter"); 
			e.printStackTrace();
			throw e;
		}
	}

	
	public void UnerollEmployeeToProgram(String empCode) {
		try{log.info("Entered UnerollEmployeeToProgram succesfully");
		// unenroll employee
		writeText(filter_txt, empCode);
		click(search_btn);
		Thread.sleep(1000);
		click(ellipsis_link);
		Thread.sleep(500);
		click(unenroll_link);
		click(confirm_popUpBtn);
		log.info("Executed UnerollEmployeeToProgram Successfully");
		} catch  (Exception e) {
			log.error("Not Executed UnerollEmployeeToProgram"); 
			e.printStackTrace(); 
			Assert.fail();
		}
	}

	public void textEdit_filterToSearch(String empCode) {
		try{log.info("Entered TextEdit_filterToSearch succesfully");
		writeText(filter_txt, empCode);
		click(search_btn);
		Thread.sleep(1000);
		click(clk_checkboxForEmp);
		log.info("Executed TextEdit_filterToSearch Successfully");
		} catch  (Exception e) {
			log.error("Not Executed TextEdit_filterToSearch"); 
			e.printStackTrace(); 
			Assert.fail();
		}
	}
	
	public void actions_dropDown() {
		try{log.info("Entered Actions_dropDown succesfully");
		click(actions_dropDown);
		log.info("Executed Actions_dropDown Successfully");
		} catch  (Exception e) {
			log.error("Not Executed Actions_dropDown"); 
			e.printStackTrace(); 
			Assert.fail();
		}
	}
	
	public void reset_btn() {
		try{log.info("Entered Reset_btn succesfully");
		click(reset_btn);
		log.info("Executed Reset_btn Successfully");
		} catch  (Exception e) {
			log.error("Not Executed Reset_btn"); 
			e.printStackTrace(); 
			//Assert.fail();
		}
	}
	
	public void Confirm_popUpBtn() {
		try{log.info("Entered Confirm_popUpBtn succesfully");
		click(confirm_popUpBtn);
		log.info("Executed Confirm_popUpBtn Successfully");
		} catch  (Exception e) {
			log.error("Not Executed Confirm_popUpBtn"); 
			e.printStackTrace(); 
			//Assert.fail();
		}
	}
	
	
	public void Link_forceClose() {
		try{log.info("Entered Link_forceClose succesfully");
		click(lnk_forceClose);
		log.info("Executed Link_forceClose Successfully");
		} catch  (Exception e) {
			log.error("Not Executed Link_forceClose"); 
			e.printStackTrace(); 
			//Assert.fail();
		}
	}
	
	
	public void click_EmployeeNameFromList() {
		try{log.info("Entered Click_EmployeeNameFromList succesfully");
		click(clk_EmployeeNameFromList);
		log.info("Executed Click_EmployeeNameFromList Successfully");
		} catch  (Exception e) {
			log.error("Not Executed Click_EmployeeNameFromList"); 
			e.printStackTrace(); 
			//Assert.fail();
		}
	}
	
	public void addEmployeeToProgram(String empCode) {
		try{
			log.info("Entered addEmployeeToProgram succesfully");
			waitUntilElementToBeClickable(addEmpToProg_Btn);
			click(addEmpToProg_Btn);
			waitFor(1000);
			writeText(includeEmpToProg_Txt, empCode);
			waitFor(1000);
			click(enroll_employees);
			waitFor(1000);
			log.info("Executed addEmployeeToProgram Successfully");
		}
		catch  (Exception e) 
		{
			log.error("Not Executed addEmployeeToProgram"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	// reset scorecard
	public void clickOnSupervisorName(String Code) {
		try{
			log.info("Entered clickOnSupervisorName succesfully");
			for (int i = 0; i < lnk_username.size(); i++) {
				if (lnk_username.get(i).getText().equalsIgnoreCase(Code)) {
					waitUntilElementToBeClickable(lnk_username.get(i));
					click(lnk_username.get(i));
				} else {
					System.out.println(Code + " Not in program");
				}
			}
			log.info("Executed clickOnSupervisorName Successfully");
		} 
		catch  (Exception e)
		{
			log.error("Not Executed clickOnSupervisorName"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void VerifyMonitorPage() {
		try{
			log.info("Entered VerifyMonitorPage succesfully");
			waitUntilElementVisible(txt_VerifyMonitorPage);
			assertTrue(txt_VerifyMonitorPage.getText().equalsIgnoreCase("Monitor View Program"), "Not In Monitor page");
			log.info("Executed VerifyMonitorPage Successfully");
		} 
		catch  (Exception e)
		{
			log.error("Not Executed VerifyMonitorPage"); 
			e.printStackTrace();
			throw e;
		}
	}

	
	
	
	public void clickOnResetScorecard() {
		try{
			log.info("Entered clickOnResetScorecard succesfully");
			waitUntilElementToBeClickable(lnk_resetscorecard);
			click(lnk_resetscorecard);
			log.info("Executed clickOnResetScorecard Successfully");
		}
		catch  (Exception e) 
		{
			log.error("Not Executed clickOnResetScorecard"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void resetToScorecardCreated() {
		try{
			log.info("Entered ResetToScorecardCreated succesfully");
			waitUntilElementToBeClickable(chk_ScorecardCreated);
			click(chk_ScorecardCreated);
			waitFor(3000);
			log.info("Executed ResetToScorecardCreated Successfully");
		} catch  (Exception e) 
		{
			log.error("Not Executed ResetToScorecardCreated"); 
			e.printStackTrace();
			throw e;
		}
	}

	public void resetToPendingAproval() {
		try{
			log.info("Entered ResetToPendingAproval succesfully");
			waitUntilElementToBeClickable(chk_PendingApproval);
			click(chk_PendingApproval);
			log.info("Executed ResetToPendingAproval Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed ResetToPendingAproval");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void ResetToPendingverify() {
		try{
			log.info("Entered ResetToPendingverify succesfully");
			waitUntilElementToBeClickable(chk_PendingVerification);
			click(chk_PendingVerification);
			log.info("Executed ResetToPendingverify Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed ResetToPendingverify"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void ResetToScorecardPublished() {
		try{
			log.info("Entered ResetToScorecardPublished succesfully");
			waitUntilElementToBeClickable(chk_ScorecardPublished);
			click(chk_ScorecardPublished);
			log.info("Executed ResetToScorecardPublished Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed ResetToScorecardPublished"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void ResetToPendingReviewForApproval() {
		try{
			log.info("Entered ResetToPendingReviewForApproval succesfully");
			waitUntilElementToBeClickable(chk_PendingReviewforApproval);
			click(chk_PendingReviewforApproval);
			log.info("Executed ResetToPendingReviewForApproval Successfully");
		}
		catch  (Exception e)
		{
			log.error("Not Executed ResetToPendingReviewForApproval");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void ResetToPendingReviewForverify() {
		try{
			log.info("Entered ResetToPendingReviewForverify succesfully");
			waitUntilElementToBeClickable(chk_PendingReviewVerification);
			click(chk_PendingReviewVerification);
			log.info("Executed ResetToPendingReviewForverify Successfully");
		} 
		catch  (Exception e)
		{
			log.error("Not Executed ResetToPendingReviewForverify");
			e.printStackTrace();
			throw e;
		}
	}

	public void ResetToPendingReviewForCompleted() {
		try{
			log.info("Entered ResetToPendingReviewForCompleted succesfully");
			waitUntilElementToBeClickable(chk_ReviewCompleted);
			click(chk_ReviewCompleted);
			log.info("Executed ResetToPendingReviewForCompleted Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed ResetToPendingReviewForCompleted"); 
			e.printStackTrace();
			throw e;
		}
	}

	public void ResetToPendingReviewForPublished() {
		try{
			log.info("Entered ResetToPendingReviewForPublished succesfully");
			waitUntilElementToBeClickable(chk_ReviewPublished);
			click(chk_ReviewPublished);
			log.info("Executed ResetToPendingReviewForPublished Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed ResetToPendingReviewForPublished"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void enterTheResetReason(String reason) {
		try{
			log.info("Entered enterTheResetReason succesfully");
			writeText(txt_resetReason, reason);
			log.info("Executed enterTheResetReason Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed enterTheResetReason");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnChange() {
		try{
			log.info("Entered clickOnChange succesfully");
			waitUntilElementToBeClickable(btn_reset);
			click(btn_reset);
//			waitFor(3000);
//			waitUntilElementVisible(txt_VerifyMonitorPage);
			log.info("Executed clickOnChange Successfully");
		}
		catch  (Exception e) 
		{
			log.error("Not Executed clickOnChange"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnChangeApprover() {
		try{
			log.info("Entered clickOnChangeApprover succesfully");
			waitUntilElementToBeClickable(btn_changeApprover);
			log.info("Clicking on Change Approver button !!!!!!!! ");
			click(btn_changeApprover);
			log.info("Clicked on Change Approver button !!!!!!!! ");
			waitUntilElementVisible(txt_changePrimaryApprover);
			log.info("Executed clickOnChangeApprover Successfully");
		} 
		catch  (Exception e)
		{
			log.error("Not Executed clickOnChangeApprover"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void enterPrimaryApprover(String primaryApprover) {
		try{
			log.info("Entered enterPrimaryApprover succesfully");
			String selectAll = Keys.chord(Keys.CONTROL, "a",Keys.DELETE);
			txt_changePrimaryApprover.sendKeys(selectAll);
			writeText(txt_changePrimaryApprover, primaryApprover);
			typeEnterKey(txt_changePrimaryApprover);
			waitFor(1000);
			typeDownKey(txt_changePrimaryApprover);
			waitFor(1000);
			typeEnterKey(txt_changePrimaryApprover);
			waitFor(1000);
			txt_changePrimaryApprover.sendKeys(Keys.TAB, Keys.DELETE);
			log.info("entered primary approver " + primaryApprover);

			log.info("Executed enterPrimaryApprover Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed enterPrimaryApprover"); 
			e.printStackTrace();
			throw e;
		}
	}	



	public void enterVerifier(String verifier) {
		try{
			log.info("Entered enterVerifier succesfully");
			log.info("entering verifier " + verifier);
			writeText(txt_changeEmployeeVerifier, verifier);
			typeEnterKey(txt_changeEmployeeVerifier);
			log.info("entered verifier " + verifier);
			log.info("Executed enterVerifier Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed enterVerifier"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void enterSecondaryApprover(String secondaryApprover) {
		try{
			log.info("Entered enterSecondaryApprover succesfully");
			log.info("entering secondary approver " + secondaryApprover);
//			String selectAll = Keys.chord(Keys.DELETE);
//			txt_changeSecondaryApprover.sendKeys(selectAll);
			waitFor(1000);	
			writeText(txt_changeSecondaryApprover, secondaryApprover);
			typeEnterKey(txt_changeSecondaryApprover);
			waitFor(1000);
			typeDownKey(txt_changeSecondaryApprover);
			waitFor(1000);
			typeEnterKey(txt_changeSecondaryApprover);
			waitFor(1000);
			log.info("entered secondary approver " + secondaryApprover);
			log.info("Executed enterSecondaryApprover Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed enterSecondaryApprover");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void enterChangeApproverComments(String comments) {
		try{
			log.info("Entered enterChangeApproverComments succesfully");
			writeText(txt_changeApproverComments, comments);
			log.info("Executed enterChangeApproverComments Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed enterChangeApproverComments"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void txt_CommentReason(String comments) {
		try{
			log.info("Entered Txt_CommentReason succesfully");
			writeText(txt_CommentReason, comments);
			log.info("Executed Txt_CommentReason Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed Txt_CommentReason"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void clickChangeApproverSave() {
		try{
			log.info("Entered clickChangeApproverSave succesfully");
			waitUntilElementToBeClickable(btn_changeApproverSave);
			log.info("clicking on save button!!!!!!!!!");
			click(btn_changeApproverSave);
			log.info("clicked on save button!!!!!!!!!");
			waitUntilElementVisible(btn_changeApprover);
			waitFor(2000);
			log.info("Executed clickChangeApproverSave Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed clickChangeApproverSave"); 
			e.printStackTrace(); 
			throw e;
		}
	}

}
