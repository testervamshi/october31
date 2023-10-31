package Pageobjectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	//Elements
	@FindBy(xpath="//input[@name='username']")
	WebElement txtusername;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnLogin;
	
	//action methods
	public void setFirstname(String uname) {
		txtusername.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}

}
