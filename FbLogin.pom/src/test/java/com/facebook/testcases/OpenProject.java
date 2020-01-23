package com.facebook.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import com.facebook.basetest.BeseTest;
import com.facebook.pages.LoadingPage;

public class OpenProject extends BeseTest {
	@Test
	public void arizona() throws Exception{
		browser("chrome");
		LoadingPage load =new LoadingPage(driver);
		PageFactory.initElements(driver, load);
		load.openApplication();
		
}
	}
