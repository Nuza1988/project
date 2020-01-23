package com.arizona.utilities;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	private static ExtentReports extent;
	public static ExtentReports getInstance() {
		if(extent==null) {
			Date d = new Date();
			String filename = d.toString().replaceAll(" ", "_").replaceAll(":","_");
			String reportpath = "C:\\Users\\nuza1\\workspace\\pageObject.pom\\test-output\\Report\\extent reports"+filename+".html";
			//in folder it should display newest first.
			extent = new ExtentReports(reportpath, true, DisplayOrder.NEWEST_FIRST);
			extent.loadConfig(new File("C:\\Users\\nuza1\\workspace\\pageObject.pom\\extent-config.xml"));
			extent.addSystemInfo("Selenium version","3.14").addSystemInfo("Tester name","nuzly").addSystemInfo("CompanyName","nuzaa.infor") ;
	}
		return extent;
	}
}
