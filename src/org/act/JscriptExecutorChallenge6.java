package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JscriptExecutorChallenge6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)d;
		WebElement email = d.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		js.executeScript("arguments[0].setAttribute('value','seleniumtool')",email);
		Object emailName = js.executeScript("return arguments[0].getAttribute('value')",email);
		System.out.println(emailName);
		WebElement logIn = d.findElement(By.xpath("//button[text()='Request OTP']"));
		js.executeScript("arguments[0].click()",logIn);		
	}

}
