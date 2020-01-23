package com.arizona.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.arizona.basetest.BaseTest;
import com.arizona.pages.Aboutpage;
import com.arizona.pages.Homepage;
import com.arizona.pages.LoadingPage;
import com.relevantcodes.extentreports.LogStatus;

public class TestCause1  extends BaseTest{
	@Test
	public void getreport() throws Exception{
		test=extent.startTest("open browser ");
		test.log(LogStatus.INFO, "open brower test is started ");
		 browser("mozilla");
		 Screenshot(driver, test);
		 
		 LoadingPage test2 =new LoadingPage(driver,test);
		 Homepage hometest=test2.openApplication();
		 PageFactory.initElements(driver, hometest);
		 Aboutpage abouttrail=hometest.about();
PageFactory.initElements(driver, abouttrail);
abouttrail.policyandprocedure();
Screenshot(driver, test);
		 
		 
		 
	}
	@AfterTest
	public void quit() {
	extent.endTest(test);
	extent.flush();
	extent.close();
	
	}

}
