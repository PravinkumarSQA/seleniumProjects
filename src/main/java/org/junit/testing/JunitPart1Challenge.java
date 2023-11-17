package org.junit.testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitPart1Challenge {
	@Test
	public void tc5() {
		System.out.println("Test Case 5");
	}
	
	@Test
	public void tc3() {
		System.out.println("Test Case 3");
	}
	
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
	}
	
	@Test
	public void tc4() {
		System.out.println("Test Case 4");
	}
	
	@Test
	public void tc2() {
		System.out.println("Test Case 2");
	}
	
	@Before
	public void startDateAndTime() {
		System.out.println("Test case Start Date & Time");
	}
	
	@After
	public void endDateAndTime() {
	System.out.println("Test Case End Date & Time");
	}
	
	@BeforeClass
	public static void launchBrowser() {
	System.out.println("Browser Launch");
	}
	
	@AfterClass
	public static void closeBrowser() {
	System.out.println("Close the Browser");
	}

}
