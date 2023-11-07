package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JscriptExecutorChallenge4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://en-gb.facebook.com/");
		d.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) d;
		WebElement email = d.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','seleniuminmakes@gmail.com')",email);
		WebElement password = d.findElement(By.name("pass"));
		js.executeScript("arguments[0].setAttribute('value','12345')",password);
		WebElement logIn = d.findElement(By.xpath("//button[@value='1']"));
		js.executeScript("arguments[0].click()", logIn);
	}

}
