package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;

public class CreateKpiPage extends BasePage {

	public CreateKpiPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Create scorecard')]")
	private WebElement createScorecard_lbl;

	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Create My KPI')]")
	private WebElement createMykpi_btn;
	private String createMykpi_btn_loc = "//b[contains(text(),'Create My KPI')]";

	@FindBy(how = How.XPATH, using = "//button//span[contains(text(),'Create Group KPI')]")
	private WebElement createGroupkpi_btn;

	@FindBy(how = How.XPATH, using = "//h5[text()='Create KPI']")
	private WebElement createKpi_lbl;

	@FindBy(how = How.ID, using = "Individual_KPI_name")
	private WebElement kpiName_txt;

	@FindBy(how = How.ID, using = "Group_KPI_Desc")
	private WebElement grpdescription_txt;

	@FindBy(how = How.ID, using = "Individual_KPI_desc")
	private WebElement indvdescription_txt;

	@FindBy(how = How.ID, using = "Individual_KPI_desc")
	private WebElement editIndvdescription_txt;

	@FindBy(how = How.ID, using = "Group_KPI_Wgt")
	private WebElement groupweightage_txt;

	@FindBy(how = How.ID, using = "Individual_KPI_wgt")
	private WebElement indvweightage_txt;

	@FindBy(how = How.ID, using = "edit_KPI_wgt")
	private WebElement editIndvweightage_txt;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Next ')]")
	private WebElement next_Btn;
	
	@FindBy(how = How.XPATH, using = "//label[@for='aggregationType2']")
	private WebElement clkRadio_AggregateType2;
	
	//@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Create KPI')]/../../form/div[1]/div[1]/descendant::input") //"//h5[contains(text(),'Create KPI')]/../../div[3]/div[1]/descendant::input")
	@FindBy(how = How.XPATH, using =  "//h5[contains(text(),'Create KPI')]/../../div[3]/div[1]/descendant::input")
	private WebElement perspective_txt;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Create KPI')]/../../form/div[1]/div[1]/descendant::div[3]/button/span") //"//h5[contains(text(),'Create KPI')]/../../div[3]/div[1]/descendant::div[3]/button/span")
	private List<WebElement> perspective_list;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Create Group KPI')]/../../form/div[1]/div[1]//input")
	private WebElement groupperspective_txt;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Create Group KPI')]/../../descendant::button")
	private List<WebElement> groupPrespective_list;

	@FindBy(how = How.ID, using = "grp_kpi")
	private WebElement grp_kpi_txt;

	@FindBy(how = How.ID, using = "Individual_KPI_target")
	private WebElement target_txt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='Individual_KPI_target']")
	private WebElement set_targetDate;
	
	@FindBy(how = How.ID, using = "edit_KPI_tgt")
	private WebElement editTarget_txt;

	@FindBy(how = How.ID, using = "Individual_KPI_grpname")
	private WebElement parentGrp_dd;

	@FindBy(how = How.ID, using = "Individual_KPI_grpname")
	private List<WebElement> verify_parentGrp_dd;

	@FindBy(how = How.CSS, using = "select[name='individualKpiTargetType']")
	private WebElement umo_dd;

	@FindBy(how = How.XPATH, using = "(//input[@name='scaleData'])[1]")
	private WebElement L1_txt;

	@FindBy(how = How.XPATH, using = "(//input[@name='scaleData'])[2]")
	private WebElement L2_txt;

	@FindBy(how = How.XPATH, using = "(//input[@name='scaleData'])[4]")
	private WebElement L4_txt;

	@FindBy(how = How.XPATH, using = "(//input[@name='scaleData'])[5]")
	private WebElement L5_txt;

	@FindBy(how = How.XPATH, using = "//input[@value='MONTHLY']")
	private WebElement monthly_rd;

	@FindBy(how = How.XPATH, using = "//input[@value='QUARTERLY']")
	private WebElement quarterly_rd;

	@FindBy(how = How.XPATH, using = "//input[@value='HALFYEARLY']")
	private WebElement halfyearly_rd;

	@FindBy(how = How.XPATH, using = "//input[@value='ONCE']")
	private WebElement once_rd;

	@FindBy(how = How.ID, using = "myTargetsAddsUp")
	private WebElement targetAddsUp_rd;

	@FindBy(how = How.ID, using = "edit_KPI_addsup")
	private WebElement EditTargetAddsUp_rd;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create KPI')]")
	private WebElement createKpi_Btn;

