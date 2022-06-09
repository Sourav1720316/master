package PracticeTestNG;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.beust.jcommander.Parameters;

import Base.base;

public class Tests extends base{

	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		this.driver=chromeDriver();
	}
	
//	@Test(retryAnalyzer=Base.RetryAnalyzer.class)
//	public void openGoogle() throws IOException {
//		System.out.println("ENteriong first test");
//		FileReader read=new FileReader("src/test/java/data.properties");
//		Properties prop=new Properties();
//		prop.load(read);
//		driver.get(prop.getProperty("URL"));
//		Reporter.log("URL is launched");
//		Reporter.log("URL is launched",true);
//		//googlePage gp=new googlePage(driver);
//		//gp.practiceWait();
//		//Assert.assertTrue(gp.googleSearchBoxIsPresent());
//	}
//	
//	@Test(groups="demo")
//	public void colour() throws AWTException {
//	WebElement ele = driver.findElement(By.xpath(""));
//	String c = ele.getCssValue("color");
//	String s=Color.fromString(c).asHex();	
//	}
	
	@Test
	public void table() {
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		List<WebElement> options = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[count(//table[@id='customers']/tbody/tr/th[text()='Company']/preceding-sibling::th)+1]"));
		for(int i=0;i<options.size();i++) {
			if(options.get(i).getText().equalsIgnoreCase("Microsoft")) {
				WebElement ele=options.get(i).findElement(By.xpath("./following-sibling::td[2]"));
				System.out.println(ele.getText());
			}
		}
	}
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}
}
