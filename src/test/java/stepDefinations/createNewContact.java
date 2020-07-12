package stepDefinations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectsOR.login;

public class createNewContact {
	public static Properties prop;
	public static WebDriver driver;
	public login log;

	@Given("^user opens corrrect browser$")
	public void user_opens_corrrect_browser() throws IOException {
		
		driver=BaseClass.getDriver();
		prop=BaseClass.prop;
		  log=new login(driver);
	}
	
	@When("^user should navigate to corrrect URL$")
	public void user_should_navigate_to_corrrect_URL() {
		
		driver.navigate().to(prop.getProperty("baseURL"));
		
		Assert.assertEquals(driver.findElement(By.linkText("Forgot your password?")).isDisplayed(), true);
		
		
		
	}
	
	@When("^user enters user name$")
	public void user_enters_user_name() {
		log.getUsername().sendKeys(prop.getProperty("username"));
	//	driver.findElement(By.xpath("//input[@name='newemail']")).sendKeys(prop.getProperty("username"));
	}

	@And("user enters password")
	public void user_enters_password() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
	}
	
	@When("^user clicks on login button2$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}
	
	@Then("^user is logged in successfully in application$")
	public void user_is_logged_in_successfully_in_application() throws InterruptedException {
		Thread.sleep(10000);
		Assert.assertEquals(driver.findElement(By.linkText("Home")).isDisplayed(), true);
	}
	
	@Given("^user should be present on homepage$")
	public void user_should_be_present_on_homepage() throws InterruptedException {
		Thread.sleep(10000);
		Assert.assertEquals(driver.findElement(By.linkText("Home")).isDisplayed(), true);
	}
	
	@When("^user should click on contact$")
	public void user_should_click_on_contact() throws InterruptedException {
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(7000);
	}
	
	@Then("^new button should be displayed$")
	public void new_button_should_be_displayed() throws InterruptedException {
		Assert.assertEquals(driver.findElement(By.linkText("New")).isDisplayed(), true);
		if(driver.findElement(By.linkText("New")).isDisplayed()) {
			driver.findElement(By.linkText("New")).click();
			Thread.sleep(10000);
		}
	}
	
	@Then("^user enters all the required details$")
	public void user_enters_all_the_required_details(DataTable tabledata) throws InterruptedException {
		List<List<String>>data=tabledata.raw();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//input[@name='middle_name']")).sendKeys(data.get(0).get(2));
		driver.findElement(By.xpath("//input[@class='search']")).sendKeys(data.get(0).get(4));
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys(data.get(0).get(3));
	driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	Thread.sleep(5000);
	}
	
	@Then("^contact should be saved successfully$")
	public void contact_should_be_saved_successfully() {
		Assert.assertEquals(driver.findElement(By.xpath("//i[@class='trash icon']")).isDisplayed(), true);
	}
	
}
