package pageObjects;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.apache.log4j.Logger;
import helper.LoggerHelper;

public class CalibrationProgamPage extends BasePage {
	public CalibrationProgamPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Business Ranking Unit ')]")
	private WebElement BusinessRankingUnit;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create Moderation')]")
	private WebElement CreateModeration;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Create Moderation')]")
	private WebElement Moderationlabel;

	@FindBy(how = How.XPATH, using = "(//h6[contains(text(),'Business Unit')])[1]")
	private WebElement BusinessUnitLabel;

	@FindBy(how = How.XPATH, using = "//input[@id ='name']")
	private WebElement Name;

	@FindBy(how = How.XPATH, using = "//select[@id='type']")
	private WebElement BusinessUnitType;

	@FindBy(how = How.XPATH, using = "//input[@id='ppd']")
	private WebElement ppdcordinator;

	@FindBy(how = How.XPATH, using = "//input[@placeholder ='Search'][1]")
	private WebElement ppdSearch;

	@FindBy(how = How.XPATH, using = "//div[@class= 'dropdown-menu creatkpi p-0 show']//a")
	private List<WebElement> ppdcordinatorlist;

	@FindBy(how = How.XPATH, using = "//input[@id='buh']")
	private WebElement BusinessUnit;

	@FindBy(how = How.XPATH, using = "(//input[@placeholder ='Search'])[2]")
	private WebElement BusinessUnitSearch;

	@FindBy(how = How.XPATH, using = "//div[@class= 'dropdown-menu creatkpi p-0 show']//a")
	private List<WebElement> BusinessUnitList;

	@FindBy(how = How.XPATH, using = "//input[@id='sdate']")
	private WebElement StartDate;

	@FindBy(how = How.XPATH, using = "//input[@id='edate']")
	private WebElement EndDate;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue')]")
	private WebElement Continuebutton;

	// Score source page

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Score Source')]")
	private WebElement Scoresourcelabel;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Upload Competency score manually')]")
	private WebElement Radiobuttonuploadcompetency;

	// Rating level and curve page

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Rating Levels and Curve')]")
	private WebElement Ratinglevelandcurvelabel;

	@FindBy(how = How.XPATH, using = "//tr//td[3]//input")
	private List<WebElement> Scoredesc;

	@FindBy(how = How.XPATH, using = "//tr//td[4]//input")
	private List<WebElement> Score;

	// @FindBy(how=How.XPATH,using ="(//input[@placeholder='Score'])[1]")
	// private WebElement Score1;
	//
	// @FindBy(how=How.XPATH,using ="(//input[@placeholder='Score'])[3]")
	// private WebElement Score2;
	//
	// @FindBy(how=How.XPATH,using ="(//input[@placeholder='Score'])[5]")
	// private WebElement Score3;
	//
	// @FindBy(how=How.XPATH,using ="(//input[@placeholder='Score'])[7]")
	// private WebElement Score4;
	//
	// @FindBy(how=How.XPATH,using ="(//input[@placeholder='Score'])[9]")
	// private WebElement Score5;

	// Score Configuration

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Score Configurations')]")
	private WebElement ScoreConfigurationlabel;

	@FindBy(how = How.XPATH, using = "//tr//td[4]//input")//"//tr//td[3]//input")
	private List<WebElement> Scoreconfig;

