package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import config.ConfigFileReader;
import config.ExcelFileReader;

public class EmployeePage extends BasePage {
	

	public EmployeePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[text()='Employees']")
	private WebElement Employeelink;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Back']")
	private WebElement backButton;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Employee')]")
	private WebElement addEmployee_btn;

	@FindBy(how = How.XPATH, using = "//input[@id='empCode']")
	private WebElement EmployeeIdTb;

	@FindBy(how = How.XPATH, using = "//input[@id='dname']")
	private WebElement EmployeeDisplayNameTb;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	private WebElement EmployeeEmailTb;

	@FindBy(how = How.XPATH, using = "//input[@name='organizationModel']")
	private WebElement EmployeeOrgUnitTb;

	@FindBy(how = How.XPATH, using = "//input[@id='Username']")
	private WebElement EmployeeUserNameTb;

	@FindBy(how = How.XPATH, using = "//input[@name='JoinDate']")
	private WebElement EmployeeDateOfHireTb;
	
	@FindBy(how = How.XPATH, using = "//input[@name='primarySupervisorModel']")
	private WebElement SupervisorIdTb;

	@FindBy(how = How.XPATH, using = "//div[@title='Add secondary supervisor']/preceding-sibling::div/div/input[@id='sup']")
	private WebElement SecondarySupervisorIdTb;

