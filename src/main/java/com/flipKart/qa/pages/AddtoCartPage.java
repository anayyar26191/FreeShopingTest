package com.flipKart.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipKart.qa.base.TestBase;

public class AddtoCartPage extends TestBase{
	
@FindBy(xpath="//input[@name='field-keywords']")
WebElement searchBox;

@FindBy(xpath="//div[4]//div[1]//span[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//span[1]//a[1]//div[1]//img[1]")
WebElement selectItem;

@FindBy(xpath="//button[@id='a-autoid-10-announce']")
WebElement white;

@FindBy(xpath="//span[@id='submit.add-to-cart-announce']")
WebElement addToCartBtn;

@FindBy(xpath="//span[@id='nav-cart-count']")
WebElement verifyaddToCartBkt;

//Initializing Page Objects
public AddtoCartPage(){
	PageFactory.initElements(driver,this);		
}

//Actions
public String validateAddtoCartPageTitle(){
	return driver.getTitle();
}

public void validateSeachBox(String sea) throws InterruptedException{

	searchBox.sendKeys("Mobile Phones"+Keys.ENTER);
	
	driver.getTitle();
	Actions act =new Actions(driver);
	act.moveToElement(selectItem).click().build().perform();
}
public void list1() throws InterruptedException{
List<WebElement> color=driver.findElements(By.xpath("//ul[@role='radiogroup']"));
 System.out.println(color.size());
 for(int i=0;i<color.size();i++){
	 System.out.println(color.get(i));
	 Actions act1 =new Actions(driver);
		act1.moveToElement(color.get(1)).click().build().perform();
 
	 
 }
white.click();


Actions act2 =new Actions(driver);
act2.moveToElement(addToCartBtn).click().build().perform();
Thread.sleep(3000);


driver.findElement(By.xpath("//span[@class='a-button a-button-base attach-button-large']")).click();;

Thread.sleep(5000);

Actions act3 =new Actions(driver);
act3.moveToElement(verifyaddToCartBkt).click().build().perform();
}
}

 
  

