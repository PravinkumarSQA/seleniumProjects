package org.act;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownChallenge2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://en-gb.facebook.com/");
		d.manage().window().maximize();
		WebElement newAcnt = d.findElement(By.xpath("(//a[@role='button'])[2]"));
		newAcnt.click();
		Thread.sleep(3000);
		WebElement month = d.findElement(By.id("month"));
		month.click();
		Select s = new Select(month);
		List<WebElement> months = s.getOptions();
		for (int i = 0; i < months.size(); i++) {
			String text = months.get(i).getText();
			System.out.println(text);			
		}		
	}
}
