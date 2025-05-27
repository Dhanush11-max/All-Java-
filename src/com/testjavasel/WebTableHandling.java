package com.testjavasel;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
		/* 1) In below xpath, //table[@class='dataTable' -->selects all the WebTable
		   2) We need list, therefore we need to travel to the child node in DOM i.e. ////table[@class='dataTable']/tbody
		   3) Again we need to travel the child node in DOM for link as all company names having anchor tag
		   4) Therefore we further travel to --> /tr/td[1]/a
		   5) Final xpath which gives all company names list --> //table[@class='dataTable']/tbody/tr/td[1]/a */
		
		//Creating List for all Companies Name
		List<WebElement> AllCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("All Companies: " + AllCompanies.size());
		
		/* 1) For Current Price, we need to travel child node
		   2) In td tag the prices are stored into the td[4] child node
		   3) Hence total xpath for Current Price --> //table[@class='dataTable']/tbody/tr/td[4] */
		
		//Creating List of Current Price
		List<WebElement> CurrentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("All Current Prices: " + CurrentPrice.size());
		
		
		String Expected = "Rolex Rings";
		
		for(int i=0; i<AllCompanies.size(); i++) {
			if(AllCompanies.get(i).getText().equalsIgnoreCase(Expected)) {
				System.out.println(AllCompanies.get(i).getText() + " === " + CurrentPrice.get(i).getText());
				AllCompanies.get(i).click();
				System.out.println(driver.getTitle()); //Verifying Web Page title
				break;
			}
		}
	}
}
