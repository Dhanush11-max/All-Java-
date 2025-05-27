package com.testjavasel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouceSimulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/plus");
		
		// Creating web element for "Electronics" text
		WebElement Elecronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		//Mouse simulation using Actions class to "Electronics" text
		Actions act = new Actions(driver);
		act.moveToElement(Elecronics).build().perform();
		
		//Clicking on the "Mobiles" text under "Electronics" section
		driver.findElement(By.xpath("//*[text()='Mobiles']")).click();
		
		//Creating web element for "Men" text and click on the same
		WebElement Man = driver.findElement(By.xpath("//*[text()='Men']"));
		act.moveToElement(Man).build().perform();
		
		//Clicking on the "T Shirts" text by pressing "Enter" key
		WebElement Tshirts = driver.findElement(By.xpath("//*[text()='T-Shirts']"));
		act.sendKeys(Tshirts, Keys.ENTER).build().perform();
		
		//Right click on Web Page
		//act.contextClick().build().perform();
		
		//Right click on specific element
		WebElement Topwear = driver.findElement(By.xpath("//*[text()='Topwear']"));
		act.contextClick(Topwear).build().perform();
		
	}

}