	// Business Unit Configuration

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Business Unit Configuration')]")
	private WebElement BusinessUnitConfiguration;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Contribution from 360 score')]/../input")
	private WebElement CompetencyScore;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'% Employees for whom 360 score review should be completed')]/../input")
	private WebElement Employeesforcompetencyscore;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'360 Feedback Score')]/../input")
	private WebElement FeedbackScore;

	// BusinessUnitProcess

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Business Unit Process')]")
	private WebElement BusinessUnitProcesslabel;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Calibration process')]")
	private WebElement Calibrationprocesslabel;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Add stage')]")
	private WebElement AddStage;

	@FindBy(how = How.XPATH, using = "(//input[@id='name'])[1]")
	private WebElement Enterlabel;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Business Unit rating')]")
	private WebElement BusinessUnitratinglabel;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Manually updated for each business unit')]/../input[@id='name']")
	private WebElement ManuallyUpdatedBusinessUnit;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit ')]")
	private WebElement SubmitButton;

	// StartCaliberation

	@FindBy(how = How.XPATH, using = "(//i[@id='dropdownMenuButton'])[1]")
	private WebElement Actionbutton;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Start')]")
	private WebElement Startbutton;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Trigger Busniess Unit')]")
	private WebElement TriggerBusinessUnitlableValidation;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Trigger ')]")
	private WebElement Triggerbutton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Validate and Start')]")
	private WebElement ValidateandStartbutton;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),' Start Moderation ')]")
	private WebElement ValidateStartModerationlabel;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Start Program')]")
	private WebElement StartProgrambutton;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Start Program')]")
	private WebElement ValidateStartProgramlabel;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'OK, Confirm')]")
	private WebElement OKConfirm;

	// UploadDatacompetency

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Trigger Business Unit')]")
	private WebElement ValidateTriggerBusinessUnitlabel;

	@FindBy(how = How.XPATH, using = "//i[@ngbtooltip='Upload Data']")
	private WebElement UploadDatabutton;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Upload Data')]")
	private WebElement ValidateUploaddatalabel;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Download Excel Template')]")
	private WebElement DownloadExcel;

	@FindBy(how = How.ID, using = "files") // @FindBy(how=How.XPATH,using="//button[contains(text(),'Attach
											// document')]/../input")
	private WebElement AttachDocument;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Upload Score Data')]")
	private WebElement UploadScoredatabutton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Refresh')]")
	private WebElement Refreshbutton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Close')]")
	private WebElement Closebutton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Start Calibration')]")
	private WebElement StartCaliberationbutton;

	// CaliberationMeeting

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Calibration Meeting')]")
	private WebElement CaliberationMeetingbutton;

	@FindBy(how = How.XPATH, using = "(//p[contains(text(),'Pending Meetings')])[1]") // 2
	private WebElement PendingMeetinglabel;

	@FindBy(how = How.XPATH, using = "//select[@id='period']")
	private WebElement Period;

	@FindBy(how = How.XPATH, using = "(//div[@class='media d-flex align-items-start'])[1]")
	private WebElement Meeting1;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save Meeting Details')]")
	private WebElement SaveMeetingDetails;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Calibration Meeting')]")
	private WebElement CaliberationMeetinglabel;

	@FindBy(how = How.XPATH, using = "(//span[@class='ngb-comments'])[1]")
	private WebElement clickRating;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Update Scores')]")
	private WebElement UpdateScorelabel;

	@FindBy(how = How.XPATH, using = "//select[@id='rating']")
	private WebElement ChangeRating;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Update Scores')]")
	private WebElement ClickUpdateScore;

	@FindBy(how = How.XPATH, using = "//span[text()='Close Meeting']/parent::button")
	private WebElement ClickCloseMeeting;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Close Meeting')]")
	private WebElement ClickFinalCloseMeeting;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),' Moderation Meeting')]")
	private WebElement ModerationMeetingpage;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Upload KPI score manually')]")
	private WebElement Radiobuttonuploadkpi;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Contribution from KPI score')]/../input")
	private WebElement kpiScorekpi;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'% Employees for whom KPI Score Review should be completed')]/../input")
	private WebElement Employeesforkpiscore;

	@FindBy(how = How.XPATH, using = "(//label[contains(text(),'KPI Score')])[2]/../input")
	private WebElement FeedbackScorekpi;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Upload KPI score and Competency score manually')]")
	private WebElement Radiobuttonuploadkpiandcomp;

	@FindBy(how = How.XPATH, using = "//tr//td[4]//input")
	private List<WebElement> Scoreconfig1;

	// FROM SYSTEM

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'KPI score and Competency score from system')]")
	private WebElement Radiobuttonuploadkpiandcompsystem;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary ml-2']")
	private WebElement Continue2;

	@FindBy(how = How.XPATH, using = "(//th//div//input[@type='checkbox'])[1]")
	private WebElement checkbox1;

	@FindBy(how = How.XPATH, using = "//select[@id='grp_kpi']//option[contains(text(),'Eligible Employees')]")
	private WebElement EligibleEmployees11;

	@FindBy(how = How.XPATH, using = "//select[@id='grp_kpi']//option[contains(text(),'Anomalies')]")
	private WebElement Anamolies1;

	public void clickCaliberationLink() {
		try {
			log.info("clicking on caliberation");
			waitFor(3000);
			log.info("Waiting for BusinessRankingUnit");
			waitUntilElementToBeClickable(BusinessRankingUnit);
			log.info("Clicking BusinessRankingUnit");
			click(BusinessRankingUnit);
			log.info("clicked on caliberation");
		} catch (Exception e) {
			log.info("error clicking on caliberation");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickModerationLink() {
		try {
			log.info("clicking on moderation!!");
			waitFor(3000);
			log.info("Waiting for CreateModeration");
			waitUntilElementToBeClickable(CreateModeration);
			// waitUntilElementToBeClickable(CreateModeration);
			log.info("Clicking CreateModeration");
			click(CreateModeration);
			log.info("clicked on moderation");
		} catch (Exception e) {
			log.error("error clicking on moderation!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public boolean validateModerationLabel() {
		try {
			log.info("valdating moderation label!!");
			// Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
			// monitor program page label is mismatching hence >>> Failed");
			if (Moderationlabel.isDisplayed())
				return true;
			else
				return false;

		} catch (Exception e) {
			log.error("error validating moderation label!!");
			Assert.fail();
			return false;
		}
	}

	public boolean validateBusinessUnitLabel() {
		try {
			log.info("validating business unit label!!");
			// Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
			// monitor program page label is mismatching hence >>> Failed");
			if (BusinessUnitLabel.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			log.error("error validating business unit label!!");
			Assert.fail();
			return false;
		}
	}

	public void enterName(String ProgramName) {

		try {
			log.info("entering name!!");
			writeText(Name, ProgramName);
			log.info("entered name!!");
		} catch (Exception e) {
			log.error("error entering name!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void Selectfromthedropdowntype() {

		try {
			log.info("select busimess unit");
			log.info("Waiting for BusinessUnitType");
			waitUntilElementToBeClickable(BusinessUnitType);
			setValueInDropdownByValue(BusinessUnitType, "Management");
			log.info("selecting business unit!!");
		} catch (Exception e) {
			log.error("error selecting business unit!!");
			e.printStackTrace();
			Assert.fail();
			
		
		}

	}

	public void Selectvalueppd() {
		try {
			log.info("selecting ppd unit!!");
			log.info("Clicking ppdcordinator");
			click(ppdcordinator);
			// waitFor(3000);
			// waitUntilElementToBeClickable(ppdcordinator);
			log.info("Clicking ppdSearch");
			click(ppdSearch);
			//typeTextToGetDropdown(ppdcordinator, "EMP40", ppdcordinatorlist);
			typeTextToGetDropdown(ppdSearch, "EMP40", ppdcordinatorlist);
//			writeText(ppdSearch, "EMP40");
			waitFor(2000);
			for (WebElement element:ppdcordinatorlist) {
				if (element.getText().trim().equalsIgnoreCase("EMP40")) {
					click(element);
					waitFor(1000);
					break;
				}
			}
			log.info("selected ppd unit!!");
		} catch (Exception e) {
			log.error("error selecting ppd unit!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void SelectvalueBusinessUnit() {
		try {
			log.info("selecting business unit value");
			log.info("Clicking BusinessUnit");
			click(BusinessUnit);
			// waitFor(3000);
			log.info("Clicking BusinessUnitSearch");
			click(BusinessUnitSearch);
			// waitUntilElementToBeClickable(ppdcordinator);
			// typeTextToGetDropdown( BusinessUnit,"EMP100",BusinessUnitList);
			typeTextToGetDropdown(BusinessUnitSearch, "EMP100", BusinessUnitList);
			log.info("selected business unit value!!");
		} catch (Exception e) {
			log.error("error selecting business unit value");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void StartDate() {
		try {log.info("selecting start date!!");
			setDateInDatePicker(StartDate, 2018, "Jan", 1);
			log.info("selected start date!!");
		} catch (Exception e) {
			log.error("error selecting start date!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void EndDate() {
		try {
			log.info("selecting end date!!");
			setDateInDatePicker(EndDate, 2018, "Dec", 31);
			log.info("selected end date!!");
		} catch (Exception e) {
			log.error("selecting end date!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void Clickoncontinuebutton1() {
		try {
			log.info("clicking on continue button!!");
			waitFor(5000);
			log.info("Clicking Continuebutton");
			click(Continuebutton);
			log.info("clicked on continue button!!");

		} catch (Exception e) {
			log.error("error clicking on continue button!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public boolean validateScoresourceLabel() {
		try {
			log.info("validating source label!!");
			// Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
			// monitor program page label is mismatching hence >>> Failed");
			if (Scoresourcelabel.isDisplayed()) {
				log.info("validated source label!!");
				return true;}
			else
				return false;
		} catch (Exception e) {
			log.error("error validating source label!!");
			Assert.fail();
			return false;
		}
	}

	public void clickRadiobutton2() {
		try {
			log.info("clicking on radio button 2!!");
			// waitUntilElementToBeClickable(Radiobutton2);
			waitFor(3000);
			log.info("Clicking Radiobuttonuploadcompetency");
			click(Radiobuttonuploadcompetency);
			log.info("clicked on radio button 2!!");
		} catch (Exception e) {
			log.error("error clicking on radio button 2!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void Clickoncontinuebutton2() {
		try {
			log.info("clicking on continue button2!!");
			log.info("Clicking Continuebutton");
			click(Continuebutton);
			waitFor(2000);
			log.info("clicked on continue button2!!");

		} catch (Exception e) {
			log.error("error clicking on continue button2!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public boolean validateRatinglevelandcurveLabel() {
		try {
			log.info("validating rating level and curve label!!");
			// Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
			// monitor program page label is mismatching hence >>> Failed");
			if (Ratinglevelandcurvelabel.isDisplayed()) {
				log.info("validated rating level and curve label!!");
				return true;}
			else
				return false;
		} catch (Exception e) {
			log.error("error validating rating level and curve label!!");
			Assert.fail();
			return false;
		}
	}

	// public void ScoreMethod1()
	// {
	// click(Score1);
	// waitFor(3000);
	// Score1.sendKeys("5");
	// }
	//
	// public void ScoreMethod2()
	// {
	// click(Score2);
	// waitFor(3000);
	// Score2.sendKeys("4");
	// }
	//
	// public void ScoreMethod3()
	// {
	// click(Score3);
	// waitFor(3000);
	// Score3.sendKeys("3");
	// }
	//
	//
	// public void ScoreMethod4()
	// {
	// click(Score4);
	// waitFor(3000);
	// Score4.sendKeys("2");
	// }
	//
	// public void ScoreMethod5()
	// {
	// click(Score5);
	// waitFor(3000);
	// Score5.sendKeys("1");
	// }

	public void ScoreMethod(String value, int i) {

		try {
			log.info("writing score!!");
			System.out.println(Score.get(i - 1).getText());
			writeText(Scoredesc.get(i - 1), value);
			writeText(Score.get(i - 1), value);
			log.info("written score!!");
		} catch (Exception e) {
			log.error("error writing score!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void Clickoncontinuebutton3() {
		try {
			log.info("clicking on continue button3!!");
			waitFor(3000);
			clickOnElementByJs(Continuebutton);
			log.info("clicked on continue button3!!");

		} catch (Exception e) {
			log.error("error clicking on continue button3!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public boolean validateScoreConfigurationlabel() {
		try {
			log.info("validating score configuration label!!");
			// Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
			// monitor program page label is mismatching hence >>> Failed");
			waitFor(3000);
			waitUntilElementToBeClickable(ScoreConfigurationlabel);
			if (ScoreConfigurationlabel.isDisplayed()) {
				log.info("validating score configuration label!!");
				return true;}
			else
				return false;
		} catch (Exception e) {
			log.error("error validating score configuration label!!");
			Assert.fail();
			return false;
		}
	}

	public void validProgramnameAndClickCheck(String programName) {
		try {
			log.info("validating program name!!");
			WebElement Name = webDriver.findElement(By.xpath("//div[contains(text(),'" + programName + "')]"));
			Assert.assertTrue(Name.getText().equalsIgnoreCase(programName), "program name not found"
					+ "Expected: "+programName+", Actual: "+Name.getText());
			log.info("validated program name!!");
			log.info("clicking on check box!!");
			WebElement checkboxName = webDriver
					.findElement(By.xpath("//div[contains(text(),'" + programName + "')]/..//input"));
			clickOnElementByJs(checkboxName);
			log.info("clicked on check box!!");
			waitFor(2000);
		} catch (Exception e) {
			log.error("validProgramnameAndClickCheck failed!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void validProgramnameAndClickCheck1() {
		try {
			log.info("Entered validProgramnameAndClickCheck1");
			WebElement Name = webDriver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
			WebElement Name1 = webDriver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
			// Assert.assertTrue(Name.getText().equalsIgnoreCase(programName), "program name
			// not found");
			// WebElement
			// checkboxName=webDriver.findElement(By.xpath("//p[contains(text(),'"+programName+"')]"));
			log.info("clicking on Name");
			clickOnElementByJs(Name);
			log.info("clicking on Name1");
			clickOnElementByJs(Name1);
			waitFor(2000);
			log.info("Executed validProgramnameAndClickCheck1 Successfully");
		} catch (Exception e) {
			log.error("Executed validProgramnameAndClickCheck1 Not Successfully");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickAnamolycheck() {
		try {
			log.info("clicking in anamoly checkbox!!");
			WebElement checkboxName = webDriver.findElement(By.xpath("//i[@class='far fa-check-square']"));
			clickOnElementByJs(checkboxName);
			waitFor(2000);
			log.info("clicked in anamoly checkbox!!");
		} catch (Exception e) {
			log.error("error clicking in anamoly checkbox!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void EnterScoreConfigurations(String value, int i) {
		try {
			log.info("entering score configfuration!!");
			waitFor(1000);
			System.out.println(Scoreconfig.get(i - 1).getText());
			writeText(Scoreconfig.get(i - 1), value);
			log.info("entered score configfuration!!");
		} catch (Exception e) {
			log.error("error entering score configfuration!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void EnterScoreConfigurations2(String value, int i) {
		try {
			log.info("entering score configuration!!");
			waitFor(1000);
			System.out.println(Scoreconfig1.get(i - 1).getText());
			writeText(Scoreconfig1.get(i - 1), value);
			log.info("entered score configuration!!");
		} catch (Exception e) {
			log.error("error entering score configuration!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void Clickoncontinuebutton4() {
		try {
			log.info("clicking on continue button4");
			waitFor(4000);
			clickOnElementByJs(Continuebutton);
			waitFor(2000);
			log.info("clicked on continue button4");

		} catch (Exception e) {
			log.error("error clicking on continue button4");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public boolean validateBusinessUnitConfigurationlabel() {
		try {
			// Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
			// monitor program page label is mismatching hence >>> Failed");
			log.info("validating business unit config label!!");
			waitFor(3000);
			waitUntilElementToBeClickable(BusinessUnitConfiguration);
			if (BusinessUnitConfiguration.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			log.error("error validating business unit config label!!");
			Assert.fail();
			return false;
		}
	}

	// public void Contributionfromcompetencyscore(int i)
	// {
	// try
	// {
	// click(CompetencyScore);
	// writeText(CompetencyScore, "100");
	// }
	// catch(Exception e)
	// {
	// Assert.fail();
	//
	// }
	//
	// }

	public void Employeesforcompetencyscoreshow() {
		try {
			log.info("entering competency score for employee!!");
			click(Employeesforcompetencyscore);
			writeText(Employeesforcompetencyscore, "1");
			log.info("entered competency score for employee!!");
		} catch (Exception e) {
			log.error("error entering competency score for employee!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void FeedbackScoreshow() {
		try {
			log.info("entering feedback score!!");
			click(FeedbackScore);
			writeText(FeedbackScore, "OK");
			log.info("entered feedback score!!");
		} catch (Exception e) {
			log.error("error entering feedback score!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void Clickoncontinuebutton5() {
		try {
			log.info("clicking on continue button5!!");
			click(Continuebutton);
			log.info("clicked on continue button5!!");

		} catch (Exception e) {
			log.error("error clicking on continue button5!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public boolean validateBusinessUnitProcesslabel() {
		try {
			// Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
			// monitor program page label is mismatching hence >>> Failed");
			log.info("validating Business Unit Process label");
			log.info("Waiting for BusinessUnitProcesslabel");
			waitUntilElementVisible(BusinessUnitProcesslabel);
			waitFor(5000);
			if (BusinessUnitProcesslabel.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			log.error("error validating Business Unit Process label");
			Assert.fail();
			return false;
		}
	}

	public void AddStageMethod() {
		try {
			log.info("clicking on add stage!!");
			click(AddStage);
			log.info("clicked on add stage!!");
		}

		catch (Exception e) {
			log.error("error clicking on add stage!!");
			e.printStackTrace();
			Assert.fail();

		}

	}

	public void Addlablenames() {
		try {
			log.info("clicking on enter label!!");
			click(Enterlabel);
			log.info("clicked on enter label!!");
			log.info("entering label name!!");
			writeText(Enterlabel, "Stage1");
			log.info("entered label name!!");
			waitFor(1000);
			log.info("clicking on add stage");
			click(AddStage);
			log.info("clicked on add stage");
		} catch (Exception e) {
			log.error("error adding label name!!");
			e.printStackTrace();
			Assert.fail();

		}

	}

	public boolean validateBusinessUnitRatinglabel() {
		try {
			// Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
			// monitor program page label is mismatching hence >>> Failed");
			log.info("validating Business Unit Rating label");
			waitFor(3000);
			if (BusinessUnitratinglabel.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			log.error("error validating Business Unit Rating label");
			Assert.fail();
			return false;
		}
	}

	public void BusinessUnitRatingmethod() {
		try {
			log.info("entering business unit rating method!!");
			click(ManuallyUpdatedBusinessUnit);
			writeText(ManuallyUpdatedBusinessUnit, "3");
			log.info("entered business unit rating method!!");
		} catch (Exception e) {
			log.error("error entering business unit rating method!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void SubmitMethod() {
		try {
			log.info("clicking on submit!!");
			click(SubmitButton);
			waitForMessage("Moderation Created Successfully");
			log.info("clicked on submit!!");

		} catch (Exception e) {
			log.error("error clicking on submit!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	// StartProgram

	public void ClickAction() {
		try {
			log.info("clicking on action!!");
			waitFor(2000);
			click(Actionbutton);
			log.info("clicked on action!!");

		} catch (Exception e) {
			log.error("error clicking on action!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void ClickStart() {
		try {
			log.info("clicking on start button!!");
			waitFor(1000);
			click(Startbutton);
			waitFor(3000);
			log.info("clicked on start button!!");

		} catch (Exception e) {
			log.error("error clicking on start button!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public boolean validateTriggerBusinessUnitLabelmethod() {
		try {
			// Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
			// monitor program page label is mismatching hence >>> Failed");
			log.info("validating Trigger Business Unit Label method");
			if (TriggerBusinessUnitlableValidation.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			log.error("error validating Trigger Business Unit Label method");
			Assert.fail();
			return false;
		}
	}

	public void ClickTrigger() {
		try {
			log.info("clicking on trigger button!!");
			click(Triggerbutton);
			log.info("clicked on trigger button!!");

		} catch (Exception e) {
			log.error("error clicking on trigger button!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void ClickValidateandStart() {
		try {
			log.info("clicking on validate and start!!");
			click(ValidateandStartbutton);
			log.info("clicked on validate and start!!");

		} catch (Exception e) {
			log.error("error clicking on validate and start!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public boolean validateStartModerationLabelmethod() {
		try {
			log.info("validating Start Moderation Label");
			// Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
			// monitor program page label is mismatching hence >>> Failed");
			if (ValidateStartModerationlabel.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			log.error("error validating Start Moderation Label");
			Assert.fail();
			return false;
		}
	}

	public void ClickStartProgramMethod() {
		try {
			log.info("clicking on start program!!!");
			click(StartProgrambutton);
			log.info("clicked on start program!!!");

		} catch (Exception e) {
			log.error("error clicking on start program!!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public boolean validateStartProgramLabelmethod() {
		try {
			log.info("validating Start Program Label");
			// Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
			// monitor program page label is mismatching hence >>> Failed");
			if (ValidateStartProgramlabel.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			log.info("error validating Start Program Label");
			Assert.fail();
			return false;
		}
	}

	public void ClickOKConfirmMethod() {
		try {
			log.info("clicking on OK confirm");
			click(OKConfirm);
			log.info("clicked on OK confirm");
		} catch (Exception e) {
			log.error("error clicking on OK confirm");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public boolean validateTriggerBusinessUnitlabelmethod() {
		try {
			log.info("validating Trigger Business Unit label");
			// Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
			// monitor program page label is mismatching hence >>> Failed");
			if (ValidateTriggerBusinessUnitlabel.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			log.error("error validating Trigger Business Unit label");
			Assert.fail();
			return false;
		}
	}

	public void ClickUploaddataMethod() {
		try {
			log.info("clicking on upload data!!");
			waitFor(3000);
			// waitUntilElementToBeClickable(UploadDatabutton);
			click(UploadDatabutton);
			log.info("clicked on upload data!!");

		} catch (Exception e) {
			log.error("error clicking on upload data!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public boolean validateUploaddatalabelmethod() {
		try {
			log.info("validating Upload data label");
			// Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
			// monitor program page label is mismatching hence >>> Failed");
			if (ValidateUploaddatalabel.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			log.error("error validating Upload data label");
			Assert.fail();
			return false;
		}
	}

	public void ClickDownloadExcelMethod(String Download) {
		try {
			log.info("clicking on download excel button!!");
			waitFor(3000);
			// waitUntilElementToBeClickable(UploadDatabutton);
			click(DownloadExcel);
			log.info("clicked on download excel button!!");
		} catch (Exception e) {
			log.error("error clicking on download excel button!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void ClickUploadExcelMethod(String Upload) {
		try {
			log.info("clicking on upload excel button!!");
			// click(AttachDocument);
			String abspath1 = new File(Upload).getAbsolutePath();
			// UploadFiles(abspath1);
			AttachDocument.sendKeys(abspath1);
			click(UploadScoredatabutton);
			log.info("clicked on upload excel button!!");
			waitFor(3000);
		} catch (Exception e) {
			log.error("error clicking on upload excel button!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void ClickUploadScoredataMethod() {
		try {
			log.info("clicking on upload score data button!!");
			waitFor(3000);
			// waitUntilElementToBeClickable(UploadDatabutton);
			click(UploadScoredatabutton);
			log.info("clicked on upload score data button!!");

		} catch (Exception e) {
			log.error("error clicking on upload score data button!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void ClickRefreshMethod() {
		try {
			log.info("clicking on refresh");
			// waitUntilElementToBeClickable(UploadDatabutton);
			waitFor(3000);
			click(Refreshbutton);
			log.info("clicked on refresh");

		} catch (Exception e) {
			log.error("error clicking on refresh");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void ClickCloseMethod() {
		try {
			log.info("clicking on close!!");
			// waitUntilElementToBeClickable(UploadDatabutton);
			click(Closebutton);
			log.info("clicked on close!!");

		} catch (Exception e) {
			log.error("error clicking on close!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void ClickStartCaliberationMethod() {
		try {
			log.info("clicking on start caliberation!!");
			waitFor(2000);
			// waitUntilElementToBeClickable(UploadDatabutton);
			click(StartCaliberationbutton);
			log.info("clicked on start caliberation!!");

		} catch (Exception e) {
			log.error("error clicking on start caliberation!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	// CaliberationMeeting

	public void ClickCaliberationMeetingMethod() {
		try {
			log.info("clicking on caliberation meeting");
			// waitUntilElementToBeClickable(UploadDatabutton);
			click(CaliberationMeetingbutton);
			log.info("clicked on caliberation meeting");

		} catch (Exception e) {
			log.error("error clicking on caliberation meeting");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public boolean validatePendingMeetinglabelmethod() {
		try {
			log.info("validating Pending Meeting label");
			// Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
			// monitor program page label is mismatching hence >>> Failed");
			log.info("Waiting for PendingMeetinglabel");
			waitUntilElementVisible(PendingMeetinglabel);
			if (PendingMeetinglabel.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			log.error("errror validating Pending Meeting label");
			Assert.fail();
			return false;
		}
	}

	public void SelectPeriodfromthedropdowntype() {
		try {
			log.info("selecting period!!");
			log.info("Waiting for Period");
			waitUntilElementToBeClickable(Period);
			log.info("Selecting value in Period dropdown: "+"2018");
			setValueInDropdownByValue(Period, "2018");
			log.info("selected period!!");
		} catch (Exception e) {
			log.error("error selecting period!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void ClickStartMeetingbutton() {
		try {
			log.info("clicking on start meeting button!!");
			// waitUntilElementToBeClickable(UploadDatabutton);
			log.info("Clicking Meeting1");
			click(Meeting1);
			log.info("clicked on start meeting button!!");

		} catch (Exception e) {
			log.error("error clicking on start meeting button!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void ClickSaveMeetingdetailbutton() {
		try {
			log.info("clicking on save meeting details");
			// waitUntilElementToBeClickable(UploadDatabutton);
			log.info("Clicking SaveMeetingDetails");
			click(SaveMeetingDetails);
			log.info("clicked on save meeting details");

		} catch (Exception e) {
			log.error("error clicking on save meeting details");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public boolean validateCaliberationMeetinglabelmethod() {
		try {
			log.info("validating Caliberation Meeting label");
			// Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
			// monitor program page label is mismatching hence >>> Failed");
			if (CaliberationMeetinglabel.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			log.error("error validating Caliberation Meeting label");
			Assert.fail();
			return false;
		}
	}

	public void ClickRatingbutton() {
		try {
			log.info("clicking on rating!!");
			waitUntilElementToBeClickable(clickRating);
			log.info("Clicking clickRating");
			click(clickRating);
			log.info("clicked on rating!!");

		} catch (Exception e) {
			log.error("error clicking on rating!!");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public boolean validateUpdateScorelabelmethod() {
		try {
			log.info("validating Update Score label");
			// Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
			// monitor program page label is mismatching hence >>> Failed");
			waitFor(2000);
			if (UpdateScorelabel.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			log.info("error validating Update Score label");
			Assert.fail();
			return false;
		}
	}

	public void SelectRatingfromthedropdowntype() {
		try {
			log.info("selecting rating from dropdown");
			log.info("Waiting for ChangeRating");
			waitUntilElementToBeClickable(ChangeRating);
			setValueInDropdownByValue(ChangeRating, "2");
			log.info("selected rating from dropdown");
		} catch (Exception e)

		{
			log.error("error selecting rating from dropdown");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void ClickUpdateScorebutton() {
		try {
			log.info("Clicking UpdateScore button");
			// waitUntilElementToBeClickable(ClickUpdateScore);
			click(ClickUpdateScore);

		} catch (Exception e) {
			log.error("error clicking update score button");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void ClickCloseMeetingbuttonmethod() {
		try {
			log.info("Entered ClickCloseMeetingbuttonmethod");
			log.info("Waiting for ClickCloseMeeting");
			waitUntilElementToBeClickable(ClickCloseMeeting);
			log.info("Clicking ClickCloseMeeting");
			click(ClickCloseMeeting);
			log.info("Executed ClickCloseMeetingbuttonmethod");
		} catch (Exception e) {
			log.error("error clicking close meeting button method");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void ClickFianlCloseMettingbuttonmethod() {
		try {
			log.info("Entered ClickFianlCloseMettingbuttonmethod");
			log.info("Waiting for ClickFinalCloseMeeting");
			waitUntilElementToBeClickable(ClickFinalCloseMeeting);
			log.info("Clicking ClickFinalCloseMeeting");
			click(ClickFinalCloseMeeting);
			log.info("Executed ClickFianlCloseMettingbuttonmethod");
		} catch (Exception e) {
			log.error("error clicking final close meeting button");
			e.printStackTrace();
			Assert.fail();

		}
	}

	public boolean validateModertionMeetinglabelmethod() {
		try {
			// Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
			// monitor program page label is mismatching hence >>> Failed");
			log.info("Entered validateModertionMeetinglabelmethod");
			if (ModerationMeetingpage.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {

			Assert.fail();
			return false;
		}
	}

	public void clickRadiobutton1() {
		try {
			log.info("Entered clickRadiobutton1");
			// waitUntilElementToBeClickable(Radiobutton2);
			waitFor(3000);
			log.info("Clicking Radiobuttonuploadkpi");
			click(Radiobuttonuploadkpi);
			log.info("Executed clickRadiobutton1");
		} catch (Exception e) {
			log.error("error clicking clickRadiobutton1");
			e.printStackTrace();			
			Assert.fail();
		}

	}

	public void clickRadiobuttonkpiandcomp() {
		try {
			log.info("Entered clickRadiobuttonkpiandcomp");
			// waitUntilElementToBeClickable(Radiobutton2);
			waitFor(3000);
			log.info("Clicking Radiobuttonuploadkpiandcomp");
			click(Radiobuttonuploadkpiandcomp);
			log.info("Executed clickRadiobuttonkpiandcomp");
		} catch (Exception e) {
			log.error("clickRadiobuttonkpiandcomp not executed Successfully");
			e.printStackTrace();				
			Assert.fail();
		}

	}

	// public void Contributionfromkpiscore()
	// {
	// try
	// {
	// click(kpiScorekpi);
	// writeText(kpiScorekpi,"100");
	// }
	// catch(Exception e)
	// {
	// Assert.fail();
	//
	// }
	//
	// }

	public void Employeesforkpiscoreshow() {
		try {
			log.info("Entered Employeesforkpiscoreshow");
			click(Employeesforkpiscore);
			writeText(Employeesforkpiscore, "1");
			log.info("Executed Employeesforkpiscoreshow");
		} catch (Exception e) {
			log.error("Employeesforkpiscoreshow not executed Successfully");
			e.printStackTrace();				
			Assert.fail();

		}
	}

	public void FeedbackScoreshowkpi() {
		try {
			log.info("Entered FeedbackScoreshowkpi");
			click(FeedbackScorekpi);
			writeText(FeedbackScorekpi, "OK");
			log.info("Executed FeedbackScoreshowkpi");
		} catch (Exception e) {
			log.error("FeedbackScoreshowkpi not executed Successfully");
			e.printStackTrace();					
			Assert.fail();

		}
	}

	public void Contributionfromkpiscoreandcomp(String i) {
		try {
			log.info("Entered Contributionfromkpiscoreandcomp");
			if (i.equals("KPI")) {
				click(kpiScorekpi);
				writeText(kpiScorekpi, "100");
			}

			else if (i.equals("COMP")) {
				click(CompetencyScore);
				writeText(CompetencyScore, "100");
			} else if (i.equals("KPIANDCOMP")) {
				writeText(kpiScorekpi, "50");
				writeText(CompetencyScore, "50");
			}
			log.info("Executed Contributionfromkpiscoreandcomp");
		} catch (Exception e) {
			log.error("Contributionfromkpiscoreandcomp not executed Successfully");
			e.printStackTrace();				
			Assert.fail();
		}

	}

	public void clickRadiobuttonkpiandcompfromthesystem() {
		try {
			log.info("clicking on upload kpi and competency!!");
			// waitUntilElementToBeClickable(Radiobutton2);
			waitFor(5000);
			log.info("Clicking Radiobuttonuploadkpiandcompsystem");
			click(Radiobuttonuploadkpiandcompsystem);
			log.info("clicked on upload kpi and competency!!");
		} catch (Exception e) {
			log.error("error clicking on upload kpi and competency!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void clickcontinue2() {
		try {
			log.info("clicking on continue2");
			// waitUntilElementToBeClickable(Radiobutton2);
			waitFor(5000);
			log.info("Clicking Continue2");
			click(Continue2);
			log.info("clicked on continue2");
		} catch (Exception e) {
			log.error("error clicking on continue2");
			Assert.fail();
		}
	}

	public void checkbox1prog() {
		try {
			log.info("clicking on program checkbox!!");
			// waitUntilElementToBeClickable(Radiobutton2);
			waitFor(3000);
			log.info("Clicking checkbox1");
			click(checkbox1);
			log.info("clicked on program checkbox!!");
		} catch (Exception e) {
			log.error("error clicking on program checkbox!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void clickEligibleemployees() {
		try {
			log.info("clicking on eligible employees!!");
			// waitUntilElementToBeClickable(Radiobutton2);
			waitFor(3000);
			log.info("Clicking EligibleEmployees11");
			click(EligibleEmployees11);
			log.info("clicked on eligible employees!!");
		} catch (Exception e) {
			log.error("error clicking on eligible employees!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void clickAnomaliesemployees() {
		try {
			log.info("clicking on anomalies employees!!");
			// waitUntilElementToBeClickable(Radiobutton2);
			waitFor(5000);
			log.info("Clicking Anamolies1");
			click(Anamolies1);
			log.info("clicked on anomalies employees!!");
		} catch (Exception e) {
			log.error("error clicking on anomalies employees!!");
			e.printStackTrace();
			Assert.fail();
		}

	}

}
