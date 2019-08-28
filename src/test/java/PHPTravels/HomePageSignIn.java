package PHPTravels;

import java.io.IOException;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.SignIn;
import pageObjects.SignOut;
import pageObjects.SignUp;
import resources.base;

public class HomePageSignIn extends base {

//	public static Logger Log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initializeDriver() throws IOException
	{
		driver=initialiizeDriver();
	}
	
	@Test(dataProvider="getData")
	public void baseHomePageSignIn(String email, String password, String firstname, String lastname, 
			String mobilenumber) throws InterruptedException
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		SignIn si = new SignIn(driver);
		si.getMyAccount().click();
//		Thread.sleep(3000);
		si.getDropDownLogin().click();
//		Thread.sleep(3000);
		si.getEmail().sendKeys(email);
		si.getPassword().sendKeys(password);
		si.getSignInBtn().click();
		Thread.sleep(3000);
		
		if(si.getInvaildDetails().isDisplayed()) {
			System.out.println("account does not exist!!");
			Thread.sleep(3000);
			si.getSignUpBtn().click();
			
			// SignUp
			SignUp su = new SignUp(driver);
			su.getFirstName().sendKeys(firstname);
			su.getLastName().sendKeys(lastname);
			su.getMobileNumber().sendKeys(mobilenumber);
			su.getEmail().sendKeys(email);
			su.getPassword().sendKeys(password);
			su.getConfirmPassword().sendKeys(password);
			su.getSignUpBtn().click();
			Thread.sleep(3000);
			
		} 

			
		// Account page logout
		SignOut so = new SignOut(driver);
		so.getNameAccount().click();
//		Thread.sleep(3000);
		so.getDropDownLogout().click();
		Thread.sleep(3000);
	}
	

	@AfterTest
	public void teardown()
	{
//		driver.close();
	}
		
		
	@DataProvider
	public Object[][] getData()
	{
//		Row stands for many different data types test should run
		Object[][] data = new Object[1][5];
		data[0][0] = "nf@nf.com";
		data[0][1] = "nf12345678";
		data[0][2] = "Nick";
		data[0][3] = "Follower";
		data[0][4] = "1234567890";

		
		return data;
	}
}
