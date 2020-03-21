package com.crm.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	DealsPage dealspage;
	TasksPage taskspage;
	TestUtil tetsutil;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void Setup()
	{
		 initialization();
		 loginpage = new LoginPage();
		 homepage  = new HomePage();
		 tetsutil  = new TestUtil();
		 homepage  =  loginpage.validateUser(prop.getProperty("username"), prop.getProperty("password"));
		// contactspage = homepage.clickOnContcatLink();
	}
	
	@Test(priority=1)
	public void HomePageTitleTest()
	{
		String htitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(htitle, "Cogmento CRM","Case Failed: title not matched");
	}
	
	@Test(priority=2)
	public void userLableTest()
	{
		boolean userlable = homepage.verifyUserLableName("Pravesh Kumar");
		Assert.assertTrue(userlable);
	}
	
	@Test(priority=3)
	public void contactsLinkTest()
	{
		contactspage = homepage.clickOnContcatLink();
	}
	/*
	@Test(priority=4)
	public void DealsLinkTest()
	{
		dealspage = homepage.verifyDealsPage();
	}
	
	@Test(priority=5)
	public void taskPageTest()
	{
		taskspage = homepage.verifyTasksPage();
	}*/
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}

}
