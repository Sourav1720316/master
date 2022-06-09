package PageObjects;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import Base.base;

public class Search extends base{
	public static WebDriver driver=null;
	
	public Search(WebDriver driver) {
		System.out.println("The driver is : "+driver);
		this.driver=driver;
	}
	
	public static void takeScreenshot() {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C://Sourav//"+System.currentTimeMillis()+".png");
		try {
			FileUtils.copyFile(screenshot, dest);
			Reporter.log("<br><img src='"+dest+"' height='400' width='400'/></br>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void searchBox() {
		List<WebElement> ele = driver.findElements(By.xpath(""));
		WebElement ele1 = ele.get(0).findElement(By.xpath(""));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//Page load complete
		js.executeScript("return document.readyState").toString().equals("Complete");
		
		//Scrolling into view of a element
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		//Ajax call to end
		js.executeScript("return jQuery.active==0");
		
		Actions act = new Actions(driver);
		act.moveToElement(ele1).perform();
	}
	
	public void highlightElement(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background : yellow; border: 2px solid red;');", ele);
		
	}
	
	public static byte[] encrptPwd;
	public static byte[] decodePwd;
	public static String encodePwd() {
		String pwd = "Password";
		encrptPwd = Base64.encodeBase64(pwd.getBytes());
		System.out.println(new String(encrptPwd));
		return new String(encrptPwd);
	}
	
	public void decodepwd() {
		decodePwd=Base64.decodeBase64(encrptPwd);
		System.out.println(new String(decodePwd));
	}
}
