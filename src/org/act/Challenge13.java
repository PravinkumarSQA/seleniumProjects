package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement sigIn = driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(sigIn).perform();
		WebElement sellerAcnt = driver.findElement(By.xpath("//span[text()='Your Seller Account']"));
		sellerAcnt.click();
	}

}