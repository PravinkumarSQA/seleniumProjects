package org.tes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserChallenge {
	@Parameters("browser")
	@Test
	private void tc1(String browserName) throws InterruptedException {
			WebDriver d;
			if (browserName.equals("chromebrowser")) {
				WebDriverManager.chromedriver().setup();
				d = new ChromeDriver();
			}
			else if (browserName.equals("firefoxbrowser")) {
				WebDriverManager.firefoxdriver().setup();
				d = new FirefoxDriver();
			} 
			
			else {
				WebDriverManager.iedriver().setup();
				d = new InternetExplorerDriver();
			}
			
			
			d.get("https://www.amazon.in/");
			d.manage().window().maximize();
			
			WebElement logIn = d.findElement(By.id("nav-link-accountList-nav-line-1"));
			logIn.click();
			Thread.sleep(3000);
			
			WebElement email = d.findElement(By.xpath("//input[@type='email']"));
			email.sendKeys("privin77492@gmail.com");
	}

}
