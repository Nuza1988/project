package FaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot002 {
	public class FbLogin {
		@Test
		public void mo() throws Exception{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\nuza1\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get("https://en-gb.facebook.com/");
			Thread.sleep(3000);

}
}
}