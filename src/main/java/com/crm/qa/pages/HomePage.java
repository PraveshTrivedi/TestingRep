package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement taksLink;
	
	public HomePage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyUserLableName(String userlable)
	{
		return driver.findElement(By.xpath("//span[contains(text(),'"+userlable+"')]")).isDisplayed();
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContcatLink()
	{
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage verifyDealsPage()
	{
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage verifyTasksPage()
	{
		taksLink.click();
		return new TasksPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
