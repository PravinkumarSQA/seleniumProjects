package org.act;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertChallenge2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		WebElement promptAlert = d.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		promptAlert.click();
		WebElement prompt = d.findElement(By.xpath("//button[@class='btn btn-primary']"));
		prompt.click();
		Alert a = d.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		Thread.sleep(3000);
		a.dismiss();
	}
}
