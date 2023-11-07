package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsChallenge11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumInmakes\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://inmakesedu.com/");
		d.manage().window().maximize();
		WebElement txt = d.findElement(By.xpath("//h1[contains(text(),'Learning Today')]"));
		String text = txt.getText();
		System.out.println(text);
		
	}

}
