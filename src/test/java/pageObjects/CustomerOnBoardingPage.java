package pageObjects;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import helper.LoggerHelper;

public class CustomerOnBoardingPage extends BasePage {


	public CustomerOnBoardingPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[.='Customer On Boarding']")
	private WebElement cob_lnk;

	@FindBy(how = How.XPATH, using = "//a[.='Download template. ']")
	private WebElement downloadTemplaate_lnk;

	@FindBy(how = How.XPATH, using = "//input[@name='cobFileBrowse']")
	private WebElement browse_btn;

	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Enter comments']")
	private WebElement enterComments;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Upload')]")
	private WebElement upload_btn;

	@FindBy(how = How.XPATH, using = "(//div[@class='w-100 p-2 grid-details ng-star-inserted'][1]/div)[3]")
	private WebElement upload_status;

	@FindBy(how = How.XPATH, using = "(//div[@class='w-100 p-2 grid-details ng-star-inserted'][1]/div)[4]")
	private WebElement upload_message;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Refresh')]")
	private WebElement refresh_btn;

	@FindBy(how = How.XPATH, using = "//h6[contains(@ng-reflect-ngb-tooltip,'Click for more options')]")
	private WebElement more_btn;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Upload')]")
	private WebElement upload_in_more;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'AutomationOrgUnit')]")
	private WebElement AddedOrganizationUnit;

	@FindBy(how = How.XPATH, using = "//p")
	private List<WebElement> OrganizationUnits;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Org Unit')]")
	private WebElement AddOrganizationUnit;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Automation Test')]")
	private WebElement AddedOrganizationCateogry;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Organization Unit')]")
	private WebElement OrganizationUnitLink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Position')]")
	private WebElement PositionLink;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'AutomationTest')]")
	private WebElement AddedPosition;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'AutomationDesigantion')]")
	private WebElement AddedDesignation;

	@FindBy(how = How.XPATH, using = "//toolsmenu/div/div[2]/div/div[1]/h6")
	private List<WebElement> Designations;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Designation')]")
	private WebElement AddDesignation;

	@FindBy(how = How.XPATH, using = "//div[@class='w-100 float-left mt-3']//h6[contains(text(),'Automation')]")
	private WebElement AddedEmployementType;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Automation')]")
	private WebElement AdddedJobCategory;

	@FindBy(how = How.XPATH, using = "(//h6[contains(text(),'Automation')])[1]")
	private WebElement AdddedJobGrade;

	@FindBy(how = How.XPATH, using = "//div[@class='col-lg-2 col-md-2 col-sm-1 col-xs-1 float-left']//h6[contains(text(),' Automation')]")
	private WebElement AdddedEmployeeCustomEntity;

	public void clickOnCustomerOnBoarding() {
		try {
			log.info("Entered clickOnCustomerOnBoarding");
			log.info("clicking on COB!!");
			waitUntilElementToBeClickableRepeated(cob_lnk, 2);
			click(cob_lnk);
			waitFor(3000);
			log.info("clicked on COB!!");
			log.info("Executed clickOnCustomerOnBoarding Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnCustomerOnBoarding Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickOnDownloadTemplate() {
		try {
			log.info("Entered clickOnDownloadTemplate");
			log.info("clicking on download");
			click(downloadTemplaate_lnk);
			log.info("clicked on download");
			waitFor(3000);
			log.info("Executed clickOnDownloadTemplate Successfully");
		} catch (Exception e) {
			log.error("Executed clickOnDownloadTemplate Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void checkForDownloadTemplate(String downloadpath) {
		try {
		log.info("Entered checkForDownloadTemplate");
			File downloadedFolder = new File(downloadpath);
			File[] files = downloadedFolder.listFiles();
			for (int i = 0; i < files.length; i++) {
				if (files[i].getName().equalsIgnoreCase("customerOnBoarding.XLSX")) {

					System.out.println("file downloaded succesfully");
				}
			}
			log.info("Executed checkForDownloadTemplate Successfully");
		} catch (Exception e) {
			log.error("Executed checkForDownloadTemplate Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void UploadCobFile(String cobfile) throws Exception {
		try {
			log.info("Entered UploadCobFile");
			String abspath1 = new File(cobfile).getAbsolutePath();
			String abspath2 = abspath1.replace("\\", "\\\\");
			System.out.println(abspath2);
			browse_btn.sendKeys(abspath2);
			waitFor(3000);
			log.info("Entering comments COB FILE UPLOAD");
			writeText(enterComments, "COB FILE UPLOAD");
			log.info("Entered comments COB FILE UPLOAD");
			if (upload_btn.isDisplayed()) {
				log.info("Clicking UPLOAD");
				click(upload_btn);
				log.info("Clicked UPLOAD");
//				waitFor(3000);
			}
			waitFor(3000);
			waitUntilElementVisible(upload_status);
			if (upload_status.getText().equalsIgnoreCase("Started")) {
				Assert.assertTrue(upload_status.getText().contains("Started"),
						"upload not starting");
				log.info("clicking on refresh!!");
				click(refresh_btn);
				log.info("clicked on refresh!!");
				waitFor(3000);
				if (upload_status.getText().equalsIgnoreCase("Validated")) {
					Assert.assertTrue(upload_status.getText().contains("Validated"),
							"upload not Validated");					
					waitFor(3000);
					log.info("clicking on more!!");
					click(more_btn);
					waitFor(3000);
					log.info("clicking on upload!!");
					click(upload_in_more);
					waitUntilElementToBeClickable(refresh_btn);
					click(refresh_btn);
					waitFor(3000);
					if (upload_status.getText().equalsIgnoreCase("Success")) {
						Assert.assertTrue(upload_status.getText().contains("Success"),
								"upload not Success");
						log.info("cob file uplaoded!!");
						System.out.println("COB file uploaded succesfully");
					}
				}
			}
			System.out.println("status of file upload" + ":-" + upload_status.getText() + "," + upload_message.getText());
			log.info("Executed UploadCobFile Successfully");
		} catch (Exception e) {
			log.error("Executed UploadCobFile Not Successfully");
			e.printStackTrace();
			throw e;
		}

	}

	public void VerifyAddedOrganizatonunit(String ExpectedOrganizationUnit) {
		try {
			log.info("Entered VerifyAddedOrganizatonunit");
			waitUntilElementToBeClickableRepeated(OrganizationUnitLink, 2);
			log.info("Clicking OrganizationUnitLink");
			click(OrganizationUnitLink);
			//waitFor(3000);
			log.info("Waiting for AddOrganizationUnit");
			waitUntilElementToBeClickableRepeated(AddOrganizationUnit, 2);

			ArrayList<String> actualOrgUnits = new ArrayList<String>();
			boolean isOrgUnitFound = false;
			for (WebElement orgUnitElmt:OrganizationUnits) {
				String orgUnit = orgUnitElmt.getText().trim();
				if (ExpectedOrganizationUnit.equalsIgnoreCase(orgUnit)) {
					isOrgUnitFound = true;
					break;
				}
				actualOrgUnits.add(orgUnit);
			}
			log.info("Assertion expeted: ExpectedOrganizationUnit, actual: "+actualOrgUnits);
			Assert.assertTrue(isOrgUnitFound,
					" Yes ,Added organization unit is not there, Expected: "+ExpectedOrganizationUnit
					+ ", Actual: " + actualOrgUnits);
			log.info("Executed VerifyAddedOrganizatonunit  Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyAddedOrganizatonunit Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void VerifyAddedOrganizatonCategory(String ExpectedOrganizationCategory) {
		try {
			log.info("Entered VerifyAddedOrganizatonCategory");
			OrgCategory s = new OrgCategory(webDriver);
			log.info("Entered VerifyAddedOrganizatonCategory");
			s.clickOnOrgcategory();
			Assert.assertTrue(AddedOrganizationCateogry.getText().equalsIgnoreCase(ExpectedOrganizationCategory),
					"Added organization Category is not  there. Expected: " + ExpectedOrganizationCategory
					+ ", Actual: " + AddedOrganizationCateogry.getText());
			log.info("Executed VerifyAddedOrganizatonCategory Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyAddedOrganizatonCategory Not Successfully");
			e.printStackTrace();
			throw e;
		}

	}

	public void VerifyAddedPosition(String ExpectedPosition) {
		try {
			log.info("Entered VerifyAddedPosition");
			waitUntilElementToBeClickableRepeated(PositionLink, 2);
			log.info("Clicking PositionLink");
			click(PositionLink);
			log.info("Verifing Added Position exptd: "+ExpectedPosition+", actual: "+AddedPosition.getText());
			Assert.assertTrue(AddedPosition.getText().equalsIgnoreCase(ExpectedPosition),
					"Added Position link is not there");
			log.info("Executed VerifyAddedPosition Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyAddedPosition Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void verifyAddedDesignation(String expectedDesigantion) {
		try {
			log.info("Entered verifyAddedDesignation");
			Designation designation = new Designation(webDriver);
			designation.designationClick();
			waitUntilElementToBeLocatedRepeated(AddDesignation,2);
			ArrayList<String> actualDesigs = new ArrayList<String>();
			boolean isDesigFound = false;
			for (WebElement desigElmt:Designations) {
				String orgUnit = desigElmt.getText().trim();
				if (expectedDesigantion.equalsIgnoreCase(orgUnit)) {
					isDesigFound = true;
					break;
				}
				actualDesigs.add(orgUnit);
			}
			Assert.assertTrue(isDesigFound,
					"Added Designation is not there. Expected: " + expectedDesigantion
					+ ", Actual: " + actualDesigs);
			log.info("Executed verifyAddedDesignation Successfully");
		} catch (Exception e) {
			log.error("Executed verifyAddedDesignation Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void VerifyAddedEmployementType(String ExpectedEmployementType) {
		try {
			log.info("Entered VerifyAddedEmployementType");
			EmployementType employementType = new EmployementType(webDriver);
			employementType.employmentTypeLinkClick();
			Assert.assertTrue(AddedEmployementType.getText().trim().equalsIgnoreCase(ExpectedEmployementType),
					"Added EmploymentType is  not there. Expected " + ExpectedEmployementType
					+ ", Actual: " + AddedEmployementType.getText().trim());
			log.info("Executed VerifyAddedEmployementType Successfully");
		} catch (Exception e) {
			log.error("Executed VerifyAddedEmployementType Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void VerfiyAddedJobCategory(String ExpectedJobcategory) {
		try {
			log.info("Entered VerfiyAddedJobCategory");
			JobCategorypage jobCategory = new JobCategorypage(webDriver);
			jobCategory.clickOnJobCategoryLink();
			//waitFor(3000);
			waitUntilElementToBeLocatedRepeated(AdddedJobCategory, 2);
			String aa = AdddedJobCategory.getText().trim();
			System.out.println(aa);
			Assert.assertEquals(aa, ExpectedJobcategory, "Expected JobCategory: "+ExpectedJobcategory
					+ ", Actual JobCategory: "+aa);
			// Assert.assertTrue(AdddedJobCategory.getText().trim().equalsIgnoreCase(ExpectedJobcategory),
			// "added jobcategory is there");
			log.info("Executed VerfiyAddedJobCategory Successfully");
		} catch (Exception e) {
			log.error("Executed VerfiyAddedJobCategory Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void VerfiyAddedJobGrade(String ExpectedJobGrade) {
		try {
			log.info("Entered VerfiyAddedJobGrade");
				JobGradepage jobGrade = new JobGradepage(webDriver);
				jobGrade.clickOnjobGradeLink();
				Assert.assertTrue(AdddedJobGrade.getText().equalsIgnoreCase(ExpectedJobGrade),
						"added jobGrade is not there. Expected Job Grade: " + ExpectedJobGrade
						+ ", Actual Job Grade: " + AdddedJobGrade.getText());
			log.info("Executed VerfiyAddedJobGrade Successfully");
		} catch (Exception e) {
			log.error("Executed VerfiyAddedJobGrade Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void VerfiyAddedCustomEntity(String ExpectedCustomeEntity) {
		try {
			log.info("Entered VerfiyAddedCustomEntity");
			EmployeeCustomEntityPage CustomEntity = new EmployeeCustomEntityPage(webDriver);
			CustomEntity.clickOnEmployeeCustomEntity();
			//waitFor(3000);
			waitUntilElementToBeLocatedRepeated(AdddedEmployeeCustomEntity, 2);
			Assert.assertTrue(AdddedEmployeeCustomEntity.getText().equalsIgnoreCase(ExpectedCustomeEntity),
					"added EmoloyeeCustomEntity is not there. Expected Custom Entity: " + ExpectedCustomeEntity
					+ ", Actual Custom Entity: " + AdddedEmployeeCustomEntity.getText());
			log.info("Executed VerfiyAddedCustomEntity Successfully");
		} catch (Exception e) {
			log.error("Executed VerfiyAddedCustomEntity Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}
}
