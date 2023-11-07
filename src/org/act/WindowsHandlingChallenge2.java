package org.act;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingChallenge2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.snapdeal.com/");
		d.manage().window().maximize();
		WebElement searchBox = d.findElement(By.name("keyword"));
		searchBox.sendKeys("iphone 7");
		WebElement srhBtn = d.findElement(By.xpath("//i[@class='sd-icon sd-icon-search-under-catagory lfloat']"));
		srhBtn.click();
		Thread.sleep(3000);
		
		WebElement iPhone = d.findElement(By.xpath("//img[@title='Apple iPhone 7 Plus Plain Cases Spectacular Ace - Black']"));
		iPhone.click();

		String parentwin = d.getWindowHandle();
		System.out.println("Parent win ID : " + parentwin);

		Set<String> allwin = d.getWindowHandles();
		System.out.println("All win ID : " + allwin);

		for (String winid : allwin) {
			if (winid != parentwin) {
				d.switchTo().window(winid);
			}
		}
		WebElement addToCart = d.findElement(By.xpath("//span[text()='add to cart']"));
		addToCart.click(); 
		Thread.sleep(3000);
		
		WebElement price = d.findElement(By.xpath("(//span[text()='Rs. 209'])[2]"));
		String text = price.getText();
		System.out.println("Price of Case: " + text);
		
	}

}
