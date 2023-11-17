package org.tes;

import java.util.Date;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPart4Challenge extends BaseClass {

	@Test (priority = -25)
	private void tc3() {
		launchUrl("https://www.google.com/gmail/about/");
	}

	@Test (priority = -13)
	private void tc1() {
		launchUrl("https://inmakes.com/");
	}

	@Test (priority = -8)
	private void tc2() {
		launchUrl("https://www.redbus.in/");
	}

	@Test
	private void tc56() {
		launchUrl("https://www.flipkart.com/");
	}

	@Test (priority = 5)
	private void tc69() {
		launchUrl("https://www.amazon.in/");
	}

	@Test (priority = 38)
	private void tc43() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@Test (priority = 58)
	private void tc31() {
		launchUrl("https://www.youtube.com/");
	}

	@BeforeMethod
	private void startDate() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void endDate() {
		Date d = new Date();
		System.out.println(d);
	}

	@BeforeClass
	private void lb() {
		launchBrowser();
		windowMaximize();
	}

	@AfterClass
	private void cb() {
		closeEntireBrowser();
	}

}
