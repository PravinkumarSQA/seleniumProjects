package org.act;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpractice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		
		WebElement srhBox = d.findElement(By.id("twotabsearchtextbox"));
		srhBox.sendKeys("Apple Mobile phones");
		WebElement srhBn = d.findElement(By.xpath("//input[@type=\"submit\"]"));
		srhBn.click();
		
		WebElement firstPhn = d.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]"));
		firstPhn.click();
		
		String parentWin = d.getWindowHandle();  
		
		Set<String> allWinId = d.getWindowHandles();
		
		for (String currWInId : allWinId) {
			if (currWInId != parentWin) {
				d.switchTo().window(currWInId);
			}
		}
		
		WebElement buyNow = d.findElement(By.id("buy-now-button"));
		buyNow.click();
		
		WebElement email = d.findElement(By.xpath("//input[@type=\"email\"]"));
		email.sendKeys("8754808989");
		
		WebElement cntn = d.findElement(By.id("continue"));
		cntn.click();
		
		WebElement passWrd = d.findElement(By.xpath("//input[@type=\"password\"]"));
		passWrd.sendKeys("81197p");
		
		WebElement signIn = d.findElement(By.id("signInSubmit"));
		signIn.click();
		
	}

}
