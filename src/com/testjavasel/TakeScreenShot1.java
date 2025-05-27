package com.testjavasel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenShot1 {

	WebDriver driver;
	
	// ITestResult will provide us the test case execution result & test name 
	public void captureScreenshot(ITestResult result) throws Exception {
		
		if(ITestResult.FAILURE == result.getStatus()) {
			
			// creating reference of TakeScreenshot interface & type casting
			TakesScreenshot ts = (TakesScreenshot) driver; // Type casting of 2 Interfaces
			
			// Using getScreenshotAs() to capture the screenshot in File format
			// getScreenshotAs() method return type = FILE
			File sourcefile = ts.getScreenshotAs(OutputType.FILE);
			
			// copy the tile to specific location
			File destFolder = new File("./screenshot/"  +result.getName() + ".png");
			FileUtils.copyFile(sourcefile, destFolder);
			System.out.println(result.getName()+ " method failed & screenshot Captured");
		}
	}
}
