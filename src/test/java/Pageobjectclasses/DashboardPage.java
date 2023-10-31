package Pageobjectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
	
	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	//elements
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement txtdashboard;
	
	//action method
	public String getDashbord() {
		try {
			return(txtdashboard.getText());
		}catch(Exception e) {
			return(e.getMessage());
		}
	
	}
	
	

}
