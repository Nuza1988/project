package com.arizona.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.arizona.basepage.BasePage;
import com.relevantcodes.extentreports.LogStatus;

public class AdministrationPage extends BasePage{
	
	
	public AdministrationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	@FindBy(how=How.XPATH,using="//section[@id='block-system-main-menu']/div/div/ul/li[2]/ul/li[2]/ul/li/a")
	public WebElement Mike;
	public void mike() throws Exception{
		Thread.sleep(5000);
		WebElement element=Mike;
		Actions nuzly=new Actions(driver);
		nuzly.moveToElement(Mike).click().build().perform();
		test.log(LogStatus.INFO,"administration menu page mouse ovet it ");
		
		
	

}
}
