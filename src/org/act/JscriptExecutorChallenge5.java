package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JscriptExecutorChallenge5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://adactinhotelapp.com/");
		d.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)d;
		WebElement userName = d.findElement(By.name("username"));
		js.executeScript("arguments[0].setAttribute('value','seleniumtool')",userName);
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')",userName);
		System.out.println(executeScript);
		WebElement passWord = d.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','12345')",passWord);
		WebElement logIn = d.findElement(By.xpath("//input[@value='Login']"));
		js.executeScript("arguments[0].click()",logIn);
	}

}
