package com.facebook.basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.facebook.basepage.Basepage;

public class BeseTest extends Basepage {
	public void browser(String b ){
		if (b.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\nuza1\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
		}else if (b.equals("mozila")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\nuza1\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
	
		}
	}
}
