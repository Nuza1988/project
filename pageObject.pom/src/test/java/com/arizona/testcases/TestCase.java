package com.arizona.testcases;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.arizona.basetest.BaseTest;
import com.arizona.pages.Aboutpage;

import com.arizona.pages.Homepage;
import com.arizona.pages.LoadingPage;

public class TestCase extends BaseTest{
	@Test
	public void aboutD() throws Exception{
		browser("chrome");
		
		LoadingPage galle =new LoadingPage(driver,test);
		PageFactory.initElements(driver, galle);
		Homepage home=galle.openApplication();
		PageFactory.initElements(driver, home);
		Aboutpage wwe=home.about();
		PageFactory.initElements(driver, wwe);
		wwe.policyandprocedure();
		
		Thread.sleep(5000);
		Screenshot(driver, test);
		
		
		
	}
	
	
	

	
	

}
