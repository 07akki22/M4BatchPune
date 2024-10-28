package com.crm.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrganizationHomePagePom {

	public OrganizationHomePagePom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Click organization
	private @FindBy(linkText = "Organizations")
	WebElement organizations;
	
	public void organization() {
		organizations.click();
	}
	//Click Create new organization
	private @FindBy(xpath = "//img[@title='Create Organization...']")
	WebElement crete_orgnization;
	
	public void createOrganization() {
		crete_orgnization.click();
	}
	
	//enter organization name
	private @FindBy(xpath = "//input[@name='accountname']")
	WebElement Organization_Name;
	public void name(String data) {
		Organization_Name.sendKeys(data);
	}
	
	//click assign to
	private @FindBy(xpath = "//input[@value='U']")
	WebElement assignto;
	
	public void assignTo() {
		assignto.click();
	}
	//click save button
	private @FindBy(name = "button")
	WebElement save;
	public void save1() {
		save.click();
	}
	
	public void og(String orgname) throws InterruptedException  {
		organization();
		Thread.sleep(1000);
		createOrganization();
		Thread.sleep(1000);
		name(orgname);
		Thread.sleep(1000);
		assignTo();
		Thread.sleep(1000);
		save1();
		Thread.sleep(3000);
	}
	//for test case2
	@FindBy(xpath = "//select[@name='industry']")
	WebElement indus;
	public void industry() {
		indus.click();
	}
	@FindBy(xpath = "//option[@value='Engineering']")
	WebElement eng;
	public void engineering() {
		eng.click();
	}
	public void test2() throws InterruptedException {
		organization();
		Thread.sleep(1000);
		createOrganization();
		Thread.sleep(1000);
		industry();
		Thread.sleep(1000);
		engineering();
	}

}