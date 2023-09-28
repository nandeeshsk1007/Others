package AdoohNegative;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generic {
	WebDriver driver;
	@BeforeClass
	public void navigateToApplication()
	{
		System.setProperty("webdriver.chrome.driver", "./Sof1/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://ooh.apprikart.com/console/login");
	}

	@AfterClass
	public void exitFromBrowser()
	{
		driver.quit();
	}
}
