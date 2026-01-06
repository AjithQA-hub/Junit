package org.junit;

import java.util.Date;
import org.base.BaseCls;
import org.base.FBlogin;

public class SampleProject3 extends BaseCls {
	
	@Test
	public void tc3()
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
		launchUrl("https://en-gb.facebook.com/");
		String title = pageTitle();
		System.out.println(title);
		String url = pageUrl();
		System.out.println(url);
		FBlogin f=new FBlogin();
		passText("ajithkumarvam1@gmail.com", f.getEmail());
		Assert.assertTrue("check your page Title", title.contains("Facebook"));
		Assert.assertEquals("Check your URL", true, url.contains("facebook"));
		passText("Ajith!123", f.getPassword());
	}
	@Test
	public void tc5() {
		System.out.println("Test Case 5");
		launchUrl("https://www.snapdeal.com/");
	}
	@Ignore
	@Test
	public void tc4()
	{
		System.out.println("Test Case 4");
		launchUrl("https://www.myntra.com/");
	}
	@Test
	public void tc2() {
		System.out.println("Test Case 2");
		launchUrl("https://www.flipkart.com/");
		
	}

}
