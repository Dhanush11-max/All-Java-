package POM_OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test
	void testLogin() {
		
		//Used for 'LoginPage_withPageFactory' class
		//LoginPage_withPageFactory lp = new LoginPage_withPageFactory(driver);
		//Used for 'LoginPage_woPageFactory' class
		LoginPage_woPageFactory lp = new LoginPage_woPageFactory(driver);
		lp.setUserName("Dinesh");
		lp.setPassword("Dinesh@123");
		lp.clickLogin();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
