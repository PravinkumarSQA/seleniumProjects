package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement mblandAcc = driver.findElement(By.xpath("(//span[@class='catText'])[7]"));
		Actions a = new Actions(driver);
		a.moveToElement(mblandAcc).perform();
		WebElement topSelling = driver.findElement(By.xpath("//span[text()='Top Selling Wearables']"));
		topSelling.click();
	}

}
