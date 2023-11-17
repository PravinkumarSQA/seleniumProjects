package org.tes;

import java.util.Date;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPart3Challenge extends BaseClass {

	@Test
	private void tc3() {
		launchUrl("https://www.google.com/gmail/about/");
	}

	@Test
	private void tc1() {
		launchUrl("https://inmakes.com/");
	}

	@Test
	private void tc2() {
		launchUrl("https://www.redbus.in/");
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
