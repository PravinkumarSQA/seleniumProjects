package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement womensFashion = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(womensFashion).perform();
		Thread.sleep(3000);
		WebElement footWear = driver.findElement(By.xpath("(//span[text()='Footwear'])[2]"));
		a.moveToElement(footWear);
		WebElement heels = driver.findElement(By.xpath("//span[contains(text(),'Heels')]"));
		heels.click();			
	}

}
