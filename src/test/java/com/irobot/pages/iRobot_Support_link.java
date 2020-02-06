package com.irobot.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.irobot.utilities.Driver;

public class iRobot_Support_link{
	
	public iRobot_Support_link() {
		
		PageFactory.initElements(Driver.get(), this);
	}

	private String url;
	

	private String support = "//A[@class='a-link a-link--nav'][text()='Support']";
	
	private String findans = "//IMG[@src='/-/media/images/features/navigation/support/find_answers.ashx?h=116&la=en&mh=300&mw=300&w=117&lm=636911243120000000&hash=3DDC29452FD85BEAB4C763D62BD992C9']";
	

	private String regrob = "//IMG[@src='/-/media/images/features/navigation/support/register_your_robot-700x700.ashx?h=116&la=en&mh=300&mw=300&w=116&lm=636911243530000000&hash=C836F9B8493815260EB3C053063834CE']";
	

	private String ret_warr = "//IMG[@src='/-/media/images/features/navigation/support/warranty-700x578.ashx?h=116&la=en&mh=300&mw=300&w=117&lm=636911248440000000&hash=584902F8195EF4EB20A5113CD9209BA3']";
	

	private String contact_cust_care = "//IMG[@src='/-/media/images/features/navigation/support/contact_care.ashx?h=117&la=en&mh=300&mw=300&w=117&lm=636911242730000000&hash=19C19509F26CCF6A27F32D745395E370']";
	

	private String access_parts = "//A[@class='a-link'][contains(text(),'Accessories ')]";
	

	private String auth_resell = "//A[@class='a-link'][text()='Authorized Resellers']";
	
	public void linkclick() {
		Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.get().findElement(By.xpath(support)).click();
		
	}
	public void findans() {
		Driver.get().findElement(By.xpath(findans)).click();
		url = Driver.get().getCurrentUrl();
		System.out.println(url);
		if(url.contains("homesupport"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
			
		}
		Driver.get().navigate().back();
		linkclick();
		System.out.println("out of find ans");
		
	}
	
	public void regrob() {
		
		Driver.get().findElement(By.xpath(regrob)).click();
		url = Driver.get().getCurrentUrl();
		System.out.println(url);
		if(url.contains("homesupport"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
			
		}
		Driver.get().navigate().back();
		linkclick();
		
	}
	public void ret_warr() {
	    // Write code here that turns the phrase above into concrete actions
		Driver.get().findElement(By.xpath(ret_warr)).click();
		url = Driver.get().getCurrentUrl();
		System.out.println(url);
		if(url.contains("irobot.com"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
			
		}
		linkclick();
		
	}
	public void contact_cust_care() {
		Driver.get().findElement(By.xpath(contact_cust_care)).click();
		url = Driver.get().getCurrentUrl();
		System.out.println(url);
		if(url.contains("homesupport"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
			
		}
		Driver.get().navigate().back();
		linkclick();
	}
	public void access_parts() {
		Driver.get().findElement(By.xpath(access_parts)).click();
		url = Driver.get().getCurrentUrl();
		System.out.println(url);
		if(url.contains("store.irobot.com"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
			
		}
		Driver.get().navigate().back();
		linkclick();
		
	}
	public void auth_resell() {
		Driver.get().findElement(By.xpath(auth_resell)).click();
		url = Driver.get().getCurrentUrl();
		System.out.println(url);
		if(url.contains("irobot.com"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
			
		}
		Driver.get().navigate().back();
		Driver.get().close();
		
	}	
	
}
