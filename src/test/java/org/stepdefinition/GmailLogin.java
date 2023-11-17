//package org.stepdefinition;
//
//import org.base.BaseClass;
//import org.pojo.GmailLoginPojo;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class GmailLogin extends BaseClass {
//	
//	GmailLoginPojo g;
//	@Given("To launch the chromebrowser and maximise window")
//	public void to_launch_the_chromebrowser_and_maximise_window() {
//	    launchBrowser();
//	    windowMaximize();
//	}
//
//	@When("To launch the url of the flipkart application")
//	public void to_launch_the_url_of_the_flipkart_application() {
//	    launchUrl("https://accounts.google.com/v3/signin/identifier?dsh=S-1962851048%3A1682444512386017&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AQMjQ7Ty-Zn-EIalzwxwNegJDyRmzaT_9Dk4wEOD1EYxGOZ7SrV_Fk4j3zlLGEs75vmVR9NQBzlTLQ&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//	}
//
//	@When("To pass valid email address in email field")
//	public void to_pass_valid_email_address_in_email_field() {
//	    g = new GmailLoginPojo();
//	    passText("privin77492@gmail.com", g.getEmail());
//	}
//
//	@When("To click the next button")
//	public void to_click_the_next_button() {
//	    g = new GmailLoginPojo();
//	    clickBtn(g.getNextBtn());
//	}
//
//	@Then("To close the browser")
//	public void to_close_the_browser() {
//	    closeEntireBrowser();
//	}
//
//}
