package com.testjavasel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Assertion1 {

	@Test
	public void testCase1() {
		
		String ExpectedText = "Facebook helps you connect and share with the people in your life.";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String ActualText = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).getText();
		
		// Equal Assertion
		Assert.assertEquals(ExpectedText, ActualText);
		System.out.println("Equal Assertion PASS");
		
		// False Assertion --> Here .isSelected() method is used for radio button and check-boxes, hence it is by default failed
		Assert.assertFalse(driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).isSelected());
		System.out.println("False Assertion PASS");
		
		// True Assertion 
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).isDisplayed());
		System.out.println("True Assertion PASS");
	}
}
