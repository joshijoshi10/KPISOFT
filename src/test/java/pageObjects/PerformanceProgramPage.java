package pageObjects;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import config.ConfigFileReader;
import config.ExcelFileReader;
import helper.LoggerHelper;
import util.ManagerUtil;

public class PerformanceProgramPage extends BasePage
{
	Logger log = LoggerHelper.getLogger(LoggerHelper.class);

	public PerformanceProgramPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	//newly added
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"exCollapsingNavbar2\"]/div/a[1]/i")
	private WebElement clickOnHomeImage;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create Program')]")
	private WebElement createProgramButton;
	
	@FindBy(how = How.XPATH, using = "//p[contains(@class,'c-p b')]")
	private WebElement clk_reviewPublished;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Review Published')]")
	private WebElement verify_reviewPublishedLabel;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Approve')]")
	private WebElement approvePerformanceReviewButton;
	
	@FindBy(how = How.ID, using = "programName")
	private WebElement txtBx_programName;

	@FindBy(how = How.XPATH, using = "//input[@id='startDate']")
	private WebElement dp_startDate;
	
	@FindBy(how = How.XPATH, using = "//a[@id='kpiMatrix']")
	private WebElement clkLnk_kpiMatrix;

	@FindBy(how = How.XPATH, using = "//input[@id='endDate']")
	private WebElement dp_endDate;

	@FindBy(how = How.XPATH, using = "//input[@id='startDate']/../button")
	private WebElement dp_startDateBtn;

	@FindBy(how = How.XPATH, using = "//input[@id='endDate']/../button")
	private WebElement dp_endDateBtn;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Program Details')]")
	private WebElement lbl_programDetail;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Create Performance Program')]")
	private WebElement lbl_createPerformanceProgram;

	@FindBy(how = How.XPATH, using = "//input[@id='programName']")
	private WebElement txtBx_programTextBox;

	@FindBy(how = How.XPATH, using = "//select[@id='cascadeFrom']")
	private WebElement dd_cascade;

	@FindBy(how = How.CSS, using = "#approvalStages")
	private WebElement dd_approvalStage_click;
	
	@FindBy(how = How.XPATH, using = "//select[@id='approvalStages']")
	private WebElement dd_approvalStage;

	@FindBy(how = How.XPATH, using = "//select[@id='reviewStages']")
	private WebElement dd_reviewStage;

	@FindBy(how = How.XPATH, using = "//select[@id='firstLevelWorkflowLike']")
	private WebElement dd_workFlow;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue')]")
	private WebElement btn_continue;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Number of KPI')]")
	private WebElement lbl_programConfiguration;

	@FindBy(how = How.XPATH, using = "//input[@id='kpiMin']")
	private WebElement txtBx_minKpi;

	@FindBy(how = How.XPATH, using = "//input[@id='kpiMax']")
	private WebElement txtBx_maxKpi;

	@FindBy(how = How.XPATH, using = "//input[@id='mtd']/../label")
	private WebElement rb_clickOn_MTD;

	@FindBy(how = How.XPATH, using = "//input[@id='ytd']/../label")
	private WebElement rb_clickOn_YTD;
	
	@FindBy(how = How.XPATH, using = "//input[@name='monthlyUpdate']")
	private WebElement rb_viewclickOnMTD;

	@FindBy(how = How.XPATH, using = "//input[@id='minWeg']")
	private WebElement txtBx_minWeightageKpi;

	@FindBy(how = How.XPATH, using = "//input[@id='maxWeg']")
	private WebElement txtBx_maxWeightageKpi;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Advanced Settings')]")
	private WebElement lnk_advancedSetting;

	@FindBy(how = How.XPATH, using = "//input[@id='ratio']")
	private WebElement txtBx_ratioKpi;

	@FindBy(how = How.XPATH, using = "//input[@id='ratio_view']")
	private WebElement txtBx_ratioKpi_view;

	@FindBy(how = How.XPATH, using = "//input[@id='initiative']")
	private WebElement txtBx_initiativeKpi;

	@FindBy(how = How.XPATH, using = "//input[@id='initiativeView']")
	private WebElement txtBx_initiativeKpi_view;

	@FindBy(how = How.XPATH, using = "//select[@id='allowQualityRating']")
	private WebElement dd_allowQualityRating;

	@FindBy(how = How.XPATH, using = "//select[@id='reviewTemplate']")
	private WebElement dd_reviewTemplates;

	@FindBy(how = How.XPATH, using = "//select[@id='strategy']")
	private WebElement dd_selectStrategy;

	@FindBy(how = How.XPATH, using = "//ui-switch[contains(@id,'attachmentMandatory')]/span")
	private WebElement rb_attachment;

	@FindBy(how = How.XPATH, using = "//ui-switch[contains(@id,'requireSystemKpis')]/span")
	private WebElement rb_systemKpi;

	@FindBy(how = How.ID, using = "minSystemKpiWeightage")
	private WebElement txt_systemKpiWeightage;

	@FindBy(how = How.XPATH, using = "//ui-switch[contains(@id,'requireSystemKpiValues')]/span")
	private WebElement rb_systemKpiValues;

	@FindBy(how = How.XPATH, using = "//ui-switch[contains(@id,'rejectReview')]/span")
	private WebElement rb_allowToReject;

	@FindBy(how = How.XPATH, using = "//ui-switch[contains(@id,'aggregate')]/span")
	private WebElement rb_aggregateTeamScore;

	@FindBy(how = How.XPATH, using = "//ui-switch[contains(@id,'appraisalSatisfaction')]/span")
	private WebElement rb_AppersialFeedback;

	@FindBy(how = How.XPATH, using = "//ui-switch[contains(@id,'userCommentsMandatoryForReview')]/span")
	private WebElement rb_userComment;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),' Hide first level lower end ')]")
	private WebElement lbl_hideFirstLvl;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Level')]")//"//button[contains(text(),'Add More')]")
	private WebElement btn_addMoreScale;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save Program')]")
	private WebElement btn_save;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save')]")
	private WebElement btn_CommentSave;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Verify')]")
	private WebElement btn_VerifyPerformanceReview;
	
	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-trash'])[last()]")
	private WebElement btn_delete;

	//need to change
	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-ellipsis-h'])[1]")
	private WebElement btn_action;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Validate and Trigger Review')]")
	private WebElement btn_ValidateAndTriggerReview;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-pencil mr-2']")
	private WebElement btn_Edit;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-play mr-2']")
	private WebElement btn_Start;
	
	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Trigger Review']")
	private WebElement btn_TriggerReview;

	@FindBy(how = How.XPATH, using = "(//label[@class='normal'])[2]")
	private WebElement rbtn_inculdeEveryoneExculde;

	@FindBy(how = How.XPATH, using = "(//label[@class='normal'])[3]")
	private WebElement rbtn_inculdeEveryoneIn;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),' Start Performance Program ')]")
	private WebElement rbtn_validateStartProgramPage;

	@FindBy(how = How.XPATH, using = "(//label[@class='normal'])[2]")
	private WebElement rdbt_includeEveryone_Except;

	@FindBy(how = How.XPATH, using = "(//label[@class='normal'])[3]")
	private WebElement rdbt_includeEveryone_in;

	@FindBy(how = How.XPATH, using = "//textarea[@class='form-control w-100 float-left resize-text-area ng-pristine ng-valid ng-touched']")
	private WebElement getTxtBx_employeesid;
	
	@FindBy(how = How.XPATH, using = "//textarea[contains(@placeholder,'')]")
	//(//textarea[contains(@placeholder,'')])[1]
	private WebElement txt_OverallPerformanceReviewFeedback;
	
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Enter Employee Code']")
	private WebElement txt_EditEnterEmployeeCode;
	
	@FindBy(how = How.XPATH, using = "//textarea[contains(@placeholder,'')]")
	private WebElement txt_SubmitPerformanceComment;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
	private WebElement submit_SubmitPerformance;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit')]")
	private WebElement submitReviewSubmitButton;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),' Do not have Employee codes?')]")
	private WebElement getbtn_donot_have_employee_codes;

	@FindBy(how = How.XPATH, using = "//h5[@class='medium m-0']")
	private WebElement getLbl_employeeAdvanceSerach;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-caret-down tr-0 cursor']")
	private WebElement getDp_filter;

	@FindBy(how = How.XPATH, using = "//div[@id='collapseExample']//div/div[1]/div/textarea")
	private WebElement getTxtBx_includeEmploye_code;

	@FindBy(how = How.XPATH, using = "//div[@id='collapseExample']//div/div[2]/div/textarea")
	private WebElement getTxtBx_ExcludeEmploye_code;

	@FindBy(how = How.XPATH, using = "(//div[@class='c-btn'])[1]")
	private WebElement getdd_designation;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search designations']")
	private WebElement getTxtBx_designation;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Designation')]/../descendant::ul/descendant::label[text()='Manager']")
	private WebElement getCheckbox_checkBoxDes;

	@FindBy(how = How.XPATH, using = "(//div[@class='c-btn'])[2]")
	private WebElement getdd_grade;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search grades']")
	private WebElement getTxtBx_grade;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Grade')]/../descendant::ul/descendant::label[text()='G1']")
	private WebElement getTxtBx_checkBoxGrade;

	@FindBy(how = How.XPATH, using = "(//div[@class='c-btn'])[3]")
	private WebElement getdd_catogery;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search job category']")
	private WebElement getTxtBx_catogery;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Job category')]/../descendant::ul/descendant::label[text()='Executive']")
	private WebElement getTxtBx_checkBoxcatogery;

	@FindBy(how = How.XPATH, using = "(//div[@class='c-btn'])[4]")
	private WebElement getdd_type;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search employment type']")
	private WebElement getTxtBx_type;

	@FindBy(how = How.XPATH, using = "//ul[@class='lazyContainer']/span[1]/li[1]/label[1]")
	private WebElement getTxtBx_checkBoxtype;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary float-right ml-3']")
	private WebElement getbtn_Apply;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-secondary']")
	private WebElement getbtn_back;

	//@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary float-right mb-4']")
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Start Program')]")
	private WebElement getbtn_startProgram;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Employee to Program')]")
	private WebElement getbtn_AddEmployeeToProgram;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Confirm')]")
	private WebElement getbtn_confirm;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'OK, Confirm')]")
	private WebElement getbtn_OkConfirm;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-eye mr-2']")
	private WebElement getbtn_view;

	@FindBy(how = How.XPATH, using = "//h5[@class='medium m-0']")
	private WebElement getlbl_viewPerformanceProgram;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Program name')]/../input")
	private WebElement getTxtBx_viewprogramName;
	
	@FindBy(how = How.XPATH, using = "//textarea[@id='float-input']")
	private WebElement txt_submitReivewComment;
	
