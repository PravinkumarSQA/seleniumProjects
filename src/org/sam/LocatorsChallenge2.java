package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsChallenge2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumInmakes\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://accounts.google.com/v3/signin/identifier?dsh=S1678275124%3A1677697630261461&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHen5hKCVm7XXogfEP8shf-VLJZ2phY99lP9FHflvqSPAa9Rda8XTzV3tdyRltOVBcSr3LR-");
		d.manage().window().maximize();
		WebElement email = d.findElement(By.id("identifierId"));
		email.sendKeys("abcde@gmail.com");
		WebElement next = d.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
		next.click();		
	}

}
