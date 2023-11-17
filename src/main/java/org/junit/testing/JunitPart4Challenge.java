package org.junit.testing;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitPart4Challenge extends BaseClass {
	
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
		launchUrl("https://accounts.google.com/v3/signin/identifier?dsh=S-401999614%3A1681408651454654&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AQMjQ7T_NDRMtY5i2kuoRzH3Js070jpEOKLKqYsGftS6pvrGAEfzZUdo3w78EvEk70DXL_a_YPcaxQ&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		String title = pageTitle();
		String url = pageUrl();
		GmailLoginPojo g = new GmailLoginPojo();
		passText("privin77492", g.getEmail());
		Assert.assertEquals("Check url", url , url.contains("google"));
		clickBtn(g.getNextBtn());
		
	}
	
	@BeforeClass
	public static void lb() {
		launchBrowser();
		windowMaximize();	
	}
	
	@AfterClass
	public static void cb() {
		//closeEntireBrowser();
	}
}
