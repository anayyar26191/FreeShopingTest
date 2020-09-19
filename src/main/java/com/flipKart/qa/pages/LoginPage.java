package com.flipKart.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipKart.qa.base.TestBase;

public class LoginPage extends TestBase {
//Page Factory Object Repository
	
@FindBy(xpath="//span[starts-with(text(),'Hello')]")
WebElement accountlogin;

@FindBy(xpath="//input[@name='email']")
WebElement username;

@FindBy(xpath="//input[@id='ap_password']")
WebElement password;

@FindBy(xpath="//input[@class='a-button-input']")
WebElement signInBtn;

@FindBy(xpath="//span[@class='nav-sprite nav-logo-base']")
WebElement amzImage;


//Initializing Page Objects
public LoginPage(){
	PageFactory.initElements(driver,this);		
}

//Actions
public String validateLoginPageTitle(){
	return driver.getTitle();
}
public boolean validateamzImage(){
	return amzImage.isDisplayed();
}
public HomePage login(String un,String pwd) throws InterruptedException{
	accountlogin.click();
	username.sendKeys("username"+Keys.ENTER);
	password.sendKeys("password"+Keys.ENTER);
	Thread.sleep(4000);
	signInBtn.click();
	
	prop.getProperty("username","password");
	return new HomePage();
}
}
