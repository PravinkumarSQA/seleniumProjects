package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPojo extends BaseClass{
	
	public AmazonLoginPojo() {
		PageFactory.initElements(d, this);	
	}
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	private WebElement signin;
	
	@FindBy(id="ap_email")
	private WebElement email;
	
	@FindBy(id="continue")
	private WebElement continueBtn;

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

}
