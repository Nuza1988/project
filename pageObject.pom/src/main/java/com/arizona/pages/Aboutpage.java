package com.arizona.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.arizona.basepage.BasePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Aboutpage extends BasePage{
	@FindBy(how=How.XPATH,using="//section[@id='block-system-main-menu']/div/div/ul/li[2]/ul/li/a")
	public WebElement aboutDcs1;
	
	

	public Aboutpage(WebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.test=test;
	}

	public void aboutDcs() throws Exception{
		Thread.sleep(5000);
	WebElement element=aboutDcs1;
	Actions nuz=new Actions(driver);
	nuz.moveToElement(aboutDcs1).click().build().perform();
	test.log(LogStatus.INFO, "aboutdcs menu page click");	
	}
	
	
	@FindBy(how=How.XPATH,using="//section[@id='block-system-main-menu']/div/div/ul/li[2]/ul/li[2]/a[2]")
	public WebElement Adminstration;
	public AdministrationPage administratioPage() throws Exception{
		
		Thread.sleep(5000);
		WebElement element1=Adminstration;
		Actions nuza=new Actions(driver);
		nuza.moveToElement(Adminstration).build().perform();
		
		test.log(LogStatus.INFO, "administrationpage ");
	AdministrationPage admin=new AdministrationPage(driver);
	
PageFactory.initElements(driver, admin);
return admin;

}
	@FindBy(how=How.LINK_TEXT,using="Policy & Procedure")
	public WebElement Policy;
	@FindBy(how=How.LINK_TEXT,using="DCS Policy & Procedure")
	public WebElement DcsPolicy;
	public void  policyandprocedure() throws Exception{
		Thread.sleep(5000);
		WebElement element2=Policy;
	
		Actions galle=new Actions(driver);
	
		galle.moveToElement(Policy).build().perform();
		Thread.sleep(5000);
		WebElement element3=Policy;
		
		Actions trail2=new Actions(driver);
	
		trail2.moveToElement(Policy).click().build().perform();
		test.log(LogStatus.INFO, "policyandprocdure mouse over it ");
		

		
	}
	
	
	
}
