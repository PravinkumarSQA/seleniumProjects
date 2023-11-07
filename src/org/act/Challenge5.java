package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.shopclues.com/wholesale.html");
		d.manage().window().maximize();
		WebElement sportsAndmore = d.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions a = new Actions(d);
		a.moveToElement(sportsAndmore).perform();
		WebElement weightGainers = d.findElement(By.xpath("//a[text()='Weight Gainers']"));
		weightGainers.click();
	}

}
