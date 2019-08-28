package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

	public WebDriver driver;
	
	public SignIn(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	By MyAccount = By.cssSelector(".nav.navbar-nav.navbar-right.hidden-sm.go-left .nav.navbar-nav.navbar-side.navbar-right.sidebar.go-left.user_menu #li_myaccount .dropdown-toggle.go-text-right");
	By DropDownLogin = By.cssSelector(".nav.navbar-nav.navbar-right.hidden-sm.go-left .nav.navbar-nav.navbar-side.navbar-right.sidebar.go-left.user_menu #li_myaccount .dropdown-menu li:nth-child(1) .go-text-right");
	By Email = By.xpath("//input[@placeholder='Email']");
	By Password = By.xpath("//input[@placeholder='Password']");
	By SignInBtn = By.cssSelector(".btn.btn-action.btn-lg.btn-block.loginbtn");
	By InvaildDetails = By.cssSelector("div.alert.alert-danger");
	By SignUpBtn = By.xpath("//a[@class='btn btn-default br25 btn-block form-group']");
	
	
	
	public WebElement getMyAccount()
	{
		return driver.findElement(MyAccount);
	}

	public WebElement getDropDownLogin()
	{
		return driver.findElement(DropDownLogin);
	}

	public WebElement getEmail()
	{
		return driver.findElement(Email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}

	public WebElement getSignInBtn()
	{
		return driver.findElement(SignInBtn);
	}
	
	public WebElement getInvaildDetails()
	{
		return driver.findElement(InvaildDetails);
	}
	
	public WebElement getSignUpBtn()
	{
		return driver.findElement(SignUpBtn);
	}

}

