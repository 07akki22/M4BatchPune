package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomPage1 {

	public LoginPomPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(name = "user_name")
	WebElement username;
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement login_button;
	
	
	public void username(String data)
	{
		username.sendKeys(data);
	}
	public void password(String data)
	{
		password.sendKeys(data);
	}
	public void loginButton()
	{
		login_button.click();
	}
	
	
	public void login(String username,String password)
	{
		username(username);
		password(password);
		loginButton();
	}
	
}