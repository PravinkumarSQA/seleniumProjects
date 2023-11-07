package org.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicprogram {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumInmakes\\drivers\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1978679338%3A1677609864774066&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHdAQTL9bKfb5-UqLxnE6BTh67QylVmKK0L2JX7-qu_PYz5ZUpOLjrWFo3GGOAGzzyjOP3DGIQ");
	}

}
