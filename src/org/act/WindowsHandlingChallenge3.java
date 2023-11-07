package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingChallenge3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.homedepot.com/");
		d.manage().window().maximize();
		WebElement searchBox = d.findElement(By.id("headerSearch"));
		searchBox.sendKeys("ceiling fan");
		WebElement srhBtn = d.findElement(By.xpath("//button[@class='SearchBox__button']"));
		srhBtn.click();
		Thread.sleep(3000);
		
		WebElement scroll = d.findElement(By.xpath("//h2[text()='Ceiling Fans By Type']"));
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView()",scroll);
		WebElement indoorFan = d.findElement(By.xpath("//img[@alt='Image for Indoor Ceiling Fans']"));
		indoorFan.click();
	}

}
