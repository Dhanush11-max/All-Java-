package com.testjavasel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		//Adding Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Clicking on the "Mobiles" from the header
		driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
		
		//Scrolling web page by using Actions Class
		WebElement element = driver.findElement(By.xpath("//span[text()='Last 90 days']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.build().perform();
		
		//Checking the different brands check-boxes
		List<WebElement> CheckBoxTexts = driver.findElements(By.xpath("//span[@class='a-size-base a-color-base']"));
        
		//Adding Explicitly wait
		/* WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-size-base a-color-base']"))).click(); */
		
		System.out.println("Total number of Check Box Texts are: "+ CheckBoxTexts.size());
		
		String Brand[] = { "OnePlus", "Samsung","Apple", "IQOO", "Redme", "Nokia"};
		int len = Brand.length;
		
		//selecting Samsung
		//String Exp1 = "Samsung";
		for(int j=0; j<=len;j++) {
		for (int i=0; i<CheckBoxTexts.size(); i++) {
			if(CheckBoxTexts.get(i).getText().equalsIgnoreCase(Brand[j])) {
				CheckBoxTexts.get(i).click();
				System.out.println(Brand[j] + " Clicked");
				break;
			}
		}
		//Scrolling web page by using Actions Class
		WebElement Ele = driver.findElement(By.xpath("//span[text()='New']"));
		actions.moveToElement(Ele);
		actions.build().perform();
		}
	/*	//selecting Boat
		Thread.sleep(3000);
		String Exp2 = "Boat";
		for(int i = 0; i<CheckBoxTexts.size(); i++) {
			if (CheckBoxTexts.get(i).getText().equalsIgnoreCase(Exp2)) {
				CheckBoxTexts.get(i).click();
				System.out.println(Exp2 + " Clicked");
				break;
			}
		}
		//Scrolling web page by using Actions Class
		actions.moveToElement(Ele);
		actions.perform();
		
		//selecting realme
		Thread.sleep(3000)
		String Exp3 = "realme";
		for(int i = 0; i<CheckBoxTexts.size(); i++) {
			if(CheckBoxTexts.get(i).getText().equalsIgnoreCase(Exp3)) {
				CheckBoxTexts.get(i).click();
				System.out.println(Exp3 + " Clicked");
			}
		}

		*/
	}

}
