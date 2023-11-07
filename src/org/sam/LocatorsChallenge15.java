package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsChallenge15 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumInmakes\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		//WebElement login = d.findElement(By.xpath("//a[text()='Login']"));
		//login.click();
		WebElement username = d.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		//Thread.sleep(3000);
		username.sendKeys("8754808989");
		String credential = username.getText();
		System.out.println(credential);

	}

}
