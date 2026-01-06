package org.junit;

import java.util.Date;

//import java.util.Date;

import org.base.BaseCls;
import org.base.Email;
import org.base.FBlogin;

public class JUnitChallenge3 extends BaseCls {
	
	@Test
	public void tc2()
	{
		System.out.println("Test Case 3");
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
		String url = pageUrl();
		Email e=new Email();
		passText("ajithkumarvam1@gmail.com", e.getEmail());
		Assert.assertEquals("Check your URL", url, url.contains("accounts"));
	}

}
