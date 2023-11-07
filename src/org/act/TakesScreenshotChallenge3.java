package org.act;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshotChallenge3 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot)d;
		Thread.sleep(3000);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\win7\\eclipse-workspace\\SeleniumActions\\WebPageScreenshot\\AmazonHomePage");
		FileUtils.copyFile(src, des);		
	}

}
