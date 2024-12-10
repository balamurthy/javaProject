package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import utilities.Helper;

public class advantageOnlineHomePage {
	
	//constructor
	private WebDriver driver;
	
	public advantageOnlineHomePage(WebDriver driver)
	{
		this.driver=driver;
		
	}

	//elements
	By  lens= By.id("menuSearch");
	By searchBox = By.id("autoComplete");
	By itemsCount = By.xpath("//*[contains(@class,'titleItemsCount')]");
	//getter and setter methods
	
	public int doSearch(String s,String expCount)
	{
		int actualresultcount;
		String count;
		
		WebElement element;
		element =driver.findElement(lens);
	
		
		WebElement wd= new WebDriverWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(element));
	    wd.click();
	    
	    
	    element = driver.findElement(searchBox);
	    WebElement searchBox = new WebDriverWait (driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(element));
		searchBox.sendKeys(s + Keys.ENTER);

		
		try {
   			wd= new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(itemsCount));
			 count = wd.getText();
			 actualresultcount = Integer.parseInt(count.replaceAll("[^0-9]", ""));
			 
			 
		}
		catch(TimeoutException ne) {
			
			//System.out.println("No results found for search string:"+s);
			actualresultcount=0;
		}
	
		
		
		System.out.println(s + " Expected:<" + (int) Double.parseDouble(expCount) + "> Actual:<" + actualresultcount+ ">");
		
	    return actualresultcount;
	}
	
		
}
