package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

	public WebDriver driver;
	
	public AccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	By AcctName = By.cssSelector("h3.RTL");

	
	public WebElement getAcctName()
	{
		return driver.findElement(AcctName);
	}

	

}

