package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import org.testng.annotations.Test;
import util.DateUtil;
import org.apache.log4j.Logger;
import helper.LoggerHelper;
import net.bytebuddy.utility.RandomString;

public class CompetencyProgramPage extends BasePage {

	int Year = DateUtil.getCurrentYear();
	int Month = DateUtil.getCurrentMonth();
	int Date = DateUtil.getCurrentDay();

	public CompetencyProgramPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Define 360 Program")
	private WebElement lnk_defineCompetencyProg;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create Program')]")
	private WebElement createProgram_btn;

	// competency Details

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Competency Program Management')]")
	private WebElement lbl_competencyProgramManagement;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Create Competency Program')]")
	private WebElement lbl_createCompetencyProgram;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Edit Competency Program')]")
	private WebElement lbl_editCompetencyProgram;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Competency Details')]")
	private WebElement lbl_competencyDetails;

	@FindBy(how = How.NAME, using = "programName")
	private WebElement programName_txt;

	@FindBy(how = How.XPATH, using = "//input[@name='startDate']/../button")
	private WebElement dp_startDateBtn;

	@FindBy(how = How.XPATH, using = "//select[@class='custom-select'][1]")
	private WebElement customMonth;

	@FindBy(how = How.XPATH, using = "//select[@class='custom-select'][2]")
	private WebElement customyear;

	@FindBy(how = How.XPATH, using = "//input[@name=\"endDate\"]/../button")
	private WebElement dp_endDateBtn;

	@FindBy(how = How.XPATH, using = "//select[@name='employeeLevel']")
	private WebElement employeeLevel_drpdwn;

	@FindBy(how = How.XPATH, using = "//select[@name='orgUnitTypeName']")
	private WebElement orgDefination_drpdwn;

	@FindBy(how = How.XPATH, using = "//select[@name='invitationInitiatorParam']")
	private WebElement invitationInitiatorParam_drpdwn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save & Continue')]")
	private WebElement saveAndContinue_btn;

	// Eligible Response

	@FindBy(how = How.ID, using = "minimumTotalInvitations")
	private WebElement txt_minimumTotalInvitations;

	@FindBy(how = How.ID, using = "minimumSrInvitations")
	private WebElement txt_minimumSrInvitations;

	@FindBy(how = How.ID, using = "minimumPrInvitations")
	private WebElement txt_minimumPrInvitations;

	@FindBy(how = How.ID, using = "minimumJrInvitations")
	private WebElement txt_minimumJrInvitations;

	@FindBy(how = How.ID, using = "minimumExtInvitations")
	private WebElement txt_minimumExtInvitations;

	@FindBy(how = How.ID, using = "maximumTotalInvitations")
	private WebElement txt_maximumTotalInvitations;

	@FindBy(how = How.ID, using = "maximumSrInvitations")
	private WebElement txt_maximumSrInvitations;

	@FindBy(how = How.ID, using = "maximumPrInvitations")
	private WebElement txt_maximumPrInvitations;

	@FindBy(how = How.ID, using = "maximumJrInvitations")
	private WebElement txt_maximumJrInvitations;

	@FindBy(how = How.ID, using = "maximumInvitations")
	private WebElement txt_maximumExtInvitations;

	@FindBy(how = How.XPATH, using = "//p[text()='Is Self Rating mandatory?']/../label")
	private WebElement rd_IsSelfRatingMandatory;

	@FindBy(how = How.XPATH, using = "//p[text()='Is Immediate Supervisor rating mandatory?']/../label")
	private WebElement rd_IsImmediateSupervisorRatingMandatory;

	@FindBy(how = How.XPATH, using = "//p[text()='Is Self Rating mandatory for score?']/../label")
	private WebElement rd_IsSelfRatingMandatoryForScore;

