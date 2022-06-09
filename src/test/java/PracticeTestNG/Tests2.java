package PracticeTestNG;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.base;

public class Tests2 extends base{

	WebDriver driver;
	@BeforeMethod
	public void setup() {
		this.driver=chromeDriver();
	}
	
	@Test(groups= {"demo"})
	public void bearchInSearchBox() throws IOException {
		System.out.println("Test1");
	}
	
	@Test(groups= {"demo"})
	public void aearchInSearchBox() throws IOException {
		System.out.println("Test2");
	}
	
	@Test
	public void cearchInSearchBox() throws IOException {
		System.out.println("Test3");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
