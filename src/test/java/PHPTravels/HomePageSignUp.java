package PHPTravels;

import java.io.IOException;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.SignOut;
//import pageObjects.SignIn;
import pageObjects.SignUp;
//import pageObjects.LandingPage;
//import pageObjects.LoginPage;
import resources.base;

public class HomePageSignUp extends base {

//	public static Logger Log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initializeDriver() throws IOException
	{
		driver=initialiizeDriver();
	}
	
	@Test(dataProvider="getData")
	public void baseHomePageSignUp(String firstname, String lastname, String mobilenumber, String email, 
			String password, String passwordconfirm) throws InterruptedException
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		SignUp su = new SignUp(driver);
		su.getMyAccount().click();
//		Thread.sleep(3000);
		su.getDropDownSignUp().click();
//		Thread.sleep(3000);
		su.getFirstName().sendKeys(firstname);
		su.getLastName().sendKeys(lastname);
		su.getMobileNumber().sendKeys(mobilenumber);
		su.getEmail().sendKeys(email);
		su.getPassword().sendKeys(password);
		su.getConfirmPassword().sendKeys(passwordconfirm);
		su.getSignUpBtn().click();
		Thread.sleep(3000);
		
		SignOut so = new SignOut(driver);
		so.getNameAccount().click();
//		Thread.sleep(3000);
		so.getDropDownLogout().click();
		Thread.sleep(3000);
	}
	

	@AfterTest
	public void teardown()
	{
		driver.close();
	}
		
		
	@DataProvider
	public Object[][] getData()
	{
//		Row stands for many different data types test should run
		Object[][] data = new Object[1][6];
		data[0][0] = "Nick";
		data[0][1] = "Follower";
		data[0][2] = "1234567890";
		data[0][3] = "nf@nf.com";		
		data[0][4] = "nf12345678";
		data[0][5] = "nf12345678";

		return data;
	}
}
