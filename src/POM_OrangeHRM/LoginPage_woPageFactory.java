package POM_OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_woPageFactory {
	
	WebDriver driver;
	
	//Constructor
	
	LoginPage_woPageFactory (WebDriver driver){
		
		this.driver=driver;
	}
	
	//Locators
	
	By txt_username_loc = By.xpath("//input[@name='username']");
	
	By txt_password_loc = By.xpath("//input[@name='password']");
	
	By but_login_loc = By.xpath("//button[normalize-space()='Login']");
	
	// Action Methods
	
	public void setUserName(String User) {
		driver.findElement(txt_username_loc).sendKeys(User);
	}
	
	public void setPassword(String pwd) {
		driver.findElement(txt_password_loc).sendKeys(pwd);
	}
	
	public void clickLogin() {
		driver.findElement(but_login_loc).click();
	}
}
