package org.act;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandlingChallenge1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		WebElement searchBox = d.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone X");
		WebElement searchBtn = d.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]"));
		searchBtn.click();
		WebElement iphoneX = d.findElement(By.xpath("(//img[@alt='Apple iPhone 12 (64GB) - White'])[2]"));

		Actions a = new Actions(d);
		a.contextClick(iphoneX).perform();
		Thread.sleep(3000);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		String parentWinId = d.getWindowHandle();
		System.out.println("Parent win ID: " + parentWinId);

		Set<String> allWinId = d.getWindowHandles();
		System.out.println("All Win ID: " + allWinId);
	
		
		for (String winId : allWinId) {
			if (winId != parentWinId) {
				d.switchTo().window(winId);
			}
		}
		
		WebElement price = d.findElement(By.xpath("(//span[@class='a-price-whole'])[5]"));
		String text = price.getText();
		System.out.println( "Price : Rs." + text);
	}

}
