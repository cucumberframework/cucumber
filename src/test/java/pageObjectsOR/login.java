package pageObjectsOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
WebDriver driver;
	By email= By.xpath("//input[@name='email']");
	
	By password = By.xpath("//input[@name='password']");
	

		public login(WebDriver driver){
			
		this.driver=driver;
		}

	public WebElement getUsername() {
		
	return	driver.findElement(email);
		
	}
	
	public WebElement getpassword() {
		
		return	driver.findElement(email);
			
		}
	

	
}
