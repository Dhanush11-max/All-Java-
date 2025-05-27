package com.testjavasel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Open FB
		driver.get("https://www.facebook.com/");
		
		//Clicking on the "Create New Account"
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		
		// 1st way of Handle Radio button-Very generic way
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']")).click(); //Female is clicked
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click(); // Male is clicked
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click(); //Custom is clicked
		
		// 2nd way of Handle Radio button-Creating list of Web Elements on the basis of button positions(List index starts from zero)
		//(Drawback= In future sequence of radio button is getting changed then wrong Radio Button is selected)
		List<WebElement> Radios = driver.findElements(By.xpath("//input[@id='sex']"));
		System.out.println("Total Radio Buttons:- "+Radios.size()); //Total number of Radio Buttons
		
		Thread.sleep(2000);
		Radios.get(1).click(); // Male is clicked
		
		System.out.println(Radios.get(0).isSelected()); //false
		System.out.println(Radios.get(1).isEnabled()); //true
		System.out.println(Radios.get(2).isDisplayed()); //true
		
		// 3rd way of Handle Radio button-Creating list of Web Elements on the basis of button texts
		//(Above drawback is removed in this case)
		List<WebElement> RadioTexts = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total RadioTexts :- "+RadioTexts.size());
		String ExpectedResult = "Female";
		
		for(int i = 0; i<RadioTexts.size(); i++) {
			if(RadioTexts.get(i).getText().equalsIgnoreCase(ExpectedResult)) {
				RadioTexts.get(i).click();
				System.out.println(ExpectedResult+ "Clicked");
				break;
			}
		}
		
	}

}
