package com.testjavasel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot2 {

	TakeScreenShot1 t1 = new TakeScreenShot1();
	
	@Test
	public void doLogin() {
		
		WebDriverManager.chromedriver().setup();
		t1.driver=new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.get("https://www.facebook.com");
		t1.driver.findElement(By.id("email")).sendKeys("abc@yopmail.com");
		
		// Passing wrong ID for Password field --> Test case will fail & screenshot is captured 
		t1.driver.findElement(By.id("pass_wrong")).sendKeys("abc@1234");
		
	}
	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception {
		t1.captureScreenshot(result2);
	}
}