//	@FindBy(how = How.XPATH, using = "//textarea[contains(@id,'comm_689118440E8BAE22A')]")
//	private WebElement txt_OverallPerformanceComment;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='form-group']//select)[1]")
	private WebElement getTxtBx_viewModel;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Number of approval stages')]/../select")
	private WebElement getTxtBx_viewAprovalStage;

	@FindBy(how = How.XPATH, using = "(//select[@class='form-control w-100 ng-untouched ng-pristine'])[3]")
	private WebElement getTxtBx_viewReviewStage;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement getBtn_Next;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Close View')]")
	private WebElement getBtn_closeView;

	@FindBy(how = How.XPATH, using = "//ui-switch[@id=\"attachmentMandatory\"]//span")
	private WebElement rb_viewattachment;

	@FindBy(how = How.XPATH, using = "//ui-switch[@id='rejectReview']//span")
	private WebElement rb_viewrejectReview;

	@FindBy(how = How.XPATH, using = "//ui-switch[@id='aggregate']//span")
	private WebElement rb_viewagregate;

	@FindBy(how = How.XPATH, using = "//ui-switch[@id='userCommentsMandatoryForReview']//span")
	private WebElement rb_viewCommentsMandatory;

	@FindBy(how = How.XPATH, using = "")
	private String btn_colorPath = "(//input[@class='form-control w-100 cursor'])";

	private String txtBx_colorPath = "(//div[@class='hex-text']//input)";

	private String titlePath = "(//table//tr/td[2]/input)"; //("(//div[@class='col-lg-2 col-md-2 col-sm-1 col-xs-1 float-left'][1]//input)");//"(//div[@class='col-lg-2 col-md-1 col-sm-1 col-xs-1 float-left'][1])";

	private String scorePath = "(//table//tr/td[3]//input)"; //("(//div[@class='col-lg-1 col-md-1 col-sm-1 col-xs-1 float-left']//input)");
    private String scoreViewPath = "(//table//tr/td[3]//input)";//("(//div[@class='col-lg-2 col-md-1 col-sm-1 col-xs-1 float-left']//input)");

	private String descriptionPath = "(//table//tr/td[4]//input)"; //"(//div[@class='col-lg-2 col-md-2 col-sm-1 col-xs-1 float-left'][2]//input)"; //"(//div[@class='col-lg-2 col-md-2 col-sm-2 col-xs-2 float-left']//input)";

	private String targetPath = "(//table//tr/td[7]//input)"; //("(//div[@class='col-lg-2 col-md-1 col-sm-1 col-xs-1 float-left'][1]//input)");//"(//div[@class='col-lg-2 col-md-1 col-sm-1 col-xs-1 float-left'][2]//input)";
    private String targetViewPath = "(//table//tr/td[7]//input)"; //("(//div[@class='col-lg-2 col-md-1 col-sm-1 col-xs-1 float-left'][2]//input)");//"(//div[@class='col-lg-2 col-md-1 col-sm-1 col-xs-1 float-left'][2]//input)";


    @FindBy(how = How.XPATH, using = "(//input[@min='1'])[1]")
	private WebElement level1;

	@FindBy(how = How.XPATH, using = "(//input[@min='1'])[2]")
	private WebElement level2;

	@FindBy(how = How.XPATH, using = "(//input[@min='1'])[3]")
	private WebElement level3;

	@FindBy(how = How.XPATH, using = "(//input[@min='1'])[4]")
	private WebElement level4;

	@FindBy(how = How.XPATH, using = "(//input[@min='1'])[5]")
	private WebElement level5;

	@FindBy(how = How.XPATH, using = "//button[text()=' Validate and Start Program']")
	private WebElement getValidateandStart_btn;

	@FindBy(how = How.XPATH, using = "//h6[@ng-reflect-ngb-tooltip='EMP1']")
	private WebElement empId_lbl;

	@FindBy(how = How.ID, using = "toast-container")
	private WebElement Toastmessage;

	//competency enabled and self review

	@FindBy(how = How.XPATH, using = "//ui-switch[contains(@id,'competencyRequired')]/span/small")
	private WebElement rb_360feddback;
	
	@FindBy(how = How.XPATH, using = "//ui-switch[contains(@id,'selfReviewRequired')]/span/small")
	private WebElement rb_selfreviwed;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Trigger New Review']")
	private WebElement clk_TriggerNewReview;
	
	@FindBy(how = How.XPATH, using = "//input[@name='endDateInTR']/../button")
	private WebElement clk_endDateCalender;
	
	@FindBy(how = How.XPATH, using = "//input[@type='text']")
	private WebElement txt_EnterActual;
	
//	@FindBy(how = How.XPATH, using = "//select[@id='Period']")
//	@FindBy(how = How.XPATH, using = "//*[@id='period']")
	@FindBy(how = How.CSS, using = "#Period")
	private WebElement sel_Period;
	
	@FindBy(how = How.XPATH, using = "//*[@id='period']")
	private WebElement sel_verifierPeriod;
	
	
	@FindBy(how = How.XPATH, using = "//small[contains(text(),'Period actual / Comments')]")
	private WebElement clk_PeriodActualComments;
	
	@FindBy(how = How.XPATH, using = "//small[contains(text(),'Supervisor actual / Comments')]")
	private WebElement clk_SupervisorActualComments;
	
	@FindBy(how = How.XPATH, using = "//div[@class='hub-cards']//div//verify-review//h5")
	private WebElement verifyTheirPerformanceLabel;
	
