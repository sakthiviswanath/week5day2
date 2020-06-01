package week5.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Parent {
		
		public ChromeDriver driver;
			@Parameters({"url","username","password"})
			@BeforeMethod
			public void login(String url,String username,String password ) {
				ChromeOptions options = new ChromeOptions();
				options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak\\Downloads\\chromedriver.exe");
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.findElementById("username").sendKeys(username);
				driver.findElementById("password").sendKeys(password);
				driver.findElementByClassName("decorativeSubmit").click();
				driver.findElementByLinkText("CRM/SFA").click();
				driver.findElementByLinkText("Leads").click();

			}
			
			@AfterMethod
			public void closeBrowser() {
				driver.close();

			}
}
