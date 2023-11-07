package org.act;

import java.util.List;
import java.lang.Math;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownChallenge3 {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://en-gb.facebook.com/");
		d.manage().window().maximize();
		WebElement newAcnt = d.findElement(By.xpath("(//a[@role='button'])[2]"));
		newAcnt.click();
		Thread.sleep(3000);
		WebElement day = d.findElement(By.id("day"));
		Select s = new Select(day);
		List<WebElement> days = s.getOptions();
		for (int i = 0;  i < days.size() ; i++) {
			String text = days.get(i).getText();
			if(i % 2 == 1)
			{
				System.out.println(text);
			}
		}
	}

}
