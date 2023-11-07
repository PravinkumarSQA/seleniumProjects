package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JscriptexecutorChallenge1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://inmakesedu.com/");
		d.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) d ;		
		WebElement txt = d.findElement(By.xpath("//p[contains(text(),'Inmakes offer various kinds of products')]"));	
		js.executeScript("arguments[0].scrollIntoView(false)",txt);
		String text = txt.getText();
		System.out.println(text);		
	}

}
