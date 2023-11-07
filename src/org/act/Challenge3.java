package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement closeLogin = d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closeLogin.click();
		Thread.sleep(3000);
		WebElement home = d.findElement(By.xpath("//div[text()='Home & Furniture']"));
		home.click();
		Thread.sleep(3000);
		WebElement homeAndFur = d.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Actions a = new Actions(d);
		a.moveToElement(homeAndFur).perform();
		Thread.sleep(3000);
		WebElement bathTowel = d.findElement(By.xpath("//a[@title='Bath Towels']"));
		bathTowel.click();
	}

}
