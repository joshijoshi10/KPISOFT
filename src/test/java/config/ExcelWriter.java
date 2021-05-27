package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.BasePage;


public class ExcelWriter extends BasePage 
{


	public ExcelWriter(WebDriver webDriver)
	{
		super(webDriver);

	}

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\workshop\\skylarktest\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skylarkqa.kpisoft.com/home/#/signin");
		driver.findElement(By.name("username")).sendKeys("jack@airtel.com");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[normalize-space() = 'Log In']")).click();
		Thread.sleep(8000);
		driver.manage().window().maximize();
		BasePage page=new BasePage(driver);
		WebElement drop=driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		page.doHover(drop);
		page.click(drop);
		WebElement epms=driver.findElement(By.xpath("//a[contains(text(),'EPMS-Admin')]"));
		page.click(epms);
		Thread.sleep(10000);
		WebElement type=driver.findElement(By.xpath("//a[text()='Employees']"));
		type.click();
		//WebElement active=driver.findElement(By.xpath("//li//span[text()='(current)']"));

		ArrayList<WebElement> store=new ArrayList<WebElement>(50000);
		int n=10;
		int m=0;
		for(int j=1;j<=3;j++)
		{
			WebElement next=driver.findElement(By.xpath("(//ul[@class='pagination']/li)[last()-1]"));
			List<WebElement> empcode=driver.findElements(By.xpath("//div[@class='w-100 float-left p-md-2 grid-details']/div[1]"));
			int count=empcode.size();
			if(count<=10)
			{
				for(int i=0;i<count;i++)
				{
					WebElement Element=empcode.get(i);
					store.add(Element);


				}

			}
			
			for(int k=m;k<n;k++)
			{

				WebElement code=store.get(k);
				String text=code.getText();
				System.out.println(text);
				File file=new File("D:\\test.xlsx");
				FileInputStream input=new FileInputStream(file);
				Workbook book=WorkbookFactory.create(input);
				Sheet sheet=book.getSheet("test1");
				sheet.createRow(k).createCell(0).setCellValue(text);
				FileOutputStream output=new FileOutputStream(file);
				book.write(output);

			}
			n=n+10;
			m=m+10;
			next.click();
			Thread.sleep(6000);

		}
		































		/*for(int i=0;i<count;i++)
		{

			WebElement code=empcode.get(i);
			String text=code.getText();
			System.out.println(text);
			File file=new File("D:\\test.xlsx");
			FileInputStream input=new FileInputStream(file);
			Workbook book=WorkbookFactory.create(input);
			Sheet sheet=book.getSheet("test1");
			sheet.createRow(i).createCell(0).setCellValue(text);

			FileOutputStream output=new FileOutputStream(file);
			book.write(output);






		}*/










	}
}
