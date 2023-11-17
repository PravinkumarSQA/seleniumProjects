//package org.stepdefinition;
//
//import org.base.BaseClass;
//import org.pojo.GmailLoginPojo;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class PositiveandNegativeofGmail extends BaseClass {
//	
//	GmailLoginPojo g;
//	@Given("User has to launch the browser and maximise the window")
//	public void user_has_to_launch_the_browser_and_maximise_the_window() {
//	    launchBrowser();
//	    windowMaximize();
//	}
//
//	@When("User has to hit the gmail url")
//	public void user_has_to_hit_the_gmail_url() {
//	    launchUrl("https://accounts.google.com/v3/signin/identifier?dsh=S-1962851048%3A1682444512386017&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AQMjQ7Ty-Zn-EIalzwxwNegJDyRmzaT_9Dk4wEOD1EYxGOZ7SrV_Fk4j3zlLGEs75vmVR9NQBzlTLQ&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//	}
//
//	@When("User has to pass the data in {string} email field")
//	public void user_has_to_pass_the_data_in_email_field(String em) {
//	    g = new GmailLoginPojo();
//	    passText(em, g.getEmail());
//	}
//
//	@When("User has to click the next button")
//	public void user_has_to_click_the_next_button() {
//	    g = new GmailLoginPojo();
//	    clickBtn(g.getNextBtn());
//	}
//
//	@Then("User has to close the Browser")
//	public void user_has_to_close_the_Browser() {
//	    closeEntireBrowser();
//	}
//
//}
