package PracticeTestNG;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import Base.base;
import PageObjects.Search;

public class googlePage extends base{
	
	WebDriver driver;
	WebElement searchBox;
	
	@BeforeMethod
	public void setup() {
		this.driver=super.chromeDriver();
	}
	
	@Test
	public void googleSearchBoxIsPresent() throws IOException {
		driver.get("https://www.google.com/");
		searchBox=driver.findElement(By.xpath("//input[@title='Search']"));
		Search srch = new Search(driver);
		srch.highlightElement(searchBox);
		searchBox.sendKeys("Google");
//		Actions act=new Actions(driver);
//		act.contextClick(searchBox).perform();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", searchBox);
//		FileReader read = new FileReader("data.properties");
//		Properties prop=new Properties();
//		prop.load(read);
////		prop.getProperty("URL");
//		return searchBox.isDisplayed();
		
	}
//	
//	public void practiceWait() {
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.visibilityOf(searchBox));
//	}

}
