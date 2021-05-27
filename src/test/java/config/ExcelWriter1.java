package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;

public class ExcelWriter1 
{
	public static void setcellvalue(String filename,String sheetname,List<WebElement> list) throws Exception
	{

		int count=list.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement vlaue=list.get(i);
			String text=vlaue.getText();
			//System.out.println(text);
			File file=new File(filename);
			FileInputStream input=new FileInputStream(file);
			Workbook book=WorkbookFactory.create(input);
			Sheet sheet=book.getSheet(sheetname);
			sheet.createRow(i).createCell(0).setCellValue(text);
			FileOutputStream output=new FileOutputStream(file);
			book.write(output);
			output.close();
			
		}
	}



}








