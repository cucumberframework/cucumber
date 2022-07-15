package stepDefinations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver getDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\resources\\suite.properties");
		prop.load(fis);

		if (prop.getProperty("browserName").equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	// Roland
	public static void getScreenshot() {
		// GIT- Software which is installed in local system
		// GITHUB- the server where we keep our complete project
		//

	}

	// Elston
	public static void getBrowserName() {
		//

		//
	}
	//SVN,CVS
	//Rahul
}




