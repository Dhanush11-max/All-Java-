package com.testjavasel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouceSimulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		// Switching to the frame
		driver.switchTo().frame(0);
		System.out.println("Switched to Frame");
		
		//Creating Web Elements for draggable and droppable
		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		// Performing Drag and Drop 
		Actions act = new Actions(driver);
		/*act.dragAndDrop(drag, drop).build().perform();
		System.out.println("Drag and Drop successfully done"); */
		
		// Drag by co-ordinates
		act.dragAndDropBy(drag, 100, 100).build().perform();
	}

}
