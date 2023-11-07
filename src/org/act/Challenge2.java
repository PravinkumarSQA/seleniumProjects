package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		Actions a = new Actions(d);
		WebElement prime = d.findElement(By.id("nav-link-amazonprime"));
		a.moveToElement(prime).perform();
		Thread.sleep(3000);
		WebElement click = d.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/G/31/prime/NavFlyout/TryPrime/2018/Apr/IN-Prime-PIN-TryPrime-MultiBen-Apr18-400x400._CB612889281_.jpg']"));
		click.click();
		
	}

}
