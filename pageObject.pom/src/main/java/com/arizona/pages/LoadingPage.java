package com.arizona.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.arizona.basepage.BasePage;
import com.relevantcodes.extentreports.ExtentTest;

public class LoadingPage extends BasePage {
	

	

public LoadingPage(WebDriver driver, ExtentTest test) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	this.test=test;
	
	
}


public Homepage openApplication() throws Exception{

	Thread.sleep(3000);
	driver.get("https://dcs.az.gov/");
	driver.manage().window().maximize();
	Homepage about=new Homepage(driver,test);
	
	PageFactory.initElements(driver, about);
	return about;
	
}
}
