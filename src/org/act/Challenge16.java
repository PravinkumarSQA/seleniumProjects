package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge16 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		WebElement closeLogin = d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closeLogin.click();
		Thread.sleep(3000);
		WebElement elec = d.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
		elec.click();
		Thread.sleep(4000);
		WebElement electronics = d.findElement(By.xpath("//span[text()='Electronics']"));
		//electronics.click();
		Actions a = new Actions(d);
		a.moveToElement(electronics).perform();
		Thread.sleep(3000);
		WebElement realMe = d.findElement(By.xpath("//a[@title='Realme']"));
		realMe.click();
		Thread.sleep(3000);
		WebElement firstProduct = d.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		firstProduct.click();
	}

}
