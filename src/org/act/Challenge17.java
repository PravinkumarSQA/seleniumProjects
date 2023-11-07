package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge17 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		WebElement closeLogin = d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closeLogin.click();
		Thread.sleep(3000);
		WebElement appliances = d.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		appliances.click();
		Thread.sleep(3000);
		WebElement app = d.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		Actions a = new Actions(d);
		a.moveToElement(app).perform();
		Thread.sleep(3000);
		WebElement tv = d.findElement(By.xpath("//a[@title='Television']"));
		a.moveToElement(tv).perform();
		Thread.sleep(3000);
		WebElement uhd = d.findElement(By.xpath("//a[@title='Smart & Ultra HD']"));
		uhd.click();
	}
}
