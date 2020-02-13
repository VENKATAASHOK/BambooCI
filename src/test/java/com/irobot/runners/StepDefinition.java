package com.irobot.runners;


import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;

import java.util.concurrent.TimeUnit;

import com.irobot.pages.iRobor_Account_link;
import com.irobot.pages.iRobot_About_Link;
import com.irobot.pages.iRobot_Support_link;
import com.irobot.utilities.Driver;

public class StepDefinition{
	
	iRobor_Account_link accountlink ;
	
	iRobot_Support_link supportlink;
	
	iRobot_About_Link aboutlink;
	
	//******************** ACCOUNT ICON SCENARIO*********************************//

	@Given("^user is on dev Home Page$")
	public void user_is_on_dev_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
		Driver.get().get("https://www.irobot.com/");
		Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}


	@When("^he clicks on the account icon$")
	public void he_clicks_on_the_account_icon()  {
	    // Write code here that turns the phrase above into concrete actions
		accountlink = new iRobor_Account_link();
		accountlink.iconclick();
	}

	@When("^he returns to the home page$")
	public void he_returns_to_the_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		accountlink.returnpage();
		Driver.get().close();
	}
	
	//***********************************SUPPORT LINK SCENARIO************************************//
	
	@When("^user clicks on the support link$")
	public void user_clicks_on_the_support_link() {
	    // Write code here that turns the phrase above into concrete actions
		supportlink = new iRobot_Support_link();
		supportlink.linkclick();
	}


	@When("^user clicks on find answers$")
	public void user_clicks_on_find_answers() {
	    // Write code here that turns the phrase above into concrete actions
		supportlink.findans();
	}
	
	@When("^user clicks on Register Robots$")
	public void user_clicks_on_Register_Robots() {
	    // Write code here that turns the phrase above into concrete actions
		supportlink.regrob();
	}


	@When("^user clicks on Returns and warranties$")
	public void user_clicks_on_Returns_and_warranties() {
		supportlink.ret_warr();
	}

	@When("^user clicks on contact customer care$")
	public void user_clicks_on_contact_customer_care() {
	    // Write code here that turns the phrase above into concrete actions
		supportlink.contact_cust_care();
	}

	@When("^user clicks on accesories and parts$")
	public void user_clicks_on_accesories_and_parts() {
	    // Write code here that turns the phrase above into concrete actions
		//supportlink.access_parts();
	}

	@When("^user clicks on authorized resellers$")
	public void user_clicks_on_authorized_resellers() {
	    // Write code here that turns the phrase above into concrete actions
		supportlink.auth_resell();
	}
	
	
	//***********************************About link scenario************************************//
	
	
	@When("^user clicks on the about link$")
	public void user_clicks_on_the_about_link() {
		aboutlink = new iRobot_About_Link();
		aboutlink.linkclick();	
	}


	@When("^user checks all the links under company info$")
	public void user_checks_all_the_links_under_company_info() {
	    // Write code here that turns the phrase above into concrete actions
		aboutlink.company_info();

	}

	@When("^user checks all the links under stem$")
	public void user_checks_all_the_links_under_stem() {
	    // Write code here that turns the phrase above into concrete actions
		aboutlink.stem();

	}

	@When("^user checks all the links under investors$")
	public void user_checks_all_the_links_under_investors() {
	    // Write code here that turns the phrase above into concrete actions
		aboutlink.investors();

	}

	@When("^user checks all the links under press$")
	public void user_checks_all_the_links_under_press() {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@When("^user checks all the links under careers$")
	public void user_checks_all_the_links_under_careers() {
	    // Write code here that turns the phrase above into concrete actions
		aboutlink.careers();
	}
		
	
}