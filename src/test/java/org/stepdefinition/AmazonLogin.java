//package org.stepdefinition;
//
//import java.util.List;
//
//import org.base.BaseClass;
//import org.pojo.AmazonLoginPojo;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//import io.cucumber.datatable.DataTable;
//
//public class AmazonLogin extends BaseClass{
//	
//	AmazonLoginPojo a;
//	@Given("To launch the chrome browser and maximise window")
//	public void to_launch_the_chrome_browser_and_maximise_window() {
//	   launchBrowser();
//	   windowMaximize();
//	}
//
//	@When("To launch the url of the amazon application")
//	public void to_launch_the_url_of_the_amazon_application() {
//	   launchUrl("https://www.amazon.in/");
//	}
//
//	@When("To click sign-in button")
//	public void to_click_sign_in_button() {
//	   a = new AmazonLoginPojo();
//	   clickBtn(a.getSignin());
//	}
//
//	@When("To enter email address in emailfield")
//	public void to_enter_email_address_in_emailfield(DataTable dt) {
//	    a = new AmazonLoginPojo();
//	    List<String> l = dt.asList();
//	    passText(l.get(2),a.getEmail());
//	}
//
//	@When("To click the continue button")
//	public void to_click_the_continue_button() {
//	    a = new AmazonLoginPojo();
//	    clickBtn(a.getContinueBtn());
//	}
//
//}
