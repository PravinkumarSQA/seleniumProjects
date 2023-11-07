package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.homedepot.com/");
		d.manage().window().maximize();
		Actions a = new Actions(d);
		WebElement allDept = d.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(allDept).perform();
		Thread.sleep(3000);
		WebElement paint = d.findElement(By.xpath("(//a[@data-level='Paint'])[1]"));
		a.moveToElement(paint).perform();
		Thread.sleep(4000);
		WebElement paints = d.findElement(By.xpath("(//a[@href='//www.homedepot.com/b/Paint/N-5yc1vZar2d'])[2]"));
		a.moveToElement(paints).perform();
		Thread.sleep(3000);
		WebElement interiorPaint = d.findElement(By.xpath("(//a[@class='MainFlyout__link'])[21]"));
		a.moveToElement(interiorPaint);
		Thread.sleep(3000);
		WebElement ceiling = d.findElement(By.xpath("//a[@title='Ceiling Paint']"));
		Thread.sleep(3000);
		ceiling.click();
	}
}
