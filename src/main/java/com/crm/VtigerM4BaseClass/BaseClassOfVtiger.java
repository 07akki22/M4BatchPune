package com.crm.VtigerM4BaseClass;

import java.io.IOException;
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

public class BaseClassOfVtiger {
		public static WebDriver driver=null;
		
		@BeforeClass
			public void preCondition() throws IOException
			{
			String browser=PropertiesFileVtiger.property("browser");
			String url = PropertiesFileVtiger.property("url");
			
				
				if(browser.equalsIgnoreCase("chrome"))
				{
					driver=new ChromeDriver();
				}
				else if(browser.equalsIgnoreCase("edge"))
				{
					driver=new EdgeDriver();
				}
				else if(browser.equalsIgnoreCase("firefox"))
				{
					driver=new FirefoxDriver();
				}
				else
				{
					driver=new ChromeDriver();
				}
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get(url);
				//String expected_url = url;
			    //String actual_url = driver.getCurrentUrl();
			    //assertEquals(expected_url, actual_url);
			    //System.out.println("Verification Done By using  Hard Assert Method");
			}
			
		    @BeforeClass
		    public void login() throws IOException
		    {
		    	System.out.println(".......LogIn Details.....");
		    	String userName = PropertiesFileVtiger.property("userName");
		    	String password = PropertiesFileVtiger.property("password");
		    	
		    	driver.findElement(By.name("user_name")).sendKeys(userName);
		    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		    	driver.findElement(By.xpath("//input[@type='submit']")).click();
			
		    }
		    @AfterMethod
		    public void logOut() throws InterruptedException
		    {
		    	System.out.println("....Logout Details......");
		    	Actions act=new Actions(driver);
		    	 WebElement img = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		    	act.moveToElement(img).build().perform();
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
		    }
		    @AfterClass
		    public void postCondition()
		    {
		    	driver.quit();
		    }
	
}
