package pageObjects;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;
import helper.LoggerHelper;
import org.testng.Assert;

public class TakeKpiFromSupervisorPage extends BasePage {

	public TakeKpiFromSupervisorPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Take KPI From Supervisor')]")
	private WebElement btn_takeKpiFromSup;

	@FindBy(how = How.XPATH, using = "//div[@class='media-body text-truncate']")
	private List<WebElement> btn_selectTheSup;

	@FindBy(how = How.XPATH, using = "//p[contains(@class,'text-truncate b')]/../p")
	private List<WebElement> Num_Of_Kpi;

	@FindBy(how = How.XPATH, using = "(//p[@class='text-truncate b kpi-objective'])[1]") //"(//div[@class='bg-light ng-star-inserted'])[1]")
	private WebElement checkForKpi;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Back')]")
	private WebElement Btn_back;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Own')]")
	private WebElement Btn_own;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Share')]")
	private WebElement Btn_Share;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Support')]")
	private WebElement Btn_Support;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue')]")
	private WebElement Btn_Continue;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save')]")
	private WebElement Btn_Save;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'KPI Name')]/../textarea")
	private WebElement txt_kpiname;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Description')]/../textarea")
	private WebElement txt_kpidesc;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Weightage')]/../input")
	private WebElement txt_kpiwtg;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Target')]/../input")
	private WebElement txt_kpiTarget;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Toggle')]")
	private WebElement chk_toogle;

	public void clickOnTakeKpiSupervisor() {
		try {
			log.info("Entered clickOnTakeKpiSupervisor");	
			doHover(btn_takeKpiFromSup);
			waitFor(500);
			log.info("Clicking btn_takeKpiFromSup");
			click(btn_takeKpiFromSup);
			log.info("Executed clickOnTakeKpiSupervisor Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnTakeKpiSupervisor Not Successfully");
			e.printStackTrace();
			throw e;			
		}		
		
	}

	public void clickOnThePerformanceProgram(String performanceProgram) {
		try {
			log.info("Entered clickOnThePerformanceProgram");	
			waitFor(2000);
			boolean dropdownItemClicked = false;
			try {
				WebElement arrow = webDriver.findElement(By.xpath("//div[contains(@class,'ks ks-angle-double-right ks-xs')]"));
				waitUntilElementVisible(arrow);
				log.info("Clicking arrow");
				click(arrow);
				waitFor(3000);
				waitUntilElementVisible(webDriver.findElement(By.xpath("//div[contains(@class,'dropdown-item py-2 px-4 c-p')]")));
							WebElement perfProgItem = webDriver.findElement(By.xpath("(//div[contains(@class,'dropdown-item py-2 px-4 c-p')]/div[contains(text(),'TestEdit')])[last()]"));
				log.info("Clicking perfProgItem");
				click(perfProgItem);
				waitFor(4000);
				dropdownItemClicked = true;
			} catch (NoSuchElementException e ) {
				dropdownItemClicked = false;
			}
			if (!dropdownItemClicked) {
				WebElement perfProgButton = webDriver.findElement(By.xpath(
						"(//div[@name='supervisorKpiTitleName' and contains(text(),'"
								+ performanceProgram + "')])[last()]"));
				waitUntilElementVisible(perfProgButton);
				log.info("Clicking perfProgButton");
				click(perfProgButton);
				waitFor(4000);
			}
			log.info("Executed clickOnThePerformanceProgram Successfully");
		} catch (Exception exception) {
			log.error("Executed clickOnThePerformanceProgram Not Successfully");
			exception.printStackTrace();
			throw exception;			
		}		
	}

	public void selectTheSupervisor() {
		try {
			log.info("Entered selectTheSupervisor");	
			for (int i = 0; i < btn_selectTheSup.size();) {
				if (btn_selectTheSup.get(i).isDisplayed()) {
					log.info("Clicking btn_selectTheSup.get("+i+")");
					click(btn_selectTheSup.get(i));
					waitFor(3000);

					if (checkForKpi.isDisplayed()) {
						System.out.println("Kpi are present");
						break;
					} else {
						System.out.println("supervisor dnt have any kpi to cascaded ");
						log.info("Clicking Btn_back");
						click(Btn_back);
						i++;
					}
				}
			}
			log.info("Executed selectTheSupervisor Successfully");
		} catch (Exception e) {
			log.error("Executed selectTheSupervisor Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}
/*
	public void CascadedTheOwnKpi(int i) {
		try {
			click(Num_Of_Kpi.get(i + 1));
			waitFor(3000);
			if (Btn_own.isDisplayed()) {
				click(Btn_own);
				waitFor(3000);
			} else {
				System.out.println("alreadry is cascaded or its a date based kpi");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	public void CascadedTheOwnKpi(String kpiName) {
		try {
			log.info("Entered CascadedTheOwnKpi");	
			int i = 0;
			boolean kpiFound = false;
			int total = Num_Of_Kpi.size();
			ArrayList<String> acutalKpis = new ArrayList<String>();
			for (int j=0;j<total;j++) {
				String currKpiName = Num_Of_Kpi.get(j).getText().trim().indexOf("\n") > 0 ?
						Num_Of_Kpi.get(j).getText().trim().substring(0, Num_Of_Kpi.get(j).getText().trim().indexOf("\n")).trim()
						: Num_Of_Kpi.get(j).getText().trim();
				if (currKpiName.equalsIgnoreCase(kpiName)) {
					i = j;
					kpiFound = true;
					break;
				}
				acutalKpis.add(currKpiName);
			}
			Assert.assertTrue(kpiFound,
				"expd kpi to own: "+kpiName+", actual kpis: " + acutalKpis);

			doHover(Num_Of_Kpi.get(i));
			log.info("Clicking Num_Of_Kpi.get("+i+")");
			clickOnElementByJs(Num_Of_Kpi.get(i));
			waitFor(3000);
			if (Btn_own.isDisplayed()) {
				log.info("Clicking Btn_own");
				click(Btn_own);
				waitFor(3000);
			} else {
				System.out.println("alreadry is cascaded or its a date based kpi");
			}
			log.info("Executed CascadedTheOwnKpi Successfully");
		} catch (Exception e) {
			log.error("Executed CascadedTheOwnKpi Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	/*
	public void CascadedTheShareKpi(int i) {
		try {
			click(Num_Of_Kpi.get(i + 1));
			waitFor(3000);
			if (Btn_Share.isDisplayed()) {
				click(Btn_Share);
				waitFor(3000);
			} else {
				System.out.println("alreadry is cascaded or its a date based kpi");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/

	public void CascadedTheShareKpi(String kpiName) {
		try {
			log.info("Entered CascadedTheShareKpi");	
			int i = 0;
			boolean kpiFound = false;
			int total = Num_Of_Kpi.size();
			ArrayList<String> acutalKpis = new ArrayList<String>();
			for (int j=0;j<total;j++) {
				String currKpiName = Num_Of_Kpi.get(j).getText().trim().indexOf("\n") > 0 ?
						Num_Of_Kpi.get(j).getText().trim().substring(0, Num_Of_Kpi.get(j).getText().trim().indexOf("\n")).trim()
						: Num_Of_Kpi.get(j).getText().trim();
				if (currKpiName.equalsIgnoreCase(kpiName)) {
					i = j;
					kpiFound = true;
					break;
				}
				acutalKpis.add(currKpiName);
			}
			Assert.assertTrue(kpiFound,
					"expd kpi to share: "+kpiName+", actual kpis: " + acutalKpis);
			doHover(Num_Of_Kpi.get(i));
			log.info("Clicking Num_Of_Kpi.get("+i+")");
			clickOnElementByJs(Num_Of_Kpi.get(i));
			waitFor(3000);
			if (Btn_Share.isDisplayed()) {
				log.info("Clicking Btn_Share");
				click(Btn_Share);
				waitFor(3000);
			} else {
				System.out.println("alreadry is cascaded or its a date based kpi");
			}
			log.info("Executed CascadedTheShareKpi Successfully");
		} catch (Exception e) {
			log.error("Executed CascadedTheShareKpi Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

/*
	public void CascadedTheSupportKpi(int i) {
		try {
			click(Num_Of_Kpi.get(i + 1));
			waitFor(3000);
			if (Btn_Support.isDisplayed()) {
				click(Btn_Support);
				waitFor(3000);
			} else {
				System.out.println("alreadry is cascaded or its a date based kpi");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/

	public void CascadedTheSupportKpi(String kpiName) {
		try {
			log.info("Entered CascadedTheSupportKpi");	
			int i = 0;
			boolean kpiFound = false;
			int total = Num_Of_Kpi.size();
			ArrayList<String> acutalKpis = new ArrayList<String>();
			String matchedKpiName = null;
			for (int j=0;j<total;j++) {
				String currKpiName = Num_Of_Kpi.get(j).getText().trim().indexOf("\n") > 0 ?
						Num_Of_Kpi.get(j).getText().trim().substring(0, Num_Of_Kpi.get(j).getText().trim().indexOf("\n")).trim()
						: Num_Of_Kpi.get(j).getText().trim();
				if (currKpiName.equalsIgnoreCase(kpiName)) {
					i = j;
					kpiFound = true;
					break;
				}
				acutalKpis.add(currKpiName);
			}
			Assert.assertTrue(kpiFound,
					"expd kpi to support: "+kpiName+", actual kpis: " + acutalKpis);
			doHover(Num_Of_Kpi.get(i));
			log.info("Clicking Num_Of_Kpi.get("+i+")");
			clickOnElementByJs(Num_Of_Kpi.get(i));
			waitFor(3000);
			if (Btn_Support.isDisplayed()) {
				log.info("Clicking Btn_Support");
				click(Btn_Support);
				waitFor(3000);
			} else {
				System.out.println("alreadry is cascaded or its a date based kpi");
			}
			log.info("Executed CascadedTheSupportKpi Successfully");
		} catch (Exception e) {
			log.error("Executed CascadedTheSupportKpi Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

	public void checkForFields(String Kpiname, String kpidesc, String wtg, String target) {

		try {
			log.info("Entered checkForFields");	
			if (txt_kpiname.isEnabled()) {
				log.info("Clicking txt_kpiname");
				click(txt_kpiname);
				log.info("Writing text to txt_kpiname: "+Kpiname);
				writeText(txt_kpiname, Kpiname);
			}
			if (txt_kpidesc.isEnabled()) {
				log.info("Clicking txt_kpidesc");
				click(txt_kpidesc);
				log.info("Writing text to txt_kpidesc: "+kpidesc);
				writeText(txt_kpidesc, kpidesc);
			}
			if (txt_kpiwtg.isEnabled()) {
				log.info("Clicking txt_kpiwtg");
				click(txt_kpiwtg);
				log.info("Writing text to txt_kpiwtg: "+wtg);
				writeText(txt_kpiwtg, wtg);
			}
			log.info("Clicking Btn_Continue");
			click(Btn_Continue);
			waitUntilElementVisible(txt_kpiTarget);

			if (txt_kpiTarget.isEnabled()) {
				log.info("Clicking txt_kpiTarget");
				click(txt_kpiTarget);
				log.info("Writing text to txt_kpiTarget: "+target);
				writeText(txt_kpiTarget, target);

			}
			log.info("Clicking Btn_Continue");
			click(Btn_Continue);
			waitUntilElementToBeClickable(Btn_Save);
			log.info("Clicking Btn_Save");
			click(Btn_Save);
			waitFor(3000);
			waitUntilElementVisible(btn_takeKpiFromSup);
			log.info("Executed checkForFields Successfully");
		} catch (Exception e) {
			log.error("Executed checkForFields Not Successfully");
			e.printStackTrace();
			throw e;			
		}

	}

	public void clickOnToogleWhileCacaded() {
		try {
			log.info("Entered clickOnToogleWhileCacaded");	
			waitUntilElementToBeClickable(chk_toogle);
			log.info("Clicking chk_toogle");
			click(chk_toogle);
			log.info("Executed clickOnToogleWhileCacaded Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnToogleWhileCacaded Not Successfully");
			e.printStackTrace();
			throw e;			
		}
	}

}
