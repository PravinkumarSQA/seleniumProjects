package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/drag_drop.html");
		d.manage().window().maximize();
		Actions a = new Actions(d);
		WebElement dragBankbtn = d.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dropBankbtn = d.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(dragBankbtn, dropBankbtn).perform();
		WebElement dragDebitCash = d.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement dropDebitCash = d.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(dragDebitCash, dropDebitCash).perform();
		WebElement salesDrag = d.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement salesDrop = d.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(salesDrag,salesDrop).perform();
		WebElement dragCreditSide = d.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dropCreditSide = d.findElement(By.id("amt8"));
		a.dragAndDrop(dragCreditSide,dropCreditSide).perform();		
	}
}