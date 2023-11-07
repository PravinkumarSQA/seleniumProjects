package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class LocatorsChallenge1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumInmakes\\drivers\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://en-gb.facebook.com/");
		
		d.manage().window().maximize();
		
		WebElement email = d.findElement(By.id("email"));
		email.sendKeys("abcde@gmail.com");
		
		WebElement password = d.findElement(By.name("pass"));
		password.sendKeys("12345");
		
		WebElement login = d.findElement(By.name("login"));
		login.click();
		
	
	}

}
