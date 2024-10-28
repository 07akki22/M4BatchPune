package com.crm.VtigerM4BaseClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerLogin {
	
	@FindBy(name = "user_name")
	public WebElement user_name;
	
	@FindBy(name  ="user_password")
	public WebElement user_password;
	
	@FindBy(id = "submitButton")
	public WebElement submitButton;
	
	public VtigerLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	
	
}
}
