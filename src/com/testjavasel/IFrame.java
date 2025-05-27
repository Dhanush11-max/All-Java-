package com.testjavasel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		
		// Clicking on the Sign-In button
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		
		// Finding the total number of Frames (i Frames always having tag as 'frame')
		int TotalFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Tatal Frames: "+ TotalFrames);
		
		// Checking, if Element present or not
		for (int i=0; i<TotalFrames; i++) {
			driver.switchTo().frame(i); // Here i=0 >> Means the 1st frame i.e. the frame which opens after clicking on the "Sign-In" button 
			driver.switchTo().frame(i); // Here i=1 >> Means the 2nd frame i.e. frame inside frame (Here we want to verify text present on this frame hence we need to switch this frame)
			
			String Exp = "Open Paytm App";
			String Act = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();
			
			if(Act.equalsIgnoreCase(Exp)) {
				System.out.println("Elyment found");
				break;
			}
			else {
				System.out.println("Elyment Not-found");
			}
		}
		
	}

}
