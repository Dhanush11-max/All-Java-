package com.testjavasel;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopupHandling {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		
		// #Step 1: TAB HANDLING --> Clicking on the new tab button
		JavascriptExecutor Jse = (JavascriptExecutor) driver;
		Jse.executeScript("document.getElementById('tabButton').click()");
		
		// Finding the total number of tabs
		Set<String> AllTabsID = driver.getWindowHandles(); // Storing all windows alphanumeric ID
		System.out.println(AllTabsID);
		Iterator<String> ABC = AllTabsID.iterator(); 
		String Win1 = ABC.next(); // 1st Tab alphanumeric ID (Parent Tab)
		String Win2 = ABC.next(); // 2nd Tab alphanumeric ID (Child Tab)

		// Printing the title of parent Tab
		driver.switchTo().window(Win1);
		System.out.println("Parent Tab ID "+ Win1);
		System.out.println(driver.getTitle());
		
		// Printing child tab URL
		driver.switchTo().window(Win2);
		System.out.println("Child Tab ID "+ Win2);
		System.out.println(driver.getCurrentUrl());
		
		//Closing the current/child tab
		driver.close();
		
		// #Step 2: WINDOW HANDLING --> Clicking on the new window button 
		Thread.sleep(2000);
		driver.switchTo().window(Win1);
		Jse.executeScript("document.getElementById('windowButton').click()");
		
		// Finding the total number of windows
		Set<String> AllWindowID = driver.getWindowHandles();
		System.out.println(AllWindowID);
		Iterator<String> ABC1 = AllWindowID.iterator();
		String Win3 = ABC1.next();
		String Win4 = ABC1.next();
		
		// Switching to the child window & Printing child window URL
		driver.switchTo().window(Win4);
		System.out.println("Child Window ID: "+Win4);
		System.out.println(driver.getCurrentUrl());
		
		// Printing child window Title
		System.out.println(driver.getTitle());
		
		// Closing all the windows/Tabs by .quit method
		driver.quit();
		System.out.println("All windows are closed");
		
	}

}
