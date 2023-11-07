package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsChallenge14 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumInmakes\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		WebElement search = d.findElement(By.xpath("//input[@class='gLFyf']"));
		search.click();
		WebElement srhtxt = d.findElement(By.xpath("//input[@class='gLFyf']"));
		srhtxt.sendKeys("Inmakes learning hub");
		WebElement glSrh = d.findElement(By.name("btnK"));
		glSrh.click();
		WebElement firstLink = d.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		firstLink.click();
		
	}

}
