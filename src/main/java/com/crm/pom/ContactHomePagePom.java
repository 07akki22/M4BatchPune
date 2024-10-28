package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactHomePagePom {

	public ContactHomePagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//navigate to contact
	@FindBy(linkText = "Contacts")
	WebElement cont;
	public void contact() {
		cont.click();
	}
	// click on create new contact
	@FindBy(xpath = "//img[@alt='Create Contact...']")
	WebElement cCont;
	public void cContact() {
		cCont.click();
	}
//	last name
	private @FindBy(name ="lastname")
	WebElement last_Name;
	public void lastName(String data) {   
		last_Name.sendKeys(data);
	}
//	click on assign to
	@FindBy(name = "assigntype")
	WebElement assTo;
	public void assignTo() {
		assTo.click();
	}
	
	//click on start date
	@FindBy(xpath = "//img[@id='jscal_trigger_support_start_date']")
	WebElement s_date;
	public void start_date() {
		s_date.click();
	}
	//choose date
	@FindBy(xpath = "(//td[@class=\"day\"])[19]")
	WebElement select_date;
	public void sel_date() {
		select_date.click();
	}
	//end date
	@FindBy(id = "jscal_trigger_support_end_date")
	WebElement end_date;
	public void endDate() {
		end_date.click();
	}
	//Chose end Date
//	@FindBy(xpath = "//td[text()='8']")
//	WebElement select_EndDate;
//	public void selEndDate() {
//		select_EndDate.click();
//	}
	
	//save
	@FindBy(xpath = "(//input[@title=\"Save [Alt+S]\"])[2]")
	WebElement save_button;
	public void saveButton() {
		save_button.click();
	}
	public void test3(String data1) throws InterruptedException {
		contact();
		Thread.sleep(1000);
		cContact();
		Thread.sleep(1000);
		lastName(data1);
		Thread.sleep(1000);
		assignTo();
		Thread.sleep(1000);
		start_date();
		Thread.sleep(1000);
		sel_date();
		Thread.sleep(2000);
		endDate();
		Thread.sleep(2000);
//		selEndDate();
//		Thread.sleep(2000);
		
	}
	
	@FindBy(xpath = "//img[@src=\"themes/softed/images/select.gif\"]")
	WebElement add_company;
	public void addCompany() {
		add_company.click();
	}
	//select comp
	@FindBy(xpath = "//a[@id='9']")
	WebElement company;
	public void addCompanys() {
		company.click();
	}
	public void test4(String data1) throws InterruptedException {
		contact();
		Thread.sleep(1000);
		cContact();
		Thread.sleep(1000);
		lastName(data1);
		Thread.sleep(1000);
		assignTo();
		Thread.sleep(1000);
		addCompany();
		
	}
}
