package org.junit;

import java.util.Date;
import org.base.BaseCls;
import org.base.Email;
import org.base.FBlogin;

public class JUnitChallenge3 extends BaseCls {
	
	@Test
	public void tc2()
	{
		System.out.println("Test Case 2");
	}
	
	@Before
	public void startDate() {
		Date d=new Date();
		System.out.println(d);
	}
	@After
	public void endDate()
	{
		Date d=new Date();
		System.out.println(d);
	}
	@BeforeClass
	public static void launchTheBrowser()
	{
		launchBrowser();
		windowMaximize();  
	}
	
	@AfterClass
	public static void CloseTheBrowser()
	{
		closeEntireBrowser();
	}
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
		launchUrl("https://mail.google.com/mail/u/0/#inbox");
		String title = pageTitle();
		System.out.println("Page Title: " + title);
		String url = pageUrl();
		System.out.println("Page Url: " + url);
		Email e=new Email();
		passText("ajithkumarvam1@gmail.com", e.getEmail());
		Assert.assertEquals("Check your Title", true, title.contains("Gmail"));
		Assert.assertTrue("Check the Url", url.contains("accounts"));
		
		//assertTrue(message, condition/Actual)
		//assertEquals(message, expected, condition/Actual)
		
		//Message - should be in string
		//Expected - should be in boolean that is True/False
		//Condition - mean what should actually test.
	}
}


