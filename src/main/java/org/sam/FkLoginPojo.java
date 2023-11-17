package org.sam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FkLoginPojo {
	public FkLoginPojo() {
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement phNo;
	
	@FindBy(xpath = "//button[text()='Request OTP']")
	private WebElement otp;

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getPhNo() {
		return phNo;
	}

	public WebElement getOtp() {
		return otp;
	}
	
	

}