//	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Verify Performance')]")
	@FindBy(how = How.XPATH, using = "//div[@class='hub-cards']//div//verify-review//h5")
	private WebElement verifyPerformanceLabel;
	
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Performance Review')]")
	private WebElement clk_PerformanceReview;
	
	@FindBy(how = How.CSS, using = "#update_Perf_Period")
	private WebElement clk_PreferedPeriod;
	
	
	@FindBy(how = How.CSS, using = "div[class='d-flex align-items-center justify-content-between'] div h5")
	private WebElement approveScorecardLabel;
	
	
	public void clickVerifyPerformanceLabel() {
		try {
			log.info("Entered ClickVerifyPerformanceLabel successfully");
			waitFor(1000);
			waitUntilElementToBeClickable(verifyPerformanceLabel);
			click(verifyPerformanceLabel);
			log.info("Executed ClickVerifyPerformanceLabel successfully");
		} catch (Exception e) {
			log.error("Not executed ClickVerifyPerformanceLabel");
			e.printStackTrace();
			throw e;
		}
	}
	
	
	public void clickVerifyTheirPerformanceLabel() {
		try {
			log.info("Entered ClickVerifyTheirPerformanceLabel successfully");
			waitFor(1000);
			waitUntilElementToBeClickable(verifyTheirPerformanceLabel);
			click(verifyTheirPerformanceLabel);
			log.info("Executed ClickVerifyTheirPerformanceLabel successfully");
		} catch (Exception e) {
			log.error("Not executed ClickVerifyTheirPerformanceLabel");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void Click_PerformanceReview() {
		try {
			log.info("Entered Click_PerformanceReview successfully");
			click(clk_PerformanceReview);
			log.info("Executed Click_PerformanceReview successfully");
		} catch (Exception e) {
			log.error("Not executed Click_PerformanceReview");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void text_EnterActual(String value) {
		try{
			log.info("Entered Text_EnterActual succesfully");
			waitFor(1000);
			writeText(txt_EnterActual, value);
			log.info("Executed Text_EnterActual Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed Text_EnterActual");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void text_OverallPerformanceReviewFeedback(String value) {
		try{
			log.info("Entered Text_OverallPerformanceReviewFeedback succesfully");
			waitFor(1000);
			writeText(txt_OverallPerformanceReviewFeedback, value);
			log.info("Executed Text_OverallPerformanceReviewFeedback Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed Text_OverallPerformanceReviewFeedback");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void clickSupervisorActualComments() {
		try{
			log.info("Entered ClickSupervisorActualComments succesfully");
			waitFor(1000);
			click(clk_SupervisorActualComments);
			log.info("Executed ClickSupervisorActualComments Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed ClickSupervisorActualComments");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void click_reviewPublished() {
		try{
			log.info("Entered Click_reviewPublished succesfully");
			waitFor(1000);
			click(clk_reviewPublished);
			log.info("Executed Click_reviewPublished Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed Click_reviewPublished");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	
	public void click_PeriodActualComments() {
		try{
			log.info("Entered Click_PeriodActualComments succesfully");
			waitFor(1000);
			click(clk_PeriodActualComments);
			log.info("Executed Click_PeriodActualComments Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed Click_PeriodActualComments");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void click_kpiMatrix() {
		try{
			log.info("Entered Click_kpiMatrix succesfully");
			waitFor(1000);
			click(clkLnk_kpiMatrix);
			log.info("Executed Click_kpiMatrix Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed Click_kpiMatrix");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void verifyApproveScorecardLabel() {
		try{
			log.info("Entered VerifyApproveScorecardLabel succesfully");
			waitUntilElementVisible(approveScorecardLabel);
			Assert.assertEquals("Approve Scorecard", approveScorecardLabel.getText(), "Approve Scorecard text Not Found");
			log.info("Executed VerifyApproveScorecardLabel Successfully");
		} 
		catch  (Exception e)
		{
			log.error("Not Executed VerifyApproveScorecardLabel"); 
			e.printStackTrace();
			throw e;
		}
	}
	
	public void Verify_reviewPublishedLabel() {
		try{
			log.info("Entered Verify_reviewPublishedLabel succesfully");
			waitUntilElementVisible(verify_reviewPublishedLabel);
			Assert.assertEquals("Review Published", verify_reviewPublishedLabel.getText(), "Review Published text Not Found");
			log.info("Executed Verify_reviewPublishedLabel Successfully");
		} 
		catch  (Exception e)
		{
			log.error("Not Executed Verify_reviewPublishedLabel"); 
			e.printStackTrace();
			throw e;
		}
	}
	
	public void clickOnHomeImg() {
		try {
			log.info("Entered clickOnHomeImg successfully");
			click(clickOnHomeImage);
			log.info("Executed clickOnHomeImg successfully");
		} catch (Exception e) {
			log.error("Not executed clickOnHomeImg");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void submitSubmitPerformance() {
		try {
			log.info("Entered submitSubmitPerformance successfully");
			click(submit_SubmitPerformance);
			log.info("Executed submitSubmitPerformance successfully");
		} catch (Exception e) {
			log.error("Not executed submitSubmitPerformance");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void getCreateProgram() {
		try{
			log.info("Entered getCreateProgram succesfully");
			click(createProgramButton);
			log.info("Executed getCreateProgram Successfully");
		}
		catch (Exception e) 
		{
			log.error("Not Executed getCreateProgram"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void approvePerformanceReviewButton() {
		try{
			log.info("Entered ApprovePerformanceReviewButton succesfully");
			click(approvePerformanceReviewButton);
			log.info("Executed ApprovePerformanceReviewButton Successfully");
		}
		catch (Exception e) 
		{
			log.error("Not Executed ApprovePerformanceReviewButton"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void NumberOfApprovalStages(int value) {
		try {
			Select selObj = new Select(webDriver.findElement(By.cssSelector("#approvalStages")));
			selObj.selectByIndex(value);
			//screenshot("setValueInDropdownByIndex");
		} catch (Exception e) {
			e.printStackTrace();
			//Assert.fail();
			throw e;
		}
	}
	
	public void NumberOfReviewStages(int value) {
		try {
			Select selObj = new Select(webDriver.findElement(By.cssSelector("#reviewStages")));
			selObj.selectByIndex(value);
			//screenshot("setValueInDropdownByIndex");
		} catch (Exception e) {
			e.printStackTrace();
			//Assert.fail();
			throw e;
		}
	}
	
	public void overAllPerformanceDropdown(int value) {
		try {
			log.info("Entered overAllPerformanceDropdown succesfully");

			Select selObj = new Select(webDriver.findElement(By.xpath("//*[@id=\"supervisor-panel\"]/div[2]/div[3]/div[1]/div/div[1]/div")));
			selObj.selectByIndex(value);
			//screenshot("setValueInDropdownByIndex");
			log.info("Executed overAllPerformanceDropdown succesfully");

		} catch (Exception e) {
			e.printStackTrace();
			log.info("Executed overAllPerformanceDropdown not succesfully");
			//Assert.fail();
			throw e;
		}
	}
	
	public void validateProgramDetailPage() {
		try{
			log.info("Entered validateProgramDetailPage succesfully");
			System.out.println();
			Assert.assertEquals("Program Details", lbl_programDetail.getText(),
					"After clicking on create button it is not navigated to Program Detail page");
			log.info("Executed validateProgramDetailPage Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed validateProgramDetailPage"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void validateCreatePerformanceProgramPageHeading() {
		try{
			log.info("Entered validateCreatePerformanceProgramPageHeading succesfully");
			Assert.assertEquals("Create Performance Program", lbl_createPerformanceProgram.getText(),
					"After clicking on create button it is not navigated to Create Performance Program");
			log.info("Executed validateCreatePerformanceProgramPageHeading Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed validateCreatePerformanceProgramPageHeading"); 
			e.printStackTrace();
			throw e;
		}
	}

	public void enterValueProgramNameText(String value) {
		try{
			log.info("Entered enterValueProgramNameText succesfully");
			waitFor(2000);
			writeText(txtBx_programName, value);
			log.info("Executed enterValueProgramNameText Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed enterValueProgramNameText");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void setStartDate(int year, int month, int day) {
		try{
			log.info("Entered setStartDate succesfully");
			waitFor(2000);
			setDateInDatePicker(dp_startDateBtn, year, month, day);
			log.info("Executed setStartDate Successfully");
		} catch (Exception e) 
		{
			log.error("Not Executed setStartDate");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void setEndDate(int year, int month, int day) {
		try{
			log.info("Entered setEndDate succesfully");
			waitFor(3000);
			setDateInDatePicker(dp_endDateBtn, year, month, day);
			log.info("Executed setEndDate Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed setEndDate"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void setEndDateCal(int year, int month, int day) {
		try{
			log.info("Entered setEndDateCal succesfully");
			waitFor(3000);
			setDateInDatePicker(clk_endDateCalender, year, month, day);
			log.info("Executed setEndDateCal Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed setEndDateCal"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void selectModel(String value) {
		try{
			log.info("Entered selectModel succesfully");
			setValueInDropdownText(dd_cascade, value);
			log.info("Executed selectModel Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed selectModel");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void Click_PreferedPeriod(int value) {
		try{
			log.info("Entered Select_Period succesfully");
			waitUntilElementToBeClickable(clk_PreferedPeriod);
			setValueInDropdownByIndex(clk_PreferedPeriod, value);
			waitFor(1000);
			scrollUpAndDown(200);
			log.info("Executed Select_Period Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed Select_Period");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void select_Period(int value) {
		try{
			log.info("Entered Select_Period succesfully");
			waitUntilElementToBeClickable(sel_Period);
			setValueInDropdownByIndex(sel_Period, value);
			waitFor(1000);
			scrollUpAndDown(200);
			log.info("Executed Select_Period Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed Select_Period");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void select_verifierPeriod(int value) {
		try{
			log.info("Entered Select_verifierPeriod succesfully");
			waitUntilElementToBeClickable(sel_verifierPeriod);
			setValueInDropdownByIndex(sel_verifierPeriod, value);
			waitFor(1000);
			scrollUpAndDown(200);
			log.info("Executed Select_verifierPeriod Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed Select_verifierPeriod");
			e.printStackTrace(); 
			throw e;
		}
	}

//	public void approvalStageConfiguration(int value) {
//		try{
//			log.info("Entered approvalStageConfiguration succesfully");
//			setValueInDropdownByIndex(dd_approvalStage, value);
//			log.info("Executed approvalStageConfiguration Successfully");
//		} 
//		catch (Exception e) 
//		{
//			log.error("Not Executed approvalStageConfiguration"); 
//			e.printStackTrace(); 
//			throw e;
//		}
//	}
	
	public void approvalStageConfiguration(String value) {
		try{
			log.info("Entered approvalStageConfiguration succesfully");
			setValueInDropdownText(dd_approvalStage, value);
			log.info("Executed approvalStageConfiguration Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed approvalStageConfiguration"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void reviewStageConfiguration(int value) {
		try{
			log.info("Entered reviewStageConfiguration succesfully");
			setValueInDropdownByIndex(dd_reviewStage, value);
			log.info("Executed reviewStageConfiguration Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed reviewStageConfiguration"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void FirstLevelWorkFlow(String workFlow) {
		try{
			log.info("Entered FirstLevelWorkFlow succesfully");
			setValueInDropdownByValue(dd_workFlow, workFlow);
			log.info("Executed FirstLevelWorkFlow Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed FirstLevelWorkFlow");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnContinue() {
		try{
			log.info("Entered clickOnContinue succesfully");
			ManagerUtil.waitFor(300);
			click(btn_continue);
			log.info("Executed clickOnContinue Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickOnContinue");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void Dd_approvalStage_click() {
		try{
			log.info("Entered dd_approvalStage_click succesfully");
			click(dd_approvalStage_click);
			log.info("Executed dd_approvalStage_click Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed dd_approvalStage_click");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void clickTriggerNewReview() {
		try{
			log.info("Entered clickTriggerNewReview succesfully");
			click(clk_TriggerNewReview);
			log.info("Executed clickTriggerNewReview Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickTriggerNewReview");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void clicksubmitReviewSubmitButton() {
		try{
			log.info("Entered clicksubmitReviewSubmitButton succesfully");
			click(submitReviewSubmitButton);
			log.info("Executed clicksubmitReviewSubmitButton Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clicksubmitReviewSubmitButton");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void validateProgramConfiguration() {
		try{
			log.info("Entered validateProgramConfiguration succesfully");
			Assert.assertEquals("Number of KPI", lbl_programConfiguration.getText(),
					"After clicking Continue it is not navigating on program configuration page");
			log.info("Executed validateProgramConfiguration Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed validateProgramConfiguration"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void enterMinKpiBox(String value) {
		try{
			log.info("Entered enterMinKpiBox succesfully");
			txtBx_minKpi.clear();
			writeText(txtBx_minKpi, value);
			log.info("Executed enterMinKpiBox Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed enterMinKpiBox");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void enterMaxKpiBox(String value) {
		try{
			log.info("Entered enterMaxKpiBox succesfully");
			txtBx_maxKpi.clear();
			writeText(txtBx_maxKpi, value);
			log.info("Executed enterMaxKpiBox Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed enterMaxKpiBox");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnMTD() {
		try{
			log.info("Entered clickOnMTD succesfully");
			click(rb_clickOn_MTD);
			log.info("Executed clickOnMTD Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed clickOnMTD"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnYTD() {
		try{
			log.info("Entered clickOnYTD succesfully");
			click(rb_clickOn_YTD);
			log.info("Executed clickOnYTD Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed clickOnYTD"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void enterMinWeightageKpi(String value) {
		try{
			log.info("Entered enterMinWeightageKpi succesfully");
			clear(txtBx_minWeightageKpi);
			writeText(txtBx_minWeightageKpi, value);
			log.info("Executed enterMinWeightageKpi Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed enterMinWeightageKpi"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void enterMaxWeightageKpi(String value) {
		try{
			log.info("Entered enterMaxWeightageKpi succesfully");
			clear(txtBx_maxWeightageKpi);
			writeText(txtBx_maxWeightageKpi, value);
			log.info("Executed enterMaxWeightageKpi Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed enterMaxWeightageKpi"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnAdvanceSetting() {
		try{
			log.info("Entered clickOnAdvanceSetting succesfully");
			click(lnk_advancedSetting);
			log.info("Executed clickOnAdvanceSetting Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickOnAdvanceSetting");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void ratio_Core_and_individual_KPI(String value) {
		try
		{log.info("Entered ratio_Core_and_individual_KPI succesfully");
		scrollUpAndDown(200);
		clear(txtBx_ratioKpi);
		writeText(txtBx_ratioKpi, value);
		log.info("Executed ratio_Core_and_individual_KPI Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed ratio_Core_and_individual_KPI"); 
			e.printStackTrace();
			throw e;
		}
	}

	public void max_Initiative_Kpi_Weightage(String value) {
		try{
			log.info("Entered max_Initiative_Kpi_Weightage succesfully");
			clear(txtBx_initiativeKpi);
			writeText(txtBx_initiativeKpi, value);
			log.info("Executed max_Initiative_Kpi_Weightage Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed max_Initiative_Kpi_Weightage"); 
			e.printStackTrace();
			throw e;
		}
	}

	public void allowQualityRating(int value) {
		try{
			log.info("Entered allowQualityRating succesfully");
			setValueInDropdownByIndex(dd_allowQualityRating, value);
			log.info("Executed allowQualityRating Successfully");
		} catch (Exception e) 
		{
			log.error("Not Executed allowQualityRating");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void selectTemplates(int value, int template) {
		try{
			log.info("Entered selectTemplates succesfully");
			scrollUpAndDown(value);
			setValueInDropdownByIndex(dd_reviewTemplates, template);
			log.info("Executed selectTemplates Successfully");
		} 
		catch (Exception e) {

			log.error("Not Executed selectTemplates");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void selectStrategy(String value) {

		try{
			log.info("Entered selectStrategy succesfully");
			setValueInDropdownText(dd_selectStrategy, value);
			log.info("Executed selectStrategy Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed selectStrategy"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void attachmentMandatory() {
		try{
			log.info("Entered attachmentMandatory succesfully");
			waitUntilElementToBeClickable(rb_attachment);
			click(rb_attachment);
			log.info("Executed attachmentMandatory Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed attachmentMandatory"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	public void EnableOnSystemKpi()
	{
		try 
		{
			log.info("Entered EnableOnSystemKpi succesfully");
			waitUntilElementToBeClickable(rb_systemKpi);
			click(rb_systemKpi);
			log.info("Executed EnableOnSystemKpi Successfully");
		} 
		catch (Exception e) {
			log.error("Not Executed EnableOnSystemKpi"); 
			e.printStackTrace();
			throw e;
		}
	}

	public void setSystemKPIWeightage(String weightage) {
		try{
			log.info("Entered setSystemKPIWeightage succesfully");
			writeText(txt_systemKpiWeightage,weightage);
			log.info("Executed setSystemKPIWeightage Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed setSystemKPIWeightage");
			e.printStackTrace(); 
			throw e;

		}

	}
	public void EnableOnSystemKpiValues()
	{
		try 
		{
			log.info("Entered EnableOnSystemKpiValues succesfully");
			waitUntilElementToBeClickable(rb_systemKpiValues);
			click(rb_systemKpiValues);
			log.info("Executed EnableOnSystemKpiValues Successfully");
		} 
		catch (Exception e) {
			log.error("Not Executed EnableOnSystemKpiValues"); 
			e.printStackTrace();
			throw e;
		}
	}

	public void allowToReject() {
		try{
			log.info("Entered allowToReject succesfully");
			waitUntilElementToBeClickable(rb_allowToReject);
			click(rb_allowToReject);
			log.info("Executed allowToReject Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed allowToReject"); 
			e.printStackTrace();
			throw e;
		}
	}

	public void aggregateTeamScore() {
		try{
			log.info("Entered aggregateTeamScore succesfully");
			waitUntilElementToBeClickable(rb_aggregateTeamScore);
			click(rb_aggregateTeamScore);
			log.info("Executed aggregateTeamScore Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed aggregateTeamScore"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void AppersialFeedBack() {
		try{
			log.info("Entered AppersialFeedBack succesfully");
			waitUntilElementToBeClickable(rb_AppersialFeedback);
			click(rb_AppersialFeedback);
			log.info("Executed AppersialFeedBack Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed AppersialFeedBack"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	public void userCommentMand() {
		try{
			log.info("Entered userCommentMand succesfully");
			waitUntilElementToBeClickable(rb_userComment);
			click(rb_userComment);
			log.info("Executed userCommentMand Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed userCommentMand");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void validationForScalePage() {
		try{
			log.info("Entered validationForScalePage succesfully");
			Assert.assertEquals("Hide first level lower end", lbl_hideFirstLvl.getText(),
					"After clicking continue system is not navigating ScalePage");
			log.info("Executed validationForScalePage Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed validationForScalePage"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnAddMore() {
		try{
			log.info("Entered clickOnAddMore succesfully");
			click(btn_addMoreScale);
			log.info("Executed clickOnAddMore Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickOnAddMore"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void enterScaleData(Integer count, String title, String score, String description, String target,
			String color) {
		try{
			log.info("Entered enterScaleData succesfully");
			//WebElement txtBx_title = webDriver.findElement(By.xpath(titlePath + "[" + (count + 1) + "]//input"));
			WebElement txtBx_title = webDriver.findElement(By.xpath(titlePath + "[" + count + "]"));
			// To close previous color box
			if (count >= 2)
				click(txtBx_title);

			txtBx_title.clear();
			writeText(txtBx_title, title);

			WebElement txtBx_score = webDriver.findElement(By.xpath(scorePath + "[" + count + "]"));
			txtBx_score.clear();
			writeText(txtBx_score, score);

			WebElement txtBx_description = webDriver.findElement(By.xpath(descriptionPath + "[" + count + "]"));
			txtBx_description.clear();
			writeText(txtBx_description, description);

			WebElement txtBx_target = webDriver.findElement(By.xpath(targetPath + "[" + count + "]"));
			txtBx_target.clear();
			writeText(txtBx_target, target);

			WebElement btn_color = webDriver.findElement(By.xpath(btn_colorPath + "[" + count + "]"));
			click(btn_color);

			WebElement txtBx_color = webDriver.findElement(By.xpath(txtBx_colorPath + "[" + count + "]"));
			txtBx_color.clear();
			writeText(txtBx_color, color);

			log.info("Executed enterScaleData Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed enterScaleData"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnDeleteButton() {
		try{
			log.info("Entered clickOnDeleteButton succesfully");
			click(btn_delete);
			log.info("Executed clickOnDeleteButton Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickOnDeleteButton"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnSaveButton() {
		try{
			log.info("Entered clickOnSaveButton succesfully");
		waitUntilElementToBeClickable(btn_save);
		click(btn_save);
		waitFor(3000);
		log.info("Executed clickOnSaveButton Successfully");
		} 
		catch (Exception e) {
			log.error("Not Executed clickOnSaveButton"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void clickOnCommentSaveButton() {
		try{
			log.info("Entered clickOnCommentSaveButton succesfully");
		waitUntilElementToBeClickable(btn_CommentSave);
		click(btn_CommentSave);
		waitFor(1000);
		log.info("Executed clickOnCommentSaveButton Successfully");
		} 
		catch (Exception e) {
			log.error("Not Executed clickOnCommentSaveButton"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void clickBtn_VerifyPerformanceReview() {
		try{
			log.info("Entered clickBtn_VerifyPerformanceReview succesfully");
		waitUntilElementToBeClickable(btn_VerifyPerformanceReview);
		click(btn_VerifyPerformanceReview);
		waitFor(3000);
		log.info("Executed clickBtn_VerifyPerformanceReview Successfully");
		} 
		catch (Exception e) {
			log.error("Not Executed clickBtn_VerifyPerformanceReview"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	
	/*public void verifycreatedProgram() throws Exception {
		try{
			log.info("Entered verifycreatedProgram succesfully");
			waitFor(1000);
			WebElement table = webDriver.findElement(By.cssSelector
					("div[class='w-100 float-left mt-3'] div[class='w-100 float-left']"));
			int count = table.findElements(By.cssSelector
					("div[class='w-100 float-left mt-3'] div[class='w-100 float-left'] div div:first-child h6")).size();
			System.out.println(count);
			String pgms = null;
			for(int i = 0; i<count; i++) {
				pgms = table.findElements(By.xpath
			("//div[@class='w-100 float-left p-md-2 grid-details']//div[1]")).get(i).getText();
				System.out.println(pgms);
			}
			
			String programName = ExcelFileReader.getCellValue
					("programdata.xlsx", "Create_Program",2, "A");
			String finalProgramName = programName+"_"+ConfigFileReader.getExecutionRunCount();
			System.out.println(finalProgramName+"*****************finalprogramname******************");
//			return finalProgramName;
			boolean foundProgarm = false;
			for(int i = 0; i<count; i++) {
				if(table.findElements(By.cssSelector("div[class='w-100 float-left mt-3'] div[class='w-100 float-left'] div div:first-child h6"))
					.get(i).getText().trim().contains(finalProgramName)) {
					String finalPgmName =webDriver.findElement(By.xpath("//h6[contains(text(),'"+finalProgramName+"')]")).getText();
					System.out.println(finalPgmName);
					log.info("Executed verifycreatedProgram Successfully"+finalProgramName);
				foundProgarm = true;
				break;
				}
			}
			if(foundProgarm == true) 
				log.info("Executed verifycreatedProgram Successfully");
			else 
				log.info("Could not find the program created");
			//h6[contains(text(),'"+finalProgramName+"')]
			
//			"//div[@class='card-body']//b[text()='" + programName
//			+ "']//..//..//..//..//..//div[@class='btn-card']";
//			String finalPgmName = h6[normalize-space()='finalProgramName']
//			assertTrue(verifyMessage("Program Updated Successfully"), "program not saved");
			log.info("Executed verifycreatedProgram Successfully_"+finalProgramName);
		}
		catch (Exception e) 
		{
			log.error("Not Executed verifycreatedProgram"); 
			e.printStackTrace(); 
			throw e;
		}
	}*/
	
	public void verifycreatedProgram() throws Exception {
		try{
			log.info("Entered verifycreatedProgram succesfully");	
			
			String programName = ExcelFileReader.getCellValue
					("programdata.xlsx", "Create_Program",2, "A");
			String finalProgramName = programName+"_"+ConfigFileReader.getExecutionRunCount();
			WebElement table = webDriver.findElement(By.cssSelector("div[class='w-100 float-left mt-3'] div[class='w-100 float-left']"));
			String pgmName=table.findElement(By.xpath("//h6[contains(text(),'"+finalProgramName+"')]")).getText();
			System.out.println("created Program is "+pgmName+"_+_+_+_+_+++_+_+_+_+_+_+_+_+_+_+_+");
			Assert.assertTrue(true);
//			assertTrue(verifyMessage("Program Updated Successfully"), "program not saved");
			
			log.info("Executed verifycreatedProgram Successfully_"+finalProgramName);

		}
		catch (Exception e) 
		{
			log.error("Not Executed verifycreatedProgram"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void findProgramName() throws Exception {
		try {	
			log.info("Entered findProgramName succesfully");
			String programName = ExcelFileReader.getCellValue
					("programdata.xlsx", "Create_Program",2, "A");
			String finalProgramName = programName+"_"+ConfigFileReader.getExecutionRunCount();
//			waitFor(1000);
//			WebElement table = webDriver.findElement
//					(By.cssSelector("div[class='w-100 float-left mt-3'] div[class='w-100 float-left']"));
////			int rowCount = table.findElements
////					(By.xpath("//div[@class='w-100 float-left p-md-2 grid-details']")).size();
////			System.out.println(rowCount);
//			waitFor(1000);
//			System.out.println("I am entered column");
//			int count = table.findElements
//					(By.xpath("//div[@class='w-100 float-left p-md-2 grid-details']//div[1]")).size();
//			System.out.println(count);
//			String pgms = null;
//			for(int i = 0; i<count; i++) {
//				pgms = table.findElements(By.xpath("//div[@class='w-100 float-left p-md-2 grid-details']//div[1]")).get(i).getText();
//				System.out.println(pgms);
//				Thread.sleep(2000);
//				table.findElement(By.xpath("//h6[contains(text(),'AutoTestProgram_116')]")).click();
//				//table.findElement(By.linkText("AutoTestProgram_112")).click();
//				//break;
			//cssSelector("div[class='w-100 float-left mt-3'] div[class='w-100 float-left'] div div:first-child h6

			WebElement table = webDriver.findElement(By.cssSelector("div[class='w-100 float-left mt-3'] div[class='w-100 float-left']"));
//			int rowCount = table.findElements(By.xpath("//div[@class='w-100 float-left p-md-2 grid-details']")).size();
//			System.out.println(rowCount);
//			int count = table.findElements(By.cssSelector("div[class='w-100 float-left mt-3'] div[class='w-100 float-left'] div div:first-child h6")).size();
//			System.out.println(count);
//			String pgms;

//			for(int i = 0; i<count; i++) {
//				pgms = table.findElements(By.cssSelector
//						("div[class='w-100 float-left mt-3'] div[class='w-100 float-left'] div div:first-child h6")).get(i).getText();
//				System.out.println(pgms);
//				Thread.sleep(2000);
//				table.findElement(By.xpath("//h6[contains(text(),'"+finalProgramName+"')]")).click();
//				//break;
//			}
			table.findElement(By.xpath("//h6[contains(text(),'"+finalProgramName+"')]")).click();
			log.info("The latest created program is "+finalProgramName+"-------------------------------------------");
			log.info("Executed findProgramName successfully");
		}catch (Exception e) 
		{
			log.error("Not Executed findProgramName");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void verifyEditProgram() {
		try{
			log.info("Entered verifyEditProgram succesfully");
			waitFor(1000);
			
			assertTrue(verifyMessage("Program Updated Successfully"), "program not saved");
			log.info("Executed verifyEditProgram Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed verifyEditProgram");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickActionButton() {
		try{
			log.info("Entered clickActionButton succesfully");
			waitUntilElementToBeClickable(btn_action);
			click(btn_action);
			log.info("Executed clickActionButton Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickActionButton"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickEditButton() {
		try{
			log.info("Entered clickEditButton succesfully");
			waitUntilElementToBeClickable(btn_Edit);
			click(btn_Edit);
			log.info("Executed clickEditButton Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed clickEditButton");
			e.printStackTrace();
			throw e;
		}

	}

	public void clickStartButton() {
		try{
			log.info("Entered clickStartButton succesfully");
			click(btn_Start);
			log.info("Executed clickStartButton Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickStartButton");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void clickTriggerReview() {
		try{
			log.info("Entered clickTriggerReview succesfully");
			click(btn_TriggerReview);
			log.info("Executed clickTriggerReview Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickTriggerReview");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	
	public void clickValidateAndTriggerReview() {
		try{
			log.info("Entered clickValidateAndTriggerReview succesfully");
			click(btn_ValidateAndTriggerReview);
			log.info("Executed clickValidateAndTriggerReview Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickValidateAndTriggerReview");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	
	public void clickOnIncludeeveryoneexcept() {
		try{
			log.info("Entered clickOnIncludeeveryoneexcept succesfully");
			click(rbtn_inculdeEveryoneExculde);
			log.info("Executed clickOnIncludeeveryoneexcept Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickOnIncludeeveryoneexcept"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnIncludeeveryoneIn() {
		try{
			log.info("Entered clickOnIncludeeveryoneIn succesfully");
			click(rbtn_inculdeEveryoneIn);
			log.info("Executed clickOnIncludeeveryoneIn Successfully");
		}
		catch (Exception e)
		{
			log.error("Not Executed clickOnIncludeeveryoneIn"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void validateStartProgramPage() {
		try{
			log.info("Entered validateStartProgramPage succesfully");
			Assert.assertEquals(rbtn_validateStartProgramPage.getText(), "Start Performance Program",
					"After clicking on start button it is not navigating to Start Program Page");
			log.info("Executed validateStartProgramPage Successfully");
		}
		catch (Exception e)
		{
			log.error("Not Executed validateStartProgramPage"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void selectIncludeEveryoneExcept() {
		try{
			log.info("Entered selectIncludeEveryoneExcept succesfully");
			click(rdbt_includeEveryone_Except);
			log.info("Executed selectIncludeEveryoneExcept Successfully");
		} 
		catch (Exception e) {
			log.error("Not Executed selectIncludeEveryoneExcept");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void selectIncludeEveryoneIn() {
		try{
			log.info("Entered selectIncludeEveryoneIn succesfully");
			click(rdbt_includeEveryone_in);
			log.info("Executed selectIncludeEveryoneIn Successfully");
		}
		catch (Exception e) 
		{
			log.error("Not Executed selectIncludeEveryoneIn");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickdonot_have_employee_codes() {
		try{
			log.info("Entered clickdonot_have_employee_codes succesfully");
			click(getbtn_donot_have_employee_codes);
			log.info("Executed clickdonot_have_employee_codes Successfully");
		}
		catch (Exception e) 
		{
			log.error("Not Executed clickdonot_have_employee_codes"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void verifyforEmployeeAdvanceSearchPage() {
		try{
			log.info("Entered verifyforEmployeeAdvanceSearchPage succesfully");
			Assert.assertEquals(getLbl_employeeAdvanceSerach.getText(), "Employee Advanced Search",
					"After Clicking on Do not have Employee codes? not navigating to user page ");
			log.info("Executed verifyforEmployeeAdvanceSearchPage Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed verifyforEmployeeAdvanceSearchPage"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnFilter() {
		try{
			log.info("Entered clickOnFilter succesfully");
			click(getDp_filter);
			log.info("Executed clickOnFilter Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed clickOnFilter");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnIncludeEmployeeCode(String value) {
		try{
			log.info("Entered clickOnIncludeEmployeeCode succesfully");
			writeText(getTxtBx_includeEmploye_code, value);
			log.info("Executed clickOnIncludeEmployeeCode Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed clickOnIncludeEmployeeCode"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnExcludeEmplloyeeCode(String value) {
		try{
			log.info("Entered clickOnExcludeEmplloyeeCode succesfully");
			writeText(getTxtBx_ExcludeEmploye_code, value);
			log.info("Executed clickOnExcludeEmplloyeeCode Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed clickOnExcludeEmplloyeeCode"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnDesignationDD() {
		try{
			log.info("Entered clickOnDesignationDD succesfully");
			click(getdd_designation);
			log.info("Executed clickOnDesignationDD Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickOnDesignationDD"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnDesSearch(String value) {
		try{
			log.info("Entered clickOnDesSearch succesfully");
			writeText(getTxtBx_designation, value);
			log.info("Executed clickOnDesSearch Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickOnDesSearch");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnDesCheckBox() {
		try{
			log.info("Entered clickOnDesCheckBox succesfully");
			waitUntilElementToBeClickable(getCheckbox_checkBoxDes);
			click(getCheckbox_checkBoxDes);
			log.info("Executed clickOnDesCheckBox Successfully");
		}
		catch (Exception e) 
		{
			log.error("Not Executed clickOnDesCheckBox"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnGradeDD() {
		try{
			log.info("Entered clickOnGradeDD succesfully");
			click(getdd_grade);
			log.info("Executed clickOnGradeDD Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed clickOnGradeDD"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOngradeSearch(String value) {
		try{
			log.info("Entered clickOngradeSearch succesfully");
			writeText(getTxtBx_grade, value);
			log.info("Executed clickOngradeSearch Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed clickOngradeSearch");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOngradeCheckBox() {
		try{
			log.info("Entered clickOngradeCheckBox succesfully");
			waitUntilElementToBeClickable(getTxtBx_checkBoxGrade);
			click(getTxtBx_checkBoxGrade);
			log.info("Executed clickOngradeCheckBox Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed clickOngradeCheckBox"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnCatogeryDD() {
		try{
			log.info("Entered clickOnCatogeryDD succesfully");
			click(getdd_catogery);
			log.info("Executed clickOnCatogeryDD Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed clickOnCatogeryDD"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOncatogerySearch(String value) {
		try{
			log.info("Entered clickOncatogerySearch succesfully");
			writeText(getTxtBx_catogery, value);
			log.info("Executed clickOncatogerySearch Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickOncatogerySearch");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOncatogeryCheckBox() {
		try{
			log.info("Entered clickOncatogeryCheckBox succesfully");
			waitUntilElementToBeClickable(getTxtBx_checkBoxcatogery);
			click(getTxtBx_checkBoxcatogery);
			log.info("Executed clickOncatogeryCheckBox Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickOncatogeryCheckBox"); 
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnApply() {
		try{
			log.info("Entered clickOnApply succesfully");
			click(getbtn_Apply);
			log.info("Executed clickOnApply Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed clickOnApply");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnStart() {
		try{
			log.info("Entered clickOnStart succesfully");
		waitUntilElementToBeClickable(getbtn_startProgram);
		click(getbtn_startProgram);
		log.info("Executed clickOnStart Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickOnStart"); 
			e.printStackTrace(); 
			throw e;
		}

	}

	public void verifyStartProgram() {
		try{
			log.info("Entered verifyStartProgram succesfully");
//			waitFor(1000);
			assertTrue(verifyMessage("Program Started"), "program not saved");
			log.info("Executed verifyStartProgram Successfully");
		}
		catch (Exception e) 
		{
			log.error("Not Executed verifyStartProgram"); 
			e.printStackTrace();
			throw e;
		}
	}

	public void clickonconfirm() {
		try{
			log.info("Entered clickonconfirm succesfully");
			waitUntilElementToBeClickable(getbtn_confirm);
			click(getbtn_confirm);
			waitFor(2000);
			log.info("Executed clickonconfirm Successfully");
		} 
		catch (Exception e) {
			log.error("Not Executed clickonconfirm"); 
			e.printStackTrace();
			throw e;
		}
	}
	
	public void clickBtn_OkConfirm() {
		try{
			log.info("Entered clickBtn_OkConfirm succesfully");
			waitUntilElementToBeClickable(getbtn_OkConfirm);
			click(getbtn_OkConfirm);
			waitFor(2000);
			log.info("Executed clickBtn_OkConfirm Successfully");
		} 
		catch (Exception e) {
			log.error("Not Executed clickBtn_OkConfirm"); 
			e.printStackTrace();
			throw e;
		}
	}
	

	public void clickonView() {
		try
		{
		log.info("Entered clickonView succesfully");
		click(getbtn_view);
		log.info("Executed clickonView Successfully");
		}
		catch (Exception e) 
		{
			log.error("Not Executed clickonView");
			e.printStackTrace();
			throw e;
		}
	}

	public void verifyforviewpage() {
		try{
			log.info("Entered verifyforviewpage succesfully");
			Assert.assertEquals("View Performance Program", getlbl_viewPerformanceProgram.getText(),
					"After clicking on view tab it not naivigating to View Performance Program page");
			log.info("Executed verifyforviewpage Successfully");
		} catch (Exception e)
		{
			log.error("Not Executed verifyforviewpage"); 
			e.printStackTrace();
			throw e;
		}
	}

	public void validateProgramNameText(String value) {
		try{
			log.info("Entered validateProgramNameText succesfully");
			waitUntilElementVisible(getTxtBx_viewprogramName);
			Assert.assertEquals(value, getTxtBx_viewprogramName.getAttribute("value"),
					"Program name is not matching as per given");
			log.info("Executed validateProgramNameText Successfully");
		}
		catch (Exception e)
		{
			log.error("Not Executed validateProgramNameText"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void validateModel(String value) {
		try{
			log.info("Entered validateModel succesfully");
			waitUntilElementVisible(getTxtBx_viewModel);
			Assert.assertTrue(getTxtBx_viewModel.getAttribute("value").equalsIgnoreCase(value),
					"Program model is not matching as per given");
			log.info("Executed validateModel Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed validateModel"); 
			e.printStackTrace();
			throw e;
		}

	}

	public void validateProgramAprovalStage(String value) {
		try{
			log.info("Entered validateProgramAprovalStage succesfully");
			Assert.assertEquals(getTxtBx_viewAprovalStage.getAttribute("value"), value,
					"Program Aproval stage is not matching as per given");
			log.info("Executed validateProgramAprovalStage Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed validateProgramAprovalStage");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void validateProgramReviewStage(String value) {
		try{
			log.info("Entered validateProgramReviewStage succesfully");
			Assert.assertEquals(getTxtBx_viewAprovalStage.getAttribute("value"), value,
					"Program review stage is not matching as per given");
			log.info("Executed validateProgramReviewStage Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed validateProgramReviewStage");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnNext() {
		try{
			log.info("Entered clickOnNext succesfully");
			click(getBtn_Next);
			log.info("Executed clickOnNext Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickOnNext"); 
			e.printStackTrace(); 
			throw e;
		}
	}


	public void validateviewMinkpi(String value) {
		try{
			log.info("Entered validateviewMinkpi succesfully");
			Assert.assertEquals(txtBx_minKpi.getAttribute("value"), value, "Program min kpi is not matching as per given");
			log.info("Executed validateviewMinkpi Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed validateviewMinkpi"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void validateviewMaxKpi(String value) {
		try{
			log.info("Entered validateviewMaxKpi succesfully");
			Assert.assertEquals(txtBx_maxKpi.getAttribute("value"), value, "Program max kpi is not matching as per given");
			log.info("Executed validateviewMaxKpi Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed validateviewMaxKpi"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void validateviewMinWeightage(String value) {
		try{
			log.info("Entered validateviewMinWeightage succesfully");
			Assert.assertEquals(txtBx_minWeightageKpi.getAttribute("value"), value,
					"Program min kpi wightage is not matching as per given");
			log.info("Executed validateviewMinWeightage Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed validateviewMinWeightage"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void validateviewMaxWeightage(String value) {
		try{
			log.info("Entered validateviewMaxWeightage succesfully");
			Assert.assertEquals(txtBx_maxWeightageKpi.getAttribute("value"), value,
					"Program max kpi wightage is not matching as per given");
			log.info("Executed validateviewMaxWeightage Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed validateviewMaxWeightage"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void validateforAttachment() {
		try{
			log.info("Entered validateforAttachment succesfully");
			Assert.assertEquals(rb_viewattachment.getAttribute("style"),
					"background-color: rgb(100, 189, 99); border-color: rgb(223, 223, 223);", "Attchment is enable");
			log.info("Executed validateforAttachment Successfully");
		} catch (Exception e) 
		{
			log.error("Not Executed validateforAttachment"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void validateforRejectReview() {
		try{
			log.info("Entered validateforRejectReview succesfully");
			//      Assert.assertEquals(rb_viewrejectReview.getAttribute("style"),
			//          "background-color: rgb(100, 189, 99); border-color: rgb(223, 223, 223);", "RejectReviw is Disable");
			Assert.assertEquals(rb_viewrejectReview.getAttribute("style"),
					"background-color: rgb(100, 189, 99); border-color: rgb(223, 223, 223);", "RejectReviw is Disable");
			log.info("Executed validateforRejectReview Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed validateforRejectReview");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void validateforAgregate() {
		try{
			log.info("Entered validateforAgregate succesfully");
			//      Assert.assertEquals(rb_viewagregate.getAttribute("style"),
			//          "background-color: rgb(255, 255, 255); border-color: rgb(223, 223, 223);", "Agregate is Disable");
			Assert.assertEquals(rb_viewagregate.getAttribute("style"),
					"background-color: rgb(100, 189, 99); border-color: rgb(223, 223, 223);", "Agregate is Disable");

			log.info("Executed validateforAgregate Successfully");} 
		catch (Exception e) 
		{
			log.error("Not Executed validateforAgregate"); 
			e.printStackTrace(); 
			throw e;
		}
	}
	public void validateforSYstemKpi() {
		try
		{
			log.info("Entered validateforSYstemKpi succesfully");
		Assert.assertEquals(rb_systemKpi.getAttribute("style"),
				"background-color: rgb(100, 189, 99); border-color: rgb(223, 223, 223);", "Agregate is Disable");
		log.info("Executed validateforSYstemKpi Successfully");
	} catch (Exception e) {
		log.error("Not Executed validateforSYstemKpi");
		e.printStackTrace();
		throw e;
	}
}
	public void validateforSYstemKpiValues() {
		try
		{
			log.info("Entered validateforSYstemKpiValues succesfully");
		Assert.assertEquals(rb_systemKpiValues.getAttribute("style"),
				"background-color: rgb(100, 189, 99); border-color: rgb(223, 223, 223);", "Agregate is Disable");
		log.info("Executed validateforSYstemKpiValues Successfully");
	} catch (Exception e) {
		log.error("Not Executed validateforSYstemKpiValues");
		e.printStackTrace();
		throw e;
	}
}
	public void validateforAppersial() {
		try
		{
			log.info("Entered validateforAppersial succesfully");
		Assert.assertEquals(rb_AppersialFeedback.getAttribute("style"),
				"background-color: rgb(100, 189, 99); border-color: rgb(223, 223, 223);", "Agregate is Disable");
		log.info("Executed validateforAppersial Successfully");
	} catch (Exception e) {
		log.error("Not Executed validateforAppersial");
		e.printStackTrace();
		throw e;
	}
}

	public void validateforCommentsMandatory() {
		try{
			log.info("Entered validateforCommentsMandatory succesfully");
			Assert.assertEquals(rb_viewCommentsMandatory.getAttribute("style"),
					"background-color: rgb(100, 189, 99); border-color: rgb(223, 223, 223);", "CommentsMandatory is enable");
			log.info("Executed validateforCommentsMandatory Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed validateforCommentsMandatory");
			e.printStackTrace();
			throw e;
		}
	}

	public void valiadateforMtd() {
		try{
			log.info("Entered valiadateforMtd succesfully");
			Assert.assertTrue(rb_viewclickOnMTD.isSelected(), "MTD is not selected");
			log.info("Executed valiadateforMtd Successfully");
		}
		catch (Exception e) 
		{
			log.error("Not Executed valiadateforMtd"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void validateViewratioCoreandindividualKPI(String value) {
		try{
			log.info("Entered validateViewratioCoreandindividualKPI succesfully");
			Assert.assertEquals(txtBx_ratioKpi_view.getAttribute("value"), value,
					"Program Raito kpi  is not matching as per given");
			log.info("Executed validateViewratioCoreandindividualKPI Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed validateViewratioCoreandindividualKPI"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void validateViewInitiativeKpi(String value) {
		try{
			log.info("Entered validateViewInitiativeKpi succesfully");
			Assert.assertEquals(txtBx_initiativeKpi_view.getAttribute("value"), value,
					"Program  Initiative kpi  is not matching as per given");
			log.info("Executed validateViewInitiativeKpi Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed validateViewInitiativeKpi"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void validateviewQualityrating(String value) {
		try{
			log.info("Entered validateviewQualityrating succesfully");
			String convert = dd_allowQualityRating.getAttribute("value");
			String index;
			if (convert.equalsIgnoreCase("ALLOW_QUALITY_RATING_YES")) {
				index = "1";
				Assert.assertEquals(index, value, "Program  Quality rating  is not matching as per given");
			}
			log.info("Executed validateviewQualityrating Successfully");
		} catch (Exception e)
		{
			log.error("Not Executed validateviewQualityrating");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void validateviewreviewTemplate(int value, String tem) {
		try{
			log.info("Entered validateviewreviewTemplate succesfully");
			scrollUpAndDown(value);
			String convert = dd_reviewTemplates.getAttribute("value");
			String index;
			if (convert.equalsIgnoreCase("ALLOW_QUALITY_RATING_YES")) {
				index = "1";
				Assert.assertEquals(index, value, "Program  Review Template  is not matching as per given");
			}
			log.info("Executed validateviewreviewTemplate Successfully");
		}
		catch (Exception e) 
		{
			log.error("Not Executed validateviewreviewTemplate");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void validateviewselectStrategy(String value) {
		try{
			log.info("Entered validateviewselectStrategy succesfully");
			String convert = dd_selectStrategy.getAttribute("value");
			String index;
			if (convert.equalsIgnoreCase("null")) {
				index = "0";
				Assert.assertEquals(index, value, "Program  Select Strategy is not matching as per given");
			}
			log.info("Executed validateviewselectStrategy Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed validateviewselectStrategy"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void viewenterScaleData(Integer count, String title, String score, String description, String target) {
		try{
			log.info("Entered viewenterScaleData succesfully");
			WebElement txtBx_title = webDriver.findElement(By.xpath(titlePath + "[" + count + "]"));
			//WebElement txtBx_title = webDriver.findElement(By.xpath(titlePath + "[" + (count + 1) + "]//input"));
			Assert.assertEquals(txtBx_title.getAttribute("value"), title, "Title is not matching as per given");
			WebElement txtBx_score = webDriver.findElement(By.xpath(scoreViewPath + "[" + (count) + "]"));
			Assert.assertEquals(txtBx_score.getAttribute("value"), score, "Score is not matching as per given");
			WebElement txtBx_description = webDriver.findElement(By.xpath(descriptionPath + "[" + count + "]"));
			Assert.assertEquals(txtBx_description.getAttribute("value"), description, "Description is showin as per given");
			WebElement txtBx_target = webDriver.findElement(By.xpath(targetViewPath + "[" + count + "]"));
			Assert.assertEquals(txtBx_target.getAttribute("value"), target, "Given target is not matching");
			log.info("Executed viewenterScaleData Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed viewenterScaleData"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOncloseView() {
		try{
			log.info("Entered clickOncloseView succesfully");
			click(getBtn_closeView);
			log.info("Executed clickOncloseView Successfully");
		} catch (Exception e) 
		{
			log.error("Not Executed clickOncloseView"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnStartProgram() {
		try{
			log.info("Entered clickOnStartProgram succesfully");
			click(getbtn_startProgram);
			log.info("Executed clickOnStartProgram Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickOnStartProgram");
			e.printStackTrace(); 
			throw e;
		}

	}

	public void enterLevel1(String value) {
		try{
			log.info("Entered enterLevel1 succesfully");
			writeText(level1, value);
			log.info("Executed enterLevel1 Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed enterLevel1"); 
			e.printStackTrace(); 
			throw e;
		}

	}

	public void enterLevel2(String value) {
		try{
			log.info("Entered enterLevel2 succesfully");
			writeText(level2, value);
			log.info("Executed enterLevel2 Successfully");
		}
		catch (Exception e) 
		{
			log.error("Not Executed enterLevel2"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void enterLevel3(String value) {
		try{
			log.info("Entered enterLevel3 succesfully");
			clear(level3);
			writeText(level3, value);
			log.info("Executed enterLevel3 Successfully");
		} 
		catch (Exception e)
		{
			log.error("Not Executed enterLevel3");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void enterLevel4(String value) {
		try{log.info("Entered enterLevel4 succesfully");
		writeText(level4, value);
		log.info("Executed enterLevel4 Successfully");
		} catch (Exception e) 
		{
			log.error("Not Executed enterLevel4");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void enterLevel5(String value) {
		try{
			log.info("Entered enterLevel5 succesfully");
			writeText(level5, value);
			log.info("Executed enterLevel5 Successfully");
		} 
		catch (Exception e) {
			log.error("Not Executed enterLevel5");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void textEditEnterEmployeeCode(String value) {
		try{
			log.info("Entered EMP_ID text area succesfully");
			waitFor(1000);
			writeText(txt_EditEnterEmployeeCode, value);
			log.info("Executed EMP_ID text Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed EMP_ID text successfully");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void textEditSubmitPerformanceComment(String value) {
		try{
			log.info("Entered txt_SubmitPerformanceComment text area succesfully");
			waitFor(1000);
			writeText(txt_SubmitPerformanceComment, value);
			log.info("Executed txt_SubmitPerformanceComment text Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed txt_SubmitPerformanceComment text successfully");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void textEdit_submitReivewComment(String value) {
		try{
			log.info("Entered TextEdit_submitReivewComment text area succesfully");
			waitFor(1000);
			writeText(txt_submitReivewComment, value);
			log.info("Executed TextEdit_submitReivewComment text Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed TextEdit_submitReivewComment text successfully");
			e.printStackTrace(); 
			throw e;
		}
	}
	
//	public void TextEdit_OverallPerformanceComment(String value) {
//		try{
//			log.info("Entered TextEdit_OverallPerformanceComment text area succesfully");
//			waitFor(1000);
//			writeText(txt_OverallPerformanceComment, value);
//			log.info("Executed TextEdit_OverallPerformanceComment text Successfully");
//		} 
//		catch (Exception e) 
//		{
//			log.error("Not Executed TextEdit_OverallPerformanceComment text successfully");
//			e.printStackTrace(); 
//			throw e;
//		}
//	}
	
	public void clickOnValidateAndStart() {
		try{
			log.info("Entered clickOnValidateAndStart succesfully");
			click(getValidateandStart_btn);
			log.info("Executed clickOnValidateAndStart Successfully");
		}
		catch (Exception e)
		{
			log.error("Not Executed clickOnValidateAndStart"); 
			e.printStackTrace();
			throw e;
		}
	}

	public void verifyEmpId(String expected) {
		try{
			log.info("Entered verifyEmpId succesfully");
			Assert.assertTrue(verifyData(expected, empId_lbl), "EmpId doesn't match!!, Expected: "+ expected
					+ ", Actual: " + empId_lbl.getText());
			log.info("Executed verifyEmpId Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed verifyEmpId");
			e.printStackTrace();
			throw e;
		}
	}
	public void clickActionButtonByProgramname(String programname) {
		try {
			log.info("Entered clickActionButtonByProgramname succesfully");
			WebElement actions_btn = webDriver.findElement(By.xpath("(//h6[contains(text(),'"+programname+"')])[1]/../following-sibling::div[last()]"));
			waitUntilElementVisible(actions_btn);
			click(actions_btn);
			log.info("Executed clickActionButtonByProgramname Successfully");
		
		} catch (Exception e) {
			log.error("Not Executed clickActionButtonByProgramname");
			e.printStackTrace();
			throw e;
		}
	}
	//360 enabled and self reviewed
	
	public void clickOn360Feedback()
	{
		try 
		{
			log.info("Entered clickOn360Feedback succesfully");
			waitUntilElementToBeClickable(rb_360feddback);
			click(rb_360feddback);
			log.info("Executed clickOn360Feedback Successfully");
			
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickOn360Feedback");
			e.printStackTrace();
			throw e;
		}
	}
	public void clickOnselfreviewed()
	{
		try 
		{
			log.info("Entered clickOnselfreviewed succesfully");
			waitUntilElementToBeClickable(rb_selfreviwed);
			click(rb_selfreviwed);
			log.info("Executed clickOnselfreviewed Successfully");
			
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickOnselfreviewed");
			e.printStackTrace();
			throw e;
		}
	}
	
}
