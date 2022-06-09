package PracticeTestNG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.Child;
import PageObjects.Search;
import PageObjects.parent;

public class Test {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		System.setProperty(null, null);
		driver.get("https://phptravels.com/features");
		List<WebElement> ele= driver.findElements(By.xpath("//nav[@class='clearfix']//a[@class='lvl-0 link nav-link'] | //div[@class='lvl-0 dropdown']/span"));
		List<String> list = new ArrayList<String>();
		for(WebElement el : ele) {
			list.add(el.getText());
		}
		
		Collections.sort(list);
		
		String firstString = "Sourav";
		String secondString = "Sourav";
		 
		String thirdString =  new String("Sourav");
		 
		System.out.println(firstString == secondString);
		 
		System.out.println(firstString == thirdString);
		 
		System.out.println(firstString.equals(thirdString));
		
		List<WebElement> eles = driver.findElements(By.xpath(""));
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		nitigrities nit=new nitigrities(); 
		nit.hash();
		
	}

}
