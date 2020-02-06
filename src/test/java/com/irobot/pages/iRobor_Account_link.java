package com.irobot.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.irobot.utilities.Driver;

public class iRobor_Account_link {
	
	public iRobor_Account_link() {
		
		PageFactory.initElements(Driver.get(), this);
	}
	private String account = "(//I[@class='a-icon fa fa-user'])[1]";
	
	private String accounturl;
	private String storeurl = "store";
	
	public void iconclick() {
		Driver.get().findElement(By.xpath(account)).click();
		accounturl = Driver.get().getCurrentUrl();
		System.out.println(accounturl);
	}
	
	public void returnpage() {
		Driver.get().navigate().back();
		System.out.println(accounturl);
		if(accounturl.contains(storeurl))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
		}
	}

}
