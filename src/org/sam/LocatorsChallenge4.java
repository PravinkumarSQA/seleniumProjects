package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsChallenge4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumInmakes\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://en-gb.facebook.com/");
		d.manage().window().maximize();
		WebElement email = d.findElement(By.xpath("//input[@data-testid='royal_email']"));
		email.sendKeys("hdgbdfg@gmail.com");
		WebElement password = d.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("jhgjhg");
		WebElement login = d.findElement(By.xpath("//button[@value='1']"));
		login.click();
		
	}

}
