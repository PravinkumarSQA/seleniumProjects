package org.stepdefinition;

import java.util.List;

import org.base.BaseClass;
import org.pojo.IciciLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class IciciLogin extends BaseClass {
	IciciLoginPojo i;
	
	@Given("To launch the chrome browser and to maximise window")
	public void to_launch_the_chrome_browser_and_to_maximise_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of icici bank site")
	public void to_launch_the_url_of_icici_bank_site() {
	    launchUrl("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn&_gl=1*30xkeg*_ga*MTgzMDcxOTY5Ni4xNjIwMDM5NDU0*_ga_SKB78GHTFV*MTYyODIzNDM4NC43Ny4xLjE2MjgyMzQ1MDQuMjc.&_ga=2.84155551.729932104.1682784626-1340522385.1680425231");	    
	}
	
	@When("To Click the userId field")
	public void toClickTheUserIdField() {
	    i = new IciciLoginPojo();
	    clickBtn(i.getUserid());
	}

	@When("To pass userId {string} in userId field")
	public void to_pass_userId_in_userId_field(DataTable dt) {		;
	    i = new IciciLoginPojo();
	    List<List<String>> l = dt.asLists();
	    passText(l.get(0).get(0),i.getUserid()); 	    
	}

	@When("To pass the password {string} in password field")
	public void to_pass_the_password_in_password_field(DataTable dt) {
	    i = new IciciLoginPojo();
	    List<List<String>> l1 = dt.asLists();
	    passText(l1.get(2).get(2), i.getPasswrd());
	}

	@When("To click the loginBtn")
	public void to_click_the_loginBtn() {
	    i = new IciciLoginPojo();
	    clickBtn(i.getLogInbtn());
	}

	@Then("To close the Browser")
	public void to_close_the_Browser() {
	    closeEntireBrowser();
	}
}
