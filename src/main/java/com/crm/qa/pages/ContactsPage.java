package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black' and (text()='Contacts')]")
	WebElement contactlable;
		
	@FindBy(xpath="//button[contains(text(),'Show Filters')]")
	WebElement showfilterBtn;
	
	// Create New Contact PageFactory
	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement newbtn;
	
	@FindBy(name="first_name")
	WebElement ufname;
	
	@FindBy(name="middle_name")
	WebElement umname;
	
	@FindBy(name="last_name")
	WebElement ulname;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement enteremail;
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement enterDescription;
	
	@FindBy(xpath="//i[@class='save icon']")
	WebElement savebtn;
	
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactsLable()
	{
		return contactlable.isDisplayed();
	}
	
	public void selectContactsByName(String name)
	{
		driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]")).click();
	}
	
	public void clickOnShowFilterBtn()
	{
		showfilterBtn.click();
	}
	
	public void clickOnNewBUtton()
	{
		newbtn.click();
	}
	
	public void createNewContact(String fn, String mn,String ln, String email, String desc)
	{
		newbtn.click();
		ufname.sendKeys(fn);
		umname.sendKeys(mn);
		ulname.sendKeys(ln);
		enteremail.sendKeys(email);
		enterDescription.sendKeys(desc);
		savebtn.click();
		
	}

}