//	@FindBy(how = How.XPATH, using = "//label[@for='individual_KPI_addsup']")
	@FindBy(how = How.CSS, using = "label[class=custom-control-label]")
	private WebElement myTargetsAddsUp_rd;

	@FindBy(how = How.ID, using = "Group_KPI_Name")
	private WebElement groupkpiName_txt;

	@FindBy(how = How.ID, using = "Group_KPI_grp")
	private WebElement groupDesc_txt;

	@FindBy(how = How.XPATH, using = "//button[text()='Create']")
	private WebElement clickOnCreateGroupKpi_btn;

	@FindBy(how = How.XPATH, using = "//button/span[contains(text(),' Submit scorecard')]")
	private WebElement submitScorecard_Btn;

	@FindBy(how = How.XPATH, using = "//button[text()='Submit']")
	private WebElement submit_btn;

	@FindBy(how = How.ID, using = "individual_KPI_frequency")
	private WebElement drpdw_KPI;

	private String scaleData = "(//input[@name='individualKpiScaleData'])";

	private String updateActualCustomRadio = "(//label[@class='custom-control-label'])";

	public static final int Summation = 1;

	// Resubmit scorecard

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Comments : test')]")
	private WebElement verifycomment_lbl;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Sent back')]/i")
	private WebElement viewSendBack_btn;

	/*
	 * @FindBy(how = How.XPATH, using = "//div[contains(text(),'Rejecting kpi')]")
	 * private WebElement viewSendBackComment_lbl;
	 */

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Comments : Reject All kpi')]")
	private WebElement viewSendBackAllComment_lbl;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Individual kpi Under Group')]/../../..")
	private WebElement editChildKpiTab;

	// @FindBy(how = How.XPATH, using = "//p[contains(text(),'Individual kpi Under
	// Group')]/../../../div[2]/i[2]")
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Individual kpi Under Group')]/../../../div[2]/i[3]")
	private WebElement editChildKpi;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Update KPI')]")
	private WebElement updateKpi_btn;

	String btn_editKpiTabXpath = "(//div[@class='d-flex align-items-center justify-content-between'])";
	String btn_editKpibuttonXapth = "(//div[@class='openhover'])";

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'OK')]")
	private WebElement ok_btn;

	@FindBy(how = How.XPATH, using = "//take-kpi-from-supervisor//b")
	private WebElement lbl_takeKpiSupervisorName;
		
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Multiple strategies')]")
	private List<WebElement> MultipleStrategy_lbl;
	//systemkpi
	
	
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Multiple strategies')]")
	private List<WebElement> SystemKpi_lable;

	//scorecard summary
	
	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Total Weightage')]/../p")
	private WebElement Total_wtg_txt;
	
	@FindBy(how = How.XPATH, using = "//b[contains(text(),'No. of KPI')]/../p")
	private WebElement Noof_Kpi_txt;
	
	@FindBy(how = How.XPATH, using = "//b[contains(text(),'KPI From Supervisor')]/../p")
	private WebElement KPI_FROM_SUPERVISOR_txt;
	
	@FindBy(how = How.XPATH, using = "//b[contains(text(),'My KPI')]/../p")
	private WebElement MY_KPI_txt;
	
	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Date Based KPI')]/../p")
	private WebElement Datebased_KPI_txt;
	
	@FindBy(how = How.XPATH, using = "//b[contains(text(),'System KPI')]/../p")
	private WebElement System_KPI_txt;

	public void verifyCreateScorecardLable() {
		try {
			log.info("Entered verifyCreateScorecardLable");
			waitFor(2000);
			Assert.assertEquals(createScorecard_lbl.getText(), "Create scorecard",
					"Create scoecard lablel is not displaying hence >>> Failed");
			log.info("Executed verifyCreateScorecardLable Successfully");
		} catch (Exception e) {
			log.error("Executed verifyCreateScorecardLable Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnCreateMyKpi() {
		try {
			log.info("Entered clickOnCreateMyKpi");
			waitUntilElementToBeClickableRepeated(createMykpi_btn,2);
			try {
				log.info("Clicking createMykpi_btn");
				click(createMykpi_btn);
			} catch (org.openqa.selenium.StaleElementReferenceException e1) {
				log.info("Got StaleElementReference exception while cliking on CreateMyKPI button");
				log.info("Clicking createMykpi_btn in locating element again");
				click(webDriver.findElement(By.xpath(createMykpi_btn_loc)));
			} catch (org.openqa.selenium.WebDriverException e1) {
				log.info("Got Webdriver exception while cliking on CreateMyKPI button");
				log.info("Clicking createMykpi_btn in locating element again");
				click(webDriver.findElement(By.xpath(createMykpi_btn_loc)));
			}

			waitFor(1000);
			log.info("Executed clickOnCreateMyKpi Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnCreateMyKpi Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void ClickRadio_AggregateType2() {
		try {
			log.info("Entered ClickRadio_AggregateType2 Successfully");
			click(clkRadio_AggregateType2);
			log.info("Executed ClickRadio_AggregateType2 Successfully");
		} catch (Exception e) {
			log.error("Executed ClickRadio_AggregateType2 Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	
	public void clickOnCreateKpiForGroup() {
		try {
			log.info("Entered clickOnCreateKpiForGroup");
			log.info("Waiting for createGroupkpi_btn");
			waitUntilElementToBeClickableRepeated(createGroupkpi_btn,2);
			log.info("Clicking createGroupkpi_btn");
			click(createGroupkpi_btn);
			log.info("Executed clickOnCreateKpiForGroup Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnCreateKpiForGroup Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	public void verifyCreatekpiLable() {
		try {
			log.info("Entered verifyCreatekpiLable");
			Assert.assertEquals(createKpi_lbl.getText(), "Create KPI");
			log.info("Executed verifyCreatekpiLable Successfully");
		} catch (Exception e) {
			log.error("Executed verifyCreatekpiLable Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getKpiName(String kpiname) {
		try {
			log.info("Entered getKpiName");
			log.info("Waiting for kpiName_txt");
			waitUntilElementVisibleRepeated(kpiName_txt,4);
			log.info("Writing in kpiName_txt: "+kpiname);
			writeText(kpiName_txt, kpiname);
			log.info("Executed getKpiName Successfully");
		} catch (Exception e) {
			log.error("Executed getKpiName Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getGroupKpiName(String gkpiname) {
		try {
			log.info("Entered getGroupKpiName");
			waitFor(400);
			log.info("Waiting for groupkpiName_txt");
			waitUntilElementVisibleRepeated(groupkpiName_txt,2);
			log.info("Writing in groupkpiName_txt: "+gkpiname);
			writeText(groupkpiName_txt, gkpiname);
			log.info("Executed getGroupKpiName Successfully");
		} catch (Exception e) {
			log.error("Executed getGroupKpiName Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getDescription(String description) {
		try {
			log.info("Entered getDescription");
			log.info("Writing in indvdescription_txt: "+description);
			writeText(indvdescription_txt, description);
			log.info("Executed getDescription Successfully");
		} catch (Exception e) {
			log.error("Executed getDescription Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getGroupDescription(String description) {
		try {
			log.info("Entered getGroupDescription");
			log.info("Writing in groupDesc_txt: "+description);
			writeText(groupDesc_txt, description);
			log.info("Executed getGroupDescription Successfully");
		} catch (Exception e) {
			log.error("Executed getGroupDescription Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getWeightage(String weightage) {
		try {
			log.info("Entered getWeightage");
			log.info("Writing in indvweightage_txt: "+weightage);
			writeText(indvweightage_txt, weightage);
			log.info("Executed getWeightage Successfully");
		} catch (Exception e) {
			log.error("Executed getWeightage Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getGroupWeightage(String wieghtage) {
		try {
			log.info("Entered getGroupWeightage");
			log.info("Writing in groupweightage_txt: "+wieghtage);
			writeText(groupweightage_txt, wieghtage);
			log.info("Executed getGroupWeightage Successfully");
		} catch (Exception e) {
			log.error("Executed getGroupWeightage Not Successfully");
			e.printStackTrace();
			throw e;
		}

	}

	public void clickOnNext() {
		try {
			log.info("Entered clickOnNext");
			log.info("Clicking next_Btn");
			click(next_Btn);
			waitFor(2000);
			log.info("Executed clickOnNext Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnNext Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getTarget(String target) {
		try {
			log.info("Entered getTarget");
			log.info("Writing in target_txt: "+target);
			writeText1(target_txt, target);
			log.info("Executed getTarget Successfully");
		} catch (Exception e) {
			log.error("Executed getTarget Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void setTargetDate(int year, int month, int day) {
		try{
			log.info("Entered set_targetDate succesfully");
			waitFor(2000);
			setDateInDatePicker(set_targetDate, year, month, day);
			log.info("Executed set_targetDate Successfully");
		} catch (Exception e) 
		{
			log.error("Not Executed set_targetDate");
			e.printStackTrace(); 
			throw e;
		}
	}
	
	public void getPerspective(String perspective) {
		try {
			log.info("Entered getPerspective");
			log.info("Clicking perspective_txt");
			//waitUntilElementToBeClickableRepeated(perspective_txt,2);
			waitFor(4000);
			click(perspective_txt);
			for (int i = 0; i < perspective_list.size(); i++) {
				WebElement allwebElement = perspective_list.get(i);
				String prseptve = allwebElement.getText();

				if (perspective.equalsIgnoreCase(prseptve)) {
					log.info("Waiting for allwebElement");
					waitUntilElementToBeClickable(allwebElement);
					log.info("Clicking allwebElement");
					click(allwebElement);
				} else {
					System.out.println("Perspective field is not displayed");
				}
				log.info("entered perspective!!");
			}
			log.info("Executed getPerspective Successfully");
		} catch (Exception e) {
			log.error("Executed getPerspective Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getGroupPerspective(String perspective) {
		try {
			log.info("Entered getGroupPerspective");
			log.info("Clicking groupperspective_txt");
			click(groupperspective_txt);
			waitFor(3000);
			for (int i = 0; i < groupPrespective_list.size(); i++) {
				if ((groupPrespective_list.get(i).getText().equalsIgnoreCase(perspective))) {
					log.info("Clicking groupPrespective_list.get("+i+")");
					click(groupPrespective_list.get(i));
				} else {
					System.out.println("Group Perspective field is not displayed");
				}
			}log.info("selected group perspective");
			log.info("Executed getGroupPerspective Successfully");
		} catch (Exception e) {
			log.error("Executed getGroupPerspective Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getParentGroupKpiName(String groupkpiname) {
		try {
			log.info("Entered getParentGroupKpiName");
			log.info("Waiting for parentGrp_dd");
			waitUntilElementToBeClickable(parentGrp_dd);
			log.info("Selecting value in parentGrp_dd dropdown: "+groupkpiname);
			setValueInDropdownText(parentGrp_dd, groupkpiname);
			log.info("Executed getParentGroupKpiName Successfully");
		} catch (Exception e) {
			log.error("Executed getParentGroupKpiName Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getGroupKpiDropDown(String grpname) {
		try {
			log.info("Entered getGroupKpiDropDown");
			log.info("Writing in grp_kpi_txt: "+grpname);
			writeText(grp_kpi_txt, grpname);

			log.info("Executed getGroupKpiDropDown Successfully");
		} catch (Exception e) {
			log.error("Executed getGroupKpiDropDown Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getUom(String value) {
		try {
			log.info("Entered getUom");
			log.info("Selecting value in umo_dd dropdown: "+value);
			setValueInDropdownText(umo_dd, value);
			log.info("Executed getUom Successfully");
		} catch (Exception e) {
			log.error("Executed getUom Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getDateTarget(int year, int month, int day) {
		try {
			log.info("Entered getDateTarget");
			setDateInDatePicker(target_txt, year, month, day);
			log.info("Executed getDateTarget Successfully");
		} catch (Exception e) {
			log.error("Executed getDateTarget Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getscaleData(int count, String scaledata) {
		try {
			log.info("Entered getscaleData");
			if (count != 3) {
				WebElement scale = webDriver.findElement(By.xpath(scaleData + "[" + count + "]"));
				if (scale.isEnabled()) {
					log.info("Writing in scale: "+scaledata);
					writeText(scale, scaledata);
					log.info("entered scale data!!");
				} else {
					log.info("field is disable");
				}
			} else {
				log.info("It's L3");
			}
			log.info("Executed getscaleData Successfully");
		} catch (Exception e) {
			log.error("Executed getscaleData Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getscaleDataInDate(int count, int year, int month, int day) {
		try {
			log.info("Entered getscaleDataInDate");
			WebElement scale = webDriver.findElement(By.xpath(scaleData + "[" + count + "]"));
			if (scale.isEnabled()) {
				setDateInDatePicker(scale, year, month, day);
				log.info("entered date in scale");
			} else {
				log.info("field is disable");
			}
			log.info("Executed getscaleDataInDate Successfully");
		} catch (Exception e) {
			log.error("Executed getscaleDataInDate Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void howOftenNeedToUpdateActual(String value) {
		try {
			log.info("Entered howOftenNeedToUpdateActual");
			log.info("Waiting for drpdw_KPI");
//			waitUntilElementVisibleRepeated(drpdw_KPI,2);
			if (value.equalsIgnoreCase("Monthly")) {
				log.info("Selecting value in drpdw_KPI dropdown: "+value);
				setValueInDropdownText(drpdw_KPI, value);
				if (!drpdw_KPI.getText().equalsIgnoreCase("Monthly")) {
					log.info("Selecting value in drpdw_KPI dropdown: "+value);
					setValueInDropdownText(drpdw_KPI, value);
				} else {
				}
			} else if (value.equalsIgnoreCase("Quarterly")) {
				log.info("Selecting value in drpdw_KPI dropdown: "+value);
				setValueInDropdownText(drpdw_KPI, value);
			} else if (value.equalsIgnoreCase("Half Yearly")) {
				log.info("Selecting value in drpdw_KPI dropdown: "+value);
				setValueInDropdownText(drpdw_KPI, value);
			} else if (value.equalsIgnoreCase("Once (For whole program duration)")) {
				log.info("Selecting value in drpdw_KPI dropdown: "+value);
				setValueInDropdownText(drpdw_KPI, value);
			}
			log.info("Executed howOftenNeedToUpdateActual Successfully");
		} catch (Exception e) {
			log.error("Executed howOftenNeedToUpdateActual Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getMyTargetsAddsUp(String summationValue) {
		try {
			log.info("Entered getMyTargetsAddsUp");
			if (Summation == Integer.parseInt(summationValue)) {
				log.info("Waiting for myTargetsAddsUp_rd");
//				waitUntilElementVisibleRepeated(myTargetsAddsUp_rd,2);
				log.info("Clicking myTargetsAddsUp_rd");
				click(myTargetsAddsUp_rd);
			} else {
				System.out.println("My Target Adds Up are unchecked hence creating constant kpi");
			}
			log.info("Executed getMyTargetsAddsUp Successfully");
		} catch (NumberFormatException e) {
			log.error("Executed getMyTargetsAddsUp Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnCreateKpi() {
		try {
			log.info("Entered clickOnCreateKpi");
			waitFor(400);
			log.info("Waiting for createKpi_Btn");
			waitUntilElementVisibleRepeated(createKpi_Btn,2);
			log.info("Clicking createKpi_Btn");
			clickOnElementByJs(createKpi_Btn);
			waitForMessage("KPI Created");
			log.info("Waiting for createMykpi_btn");
			waitUntilElementVisibleRepeated(createMykpi_btn,2);
			log.info("Executed clickOnCreateKpi Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnCreateKpi Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnCreateGroupKpi() {
		try {
			log.info("Entered clickOnCreateGroupKpi");
			log.info("Waiting for createGroupkpi_btn");
			waitUntilElementToBeClickable(createGroupkpi_btn);
			log.info("Clicking createGroupkpi_btn");
			click(createGroupkpi_btn);
			log.info("Executed clickOnCreateGroupKpi Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnCreateGroupKpi Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnCreate() {
		try {
			log.info("Entered clickOnCreate");
			log.info("Waiting for clickOnCreateGroupKpi_btn");
			waitUntilElementToBeClickable(clickOnCreateGroupKpi_btn);
			log.info("Clicking clickOnCreateGroupKpi_btn");
			click(clickOnCreateGroupKpi_btn);
			log.info("Executed clickOnCreate Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnCreate Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnSubmitScorecard() {
		try {
			log.info("Entered clickOnSubmitScorecard");
			waitFor(1500);
			scroll(webDriver, "down");
			log.info("Waiting for submitScorecard_Btn");
			waitUntilElementToBeClickable(submitScorecard_Btn);
			log.info("Clicking submitScorecard_Btn");
			click(submitScorecard_Btn);
			log.info("Executed clickOnSubmitScorecard Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnSubmitScorecard Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnSubmit() {
		try {
			log.info("Entered clickOnSubmit");
			log.info("Waiting for submit_btn");
			waitUntilElementToBeClickable(submit_btn);
			log.info("Clicking submit_btn");
			click(submit_btn);
			waitFor(3000);
			log.info("Executed clickOnSubmit Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnSubmit Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	// Resubmit

	public void clickOnViewSendback() {
		try {
			log.info("Entered clickOnViewSendback");
			Assert.assertTrue(viewSendBack_btn.isDisplayed(),
					"sendback comment  label is not matching hence >>> Failed");
			log.info("Executed clickOnViewSendback Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnViewSendback Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void verifySendBackComment() {
		try {
			log.info("Entered verifySendBackComment");
			waitFor(3000);
			WebElement viewSendBackComment_lbl = webDriver
					.findElement(By.xpath("//div[contains(text(),'Rejecting kpi')]"));
			System.out.println(viewSendBackComment_lbl.getText());
			Assert.assertTrue(viewSendBackComment_lbl.getText().equalsIgnoreCase("Rejecting kpi"),
					"sendback comment is not matching hence >>> Failed");
			log.info("Executed verifySendBackComment Successfully");
		} catch (Exception e) {
			log.error("Executed verifySendBackComment Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void veifySendbackAllComment() {
		try {
			log.info("Entered veifySendbackAllComment");
			waitFor(3000);
			Assert.assertTrue(viewSendBackAllComment_lbl.isDisplayed(),
					"Sendback All comment is not matching hence >>> Failed");
			log.info("Executed veifySendbackAllComment Successfully");
		} catch (Exception e) {
			log.error("Executed veifySendbackAllComment Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnEditChildKpi() {
		try {
			log.info("Entered clickOnEditChildKpi");
			scroll(webDriver, "down");
			actionWithMouseOnElement(editChildKpiTab);
			log.info("Waiting for editChildKpi");
			waitUntilElementToBeClickable(editChildKpi);
			log.info("Clicking editChildKpi");
			click(editChildKpi);
			log.info("Executed clickOnEditChildKpi Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnEditChildKpi Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getUpdateButton() {
		try {
			log.info("Entered getUpdateButton");
			// waitUntilElementToBeClickable(updateKpi_btn);
			waitFor(6000);
			log.info("Clicking updateKpi_btn");
			click(updateKpi_btn);
			waitForMessage("KPI Updated Successfully");
			log.info("clicked on update button!!");
			waitForPageLoad();
			log.info("Executed getUpdateButton Successfully");
		} catch (Exception e) {
			log.error("Executed getUpdateButton Not Successfully");
			e.printStackTrace();
			throw e;
		}

	}
/*
	public void editTheIndiviualKpi(int number) {
		try {
			waitFor(3000);
			WebElement btn_editKpiTab = webDriver.findElement(By.xpath(btn_editKpiTabXpath + "[" + number + "]"));
			ScrollUpToElement(btn_editKpiTab);
			actionWithMouseOnElement(btn_editKpiTab);
			WebElement btn_editKpibutton = webDriver
					.findElement(By.xpath(btn_editKpibuttonXapth + "[" + number + "]" + "/i[3]"));
			//waitUntilElementToBeClickable(btn_editKpibutton);
			//click(btn_editKpibutton);
			clickOnElementByJs(btn_editKpibutton);
			waitFor(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteTheIndiviualKpi(int number) {
		try {
			waitFor(3000);
			WebElement btn_editKpiTab = webDriver.findElement(By.xpath(btn_editKpiTabXpath + "[" + number + "]"));
			ScrollUpToElement(btn_editKpiTab);
			actionWithMouseOnElement(btn_editKpiTab);
			WebElement btn_deleteKpibutton = webDriver
					.findElement(By.xpath(btn_editKpibuttonXapth + "[" + number + "]" + "/i[4]"));
			waitUntilElementToBeClickable(btn_deleteKpibutton);
			click(btn_deleteKpibutton);
			waitUntilElementVisible(ok_btn);
			click(ok_btn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	public void editTheIndiviualKpi(String kpiName) {
		try {
			log.info("Entered editTheIndiviualKpi");
			waitFor(3000);
			int number = 1;
			int total = webDriver.findElements(By.xpath(btn_editKpiTabXpath + "[*]")).size();
			for (int i=1;i<=total;i++) {
				String temp = webDriver.findElement(By.xpath(btn_editKpiTabXpath + "[" + i + "]")).getText();
				String currentKpi = temp.substring(0,temp.indexOf("\n"));
				if (currentKpi.trim().equalsIgnoreCase(kpiName)) {
					number = i;
					break;
				}
			}

			WebElement btn_editKpiTab = webDriver.findElement(By.xpath(btn_editKpiTabXpath + "[" + number + "]"));
			ScrollUpToElement(btn_editKpiTab);
			actionWithMouseOnElement(btn_editKpiTab);
			WebElement btn_editKpibutton = webDriver
					.findElement(By.xpath(btn_editKpibuttonXapth + "[" + number + "]" + "/i[3]"));
			//waitUntilElementToBeClickable(btn_editKpibutton);
			//click(btn_editKpibutton);
			log.info("Clicking btn_editKpibutton");
			clickOnElementByJs(btn_editKpibutton);
			waitFor(3000);
			log.info("Executed editTheIndiviualKpi Successfully");
		} catch (Exception e) {
			log.error("Executed editTheIndiviualKpi Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void deleteTheIndiviualKpi(String kpiName) {
		try {
			log.info("Entered deleteTheIndiviualKpi");
			waitFor(3000);

			log.info("deleting the individual kpi!!");
			int number = 1;
			int total = webDriver.findElements(By.xpath(btn_editKpiTabXpath + "[*]")).size();
			for (int i=1;i<=total;i++) {
				String temp = webDriver.findElement(By.xpath(btn_editKpiTabXpath + "[" + i + "]")).getText();
				String currentKpi = temp.substring(0,temp.indexOf("\n"));
				if (currentKpi.trim().equalsIgnoreCase(kpiName)) {
					number = i;
					break;
				}
			}

			WebElement btn_editKpiTab = webDriver.findElement(By.xpath(btn_editKpiTabXpath + "[" + number + "]"));
			ScrollUpToElement(btn_editKpiTab);
			actionWithMouseOnElement(btn_editKpiTab);
			WebElement btn_deleteKpibutton = webDriver
					.findElement(By.xpath(btn_editKpibuttonXapth + "[" + number + "]" + "/i[4]"));
			log.info("Waiting for btn_deleteKpibutton");
			waitUntilElementToBeClickable(btn_deleteKpibutton);
			log.info("Clicking btn_deleteKpibutton");
			click(btn_deleteKpibutton);
			log.info("Waiting for ok_btn");
			waitUntilElementVisible(ok_btn);
			log.info("Clicking ok_btn");
			click(ok_btn);
			waitForMessage("Deleted successfully");
			log.info("Executed deleteTheIndiviualKpi Successfully");
		} catch (Exception e) {
			log.error("Executed deleteTheIndiviualKpi Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}


	public void getEditDesc(String editKPIdesc) {
		try {
			log.info("Entered getEditDesc");
			log.info("Waiting for editIndvdescription_txt");
			waitUntilElementVisible(editIndvdescription_txt);
			log.info("Writing in editIndvdescription_txt: "+editKPIdesc);
			writeText(editIndvdescription_txt, editKPIdesc);
			log.info("Executed getEditDesc Successfully");
		} catch (Exception e) {
			log.error("Executed getEditDesc Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getEditwtg(String editKPIwtg) {
		try {
			log.info("Entered getEditwtg");
			log.info("Waiting for editIndvweightage_txt");
			waitUntilElementVisible(editIndvweightage_txt);
			log.info("Writing in editIndvweightage_txt: "+editKPIwtg);
			writeText(editIndvweightage_txt, editKPIwtg);
			log.info("Executed getEditwtg Successfully");
		} catch (Exception e) {
			log.error("Executed getEditwtg Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getEditTarget(String editKPITarget) {
		try {
			log.info("Entered getEditTarget");
			log.info("Waiting for editTarget_txt");
			waitUntilElementVisible(editTarget_txt);
			log.info("Writing in editTarget_txt: "+editKPITarget);
			writeText(editTarget_txt, editKPITarget);
			log.info("Executed getEditTarget Successfully");
		} catch (Exception e) {
			log.error("Executed getEditTarget Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void getEditMyTargetsAddsUp(String summationValue) {
		try {
			log.info("Entered getEditMyTargetsAddsUp");
			if (Summation == Integer.parseInt(summationValue)) {
				log.info("Clicking EditTargetAddsUp_rd");
				click(EditTargetAddsUp_rd);
				waitFor(3000);
			} else {
				System.out.println("My Target Adds Up are unchecked hence creating constant kpi");
			}
			log.info("Executed getEditMyTargetsAddsUp Successfully");
		} catch (NumberFormatException e) {
			log.error("Executed getEditMyTargetsAddsUp Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void verifySupervisorInTakeKpiFromSupervisor(String supervisor) {
		try {
			log.info("Entered verifySupervisorInTakeKpiFromSupervisor");
			log.info("Waiting for supervisor name to appear in Take Kpi from Superviser page!!!");
			waitUntilElementVisible(lbl_takeKpiSupervisorName);
			log.info("Verifing supervisor name " +supervisor + " to appear in Take Kpi from Superviser page !!!");
			Assert.assertEquals(lbl_takeKpiSupervisorName.getText(), supervisor,
					"supervisor not matching hence >>> Failed");
			log.info("Executed verifySupervisorInTakeKpiFromSupervisor Successfully");
		} catch (Exception e) {
			log.error("Executed verifySupervisorInTakeKpiFromSupervisor Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	//multiple strategy
	public void VerifyGroupKpiOptionForSelectedStrategy(String perspectiveName)
	{
		try 
		{
			log.info("Entered VerifyGroupKpiOptionForSelectedStrategy");
			waitFor(2000);
			for (int i = 0; i < 2; i++ ){
				log.info("Checking if verify_parentGrp_dd size is 1");
				if (verify_parentGrp_dd.size()==1) {
					break;
				}
				waitFor(500);
			}
			assertTrue(verify_parentGrp_dd.size()==1, "group kpi option is not avalibale for perspective "+perspectiveName);
			log.info("Executed VerifyGroupKpiOptionForSelectedStrategy Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyGroupKpiOptionForSelectedStrategy Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyGroupKpiOptionForSelectedStrategAfterDisabley()
	{
		try 
		{
			log.info("Entered VerifyGroupKpiOptionForSelectedStrategAfterDisabley");
			waitFor(2000);
			assertTrue(verify_parentGrp_dd.size()==0, "group kpi option is not avalibale");
			log.info("Executed VerifyGroupKpiOptionForSelectedStrategAfterDisabley Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyGroupKpiOptionForSelectedStrategAfterDisabley Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyMultipleStrategyLabel()
	{
		try 
		{	log.info("Entered VerifyMultipleStrategyLabel");
			waitFor(1500);
			assertTrue(MultipleStrategy_lbl.size()==1, "Multiple strategy label is missing");
			log.info("Executed VerifyMultipleStrategyLabel Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyMultipleStrategyLabel Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	//systemkpi
	
	public void verifyWhetherKpiIsSystemKpi(String kpiname)
	{
		try 
		{
			log.info("Entered verifyWhetherKpiIsSystemKpi");
			WebElement kpi = webDriver.findElement(By.xpath("//p[contains(text(), '"+kpiname+"')]/../following-sibling::div[1]/span[1]"));		
			assertTrue(kpi.getText().equalsIgnoreCase("System"), "hence kpi is not system kpi");
			log.info("Executed verifyWhetherKpiIsSystemKpi Successfully");
		} catch (Exception e) {
			log.error("Executed verifyWhetherKpiIsSystemKpi Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyThedeleteOptionForSystemKpi(String kpiname)
	{
		try 
		{	log.info("Entered VerifyThedeleteOptionForSystemKpi");
			waitFor(2000);
			int number = 1;
			int total = webDriver.findElements(By.xpath(btn_editKpiTabXpath + "[*]")).size();
			for (int i=1;i<=total;i++) {
				String temp = webDriver.findElement(By.xpath(btn_editKpiTabXpath + "[" + i + "]")).getText();
				System.out.println(temp);
				String currentKpi = temp.substring(0,temp.indexOf("\n"));
				System.out.println(currentKpi);
				if (currentKpi.trim().equalsIgnoreCase(kpiname)) {
					number = i;
					break;
				}
			}
			WebElement btn_editKpiTab = webDriver.findElement(By.xpath(btn_editKpiTabXpath + "[" + number + "]"));
			ScrollUpToElement(btn_editKpiTab);
			actionWithMouseOnElement(btn_editKpiTab);
			List<WebElement> btn_deleteKpibutton = webDriver
					.findElements(By.xpath(btn_editKpibuttonXapth + "[" + number + "]" + "/i[4]"));
			assertTrue(btn_deleteKpibutton.size()==0, "delete option is present for the system kpi ");
			log.info("Executed VerifyThedeleteOptionForSystemKpi Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyThedeleteOptionForSystemKpi Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyTheeditOptionForSystemKpi(String kpiname)
	{
		try 
		{	log.info("Entered VerifyTheeditOptionForSystemKpi");
			waitFor(3000);
			int number = 1;
			int total = webDriver.findElements(By.xpath(btn_editKpiTabXpath + "[*]")).size();
			for (int i=1;i<=total;i++) {
				String temp = webDriver.findElement(By.xpath(btn_editKpiTabXpath + "[" + i + "]")).getText();
				System.out.println(temp);
				String currentKpi = temp.substring(0,temp.indexOf("\n"));
				System.out.println(currentKpi);
				if (currentKpi.trim().equalsIgnoreCase(kpiname)) {
					number = i;
					break;
				}
			}
			WebElement btn_editKpiTab = webDriver.findElement(By.xpath(btn_editKpiTabXpath + "[" + number + "]"));
			ScrollUpToElement(btn_editKpiTab);
			actionWithMouseOnElement(btn_editKpiTab);
			List<WebElement> btn_deleteKpibutton = webDriver
					.findElements(By.xpath(btn_editKpibuttonXapth + "[" + number + "]" + "/i[3]"));
			assertTrue(btn_deleteKpibutton.size()==0, "edit  option is present for the system kpi--hence failed ");
			log.info("Executed VerifyTheeditOptionForSystemKpi Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyTheeditOptionForSystemKpi Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifySystemKpiIsDeleted(String kpiname)
	{
		try {

			log.info("Entered VerifySystemKpiIsDeleted");
			boolean value=true;
			List<WebElement> totalKpis = webDriver.findElements(By.xpath(btn_editKpiTabXpath + "[*]"));
			
			Iterator<WebElement> listofallkpis = totalKpis.iterator();
			while(listofallkpis.hasNext())
			{
				String temp=listofallkpis.next().getText();
				System.out.println(temp);
				String currentKpi = temp.substring(0,temp.indexOf("\n"));
				System.out.println(currentKpi);
				if(currentKpi.equalsIgnoreCase(kpiname))
				{
					value=false;
				}
				
			}
			assertTrue(value, "since system kpi is deleted but still its present in the list");


			log.info("Executed VerifySystemKpiIsDeleted Successfully");
		} catch (Exception e) {
			log.error("Executed VerifySystemKpiIsDeleted Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	public void VerifyTheScorecardSummaryDetails(String totlwtg,String Noofkpimin,String noofkpimax,String kpifromsup,String datebasedkpi,String SystemKpi )
	{
		try 
		{
			log.info("Entered VerifyTheScorecardSummaryDetails");
			//totalweightage
			assertTrue(Total_wtg_txt.getText().contains(totlwtg), "total weightage is not proper hence failed");
			
			//noofkpiformin
			String[] numbers=Noof_Kpi_txt.getText().split("-");
			System.out.println(numbers[0]);
			assertTrue(numbers[0].contains(Noofkpimin), "min number of kpi is not proper hence failed");
			
			//max
			assertTrue(numbers[1].contains(noofkpimax), "max number of kpi is not proper hence failed");
			
			//kpifromsupervisor
			assertTrue(KPI_FROM_SUPERVISOR_txt.getText().contains(kpifromsup), "Kpi from supervisor data not proper hence failed");
			
			//datebasedkpi
			assertTrue(Datebased_KPI_txt.getText().contains(datebasedkpi), "date based kpi  is not proper hence failed");
			
			//systemkpi
			assertTrue(System_KPI_txt.getText().contains(SystemKpi), "system kpi  is not proper hence failed");

			log.info("Executed VerifyTheScorecardSummaryDetails Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyTheScorecardSummaryDetails Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
	
	/*
	 * public void editTheKpiForReflect(int i) { try { scrollUpAndDown(100);
	 * waitFor(3000);
	 * actionWithMouseOnElement(btn_editKpiTabForKpi_kpiRelationship.get(i));
	 * waitUntilElementToBeClickable(btn_editKpibuttonForKpi_KpiRelationship.get(i))
	 * ; click(btn_editKpibuttonForKpi_KpiRelationship.get(i)); waitFor(3000);
	 *
	 * } catch (Exception e) { e.printStackTrace(); } } public void
	 * editTheKpiForConvertToSupport(int i) { try { scrollUpAndDown(100);
	 * waitFor(3000);
	 * actionWithMouseOnElement(btn_editKpiTabForKpi_kpiRelationship.get(i));
	 * waitUntilElementToBeClickable(btn_editKpibuttonForKpi_KpiRelationship.get(i))
	 * ; click(btn_editKpibuttonForKpi_KpiRelationship.get(i)); waitFor(3000);
	 *
	 * } catch (Exception e) { e.printStackTrace(); } } public void
	 * editTheKpiForReset(int i) { try { scrollUpAndDown(100); waitFor(3000);
	 * ScrollUpToElement(btn_editKpiTabForKpi_kpiRelationship.get(i-1));
	 * actionWithMouseOnElement(btn_editKpiTabForKpi_kpiRelationship.get(i));
	 * waitUntilElementToBeClickable(btn_editKpibuttonForKpi_KpiRelationship.get(i))
	 * ; click(btn_editKpibuttonForKpi_KpiRelationship.get(i)); waitFor(3000);
	 *
	 * } catch (Exception e) { e.printStackTrace(); } }
	 */

}
