package org.act;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownChallenge1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://en-gb.facebook.com/");
		d.manage().window().maximize();
		WebElement newAcnt = d.findElement(By.xpath("(//a[@role='button'])[2]"));
		newAcnt.click();
		Thread.sleep(3000);
		WebElement year = d.findElement(By.name("birthday_year"));
		year.click();
//		JavascriptExecutor js = (JavascriptExecutor)d;
//		Object ddYears = js.executeScript("return arguments[0].getAttribute('value')", year);
//		System.out.println(ddYears);
		Select s = new Select(year);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			String years = options.get(i).getText();
			System.out.println(years);			
		}
		}
	}