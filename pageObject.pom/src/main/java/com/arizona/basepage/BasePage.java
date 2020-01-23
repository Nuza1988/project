package com.arizona.basepage;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BasePage {
	public WebDriver driver;
	public  ExtentTest  test;
	public void Screenshot(WebDriver driver,ExtentTest test) throws IOException {
		Date d=new Date();
		String filename=d.toString().replaceAll(" ", "_").replaceAll(":", "_");
		String imagepath="C:\\Users\\nuza1\\workspace\\pageObject.pom\\test-output\\screenShot\\Screenshots"+filename+".png";
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(imagepath));
		test.log(LogStatus.INFO, test.addScreenCapture(imagepath));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	
	

}
