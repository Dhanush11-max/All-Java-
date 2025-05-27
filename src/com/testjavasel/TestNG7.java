package com.testjavasel;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG7 {

	// WebDriver is defined globally
	WebDriver driver;

	@BeforeClass
	public void setEnv() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}

	@DataProvider
	public Object[][] setData() throws Exception {

		// Setting the file path for the properties file (Locators file)
		File src = new File("C:\\Audit360MultitenantProjectWorkSpce\\Swaglab\\src\\test\\java\\BaseTest\\TestData.properties");

		// For loading above file (Used for consuming data of above file)
		FileInputStream fis = new FileInputStream(src);

		// Loading the data into Properties class
		Properties pro = new Properties();
		pro.load(fis);

		Object Arr[][] = new Object[3][2];
		Arr[0][0] = pro.getProperty("testdata1");
		Arr[0][1] = pro.getProperty("testdata2");

		Arr[1][0] = "TestData1";
		Arr[1][1] = "Test@123";

		Arr[2][0] = "TestData2";
		Arr[2][1] = "Test@321";

		return Arr;
	}

	@Test(dataProvider = "setData") 
	public void enterData(String UserName, String Password) throws Exception {
		
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(UserName);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(Password);
		Thread.sleep(2000);
		
	}

}
