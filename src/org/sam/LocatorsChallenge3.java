package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsChallenge3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\win7\\\\eclipse-workspace\\\\SeleniumInmakes\\\\drivers\\\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		WebElement search = d.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Iphone");
		WebElement clksrch = d.findElement(By.id("nav-search-submit-button"));
		clksrch.click();
		
	}

}
