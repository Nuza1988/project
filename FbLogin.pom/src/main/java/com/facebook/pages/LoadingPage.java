package com.facebook.pages;

import org.openqa.selenium.WebDriver;

import com.facebook.basepage.Basepage;

public class LoadingPage extends Basepage{
	public LoadingPage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public void openApplication() throws Exception{

		Thread.sleep(3000);
		
		driver.navigate().to("https://dcs.az.gov/");
		driver.manage().window().maximize();
		

}
	
}
