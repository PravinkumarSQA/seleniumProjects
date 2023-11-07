package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement sigIn = driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(sigIn).perform();
		WebElement register = driver.findElement(By.xpath("(//a[@rel='nofollow'])[2]"));
		register.click();
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("Pravin");
		WebElement phNo = driver.findElement(By.xpath("//input[@type='tel']"));
		phNo.sendKeys("8754808989");
		Thread.sleep(3000);		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("123456");
		
	}

}
