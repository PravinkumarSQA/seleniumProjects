package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsChallenge8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumInmakes\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.cleartrip.com/trains");
		d.manage().window().maximize();
		WebElement from = d.findElement(By.xpath("//input[@title='From station']"));
		from.sendKeys("Erode");
		WebElement to = d.findElement(By.xpath("(//input[@type='text'])[2]"));
		to.sendKeys("bangalore");
		WebElement search = d.findElement(By.id("trainFormButton"));
		search.click();
	}

}
