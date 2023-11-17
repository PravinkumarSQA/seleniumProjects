package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IciciLoginPojo extends BaseClass {
	public IciciLoginPojo() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(name = "DUMMY1")
	private WebElement userid;
	
	@FindBy(xpath = "(//input[@type='password'])[4]")
	private WebElement passwrd;
	
	@FindBy(id = "AuthenticationFG.ACCESS_CODE")
	private WebElement logInbtn;

	public WebElement getUserid() {
		return userid;
	}

	public WebElement getPasswrd() {
		return passwrd;
	}

	public WebElement getLogInbtn() {
		return logInbtn;
	}
}
