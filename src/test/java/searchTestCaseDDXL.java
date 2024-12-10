package testCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.advantageOnlineHomePage;
import utilities.Helper;

public class searchTestCaseDDXL{
	static WebDriver driver;
	String xlFilePath = "d:\\blaptop\\ascendion\\searchdata.xlsx";
	String sheetName = "Sheet1";
	utilities.ExcelApiTest eat = null;
	advantageOnlineHomePage advHomepage;
	ExtentReports extentreports;
	ExtentTest test;
	

	@BeforeClass
	public void init()
	{
		extentreports = new ExtentReports("d://blaptop//ascendion//extentreports//searchExtentReport.html", true);

		test = extentreports.startTest("SearchTest");

		driver = Helper.launchBrowser("chrome");
		advHomepage = new advantageOnlineHomePage(driver);
		
	}
	
	@Test(dataProvider = "searchData")
	public void searchTest(String s,String expectedCount) 
	{
		driver.get("https://advantageonlineshopping.com/#/");

		int actualCount;
		actualCount = advHomepage.doSearch(s,expectedCount);
		
		int ec = (int)Double.parseDouble(expectedCount);
		
		if (actualCount !=ec)
		{
			test.log(LogStatus.FAIL, s + " Expected-" + ec + " Actual:" + actualCount);
		}
		else
		{
			test.log(LogStatus.PASS, s + " Expected-" + ec + " Actual:" + actualCount);
		}
		
		//Assert.assertEquals(actualCount, ec);

	}
		
		
	@DataProvider(name="searchData")
	public Object[][] search() throws Exception
	{
		Object[][] data = testData(xlFilePath, sheetName);
		return data;
	}

	
	public Object[][] testData(String xlFilePath, String sheetName) throws Exception
	{
		Object[][] excelData = null;
		eat = new utilities.ExcelApiTest(xlFilePath);
		int rows = eat.getRowCount(sheetName);
		int columns = eat.getColumnCount(sheetName);

		excelData = new Object[rows-1][columns];

		for(int i=1; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				excelData[i-1][j] = eat.getCellData(sheetName, j, i);
			}

		}
		return excelData;
	}
	
	

	
	@AfterClass
	public void afterClassClassA()
	{
		extentreports.endTest(test);
		extentreports.flush();
	}	

}
