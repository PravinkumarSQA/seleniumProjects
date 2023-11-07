package org.act;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesChallenge4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://netbanking.hdfcbank.com/netbanking/");
		d.manage().window().maximize();
		
//		JavascriptExecutor js = (JavascriptExecutor)d;
		WebElement loginPage = d.findElement(By.name("login_page"));
		d.switchTo().frame(loginPage);
		
		WebElement userName = d.findElement(By.xpath("//input[@style='width: 245px;height: 30px']"));
		userName.sendKeys("selenium");
//		js.executeScript("arguments[0].setAttribute('value','selenium')",userName);
		
		WebElement cntnueBtn = d.findElement(By.xpath("//a[@onclick='return fLogon();']"));
		cntnueBtn.click();
		Thread.sleep(9000);
		
		WebElement passwrd = d.findElement(By.id("keyboard"));
		passwrd.sendKeys("12345");
		
		WebElement logInBtn = d.findElement(By.xpath("//a[text()='LOGIN']"));
		logInBtn.click();
	}

}
