package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	DealsPage dealspage;
	TasksPage taskspage;
	TestUtil testsutil;
	String sheetName = "Contacts";
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		testsutil = new TestUtil();
		contactspage = new ContactsPage();
		loginpage 	= new LoginPage();
		homepage  	= loginpage.validateUser(prop.getProperty("username"),prop.getProperty("password"));
		contactspage = homepage.clickOnContcatLink();
		
	}
	
	@Test(priority=1)
	public void verifyContactsLableTest()
	{
		Assert.assertTrue(contactspage.verifyContactsLable());
	}
	
	@Test(priority=2)
	public void selectContactByName()
	{
		contactspage.selectContactsByName("Allen J Cooper");
	}
	
	@Test(priority=3)
	public void selectMultipleContactByName()
	{
		contactspage.selectContactsByName("Allen J Cooper");
		contactspage.selectContactsByName("Mikal");
	}
	
	@Test(priority=4)
	public void clickOnShowBtnTest()
	{
		contactspage.clickOnShowFilterBtn();
	}
		
	@DataProvider
	public Object[][] getCRMTestData()
	{
		Object[][] data = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=5,dataProvider="getCRMTestData")
	public void createNewContactTest(String FirstName, String MiddleName, String LastName, String EmailAddress, String Description)
	{
		contactspage.createNewContact(FirstName,MiddleName,LastName,EmailAddress,Description);
	}
	
	
	@AfterMethod
	public void tearDown()	
	{
		//driver.quit();
	}
}
