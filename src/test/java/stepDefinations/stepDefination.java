package stepDefinations;
	import cucumber.api.DataTable;
import cucumber.api.PendingException;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	
	public class stepDefination {
		 static WebDriver driver; 
		 static Properties prop;
		
		   @Given("^user is on login page$")
		    public void user_is_on_login_page()  {
			   System.out.println("Given method");
			   /*System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			   WebDriver driver=new ChromeDriver();
			   driver.get("https://ui.cogmento.com/");*/
			 		
		    }
		   	//   "Elston"
		    // \"([^\"]*)\"
		    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
		    public void user_enters_username(String userName,String userName2)  {
				   System.out.println(userName+"---"+userName2); 
		    }

		    @When("^user clicks on login button$")
		    public void user_clicks_on_login_button()  {
		    	System.out.println("And annotation implementation");
		    }

		    @Then("^user is logged in successfully$")
		    public void user_is_logged_in_successfully()  {
		    	System.out.println("Then annotation implementation");
		    }

		    @And("^user enters \"([^\"]*)\"$")
		    public void user_enters_password(String Password)  {
		        System.out.println("Password is-->"+Password);
		    }
		    
		    @When("^user enters username and password$")
		    public void user_enters_username_and_password(DataTable tableData) throws Throwable {
		    	List<List<String>>data=tableData.raw();
		    	System.out.println(data.get(0).get(0));
		    	System.out.println(data.get(0).get(1));
		    	System.out.println(data.get(1).get(0));
		    	System.out.println(data.get(1).get(1));
		    }
		    
		    @When("^user enters following details (.+) and (.+)$")
		    public void user_enters_following_details_and(String usernamedetails, String passworddetails) throws Throwable {
		        System.out.println(usernamedetails+"======="+passworddetails);
		    }
		    
		    @Given("^user opens correct browser$")
		    public void user_opens_correct_browser() throws Throwable {
		        prop= new Properties(); 
		        FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\suite.properties");
		        prop.load(fis);
		        	System.out.println(prop.getProperty("browserName"));
		        	if (prop.getProperty("browserName").equalsIgnoreCase("chrome"))	{
		        		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		 			   driver=new ChromeDriver();
		        	}
		    }

		    @When("^user should navigate to correct URL$")
		    public void user_should_navigate_to_correct_url() throws Throwable {
		       driver.navigate().to(prop.getProperty("baseURL"));
		    }

		    @Then("^check user is on landing page$")
		    public void check_user_is_on_landing_page() throws Throwable {
		        throw new PendingException();
		    }
}
