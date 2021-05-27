package pageObjects;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.LoggerHelper;

public class ProfilePage extends BasePage {

Logger log = LoggerHelper.getLogger(LoggerHelper.class);
	
	public ProfilePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	

	@FindBy(how = How.CSS, using = "#scorecard-panel > div > div:nth-child(1) > div:nth-child(1) > div.d-flex.align-items-center > i")
	private WebElement clk_OnDownloadArrow;
	
	@FindBy(how = How.XPATH, using = "/html/body/app-root/app-profile/div/div/div[2]")
	private List<WebElement> scorecard_table;
	
	@FindBy(how = How.XPATH, using = "//span[@class='badge m-0 text-black border']")
	private List<WebElement> sel_status;
	
	@FindBy(how = How.XPATH, using = "//div[@id='scorecard-panel']")
	private WebElement sel_scorecards;
	
	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-menu dropdown-menu-left show']//span[contains(text(),'Download as PDF')]")
	private WebElement download_pdf;
	
	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-menu dropdown-menu-left show']//span[contains(text(),'Download as Excel')]")
	private WebElement download_excel;
	
//	public void ClickOnDownloadArrow() {
//		try {
//			log.info("Entered ClickOnDownloadArrow");
//			log.info("clicking on ClickOnDownloadArrow");
//			waitFor(1000);
//			click(clk_OnDownloadArrow);
//			log.info("Executed ClickOnDownloadArrow successfully");
//		} catch (Exception e) {
//			log.error("Executed ClickOnDownloadArrow not successfully");
//			e.printStackTrace();
//			throw e;
//		}
//	}
	
	public void SelectCardToDownload(String value) {
		try {
			log.info("Entered getSelectValueFromList");
			waitFor(1000);
			try {
				WebElement table = webDriver.findElement(By.xpath("/html/body/app-root/app-profile/div/div/div[2]"));
				System.out.println(table);
				List<WebElement> cards = table.findElements(By.xpath("//div[@id='scorecard-panel']"));
				List<WebElement> status = table.findElements(By.xpath("//span[@class='badge m-0 text-black border']"));
				System.out.println(cards.size());
				System.out.println(status.size());
				waitFor(6000);
//				waitUntilElementVisible(clk_OnDownloadArrow);
				
				for (WebElement option : status) {
//					System.out.println(option.getText());
					
						if (option.getText().equalsIgnoreCase(value)) {
							((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView(true);", option);
//						option.click();
						clk_OnDownloadArrow.click();
//						click(option1);
//						click(clk_OnDownloadArrow);
						click(download_pdf);
//						waitFor(3000);
//						click(clk_OnDownloadArrow);
//						click(download_excel);
						break;
						
						/*for (WebElement option1 : cards) {*/
						//
//						String recepit = option.next().getText();
//						if(recepit.equalsIgnoreCase(value))
//						{
//							click(clk_OnDownloadArrow);
//							click(download_pdf);
//						}
						
						//
						
					}
				}
//				}
				//screenshot("getSelectValueFromList");
			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
//			if (value.equalsIgnoreCase("Monthly")) {
//				log.info("Selecting value in drpdw_KPI dropdown: "+value);
//				setValueInDropdownText(drpdw_KPI, value);
//				if (!drpdw_KPI.getText().equalsIgnoreCase("Monthly")) {
//					log.info("Selecting value in drpdw_KPI dropdown: "+value);
//					setValueInDropdownText(drpdw_KPI, value);
//				} else {
//				}
//			} else if (value.equalsIgnoreCase("Quarterly")) {
//				log.info("Selecting value in drpdw_KPI dropdown: "+value);
//				setValueInDropdownText(drpdw_KPI, value);
//			} else if (value.equalsIgnoreCase("Half Yearly")) {
//				log.info("Selecting value in drpdw_KPI dropdown: "+value);
//				setValueInDropdownText(drpdw_KPI, value);
//			} else if (value.equalsIgnoreCase("Once (For whole program duration)")) {
//				log.info("Selecting value in drpdw_KPI dropdown: "+value);
//				setValueInDropdownText(drpdw_KPI, value);
//			}
//			
			log.info("Executed getSelectValueFromList successfully");
		} catch (Exception e) {
			log.error("Executed getSelectValueFromList not successfully");
			e.printStackTrace();
			throw e;
		}
	}
		
		public void ClickOnDownloadArrow1(String value) {
				try {
					log.info("Entered getSelectValueFromList");
					waitFor(1000);
					WebElement table = webDriver.findElement(By.xpath("/html/body/app-root/app-profile/div/div/div[2]"));
					System.out.println(table);
					List<WebElement> cards = table.findElements(By.xpath("//div[@id='scorecard-panel']"));
					List<WebElement> status = table.findElements(By.xpath("//span[@class='badge m-0 text-black border']"));
					System.out.println(cards.size());
					System.out.println(status.size());
		
//					boolean value1 = false;
					Iterator<WebElement> listofrecepits = status.iterator();
//					ArrayList<String> listofrecepitsUsers = new ArrayList<>();
					while(listofrecepits.hasNext())
					{
						String recepit = listofrecepits.next().getText();
						if(recepit.equalsIgnoreCase(value))
						{
							click(clk_OnDownloadArrow);
							click(download_pdf);
						}
//						listofrecepitsUsers.add(recepit);
					}
					//	assertTrue(value1, ShareReciepts+" not matching with any of the recipets "+listofrecepitsUsers+" hence failed");
				
				log.info("Executed getSelectValueFromList successfully");
			} catch (Exception e) {
				log.error("Executed getSelectValueFromList not successfully");
				e.printStackTrace();
				throw e;
			}
			
	}
}
