package com.testjavasel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		// Entering Email Address
		driver.findElement(By.name("email")).sendKeys("Dinesh123@gmail.com");
		
		// Fetching entered value in the Email feild
		System.out.println(driver.findElement(By.name("email")).getAttribute("value"));
		
		// Using Explicitly wait to check weather the PW feild is visible
		WebDriverWait Wait = new WebDriverWait(driver, 10);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("884411");
		
	}

}
