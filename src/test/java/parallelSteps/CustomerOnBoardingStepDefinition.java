package parallelSteps;

import cucumber.api.java8.En;
import pageObjects.CustomerOnBoardingPage;
import util.TestContext;

public class CustomerOnBoardingStepDefinition implements En
{
	TestContext testcontext;
	CustomerOnBoardingPage customeronboadring;
	
	public CustomerOnBoardingStepDefinition(TestContext TestContext) 
	{
		this.testcontext=TestContext;
		this.customeronboadring=testcontext.getPageObjectManager().getCustomerOnBoardingPage();
		
		
		When("^user click on customer on boarding$", () -> 
		{
		  customeronboadring.clickOnCustomerOnBoarding();
		});
		
//		When("^user click on download$", () -> 
//		{
//		   customeronboadring.clickOnDownloadTemplate();
//		});
//		When("^check for file downloaded$", () -> 
//		{
//		   customeronboadring.checkForDownloadTemplate("C:\\Users\\dell\\Downloads");
//		});
		And("^user upload a COB file$", () -> {

			try {
//				customeronboadring.UploadCobFile("src\\test\\resources\\Data\\COB.xlsx");
				customeronboadring.UploadCobFile("C:\\Users\\Dell\\Downloads\\UPLOADED (8).xlsx");
//				customeronboadring.UploadCobFile("D:\\cucumber videos\\onedrive1\\Desktop\\COBAutomation.xlsx");

			} catch (Exception e) {
				e.printStackTrace();
			}

		});
		
//		When("^user upload a OrgUnit file$", () -> {
//
//			try {
////				customeronboadring.UploadCobFile("src\\test\\resources\\Data\\COBManual.xlsx");
//				customeronboadring.UploadCobFile("C:\\Users\\Dell\\Downloads\\UPLOADED (2).xlsx");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//
//		});
		
//		Given("^Check all the Onboarded menus are there or not$", () -> {
//
//			customeronboadring
//					.VerifyAddedOrganizatonunit(ExcelFileReader.getCellValue("COBAutomation.xlsx", "OrganizationUnit", 2, "B"));
//			customeronboadring
//					.VerifyAddedOrganizatonCategory(ExcelFileReader.getCellValue("COBAutomation.xlsx", "OrgCategory", 2, "B"));
//			customeronboadring.VerifyAddedPosition(ExcelFileReader.getCellValue("COBAutomation.xlsx", "Position", 2, "B"));
//			customeronboadring.verifyAddedDesignation(ExcelFileReader.getCellValue("COBAutomation.xlsx", "Designation", 2, "B"));
//			customeronboadring
//					.VerifyAddedEmployementType(ExcelFileReader.getCellValue("COBAutomation.xlsx", "EmploymentType", 2, "B"));
//			customeronboadring.VerfiyAddedJobCategory(ExcelFileReader.getCellValue("COBAutomation.xlsx", "JobCategory", 2, "B"));
//			customeronboadring
//					.VerfiyAddedCustomEntity(ExcelFileReader.getCellValue("COBAutomation.xlsx", "EmpCustomEntity", 2, "B"));
//
//		});
	
	}
	
}
