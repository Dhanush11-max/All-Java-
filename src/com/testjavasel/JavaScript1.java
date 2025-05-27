package com.testjavasel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		//Javascript Executor
		JavascriptExecutor Jse = (JavascriptExecutor) driver;
		
		//Locating web Element by using Javascript
		Jse.executeScript("document.getElementById('email').value='Dinesh@gmail.com'");
		Jse.executeScript("document.getElementById('pass').value='Dinesh@123'");
		
		//Scrolling page down
		Thread.sleep(2000);
		Jse.executeScript("window.scrollBy(0,500)");
		
		//Scrolling page up
		Thread.sleep(2000);
		Jse.executeScript("window.scrollBy(0,-500)");
		
		/*Scrolling page @ right side
		Thread.sleep(2000);
		Jse.executeScript("window.scrollBy(500,0)");
		
		//Scrolling page @ right side
		Thread.sleep(2000);
		Jse.executeScript("window.scrollBy(-500,0");
		*/
		
		
	}
}
