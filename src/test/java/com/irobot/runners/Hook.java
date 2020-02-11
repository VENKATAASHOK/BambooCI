package com.irobot.runners;
import com.irobot.utilities.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
public class Hook {

	
	@Before
    public void setup(){
        System.out.println("##############################");
        System.out.println("Test setup!");
        Driver.get().manage().window().maximize();
        
}
	@After
    public void close() {
		System.out.println("##############################");
        System.out.println("Test case completed!");
        Driver.close();
	}
}
