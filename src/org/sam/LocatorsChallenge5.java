package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsChallenge5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win7\\eclipse-workspace\\SeleniumInmakes\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		WebElement firstN = d.findElement(By.xpath("(//input[@type='text'])[1]"));
		firstN.sendKeys("Pravin");
		WebElement lastN = d.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastN.sendKeys("Kumar");
		WebElement addr = d.findElement(By.xpath("//textarea[@rows='3']"));
		addr.sendKeys("Coimbatore");
		WebElement email = d.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("privin77492@gmail.com");
		WebElement phNo = d.findElement(By.xpath("//input[@ng-model='Phone']"));
		phNo.sendKeys("8754808989");
		WebElement gender = d.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gender.click();
		WebElement hobby = d.findElement(By.id("checkbox1"));
		hobby.click();
		WebElement hobbymve = d.findElement(By.xpath("//input[@value='Movies']"));
		hobbymve.click();
		WebElement lang = d.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"));
		lang.click();
		WebElement eng = d.findElement(By.xpath("//a[text()='English']"));
		eng.click();
		WebElement clk = d.findElement(By.xpath("//div[@class='row ']"));
		clk.click();
		WebElement skills = d.findElement(By.xpath("(//select[@type='text'])[1]"));
		skills.click();
		WebElement c = d.findElement(By.xpath("//option[@value='C']"));
		c.click();
		WebElement country = d.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
		country.click();
		WebElement countryTxt = d.findElement(By.xpath("//input[@tabindex='0']"));
		countryTxt.sendKeys("India");
		WebElement cntslct = d.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']"));
		cntslct.click();
		WebElement doby1 = d.findElement(By.xpath("//select[@id='yearbox']"));
		doby1.click();
		WebElement doby2 = d.findElement(By.xpath("//option[@value='1997']"));
		doby2.click();
		WebElement dobm1 = d.findElement(By.xpath("//select[@placeholder='Month']"));
		dobm1.click();
		WebElement dobm2 = d.findElement(By.xpath("//option[@value='November']"));
		dobm2.click();
		WebElement dobd1 = d.findElement(By.xpath("//select[@ng-model='daybox']"));
		dobd1.click();
		WebElement dobd2 = d.findElement(By.xpath("//option[@value='8']"));
		dobd2.click();
		WebElement password = d.findElement(By.xpath("//input[@id='firstpassword']"));
		password.sendKeys("12345");
		WebElement confirmpass = d.findElement(By.xpath("//input[@id='secondpassword']"));
		confirmpass.sendKeys("12345");
		WebElement submit = d.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
	}

}
