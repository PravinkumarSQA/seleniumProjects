package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsChallenge16 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumInmakes\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.shopclues.com/wholesale.html");
		d.manage().window().maximize();
		WebElement search = d.findElement(By.id("autocomplete"));
		search.sendKeys("Watches");
		WebElement srh = d.findElement(By.xpath("//a[@class='srch_action btn orange']"));
		srh.click();
		WebElement first = d.findElement(By.xpath("(//h2[@class=' mii '])[1]"));
		first.click();
		
		
	}

}
