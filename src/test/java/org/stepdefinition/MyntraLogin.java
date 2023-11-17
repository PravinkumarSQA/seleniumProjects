//package org.stepdefinition;
//
//import java.util.List;
//
//import org.base.BaseClass;
//import org.pojo.MyntraLoginPojo;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.cucumber.datatable.DataTable;
//
//public class MyntraLogin extends BaseClass {
//	
//	MyntraLoginPojo m;
//	
//	@Given("To launch the chrome browser and maximise window")
//	public void to_launch_the_chrome_browser_and_maximise_window() {
//		launchBrowser();
//		windowMaximize();
//	}
//	
//	@When("To launch the url of the myntra application")
//	public void to_launch_the_url_of_the_myntra_application() {
//	    launchUrl("https://www.myntra.com/login?referer=https://www.myntra.com/");
//	}
//
//	@When("To pass phNo in the mobile number field")
//	public void to_pass_phNo_in_the_mobile_number_field(DataTable d) {
//	    m = new MyntraLoginPojo();
//	    List<String> l = d.asList();
//	    passText(l.get(3), m.getPhNo());
//	}
//
//	@When("To click continue button")
//	public void to_click_continue_button() {
//	    m = new MyntraLoginPojo();
//	    clickBtn(m.getContinueBtn());
//	}
//	
//	@Then("To close the browser")
//	public void to_close_the_browser() {
//		closeEntireBrowser();
//	}
//
//}
