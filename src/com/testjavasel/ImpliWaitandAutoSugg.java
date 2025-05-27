package com.testjavasel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImpliWaitandAutoSugg {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		// Typing expected text in search bar
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("shayari on");
		
		//Handling the Auto-suggetions
		List<WebElement> AllSugg = driver.findElements(By.xpath("//*[@role='listbox']/li"));
		String Expected = "Shayari on dosti";
		
		for(int i=0; i<AllSugg.size(); i++) {
			if(AllSugg.get(i).getText().equalsIgnoreCase(Expected)) {
				AllSugg.get(i).click();
				break;
			}
		}
	}
}