	@FindBy(how = How.XPATH, using = "//input[@id='verifier']")
	private WebElement VerifierIdTb;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Reason')]/following-sibling::textarea") //"//label[contains(text(),'Reason')]/following-sibling::input")
	private WebElement UpdateReasonTb;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),' Select the program for which supervisors has to be updated ')]/../div[1]//input[@type='checkbox']/..")
	private WebElement UpdateProgramNameSelectAllChk;	

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save Employee')]")
	private WebElement SaveButton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'save')]")
	private WebElement SaveInUpdatePopupButton;

	@FindBy(how = How.XPATH, using = "//h6[text()='Update supervisor for program']")
	private WebElement locatorForEmpUpdateSelectProgram;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Update Employee')]")
	private WebElement UpdateButton;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-calendar']")
	private WebElement calenderBtn;

	@FindBy(how = How.XPATH, using = "//div[@class='ng2-auto-complete-wrapper']//ng2-auto-complete//ul//li")
	private List<WebElement> locatorForDropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='emplSearch']")
	private WebElement SearchTextField;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Search')]")
	private WebElement SearchButton;

	@FindBy(how = How.XPATH, using = "//h6[@class='mb-lg-0']/../..//h6[contains(text(),'Automation')]") //"//h6[@class='mb-lg-0']/../..//h6[contains(text(),'Automation1')]")
	private WebElement SearchText;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-ellipsis-h']")
	private WebElement ActionLInk;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Suspend')]")
	private WebElement SuspendLink;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Active')]")
	private WebElement ActiveLInk;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Confirm')]")
	private WebElement ConfirmButton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Resign')]")
	private WebElement ResignButton;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Switch User Permission')]")
	private WebElement switchPermission_link;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Users')]")
	private WebElement addUsers_btn;

	@FindBy(how = How.ID, using = "everyonein")
	private WebElement includeEveryOneIn_chkbx;

	@FindBy(how = How.ID, using = "everyone")
	private WebElement includeEveryOne_chkbx;

	@FindBy(how = How.ID, using = "except")
	private WebElement includeEveryOneExcept_chkbx;

	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Enter Employee Code']")
	private WebElement empId_textArea;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Validate and Add')]")
	private WebElement validateAndAdd_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Employees')]")
	private WebElement addEmployees_btn;

	@FindBy(how = How.XPATH, using = "//input[@name='emplSearch']")
	private WebElement search_textBox;
	
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Reset Password')]")
	private WebElement ResetPassword_btn;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Search')]")
	private WebElement search_btn;

	@FindBy(how = How.XPATH, using = "//div[@class='col-lg-10 col-md-9 col-sm-12 col-xs-12 float-left b-l']//div[2]//div[9]//h6[1]/i") //"//div[@class='col-lg-10 col-md-9 col-sm-12 col-xs-12 float-left b-l']//div[2]//div[9]//h6[1]")
	private WebElement first_ellipsis_btn;

	@FindBy(how = How.XPATH, using = "//div[@class='w-100 float-left p-md-2 grid-details']")
	private List<WebElement> empGridSwitchUser;

	@FindBy(how = How.ID, using = "selectedAllSwitchAble")
	private WebElement selectAll_chkbx;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Edit Profile')]")
	private WebElement editProfile_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Update Employee')]")
	private WebElement updateEmployee_btn;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Resign')]")
	private WebElement resign_btn;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Active')]")
	private WebElement active_btn;
	
	@FindBy(how=How.XPATH,using="//h6[contains(text(),'Are you sure, you want to Resign?')]")
	private WebElement resignPopup_text;
	
	@FindBy(how=How.XPATH,using="//h6[contains(text(),'Are you sure, you want to active employee ?')]")		
	private WebElement activePopUp_txt;
	
	@FindBy(how=How.XPATH,using="//h6[contains(text(),'Are you sure, you want to suspend employee ?')]")		
	private WebElement suspendPopUp_txt;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Activate Employee')]")
	private WebElement activateEmployee_btn;

	@FindBy(how=How.XPATH, using="//input[@name='organizationModel']")
	private WebElement addEmployee_Org_unit;

	@FindBy(how=How.XPATH, using="//ng2-auto-complete/div/ul/li[*]/span")
	private List<WebElement> addEmployee_Org_unit_List;
	
	@FindBy(how=How.CSS, using="div[class='col-lg-10 col-md-9 col-sm-12 col-xs-12 float-left b-l'] div>div>div>div:nth-child(1)")
	private List<WebElement> selectEmployee;
	
	@FindBy(how=How.CSS,using="h6[class='mb-lg-0 text-truncate text-primary']")
	private WebElement verifySearchEmployee;
	
	@FindBy(how=How.XPATH,using="//tbody/tr/td[2]")
	private WebElement verifySupervisorID;
	
	@FindBy(how=How.XPATH,using="//tbody/tr[2]/td[2]")
	private WebElement verifyVerifierID;
	
	public void Verify_SupervisorID() {
		try {
			log.info("Entered Verify_SupervisorID successfully");
			String supervisorId = ExcelFileReader.getCellValue
					("Employee.xlsx", "Employee_Detail", 12, "C");
			Assert.assertTrue(verifySupervisorID.getText().contains(supervisorId),
					"Supervisor ID is not changed");
			log.info("Executed Verify_SupervisorID successfully");
		} catch (Exception e) {
			log.info("error verifying Verify_SupervisorID");
			e.printStackTrace();
		}
	}
	
	
	public void Verify_VerifierID() {
		try {
			log.info("Entered Verify_VerifierID successfully");
			String supervisorId = ExcelFileReader.getCellValue
					("Employee.xlsx", "Employee_Detail", 13, "C");
			Assert.assertTrue(verifyVerifierID.getText().contains(supervisorId),
					"Supervisor ID is not changed");
			log.info("Executed Verify_VerifierID successfully");
		} catch (Exception e) {
			log.info("error verifying Verify_VerifierID");
			e.printStackTrace();
		}
	}
	
	public void VerifySearchEmployee() {
		try {
			log.info("Entered VerifySearchEmployee successfully");
			String employeeId = ExcelFileReader.getCellValue
					("Employee.xlsx", "Employee_Detail", 2, "A");
			String finalEmpId = employeeId+"_"+ConfigFileReader.getExecutionRunCount();
			Assert.assertTrue(verifySearchEmployee.getText().contains(finalEmpId),
					"Employee id is wrong");
			log.info("clicked on VerifySearchEmployee");
			log.info("Executed VerifySearchEmployee successfully");
		} catch (Exception e) {
			log.info("error verifying VerifySearchEmployee");
			e.printStackTrace();
		}
	}

	public void SelectEmployee(String selEmp) {
		try {
			log.info("Entered Employees List Successfully");
			waitFor(1000);
			selectEmployee = webDriver.findElements(By.cssSelector
					("div[class='col-lg-10 col-md-9 col-sm-12 col-xs-12 float-left b-l'] div>div>div>div:nth-child(1)"));
//			click(ele);
            log.info("Collected the Employees List");
            boolean found = false;
			while(!selectEmployee.equals(selEmp)) {
				webDriver.findElement(By.cssSelector("a[aria-label='Next'] span[aria-hidden='true']")).click();
			}
			if(found==true) {
				webDriver.findElement(By.xpath
						//("div:nth-child("+selEmp+") div:nth-child(1) h6:nth-child(1)")).click();
				("//h6[@class='mb-lg-0 text-truncate text-primary'][normalize-space()='\"+selEmp+\"']"));
			}
			log.info("Clicked on selected Employee");
		} catch (Exception e) {
			log.error("Executed Employees List not Successfully");
			e.printStackTrace();
//			Assert.fail();
		}	
	}
	
	
	public void ClickOnEmployeeLink() {
		try {
			log.info("clicking on employee!!");
			click(Employeelink);
			log.info("clicked on employee!!");
		} catch (Exception e) {
			log.error("clicking on employee!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void ClickonAddEmployeeButton() {

		try {
			log.info("clicking on add employee!!");
			click(addEmployee_btn);
			log.info("clicked on add employee!!");
		} catch (Exception e) {
			log.info("error clicking on add employee!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void EnterEmployeeId(String string) {
		try {
			log.info("entering employee id!!");
			writeText(EmployeeIdTb, string);
			log.info("entered employee id!!");
		} catch (Exception e) {
			log.info("error entering employee id!!");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void EnterSupervisorId(String string) {
		try {
			log.info("Entering supervisor " +string + " !!!");
			clear(SupervisorIdTb);
			writeText(SupervisorIdTb, string);
			waitFor(1000);
			typeDownKey(SupervisorIdTb);
			waitFor(1000);
			typeEnterKey(SupervisorIdTb);
			waitFor(1000);
			log.info("Entered supervisor " +string + " !!!");
		} catch (Exception e) {
			log.error("error entering supervisor!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void EnterSecondarySupervisorId(String string) {
		try {
			log.info("Entering secondary supervisor" +string + " !!!");
			clear(SecondarySupervisorIdTb);
			writeText(SecondarySupervisorIdTb, string);
			waitFor(1000);
			typeDownKey(SecondarySupervisorIdTb);
			waitFor(1000);
			typeEnterKey(SecondarySupervisorIdTb);
			waitFor(1000);
			log.info("Entered secondary supervisor" +string + " !!!");
		} catch (Exception e) {
			log.error("error entering secondary supervisor!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void EnterVerifierId(String string) {
		try {
			log.info("Entering verifier " +string + " !!!");
			clear(VerifierIdTb);
			writeText(VerifierIdTb, string);
			waitFor(1000);
			typeDownKey(VerifierIdTb);
			waitFor(1000);
			typeEnterKey(VerifierIdTb);
			waitFor(1000);
			log.info("Entered verifier " +string + " !!!");
		} catch (Exception e) {
			log.error("error entering verifier id!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public boolean isUpdateEmployeeProgramDialogDisplayed() {
		boolean is_Dialog_Displayed = true;
		log.info("Checking Update program selection popup display!!!");
		try {
			is_Dialog_Displayed = locatorForEmpUpdateSelectProgram.isDisplayed();
		} catch (Exception e) {
			is_Dialog_Displayed = false;
			log.info("Update program selection popup not been displayed!!!");
		}
		log.info("Completed checking Update program selection popup display!!!");
		return is_Dialog_Displayed;
	}


	public void ClickOnUpdateButton() {
		try {
			waitFor(6000);
			log.info("Clicking on Update button!!!");
			scrollDown();
			clickOnElementByJs(UpdateButton);

			log.info("Clicked on Update button!!!");
		} catch (Exception e) {
			log.error("error clicking on update button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void SelectProgramNameInUpdateDialog() {
		try {
			log.info("Selecting select all in update dialog !!!");
			click(UpdateProgramNameSelectAllChk);
			log.info("Selected select all in update dialog !!!");
		} catch (Exception e) {
			log.info("error selecting all");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void EnterUpdateReasonRb(String string) {
		try {
			log.info("Entering update reason " +string + " !!!");
			writeText(UpdateReasonTb, string);
			log.info("Entered update reason " +string + " !!!");
		} catch (Exception e) {
			log.error("error entering update reason!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void ClickOnSaveInUpdatePopup() {
		try {
			waitUntilElementToBeClickable(SaveInUpdatePopupButton);
			log.info("Clicking on Save button in Update popup!!!");
			click(SaveInUpdatePopupButton);
			log.info("Clicked on Save button in Update popup!!!");
			waitFor(4000);
		} catch (Exception e) {
			log.error("Error Clicking on Save button in Update popup!!!");
			e.printStackTrace();
			Assert.fail();
		}
	}	

	public void EnterDisplayName(String string) {
		try {
			log.info("entering display name!!"+ string);
			writeText(EmployeeDisplayNameTb, string);
			log.info("entered display name!!"+string);
		} catch (Exception e) {
			log.error("error entering display name!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void EnterEmployeeEmail(String string) {
		try {
			
			log.info("entering employee email!!");
			writeText(EmployeeEmailTb, string);
			log.info("entered employee email!!");
		} catch (Exception e) {
			log.error("entering employee email!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void EnterOrganizationUnit(String string) {
		try {
			log.info("entering org unit!!");
			typeTextToGetDropdown(EmployeeOrgUnitTb, string, locatorForDropdown);

			waitFor(4000);
			log.info("entered org unit!!");
		} catch (Exception e) {
			log.error("error entering org unit!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void EnterEmployeeUserName(String string) {
		try {
			log.info("entering employee user name!!");
			writeText(EmployeeUserNameTb, string);
			waitFor(4000);
			log.info("entered employee user name!!");
		} catch (Exception e) {
			log.error("error entering employee user name!!");
			e.printStackTrace();
		}
	}

	public void selectJoinDate(int year, int month, int date) {
		try {
			log.info("selecting join date!!");
			waitFor(3000);
			setDateInDatePicker(EmployeeDateOfHireTb, year, month, date);
			log.info("selected join date!!");
		} catch (Exception e) {
			log.error("error selecting join date!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void ClickOnSaveButton() {
		try {
			log.info("clicking on save button");
			waitUntilElementToBeClickable(SaveButton);
			click(SaveButton);
			waitFor(4000);
			log.info("clicked on save button");
		} catch (Exception e) {
			log.error("error clicking on save button");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void calenderBtnClick(int year, int month, int day) {
		try {
			log.info("selecting date");
			setDateInDatePicker(calenderBtn, year, month, day);
			log.info("selected date");
		} catch (Exception e) {
			log.error("error selecting date");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void EnterSearchField(String string) {
		try {
			log.info("entering text for search as:" +string);
			waitFor(2000);
			writeText(SearchTextField, string);
			log.info("entered text for search as:" +string);
		} catch (Exception e) {
			log.error("error entering text for search as:" +string);
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void ClickOnSearchButton() {
		try {
			log.info("clicking on search button!!");
			click(SearchButton);
			waitFor(4000);
			log.info("clicked on search button!!");
		} catch (Exception e) {
			log.error("error clicking on search button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyData() {
		try {
			log.info("verfiying data");
			//Assert.assertEquals(verifyData("Automation1", SearchText), true);
			Assert.assertEquals(verifyData("Automation User", SearchText), true);
			log.info("verfied data");
		} catch (Exception e) {
			log.error("error verfiying data");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void ClickonACtions() {
		try {
			log.info("Entered ClickonACtions");
			//waitUntilElementToBeClickableRepeated(ActionLInk,2);
			waitFor(1000);
			log.info("Clicking ActionLInk");
			click(ActionLInk);
			waitFor(3000);
			log.info("Executed ClickonACtions Successfully");
		} catch (Exception e) {
			log.info("Executed ClickonACtions Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void ClickOnSuspend() {
		click(SuspendLink);
		waitFor(3000);
	}

	public void VerifyActiveLink() {
		try {
			log.info("verifying active link!!");
			Assert.assertEquals(verifyData("Active", ActionLInk), true);
			log.info("verified active link!!");
		} catch (Exception e) {
			log.error("verifying active link!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void ClickOnConfirm() {
		try {
			log.info("Entered ClickOnConfirm");
			log.info("Clicking ConfirmButton");
			click(ConfirmButton);
			String[] messages = {"Success","success"};
			waitForOneOfMessages(messages);
			waitFor(500);
			log.info("Executed ClickOnConfirm Successfully");
		} catch (Exception e) {
			log.info("Executed ClickOnConfirm Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void ClickOnConfirmWithResign() {
		try {
			log.info("Entered ClickOnConfirm");
			log.info("Clicking ConfirmButton");
			click(ConfirmButton);
			waitFor(500);
			click(ResignButton); // confirm on error because of supervisor
			String[] messages = {"Success","success"};
			Assert.assertTrue(waitForOneOfMessages(messages), "S/success did not appear");
			waitFor(500);
			log.info("Executed ClickOnConfirm Successfully");
		} catch (Exception e) {
			log.info("Executed ClickOnConfirm Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}


	public void clickOnSwitchUserPermission() {
		try {
			log.info("clicking on switch user permission!!");
			clickOnElementByJs(switchPermission_link);
			log.info("clicked on switch user permission!!");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("error clicking on switch user permission!!");
			Assert.fail();
		}
	}

	public void clickOnAddUsers() {
		try {
			log.info("clicking on Add users!!");
			click(addUsers_btn);
			log.info("clicked on Add users!!");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("error clicking on Add users!!");
			Assert.fail();
		}
	}

	public void clickOnIncludeUsers(String condition, String value) {
		try {
			if (condition.equalsIgnoreCase("everyonein")) {
				log.info("clicking on include EveryOne In checkbox!!");
				clickOnElementByJs(includeEveryOneIn_chkbx);
				waitFor(2000);
				log.info("clicked on include EveryOne In checkbox!!");
				log.info("entering emp id!!");
				writeText(empId_textArea, value);
				waitFor(2000);
				log.info("entered emp id!!");
			} else if (condition.equals("except")) {
				log.info("clicking on include everyone except!!");
				clickOnElementByJs(includeEveryOneExcept_chkbx);
				log.info("clicked on include everyone except!!");
				log.info("entering emp id for except!!");
				writeText(empId_textArea, value);
				log.info("entered empid for except!!");
			} else {
				log.info("clicking on include everyone!!");
				clickOnElementByJs(includeEveryOne_chkbx);
				log.info("clicked on include  everyone!!");
			}
		} catch (Exception e) {
			log.info("error selecting checkboxes!!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnValidateandAdd() {
		try {
			log.info("clicking on validate and add!!");
			click(validateAndAdd_btn);
			log.info("clicked on validate and add!!");
		} catch (Exception e) {
			log.info("error clicking on validate and add!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnAddEmployees() {
		try {
			log.info("clicking on Add Employees!!");
			click(addEmployees_btn);
			waitFor(3000);
			log.info("clicked on Add Employees!!");
		} catch (Exception e) {
			log.info("error clicking on Add Employees!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void ClickOnResetPassword() {
		try {
			log.info("clicking on Add Employees!!");
			waitUntilElementToBeClickable(ResetPassword_btn);
			log.info("clicking on ResetPassword_btn!!");
			click(ResetPassword_btn);
			waitFor(3000);
			log.info("clicked on Add Employees!!");
		} catch (Exception e) {
			log.info("error clicking on Add Employees!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterEmployeeNameSearch(String empId) {
		try {
			log.info("entering employee id!!");
			writeText(search_textBox, empId);
			log.info("employee id entered!!");

		} catch (Exception e) {
			log.info("error searching!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void ClickOnSearch() {
		try {
			log.info("clicking on search!!");
			waitFor(1000);
			click(search_btn);
			log.info("clicked on search!!");
		} catch (Exception e) {
			log.info("error clicking on search!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnEllipsis() {
		try {
			log.info("clicking on more options!!");
			waitFor(2000);
			clickOnElementByJs(first_ellipsis_btn);
			log.info("clicked on more options!!");
		} catch (Exception e) {
			log.error("error clicking on more options!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void ClickOnEditProfile() {
		try {
			log.info("clicking on edit profile!");
			clickOnElementByJs(editProfile_btn);
			log.info("clicked on edit profile!!");
			waitFor(3000); 
		} catch (Exception e) {
			log.info("error clicking on edit profile!!");
			Assert.fail();
		}
	}

	public void clickOnUpdateProfile() {
		try {
			log.info("clicking on update profile!!");
			click(updateEmployee_btn);
			//waitFor(1000);
			log.info("clicking on update profile!!");
		} catch (Exception e) {
			log.info("error clicking on update profile!!");
			e.printStackTrace();
			Assert.fail("update profile failed!!");

		}
	}

	public void clickOnResign() {
		try {
			log.info("clicking on resign!!");
			click(resign_btn);
			waitFor(1500);
			log.info("clicked on resign!!");
		} catch (Exception e) {
			log.info("error clicking on resign!!");
			e.printStackTrace();
			Assert.fail("click on resign failed!!");
		}
	}
	
	public boolean verifySuspendPopUpText() {
		try {
			
			log.info(suspendPopUp_txt.getText());
			if (suspendPopUp_txt.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			return false;
		}
	}

	// verify suspended status for any employee with empId as input
	public boolean verifySuspendedStatus(String empId) {
		try {
			WebElement ele = webDriver.findElement(
					By.xpath("//h6[contains(text(),'Suspend')]//../..//h6[contains(text(),'" + empId + "')]"));
			log.info("status: "+ele.getText());
			if (ele.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnActive() {
		try {
			log.info("clicking on active!!");
			waitFor(3000);
			clickOnElementByJs(active_btn);
			log.info("clicked on active!!");
		} catch (Exception e) {
			log.info("error clicking on active!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public boolean verifyActivePopUpText() {
		try {
			
			log.info(activePopUp_txt.getText());
			if (activePopUp_txt.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			return false;
		}
	}
	// verify active status for any employee with empId as input
	public boolean verifyActiveStatus(String empId) {
		try {
			WebElement ele = webDriver.findElement(
					By.xpath("//h6[contains(text(),'Active')]//../..//h6[contains(text(),'" + empId + "')]"));
			log.info("empID: "+ele.getText());
			if (ele.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyResignPopUpText() {
		try {
			
			log.info( "verifying resign pop up text as "+resignPopup_text.getText());
			if (resignPopup_text.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			return false;
		}
	}
	// verify resign status for any employee with empId as input
		public boolean verifyResignStatus(String empId) {
			try {
				log.info("verifying resign status!!");
				WebElement ele = webDriver.findElement(
						By.xpath("//h6[contains(text(),'Resign')]//../..//h6[contains(text(),'" + empId + "')]"));
				log.info("status: "+ele.getText());
				if (ele.isDisplayed()) {
					log.info("resign status verified!!");
					return true;}
				else
				{log.info("resign status not verified!!");
					return false;}
				
			} catch (Exception e) {
				log.error("resign status not verified!!");
				return false;
			}
		}
		public void setOrgUnit() {
		try {
			log.info("setting org unit!!");
			waitFor(1000);
//			WebElement ele=webDriver.findElement(By.xpath("//input[@name='organizationModel']"));
//			click(ele);
//			JavascriptExecutor js = (JavascriptExecutor) webDriver;
//            js.executeScript("arguments[0].setAttribute('ng-reflect-ng-model', 'WebAutomationTenant')", ele);
			typeTextToGetDropdown(addEmployee_Org_unit, "WebAutomationTenant", addEmployee_Org_unit_List);
            log.info("org unit is set!!");
		} catch (Exception e) {
			log.error("error setting org unit!!");
			e.printStackTrace();
			Assert.fail();
		}	
		}
		public void clickOnActivateEmployee() {
			try {
				log.info("clicking on activate employee!!");
				click(activateEmployee_btn);
				waitFor(2000);
				log.info("clicked on activate employee");
			} catch (Exception e) {
				log.info("error clicking on activate employee");
			}
		}
		
}
