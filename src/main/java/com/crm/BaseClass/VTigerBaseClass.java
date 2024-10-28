package com.crm.BaseClass;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.FileUtility.PropertiesFile;
import com.crm.VtigerM4BaseClass.PropertiesFileVtiger;
import com.crm.pom.LogOutPom;
import com.crm.pom.LoginPomPage1;

public class VTigerBaseClass {
	public WebDriver driver;
@BeforeClass
public void preCondition() throws IOException
{
	String browser = PropertiesFile.property("browser");
	String url = PropertiesFile.property("url");
	if(browser.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
	}
	else {
		driver = new ChromeDriver();
	}
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
}
@BeforeMethod
public void login() throws IOException {
	
	String userName = PropertiesFile.property("userName");
	String password = PropertiesFile.property("password");
	LoginPomPage1 obj = new LoginPomPage1(driver);
	obj.login(userName, password);
}

@AfterMethod
public void logOuts() throws InterruptedException
{
	LogOutPom obj1 = new LogOutPom(driver);
	obj1.sgn();

	
}
@AfterClass
public void postCondition()
{
	driver.quit();
}
}
