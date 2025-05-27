package com.testjavasel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YoutubeSong {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//As webDriver is an interface (all methods are abstract) and implementation of all methods are done in ChromeDriver class
		//Hence we create an object of ChromeDriver with respect to WebDriver by passing reference as "driver"
		WebDriver driver = new ChromeDriver();
		
		//Open youTube
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Searching Saudebaazi song
		driver.findElement(By.xpath("//Input[@id='search']")).sendKeys("saudebaazi by javed ali");
		
		//Click on search button
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();

		//Playing Saudebaazi song
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@title,'Saude bazi full song (lyrics) | Javed Ali | movie Aakrosh |')]")).click();
		
		//Clicking on skip button
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@class='ytp-skip-ad-button']")).click();
	}

}
