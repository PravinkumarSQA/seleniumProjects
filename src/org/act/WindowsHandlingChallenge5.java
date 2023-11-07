package org.act;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingChallenge5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement clsLgin = d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clsLgin.click();
		WebElement srhBox = d.findElement(By.name("q"));
		srhBox.sendKeys("Redmi Phone");
		WebElement srhBtn = d.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		srhBtn.click();
		Thread.sleep(3000);
		
		WebElement redmiPhn = d.findElement(By.xpath("//img[@alt='Redmi Note 11S (Space Black, 128 GB)']"));
		redmiPhn.click();
		Thread.sleep(3000);
		
		String parentWin = d.getWindowHandle();
		Set<String> allWin = d.getWindowHandles();
		
		for (String winId : allWin) {
			if (winId != parentWin) {
				d.switchTo().window(winId);
			}
		}
		WebElement price = d.findElement(By.xpath("//div[text()='₹17,800']"));
		System.out.println("Price : " + price.getText());
	}

}
