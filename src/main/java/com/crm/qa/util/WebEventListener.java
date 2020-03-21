package com.crm.qa.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.crm.qa.base.TestBase;

public class WebEventListener extends TestBase implements WebDriverEventListener {

	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before Nevigating to:'" + url + "'");
		
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("Nevigated to:'" + url + "'");
		
	}

	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Before Nevigating Back to Previous Page");
		
	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("After Nevigating Back to Previous Page");
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Before Nevigating forward to next Page");
		
	}

	public void afterNavigateForward(WebDriver driver) {
		System.out.println("After Nevigating forward to next Page");
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Trying to find Element By: "+ by.toString());
		
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("found Element By: "+ by.toString());
		
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Trying to clickOn:'"+element.toString());
		
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("After clicked On:'"+element.toString());
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver,
			CharSequence[] keysToSend) {
		System.out.println("Value of the:'"+element.toString()+"before any changes made");
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver,
			CharSequence[] keysToSend) {
		System.out.println("Element Value changed to:'"+element.toString());
		
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void onException(Throwable error, WebDriver driver) {
		System.out.println("Exception Occured: "+ error);
		try{
			TestUtil.takeScreenshotAsEnd();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

}
