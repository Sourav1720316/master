package Feature;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
//import cucumber.annotation.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends base {

	public WebDriver driver;
	
	@Before
	public void setup() {
		this.driver=chromeDriver();
		driver.get(propertiesFileDataReader());
	}
	
	@Given("^Tutorialspoint is searched with \"(.*?)\"$")
	public void tutorialspoint_is_searched_with(String arg1) throws Throwable {
		WebElement searchTextBox = driver.findElement(By.xpath("//input[@title='Search']"));
		searchTextBox.sendKeys(arg1);
	}

	@When("I open Facebook website with Username and Password")
	public void i_open_facebook_website_with_username_and_password(DataTable table) {
	    List<List<String>> list = table.cells();
	    driver.findElement(By.xpath("")).sendKeys(list.get(0).get(1));
	    driver.findElement(By.xpath("")).sendKeys(list.get(1).get(1));
	    driver.findElement(By.xpath("")).sendKeys(list.get(2).get(1));
	    throw new io.cucumber.java.PendingException();
	}

	@Then("^I will login$")
	public void i_will_login() throws Throwable {
	    
	}
	
	
}