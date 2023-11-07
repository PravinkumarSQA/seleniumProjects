package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesChallenge2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://online.canarabank.in/?module=login");
		d.manage().window().maximize();
		Thread.sleep(10000);
		WebElement logIn = d.findElement(By.id("ui-id-14"));
		logIn.click();
		WebElement text = d.findElement(By.xpath("//span[contains(text(),'User Id must')]"));
		String text2 = text.getText();
		System.out.println(text2);
	}

}
