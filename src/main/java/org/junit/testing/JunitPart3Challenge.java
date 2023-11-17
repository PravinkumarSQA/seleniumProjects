package org.junit.testing;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitPart3Challenge extends BaseClass {

	@Test
	public void tc3() {
		System.out.println("Test Case 3");
		launchUrl("https://inmakes.com/");
	}

	@Test
	public void tc1() {
		System.out.println("Test Case 1");
		launchUrl("https://www.google.com/gmail/about/");
	}

	@Test
	public void tc4() {
		System.out.println("Test Case 4");
		launchUrl("https://www.youtube.com/");
	}

	@Test
	public void tc2() {
		System.out.println("Test Case 2");
		launchUrl("https://en-gb.facebook.com/");
	}

	@Before
	public void startDateAndTime() {
		System.out.println("Test case Start Date & Time");
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void endDateAndTime() {
		System.out.println("Test Case End Date & Time");
		Date d = new Date();
		System.out.println(d);
	}

	@BeforeClass
	public static void lb() {
		launchBrowser();
		windowMaximize();
	}

	@AfterClass
	public static void closeTheBrowser() {
		closeEntireBrowser();
	}

}
