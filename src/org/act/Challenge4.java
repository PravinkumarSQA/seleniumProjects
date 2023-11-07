package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.shopclues.com/wholesale.html");
		d.manage().window().maximize();
		Actions a = new Actions(d);
		WebElement mobilesAndMore = d.findElement(By.xpath("//a[text()='Mobiles & More']"));
		a.moveToElement(mobilesAndMore).perform();
		WebElement apple = d.findElement(By.xpath("(//a[@target='_blank'])[9]"));
		apple.click();
	}

}
