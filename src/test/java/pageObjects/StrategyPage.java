package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.apache.log4j.Logger;
import helper.LoggerHelper;

public class StrategyPage extends BasePage {

    public StrategyPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }

    @FindBy(how = How.XPATH, using = "//h5[@class='medium mb-0']")
    private WebElement manageStrategyLabel;

    @FindBy(how = How.XPATH, using = "//select[@class='form-control w-25 ng-pristine ng-valid ng-touched']")
    private WebElement strategyDropdown;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-secondary']")
    private WebElement backButton;

    @FindBy(how = How.XPATH, using = "//button[text()='Create New']")
    private WebElement createNewButton;

    @FindBy(how = How.XPATH, using = "//button[text()=' Publish']")
    private WebElement publishButton;

    @FindBy(how = How.XPATH, using = "//h6[contains(text(),'Create Strategy')]")
    private WebElement createStrategyLabel;

    @FindBy(how = How.XPATH, using = "//a[text()='Strategy']")
    private WebElement strategyHyperlink;

    @FindBy(how = How.XPATH, using = "//div[@class='form-group']//label[@for='f_name']")
    private WebElement titleLabel;

    @FindBy(how = How.XPATH, using = "//div[@class='form-group']//label[@for='goal']")
    private WebElement goalLabel;

    @FindBy(how = How.XPATH, using = "//label[text()='Objective']")
    private WebElement objectiveLabel;

    @FindBy(how = How.XPATH, using = "//label[@class='w-100']")
    private WebElement levelsLabel;

    @FindBy(how = How.XPATH, using = "//span[text()='Add More']")
    private WebElement addMoreButton;

    @FindBy(how = How.XPATH, using = "//input[@name='strategyTitle']")
    private WebElement titleTextField;

    @FindBy(how = How.XPATH, using = "//textarea[@name='strategyGoal']")
    private WebElement goalTextArea;

    @FindBy(how = How.XPATH, using = "//textarea[@name='strategyObj']")
    private WebElement objectiveTextArea;

    @FindBy(how = How.XPATH, using = "(//input[@name='strategyLvl'])[1]")
    private WebElement level1TextField;

    @FindBy(how = How.XPATH, using = "(//input[@name='strategyLvl'])[2]")
    private WebElement level2TextField;

    @FindBy(how = How.XPATH, using = "(//input[@name='strategyLvl'])[3]")
    private WebElement level3TextField;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary float-right']")
    private WebElement saveButton;

    @FindBy(how = How.XPATH, using = "//confirmation//div[1]/h6")
    private WebElement confirmationLabel;

    @FindBy(how = How.XPATH, using = "//confirmation//div[2]/h6")
    private WebElement sureText;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary float-right']")
    private WebElement confirmButton;

    @FindBy(how = How.XPATH, using = "(//button[@class='btn btn-primary'])[2]")
    private WebElement createLevel1;

    @FindBy(how = How.XPATH, using = "//h6[text()='Create Perspective']")
    private WebElement createPerspectiveLabel;

    @FindBy(how = How.XPATH, using = "//input[@name='strategyName']")
    private WebElement perspectiveName;

    @FindBy(how = How.XPATH, using = "//input[@name='strategyCode']")
    private WebElement perspectiveCode;

    @FindBy(how = How.XPATH, using = "//textarea[@name='strategyDesc']")
    private WebElement perspectiveDescription;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary btn-sm cursor mx-2']")  //"//button[@class='btn btn-primary btn-sm cursor mr-3']")
    private WebElement createThemeButton;

    @FindBy(how = How.XPATH, using = "(//button[@class='btn btn-primary btn-sm cursor mx-2'])[2]") //"(//button[@class='btn btn-primary btn-sm cursor mr-3'])[2]")
    private WebElement createObjectiveButton;

    @FindBy(how = How.XPATH, using = "//b[contains(text(),'Create My KPI')]")
    private WebElement createMyKPI;

    @FindBy(how = How.ID, using = "Individual_KPI_name")
    private WebElement kpiName;

    @FindBy(how = How.ID, using = "Individual_KPI_desc")
    private WebElement kpiDescription;

    @FindBy(how = How.ID, using = "Individual_KPI_wgt")
    private WebElement kpiWeightage;

    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Next')]")
    private WebElement nextBtn;

    @FindBy(how = How.XPATH, using = "(//h5)[7]")
    private WebElement kpiCard;

    @FindBy(how = How.ID, using = "Individual_KPI_target")
    private WebElement kpiTarget;

    @FindBy(how = How.XPATH, using = "//label[@for='Individual_KPI_perspective']")
    private WebElement kpiPrimaryStategy;

    @FindBy(how = How.XPATH, using = "(//span[@class='lvl2'])[1]")
    private WebElement kpiPrimaryStategyName;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
    private WebElement createKPIButton;

    public void clickOnStrategy() {
		try {
			log.info("Entered clickOnStrategy");
			log.info("Clicking strategyHyperlink");
            click(strategyHyperlink);
			waitForPageLoad();
			log.info("Executed clickOnStrategy");
		} catch (Exception e) {
			log.error("Executed clickOnStrategy");
			e.printStackTrace();
			throw e;
		}
    }

    public void verifyManageStrategyLabel(String expected) {
		try {
			log.info("Entered verifyManageStrategyLabel");
			log.info("Asserting expected: "+expected+", actual: "+manageStrategyLabel);
            Assert.assertEquals(verifyData(expected, manageStrategyLabel), true);
            /*
             * String actual = manageStrategyLabel.getText().trim(); if (actual.equals(
             * expected )) return true; else return false;
             */
			log.info("Executed verifyManageStrategyLabel");
		} catch (Exception e) {
			log.error("Executed verifyManageStrategyLabel");
			e.printStackTrace();
			throw e;
		}

    }

    public void clickOnCreateNew() {
		try {
			log.info("Entered clickOnCreateNew");
			log.info("Clicking clickOnCreateNew");
            click(createNewButton);
			log.info("Executed clickOnCreateNew");
		} catch (Exception e) {
			log.error("Executed clickOnCreateNew");
			e.printStackTrace();
			throw e;
		}
    }

    public void verifyCreateStrategyLabel(String expected) {
		try {
			log.info("Entered verifyCreateStrategyLabel");
            verifyData(expected, createStrategyLabel);
			log.info("Executed verifyCreateStrategyLabel");
		} catch (Exception e) {
			log.error("Executed verifyCreateStrategyLabel");
			e.printStackTrace();
			throw e;
		}
    }

    public void enterStrategyTitle(String StrategyName) {
		try {
			log.info("Entered enterStrategyTitle");
			log.info("Writing text to titleTextField: "+StrategyName);
            writeText(titleTextField, StrategyName);
			log.info("Executed enterStrategyTitle");
		} catch (Exception e) {
			log.error("Executed enterStrategyTitle");
			e.printStackTrace();
			throw e;
		}
    }

    public void enterStrategyGoals(String Goals) {
		try {
			log.info("Entered enterStrategyGoals");
			log.info("Writing text to goalTextArea: "+Goals);
            writeText(goalTextArea, Goals);
			log.info("Executed enterStrategyGoals");
		} catch (Exception e) {
			log.error("Executed enterStrategyGoals");
			e.printStackTrace();
			throw e;
		}
    }

    public void enterStrategyObjective(String objective) {
		try {
			log.info("Entered enterStrategyObjective");
			log.info("Writing text to objectiveTextArea: "+objective);
            writeText(objectiveTextArea, objective);
			log.info("Executed enterStrategyObjective");
		} catch (Exception e) {
			log.error("Executed enterStrategyObjective");
			e.printStackTrace();
			throw e;
		}
    }

    public void clickOnAddMore() {
		try {
			log.info("Entered clickOnAddMore");
			log.info("Clicking addMoreButton");
            click(addMoreButton);
			log.info("Executed clickOnAddMore");
		} catch (Exception e) {
			log.error("Executed clickOnAddMore");
			e.printStackTrace();
			throw e;
		}
    }

    public void enterStrategyLevel1(String text) {
		try {
			log.info("Entered enterStrategyLevel1");
            writeText(level1TextField, text);
			log.info("Executed enterStrategyLevel1");
		} catch (Exception e) {
			log.error("Executed enterStrategyLevel1");
			e.printStackTrace();
			throw e;
		}
    }

    public void enterStrategyLevel2(String text) {
		try {
			log.info("Entered enterStrategyLevel2");
			log.info("Writing text to level2TextField: "+text);
            writeText(level2TextField, text);
			log.info("Executed enterStrategyLevel2");
		} catch (Exception e) {
			log.error("Executed enterStrategyLevel2");
			e.printStackTrace();
			throw e;
		}
    }

    public void enterStrategyLevel3(String text) {
		try {
			log.info("Entered enterStrategyLevel3");
			log.info("Writing text to level3TextField: "+text);
            writeText(level3TextField, text);
			log.info("Executed enterStrategyLevel3");
		} catch (Exception e) {
			log.error("Executed enterStrategyLevel3");
			e.printStackTrace();
			throw e;
		}
    }

    public void clickOnSave() {
		try {
			log.info("Entered clickOnSave");
			log.info("Clicking saveButton");
            click(saveButton);
			log.info("Executed clickOnSave");
		} catch (Exception e) {
			log.error("Executed clickOnSave");
			e.printStackTrace();
			throw e;
		}
    }

    public void clickOnCreateLevel1() {
		try {
			log.info("Entered clickOnCreateLevel1");
			log.info("Clicking createLevel1");
            click(createLevel1);
			waitForPageLoad();
			log.info("Executed clickOnCreateLevel1");
		} catch (Exception e) {
			log.error("Executed clickOnCreateLevel1");
			e.printStackTrace();
			throw e;
		}
    }

    public void enterPerspectiveName(String name) {
		try {
			log.info("Entered enterPerspectiveName");
			log.info("Writing text to perspectiveName: "+name);
            writeText(perspectiveName, name);
			log.info("Executed enterPerspectiveName");
		} catch (Exception e) {
			log.error("Executed enterPerspectiveName");
			e.printStackTrace();
			throw e;
		}
    }

    public void enterPerspectiveCode(String name) {
		try {
			log.info("Entered enterPerspectiveCode");
			log.info("Writing text to perspectiveCode: "+name);
            writeText(perspectiveCode, name);
			log.info("Executed enterPerspectiveCode");
		} catch (Exception e) {
			log.error("Executed enterPerspectiveCode");
			e.printStackTrace();
			throw e;
		}
    }

    public void enterPerspectiveDescription(String name) {
		try {
			log.info("Entered enterPerspectiveDescription");
			log.info("Writing text to perspectiveDescription: "+name);
            writeText(perspectiveDescription, name);
			log.info("Executed enterPerspectiveDescription");
		} catch (Exception e) {
			log.error("Executed enterPerspectiveDescription");
			e.printStackTrace();
			throw e;
		}
    }

    public void clickOnCreateTheme() {
		try {
			log.info("Entered clickOnCreateTheme");
			log.info("Clicking createThemeButton");
            click(createThemeButton);
			log.info("Executed clickOnCreateTheme");
		} catch (Exception e) {
			log.error("Executed clickOnCreateTheme");
			e.printStackTrace();
			throw e;
		}
    }

    public void clickOnCreateObjective() {
		try {
			log.info("Entered clickOnCreateObjective");
			log.info("Clicking createObjectiveButton");
            click(createObjectiveButton);
			log.info("Executed clickOnCreateObjective");
		} catch (Exception e) {
			log.error("Executed clickOnCreateObjective");
			e.printStackTrace();
			throw e;
		}
    }

    public void clickOnPublish() {
		try {
			log.info("Entered clickOnPublish");
			log.info("Clicking publishButton");
            click(publishButton);
			log.info("Executed clickOnPublish");
		} catch (Exception e) {
			log.error("Executed clickOnPublish");
			e.printStackTrace();
			throw e;
		}
    }

    public void verifyStrategy(String expected) {
		try {
			log.info("Entered verifyStrategy");
			log.info("Asserting expected: "+expected+", actual: "+strategyDropdown);
            Assert.assertEquals(verifyData(expected, strategyDropdown), true);
            /*
             * String actual=strategyDropdown.getText(); if (actual.equals( expected ))
             * return true; else return false;
             */
			log.info("Executed verifyStrategy");
		} catch (Exception e) {
			log.error("Executed verifyStrategy");
			e.printStackTrace();
			throw e;
		}
    }

    public void clickOnCard() {
		try {
			log.info("Entered clickOnCard");
			log.info("Clicking kpiCard");
            click(kpiCard);
			log.info("Executed clickOnCard");
		} catch (Exception e) {
			log.error("Executed clickOnCard");
			e.printStackTrace();
			throw e;
		}
    }

    public void enterKPIName(String name) {
		try {
			log.info("Entered enterKPIName");
			log.info("Writing text to kpiName: "+name);
            writeText(kpiName, name);
			log.info("Executed enterKPIName");
		} catch (Exception e) {
			log.error("Executed enterKPIName");
			e.printStackTrace();
			throw e;
		}
    }

    public void enterKPIDescription(String description) {
		try {
			log.info("Entered enterKPIDescription");
			log.info("Writing text to kpiDescription: "+description);
            writeText(kpiDescription, description);
			log.info("Executed enterKPIDescription");
		} catch (Exception e) {
			log.error("Executed enterKPIDescription");
			e.printStackTrace();
			throw e;
		}

    }

    public void enterKPIWeightage(String weightage) {
		try {
			log.info("Entered enterKPIWeightage");
			log.info("Writing text to kpiWeightage: "+weightage);
            writeText(kpiWeightage, weightage);
			log.info("Executed enterKPIWeightage");
		} catch (Exception e) {
			log.error("Executed enterKPIWeightage");
			e.printStackTrace();
			throw e;
		}
    }

    public void clickOnNext() {
		try {
			log.info("Entered clickOnNext");
			log.info("Clicking nextBtn");
            click(nextBtn);
			log.info("Executed clickOnNext");
		} catch (Exception e) {
			log.error("Executed clickOnNext");
			e.printStackTrace();
			throw e;
		}
    }

    public void clickCreateMyKPI() {
		try {
			log.info("Entered clickCreateMyKPI");
			log.info("Clicking createMyKPI");
            click(createMyKPI);
			log.info("Executed clickCreateMyKPI");
		} catch (Exception e) {
			log.error("Executed clickCreateMyKPI");
			e.printStackTrace();
			throw e;
		}

    }

    public void enterTarget(String target) {
		try {
			log.info("Entered enterTarget");
			log.info("Writing text to kpiTarget: "+target);
            writeText(kpiTarget, target);
			log.info("Executed enterTarget");
		} catch (Exception e) {
			log.error("Executed enterTarget");
			e.printStackTrace();
			throw e;
		}
    }

    public void clickOnPrimaryObjective() {
		try {
			log.info("Entered clickOnPrimaryObjective");
			log.info("Clicking kpiPrimaryStategy");
            click(kpiPrimaryStategy);
			log.info("Executed clickOnPrimaryObjective");
		} catch (Exception e) {
			log.error("Executed clickOnPrimaryObjective");
			e.printStackTrace();
			throw e;
		}

    }

    public void selectPrimaryStrategy() {
		try {
			log.info("Entered selectPrimaryStrategy");
			log.info("Clicking kpiPrimaryStategyName");
            click(kpiPrimaryStategyName);
			log.info("Executed selectPrimaryStrategy");
		} catch (Exception e) {
			log.error("Executed selectPrimaryStrategy");
			e.printStackTrace();
			throw e;
		}
    }

    public void clickOnCreateKPI() {
		try {
			log.info("Entered clickOnCreateKPI");
			log.info("Clicking createKPIButton");
            click(createKPIButton);
			log.info("Executed clickOnCreateKPI");
		} catch (Exception e) {
			log.error("Executed clickOnCreateKPI");
			e.printStackTrace();
			throw e;
		}
    }

}
