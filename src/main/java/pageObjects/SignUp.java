package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {

	public WebDriver driver;
	
	public SignUp(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	By MyAccount = By.cssSelector(".nav.navbar-nav.navbar-right.hidden-sm.go-left .nav.navbar-nav.navbar-side.navbar-right.sidebar.go-left.user_menu #li_myaccount .dropdown-toggle.go-text-right");
	By DropDownSignUp = By.cssSelector(".nav.navbar-nav.navbar-right.hidden-sm.go-left .nav.navbar-nav.navbar-side.navbar-right.sidebar.go-left.user_menu #li_myaccount .dropdown-menu li:nth-child(2) .go-text-right");
	By FirstName = By.xpath("//input[@placeholder='First Name']");
	By LastName = By.xpath("//input[@placeholder='Last Name']");
	By MobileNumber = By.xpath("//input[@placeholder='Mobile Number']");
	By Email = By.xpath("//input[@placeholder='Email']");
	By Password = By.xpath("//input[@placeholder='Password']");
	By ConfirmPassword = By.xpath("//input[@placeholder='Confirm Password']");
	By SignUpBtn = By.cssSelector(".signupbtn.btn_full.btn.btn-action.btn-block.btn-lg");
	
	public WebElement getMyAccount()
	{
		return driver.findElement(MyAccount);
	}

	public WebElement getDropDownSignUp()
	{
		return driver.findElement(DropDownSignUp);
	}

	public WebElement getFirstName()
	{
		return driver.findElement(FirstName);
	}

	public WebElement getLastName()
	{
		return driver.findElement(LastName);
	}
	
	public WebElement getMobileNumber()
	{
		return driver.findElement(MobileNumber);
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(Email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	
	public WebElement getConfirmPassword()
	{
		return driver.findElement(ConfirmPassword);
	}
	
	public WebElement getSignUpBtn()
	{
		return driver.findElement(SignUpBtn);
	}

}

