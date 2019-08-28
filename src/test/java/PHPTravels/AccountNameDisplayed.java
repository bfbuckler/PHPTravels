package PHPTravels;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.SignIn;
import pageObjects.SignOut;
import resources.base;

public class AccountNameDisplayed extends base {

//	public static Logger Log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initializeDriver() throws IOException
	{
		driver=initialiizeDriver();
	}
	
	@Test(dataProvider="getData")
	public void baseHomePageSignIn(String email, String password, String accountname ) throws InterruptedException
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		SignIn si = new SignIn(driver);
		si.getMyAccount().click();
		si.getDropDownLogin().click();
		si.getEmail().sendKeys(email);
		si.getPassword().sendKeys(password);
		si.getSignInBtn().click();

		
		// Check Name is correctly displayed
		AccountPage ap = new AccountPage(driver);
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.visibilityOf(ap.getAcctName()));
		
		System.out.println(ap.getAcctName().getText());
		assertTrue(ap.getAcctName().getText().equals(accountname));
		
		// Account page logout
		SignOut so = new SignOut(driver);
		so.getNameAccount().click();
//		Thread.sleep(3000);
		so.getDropDownLogout().click();
		Thread.sleep(3000);
	}
	
//	public void AcctDetials() throws InterruptedException
//	{
//		AccountPage ad = new AccountPage(driver);
//		System.out.println(ad.getAcctName().getText());
//	}
	
//	@Test(dataProvider="getData")
//	public void basePageNavigation(String username, String password) throws IOException, InterruptedException
//	{
//		driver.get(prop.getProperty("url"));
////		Thread.sleep(2000);
//		driver.manage().window().maximize();
//		// To get a class 2 ways (i) inheritance i.e. extend base (ii) create object of the class to invoke methods
//		LandingPage l = new LandingPage(driver);
//		l.getLogin().click();  // old way is to do this driver.findElement(By.cssSelector) - no hardcoding
//		LoginPage lp = new LoginPage(driver);
//		lp.getEmail().sendKeys(username);
//		lp.getPassword().sendKeys(password);
//		lp.getLogin().click();
//		
//		Log.info(username);
//	}
//	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
//		
//		
	@DataProvider
	public Object[][] getData()
	{
//		Row stands for many different data types test should run
		Object[][] data = new Object[1][3];
		data[0][0] = "nf@nf.com";
		data[0][1] = "nf12345678";
		data[0][2] = "Hi, Nick Follower";
//		data[1][0] = "restricteduser@qa.com";
//		data[1][1] = "123456";
//		data[1][2] = "restricted user";
		
		return data;
	}
}
