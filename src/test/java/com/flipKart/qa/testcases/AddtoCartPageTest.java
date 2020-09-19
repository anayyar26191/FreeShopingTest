package com.flipKart.qa.testcases;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipKart.qa.base.TestBase;
import com.flipKart.qa.pages.AddtoCartPage;
import com.flipKart.qa.pages.HomePage;
import com.flipKart.qa.pages.LoginPage;

public class AddtoCartPageTest extends TestBase {

HomePage homePage;
AddtoCartPage addToCartPage;

public AddtoCartPageTest(){
super();
}

@BeforeMethod
public void setup() throws InterruptedException {
	  initializatiion();
	  addToCartPage = new AddtoCartPage();
}

	 
  @Test(priority=4)
  public void addtoCartPageTest() throws InterruptedException {
	  addToCartPage.validateSeachBox(prop.getProperty("Mobile Phones"+Keys.ENTER));
  
  
  }
 @Test(priority=5)
 public void listTest() throws InterruptedException{
	 addToCartPage.list1();
 }
  
  @AfterMethod
  public void teardown(){
	  //driver.close();
  }
  
}
