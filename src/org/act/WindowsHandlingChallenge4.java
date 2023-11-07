package org.act;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingChallenge4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.snapdeal.com/");
		d.manage().window().maximize();
		Thread.sleep(4000);
		WebElement srhBox = d.findElement(By.name("keyword"));
		srhBox.sendKeys("hand sanitizer");
		WebElement srhBtn = d.findElement(By.xpath("//span[text()='Search']"));
		srhBtn.click();
		Thread.sleep(3000);
		WebElement sanitizer = d.findElement(By.xpath("(//p[@class='product-title'])[1]"));
		sanitizer.click();
		
		String parentwin = d.getWindowHandle();
		System.out.println("Parent win ID: " + parentwin);		
		Set<String> allwin = d.getWindowHandles();
		System.out.println("All win ID: " + allwin);
		
		for (String winId : allwin) {
			if (winId != parentwin) {
				d.switchTo().window(winId);
			}
		}
		WebElement addToCart = d.findElement(By.xpath("//span[text()='add to cart']"));
		addToCart.click();		
	}

}
