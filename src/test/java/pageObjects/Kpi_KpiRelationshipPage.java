package pageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.LoggerHelper;

public class Kpi_KpiRelationshipPage extends BasePage 
{

	Logger log = LoggerHelper.getLogger(LoggerHelper.class);

	public Kpi_KpiRelationshipPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);

	}

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Edit KPI')]")
	private WebElement verifyTheKpi_KpiRelationshipTab;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Reflect the changes to the cascaded objective')]/..")
	private WebElement chk_Reflect;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Change Relationship of Cascaded Objective')]/..")
	private WebElement chk_Translate;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Reset Scorecard to Created Stage')]/..")
	private WebElement chk_Reset;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Update')]")
	private WebElement btn_update;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'SupervisorEditKpiForReflect')]")
	private WebElement verifyForReflect;

	//@FindBy(how = How.XPATH, using = "//p[contains(text(),'EMP6_Monthly Constant')]/../../div[2]/span")  this before kpi order change
	//@FindBy(how = How.XPATH, using = "//p[contains(text(),'EMP6_Halfyearly Constant')]/../../div[2]/span") this is before exception raising
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Cascaded_Support_KPI')]/../../div[2]/span")
	private WebElement verifyForTranslate;

	public void verifyTheKpi_KpiRelationshipTab() {
		try{
			log.info("Entered verifyTheKpi_KpiRelationshipTab succesfully");
			waitUntilElementVisible(verifyTheKpi_KpiRelationshipTab);
			assertTrue(verifyTheKpi_KpiRelationshipTab.getText().equalsIgnoreCase("Edit Kpi"),
					"Kpi-kpi relationship popup is not coming");
			log.info("Executed verifyTheKpi_KpiRelationshipTab Successfully");
		}
		catch (Exception e) 
		{ 
			log.error("Not Executed verifyTheKpi_KpiRelationshipTab"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnReflect() {
		try{
			log.info("Entered clickOnReflect succesfully");
			waitUntilElementToBeClickable(chk_Reflect);
			click(chk_Reflect);
			log.info("Executed clickOnReflect Successfully");
		} 
		catch (Exception e) 
		{ 
			log.error("Not Executed clickOnReflect"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnTranslate() {
		try{log.info("Entered clickOnTranslate succesfully");
		waitUntilElementToBeClickable(chk_Translate);
		click(chk_Translate);
		log.info("Executed clickOnTranslate Successfully");
		} 
		catch (Exception e) 
		{ 
			log.error("Not Executed clickOnTranslate"); 
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnReset() {
		try{
			log.info("Entered clickOnReset succesfully");
			waitUntilElementToBeClickable(chk_Reset);
			click(chk_Reset);
			waitFor(3000);
			log.info("Executed clickOnReset Successfully");
		} 
		catch (Exception e) 
		{
			log.error("Not Executed clickOnReset"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickOnUpdate() {
		try{log.info("Entered clickOnUpdate succesfully");
		waitUntilElementToBeClickable(btn_update);
		click(btn_update);
		waitFor(3000);
		log.info("Executed clickOnUpdate Successfully");
		} catch (Exception e) 
		{ 
			log.error("Not Executed clickOnUpdate"); 
			e.printStackTrace(); 
			throw e; 
		}
	}

	public void verifyforReflect() {
		try{
			log.info("Entered verifyforReflect succesfully");
			assertTrue(verifyForReflect.isDisplayed(), "supervisor changes are not reflected in user kpi");
			log.info("Executed verifyforReflect Successfully");
		} 
		catch (Exception e) 
		{ 
			log.error("Not Executed verifyforReflect");  
			e.printStackTrace(); 
			throw e;
		}
	}

	public void verifyForTranslate() {
		try{
			log.info("Entered verifyForTranslate succesfully");
			assertEquals(verifyForTranslate.getText(), "Supporting", "user kpi is not translated");
			log.info("Executed verifyForTranslate Successfully");
		} 
		catch (Exception e) 
		{ 
			log.error("Not Executed verifyForTranslate"); 
			e.printStackTrace(); 
			throw e; 
		}
	}
}
