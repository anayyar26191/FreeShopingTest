package com.flipKart.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.flipKart.qa.utils.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
public TestBase() {
	
	
    FileInputStream ip;
	try {
		prop = new Properties();
		ip = new FileInputStream("/Users/macbookpro/Desktop/Selenium/FreeShopingTest/"
				+ "src/main/java/com/flipKart/qa/config/config.properties");

		prop.load(ip);
	}
	catch (FileNotFoundException e1) {
		e1.printStackTrace();
	}
    
	catch (IOException e) {
		e.printStackTrace();
	}

}
public static void initializatiion(){
	String browserName =prop.getProperty("browser");
	if(browserName.equals("chrome"))
	
	{
		System.setProperty("webdriver.chrome.driver", "/Users/macbookpro/Desktop/Selenium/tools//chromedriver");
		driver = new ChromeDriver();
		System.out.println("Google Chrome Browser");
	}
	else if(browserName.equals("FireFox")){
		System.setProperty("webdriver.geckodriver.driver","/Users/macbookpro/Desktop/Selenium/tools//geckodriver");
		driver = new FirefoxDriver();
		System.out.println("FireFox");
	}
	
	/*else if(browserName.equals("IE")){
		System.setProperty("webdriver.ie.driver","/Users/macbookpro/Desktop/Selenium/tools//IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		System.out.println("IE");
	}*/
	else{
		System.out.println("no browser value is given");		
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAG_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
}
}
