package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.apache.log4j.Logger;
import helper.LoggerHelper;

public class TaskManagementPage extends BasePage {

	public TaskManagementPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//em[@class='fonticon-menu']")
	private WebElement moreMenu_lnk;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Task')]")
	private WebElement task_lnk;

	@FindBy(how = How.XPATH, using = "//button[@name='Click Create Task']")
	private WebElement btn_createtask;

	@FindBy(how = How.ID, using = "title")
	private WebElement txt_tasktitle;

	@FindBy(how = How.ID, using = "description")
	private WebElement taskDescription_txtField;

	@FindBy(how = How.XPATH, using = "//i[@class='fas fa-plus']")
	private WebElement addEmployee_Btn;

	@FindBy(how = How.ID, using = "files")
	private WebElement addAttachment_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'View all')]")
	private WebElement taskHistoryViewAll_lnk;

	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Write a message']")
	private WebElement chatBox_textField;

	@FindBy(how = How.XPATH, using = "//i[@class='fas fa-paper-plane p-2 rounded-circle bg-white ml-1']")
	private WebElement enter_Btn;

	@FindBy(how = How.XPATH, using = "//button[@name='createSubTask']")
	private WebElement createSubTask_Btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Complete')]")
	private WebElement complete_Btn;

	@FindBy(how = How.ID, using = "perspective")
	private WebElement status_sel;


	@FindBy(how = How.XPATH, using = "//i[@class='fas fa-pen ml-2']")
	private WebElement editTask_btn;

	@FindBy(how = How.ID, using = "toMe")
	private WebElement assignedTome_btn;

	@FindBy(how = How.ID, using = "byMe")
	private WebElement assignedByme_btn;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add')]")
	private WebElement add_btn;

	@FindBy(how = How.XPATH, using = "//i[@class='fas fa-trash ml-2 ng-star-inserted']")
	private WebElement deleteTask_btn;

	@FindBy(how = How.XPATH, using = "//div[@class='ui-float-label']//textarea")
	private WebElement comments_dialogtextfield;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit')]")
	private WebElement submit_Btn;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Task Management Configuration')]")
	private WebElement taskManagementConfiguration_lnk;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Supervisor can assign task to his team members only')]")
	private WebElement superVisorAssignTask_radio;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Anyone can assign task to anyone')]")
	private WebElement anyoneToAnyonetask_radio;

	@FindBy(how = How.XPATH, using = "//label[@for='customControlValidation1']")
	private WebElement superVisorApprovesTask_checkBox;

	@FindBy(how = How.XPATH, using = "//a[@id='INTERNAL']//h5")
	private WebElement myTeamTab_lbl;

	@FindBy(how = How.XPATH, using = "//a[@id='EXTERNAL']//h5")
	private WebElement externalTeamTab_lbl;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search employees']")
	private WebElement searchEmployees_textField;

	@FindBy(how = How.XPATH, using = "//div[@class='media-body']//b")
	private WebElement searchResult_tab;

	@FindBy(how = How.XPATH, using = "//label[@for='id_TO_DO_TASK_ASSIGNED']")
	private WebElement taskAssigned_chkBox;

	@FindBy(how = How.XPATH, using = "//input[@id='id_TO_DO_TASK_ASSIGNED']")
	private WebElement taskAssigned_type_chkBox;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Approve')]")
	private WebElement approve_btn;

	@FindBy(how = How.ID, using = "approval")
	private WebElement approval_tab;

	@FindBy(how = How.XPATH, using = "//b[text()='Task description']/following-sibling::p")
	private WebElement taskDescription_text;

	public void moveToTaskManagement() {
		try {
			log.info("moving to task management!!");
			// waitUntilElementVisible(moreMenu_lnk);
			log.info("Clicking moreMenu_lnk");
			click(moreMenu_lnk);
			log.info("Clicking task_lnk");
			click(task_lnk);
			log.info("moved to task management!!");
		} catch (Exception e) {
			log.error("failed to move to task management!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void moveToTaskManagementConfiguration() {
		try {
			log.info("moving to task management configuration!!");
			click(taskManagementConfiguration_lnk);
			log.info("moved to task management configuration!!");
		} catch (Exception e) {
			log.error("error moving to task management comfiguration!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnCreateTask() {
		try {
			log.info("clicking on create task!!");
			clickOnElementByJs(btn_createtask);
			log.info("clicked on create task!!");
		} catch (Exception e) {
			log.error("error clicking on create task!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterTaskDescription(String desc) {
		try {
			log.info("entering task description: " + desc);
			writeText(taskDescription_txtField, desc);
			log.info("entered task description: " + desc);

		} catch (Exception e) {
			log.error("error entering task description: " + desc);
			e.printStackTrace();
			throw e;
		}
	}

	public void enterTaskTitle(String title) {
		try {
			log.info("entering task title: " + title);
			writeText(txt_tasktitle, title);
			log.info("entered task title: " + title);
		} catch (Exception e) {
			log.error("error entering the task title!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnAddEmployee() {
		try {
			log.info("clicking on Add employees!!");
			log.info("Clicking addEmployee_Btn");
			clickOnElementByJs(addEmployee_Btn);
			log.info("clicked on Add employees!!");
		} catch (Exception e) {
			log.error("error clicking on Add employees!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void selectEmployee(String empId) {
		try {
			log.info("selecting the employee!!");
			WebElement ele = webDriver
					.findElement(By.xpath("//p[contains(text(),'" + empId + "')]//..//..//label[@for='checkbox2']"));
			log.info("Clicking ele");
			clickOnElementByJs(ele);
			log.info("selected the employee!!");
		} catch (Exception e) {
			log.error("error selecting the employee!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void selectEmployeeSubTask(String empId) {
		try {
			log.info("selecting the employee for sub task!!");
			WebElement ele = webDriver
					.findElement(By.xpath("//p[contains(text(),'" + empId + "')]//..//..//label[@for='checkbox3']"));
			log.info("Clicking ele");
			clickOnElementByJs(ele);
			log.info("selected the employee for sub task!!");
		} catch (Exception e) {
			log.error("error selecting the employee for sub task!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnAdd() {
		try {
			log.info("clicking on add!!");
			log.info("Clicking add_btn");
			click(add_btn);
			log.info("clicked on add!!");
		} catch (Exception e) {
			log.error("error clicking on add!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnAssignedToMe() {
		try {
			log.info("clicking on assigned to me!!");
			log.info("Clicking assignedTome_btn");
			click(assignedTome_btn);
			log.info("clicked on assigned to me!!");
		} catch (Exception e) {
			log.error("error clicking on assigned to me!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnAssignedByMe() {
		try {
			log.info("clicking on assigned by me!!");
			log.info("Clicking assignedByme_btn");
			click(assignedByme_btn);
			log.info("clicked on assigned by me!!");
		} catch (Exception e) {
			log.error("error clicking on assigned by me!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnTask(String taskName) {
		try {
			log.info("clicking on task name:" + taskName);
			WebElement ele = new WebDriverWait(webDriver, 60).until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//div[@class='card-body']//*[contains(text(),'" + taskName + "')]")));//.xpath("//div[@class='card-body']//div[@class='b c-p' and contains(text(),'" + taskName + "')]")));
			log.info("Clicking ele");

			click(ele);
			log.info("clicked on task name:" + taskName);
		} catch (Exception e) {
			log.info("error clicking on task:" + taskName);
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnTaskAssignedByMe(String taskName) {
		try {
			log.info("clicking on task name:" + taskName);
			WebElement ele = new WebDriverWait(webDriver, 60).until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//div[@name='Click Task Icon']//div[contains(text(),'" + taskName + "')]")));
			log.info("Clicking ele");

			click(ele);
			log.info("clicked on task name:" + taskName);
		} catch (Exception e) {
			log.info("error clicking on task:" + taskName);
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnCreateSubTask() {
		try {
			log.info("clicking on create sub task!!");
			waitUntilElementToBeClickableRepeated(createSubTask_Btn,2);
			log.info("Clicking createSubTask_Btn");
			clickOnElementByJs(createSubTask_Btn);
			log.info("clicked on create sub task!!");
		} catch (Exception e) {
			log.error("error clicking on create sub task!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnEditTask() {
		try {
			log.info("clicking on edit!!");
			log.info("Clicking editTask_btn");
			clickOnElementByJs(editTask_btn);
			log.info("clicked on edit!!");
		} catch (Exception e) {
			log.error("error clicking on edit!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnDeleteTask() {
		try {
			log.info("clicking on delete!!");
			log.info("Clicking deleteTask_btn");
			clickOnElementByJs(deleteTask_btn);
			log.info("clicked on delete!!");
		} catch (Exception e) {
			log.error("error clicking on delete!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void setTaskInprogress() {
		try {
			log.info("clicking on complete!!");
			log.info("Clicking complete_Btn");
			setValueInDropdownText(status_sel, "In Progress");
			log.info("clicked on complete!!");
		} catch (Exception e) {
			log.error("error clicking on complete!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnComplete() {
		try {
			log.info("clicking on complete!!");
			log.info("Clicking complete_Btn");
			click(complete_Btn);
			log.info("clicked on complete!!");
		} catch (Exception e) {
			log.error("error clicking on complete!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterTaskComment(String comment) {
		try {
			log.info("entering task completion commnents!!");
			writeText(comments_dialogtextfield, comment);
			log.info("entered task completion comments!!");
		} catch (Exception e) {
			log.error("error entering task completion comments!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnSubmit() {
		try {
			log.info("clicking on submit!!");
			log.info("Clicking submit_Btn");
			click(submit_Btn);
			log.info("clicked on submit!!");
		} catch (Exception e) {
			log.error("error clicking on submit!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void attachFile(String filePath) {
		try {
			log.info("attaching file ");
			log.info("Writing text to addAttachment_btn: " + filePath);
			writeText(addAttachment_btn, filePath);
			log.info("attached file");
		} catch (Exception e) {
			log.error("error attaching file!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnViewAll() {
		try {

			log.info("clicking view all!!");

			waitUntilElementToBeClickable(taskHistoryViewAll_lnk);
			click(taskHistoryViewAll_lnk);
			log.info("clicked on task to be rated!!");

		} catch (Exception e) {
			log.error("error clicking on task to be rated!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnTaskToBeRated(String taskName) {
		try {

			log.info("clicking on task to be rated");
			WebElement ele = webDriver.findElement(
					By.xpath("(//p[contains(text(),'" + taskName + "')])[last()]"));
					//By.xpath("//task-history//p[contains(text(),'" + taskName + "')]"));
					//By.xpath("//div[contains(text(),'" + taskName + "')]//span[contains(text(),'Provide Rating')]"));
			waitUntilElementToBeClickable(ele);
			click(ele);
			log.info("clicked on task to be rated!!");

		} catch (Exception e) {
			log.error("error clicking on task to be rated!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void giveStarRating(int i) {
		try {
			log.info("rating the task");
			WebElement ele = webDriver.findElement(By.xpath("(//span[@class='star'])[" + i + "]"));
			log.info("Clicking ele");
			click(ele);
			log.info("rated the task");
		} catch (Exception e) {
			log.error("error rating the task!!");
			e.printStackTrace();
			throw e;
		}
	}

	public void selectWhoCanAssignTask(String option) {
		try {
			log.info("selecting who can assign task as" + option);
			if (option.equals("anyone")) {
				clickOnElementByJs(anyoneToAnyonetask_radio);
			} else if (option.equalsIgnoreCase("Supervisor")) {
				clickOnElementByJs(superVisorAssignTask_radio);
			}
			log.info("selected who can assign task as" + option);
		} catch (Exception e) {
			log.error("error selecting who can assign task!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void selectDesignation(String designation) {
		try {
			log.info("selecting designation!!");
			WebElement ele = webDriver
					.findElement(By.xpath("//label[contains(text(),'" + designation + "')]//..//label[1]"));
			clickOnElementByJs(ele);
			log.info("selected designation!!");
		} catch (Exception e) {
			log.error("error selecting designation!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void selectSupervisorasApprover() {
		try {
			log.info("selecting supervisor as approver!!");
			clickOnElementByJs(superVisorApprovesTask_checkBox);
			log.info("selected supervisor as approver!!");
		} catch (Exception e) {
			log.error("error selecting supervisor as approver!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public boolean verifyMyTeamLabel() {
		try {
			log.info("verifying My Team Label");
			if (verifyData("My Team", myTeamTab_lbl))
				return true;
			else
				return false;
		} catch (Exception e) {
			log.error("error verifying My Team Label");
			e.printStackTrace();
			Assert.fail();
			return false;
		}
	}

	public boolean verifyExternalTeamLabel() {
		try {
			log.info("verifying External Team Label");
			if (verifyData("External Team", externalTeamTab_lbl))
				return true;
			else
				return false;
		} catch (Exception e) {
			log.error("error verifying External Team Label");
			e.printStackTrace();
			Assert.fail();
			return false;
		}
	}

	public void enterEmployeeIdinSearchbox(String empName) {
		try {
			log.info("entering employee name");
			writeText(searchEmployees_textField, empName);
			log.info("entered employee name");
		} catch (Exception e) {
			log.error("error entering employee name");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void selectEmployee() {
		try {
			log.info("selecting employees from search result!");
			click(searchResult_tab);
			log.info("selected employees from search result!");
		} catch (Exception e) {
			log.error("error selecting employees from search result!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnExternalTab() {
		try {
			log.info("clicking on External tab");
			click(externalTeamTab_lbl);
			log.info("clicked on external tab");
		} catch (Exception e) {
			log.error("error clicking on external tab!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void selectTaskAssignedCard() {
		try {
			log.info("clicking on things to do card for assigned task!!");
			if (!taskAssigned_type_chkBox.isSelected()) {
				clickOnElementByJs(taskAssigned_chkBox);
			}
			log.info("clicked on things to do card for assigned task!!");
		} catch (Exception e) {
			log.error("error clicking on things to do card for assigned task!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void moveToApprovalTab() {
		try {
			log.info("moving to approval tab!!");
			click(approval_tab);
			log.info("moved to approval tab!!");
		} catch (Exception e) {
			log.error("error moving to approval tab!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnApprove(String taskName) {
		try {
			log.info("clicking on approve");
			WebElement ele = webDriver.findElement(By.xpath("//p[@class='b c-p' and contains(text(),'" + taskName
					+ "')]//..//..//..//button[contains(text(),'Approved')]"));
			click(ele);
			log.info("clicked on approve");
		} catch (Exception e) {
			log.error("error clicking on approve");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyApprovedLabel(String taskName) {
		try {
			log.info("verifying approved label!!");
			WebElement ele = webDriver.findElement(
					By.xpath("//p[@class='b c-p' and contains(text(),'" + taskName + "')]//..//..//..//span"));
			Assert.assertTrue(verifyData("Approved", ele));
			log.info("verified approved label!!");
		} catch (Exception e) {
			log.error("error verifying approved label!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void verifyTaskDescription(String desc) {
		try {
			log.info("verifying task description!!");
			Assert.assertTrue(verifyData(desc, taskDescription_text));
			log.info("verified task description!!");
		} catch (Exception e) {
			log.error("error verifying task description!!");
			e.printStackTrace();
			Assert.fail();
		}

	}
}
