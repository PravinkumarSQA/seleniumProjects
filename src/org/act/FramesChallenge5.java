package org.act;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class FramesChallenge5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		d.manage().window().maximize();
		
		Thread.sleep(3000);
				
		WebElement userName = d.findElement(By.xpath("//input[@title='Login using User ID and password']"));
		userName.click();
		
		WebElement userId = d.findElement(By.xpath("//input[@class='login-input type_UserPrincipal']"));
		userId.sendKeys("seleniuminmakes");
		
		WebElement password = d.findElement(By.xpath("//input[@title='Password']"));
		password.sendKeys("12345");
		
		WebElement logInBtn = d.findElement(By.id("VALIDATE_CREDENTIALS1"));
		logInBtn.click();
	}

}
