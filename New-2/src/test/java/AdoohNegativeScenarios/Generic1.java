package AdoohNegativeScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic1 {
	
	public static WebDriver driver;
	@BeforeMethod
	public void navigateToApplication() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Sof2/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://ooh.apprikart.com/console/login");
		Thread.sleep(2000);
	}
	@AfterMethod
	public void exitFromBrowser()
	{
		driver.quit();
	}
}
