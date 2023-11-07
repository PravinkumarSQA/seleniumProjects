package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsChallenge7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumInmakes\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.redbus.in/");
		d.manage().window().maximize();
		WebElement signin = d.findElement(By.id("signin-block"));
		signin.click();
		WebElement signinclk = d.findElement(By.xpath("//li[@class='config-options ']"));
		signinclk.click();
			
	}

}
