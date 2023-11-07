package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge15 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		WebElement closeLogin = d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closeLogin.click();
		WebElement fashion = d.findElement(By.xpath("//div[text()='Fashion']"));
		fashion.click();		
		Thread.sleep(6000);
		WebElement babyAndKids = d.findElement(By.xpath("(//span[@class='_2I9KP_'])[5]"));
		Actions a = new Actions(d);
		a.moveToElement(babyAndKids).perform();
		Thread.sleep(6000);
		WebElement rcToys = d.findElement(By.xpath("(//a[@title='Remote Control Toys'])[1]"));
		rcToys.click();		
	}
}
