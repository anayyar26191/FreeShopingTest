package com.flipKart.qa.testcases;

import org.testng.annotations.Test;

import com.flipKart.qa.base.TestBase;
import com.flipKart.qa.pages.HomePage;
import com.flipKart.qa.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
  
  @BeforeMethod
  public void setup() throws InterruptedException {
	  initializatiion();
	  loginPage = new LoginPage();
	  
  }
  
  @Test(priority=1)
  public void loginPageTitle(){
	 String title= loginPage.validateLoginPageTitle();
	 Assert.assertEquals(title,"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	  
  }
  @Test(priority=2)
  public void validateamzImageTest(){
	  boolean flag=loginPage.validateamzImage();
	  Assert.assertTrue(flag);
  }
  @Test(priority=3)
  public void loginTest(String email,String password) throws InterruptedException {
	  homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	 
  }
  
  @AfterMethod
  public void tearDown(){
	  driver.quit();
  }

}
