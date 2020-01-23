package com.arizona.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.arizona.basepage.BasePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Homepage extends BasePage {
	
	
	@FindBy(how=How.XPATH,using="//section[@id='block-system-main-menu']/div/div/ul/li[2]/a[2]")
	public WebElement about;
	
	public Homepage(WebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
				this.test=test;
	}
	public Aboutpage about() throws Exception{
	Thread.sleep(5000);	
	about.click();
	test.log(LogStatus.INFO, "about menu page is click");
		Aboutpage kk=new Aboutpage(driver,test);
		PageFactory.initElements(driver, kk);
		return kk;
		
	}
	@FindBy(how=How.XPATH,using="//section[@id='block-system-main-menu']/div/div/ul/li[3]/a[2]")
	public WebElement careers;
	

	public void careers() throws Exception{
	Thread.sleep(5000);	
	careers.click();
	test.log(LogStatus.INFO, "career menu page click");
	}
	@FindBy(how=How.XPATH,using="//section[@id='block-system-main-menu']/div/div/ul/li[4]/a[2]")
	public WebElement newsreports;
	
	public void newsreports() throws Exception{
		Thread.sleep(5000);
		newsreports.click();
		test.log(LogStatus.INFO, "newsreport menu pagr click");
		
	}
	@FindBy(how=How.XPATH,using="//section[@id='block-system-main-menu']/div/div/ul/li[5]/a[2]")
	public WebElement Yourrights;
	
	public void yourrights() throws Exception{
		Thread.sleep(5000);
		Yourrights.click();
		test.log(LogStatus.INFO, "yourright menu page click");
	}
	@FindBy(how=How.XPATH,using="//section[@id='block-system-main-menu']/div/div/ul/li[6]/a[2]")
	public WebElement fosteradption;
	
	public void fosteradption() throws Exception{
		Thread.sleep(5000);
		fosteradption.click();
		test.log(LogStatus.INFO, "fosteradption meanu page click");
}
	@FindBy(how=How.XPATH,using="//section[@id='block-system-main-menu']/div/div/ul/li[7]/a[2]")
	public WebElement resource;
	
	public void resource() throws Exception{
		Thread.sleep(5000);
		resource.click();
		test.log(LogStatus.INFO, "resource menu page click");
	}
	@FindBy(how=How.XPATH,using="//section[@id='block-system-main-menu']/div/div/ul/li[8]/a[2]")
	public WebElement services;
	public void services() throws Exception{
		Thread.sleep(5000);
		services.click();
		test.log(LogStatus.INFO, "services menu page click");
	}
	@FindBy(how=How.XPATH,using="//section[@id='block-system-main-menu']/div/div/ul/li[9]/a[2]")
	public WebElement reportchildabuse;
	public void reportchildabuse() throws Exception{
		Thread.sleep(5000);
		reportchildabuse.click();
		test.log(LogStatus.INFO, "reportchildabuse menu page click");
	}

	


}