	@FindBy(how = How.XPATH, using = "//p[text()='Is Immediate Supervisor rating mandatory for score?']/../label")
	private WebElement rd_IsImmediateSupervisorRatingMandatoryForScore;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Save & Continue']")
	private WebElement SaveAndContinue;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),' Eligible Response ')]")
	private WebElement lbl_eligibleResponse;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-trash'])[last()]")
	private WebElement deleteLastScale_Btn;

	// Mandatory invitation to be sent

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Mandatory Invitation to be sent')]")
	private WebElement lbl_mandatoryInvitation;

	// scale

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),' Scale ')]")
	private WebElement lbl_scale;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add More')]")
	private WebElement addMore_Btn;

	// Questionnarie

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Start From Scratch')]")
	private WebElement startFromScratch_Btn;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Questionnaire')]")
	private WebElement lbl_questionnarie;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Add Questions']")
	private WebElement addQuestion_Btn;

	@FindBy(how = How.XPATH, using = "//quill-editor[@id='heading']/div[2]/div") //"heading")
	private WebElement question_txt;

	@FindBy(how = How.ID, using = "weightage")
	private WebElement weightage_txt;

	@FindBy(how = How.ID, using = "qtype")
	private WebElement questionType_Dwn;

	@FindBy(how = How.NAME, using = "qrName")
	private WebElement templateName_Txt;

	@FindBy(how = How.XPATH, using = "(//button[contains(text(),' Save')])[last()]")
	private WebElement save_Btn;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Publish']")
	private WebElement publish_Btn;

	@FindBy(how = How.XPATH, using = "//p[text()='Is Mandatory']/preceding-sibling::label")
	private WebElement isMadatory_chk;

	@FindBy(how = How.XPATH, using = "(//h6[contains(text(),'TestCompetency')])[1]/../../descendant::i[@class='fa fa-ellipsis-h']")
	private WebElement lnk_ellipsis;

	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Start' ]")
	private WebElement lnk_start;

	@FindBy(how = How.ID, using = "everyone")
	private WebElement includeEveryone_radio;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Validate and Start Program']")
	private WebElement ValidateStartProgram_btn;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Start Program']")
	private WebElement startProgram_btn;

	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Edit']")
	private WebElement editCompetency_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Confirm')]")
	private WebElement confirm_Btn;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Advanced Settings')]/i")
	private WebElement advancedSetting_Btn;

	private String levelPath = "(//h6[@class='mb-lg-0'])";

	private String titlePath = "(//div[@class='col-lg-3 col-md-3 col-sm-2 col-xs-2 float-left']//input)";

	private String descriptionPath = "(//input[@name='description'])";

	private String scorepath = "(//input[@name='fromPoint'])";

	private String colorPath = "(//input[@name='color'])";

	private String textBox_colorPath = "(//div[@class='hex-text']/div/input)";

	private String ChoicesPath = "(//div[@class='w-100 float-left py-1 ng-untouched ng-pristine ng-valid']/div/input[@type='text'])[1]";

	// view Competency

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-eye mr-2']")
	private WebElement getBtn_view;

	@FindBy(how = How.XPATH, using = "//input[@name='programName']")
	private WebElement getTxtBx_viewprogramName;

	@FindBy(how = How.XPATH, using = "(//select[@name='employeeLevel']/option)[1]")
	private WebElement dd_employeeLevel;

	@FindBy(how = How.XPATH, using = "(//select[@name='orgUnitTypeName']/option)[4]")
	private WebElement dd_orgDefination;

	@FindBy(how = How.XPATH, using = "(//select[@name='invitationInitiatorParam']/option)[1]")
	private WebElement dd_invitationCanBeSent;

	// view Questionnaire

	String questions = "(//span[@class='p-h-l-xmd mb-2']/p)";

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Show Preview')]")
	private WebElement showPreview_Btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Close View')]")
	private WebElement closeView_Btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Start From Scratch')]")
	private WebElement clickStartFromScratch_Btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Upload Questionnaire')]")
	private WebElement clickUploadQuestionnaire;

	@FindBy(how = How.XPATH, using = "//input[@name='browseFile' and @class='fileInput']")
	private WebElement clickBrowseButton;

	@FindBy(how = How.ID, using = "questionnaireName")
	private WebElement getTxtBx_QuestionnaireName;

	String templateNamePath = "//input[@name='questionnaireName']";

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary float-right' and contains(text(),'Upload')]")
	private WebElement templateUpload_Btn;

	@FindBy(how = How.XPATH, using = "//input[@name='qrName' and @placeholder='Template name']")
	private WebElement getTxtBx_templateName;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save')]")
	private WebElement getBtn_save;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary b-r float-right ml-3' and contains(text(),'Publish')]")
	private WebElement getBtn_publish;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-secondary ng-star-inserted' and contains(text(),'Edit')]")
	private WebElement getBtn_editTemplateName;

	@FindBy(how = How.XPATH, using = "//span[@class='text-13x text-primary medium cursor ng-star-inserted' and contains(text(),'Show answers')]")
	private WebElement getBtn_showAnswers;

	@FindBy(how = How.XPATH, using = "//span[@class='text-13x text-primary medium cursor ng-star-inserted' and contains(text(),'Hide answers')]")
	private WebElement getBtn_hideAnswers;

	@FindBy(how = How.XPATH, using = "//p[@class='medium mb-0 ng-star-inserted' and contains(text(),'Total weightage = 100.00')]")
	private WebElement getTotalWeightage;

	private String totalWeightage = "//p[@class='medium mb-0 ng-star-inserted' and contains(text(),'Total weightage = 100.00')]";

	@FindBy(how = How.XPATH, using = "//div[@class='toast-message ng-star-inserted']//span")
	private WebElement invalidQuestionnaireTemplate;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Download Questionnaire Template')]")
	private WebElement getBtn_downloadQuestionnaireTemplate;

	@FindBy(how = How.XPATH, using = "(//div[contains(@class,'qus-actions')]//i[contains(@class,'fa fa-edit text-primary mr-2')])[1]")
	private WebElement getBtn_questionnaireEditButton;

	@FindBy(how = How.XPATH, using = "//select/option[@value='MULTIPLE_CHOICE_QUESTIONS']")
	private WebElement questionTypeDropdown;

	private String questionOptionChoice1 = "(//input[@formcontrolname='option'])[1]";
	private String questionOptionChoice2 = "(//input[@formcontrolname='option'])[2]";
	private String questionOptionChoice3 = "(//input[@formcontrolname='option'])[3]";
	private String questionOptionChoice4 = "(//input[@formcontrolname='option'])[4]";
	private String questionOptionChoice5 = "(//input[@formcontrolname='option'])[5]";
	private String questionOptionChoice6 = "(//input[@formcontrolname='option'])[6]";

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary float-right' and contains(text(),'Save')]")
	private WebElement getBtn_saveManuallyQuestion;

	@FindBy(how = How.XPATH, using = "//div[@class='relative hide-optns white-bg padn-top']")
	private WebElement getQuestionHeading;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Questions')]")
	private WebElement addQuestions_btn;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary float-right mr-3 mt-3 form-group ng-star-inserted' and contains(text(),' Save')]")
	private WebElement getBtn_saveCompetencyProgram;

	@FindBy(how = How.XPATH, using = "//h6[@class='mb-lg-0']/i[@class='fa fa-ellipsis-h']")
	private WebElement getBtn_actionButton;

	@FindBy(how = How.XPATH, using = "//li[@class='ng-star-inserted']/i[@class='fa fa-play mr-2']")
	private WebElement getBtn_startProgram;
	@FindBy(how = How.XPATH, using = "(//label[@class='normal'])[1]")
	private WebElement getRadioBtn_everyone;

	@FindBy(how = How.XPATH, using = "(//label[@class='normal'])[3]")
	private WebElement getRadioBtn_everyonein;

	@FindBy(how = How.XPATH, using = "(//label[@class='normal'])[2]")
	private WebElement getRadioBtn_except;

	@FindBy(how = How.XPATH, using = "//textarea[contains(@placeholder,'Enter Employee Code')]")
	private WebElement getTextarea_empId;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),' Bulk Upload ')]")
	private WebElement getBtn_bulkUpload;

	@FindBy(how = How.XPATH, using = "//select[@name='chooseProcessUpload']")
	private WebElement getBtn_chooseProcessUploadButton;

	@FindBy(how = How.XPATH, using = "//a[@class='btn float-left ml-3']")
	private WebElement getLink_competencyFileLink;

	@FindBy(how = How.XPATH, using = "//input[@name='competencyBrowseFile']")
	private WebElement getBtn_browseFile;

	@FindBy(how = How.XPATH, using = "//textarea[@name='competencyBUComment']")
	private WebElement getTextarea_competencyCommment;

	@FindBy(how = How.XPATH, using = "//button[@name='competencyUpload']")
	private WebElement getBtn_uploadCompetencyFile;

	@FindBy(how = How.XPATH, using = "//textarea[@class='form-control w-100 float-left resize-text-area ng-pristine ng-valid ng-touched' and @placeholder='Enter Employee Code']")
	private WebElement getBtn_empCode;

	@FindBy(how = How.XPATH, using = "//li//i[@class='fa fa-check mr-2']")
	private WebElement getBtn_publishScorecard;

	@FindBy(how = How.XPATH, using = "//p[contains(@class,'text-primary float-right pl-3 m-0 cursor')]")
	private WebElement getLink_dontHaveEmployeeCode;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'c-p')]/i[contains(@class,'fa fa-caret-down tr-0 cursor')]")
	private WebElement getBtn_showSearchOption;

	@FindBy(how = How.XPATH, using = "//button[contains(@class,'btn btn-primary float-right ml-3')]")
	private WebElement getBtn_applyButtonInShowSearchOption;

	@FindBy(how = How.XPATH, using = "(//div[@class='media-body']//p[contains(text(),'has invited you to provide feedback for')])[1]//..//..//..//..//h5")
	private WebElement competencyRatingCard_Btn;

	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'Time to invite feedback providers for')])[1]")
	private WebElement inviteFeedbackProviders_btn;

	@FindBy(how = How.XPATH, using = "(//div[@class='custom-range-lable']//span[3])[1]")
	private WebElement ratingOptionForself;

	@FindBy(how = How.XPATH, using = "(//div[@class='custom-range-lable']//span[3])[2]")
	private WebElement ratingOptionForSubordinate;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement next_Btn;

	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Next')])[1]")
	private WebElement nextrating_btn;
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Overall Comments')]/following-sibling:: textarea")
	private WebElement overAllcomments_textBox;
	@FindBy(how = How.XPATH, using = "(//p[contains(text(),'Overall Comments')]/following-sibling:: textarea)[2]")
	private WebElement overAllcomments_textBox1;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit')]")
	private WebElement submit_btn;
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Submit')])[2]")
	private WebElement submit_btn1;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Send Invite')]")
	private WebElement sendInvite_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Send Invitation')]")
	private WebElement sendInvitation_btn;

	@FindBy(how = How.XPATH, using = "//span[@class='fas fa-check']")
	private WebElement accept_btn;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Stop')]")
	private WebElement stop_Btn;

	@FindBy(how = How.XPATH, using = "(//h5[contains(text(),'Competency Published')])[1]")
	private WebElement competencyPublishedCard_lnk;

	@FindBy(how = How.XPATH, using = "//i[@class='fas fa-search']")
	private WebElement search_icon;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search']")
	private WebElement search_textField;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Search')]")
	private WebElement search_btn;

	@FindBy(how = How.XPATH, using = "//div[@class='card-header active']")
	private WebElement activeHeader_label;

	@FindBy(how = How.XPATH, using = "//label[@for='allDirectReports']")
	private WebElement allDirectReports_chkBox;

	@FindBy(how = How.XPATH, using = "//label[@for='immediateSup']")
	private WebElement immediateSupervisor_chkBox;

	@FindBy(how = How.XPATH, using = "//label[@for='allPeers']")
	private WebElement allPeers_chkBox;

	@FindBy(how = How.XPATH, using = "//label[@for='supPeers']")
	private WebElement supervisorPeers_chkBox;

	@FindBy(how = How.XPATH, using = "//label[@for='peersSub']")
	private WebElement peersSubordinate_chkBox;

	@FindBy(how = How.XPATH, using = "//label[@for='mySupPeersSub']")
	private WebElement mySupPeersSub_chkBox;

	@FindBy(how = How.XPATH, using = "//label[@for='sendAutomatic']")
	private WebElement sendInvitationsAutomatically_chkBox;

	@FindBy(how = How.XPATH, using = "(//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 float-left mt-1']//h6)[1]")
	private WebElement invitationConfiguration_lbl;

	@FindBy(how = How.XPATH, using = "(//*[local-name()='tspan'])[1]")
	private WebElement eligibleResponses_lbl;

	@FindBy(how = How.XPATH, using = "(//div[@class='col-lg-7 col-md-12 col-sm-12 col-xs-12 float-left form-group']//h6)[1]")
	private WebElement repsonseWeightage_Lbl;

	@FindBy(how = How.XPATH, using = "//div[@class='col-lg-7 col-md-12 col-sm-12 col-xs-12 float-left form-group']//h6")
	private List<WebElement> columns;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'How do you want to get Started?')]")
	private WebElement howDoyouWantToGetStarted_lbl;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Select Existing Template')]")
	private WebElement selectExistingTemplate_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(@class,'btn btn-primary')]")
	private List<WebElement> button_list;

	@FindBy(how = How.XPATH, using = "//select[@name='scoreCommentChart']")
	private WebElement scoreCommentChart_dropDown;

	@FindBy(how = How.XPATH, using = "//div[@class='col-lg-3 col-md-3 col-sm-4 col-xs-6 float-left p-2']//select")
	private WebElement yearDropdown;

	@FindBy(how = How.XPATH, using = "//div[@class='w-100 float-left p-4 grid-details']//p")
	private WebElement noResult_lbl;

	@FindBy(how = How.XPATH, using = "//div[@class='light-bg w-100 float-left p-2 grid-details']//h6")
	private List<WebElement> gridDetails;

	@FindBy(how = How.CLASS_NAME, using = "pagination")
	private WebElement pagination;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Program name :')]/following-sibling::span")
	private WebElement programNameBulkUpload_lbl;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Back')]")
	private WebElement back_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Refresh')]")
	private WebElement refresh_btn;

	@FindBy(how = How.XPATH, using = "(//div[@class='col-lg-1 col-md-1 col-sm-1 col-xs-1 float-left']//h6)[4]")
	private WebElement status_lbl;

	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-tabs nav-justified']//li//a")
	private List<WebElement> feedBackInviteTablist;

	@FindBy(how = How.XPATH, using = "//div[@class='card-body d-flex align-items-center p-3']//a")
	private List<WebElement> gradeList;

	@FindBy(how = How.XPATH, using = "(//div[@class='card-body']//p)[1]")
	private WebElement noEmployeeFound_lbl;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'media-left profile-pic')]")
	private List<WebElement> employeeList;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Show more')]")
	private WebElement showMore_btn;

	@FindBy(how = How.XPATH, using = "//div[@class='card-header']//h5[contains(text(),'Invites summary')]//..//..//p")
	private List<WebElement> inviteSummaryColumnName;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Select Template')]/following-sibling::select")
	private WebElement selectTemplateDropdown;

	@FindBy(how = How.ID, using = "float-input")
	private WebElement giveFeedback_text;

	@FindBy(how = How.XPATH, using = "(//ul[@role='tablist']//a)[3]")
	private WebElement outsideWorkCircle_tab;

	@FindBy(how = How.XPATH, using = "(//ul[@role='tablist']//a)[2]")
	private WebElement myWorkCircle_tab;

	@FindBy(how = How.XPATH, using = "//small[@class='ml-2 align-self-end']//span[contains(text(),'min')]")
	private List<WebElement> minValues;

	@FindBy(how = How.XPATH, using = "//small[@class='ml-2 align-self-end']//span[contains(text(),'max')]")
	private List<WebElement> maxValues;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),' View Details ')]")
	private WebElement viewDetails_btn;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Suggested')]")
	private List<WebElement> suggestedlbl_viewDetails;

	@FindBy(how = How.XPATH, using = "//button[@class='close']")
	private WebElement close_btn;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Finance')]")
	private WebElement finance_lbl;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Engineering')]")
	private WebElement engineering_lbl;

	@FindBy(how = How.ID, using = "name")
	private WebElement name_txt;

	@FindBy(how = How.ID, using = "email")
	private WebElement email_txt;

	@FindBy(how = How.ID, using = "perspective")
	private WebElement type_Dropdown;

	@FindBy(how = How.XPATH, using = "//button[text()='Invite']")
	private WebElement invite_btn;

	@FindBy(how = How.XPATH, using = "//div[@class='card-body py-3 d-flex align-items-center']//div")
	private WebElement searchIcon_outsideWorkCircle;

	@FindBy(how = How.XPATH, using = "//span[@class='fas fa-times mr-3']")
	private WebElement decline_btn;

	@FindBy(how = How.XPATH, using = "//textarea[@name='rejectComments']")
	private WebElement rejectComments_text;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Send Back')]")
	private WebElement sendBack_btn;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Delete')]")
	private WebElement delete_btn;


	public void clickOnCompetencyProgramMenuLink() {
		try {
			log.info("Entered clickOnCompetencyProgramMenuLink");
			log.info("Clicking lnk_defineCompetencyProg");
			click(lnk_defineCompetencyProg);
			log.info("Executed clickOnCompetencyProgramMenuLink Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnCompetencyProgramMenuLink Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getCreateProgram() {
		try {
			log.info("Entered getCreateProgram");
			log.info("Clicking createProgram_btn");
			click(createProgram_btn);
			log.info("Executed getCreateProgram Successfully");
		} catch (Exception e) {
			log.error("Executed getCreateProgram Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateForCompetencyProgramManagement() {
		try {
			log.info("Entered validateForCompetencyProgramManagement");
			Assert.assertEquals(lbl_competencyProgramManagement.getText(), "Competency Program Management",
					"Label is not matching hence >>>> Failed");
			log.info("Executed validateForCompetencyProgramManagement Successfully");
		} catch (Exception e) {
			log.error("Executed validateForCompetencyProgramManagement Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateForCreateCompetencyProgram() {
		try {
			log.info("Entered validateForCreateCompetencyProgram");
			Assert.assertEquals(lbl_createCompetencyProgram.getText(), "Create Competency Program",
					"Label is not matching hence >>>> Failed");
			log.info("Executed validateForCreateCompetencyProgram Successfully");
		} catch (Exception e) {
			log.error("Executed validateForCreateCompetencyProgram Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateForEditCompetencyProgram() {
		try {
			log.info("Entered validateForEditCompetencyProgram");
			Assert.assertEquals(lbl_editCompetencyProgram.getText(), "Edit Competency Program",
					"Label is not matching hence >>>> Failed");
			log.info("Executed validateForEditCompetencyProgram Successfully");
		} catch (Exception e) {
			log.error("Executed validateForEditCompetencyProgram Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateForCompetencyDetails() {
		try {
			log.info("Entered validateForCompetencyDetails");
			Assert.assertEquals(lbl_competencyDetails.getText(), "Competency Details",
					"Competency details lebel is not matching hence >>> Failed");
			log.info("Executed validateForCompetencyDetails Successfully");
		} catch (Exception e) {
			log.error("Executed validateForCompetencyDetails Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void programName(String progName) {
		try {
			log.info("Entered programName");
			log.info("Writing to programName_txt: " + progName + BasePage.getTimestamp());
			writeText(programName_txt, progName + BasePage.getTimestamp());

			log.info("Executed programName Successfully");
		} catch (Exception e) {
			log.error("Executed programName Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void setStartDate() {
		try {
			log.info("Entered setStartDate");
			System.out.println("Entering Year :" + this.Year);
			System.out.println("Entering Month :" + this.Month);
			System.out.println("Entering Date :" + this.Date);
			waitFor(3000);
			setDateInDatePicker(dp_startDateBtn, DateUtil.getCurrentYear(), DateUtil.getCurrentMonthName(),
					DateUtil.getCurrentDay());
			log.info("Executed setStartDate Successfully");
		} catch (Exception e) {
			log.error("Executed setStartDate Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void SetEndDate() {
		try {
			log.info("Entered SetEndDate");
			waitFor(1000);
			System.out.println("End Year : " + DateUtil.getCurrentYear());
			log.info("Waiting for dp_endDateBtn");
			waitUntilElementToBeClickable(dp_endDateBtn);
			setDateInDatePicker(dp_endDateBtn, DateUtil.getCurrentYear() + 1, DateUtil.addDaysAndGetMonth(40),
					DateUtil.getCurrentDay());
			log.info("Executed SetEndDate Successfully");
		} catch (Exception e) {
			log.error("Executed SetEndDate Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void employeeLevel(String empLvl) {
		try {
			log.info("Entered employeeLevel" + empLvl);
			setValueInDropdownText(employeeLevel_drpdwn, empLvl);
			log.info("Executed employeeLevel Successfully" + empLvl);
		} catch (Exception e) {
			log.error("Executed employeeLevel Not Successfully" + empLvl);
			e.printStackTrace();
			throw e;
		}
	}

	public void employeeLevelByValue(String empLvl) {
		try {
			log.info("Entered employeeLevel" + empLvl);
			setValueInDropdownByValue(employeeLevel_drpdwn, empLvl);
			log.info("Executed employeeLevel Successfully" + empLvl);
		} catch (Exception e) {
			log.error("Executed employeeLevel Not Successfully" + empLvl);
			e.printStackTrace();
			throw e;
		}
	}

	public void organizationDefination(String orgDef) {
		try {
			log.info("Entered organizationDefination");
			setValueInDropdownText(orgDefination_drpdwn, orgDef);
			log.info("Executed organizationDefination Successfully");
		} catch (Exception e) {
			log.error("Executed organizationDefination Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void organizationDefinationByValue(String orgDef) {
		try {
			log.info("Entered organizationDefination");
			setValueInDropdownByValue(orgDefination_drpdwn, orgDef);
			log.info("Executed organizationDefination Successfully");
		} catch (Exception e) {
			log.error("Executed organizationDefination Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void invitationCanBeSentBy(String invitation) {
		try {
			log.info("Entered invitationCanBeSentBy");
			setValueInDropdownText(invitationInitiatorParam_drpdwn, invitation);
			log.info("Executed invitationCanBeSentBy Successfully");
		} catch (Exception e) {
			log.error("Executed invitationCanBeSentBy Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getMinimumInvitationConfiguration(String mintotalinvitation, String minseniorInvitations,
			String minpeerinvitation, String minjuniorInvitation, String minExternalInvitation) {
		try {
			log.info("Entered getMinimumInvitationConfiguration");
			log.info("Writing to txt_minimumTotalInvitations: " + mintotalinvitation);
			writeText(txt_minimumTotalInvitations, mintotalinvitation);
			log.info("Writing to txt_minimumSrInvitations: " + minseniorInvitations);
			writeText(txt_minimumSrInvitations, minseniorInvitations);
			log.info("Writing to txt_minimumPrInvitations: " + minpeerinvitation);
			writeText(txt_minimumPrInvitations, minpeerinvitation);
			log.info("Writing to txt_minimumJrInvitations: " + minjuniorInvitation);
			writeText(txt_minimumJrInvitations, minjuniorInvitation);
			log.info("Writing to txt_minimumExtInvitations: " + minExternalInvitation);
			writeText(txt_minimumExtInvitations, minExternalInvitation);
			log.info("Executed getMinimumInvitationConfiguration Successfully");
		} catch (Exception e) {
			log.error("Executed getMinimumInvitationConfiguration Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterTotalMinimumInvitations(String mintotalinvitation) {
		try {
			log.info("entering minimum total invitations!!");
			writeText(txt_minimumTotalInvitations, mintotalinvitation);
			log.info("entered minimum total invitations!!");
		} catch (Exception e) {
			log.error("error entering minimum total invitations!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void clearTotalMinimumInvitations() {
		try {
			log.info("clearing minimum total invitations!!");
			clear(txt_minimumTotalInvitations);
			log.info("cleared minimum total invitations!!");
		} catch (Exception e) {
			log.error("error entering minimum total invitations!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void enterTotalMaximumInvitations(String maxtotalinvitation) {
		try {
			log.info("entering maximum total invitations!!");
			writeText(txt_maximumTotalInvitations, maxtotalinvitation);
			log.info("entered maximum total invitations!!");
		} catch (Exception e) {
			log.error("error entering maximum total invitations!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void enterMinimumSeniorInvitations(String minimumSrInvitations) {
		try {
			log.info("entering minimum senior invitations!!");
			writeText(txt_minimumSrInvitations, minimumSrInvitations);
			log.info("entered minimum senior invitations!!");
		} catch (Exception e) {
			log.error("error entering minimum senior invitations!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void enterMaximumSeniorInvitations(String maximumSrInvitations) {
		try {
			log.info("entering  maximum senior invitations!!");
			writeText(txt_maximumSrInvitations, maximumSrInvitations);
			log.info("entered maximum senior invitations!!");
		} catch (Exception e) {
			log.error("error entering maximum senior invitations!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void enterMinimumPeerInvitations(String minimumPrInvitations) {
		try {
			log.info("entering minimum total invitations!!");
			writeText(txt_minimumPrInvitations, minimumPrInvitations);
			log.info("entered minimum peer invitations!!");
		} catch (Exception e) {
			log.error("error entering minimum peer invitations!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void enterMaximumPeerInvitations(String maximumPrInvitations) {
		try {
			log.info("entering maximum peer invitations!!");
			writeText(txt_maximumPrInvitations, maximumPrInvitations);
			log.info("entered maximum peer invitations!!");
		} catch (Exception e) {
			log.error("error entering maximum peer invitations!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void enterMinimumJuniorInvitations(String minjrinvitation) {
		try {
			log.info("entering minimum junior invitations!!");
			writeText(txt_minimumJrInvitations, minjrinvitation);
			log.info("entered minimum junior invitations!!");
		} catch (Exception e) {
			log.error("error entering minimum junior invitations!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void enterMaximumJuniorInvitations(String maxjrinvitation) {
		try {
			log.info("entering maximum junior invitations!!");
			writeText(txt_maximumJrInvitations, maxjrinvitation);
			log.info("entered maximum junior invitations!!");
		} catch (Exception e) {
			log.error("error entering maximum junior invitations!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void enterMinimumExternalInvitations(String minextinvitation) {
		try {
			log.info("entering minimum external invitations!!");
			writeText(txt_minimumExtInvitations, minextinvitation);
			log.info("entered minimum external invitations!!");
		} catch (Exception e) {
			log.error("error entering minimum external invitations!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void enterMaximumExternalInvitations(String maxextinvitation) {
		try {
			log.info("entering maximum external invitations!!");
			writeText(txt_maximumExtInvitations, maxextinvitation);
			log.info("entered maximum external invitations!!");
		} catch (Exception e) {
			log.error("error entering maximum external invitations!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void getMaximumInvitationConfiguration(String maxtotalinvitation, String maxseniorInvitations,
			String maxpeerinvitation, String maxjuniorInvitation, String maxExternalInvitation) {
		try {
			log.info("Entered getMaximumInvitationConfiguration");
			log.info("Writing to txt_maximumTotalInvitations: " + maxtotalinvitation);
			writeText(txt_maximumTotalInvitations, maxtotalinvitation);
			log.info("Writing to txt_maximumSrInvitations: " + maxseniorInvitations);
			writeText(txt_maximumSrInvitations, maxseniorInvitations);
			log.info("Writing to txt_maximumPrInvitations: " + maxpeerinvitation);
			writeText(txt_maximumPrInvitations, maxpeerinvitation);
			log.info("Writing to txt_maximumJrInvitations: " + maxjuniorInvitation);
			writeText(txt_maximumJrInvitations, maxjuniorInvitation);
			log.info("Writing to txt_maximumExtInvitations: " + maxExternalInvitation);
			writeText(txt_maximumExtInvitations, maxExternalInvitation);
			log.info("Executed getMaximumInvitationConfiguration Successfully");
		} catch (Exception e) {
			log.error("Executed getMaximumInvitationConfiguration Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getEditMinimumInvitationConfiguration(String mintotalinvitation) {
		try {
			log.info("Entered getEditMinimumInvitationConfiguration");
			log.info("Writing to txt_minimumTotalInvitations: " + mintotalinvitation);
			writeText(txt_minimumTotalInvitations, mintotalinvitation);
			txt_minimumSrInvitations.clear();
			txt_minimumPrInvitations.clear();
			txt_minimumJrInvitations.clear();
			txt_minimumExtInvitations.clear();
			log.info("Executed getEditMinimumInvitationConfiguration Successfully");
		} catch (Exception e) {
			log.error("Executed getEditMinimumInvitationConfiguration Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getEditMaximumInvitationConfiguration() {
		try {
			log.info("Entered getEditMaximumInvitationConfiguration");
			txt_maximumTotalInvitations.clear();
			txt_maximumSrInvitations.clear();
			txt_maximumPrInvitations.clear();
			txt_maximumJrInvitations.clear();
			txt_maximumExtInvitations.clear();
			log.info("Executed getEditMaximumInvitationConfiguration Successfully");
		} catch (Exception e) {
			log.error("Executed getEditMaximumInvitationConfiguration Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getEditMaximumInvitationConfiguration(String maxInvites) {
		try {
			log.info("Entered getEditMaximumInvitationConfiguration");
			writeText(txt_maximumTotalInvitations, maxInvites);
			txt_maximumSrInvitations.clear();
			txt_maximumPrInvitations.clear();
			txt_maximumJrInvitations.clear();
			txt_maximumExtInvitations.clear();
			log.info("Executed getEditMaximumInvitationConfiguration Successfully");
		} catch (Exception e) {
			log.error("Executed getEditMaximumInvitationConfiguration Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getResponseWeightageConfiguration() {
		try {
			log.info("Entered getResponseWeightageConfiguration");
			if (!rd_IsSelfRatingMandatoryForScore.isSelected()
					|| !rd_IsImmediateSupervisorRatingMandatoryForScore.isSelected()) {
				log.info("Clicking rd_IsSelfRatingMandatoryForScore");
				click(rd_IsSelfRatingMandatoryForScore);
			}
			log.info("Clicking rd_IsImmediateSupervisorRatingMandatoryForScore");
			click(rd_IsImmediateSupervisorRatingMandatoryForScore);
			log.info("Executed getResponseWeightageConfiguration Successfully");
		} catch (Exception e) {
			log.error("Executed getResponseWeightageConfiguration Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getEditResponseWeightageConfiguration() {
		try {
			log.info("Entered getEditResponseWeightageConfiguration");
			if (rd_IsSelfRatingMandatoryForScore.isSelected()
					|| rd_IsImmediateSupervisorRatingMandatoryForScore.isSelected())
				waitFor(500);
			log.info("Clicking rd_IsSelfRatingMandatoryForScore");
			click(rd_IsSelfRatingMandatoryForScore);
			log.info("Clicking rd_IsImmediateSupervisorRatingMandatoryForScore");
			click(rd_IsImmediateSupervisorRatingMandatoryForScore);
			log.info("Executed getEditResponseWeightageConfiguration Successfully");
		} catch (Exception e) {
			log.error("Executed getEditResponseWeightageConfiguration Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnSaveAndContinue() {
		try {
			log.info("Entered clickOnSaveAndContinue");
			log.info("Clicking saveAndContinue_btn");
			click(saveAndContinue_btn);
			log.info("Executed clickOnSaveAndContinue Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnSaveAndContinue Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnAddMore() {
		try {
			log.info("Entered clickOnAddMore");
			log.info("Clicking addMore_Btn");
			click(addMore_Btn);
			log.info("Executed clickOnAddMore Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnAddMore Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void setScaleData(Integer count, String title, String descp, String score, String color) {
		try {
			log.info("Entered setScaleData");
			WebElement textbox_title = webDriver.findElement(By.xpath(titlePath + "[" + (count + 1) + "]"));
			log.info("Writing to textbox_title: " + title);
			writeText(textbox_title, title);
			WebElement textbox_description = webDriver.findElement(By.xpath(descriptionPath + "[" + (count + 1) + "]"));
			log.info("Writing to textbox_description: " + descp);
			writeText(textbox_description, descp);
			WebElement textbox_Score = webDriver.findElement(By.xpath(scorepath + "[" + (count + 1) + "]"));
			log.info("Writing to textbox_Score: " + score);
			writeText(textbox_Score, score);
			((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,100);", "");
			WebElement btn_color = webDriver.findElement(By.xpath(colorPath + "[" + (count + 1) + "]"));
			log.info("Clicking btn_color");
			btn_color.click();
			WebElement textbox_color = webDriver.findElement(By.xpath(textBox_colorPath + "[" + (count + 1) + "]"));
			log.info("Writing to textbox_color: " + color);
			writeText(textbox_color, color);
			log.info("Executed setScaleData Successfully");
		} catch (Exception e) {
			log.error("Executed setScaleData Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterDuplicateScales() {
		try {
			WebElement btn_color = webDriver.findElement(By.xpath(colorPath + "[1]"));
			log.info("Clicking btn_color");
			btn_color.click();
			WebElement textbox_color = webDriver.findElement(By.xpath(textBox_colorPath + "[1]"));
			log.info("Writing to textbox_color: " + "#eacc62");
			writeText(textbox_color, "#eacc62");
			// WebElement textbox_title = webDriver.findElement(By.xpath(titlePath +
			// "[2]"));
			// log.info("Writing to textbox_title:");
			// writeText(textbox_title,"duplicate");
			// WebElement btn_color2 = webDriver.findElement(By.xpath(colorPath + "[2]"));
			// log.info("Clicking btn_color");
			// btn_color.click();
			// WebElement textbox_color2 = webDriver.findElement(By.xpath(textBox_colorPath
			// + "[2]"));
			// log.info("Writing to textbox_color: " + "#eacc62");
			// writeText(textbox_color, "#eacc62");
		} catch (Exception e) {

			e.printStackTrace();
			Assert.fail();

		}
	}

	public void enterScale(String i) {
		try {
			WebElement btn_color = webDriver.findElement(By.xpath(colorPath + "[" + i + "]"));
			log.info("Clicking btn_color");
			btn_color.click();
			WebElement textbox_color = webDriver.findElement(By.xpath(textBox_colorPath + "[" + i + "]"));
			log.info("Writing to textbox_color: " + "#392a36");
			writeText(textbox_color, "#392a36");
			// WebElement textbox_title = webDriver.findElement(By.xpath(titlePath +
			// "[2]"));
			// log.info("Writing to textbox_title:");
			// writeText(textbox_title,"duplicate");
			// WebElement btn_color2 = webDriver.findElement(By.xpath(colorPath + "[2]"));
			// log.info("Clicking btn_color");
			// btn_color.click();
			// WebElement textbox_color2 = webDriver.findElement(By.xpath(textBox_colorPath
			// + "[2]"));
			// log.info("Writing to textbox_color: " + "#eacc62");
			// writeText(textbox_color, "#eacc62");
		} catch (Exception e) {

			e.printStackTrace();
			Assert.fail();

		}
	}

	public void enterDuplicateScores() {
		try {
			log.info("entering duplicate scores!!");
			WebElement ele1 = webDriver.findElement(By.xpath("(//input[@name='fromPoint'])[2]"));
			writeText(ele1, "1");
			log.info("entered duplicate scores!!");
		} catch (Exception e) {
			log.info("error entering duplicate scores!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void deleteLastScale() {
		try {
			log.info("Entered deleteLastScale");
			log.info("Clicking deleteLastScale_Btn");
			click(deleteLastScale_Btn);
			log.info("Executed deleteLastScale Successfully");
		} catch (Exception e) {
			log.error("Executed deleteLastScale Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateEligibleResponse() {
		try {
			log.info("Entered validateEligibleResponse");
			Assert.assertEquals(lbl_eligibleResponse.getText(), "Eligible Response",
					"Eligible Response label is matching hence >>> Failed");
			log.info("Executed validateEligibleResponse Successfully");
		} catch (Exception e) {
			log.error("Executed validateEligibleResponse Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateForMandatoryInvitationTobeSent() {
		try {
			log.info("Entered validateForMandatoryInvitationTobeSent");
			Assert.assertEquals(lbl_mandatoryInvitation.getText(), "Mandatory Invitation to be sent",
					"Mandatory Invitation to be sent  label is matching hence >>> Failed");
			log.info("Executed validateForMandatoryInvitationTobeSent Successfully");
		} catch (Exception e) {
			log.error("Executed validateForMandatoryInvitationTobeSent Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateForScale() {
		try {
			log.info("Entered validateForScale");
			Assert.assertEquals(lbl_scale.getText(), "Scale", "Scale  label is matching hence >>> Failed");
			log.info("Executed validateForScale Successfully");
		} catch (Exception e) {
			log.error("Executed validateForScale Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateForQuestionnaire() {
		try {
			log.info("Entered validateForQuestionnaire");
			Assert.assertEquals(lbl_questionnarie.getText(), "Questionnaire",
					"Questionnaire label is matching hence >>> Failed");
			System.out.println("Passed");
			log.info("Executed validateForQuestionnaire Successfully");
		} catch (Exception e) {
			log.error("Executed validateForQuestionnaire Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void startFromScratch() {
		try {
			log.info("Entered startFromScratch");
			waitFor(500);
			log.info("Clicking startFromScratch_Btn");
			click(startFromScratch_Btn);
			scrollUp();
			waitFor(500);
			log.info("Executed startFromScratch Successfully");
		} catch (Exception e) {
			log.error("Executed startFromScratch Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void addQuestion() {
		try {
			log.info("Entered addQuestion");
			waitFor(500);
			log.info("Clicking addQuestion_Btn");
			clickOnElementByJs(addQuestion_Btn);
			log.info("Executed addQuestion Successfully");
		} catch (Exception e) {
			log.error("Executed addQuestion Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void questionDetails(String questionHeading, String weightage, String questionType, String opt1, String opt2,
			String opt3, String opt4, String opt5, String opt6) {
		try {
			log.info("Entered questionDetails");
			log.info("Writing to question_txt: " + "Hey there!! This is new template");
			writeText(question_txt, "Hey there!! This is new template");
			log.info("Writing to weightage_txt: " + "20");
			writeText(weightage_txt, "20");
			setValueInDropdownText(questionType_Dwn, questionType);
			WebElement option1 = webDriver.findElement(By.xpath(ChoicesPath));
			log.info("Writing to option1: " + opt1);
			writeText(option1, opt1);
			WebElement option2 = webDriver.findElement(By.xpath(ChoicesPath));
			log.info("Writing to option2: " + opt2);
			writeText(option2, opt2);
			WebElement option3 = webDriver.findElement(By.xpath(ChoicesPath));
			log.info("Writing to option3: " + opt3);
			writeText(option3, opt3);
			WebElement option4 = webDriver.findElement(By.xpath(ChoicesPath));
			log.info("Writing to option4: " + opt4);
			writeText(option4, opt4);
			WebElement option5 = webDriver.findElement(By.xpath(ChoicesPath));
			log.info("Writing to option5: " + opt5);
			writeText(option5, opt5);
			WebElement option6 = webDriver.findElement(By.xpath(ChoicesPath));
			log.info("Writing to option6: " + opt6);
			writeText(option6, opt6);
			log.info("Clicking save_Btn");
			click(save_Btn);
			log.info("Executed questionDetails Successfully");
		} catch (Exception e) {
			log.error("Executed questionDetails Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void editQuestionDetails(String questionHeading, String weightage, String questionType, String opt1,
			String opt2, String opt3, String opt4, String opt5) {
		try {
			log.info("Entered editQuestionDetails");
			log.info("Writing to question_txt: " + questionHeading);
			writeText(question_txt, questionHeading);
			log.info("Writing to weightage_txt: " + weightage);
			writeText(weightage_txt, weightage);
			setValueInDropdownText(questionType_Dwn, questionType);
			WebElement option1 = webDriver.findElement(By.xpath(ChoicesPath));
			log.info("Writing to option1: " + opt1);
			writeText(option1, opt1);
			WebElement option2 = webDriver.findElement(By.xpath(ChoicesPath));
			log.info("Writing to option2: " + opt2);
			writeText(option2, opt2);
			WebElement option3 = webDriver.findElement(By.xpath(ChoicesPath));
			log.info("Writing to option3: " + opt3);
			writeText(option3, opt3);
			WebElement option4 = webDriver.findElement(By.xpath(ChoicesPath));
			log.info("Writing to option4: " + opt4);
			writeText(option4, opt4);
			WebElement option5 = webDriver.findElement(By.xpath(ChoicesPath));
			log.info("Writing to option5: " + opt5);
			writeText(option5, opt5);
			waitFor(3000);
			// waitUntilElementToBeClickable(save_Btn);
			log.info("Clicking save_Btn");
			click(save_Btn);
			log.info("Executed editQuestionDetails Successfully");
		} catch (Exception e) {
			log.error("Executed editQuestionDetails Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void isMandatory() {
		try {
			log.info("Entered isMandatory");
			log.info("Clicking isMadatory_chk");
			click(isMadatory_chk);
			log.info("Executed isMandatory Successfully");
		} catch (Exception e) {
			log.error("Executed isMandatory Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getTemplateName(String templateName) {
		try {
			log.info("Entered getTemplateName");
			log.info("Writing to templateName_Txt: " + templateName);
			writeText(templateName_Txt, templateName);
			log.info("Executed getTemplateName Successfully");
		} catch (Exception e) {
			log.error("Executed getTemplateName Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void publishQuestionnarie() {
		try {
			log.info("Entered publishQuestionnarie");
			log.info("Clicking publish_Btn");
			click(publish_Btn);
			log.info("Executed publishQuestionnarie Successfully");
		} catch (Exception e) {
			log.error("Executed publishQuestionnarie Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void saveCompetencyProgram() {
		try {
			log.info("Entered saveCompetencyProgram");
			waitFor(1500);
			BasePage.scroll(webDriver, "down");
			log.info("Clicking save_Btn");
			click(save_Btn);
			log.info("Executed saveCompetencyProgram Successfully");
		} catch (Exception e) {
			log.error("Executed saveCompetencyProgram Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnEllipsis() {
		try {
			log.info("Entered clickOnEllipsis");
			log.info("Clicking lnk_ellipsis");
			click(lnk_ellipsis);
			log.info("Executed clickOnEllipsis Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnEllipsis Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnStart() {
		try {
			log.info("Entered clickOnStart");
			log.info("Clicking lnk_start");
			click(lnk_start);
			log.info("Executed clickOnStart Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnStart Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void ChooseWhichEmployeesYouWantToStartProgram() {
		try {
			log.info("Entered ChooseWhichEmployeesYouWantToStartProgram");
			// click(includeEveryone_radio);
			log.info("Clicking getRadioBtn_everyonein");
			click(getRadioBtn_everyonein);
			log.info("Clicking getRadioBtn_everyone");
			click(getRadioBtn_everyone);
			log.info("Executed ChooseWhichEmployeesYouWantToStartProgram Successfully");
		} catch (Exception e) {
			log.error("Executed ChooseWhichEmployeesYouWantToStartProgram Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnValidateStartProgram() {
		try {
			log.info("Entered clickOnValidateStartProgram");
			log.info("Clicking ValidateStartProgram_btn");
			click(ValidateStartProgram_btn);
			log.info("Executed clickOnValidateStartProgram Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnValidateStartProgram Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnStartProgram() {
		try {
			log.info("Entered clickOnStartProgram");
			log.info("Clicking startProgram_btn");
			click(startProgram_btn);
			log.info("Clicking confirm_Btn");
			click(confirm_Btn);
			log.info("Executed clickOnStartProgram Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnStartProgram Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	// Edit Competency Program

	public void ClickOnEdit() {
		try {
			log.info("Entered ClickOnEdit");
			log.info("Clicking editCompetency_btn");
			click(editCompetency_btn);
			log.info("Executed ClickOnEdit Successfully");
		} catch (Exception e) {
			log.error("Executed ClickOnEdit Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnAdvancedSettings() {
		try {
			log.info("Entered clickOnAdvancedSettings");
			log.info("Clicking advancedSetting_Btn");
			click(advancedSetting_Btn);
			log.info("Executed clickOnAdvancedSettings Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnAdvancedSettings Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	// view Competency Program

	public void ClickOnView() {
		try {
			log.info("Entered ClickOnView");
			log.info("Clicking getBtn_view");
			click(getBtn_view);
			log.info("Executed ClickOnView Successfully");
		} catch (Exception e) {
			log.error("Executed ClickOnView Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateProgramNameText(String value) {
		try {
			log.info("Entered validateProgramNameText");
			Assert.assertTrue(programName_txt.getAttribute("value").contains(value),
					"Program Name is not as expected hence>>>Failed.  Expected: " + value + "Actual: "
							+ programName_txt.getAttribute("value"));
			log.info("Executed validateProgramNameText Successfully");
		} catch (Exception e) {
			log.error("Executed validateProgramNameText Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateEmployeeLevel(String value) {
		try {
			log.info("Entered validateEmployeeLevel");
			Assert.assertEquals(dd_employeeLevel.getText().trim(), value,
					"values are not matching from employee level drop down hence >>> Failed");
			log.info("Executed validateEmployeeLevel Successfully");
		} catch (Exception e) {
			log.error("Executed validateEmployeeLevel Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateOrganiizationDefination(String exp) {
		try {
			log.info("Entered validateOrganiizationDefination");
			Assert.assertEquals(dd_orgDefination.getText().trim(), exp,
					"organization definition value is not matching from drop down hence >>> Failed");
			log.info("Executed validateOrganiizationDefination Successfully");
		} catch (Exception e) {
			log.error("Executed validateOrganiizationDefination Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateinvitationCanBeSentBy(String invt) {
		try {
			log.info("Entered validateinvitationCanBeSentBy");
			Assert.assertEquals(dd_invitationCanBeSent.getText().trim(), invt,
					"DropDown value of invitation can be sent By is not matching hence >>> Failed");
			log.info("Executed validateinvitationCanBeSentBy Successfully");
		} catch (Exception e) {
			log.error("Executed validateinvitationCanBeSentBy Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnNext() {
		try {
			log.info("Entered clickOnNext");
			log.info("Clicking next_Btn");
			click(next_Btn);
			log.info("Executed clickOnNext Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnNext Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnNextRating() {
		try {
			log.info("Entered clickOnNext");
			log.info("Clicking nextrating_btn");

			ScrollUpToElement(nextrating_btn);
			click(nextrating_btn);
			// click(nextrating_btn);
			log.info("Executed clickOnNext Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnNext Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateInvitationConfiguration(String exp) {
		try {
			log.info("Entered validateInvitationConfiguration");
			Assert.assertEquals(txt_minimumTotalInvitations.getAttribute("value"), exp,
					"Values we entered in total Minimum invitation is not matching hence >>>> Failed");
			log.info("Executed validateInvitationConfiguration Successfully");
		} catch (Exception e) {
			log.error("Executed validateInvitationConfiguration Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateIsSelfratingMandatoryForScore() {
		try {
			log.info("Entered validateIsSelfratingMandatoryForScore");
			Assert.assertTrue(!rd_IsSelfRatingMandatoryForScore.isSelected(),
					"Self Rating mandatory is checked hence >>> Failed");
			log.info("Executed validateIsSelfratingMandatoryForScore Successfully");
		} catch (Exception e) {
			log.error("Executed validateIsSelfratingMandatoryForScore Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateIsImmediateSupervisorRatingMandatoryForScore() {
		try {
			log.info("Entered validateIsImmediateSupervisorRatingMandatoryForScore");
			scroll(webDriver, "down");
			Assert.assertTrue(!rd_IsImmediateSupervisorRatingMandatoryForScore.isSelected(),
					"is immediate Supervisor Rating Mandatory for score checkbox is checked hence >>> Failed");
			log.info("Executed validateIsImmediateSupervisorRatingMandatoryForScore Successfully");
		} catch (Exception e) {
			log.error("Executed validateIsImmediateSupervisorRatingMandatoryForScore Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void viewEnterScaleData(int count, String title, String description, String score) {
		try {
			log.info("Entered viewEnterScaleData");
			WebElement verifyTitle = webDriver.findElement(By.xpath(titlePath + "[" + count + "]"));
			Assert.assertEquals(verifyTitle.getAttribute("value"), title,
					"view title data is not matching hence >>> Failed");
			WebElement verifyDescription = webDriver.findElement(By.xpath(descriptionPath + "[" + count + "]"));
			Assert.assertEquals(verifyDescription.getAttribute("value"), description,
					"view description is not matching with entered value hence >>>> Failed");
			WebElement verifyScore = webDriver.findElement(By.xpath(scorepath + "[" + count + "]"));
			Assert.assertEquals(verifyScore.getAttribute("value"), score);
			log.info("Executed viewEnterScaleData Successfully");
		} catch (Exception e) {
			log.error("Executed viewEnterScaleData Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void viewQuestionnaire(int count, String questions) {
		try {
			log.info("Entered viewQuestionnaire");
			WebElement question = webDriver.findElement(By.xpath(questions + "[" + count + "]"));
			Assert.assertTrue(question.getText().contains(questions),
					" Questionaire: Expected: " + questions + " Actual: " + question.getText());
			log.info("Executed viewQuestionnaire Successfully");
		} catch (Exception e) {
			log.error("Executed viewQuestionnaire Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnShowPreview() {
		try {
			log.info("Entered clickOnShowPreview");
			scroll(webDriver, "down");
			log.info("Clicking showPreview_Btn");
			click(showPreview_Btn);
			log.info("Executed clickOnShowPreview Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnShowPreview Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnCloseView() {
		try {
			log.info("Entered clickOnCloseView");
			log.info("Clicking closeView_Btn");
			click(closeView_Btn);
			log.info("Executed clickOnCloseView Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnCloseView Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void verifyIsMandatory() {
		try {
			log.info("Entered verifyIsMandatory");
			Assert.assertTrue(isMadatory_chk.isSelected(), "Is Mandatory is not selected hence >>> Failed");
			log.info("Executed verifyIsMandatory Successfully");
		} catch (Exception e) {
			log.error("Executed verifyIsMandatory Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnStartFromScratchButton() {
		try {
			log.info("Entered clickOnStartFromScratchButton");
			log.info("Clicking clickStartFromScratch_Btn");
			click(clickStartFromScratch_Btn);
			log.info("Executed clickOnStartFromScratchButton Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnStartFromScratchButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateStartFromScratchButton() {
		try {
			log.info("Entered validateStartFromScratchButton");
			Assert.assertTrue(clickStartFromScratch_Btn.isDisplayed(),
					"Start from scrach button should present >>>> Failed");
			log.info("Executed validateStartFromScratchButton Successfully");
		} catch (Exception e) {
			log.error("Executed validateStartFromScratchButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void validateUploadQuestionnaireButton() {
		try {
			log.info("Entered validateUploadQuestionnaireButton");
			Assert.assertTrue(clickUploadQuestionnaire.isDisplayed(),
					"Upload Questionnaire button is not present >>>> Failed");
			log.info("Executed validateUploadQuestionnaireButton Successfully");
		} catch (Exception e) {
			log.error("Executed validateUploadQuestionnaireButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnUploadQuestionnaire() {
		try {
			log.info("Entered clickOnUploadQuestionnaire");
			log.info("Clicking clickUploadQuestionnaire");
			click(clickUploadQuestionnaire);
			log.info("Executed clickOnUploadQuestionnaire Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnUploadQuestionnaire Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void uploadQuestionnaireData(String questionnaireData) {
		try {
			log.info("Entered uploadQuestionnaireData");
			String questionnaireFile = new File(questionnaireData).getAbsolutePath();
			String questionnaireFile1 = questionnaireFile.replace("\\", "\\\\");
			System.out.println(questionnaireFile1);
			log.info("Writing to clickBrowseButton: " + questionnaireFile1);
			clickBrowseButton.sendKeys(questionnaireFile1);
			log.info("Writing to getTxtBx_QuestionnaireName: " + "new template name");
			writeText(getTxtBx_QuestionnaireName, "new template name");
			log.info("Executed uploadQuestionnaireData Successfully");
		} catch (Exception e) {
			log.error("Executed uploadQuestionnaireData Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void uploadTemplateButton() {
		try {
			log.info("Entered uploadTemplateButton");
			if (templateUpload_Btn.isDisplayed()) {
				log.info("Clicking templateUpload_Btn");
				click(templateUpload_Btn);
			}
			log.info("Executed uploadTemplateButton Successfully");
		} catch (Exception e) {
			log.error("Executed uploadTemplateButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterTemplateName(String templateName) {
		try {
			
			log.info("Entered enterTemplateName");
			if (getTxtBx_templateName.isDisplayed()) {
				log.info("Writing to getTxtBx_templateName: " + templateName);
			 
				writeText(getTxtBx_templateName, templateName);
			}
			log.info("template name: "+templateName);
			log.info("Executed enterTemplateName Successfully");
			
		} catch (Exception e) {
			log.error("Executed enterTemplateName Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterSaveButton() {
		try {
			log.info("Entered enterSaveButton");
			if (getBtn_save.isDisplayed()) {
				log.info("Clicking getBtn_save");
				click(getBtn_save);
			}
			log.info("Executed enterSaveButton Successfully");
		} catch (Exception e) {
			log.error("Executed enterSaveButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterEditButton() {
		try {
			log.info("Entered enterEditButton");
			if (getBtn_editTemplateName.isDisplayed()) {
				log.info("Clicking getBtn_editTemplateName");
				click(getBtn_editTemplateName);
			}
			log.info("Executed enterEditButton Successfully");
		} catch (Exception e) {
			log.error("Executed enterEditButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterPublishButton() {
		try {
			log.info("Entered enterPublishButton");
			if (getBtn_publish.isDisplayed()) {
				log.info("Clicking getBtn_publish");
				click(getBtn_publish);
			}
			log.info("Executed enterPublishButton Successfully");
		} catch (Exception e) {
			log.error("Executed enterPublishButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	// public void validateQuestionHeadingNameAndWeightage(){
	// try{
	// Assert.assertEquals(invalidQuestionnaireTemplate,"Questionnaire Template","
	// Questionnaire Template is not matching >>>>> Failed");
	// }
	// catch(Exception e){
	// e.printStackTrace();
	// }
	// }

	// public void validateTotalWeightage(){
	// try{
	// Assert.assertEquals(getTotalWeightage.getText(),"Total weightage =
	// 100.00","Total Weightage should be 100.00");
	// }
	// catch(Exception e){
	// e.printStackTrace();
	// }
	// }
	public void clickOnShowAnswerButton() {
		try {
			log.info("Entered clickOnShowAnswerButton");
			log.info("Clicking getBtn_showAnswers");
			click(getBtn_showAnswers);
			log.info("Executed clickOnShowAnswerButton Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnShowAnswerButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnHideAnswersButton() {
		try {
			log.info("Entered clickOnHideAnswersButton");
			log.info("Clicking getBtn_hideAnswers");
			click(getBtn_hideAnswers);
			log.info("Executed clickOnHideAnswersButton Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnHideAnswersButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void checkDownloadQuestionnaireButton() {
		try {
			log.info("Entered checkDownloadQuestionnaireButton");
			Assert.assertTrue(getBtn_downloadQuestionnaireTemplate.isDisplayed(),
					"Download Questionnaire Template button should be there. >>>>>> Failed");
			log.info("Executed checkDownloadQuestionnaireButton Successfully");
		} catch (Exception e) {
			log.error("Executed checkDownloadQuestionnaireButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnDownloadQuestionnaireButton() {
		try {
			log.info("Entered clickOnDownloadQuestionnaireButton");
			log.info("Clicking getBtn_downloadQuestionnaireTemplate");
			click(getBtn_downloadQuestionnaireTemplate);
			log.info("Executed clickOnDownloadQuestionnaireButton Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnDownloadQuestionnaireButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	// public void getQuestionsHeading() {
	//// try {
	//// click(getQuestionHeading);
	//// } catch (Exception e) {
	//// e.printStackTrace();
	//// }
	//// }

	public void validateQuestionnaireEditButton() {
		try {
			log.info("Entered validateQuestionnaireEditButton");
			log.info("Clicking getQuestionHeading");
			click(getQuestionHeading);
			doHover(getBtn_questionnaireEditButton);
			waitFor(300);
			log.info("Waiting for getBtn_questionnaireEditButton");
			waitUntilElementVisible(getBtn_questionnaireEditButton);
			log.info("Executed validateQuestionnaireEditButton Successfully");
		} catch (Exception e) {
			log.error("Executed validateQuestionnaireEditButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnQuestionnaireEditButton() {
		try {
			log.info("Entered clickOnQuestionnaireEditButton");
			log.info("Hover Clicking getBtn_questionnaireEditButton");
			doHoverandClick(getBtn_questionnaireEditButton);
			waitFor(200);
			log.info("Waiting for getBtn_questionnaireEditButton");
			waitUntilElementToBeClickable(getBtn_questionnaireEditButton);
			log.info("Executed clickOnQuestionnaireEditButton Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnQuestionnaireEditButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void setQuestionManually(String questionHeading, String weightage, String questionType, String opt1,
			String opt2, String opt3, String opt4, String opt5, String opt6) {
		try {
			log.info("Entered setQuestionManually");
			log.info("Writing to question_txt: " + questionHeading);
			writeText(question_txt, questionHeading);
			log.info("Writing to weightage_txt: " + weightage);
			writeText(weightage_txt, weightage);
			// setValueInDropdownText(questionTypeDropdown, questionType);
			WebElement option1 = webDriver.findElement(By.xpath(questionOptionChoice1));
			log.info("Writing to option1: " + opt1);
			writeText(option1, opt1);
			WebElement option2 = webDriver.findElement(By.xpath(questionOptionChoice2));
			log.info("Writing to option2: " + opt2);
			writeText(option2, opt2);
			WebElement option3 = webDriver.findElement(By.xpath(questionOptionChoice3));
			log.info("Writing to option3: " + opt3);
			writeText(option3, opt3);
			WebElement option4 = webDriver.findElement(By.xpath(questionOptionChoice4));
			log.info("Writing to option4: " + opt4);
			writeText(option4, opt4);
			WebElement option5 = webDriver.findElement(By.xpath(questionOptionChoice5));
			log.info("Writing to option5: " + opt5);
			writeText(option5, opt5);
			WebElement option6 = webDriver.findElement(By.xpath(questionOptionChoice6));
			log.info("Writing to option6: " + opt6);
			writeText(option6, opt6);
			waitFor(3000);
			log.info("Clicking getBtn_saveManuallyQuestion");
			click(getBtn_saveManuallyQuestion);
			log.info("Executed setQuestionManually Successfully");
		} catch (Exception e) {
			log.error("Executed setQuestionManually Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void setQuestionManually5options(String questionHeading, String weightage, String questionType, String opt1,
			String opt2, String opt3, String opt4, String opt5) {
		try {
			log.info("Entered setQuestionManually");
			log.info("Writing to question_txt: " + questionHeading);
			writeText(question_txt, questionHeading);
			log.info("Writing to weightage_txt: " + weightage);
			writeText(weightage_txt, weightage);
			// setValueInDropdownText(questionTypeDropdown, questionType);
			WebElement option1 = webDriver.findElement(By.xpath(questionOptionChoice1));
			log.info("Writing to option1: " + opt1);
			writeText(option1, opt1);
			WebElement option2 = webDriver.findElement(By.xpath(questionOptionChoice2));
			log.info("Writing to option2: " + opt2);
			writeText(option2, opt2);
			WebElement option3 = webDriver.findElement(By.xpath(questionOptionChoice3));
			log.info("Writing to option3: " + opt3);
			writeText(option3, opt3);
			WebElement option4 = webDriver.findElement(By.xpath(questionOptionChoice4));
			log.info("Writing to option4: " + opt4);
			writeText(option4, opt4);
			WebElement option5 = webDriver.findElement(By.xpath(questionOptionChoice5));
			log.info("Writing to option5: " + opt5);
			writeText(option5, opt5);
			log.info("Clicking getBtn_saveManuallyQuestion");
			click(getBtn_saveManuallyQuestion);
			log.info("Executed setQuestionManually Successfully");
		} catch (Exception e) {
			log.error("Executed setQuestionManually Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnSaveManuallyQuestion() {
		try {
			log.info("Entered clickOnSaveManuallyQuestion");
			log.info("Clicking getBtn_saveManuallyQuestion");
			click(getBtn_saveManuallyQuestion);
			log.info("Executed clickOnSaveManuallyQuestion Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnSaveManuallyQuestion Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnSaveCompetencyButton() {
		try {
			log.info("Entered clickOnSaveCompetencyButton");
			log.info("Clicking getBtn_saveCompetencyProgram");
			click(getBtn_saveCompetencyProgram);
			log.info("Executed clickOnSaveCompetencyButton Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnSaveCompetencyButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnActionButton() {
		try {
			log.info("Entered clickOnActionButton");
			log.info("Clicking getBtn_actionButton");
			click(getBtn_actionButton);
			log.info("Executed clickOnActionButton Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnActionButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void chooseEveryonein(String empId) {
		try {
			log.info("Entered chooseEveryonein");
			click(getRadioBtn_everyonein);
			// click(getLink_dontHaveEmployeeCode);
			// click(getBtn_showSearchOption);
			// waitFor(3000);
			log.info("Clicking getTextarea_empId");
			click(getTextarea_empId);
			log.info("Writing to getTextarea_empId: " + "EMP10");
			writeText(getTextarea_empId, empId);
			// click(getBtn_applyButtonInShowSearchOption);
			log.info("Executed chooseEveryonein Successfully");
		} catch (Exception e) {
			log.error("Executed chooseEveryonein Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void chooseExcept(String empId) {
		try {
			log.info("Entered chooseExcept");
			log.info("Clicking getRadioBtn_except");
			click(getRadioBtn_except);
			log.info("Waiting for getTextarea_empId");
			waitUntilElementVisible(getTextarea_empId);
			log.info("Clicking getTextarea_empId");
			click(getTextarea_empId);
			log.info("Writing to getTextarea_empId: " + empId);
			writeText(getTextarea_empId, empId);
			log.info("Executed chooseExcept Successfully");
		} catch (Exception e) {
			log.error("Executed chooseExcept Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void enterEmployeeID(String empId) {
		try {
			log.info("Entered enterEmployeeID");
			log.info("Writing to getTextarea_empId: " + empId);
			writeText(getTextarea_empId, empId);
			log.info("Executed enterEmployeeID Successfully");
		} catch (Exception e) {
			log.error("Executed enterEmployeeID Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void uploadQuestionnaire(String questionnaireData) {
		try {
			log.info("Entered uploadQuestionnaire");
			String questionnaireFile = new File(questionnaireData).getAbsolutePath();
			String questionnaireFile1 = questionnaireFile.replace("\\", "\\\\");
			System.out.println(questionnaireFile1);
			log.info("Writing to clickBrowseButton: " + questionnaireFile1);
			clickBrowseButton.sendKeys(questionnaireFile1);
			log.info("Writing to getTxtBx_QuestionnaireName: " + "Questionnaire Template");
			writeText(getTxtBx_QuestionnaireName, "Questionnaire Template");
			log.info("Executed uploadQuestionnaire Successfully");
		} catch (Exception e) {
			log.error("Executed uploadQuestionnaire Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void selectProcessUploadButton() {
		try {
			log.info("Entered selectProcessUploadButton");
			log.info("Clicking getBtn_chooseProcessUploadButton");
			click(getBtn_chooseProcessUploadButton);
			log.info("Executed selectProcessUploadButton Successfully");
		} catch (Exception e) {
			log.error("Executed selectProcessUploadButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnBulkUpload() {
		try {
			log.info("Entered clickOnBulkUpload");
			log.info("Clicking getBtn_bulkUpload");
			click(getBtn_bulkUpload);
			log.info("Clicking getBtn_chooseProcessUploadButton");
			click(getBtn_chooseProcessUploadButton);
			this.chooseProcessUploadButton();
			log.info("Clicking getLink_competencyFileLink");
			click(getLink_competencyFileLink);
			log.info("Executed clickOnBulkUpload Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnBulkUpload Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void chooseProcessUploadButton() {
		try {
			log.info("Entered chooseProcessUploadButton");
			setValueInDropdownText(getBtn_chooseProcessUploadButton, "Send invitation");
			log.info("Executed chooseProcessUploadButton Successfully");
		} catch (Exception e) {
			log.error("Executed chooseProcessUploadButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void uploadCompetencyFile(String competencyFiles) {
		try {
			log.info("Entered uploadCompetencyFile");
			String questionnaireFile = new File(competencyFiles).getAbsolutePath();
			String questionnaireFile1 = questionnaireFile.replace("\\", "\\\\");
			getBtn_browseFile.sendKeys(questionnaireFile1);
			log.info("Writing to getTextarea_competencyCommment: " + "new competency name");
			writeText(getTextarea_competencyCommment, "new competency name");
			log.info("Executed uploadCompetencyFile Successfully");
		} catch (Exception e) {
			log.error("Executed uploadCompetencyFile Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickUploadCompetencyButton() {
		try {
			log.info("Entered clickUploadCompetencyButton");
			log.info("Clicking getBtn_uploadCompetencyFile");
			click(getBtn_uploadCompetencyFile);
			log.info("Executed clickUploadCompetencyButton Successfully");
		} catch (Exception e) {
			log.error("Executed clickUploadCompetencyButton Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnPublishScorecard() {
		try {
			log.info("Entered clickOnPublishScorecard");
			log.info("Clicking getBtn_publishScorecard");
			click(getBtn_publishScorecard);
			log.info("Clicking confirm_Btn");
			click(confirm_Btn);
			log.info("Executed clickOnPublishScorecard Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnPublishScorecard Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnConfirm() {
		try {
			log.info("Clicking confirm_Btn");
			click(confirm_Btn);
			log.info("Clicked confirm_Btn");
		} catch (Exception e) {
			log.error("error Clicking confirm_Btn");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickonRatingCompetencyCard() {
		try {
			log.info("clicking on competency rating card!!");
			click(competencyRatingCard_Btn);
			log.info("clicked on competency rating card!!");
		} catch (Exception e) {
			log.error("error clicking on competency rating card!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnInviteCard() {
		try {
			log.info("clicking on invite feedback providers card!!");
			click(inviteFeedbackProviders_btn);
			log.info("clicked on invite feedback providers card!!");
		} catch (Exception e) {
			log.error("error clicking on invite feedback providers card!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnQuestion(String question) {

		try {
			Actions act = new Actions(webDriver);
			log.info("clicking on question:" + question);
			WebElement ele = webDriver.findElement(By.xpath("//p[contains(text(),'" + question + "')]"));
			ScrollUpToElement(ele);
			act.moveToElement(ele).click(ele).build().perform();

			log.info("clicked on question:" + question);
		} catch (Exception e) {
			log.error("error clicking on question:" + question);
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnQuestion(int i) {
		try {

			log.info("clicking on question ::" + i);
			Actions act = new Actions(webDriver);

			// act.moveToElement(ratingOptionForself).click().build().perform();
			WebElement ele = webDriver
					.findElement(By.xpath("(//div[@class='card-header border-bottom c-p'])[" + i + "]"));
			waitUntilElementToBeClickable(ele);
			act.moveToElement(ele).click().build().perform();
			log.info("clicked on question ::" + i);
		} catch (Exception e) {
			log.error("error clicking on question ::" + i);
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void answerQuestionSelf() {
		try {
			Actions act = new Actions(webDriver);
			log.info("answering question for self!!");
			act.moveToElement(ratingOptionForself).click().build().perform();
			// (ratingOptionForself);
			log.info("answered question for self!!");

		} catch (Exception e) {
			log.error("error answering question for self!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void answerQuestionSubordinate() {
		try {
			Actions act = new Actions(webDriver);
			log.info("answering question for subordinate!!");
			act.moveToElement(ratingOptionForSubordinate).click().build().perform();
			log.info("answered question for subordinate!!");

		} catch (Exception e) {
			log.error("error answering question for subordinate!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterOverAllComments(String comments) {
		try {
			log.info("entering overall comments!!");
			writeText(overAllcomments_textBox, comments);
			log.info("entered overall comments!!");

		} catch (Exception e) {
			log.error("error entering overall comments!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void clickOnSubmit() {
		try {
			log.info("clicking on submit!!");
			click(submit_btn);
			log.info("clicked on submit!!");
			getSuccessMessage();
		} catch (Exception e) {
			log.error("error clicking on submit!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnOutsideWorkCircle() {
		try {
			log.info("clicking on outside work circle tab!!");
			click(outsideWorkCircle_tab);
			log.info("clicked on outside work circle tab!!");
		} catch (Exception e) {
			log.error("error clicking on outside work circle tab!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnmyWorkCircle() {
		try {
			log.info("clicking on my work circle tab!!");
			click(myWorkCircle_tab);
			log.info("clicked on my work circle tab!!");
		} catch (Exception e) {
			log.error("error clicking on my work circle tab!!");
			e.printStackTrace();
			Assert.fail();
		}
	}
	public void clickOnmyWorkCircle1() {
		try {
			log.info("clicking on my work circle tab!!");
			click(myWorkCircle_tab);
			log.info("clicked on my work circle tab!!");
		} catch (Exception e) {
			log.error("error clicking on my work circle tab!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnAddInviteSpecificEmployee(String empId) {
		try {
			log.info("adding:" + empId);
			WebElement ele = webDriver.findElement(By.xpath("//b[contains(text(),'" + empId + "')]//..//..//button"));
			click(ele);
			log.info("added:" + empId);
		} catch (Exception e) {
			log.info("error sendig invite");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnSendInvite() {
		try {
			log.info("clicking on send invite!!");
			click(sendInvite_btn);
			log.info("clicked on send invite!!");
		} catch (Exception e) {
			log.error("error clicking on send invite!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnSendInvitation() {
		try {
			log.info("clicking on send invitation!!");
			click(sendInvitation_btn);
			log.info("clicked on send invitation!!");
		} catch (Exception e) {
			log.error("error clicking on send invitation!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnStarttoProvideFeedbackCard(String programName) {
		try {
			log.info("clicking on start to provide feedback card!!");
			WebElement ele = webDriver.findElement(By.xpath("(//b[contains(text(),'" + programName
					+ "')]//..//..//..//..//..//h5[contains(text(),'Start to provide your feedback')])[1]"));
			click(ele);
			log.info("clicked on start to provide feedback card!!");

		} catch (Exception e) {
			log.error("error clicking on start to provide feedback card!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnAcceptInvitation() {
		try {
			log.info("clicking on accept!!");
			clickOnElementByJs(accept_btn);
			log.info("clicked on accept!!");
		} catch (Exception e) {
			log.error("error clicking on accept!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnStop() {
		try {
			log.info("clicking on stop!!");
			clickOnElementByJs(stop_Btn);
			log.info("clicked on stop!!");

		} catch (Exception e) {
			log.error("error clicking on stop!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public boolean verifyOverAllComments(String comments) {
		try {
			WebElement ele = webDriver.findElement(By.xpath("//p[contains(text(),'" + comments + "')]"));
			if (ele.isDisplayed())

			{
				log.info("comments match!!");
				return true;
			} else {
				log.info("comments dont match!!");
				return false;
			}
		} catch (Exception e) {
			log.info("error in verifying overall comments!!");
			e.printStackTrace();
			return false;
		}
	}

	public void clickOnCompetencyPublishedCard() {
		try {
			log.info("clicking on competency published card");
			click(competencyPublishedCard_lnk);
			log.info("clicked on competency published card");

		} catch (Exception e) {
			log.error("error clicking on competency published card");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnSuggestFeedbackProviderCard(String programName) {
		try {
			log.info("clicking on suggest feedback provider card!!");
			WebElement ele = webDriver.findElement(By.xpath("//b[contains(text(),'" + programName
					+ "')]//..//..//..//..//..//h5[contains(text(),'Time to suggest feedback providers to supervisor')]"));
			click(ele);
			log.info("clicked on suggest feedback provider card!!");
		} catch (Exception e) {
			log.error("error clicking on suggest feedback provider card!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void clickOnSearchIcon() {
		try {
			log.info("clicking on search icon");
			clickOnElementByJs(search_icon);
			log.info("clicked on search icon");
		} catch (Exception e) {
			log.error("error clicking on search icon");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnSearchIconOutsideWorkCircle() {
		try {
			log.info("clicking on search icon under outside work circle");
			click(searchIcon_outsideWorkCircle);
			log.info("clicked on search icon outside under work circle");
		} catch (Exception e) {
			log.error("error clicking on search icon under outside work circle");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterEmpId(String empId) {
		try {
			log.info("entering employee to search");
			waitUntilElementVisible(search_textField);
			writeText(search_textField, empId);
			log.info("entered employee to search");
		} catch (Exception e) {
			log.error("error entering employee to search");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void clickOnSearchButton() {
		try {
			log.info("clicking on search button");
			click(search_btn);
			log.info("clicked on search button");
		} catch (Exception e) {
			log.error("error clicking on search button");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnSuggestForaSpecificEmployee(String empId) {
		try {
			log.info("clicking for suggest against " + empId);
			WebElement ele = webDriver.findElement(
					By.xpath("//b[contains(text(),'" + empId + "')]//..//..//button[contains(text(),'Suggest')]"));
			click(ele);
			log.info("clicked for suggest against " + empId);
		} catch (Exception e) {
			log.error("error clicking for suggest against " + empId);
			e.printStackTrace();
			Assert.fail();
		}

	}

	public boolean verifySuggestedLabelforanEmployee(String empId) {
		try {
			WebElement ele = webDriver.findElement(
					By.xpath("//b[contains(text(),'" + empId + "')]//..//..//p[contains(@class,'text-success')]"));
			if (ele.getText().trim().equalsIgnoreCase("Suggested")) {
				log.info("suggested label verified");
				return true;
			} else {
				log.info("suggested label not verified");

				return false;
			}
		} catch (Exception e) {
			log.error("error verifying suggested label");
			e.printStackTrace();
			return false;
		}
	}

	public boolean verifyPendingLabelforanEmployee(String empId) {
		try {
			WebElement ele = webDriver.findElement(
					By.xpath("//b[contains(text(),'" + empId + "')]//..//..//p[contains(@class,'text-warning')]"));
			if (ele.getText().trim().equalsIgnoreCase("Pending")) {
				log.info("pending label verified");
				return true;
			} else {
				log.info("pending label not verified");

				return false;
			}
		} catch (Exception e) {
			log.error("error verifying pending label");
			e.printStackTrace();
			return false;
		}
	}

	public boolean verifyInactiveHeaders(ArrayList<String> expectedInactiveHeaders) {
		try {
			boolean b = false;
			log.info("verifying inactive headers!!");
			ArrayList<WebElement> inactiveHeaders = (ArrayList<WebElement>) webDriver
					.findElements(By.xpath("//div[@class='card-header']"));
			for (int i = 0; i < expectedInactiveHeaders.size(); i++) {
				if (inactiveHeaders.equals(expectedInactiveHeaders)) {

					b = true;
					log.info("verified inactive headers!!");
				} else {
					b = false;
					log.info("inactive headers not verified!!");
				}

			}
			return b;
		} catch (Exception e) {
			log.error("error verifying inactive headers!!");
			e.printStackTrace();
			return false;
		}

	}

	public boolean verifyActiveHeader(String expectedActualHeader) {
		try {
			log.info("verfiying active header");
			if (verifyData(expectedActualHeader, activeHeader_label) == true) {
				log.info("verfied active header");
				return true;
			} else {
				log.info("active header not verified");
				return false;
			}
		} catch (Exception e) {
			log.error("error verfiying active header");
			e.printStackTrace();
			return false;
		}
	}

	public void clickOnAllDirectReportsCheckBox() {
		try {
			log.info("clicking On All Direct Peers CheckBox");

			clickOnElementByJs(allDirectReports_chkBox);
			log.info("clicked On All Direct Peers CheckBox");
		} catch (Exception e) {
			log.error("error clicking On All Direct Peers CheckBox");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnImmediateSupervisorCheckBox() {
		try {
			log.info("clicking On Immediate Supervisor CheckBox");

			clickOnElementByJs(immediateSupervisor_chkBox);
			log.info("clicked On Immediate Supervisor CheckBox");
		} catch (Exception e) {
			log.error("error clicking On Immediate Supervisor CheckBox");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnAllPeersCheckBox() {
		try {
			log.info("clicking On All peers CheckBox");
			clickOnElementByJs(allPeers_chkBox);
			log.info("clicked On All peers CheckBox");
		} catch (Exception e) {
			log.error("error clicking On All peers CheckBox");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnSupervisorsPeersCheckBox() {
		try {
			log.info("clicking On Supervisors peers CheckBox");
			clickOnElementByJs(supervisorPeers_chkBox);
			log.info("clicked On Supervisors peers CheckBox");
		} catch (Exception e) {
			log.error("error clicking On Supervisors peers CheckBox");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnMyPeersSubordinatesCheckBox() {
		try {
			log.info("clicking On My Peers Subordinates CheckBox");
			clickOnElementByJs(peersSubordinate_chkBox);
			log.info("clicked On My Peers Subordinates CheckBox");
		} catch (Exception e) {
			log.error("error clicking On My Peers Subordinates CheckBox");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnMySupervisorsPeersSubordinatesCheckBox() {
		try {
			log.info("clicking On My Supervisor's Peers' Subordinates CheckBox");
			clickOnElementByJs(mySupPeersSub_chkBox);
			log.info("clicked On My Supervisor's Peers' Subordinates CheckBox");
		} catch (Exception e) {
			log.error("error clicking On My Supervisor's Peers' Subordinates CheckBox");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void clickOnSendInvitationsAutomaticallyCheckBox() {
		try {
			log.info("clicking On Send Invitations Automatically CheckBox");

			clickOnElementByJs(sendInvitationsAutomatically_chkBox);
			log.info("clicked On Send Invitations Automatically CheckBox");
		} catch (Exception e) {
			log.error("error clicking On Send Invitations Automatically CheckBox");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public boolean validateEligibleResponsesheader() {
		try {
			if (verifyData("Eligible Responses", eligibleResponses_lbl) == true) {
				log.info("eligible response verified!!");
				return true;
			} else {
				log.info("eligible response not  verified!!");
				return false;
			}
		} catch (Exception e) {
			log.info("eligible response not verified due to exception!!");
			e.printStackTrace();
			return false;
		}
	}

	public boolean validateResponseWeightageLabel() {
		try {
			if (verifyData("Response weightage Configuration", repsonseWeightage_Lbl) == true) {
				log.info(" response weightage verified!!");
				return true;
			} else {
				log.info("eligible response weightage not  verified!!");
				return false;
			}
		} catch (Exception e) {
			log.info("response weightage not verified due to exception!!");
			e.printStackTrace();
			return false;
		}
	}

	public boolean validateInvitationConfigurationLabel() {
		try {
			if (verifyData("Response weightage Configuration", repsonseWeightage_Lbl) == true) {
				log.info("invitation Configuration verified!!");
				return true;
			} else {
				log.info("invitation Configuration not  verified!!");
				return false;
			}
		} catch (Exception e) {
			log.info("invitation Configuration not verified due to exception!!");
			e.printStackTrace();
			return false;
		}
	}

	public void clickOnChartsOneByOne() {
		try {

			log.info("clicking on charts one by one!!");
			for (int i = 2; i <= 14; i = i + 2) {
				WebElement ele = webDriver.findElement(By.xpath("(//*[local-name()='tspan'])[" + i + "]"));
				waitUntilElementToBeClickable(ele);
				click(ele);
				log.info("clicked on chart!!");
			}
		} catch (Exception e) {
			log.error("error clicking on chart!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public boolean verifycolumndisappearanceOnClickingOnChart(int i) {
		try {
			int size = columns.size();
			if (size == i) {
				log.info("all text areas disappear!!");
				return true;
			} else {
				log.info("all text areas dont disappear!!");
				return false;
			}

		} catch (Exception e) {
			log.info("verifycolumndisappearanceOnClickingOnChart failed!!");
			return false;
		}
	}

	public boolean verifyHowDoYouWantToGetStarted() {
		try {
			log.info("verifying How Do You Want To Get Started");
			if (howDoyouWantToGetStarted_lbl.isDisplayed() == true) {
				log.info("verified How Do You Want To Get Started!!");
				return true;
			} else {
				log.info("verifying How Do You Want To Get Started failed!!");
				return false;
			}
		} catch (Exception e) {
			log.error("error verifying How Do You Want To Get Started!!");
			e.printStackTrace();
			return false;
		}
	}

	public void clickOnSelectExistingTemplate() {
		try {
			log.info("clicking on select existing template!!");
			click(selectExistingTemplate_btn);
			log.info("clicked on select existing template!!");
		} catch (Exception e) {
			log.error("error clicking on select existing template!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public String getNumberOfButtons() {
		try {

			log.info("verifying list of buttons!!");
			// ArrayList<String> actual = null;
			// for (int i = 1; i <= button_list.size(); i++) {
			// log.info("button_list.get(i).getText().trim()");
			// actual.add(button_list.get(i).getText().trim());
			// }
			String a = String.valueOf(button_list.size());
			return a;

		} catch (Exception e) {
			log.info("error verifying");
			e.printStackTrace();
			Assert.fail();
			return null;
		}
	}

	public void selectQuestionType(String questionType) {
		try {
			log.info("selecting question type");
			setValueInDropdownText(questionType_Dwn, questionType);
			log.info("selected question type");
		} catch (Exception e) {
			log.error("error selecting question type");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterQuestionName(String name) {
		try {
			log.info("entering question name!!");
			writeText(question_txt, name);
			log.info("entered question name!!");
		} catch (Exception e) {
			log.error("error entering question name!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterWeightage(String weightage) {
		try {
			log.info("entering weightage");
			writeText(weightage_txt, weightage);
			log.info("entered weightage");
		} catch (Exception e) {
			log.error("error entering weightage");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public boolean verifyDropDownValues(ArrayList<String> a) {
		try {
			log.info("verifying drop down values!!");
			WebElement ele = webDriver.findElement(By.xpath("//select[@name='scoreCommentChart']"));
			Select sel = new Select(ele);
			ArrayList<String> c = new ArrayList<>();
			List<WebElement> b = sel.getOptions();
			for (WebElement e : b) {
				log.info(e.getText().trim());
				c.add(e.getText().trim());
			}

			if (a.equals(c)) {
				log.info("verified drop down values!!");
				return true;
			} else {
				log.info("verifying drop down values failed!!");
				return false;
			}
		} catch (Exception e) {
			log.error("error verifying drop down values!!");
			return false;
		}
	}

	public void selectScoreCommentandChartDisplayOption(String option) {
		try {
			log.info("selecting Score, Comment and Chart Display Option");
			setValueInDropdownText(scoreCommentChart_dropDown, option);
			log.info("selected Score, Comment and Chart Display Option");
		} catch (Exception e) {
			log.error("error selecting Score, Comment and Chart Display Option");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void selectYear(String year) {
		try {
			log.info("selecting year::" + year);
			setValueInDropdownText(yearDropdown, year);
			log.info("selected year::" + year);
		} catch (Exception e) {
			log.info("error selecting year::" + year);
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyNoresultLabel() {
		try {
			log.info("verifying no result found!!");
			Assert.assertTrue(verifyData("No Results Found", noResult_lbl));
			log.info("verified no result found!!");
		} catch (Exception e) {
			log.error("error verifying no result found!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public boolean verifyGridDetails(ArrayList<String> a) {
		try {
			log.info("verifying grid column names!!");
			ArrayList<String> b = new ArrayList<>();
			for (WebElement e : gridDetails) {
				b.add(e.getText().trim());
			}
			if (a.equals(b)) {
				log.info("verified grid column names!!");
				return true;
			}

			else {
				log.info("verifying grid column names failed");
				return false;
			}
		} catch (Exception e) {
			log.error("error verifying grid column names!!");
			e.printStackTrace();
			return false;
		}
	}

	public void verifyPagination() {
		try {
			log.info("verifying pagination!!");
			Assert.assertTrue(pagination.isDisplayed());
			log.info("verified pagination!!");
		} catch (Exception e) {
			log.error("error verifying pagination!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyProgramNameBulkUploadPage(String programName) {
		try {
			log.info("verifying program name on bulk upload screen!!");
			Assert.assertTrue(verifyData(programName, programNameBulkUpload_lbl));
			log.info("verified program name on bulk upload screen!!");
		} catch (Exception e) {
			log.error("error verifying program name on bulk upload screen!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public boolean verifyChooseProcessDropdownValues(ArrayList<String> a) {
		try {
			log.info("verifying drop down values!!");
			WebElement ele = webDriver
					.findElement(By.xpath("//label[contains(text(),'Choose Process :')]/following-sibling::select"));
			Select sel = new Select(ele);
			ArrayList<String> c = new ArrayList<>();
			List<WebElement> b = sel.getOptions();
			for (WebElement e : b) {
				c.add(e.getText().trim());
			}

			if (a.equals(c)) {
				log.info("verified drop down values!!");
				return true;
			} else {
				log.info("verifying drop down values failed!!");
				return false;
			}
		} catch (Exception e) {
			log.error("error verifying drop down values!!");
			e.printStackTrace();
			return false;
		}
	}

	public boolean verifyExcelFileTypeDropdownValues(ArrayList<String> a) {
		try {
			log.info("verifying drop down values in excel file type!!");
			WebElement ele = webDriver
					.findElement(By.xpath("//label[contains(text(),'Excel File type:')]/following-sibling::select"));
			Select sel = new Select(ele);
			ArrayList<String> c = null;
			List<WebElement> b = sel.getOptions();
			for (WebElement e : b) {
				c.add(e.getText().trim());
			}

			if (a.equals(c)) {
				log.info("verified drop down values!!");
				return true;
			} else {
				log.info("verifying drop down values failed!!");
				return false;
			}
		} catch (Exception e) {
			log.error("error verifying drop down values!!");
			e.printStackTrace();
			return false;
		}
	}

	public void clickOnBack() {
		try {
			log.info("clicking  back button");
			clickOnElementByJs(back_btn);
			log.info("clicked back button");
		} catch (Exception e) {
			log.error("error clicking back button");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnRefresh() {
		try {
			log.info("clicking on refresh button");
			click(refresh_btn);
			log.info("clicked on refresh button");
		} catch (Exception e) {
			log.error("error clicking on refresh button");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public String getStatus() {
		try {
			log.info("getting status of file uploaded!!");
			String status = status_lbl.getText().trim();
			log.info("getting status of file uploaded::" + status);
			return status;
		} catch (Exception e) {
			log.error("error getting status of file uploaded!!");
			e.printStackTrace();
			Assert.fail();
			return null;
		}
	}

	public boolean verifyTabsOnInviteFeedbackProvidersCard(ArrayList<String> a) {
		try {
			log.info("verifying tab values for invite/suggest feedback providers card!!");

			ArrayList<String> c = new ArrayList<>();

			for (WebElement e : feedBackInviteTablist) {
				log.info(e.getText().trim());
				c.add(e.getText().trim());
			}

			if (a.equals(c)) {
				log.info("verified tab values for invite/suggest feedback providers card!!");
				return true;
			} else {
				log.info("verifying tab values for invite/suggest feedback providers card failed!!");
				return false;
			}
		} catch (Exception e) {
			log.error("error verifying tab values for invite/suggest feedback providers card!!");
			e.printStackTrace();
			return false;
		}
	}

	public boolean verifyGradeInviteFeedbackProvidersCard(ArrayList<String> a) {
		try {
			log.info("verifying tab values for invite/suggest feedback providers card!!");

			ArrayList<String> c = new ArrayList<>();

			for (WebElement e : gradeList) {
				c.add(e.getText().trim());
			}

			if (a.equals(c)) {
				log.info("verified grade values for invite/suggest feedback providers card!!");
				return true;
			} else {
				log.info("verifying grade values for invite/suggest feedback providers card failed!!");
				return false;
			}
		} catch (Exception e) {
			log.error("error verifying grade values for invite/suggest feedback providers card!!");
			e.printStackTrace();
			return false;
		}
	}

	@FindBy(how = How.XPATH, using = "//button[contains(@class,'btn btn-outline-danger')]//i")
	private WebElement cancel_btn;

	public void clickOnCancel() {
		try {
			log.info("clicking on cancel!!");
			waitUntilElementToBeClickable(cancel_btn);
			clickOnElementByJs(cancel_btn);
			log.info("clicked on cancel!!");
		} catch (Exception e) {
			log.error("error clicking on cancel!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyNoEmployeeFoundLabel(String expected) {
		try {
			log.info("verifying no employee found label");
			Assert.assertTrue(verifyData(expected, noEmployeeFound_lbl), noEmployeeFound_lbl.getText());
			log.info("verified no employee found label");
		} catch (Exception e) {
			log.error("error verifying no employee found label");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void clickOnTab(String tabName) {
		try {
			log.info("clicking on::" + tabName);
			// Actions act= new Actions(webDriver);
			WebElement ele = webDriver.findElement(By.xpath("//a[contains(text(),'" + tabName + "')]"));
			waitUntilElementToBeClickable(ele);
			// act.moveToElement(ele).click().build().perform();
			click(ele);
			log.info("clicked on::" + tabName);
		} catch (Exception e) {
			log.error("error clicking on::" + tabName);
			e.printStackTrace();
			Assert.fail();
		}
	}

	public boolean verifyNoEmployeesUnderTab(String tabName, String message) {
		try {
			log.info("verifying no employees under " + tabName + "tab");
			WebElement ele = webDriver.findElement(By.xpath("//div[@class='card-header']//h5[contains(text(),'"
					+ tabName + "')]//..//..//div[@class='card-body']//p"));
			if (ele.getText().trim().equals(message)) {
				log.info("verified no employees under " + tabName + "tab");
				return true;
			} else {
				log.info("verifying no employees under " + tabName + "tab failed");
				return false;
			}

		} catch (Exception e) {
			log.error("error verifying no employees under " + tabName + "tab");
			e.printStackTrace();
			return false;
		}
	}

	public boolean verifyAllEmployees() {
		try {
			log.info("verifying employees under all");
			if (employeeList.size() > 0) {
				log.info("verified employees under all");
				return true;
			} else {
				log.info("verifying employees under all failed");
				return false;
			}
		} catch (Exception e) {
			log.error("error verifying employees under all");
			e.printStackTrace();
			return false;
		}
	}

	public void clickOnShowMore() {
		try {
			log.info("clicking on show more");
			click(showMore_btn);
			log.info("clicked on show more");
		} catch (Exception e) {
			log.error("error clicking on show more");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public boolean verifyInviteSummaryColumnNames(ArrayList<String> a) {
		try {
			log.info("verifying Invite Summary Column Names!!");

			ArrayList<String> c = new ArrayList<>();

			for (WebElement e : inviteSummaryColumnName) {
				c.add(e.getText().trim());
			}

			if (a.equals(c)) {
				log.info("verified Invite Summary Column Names!!");
				return true;
			} else {
				log.info("verifying Invite Summary Column Names!!");
				return false;
			}
		} catch (Exception e) {
			log.error("error verifying Invite Summary Column Names!!");
			e.printStackTrace();
			return false;
		}
	}

	public void selectQuestionTemplate(String templateName) {
		try {
			log.info("selecting template name::" + templateName);
			setValueInDropdownText(selectTemplateDropdown, templateName);
			log.info("selected template name::" + templateName);
		} catch (Exception e) {
			log.error("error selecting template name::" + templateName);
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void giveStarRating(String rating) {
		try {
			log.info("selecting star rating as::" + rating);
			WebElement ele = webDriver.findElement(By.xpath("(//span[contains(@class,'star')])[" + rating + "]"));
			click(ele);
			log.info("selected star rating as::" + rating);
		} catch (Exception e) {
			log.error("error selecting star rating as::" + rating);
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterFeedback(String feedback) {
		try {
			log.info("entering feedback");
			writeText(giveFeedback_text, feedback);
			log.info("entered feedback");
		} catch (Exception e) {
			log.error("error entering feedback");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public ArrayList<String> getMinimumValues() {
		try {
			log.info("getting minimum values!!");
			ArrayList<String> a = new ArrayList<>();
			for (WebElement ele : minValues) {
				log.info(ele.getText().trim());
				a.add(ele.getText().trim());
			}

			return a;
		} catch (Exception e) {
			log.error("error getting minimum values!!");
			e.printStackTrace();
			Assert.fail();
			return null;
		}
	}

	public ArrayList<String> getMaximumValues() {
		try {
			log.info("getting minimum values!!");
			ArrayList<String> a = new ArrayList<>();
			for (WebElement ele : minValues) {
				log.info(ele.getText().trim());
				a.add(ele.getText().trim());
			}

			return a;
		} catch (Exception e) {
			log.error("error getting minimum values!!");
			e.printStackTrace();
			Assert.fail();
			return null;
		}
	}

	public void clickOnViewDetails() {
		try {
			log.info("clicking on view details!!");
			click(viewDetails_btn);
			log.info("clicked on view details!!");
		} catch (Exception e) {
			log.error("error clicking on view details!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public int getSuggestedNumbers() {
		try {
			log.info("getting number of suggested employees");
			int a = suggestedlbl_viewDetails.size();
			log.info("got number of suggested employees as::" + a);
			clickOnClose();
			return a;
		} catch (Exception e) {
			log.error("error getting number of suggested employees");
			e.printStackTrace();
			Assert.fail();
			return -1;
		}
	}

	public void clickOnClose() {
		try {
			log.info("clicking on close!!");
			click(close_btn);
			log.info("clicked on close!!");
		} catch (Exception e) {
			log.error("error clicking on close!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public boolean verifyCategoryLabels() {
		try {
			log.info("verifying the added categories");
			if (engineering_lbl.isDisplayed() && finance_lbl.isDisplayed()) {
				log.info("verified the added categories");
				return true;
			} else {
				log.info("verifying the added categories failed");
				return false;
			}
		} catch (Exception e) {
			log.error("error verifying the added categories");
			e.printStackTrace();
			return false;
		}
	}

	public boolean verifySendInviteDisabled() {
		try {

			if (sendInvite_btn.isEnabled() != true) {
				log.info("send invite button is not enabled");
				return true;

			} else {
				log.info("send invite button is  enabled");

				return false;
			}
		} catch (Exception e) {

			log.info("send invite button is not enabled");
			e.printStackTrace();
			return false;
		}
	}

	public void clickOnBusinessPartners() {
		try {
			WebElement ele = webDriver.findElement(By.xpath("//ul[@role='tablist']//li[3]//a"));
			// WebElement ele2=
			// webDriver.findElement(By.xpath("//ul[@role='tablist']//li[4]//a"));

			log.info("clicking on business partners");
			click(ele);
			log.info("clicked on business partners");

		} catch (Exception e) {
			log.error("error clicking on business partners");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterBusinessPartnerName(String name) {
		try {
			log.info("entering business partner's name!!");
			writeText(name_txt, name);
			log.info("entered business partner's name!!");
		} catch (Exception e) {
			log.error("error entering business partner's name!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterBusinessPartnerMail(String email) {
		try {
			log.info("entering business partner's email!!");
			writeText(email_txt, email);
			log.info("entered business partner's email!!");
		} catch (Exception e) {
			log.error("error entering business partner's email!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void selectBusinessPartnerType(String type) {
		try {
			log.info("selecting business partner type!!");
			click(type_Dropdown);
			setValueInDropdownText(type_Dropdown, type);
			log.info("selecting business partner type!!");
		} catch (Exception e) {
			log.error("error selecting business partner type!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnInvite() {
		try {
			log.info("clicking on invite");
			click(invite_btn);
			log.info("clicked on invite");
		} catch (Exception e) {
			log.error("error clicking on invite");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnDecline() {
		try {
			log.info("clicking on decline!!");
			clickOnElementByJs(decline_btn);
			log.info("clicking on decline!!");
		} catch (Exception e) {
			log.error("error clicking on decline!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void enterRejectComments(String comments) {
		try {
			log.info("entering reject comments");
			writeText(rejectComments_text, comments);
			log.info("entered reject comments");
		} catch (Exception e) {
			log.error("error entering reject comments");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnSendback() {
		try {
			log.info("clicking on send back");
			click(sendBack_btn);
			log.info("clicked on send back");
		} catch (Exception e) {
			log.error("error clicking on send back");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public boolean verifyDeclinedlabel(String empId) {
		try {
			WebElement ele = webDriver
					.findElement(By.xpath("//b[contains(text(),'" + empId + "')]//..//..//p[@class='text-danger']"));
			String a = ele.getText().trim();
			if (a.equals("Declined")) {
				log.info("declined verified for::" + empId);
				return true;
			} else {
				log.info("declined not verified for::" + empId);
				return false;
			}

		} catch (Exception e) {
			log.info("error verifying declined for::" + empId);
			e.printStackTrace();
			return false;
		}
	}

	public void giveRatingforSpecificEmployee(String empId) {
		try {
			log.info("giving rating for employee: " + empId);
			WebElement ele = webDriver.findElement(By.xpath("//b[text()='" + empId
					+ "']//..//..//following-sibling::div//div[@class='custom-range-lable']//span[3]"));
			click(ele);
			log.info("gave rating for employee: " + empId);
		} catch (Exception e) {
			log.error("error giving rating for employee: " + empId);
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void changePriorityOfaQuestion() {
		try {
			log.info("changing priority of a question!!");
			WebElement ele1 = webDriver.findElement(By.xpath("(//p[contains(text(),'Show answers')])[1]"));
			WebElement ele2 = webDriver.findElement(By.xpath("(//p[contains(text(),'Show answers')])[2]"));
			Actions act = new Actions(webDriver);
			act.dragAndDrop(ele1, ele2);
			log.info("changed the priority of questions");

		} catch (Exception e) {
			log.error("error changing priority of a question!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void deleteSpecificQuestion(String question) {
		try {
			log.info("deleting the question:"+question);
			//Actions act= new Actions(webDriver);
			WebElement ele = webDriver.findElement(By.xpath(
					"//p[contains(text(),'"+question+"')]//..//..//..//i[@class='fa fa-trash-o text-primary mr-2']"));
			clickOnElementByJs(ele);
			//act.moveToElement(ele).click().build().perform();
			log.info("deleted the question:"+question);
		} catch (Exception e) {
			log.error("error deleting the question:"+question);
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void clickOnDelete() {
		try {
			log.info("clicking on delete");
			click(delete_btn);
			log.info("clicked on delete");
		} catch (Exception e) {
			log.error("error clicking on delete");
			e.printStackTrace();
			Assert.fail();
		}
	}

}