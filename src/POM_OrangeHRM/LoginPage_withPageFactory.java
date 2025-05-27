package POM_OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_withPageFactory {

WebDriver driver;
	
	//Constructor
	
	LoginPage_withPageFactory (WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);//Mandatory Statement-which initialize the all the webElement therefore no need to write "driver.findelement" all the time
	}
	
	//Locators
	
	@FindBy(xpath="//input[@name='username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement but_login;
	
	// Action Methods
	
	public void setUserName(String User) {
		txt_username.sendKeys(User);
	}
	
	public void setPassword(String pwd) {
		txt_password.sendKeys(pwd);
	}
	
	public void clickLogin() {
		but_login.click();
	}
}
