package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignOut {

	public WebDriver driver;
	
	public SignOut(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	By NameAccount = By.cssSelector("ul.nav.navbar-nav.navbar-right.hidden-sm.go-left:nth-child(2) ul.nav.navbar-nav.navbar-side.navbar-right.sidebar.go-left.user_menu li:nth-child(1) a.dropdown-toggle.go-text-right > i.icon_set_1_icon-70.go-right");
	By DropDownLogout = By.cssSelector("ul.nav.navbar-nav.navbar-right.hidden-sm.go-left:nth-child(2) ul.nav.navbar-nav.navbar-side.navbar-right.sidebar.go-left.user_menu li.open:nth-child(1) ul.dropdown-menu li:nth-child(2) > a.go-text-right");
//	By Email = By.xpath("//input[@placeholder='Email']");
//	By Password = By.xpath("//input[@placeholder='Password']");
//	By SignInBtn = By.cssSelector(".btn.btn-action.btn-lg.btn-block.loginbtn");
	
	public WebElement getNameAccount()
	{
		return driver.findElement(NameAccount);
	}

	public WebElement getDropDownLogout()
	{
		return driver.findElement(DropDownLogout);
	}

//	public WebElement getEmail()
//	{
//		return driver.findElement(Email);
//	}
//	
//	public WebElement getPassword()
//	{
//		return driver.findElement(Password);
//	}
//
//	public WebElement getSignInBtn()
//	{
//		return driver.findElement(SignInBtn);
//	}

}

