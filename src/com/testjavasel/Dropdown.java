package com.testjavasel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Clicking on the "Create new account" button
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		Thread.sleep(2000);
		
		///1st way-> Creating list for month drop-down (Can use with or w/o select tag)
		List<WebElement> Month = driver.findElements(By.xpath("//select[@id='month']/option"));
		
		//Selecting month from drop-down
		Month.get(4).click(); // May is selected
		System.out.println("1st way = Done");
		
		///2nd way-> By creating WebElement for year drop-down of parent tag (using select class)
		WebElement Ele = driver.findElement(By.xpath("//select[@id='year']"));
		
		//Creating object of select class with parametric construction
		Select Year = new Select(Ele);
		
		// 2014 selected
		Thread.sleep(2000);
		Year.selectByIndex(10);
		
		// 1991 selected
		Thread.sleep(2000);
		Year.selectByValue("1991");
		
		// 1995 selected
		Thread.sleep(2000);
		Year.selectByVisibleText("1995");
		
		//Printing current selected Year
		System.out.println(Year.getFirstSelectedOption().getText());
		System.out.println("2nd way = Done");
		
		///3rd way-> Creating List by storing all the values inside WebElement by using .getOptions() method 
		WebElement Ele1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select mon = new Select(Ele1);
		List<WebElement> mondrop = mon.getOptions();
		System.out.println(mondrop.size());
		for (int i =0 ; i< mondrop.size(); i++) {
			if(mondrop.get(i).getText().equalsIgnoreCase("Jun")) {
				mondrop.get(i).click();
				System.out.println("3rd way = Done");
			}
		}
		///4th way-> Creating WebElement and passing value directly to the reference(Ele2)
		Thread.sleep(2000);
		WebElement Ele2 = driver.findElement(By.xpath("//select[@id='month']"));
		Ele2.sendKeys("dec");
		System.out.println("4th way = Done");
		
		///5th way-> Passing value directly by .sendKeys() method
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("nov");
		System.out.println("5th way = Done");
		
		// For multi-selection drop-down
		System.out.println(mon.isMultiple());//Checking, if the drop-down is multiple
		mon.selectByIndex(5);
		mon.selectByValue("Jan");
		mon.selectByVisibleText("Aug");
		
		// For de-selecting the selected month
		mon.deselectAll();// for de-selecting all the selected options at a time
		mon.deselectByIndex(5);
		mon.deselectByValue("Jan");
		mon.deselectByVisibleText("Aug");
		
	}
}
