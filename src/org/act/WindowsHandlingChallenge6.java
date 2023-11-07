package org.act;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingChallenge6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement clsLgin = d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clsLgin.click();
		WebElement srhBox = d.findElement(By.name("q"));
		srhBox.sendKeys("mask");
		WebElement srhBtn = d.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		srhBtn.click();
		Thread.sleep(4000);
		
		WebElement mask = d.findElement(By.xpath("//img[@class='_396cs4']"));
		mask.click();
		String pwin = d.getWindowHandle();
		Set<String> allWin = d.getWindowHandles();
		
		for (String curWin : allWin) {
			if (curWin != pwin) {
				d.switchTo().window(curWin);
			}
		}
		WebElement pinCode = d.findElement(By.id("pincodeInputId"));		
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].setAttribute('value','638451')",pinCode);
		Object text = js.executeScript("return arguments[0].getAttribute('value')",pinCode);
		System.out.println("Pincode: " + text);
	}

}
