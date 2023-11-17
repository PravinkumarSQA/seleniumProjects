package org.junit.testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPojo extends BaseClass {
	public GmailLoginPojo() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(name="identifier")
	private WebElement email;
	
	@FindBy(xpath ="(//span[@jsname='V67aGc'])[2]")
	private WebElement nextBtn;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}

	
	
	
}
