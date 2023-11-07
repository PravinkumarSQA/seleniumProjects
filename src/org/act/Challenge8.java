package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.homedepot.com/");
		d.manage().window().maximize();
		WebElement allDept = d.findElement(By.xpath("//a[text()='All Departments']"));
		Actions a = new Actions(d);
		a.moveToElement(allDept).perform();
		WebElement heatAndCool = d.findElement(By.xpath("(//a[@data-level='Heating & Cooling'])[1]"));
		a.moveToElement(heatAndCool).perform();
		WebElement ac = d.findElement(By.xpath("//a[@title='Air Conditioners']"));
		a.moveToElement(ac).perform();
		WebElement portableAc = d.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		portableAc.click();		
	}

}
