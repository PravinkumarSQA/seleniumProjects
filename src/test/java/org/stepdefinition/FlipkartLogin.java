//package org.stepdefinition;
//
//import org.base.BaseClass;
//import org.sam.FkLoginPojo;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class FlipkartLogin extends BaseClass {
//	
//	FkLoginPojo f;
//	@Given("To launch the chromebrowser and maximise window")
//	public void to_launch_the_chromebrowser_and_maximise_window() {
//	    launchBrowser();
//	    windowMaximize();
//	}
//
//	@When("To launch the url of the flipkart application")
//	public void to_launch_the_url_of_the_flipkart_application() throws InterruptedException {
//	    launchUrl("https://www.flipkart.com/");	 
//	    Thread.sleep(10000);
//	}
//	
////	@When("To click the login button")
////	public void to_click_the_login_button() {
////	    f = new FkLoginPojo();
////	    clickBtn(f.getLoginBtn());
////	}
//
//
//	@When("To pass valid username in email field")
//	public void to_pass_valid_username_in_email_field() {
//		f = new FkLoginPojo();
//	    passText("seleniuminmakes@gmail.com", f.getPhNo());
//	}
//	
//	@When("To click the requestotp button")
//	public void to_click_the_requestotp_button() {
//		f = new FkLoginPojo();
//	    clickBtn(f.getOtp());
//	}
//
//	
//	@When("To check whether navigate to  homepage or not")
//	public void to_check_whether_navigate_to_homepage_or_not() {
//	   System.out.println("Check the Login Credentials");
//	}
//
//	@Then("To close the browser")
//	public void to_close_the_browser() {
//		closeEntireBrowser();
//	}
//
//}
