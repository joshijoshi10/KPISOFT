package pageObjects;

import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import util.DateUtil;

public class CheckInCreationPage extends BasePage {

	public CheckInCreationPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);

	}

	@FindBy(how = How.LINK_TEXT, using = "Check In Program")
	private WebElement checkin_lnk;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add Check-In')]")
	private WebElement addCheckin_btn;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Check-In')]")
	private WebElement checkinprog_lbl;

	// Basic Information

	@FindBy(how = How.ID, using = "KPI_name")
	private WebElement programName_txt;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Start date')]/following-sibling::div/div/i")
	private WebElement dp_startDateBtn;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'End date')]/following-sibling::div/div/i")
	private WebElement dp_endDateBtn;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'How often do you want your employees to Check-In?')]/following-sibling::select")
	private WebElement dd_checkinPeriod;

	@FindBy(how = How.NAME, using = "checkinDay")
	private WebElement dd_checkinDay;


	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Continue']")
	private WebElement continue_Btn;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Add Checkin')]")
	private WebElement lbl_CreateCheckinProgram;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Basic Information')]")
	private WebElement lbl_BasicInformation;

	@FindBy(how = How.XPATH, using = "//select[@class='custom-select'][1]")
	private WebElement customMonth;

	@FindBy(how = How.XPATH, using = "//select[@class='custom-select'][2]")
	private WebElement customyear;

	// Template

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Templates')]")
	private WebElement lbl_Template;

	@FindBy(how = How.XPATH, using = "//select[@id='perspective']")
	private WebElement template_sel;

	@FindBy(how = How.XPATH, using = "//small[contains(text(),'Select response type')]/../select[@id='perspective']")
	private List<WebElement> template_responsetype_sel;

	@FindBy(how = How.XPATH, using = "//i[contains(@ngbtooltip,'Add Question')]")
	private List<WebElement> Template_field_add;

	@FindBy(how = How.XPATH, using = "//small[contains(text(),'Question')]/following-sibling::textarea")
	private List<WebElement> Template_field;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Include Self Rating')]/../preceding-sibling::input")
	private WebElement chk_includeSelfRating;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Include Self Rating')]/..")
	private WebElement chk_includeSelfRatingLbl;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Add character limit')]/../preceding-sibling::input")
	private WebElement chk_AddCharacterLimit;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Add character limit')]/..")
	private WebElement chk_AddCharacterLimitLbl;

	@FindBy(how = How.XPATH, using = "//input[@type='number']")
	private WebElement txt_perEntry;

	@FindBy(how = How.XPATH, using = "//button [normalize-space()='Save']")
	private WebElement save_Btn;

	// start checkin program

	@FindBy(how = How.XPATH, using = "(//i[@class='fas fa-ellipsis-h'])[1]")
	private WebElement lnk_ellipsis;

	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-menu dropdown-menu-right show']/a[contains(text(),'Start')]") //"//li[normalize-space()='Start' ]")
	private WebElement lnk_start;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Include everyone')]")
	private WebElement includeEveryone_radio;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Validate and Start')]") //"//button[normalize-space()='Validate and Start Program']")
	private WebElement ValidateStartProgram_btn;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Start Program']")
	private WebElement startProgram_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Confirm')]")
	private WebElement confirm_Btn;

	// Edit Checkin program

	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-menu dropdown-menu-right show']/a[contains(text(),'Edit')]")
	private WebElement editCheckin_btn;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Edit Checkins Program')]")
	private WebElement editCheckin_lbl;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Basic Information')]")
	private WebElement basicInformation_lbl;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Templates')]") //"//h6[normalize-space()='Templates']")
	private WebElement Templates_lbl;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Custom Form')]")
	private WebElement customForm_rd;

	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[1]")
	private WebElement formName_txt;

	@FindBy(how = How.XPATH, using = "(//*[@id='dropdownBasic1'])[2]")
	private WebElement question_btn;

	@FindBy(how = How.XPATH, using = "//button[@id='dropdownBasic1']/following-sibling::div/a[contains(text(),'Text')]")
	private WebElement question_dropdown_text_item;

	// view

	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-menu dropdown-menu-right show']/a[contains(text(),'View')]") //i[@class='fa fa-eye mr-2']")
	private WebElement getBtn_view;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Add Checkin')]")
	private WebElement viewCheckinProgram_lbl;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'How often do you want your employees to Check-In?')]/following-sibling::input") //"(//select[@name='checkinPeriod'])/option[1]")
	private WebElement dd_verifycheckinperiod;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'The day on which to Check-In?')]/following-sibling::input") //"(//select[@name='checkinDay'])/option[1]")
	private WebElement dd_verifyCheckinDay;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Back')]") //"//button[contains(text(),'Close View')]")
	private WebElement back_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement next_btn;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Include Self Rating')]/preceding-sibling::label")
	private WebElement includeSelfRating_rd;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Add character limit')]/preceding-sibling::label")
	private WebElement addCharacterLimit_rd;

	@FindBy(how = How.ID, using = "custom")
	private WebElement verifycustomForm_rd;

	private String headerName = "(//div[@class='form-group w-100 mb-3'])";

	public void getCheckInLink() {
		try {
			log.info("moving to checkins");
			waitUntilElementToBeClickable(checkin_lnk);
			click(checkin_lnk);
			log.info("moved to checkins");
		} catch (Exception e) {
			log.error("error moving to checkin");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void validateCheckinProgramLabel() {
		try {
			log.info("validating checkin label");
			Assert.assertEquals(checkinprog_lbl.getText(), "Check-In",
					"checkin monitor page label is mismatching hence >>> Failed");
			log.info("validated checkin label");
		} catch (Exception e) {
			log.error("validated checkin label");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void addCheckin() {
		try {
			log.info("clicking on add checkin");
			click(addCheckin_btn);
			log.info("clicked on add checkin");
		} catch (Exception e) {
			log.error("error clicking on add checkin");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void validateforBasicInformation() {
		try {
			log.info("validating basic info label!!");
			Assert.assertEquals("1. Basic Information", lbl_BasicInformation.getText(),
					"After clicking on create button it is not navigated to Basic Information page");
			log.info("validated basic info label!!");
		} catch (Exception e) {
			log.error("error validating basic info label!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void validateCreateCheckinProgramPageHeading() {
		try {
			log.info("validating Create Checkin Program Page Heading");
			Assert.assertEquals("Add Checkin", lbl_CreateCheckinProgram.getText(),
					"After clicking on create button it is not navigated to Create CheckIn Program");
			log.info("validated Create Checkin Program Page Heading");
		} catch (Exception e) {
			log.error("error validating Create Checkin Program Page Heading");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void programName(String progName) {
		try {
			log.info("entering program name!!");
			writeText(programName_txt, progName + BasePage.getTimestamp());
			log.info("entered program name!!");
		} catch (Exception e) {
			log.error("error entering program name!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void startDate() {
		try {
			log.info("entering start date");
			setDateInDatePickerForStartDate(dp_startDateBtn, DateUtil.getCurrentYear(), DateUtil.getCurrentMonthName(),
					DateUtil.getCurrentDay());
			log.info("entered start date");
		} catch (Exception e) {
			log.error("error entering start date");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void endDate() {
		try {
			int extraYear;
			String Nextmonth;
			int day;
			log.info("entering end date!!");
			// year
			String Currentmonth = DateUtil.getCurrentMonthName();
			if (Currentmonth.equalsIgnoreCase("Dec")) {
				extraYear = DateUtil.getCurrentYearextraYear();
			} else {
				extraYear = DateUtil.getCurrentYear();
			}
			// month
			Nextmonth = DateUtil.getNextMonth();
			// day
			day = DateUtil.getCurrentDay();
			if (day > 28) {
				day = 28;
			}

			setDateInDatePickerForEndState(dp_endDateBtn, extraYear, Nextmonth, day);
			log.info("entered end date!!");
		} catch (Exception e) {
			log.error("error entering end date!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void whichDayOfTheWeekDoYouWantThemToCheckIn() {
		
			try {
				log.info("selecting checkin day");
				String Weekday_name = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(System.currentTimeMillis());

				log.info("selecting checkin day as "+Weekday_name);
				if (Weekday_name.equalsIgnoreCase("Monday")) {
					setValueInDropdownText(dd_checkinDay, "Monday");
				} else if (Weekday_name.equalsIgnoreCase("Tuesday")) {
					setValueInDropdownText(dd_checkinDay, "Tuesday");
				} else if (Weekday_name.equalsIgnoreCase("Wednesday")) {
					setValueInDropdownText(dd_checkinDay, "Wednesday");
				} else if (Weekday_name.equalsIgnoreCase("Thursday")) {
					setValueInDropdownText(dd_checkinDay, "Thursday");
				} else if (Weekday_name.equalsIgnoreCase("Friday")) {
					setValueInDropdownText(dd_checkinDay, "Friday");
				} else if (Weekday_name.equalsIgnoreCase("Saturday")) {
					setValueInDropdownText(dd_checkinDay, "Saturday");
				} else if (Weekday_name.equalsIgnoreCase("Sunday")) {
					setValueInDropdownText(dd_checkinDay, "Sunday");
				}

				log.info("selected checkin day");	
			} catch (Exception e) {
				log.error("error selecting checkin day");
				e.printStackTrace();
				Assert.fail();
			}
		
	}

	public void howOftenDoYouWantYourEmployeesToCheckIn(String value) {
		try {
			log.info("selecting how Often Do You Want Your Employees To CheckIn");
			setValueInDropdownText(dd_checkinPeriod, value);
			log.info("selected how Often Do You Want Your Employees To CheckIn");
		} catch (Exception e) {
			log.error("error selecting how Often Do You Want Your Employees To CheckIn");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnContinue() {
		try {log.info("clicking on continue button!!");
			click(continue_Btn);
			log.info("clicked on continue button!!");
		} catch (Exception e) {
			log.info("error clicking on continue button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	// Template

	public void selectTemplate() {
		try {
			log.info("selecting template!!");
//			if (!Outcomes_radio.isSelected()) {
//				click(Outcomes_radio);
//			} else {
//				log.info("Outcomes is already selected");
//			}
			setValueInDropdownText(template_sel,"Outcomes");
			log.info("selected template!!");
		} catch (Exception e) {
			log.error("error selecting template!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void validateforTemplate() {
		try {
			log.info("validating template!!");
			Assert.assertEquals(lbl_Template.getText(), "2. Templates");
			log.info("validated template!!");
		} catch (Exception e) {
			log.error("error validating template!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void includeSelfRating() {
		try {
			log.info("clicking on include self rating!!");
			if (!chk_includeSelfRating.isSelected()) {
				click(chk_includeSelfRatingLbl);
			} else {
				System.out.println("Include self rating is alreading selected");
			}
			log.info(" error clicking on include self rating!!");
		} catch (Exception e) {
			log.error("error clicking on include self rating!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void addCharacterLimit(String charLimit) {
		try {
			if (!chk_AddCharacterLimit.isSelected()) {
				waitUntilElementToBeClickable(chk_AddCharacterLimitLbl);
				log.info("clicking on add character limit!");
				click(chk_AddCharacterLimitLbl);
				log.info("clicked on add character limit!");
				waitFor(3000);
				log.info("adding character limit!!");
				writeText(txt_perEntry, charLimit);
				log.info("added character limit");
			} else {
				log.info("Add Character limit is already selected");
			}
		} catch (Exception e) {
			log.error("addCharacterLimit failed");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void editCharacterLimit(String charLimit) {
		try {
			log.info("editing character limit!!");
			waitUntilElementVisible(txt_perEntry);
			writeText(txt_perEntry, charLimit);
			log.info("edited character limit!!");
		} catch (Exception e) {
			log.error(" error editing character limit!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnSave() {
		try {
			log.info("clicking on save!!");
			waitUntilElementToBeClickable(save_Btn);
			click(save_Btn);
			waitUntilElementVisible(checkinprog_lbl);
			log.info("clicked on save!!");
		} catch (Exception e) {
			log.error("error clicking on save!!");
			e.printStackTrace();
			Assert.fail();
			
		}
	}

	public void clickOnEllipsis() {
		try {
			log.info("clicking on Ellipsis");
			waitFor(5000);
			click(lnk_ellipsis);
			log.info("clicked on Ellipsis");
		} catch (Exception e) {
			log.error("error clicking on Ellipsis");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnStart() {
		try {
			log.info("clicking on start!!");
			waitFor(2000);
			click(lnk_start);
			log.info("clicked on start!!");
		} catch (Exception e) {
			log.error("error clicking on include everyone in");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void ChooseWhichemployeesyouwanttostartprogram() {
		try {
			log.info("clicking on include everyone in");
			waitFor(2000);
			click(includeEveryone_radio);
			log.info("clicked on include everyone in");
		} catch (Exception e) {
			log.error("clicking on include everyone in");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnValidateStartProgram() {
		try {
			log.info("clicking On Validate and Start Program");
			waitFor(2000);
			waitUntilElementToBeClickable(ValidateStartProgram_btn);
			doHoverandClick(ValidateStartProgram_btn);
			log.info("clicked On Validate and Start Program");
		} catch (Exception e) {
			log.error("error clicking On Validate and Start Program");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	public void clickonStartProgram() {
		try {
			waitFor(2000);
			log.info("clicking on start program!!");
			waitUntilElementToBeClickable(startProgram_btn);
			doHoverandClick(startProgram_btn);
			log.info("clicked on start program!!");
			waitUntilElementToBeClickable(confirm_Btn);
			log.info("clicking on confirm!!");
			doHoverandClick(confirm_Btn);
			log.info("clicked on confirm!!");
			waitFor(2000);
		} catch (Exception e) {
			log.error("error starting the program");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickonEditProgram() {
		try {
			log.info("clicking on edit program!!");
			click(editCheckin_btn);
			log.info("clicked on edit program!!");
		} catch (Exception e) {
			log.error(" error clicking on edit program!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void validateEditCheckInProgram() {
		try {
			log.info("validating Edit CheckIn Program");
			Assert.assertEquals(editCheckin_lbl.getText(), "Edit Checkins Program",
					"Edit Checkins program label is not matching hence >>> Failed");
			log.info("validated Edit CheckIn Program");
		} catch (Exception e) {
			log.error(" error validating Edit CheckIn Program");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void ValidateBasicInformationPage() {
		try {
			log.info("validating basic info  label");
			Assert.assertEquals(basicInformation_lbl.getText(), "1. Basic Information",
					"1. Basic Information label is not matching hence >>> Failed");
			log.info("validated basic info  label");
		} catch (Exception e) {
			log.error("error validating basic info  label");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void ValidateTemplatePage() {
		try {
			log.info("validating template label!!");
			Assert.assertEquals(Templates_lbl.getText(), "Templates label is not matching hecne >>> Failed");
			log.info("validated template label!!");
		} catch (Exception e) {
			log.error("error validating template label!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnCustomForm() {
		try {
			log.info("selecting custom form!!");
			setValueInDropdownText(template_sel,"Custom Form");

			log.info("selected custom form!!");
		} catch (Exception e) {
			log.error("error clicking on custom form!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnTextBox1() {
		try {
			log.info("selecting custom form!!");
			setValueInDropdownText(template_responsetype_sel.get(0),"Text Box");

			log.info("selected custom form!!");
		} catch (Exception e) {
			log.error("error clicking on custom form!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnTextBox2() {
		try {
			log.info("selecting text box!!");
			setValueInDropdownText(template_responsetype_sel.get(1),"Text Box");

			log.info("selected text box!!");
		} catch (Exception e) {
			log.error("error clicking on text box!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnTextBox3() {
		try {
			log.info("selecting custom form!!");
			setValueInDropdownText(template_responsetype_sel.get(2),"Text Box");

			log.info("selected custom form!!");
		} catch (Exception e) {
			log.error("error clicking on custom form!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnAddCustomFormField2() {
		try {
			click(Template_field_add.get(0));
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnAddCustomFormField3() {
		try {
			click(Template_field_add.get(1));
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}


	public void addFormName(String formname) {
		try {
			log.info("adding form name!!");
			writeText(formName_txt, formname);
			log.info("added form name!!");
		} catch (Exception e) {
			log.error("error adding form name!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

//	public void addHeaderName(String headername, int questionNo) {
//		try {
//			log.info("clicking on question button!!");
//			click(question_btn);
//			log.info("clicked on question button!!");
//			waitFor(1000);
//			waitUntilElementToBeClickable(question_dropdown_text_item);
//			log.info("clicking on question dropdown!!");
//			click(question_dropdown_text_item);
//			log.info("clicked on question dropdown!!");
//			waitFor(1000);
//			WebElement header_txt = webDriver.findElement(
//					By.xpath("(//label[contains(text(),'Question')]/..)[" + Integer.toString(questionNo) + "]//input"));
//			waitUntilElementVisible(header_txt);
//			log.info("adding header name!!");
//			writeText(header_txt, headername);
//			log.info("added header name!!");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			Assert.fail();
//		}
//	}

    public void addHeaderName(String headername, int fieldIndex) {
		try {
			writeText(Template_field.get(fieldIndex-1), headername);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}



	// view

	public void ClickOnView() {
		try {
			log.info("clicking on view button!!");
			click(getBtn_view);
			log.info("clicked on view button!!");
		} catch (Exception e) {
			log.error("error clicking on view button!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void validateViewCheckinProgram() {
		try {
			log.info("verifying view checkin program label!!");
			Assert.assertEquals(viewCheckinProgram_lbl.getText(), "Add Checkin");
			log.info("verified view checkin program label!!");
		} catch (Exception e) {
			log.error("error verifying view checkin program label!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyProgramName(String programName) {
		try {
			log.info("verifying program name!!");
			waitForMessage(programName);
			Assert.assertTrue(webDriver.findElement(By.xpath("//label[contains(text(),'Program name')]/following-sibling::input"))
							.getAttribute("value").contains(programName),
					"Expected: "+programName + " not in Actual: "
							+webDriver.findElement(By.xpath("//label[contains(text(),'Program name')]/following-sibling::input")).getAttribute("value"));
			log.info("verified program name!!");
		} catch (Exception e) {
			log.error("error verifying program name!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyHowOftenDoYouWantYourEmployeesToCheckIn(String checkinperiod) {
		try {
			log.info("verifying How Often Do You Want Your Employees To CheckIn");
			Assert.assertEquals(dd_verifycheckinperiod.getAttribute("value").trim(), checkinperiod);
			log.info("verified How Often Do You Want Your Employees To CheckIn");
		} catch (Exception e) {
			log.error("error verifying How Often Do You Want Your Employees To CheckIn");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyWhichDayOfTheWeekDoYouWantThemToCheckIn(String checkInDay) {
		try {
			log.info("verifying Which Day Of The Week Do You Want Them To CheckIn!!");
			Assert.assertEquals(dd_verifyCheckinDay.getAttribute("value").trim(), checkInDay,
					"checkinDay drop down value is mismatching hence >>> Failed");
			log.info("verified Which Day Of The Week Do You Want Them To CheckIn!!");
		} catch (Exception e) {
			log.error("error verifying Which Day Of The Week Do You Want Them To CheckIn!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnBack() {
		try {
			log.info("clicking on back button!!");
			scroll(webDriver, "down");
			click(back_btn);
			log.info("clicked on close view!!");
		} catch (Exception e) {
			log.error("error clicking on back button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnNext() {
		try {
			log.info("clicking on next button!!");
			click(next_btn);
			log.info("clicked on next button!!");
		} catch (Exception e) {
			log.error("error clicking on next button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnTemplates() {
		try {
			log.info("clicking on Templates!!");
			click(Templates_lbl);
			log.info("clicked on next Templates!!");
		} catch (Exception e) {
			log.error("error clicking on next Templates!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void viewIncludeSelfRating() {
		try {
			log.info("verifying include self rating is selected!!");
			Assert.assertTrue(includeSelfRating_rd.isSelected(), "include self rating is unchecked hence >>> Failed");
			log.info("verified include self rating is selected!!");
		} catch (Exception e) {
			log.error("error verifying include self rating is selected!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void viewAddCharacterLimit() {
		try {
			log.info("verifying add character limit is selected!!");
			Assert.assertTrue(addCharacterLimit_rd.isSelected(), "add Character Limit is unchecked hence >>> Failed");
			log.info("verified add character limit is selected!!");
		} catch (Exception e) {
			log.error("error verifying add character limit is selected!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyCharacterLimit(String cherLmt) {
		try {
			log.info("verifying character limit: " + cherLmt);
			Assert.assertEquals(txt_perEntry.getAttribute("value"), cherLmt);
			log.info("verified character limit: " + cherLmt);
		} catch (Exception e) {
			log.error("error verifying character limit: " + cherLmt);
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyFormName(String formName) {
		try {
			log.info("verifying form name: " + formName);
			Assert.assertEquals(formName_txt.getAttribute("value"), formName);
			log.info("verified form name: " + formName);

		} catch (Exception e) {
			log.error(" error verifying form name: " + formName);
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyHeaderName(int count, String headername) {
		// WebElement
		// header=webDriver.findElement(By.xpath(headerName+"["+count+"]"+"//label"));
		try {
			log.info("verifying header name!!");
//			WebElement header = webDriver
//					.findElement(By.xpath("(//label[contains(text(),'Question')]/..)[" + count + "]//input"));
			String actualHeader = Template_field.get(count-1).getAttribute("value").trim();
			Assert.assertEquals(actualHeader,headername);
			log.info("verified header name!!");
		} catch (Exception e) {
			log.error("error verifying header name!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyIsCustomFormSelected() {
		try {
			log.info("verifying custom is selected!!");
			Assert.assertTrue(getValueInDropdown(template_sel).trim().equals("Custom Form"),
					"Custom Form not selected hence >> Failed");
			log.info("verified custom is selected!!");
		} catch (Exception e) {
			log.error("error verifying custom is selected!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

}
