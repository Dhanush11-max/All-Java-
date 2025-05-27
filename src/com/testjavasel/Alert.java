package com.testjavasel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		// Due to multiple adds - we are not able to locate element properly, hence we are using Java-script
		JavascriptExecutor Jse = (JavascriptExecutor) driver;
		
		//Accepting Alert
		Jse.executeScript("document.getElementById('confirmButton').click()");
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");
		
		//Diss-missing Alert
		Thread.sleep(2000);
		Jse.executeScript("document.getElementById('confirmButton').click()");
		driver.switchTo().alert().dismiss();
		System.out.println("Alert Diss-Missed");
	}

}
