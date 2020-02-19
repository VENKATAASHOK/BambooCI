package com.irobot.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.irobot.utilities.Driver;

public class iRobot_minicart_functionality {
	
	public iRobot_minicart_functionality() {
		PageFactory.initElements(Driver.get(), this);
	}
	
	@FindBy(xpath = "//A[@class='a-link a-link--nav'][text()='Products']")
	private WebElement product;
	
	@FindBy(xpath = "//IMG[@src='/-/media/images/features/navigation/roomba/s9_s9-_photo_studio_frontstanding_hero_desktop_550x550.ashx?h=300&la=en&mh=300&mw=300&w=300&lm=636879291290000000&hash=DA60648F9A987D766FF340CA013AA139']")
	private WebElement s_Series ;
	
	private String shop_now = "https://store.irobot.com/default/roomba-robot-vacuums/irobot-roomba-s9-robot-vacuum-and-braava-jet-m6-robot-mop-bundle/4699392.html?_ga=2.156989371.1499271464.1582036956-1583972020.1578588772";

	@FindBy(xpath = "//BUTTON[@id='add-to-cart']")
	private WebElement add_to_cart;
	
	private String logo ="//IMG[@src='https://www.irobot.com/-/media/images/features/navigation/irobot-logo/logoani3.ashx?h=44&la=en&w=115&lm=637166116590000000&hash=1182D73EDEFB5F77D6596B46F86F9E10']";
	
	private String mini_cart = "(//I[@class='a-icon fas fa-shopping-cart'])[2]";
	
	private String url;
	
	Actions actions = new Actions(Driver.get());
	
	public void iconclick() {
		// TODO Auto-generated method stub
		product.click();
		
	}

	public void select() {
		// TODO Auto-generated method stub
		s_Series.click();
		Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void shopnow() {
		Driver.get().get(shop_now);
	}

	public void checkpage() {
		// TODO Auto-generated method stub
		url = Driver.get().getCurrentUrl();
		System.out.println(url);
		if(url.contains("store"))
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

	public void addtocart() {
		// TODO Auto-generated method stub
		add_to_cart.click();
	}

	public void home() {
		// TODO Auto-generated method stub
		Driver.get().findElement(By.xpath(logo)).click();
	}

	public void fxm_mini_check() {
		// TODO Auto-generated method stub
		Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("okayyy");
	}
	

}
