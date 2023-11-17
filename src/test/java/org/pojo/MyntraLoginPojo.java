package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraLoginPojo extends BaseClass {
	
	public MyntraLoginPojo() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath = "//input[@autocomplete='new-password']")
	private WebElement phNo;
	
	@FindBy(xpath = "//div[text()='CONTINUE']")
	private WebElement continueBtn;

	public WebElement getPhNo() {
		return phNo;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

}
