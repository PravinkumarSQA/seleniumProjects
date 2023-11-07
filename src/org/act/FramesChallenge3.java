package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesChallenge3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://retail.onlinesbi.sbi/retail/login.htm");
		d.manage().window().maximize();
		WebElement cntinue = d.findElement(By.xpath("(//a[@class='login_button'])[1]"));
		Thread.sleep(3000);
		cntinue.click();
		WebElement logIn = d.findElement(By.id("Button2"));
		logIn.click();
	}

}
