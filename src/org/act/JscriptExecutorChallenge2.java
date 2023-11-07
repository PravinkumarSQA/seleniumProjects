package org.act;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JscriptExecutorChallenge2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("");
	}
}
