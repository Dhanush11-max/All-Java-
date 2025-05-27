package com.testjavasel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import freemarker.log.Logger;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class Log4JLogging {

	public static void main(String[] args) {
		
		// Create Logger Instance
		Logger logger = Logger.getLogger("Log4JLogging");
		
		// Configure log4j.properties file
		//PropertyConfigurator.configure("C:\\Audit360MultitenantProjectWorkSpce\\Swaglab\\src\\test\\java\\BaseTest\\log4j.properties");
		
		// Open browser instance
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		logger.info("Chrome Browser Instance Opened");
		
		//Maximize the window
		driver.manage().window().maximize();
		logger.info("Window Maximised");
		
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Implicit wait given");
		
		//check if the web element is displayed or not
		try{
			driver.findElement(By.id("email")).isDisplayed();
		    logger.info("Web element Found");
		} catch(Exception e) {;
			logger.info("Failure - Web Element is not found");
		}
	}
}
