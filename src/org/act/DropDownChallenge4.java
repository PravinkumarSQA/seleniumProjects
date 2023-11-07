package org.act;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownChallenge4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/register.php");
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement dd = d.findElement(By.name("country"));
//		JavascriptExecutor js = (JavascriptExecutor)d;
//		js.executeScript("arguments[0].scrollIntoView(false)", dd);
		Select s = new Select(dd);
		List<WebElement> country = s.getOptions();
		for (int i = 0; i<country.size(); i++) {
			String text = country.get(i).getText();
			System.out.println(text);
		}
	}

}