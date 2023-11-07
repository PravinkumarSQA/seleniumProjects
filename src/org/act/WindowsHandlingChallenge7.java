package org.act;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingChallenge7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement clsLgin = d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clsLgin.click();
		WebElement srhBox = d.findElement(By.name("q"));
		srhBox.sendKeys("hp laptop");
		WebElement srhBtn = d.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		srhBtn.click();
		Thread.sleep(4000);
		
		WebElement hpLap = d.findElement(By.xpath("(//img[@class='_396cs4'])[1]"));
		hpLap.click();
		String pWin = d.getWindowHandle();
		Set<String> allWin = d.getWindowHandles();
		
		for (String currWin : allWin) {
			if (currWin != pWin) {
				d.switchTo().window(currWin);				
			}
		}
		WebElement cost = d.findElement(By.xpath("(//div[text()='₹40,990'])[1]"));
		System.out.println("Cost of Laptop : " + cost.getText());
	}

}
