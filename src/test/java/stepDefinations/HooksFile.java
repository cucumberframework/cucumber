package stepDefinations;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksFile {
	static WebDriver driver; 
	 static Properties prop;

	@Before("@ChromeTC")
	public void BeforeChrome() throws IOException {

		System.out.println("Opening of the chrome browser");

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
 			   driver=new ChromeDriver();
    }
	
	
	@After("@ChromeTC")
	public void AfterChrome() {
		System.out.println("Closing of chrome browser");
		driver.quit();
	}
	

	@Before("@FirefoxTC")
	public void BeforeFirefox() {
		System.out.println("Opening firefox browser");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		
	}
	
	@After("@FirefoxTC")
	
	public void AfterFirefox() {
		System.out.println("Closing firefox browser");
		//driver.quit();
	}
	
	
	@After("@CreateContact")
	public void afterCreateContact() {
		this.driver=BaseClass.driver;
		
		driver.quit();
	}
	
}
