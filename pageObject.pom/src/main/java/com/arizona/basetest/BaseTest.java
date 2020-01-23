package com.arizona.basetest;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.arizona.basepage.BasePage;
import com.arizona.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest extends BasePage {
	public ExtentReports extent=ExtentManager.getInstance();
	
	
	public void browser(String b ){
		test.log(LogStatus.INFO, "chrome browser should be open ");
		if (b.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\nuza1\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			test.log(LogStatus.INFO, "chrome browser is open ");
			
			
		}else if (b.equals("mozilla")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\nuza1\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			 driver=new FirefoxDriver();
			 test.log(LogStatus.INFO, "mozilla  browser is open ");
			
		} 
		
		
	
 
}
}
