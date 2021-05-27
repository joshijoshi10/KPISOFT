package util;

//import exception.ExcelSheetNotFoundException;
//import exception.TestSuiteFileNotFoundException;
//import managers.ExcelTestCaseManager;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;
//    private ExcelTestCaseManager excelTestCaseManager;

    public TestContext() {
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver(),webDriverManager.getApplicationUrl());
//        excelTestCaseManager = new ExcelTestCaseManager();
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
    
//    public ExcelTestCaseManager getExcelTestCaseManager() { 
//    	return excelTestCaseManager; 
//    	
//    }
}
