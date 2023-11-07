package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsChallenge13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumInmakes\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://inmakesedu.com/");
		d.manage().window().maximize();
		WebElement dubaiAddress = d.findElement(By.xpath("//a[contains(text(),'Mai tower')]"));
		System.out.println(dubaiAddress.getText());
	}

}
