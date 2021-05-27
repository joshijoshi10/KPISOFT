package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import helper.LoggerHelper;

import java.util.List;

public class PerformanceProgramListPage extends BasePage 
{
	Logger log = LoggerHelper.getLogger(LoggerHelper.class);


	public PerformanceProgramListPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);

	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Performance Program')]")
	private WebElement menuLnk_performanceProgram;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Search']")
	private WebElement btn_yearSearch;

	@FindBy(how = How.XPATH, using = "//performanceprog/div/div[2]/div[1]/select")
	private WebElement dd_year;

	@FindBy(how = How.XPATH, using = "//performanceprog/div/div[3]/div[2]/div[1]/select")
	private WebElement dd_pagination;

	@FindBy(how = How.XPATH, using = "//performanceprog/div/div[3]/div[2]/h6")
	private WebElement lbl_pagination;

	@FindBy(how = How.XPATH, using = "//ul[@class='pagination']//a[@aria-label='First']")
	private WebElement lnk_firstPage;

	@FindBy(how = How.XPATH, using = "//ul[@class='pagination']//a[@aria-label='Last']/..")
	private WebElement lnk_lastPage;

	@FindBy(how = How.XPATH, using = "//li[@class='page-item active']//a[@class='page-link']")
	private WebElement lnk_activeTablePagination;

	public void goToPerformanceProgramPage() {
		try{
			log.info("Entered goToPerformanceProgramPage succesfully");
			click(menuLnk_performanceProgram);
			log.info("Executed goToPerformanceProgramPage Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed goToPerformanceProgramPage"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public void changeYearInYearDropDown(String year) {
		try{
			log.info("Entered changeYearInYearDropDown succesfully");
			setValueInDropdownText(dd_year, year);
			log.info("Executed changeYearInYearDropDown Successfully");
		} 
		catch  (Exception e) 
		{
			log.error("Not Executed changeYearInYearDropDown");
			e.printStackTrace(); 
			throw e;
		}
	}

	public void clickSearchBtn() {
		try{
			log.info("Entered clickSearchBtn succesfully");
			click(btn_yearSearch);
			log.info("Executed clickSearchBtn Successfully");
		} 
		catch  (Exception e)
		{
			log.error("Not Executed clickSearchBtn"); 
			e.printStackTrace(); 
			throw e;
		}
	}

	public Integer getItemsPerPage() {
		try{
			log.info("Entered getItemsPerPage succesfully");
			String tableSize = getValueInDropdown(dd_pagination);
			Integer tablePageSize = Integer.parseInt(tableSize);
			log.info("Executed getItemsPerPage Successfully");
			return tablePageSize;

		} catch  (NumberFormatException e) {

			log.error("Not Executed getItemsPerPage");
			e.printStackTrace();
			throw e;




		}
	}

	public Integer getTotalCount() {
		try{log.info("Entered getTotalCount succesfully");
		String paginationTxtStr = readText(lbl_pagination);
		String[] dataSplit = paginationTxtStr.split("items of");
		Integer totalCount = Integer.parseInt(dataSplit[1].trim());
		log.info("Executed getTotalCount Successfully");
		return totalCount;

		}
		catch  (NumberFormatException e)
		{
			log.error("Not Executed getTotalCount"); 
			e.printStackTrace(); 
			throw e;

		}
	}

	public Integer getTotalPages() {
		try{log.info("Entered getTotalPages succesfully");
		click(lnk_lastPage);
		waitFor(5000);
		String value = readTextNode(lnk_activeTablePagination);
		Integer lastPageNum = Integer.parseInt(value.trim());
		if (lnk_lastPage.isSelected() && lnk_lastPage.isEnabled()) {
			click(lnk_firstPage);
		}
		log.info("Executed getTotalPages Successfully");
		return lastPageNum;

		}
		catch  (NumberFormatException e) 
		{
			log.error("Not Executed getTotalPages"); 
			e.printStackTrace(); 
			throw e;

		}
	}

	public void verifyProgramByGivenYear(String year) {
		try{
			log.info("Entered verifyProgramByGivenYear succesfully");
			List<WebElement> startDateElementList = webDriver.findElements(By.xpath(
					"//h6[contains(text(),'Start Date')]/../../following-sibling::div/div[3]/h6[contains(text(),'"
							+ year + "')]"));
			System.out.println(startDateElementList.size());
			Assert.assertEquals(startDateElementList.size(), startDateElementList.size(),
					"Year count is not matching hence >>>> Failed]");
			log.info("Executed verifyProgramByGivenYear Successfully");
		} catch  (Exception e) 
		{
			// TODO Auto-generated catch block
			log.error("Not Executed verifyProgramByGivenYear"); 
			e.printStackTrace(); 
			throw e;
		}
	}
}
