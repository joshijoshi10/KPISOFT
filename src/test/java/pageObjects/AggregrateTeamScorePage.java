package pageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AggregrateTeamScorePage extends BasePage {

    public AggregrateTeamScorePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Team Actual :')]/../../..")
    private WebElement Aggregrate_widget;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Team Actual :')]/b")
    private WebElement AggregrateTeamScore;

    @FindBy(how = How.XPATH, using = "(//p[contains(text(),'Team Actual :')]/../..//select)[1]")
    private WebElement AggregrateTeamScore_option;

    public void verifyAggregrateTab() {
        try {
        	log.info("verifying aggregrate tab!!");
            waitUntilElementVisible(Aggregrate_widget);
            assertTrue(Aggregrate_widget.isDisplayed(), "<<aggregrate team score widget is not there>>");
            log.info("verified aggregrate tab!!");
        } catch (Exception e) {
        	log.error("error verifying aggregrate tab!!");
            e.printStackTrace();
            Assert.fail();
        }
    }

    public void verifyScoreForCorrespondingOption(String option, String score) {
        try {
        	log.info("verifying score for option:"+ option);
            setValueInDropdownText(AggregrateTeamScore_option, option);
            waitFor(4000);
            if (option.equalsIgnoreCase("Sum")) {
                assertEquals(AggregrateTeamScore.getText(), score,
                        "<<<Aggregrate team score is not matching for corresponding option>>>");
            } else if (option.equalsIgnoreCase("Average")) {
                assertEquals(AggregrateTeamScore.getText(), score,
                        "<<<Aggregrate team score is not matching for corresponding option>>>");
            } else if (option.equalsIgnoreCase("max")) {
                assertEquals(AggregrateTeamScore.getText(), score,
                        "<<<Aggregrate team score is not matching for corresponding option>>>");
            } else {
                assertEquals(AggregrateTeamScore.getText(), score,
                        "<<<Aggregrate team score is not matching for corresponding option>>>");
            }
        	log.info("verified score for option:"+ option);
        } catch (Exception e) {
        	log.error("error verifying score for option:"+ option);
            e.printStackTrace();
            Assert.fail();

        }
    }

}
