package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPom {
	public LogOutPom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	static WebElement logout;

	@FindBy(linkText = "Sign Out")
	static WebElement signout;


	public void lout() {
		logout.click();
	}
	public void signOut() {
		signout.click();
	}

	public void sgn() {
		lout();
		signOut();
	}
}
