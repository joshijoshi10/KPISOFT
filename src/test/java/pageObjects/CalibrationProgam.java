package pageObjects;

import java.io.File;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CalibrationProgam extends BasePage {
    public CalibrationProgam(WebDriver webDriver) {
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

    @FindBy(how = How.XPATH, using = "//input[@id='ppd'] ")
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

    @FindBy(how = How.XPATH, using = "//tr//td[3]//input")
    private List<WebElement> Scoreconfig;

    // Business Unit Configuration

    @FindBy(how = How.XPATH, using = "//h6[contains(text(),'Business Unit Configuration')]")
    private WebElement BusinessUnitConfiguration;

    // Business Unit Configuration

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

    // UploadData
    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Trigger Business Unit')]")
    private WebElement ValidateTriggerBusinessUnitlabel;

    @FindBy(how = How.XPATH, using = "//i[@ngbtooltip='Upload Data']")
    private WebElement UploadDatabutton;

    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Upload Data')]")
    private WebElement ValidateUploaddatalabel;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Download Excel Template')]")
    private WebElement DownloadExcel;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Attach document')]/../input")
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

    @FindBy(how = How.XPATH, using = "(//p[contains(text(),'Pending Meetings')])[2]")
    private WebElement PendingMeetinglabel;

    @FindBy(how = How.XPATH, using = "(//select[@id='period'] ")
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

    public void clickCaliberationLink() {
        try {
            waitFor(3000);
            waitUntilElementToBeClickable(BusinessRankingUnit);
            click(BusinessRankingUnit);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void clickModerationLink() {
        try {
            waitFor(3000);
            waitUntilElementToBeClickable(CreateModeration);
            click(CreateModeration);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public boolean validateModerationLabel() {
        try {
            // Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
            // monitor program page label is mismatching hence >>> Failed");
			return Moderationlabel.isDisplayed();
        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }

    public boolean validateBusinessUnitLabel() {
        try {
            // Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
            // monitor program page label is mismatching hence >>> Failed");
            waitFor(3000);
			return BusinessUnitLabel.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enterName(String ProgramName) {
        try {
            writeText(Name, ProgramName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Selectfromthedropdowntype() {
        try {
            waitUntilElementToBeClickable(BusinessUnitType);
            setValueInDropdownByValue(BusinessUnitType, "Management");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Selectvalueppd() {
        try {
            click(ppdcordinator);
            waitFor(3000);
            // waitUntilElementToBeClickable(ppdcordinator);
            click(ppdSearch);
            typeTextToGetDropdown(ppdcordinator, "EMP30", ppdcordinatorlist);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void SelectvalueBusinessUnit() {
        try {
            click(BusinessUnit);
            waitFor(3000);
            click(BusinessUnitSearch);
            // waitUntilElementToBeClickable(ppdcordinator);
            typeTextToGetDropdown(BusinessUnit, "EMP100", BusinessUnitList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void StartDate() {
        try {
            setDateInDatePicker(StartDate, 2019, "Jan", 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void EndDate() {
        try {
            setDateInDatePicker(EndDate, 2019, "Dec", 31);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Clickoncontinuebutton1() {
        try {
            click(Continuebutton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validateScoresourceLabel() {
        try {
            // Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
            // monitor program page label is mismatching hence >>> Failed");
			return Scoresourcelabel.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickRadiobutton2() {
        try {
            // waitUntilElementToBeClickable(Radiobutton2);
            waitFor(3000);
            click(Radiobuttonuploadcompetency);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void Clickoncontinuebutton2() {
        try {
            click(Continuebutton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validateRatinglevelandcurveLabel() {
        try {
            // Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
            // monitor program page label is mismatching hence >>> Failed");
			return Ratinglevelandcurvelabel.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
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
            System.out.println(Score.get(i - 1).getText());
            writeText(Score.get(i - 1), value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Clickoncontinuebutton3() {
        try {
            waitFor(3000);
            click(Continuebutton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validateScoreConfigurationlabel() {
        try {
            // Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
            // monitor program page label is mismatching hence >>> Failed");
            waitFor(3000);
			return ScoreConfigurationlabel.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void EnterScoreConfigurations(String value, int i) {
        try {
            System.out.println(Scoreconfig.get(i - 1).getText());
            writeText(Scoreconfig.get(i - 1), value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Clickoncontinuebutton4() {
        try {
            waitFor(3000);
            click(Continuebutton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validateBusinessUnitConfigurationlabel() {
        try {
            // Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
            // monitor program page label is mismatching hence >>> Failed");
            waitFor(3000);
			return BusinessUnitConfiguration.isDisplayed();
        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }

    public void Contributionfromcompetencyscore() {
        try {
            click(CompetencyScore);
            writeText(CompetencyScore, "100");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void Employeesforcompetencyscoreshow() {
        try {
            click(Employeesforcompetencyscore);
            writeText(Employeesforcompetencyscore, "1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void FeedbackScoreshow() {
        try {
            click(FeedbackScore);
            writeText(FeedbackScore, "OK");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Clickoncontinuebutton5() {
        try {
            click(Continuebutton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validateBusinessUnitProcesslabel() {
        try {
            // Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
            // monitor program page label is mismatching hence >>> F
            waitFor(3000);
			return BusinessUnitProcesslabel.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void AddStageMethod() {
        try {
            click(AddStage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Addlablenames() {
        try {
            click(Enterlabel);
            writeText(Enterlabel, "Stage1");
            waitFor(1000);
            click(AddStage);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public boolean validateBusinessUnitRatinglabel() {
        try {
            // Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
            // monitor program page label is mismatching hence >>> Failed");
            waitFor(3000);
			return BusinessUnitratinglabel.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void BusinessUnitRatingmethod() {
        try {
            click(ManuallyUpdatedBusinessUnit);
            writeText(ManuallyUpdatedBusinessUnit, "3");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void SubmitMethod() {
        try {
            click(SubmitButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // StartProgram

    public void ClickAction() {
        try {
            click(Actionbutton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ClickStart() {
        try {
            click(Startbutton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validateTriggerBusinessUnitLabelmethod() {
        try {
            // Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
            // monitor program page label is mismatching hence >>> Failed");
			return TriggerBusinessUnitlableValidation.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void ClickTrigger() {
        try {
            click(Triggerbutton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ClickValidateandStart() {
        try {
            click(ValidateandStartbutton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validateStartModerationLabelmethod() {
        try {
            // Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
            // monitor program page label is mismatching hence >>> Failed");
			return ValidateStartModerationlabel.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void ClickStartProgramMethod() {
        try {
            click(StartProgrambutton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validateStartProgramLabelmethod() {
        try {
            // Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
            // monitor program page label is mismatching hence >>> Failed");
			return ValidateStartProgramlabel.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void ClickOKConfirmMethod() {
        try {
            click(OKConfirm);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validateTriggerBusinessUnitlabelmethod() {
        try {
            // Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
            // monitor program page label is mismatching hence >>> Failed");
			return ValidateTriggerBusinessUnitlabel.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void ClickUploaddataMethod() {
        try {
            waitUntilElementToBeClickable(UploadDatabutton);
            click(UploadDatabutton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validateUploaddatalabelmethod() {
        try {
            // Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
            // monitor program page label is mismatching hence >>> Failed");
			return ValidateUploaddatalabel.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void ClickDownloadExcelMethod(String Download) {
        try {
            // waitUntilElementToBeClickable(UploadDatabutton);
            click(DownloadExcel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ClickUploadExcelMethod(String Upload) {
        try {
            // waitUntilElementToBeClickable(UploadDatabutton);
            // writeText(UploadDatabutton, getDownloadedFileName());
            // click(AttachDocument);
            waitFor(3000);
            String abspath1 = new File(Upload).getAbsolutePath();
            System.out.println(abspath1);
            AttachDocument.click();
	        waitFor(2000);
            UploadFiles(abspath1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ClickUploadScoredataMethod() {
        try {
            waitUntilElementToBeClickable(UploadDatabutton);
            click(UploadScoredatabutton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ClickRefreshMethod() {
        try {
            // waitUntilElementToBeClickable(UploadDatabutton);
            click(Refreshbutton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ClickCloseMethod() {
        try {
            // waitUntilElementToBeClickable(UploadDatabutton);
            click(Closebutton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ClickStartCaliberationMethod() {
        try {
            // waitUntilElementToBeClickable(UploadDatabutton);
            click(StartCaliberationbutton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // CaliberationMeeting
    public void ClickCaliberationMeetingMethod() {
        try {
            // waitUntilElementToBeClickable(UploadDatabutton);
            click(CaliberationMeetingbutton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validatePendingMeetinglabelmethod() {
        try {
            // Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
            // monitor program page label is mismatching hence >>> Failed");
            waitFor(3000);
			return PendingMeetinglabel.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void SelectPeriodfromthedropdowntype() {
        waitUntilElementToBeClickable(Period);
        setValueInDropdownByValue(Period, "2019");
    }

    public void ClickStartMeetingbutton() {
        try {
            // waitUntilElementToBeClickable(UploadDatabutton);
            click(Meeting1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ClickSaveMeetingdetailbutton() {
        try {
            // waitUntilElementToBeClickable(UploadDatabutton);
            click(SaveMeetingDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validateCaliberationMeetinglabelmethod() {
        try {
            // Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
            // monitor program page label is mismatching hence >>> Failed");
			return CaliberationMeetinglabel.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void ClickRatingbutton() {
        try {
            waitUntilElementToBeClickable(clickRating);
            click(clickRating);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validateUpdateScorelabelmethod() {
        try {
            // Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
            // monitor program page label is mismatching hence >>> Failed");
			return UpdateScorelabel.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void SelectRatingfromthedropdowntype() {
        waitUntilElementToBeClickable(ChangeRating);
        setValueInDropdownByValue(ChangeRating, "5");
    }

    public void ClickUpdateScorebutton() {
        try {
            // waitUntilElementToBeClickable(ClickUpdateScore);
            click(ClickUpdateScore);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ClickCloseMeetingbuttonmethod() {
        try {
            waitUntilElementToBeClickable(ClickCloseMeeting);
            click(ClickCloseMeeting);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ClickFianlCloseMettingbuttonmethod() {
        try {
            waitUntilElementToBeClickable(ClickFinalCloseMeeting);
            click(ClickFinalCloseMeeting);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validateModertionMeetinglabelmethod() {
        try {
            // Assert.assertEquals(Moderationlabel.getText(), "Moderation","moderation
            // monitor program page label is mismatching hence >>> Failed");
			return ModerationMeetingpage.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
