package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {

	@Before(order = 6)
	private void precondition3() {
			launchBrowser();			
	}
	
	@Before(order = 12)
	private void precondition1() {		
			windowMaximize();
	}
		
	@After(order = 20)
	private void postcondition8() {
		System.out.println("Post Condiition 8");
	}
	
	@After(order = 14)
	private void postcondition5() {
		closeEntireBrowser();
	}
}
