package com.testjavasel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Clicking on the login button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		
		//Passing Credentials and Login
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='Enter your active Email ID / Username']")).sendKeys("dineshdevkar514@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='Enter your password']")).sendKeys("Dinesh@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn-primary loginButton']")).click();
		
		//Clicking on the Profile icon/Image
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='nI-gNb-icon-img']")).click();
		
		//Clicking on the "View & Update profile" text
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='nI-gNb-info__sub-link']")).click();
		
		//Scrolling down up-to the "Expected Salary" text by Actions Class
		//Thread.sleep(5000);
		WebElement Ele = driver.findElement(By.xpath("//*[text()='Expected salary']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Ele);
		actions.build().perform();
		
		//Scrolling down up-to the "Expected Salary" text by JavaScript Executer
		/*JavascriptExecutor Jse = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		Jse.executeScript("window.scrollBy(0,1700)");//-->increase the scroll value and check */
	}

}
