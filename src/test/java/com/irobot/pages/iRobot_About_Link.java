package com.irobot.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.irobot.utilities.Driver;

public class iRobot_About_Link{
	
	public iRobot_About_Link() {
		PageFactory.initElements(Driver.get(), this);
	}
	
	private String url;
	
	private String about = "//A[@class='a-link a-link--nav'][text()='About']";
	
	private String company_overview = "(//A[@class='a-link'][text()='Overview'][text()='Overview'])[1]";
	
	
	private String history = "//A[@class='a-link'][text()='History']";
	
	private String mng_team = "//A[@class='a-link'][text()='Leadership Team']";
	
	private String board_mem = "//A[@class='a-link'][text()='Board Members']";
	
	
	private String tech_org = "//A[@class='a-link'][text()='Technology Organization']";
	

	private String iR_ventures = "//A[@class='a-link'][text()='iRobot Ventures']";
	

	private String stem_overview = "(//A[@class='a-link'][text()='Overview'][text()='Overview'])[2]";
	

	private String stem_resource = "//A[@class='a-link'][text()='STEM Resources']";
	

	private String create_two = "//A[@class='a-link'][text()='Create 2']";
	

	private String create_two_proj = "//A[@class='a-link'][text()='Create 2 Projects']";
	
	private String investors_overview = "(//A[@class='a-link'][text()='Overview'][text()='Overview'])[3]";
	

	private String stock_info = "//A[@class='a-link'][text()='Stock Information']";
	

	private String press_overview = "(//A[@class='a-link'][text()='Media Kits']";
	

	private String careers_overview = "(//A[@class='a-link'][text()='Overview'][text()='Overview'])[4]";

	private String what_set_us = "//A[@class='a-link'][text()='What Sets Us Apart']";
	
	private String tech_futurist = "//A[@class='a-link'][text()='Tech Futurist']";
	

	private String Buss_genius = "//A[@class='a-link'][text()='Business Genius']";
	

	private String internships = "//A[@class='a-link'][text()='Internships']";
	

	private String how_we_hire = "//A[@class='a-link'][text()='How We Hire']";
	

	private String job_search = "//A[@class='a-link'][text()='Job Search']";
	
	public void loopdev() {
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

	}
	
	public void loopinvestor() {
		if(url.contains("investor"))
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
	}
	
	public void loopmedia() {
		if(url.contains("media"))
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
	}
	
	public void loopworkday() {
		if(url.contains("myworkdayjobs"))
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
	}
	
	public void linkclick() {
		Driver.get().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Driver.get().findElement(By.xpath(about)).click();
		
	}

	public void company_info() {
		Driver.get().findElement(By.xpath(company_overview)).click();
		url = Driver.get().getCurrentUrl();
		loopdev();
		linkclick();
	}
	public void stem() {
		Driver.get().findElement(By.xpath(stem_overview)).click();
		url = Driver.get().getCurrentUrl();
		loopdev();
		linkclick();
	}
	
	public void investors() {
		Driver.get().findElement(By.xpath(investors_overview)).click();
		url = Driver.get().getCurrentUrl();
		loopinvestor();
		linkclick();
	}
	
	public void careers() {
		Driver.get().findElement(By.xpath(careers_overview)).click();
		url = Driver.get().getCurrentUrl();
		loopdev();
		linkclick();
		Driver.get().close();
	}
	
}