package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://lh.inmakesedu.com/home");
		d.manage().window().maximize();
		WebElement courses = d.findElement(By.id("navbarDropdown"));
		Actions a = new Actions(d);
		a.moveToElement(courses).perform();
		WebElement st = d.findElement(By.xpath("//p[text()='Software Testing Tamil']"));
		a.moveToElement(st).perform();
		WebElement stAdv = d.findElement(By.xpath("//a[text()='ST Advanced class']"));
		stAdv.click();
	}

}
