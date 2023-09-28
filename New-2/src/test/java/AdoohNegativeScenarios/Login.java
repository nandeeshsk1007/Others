package AdoohNegativeScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Generic1  {

public void enteringInvalidMobNo(String Mobnum, String Password) throws InterruptedException
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@class='form-control phone-input input is-primary']")).sendKeys(Mobnum);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
	driver.findElement(By.xpath("//button[@class='button w-100 mt-6 is-primary']")).click();
	Thread.sleep(2000);
	String pagesource = driver.getPageSource();
	if(pagesource.contains("Please enter valid mobile number/password"))
	{
		System.out.println("Test case is passed");
	}
	else
	{
		Assert.fail("Invalid mobile number");
	}	
}

public void enteringUnRegisteredMobNo(String Mobnum, String Password) throws InterruptedException
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@class='form-control phone-input input is-primary']")).sendKeys(Mobnum);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
	driver.findElement(By.xpath("//button[@class='button w-100 mt-6 is-primary']")).click();
	Thread.sleep(2000);
	String pagesource = driver.getPageSource();
	if(pagesource.contains("Please enter valid mobile number/password"))
	{
		System.out.println("Test case is passed");
	}
	else
	{
		Assert.fail("Unregistered mobile number");
	}	
}

public void enteringInvalidPassword(String Mobnum, String Password) throws InterruptedException
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@class='form-control phone-input input is-primary']")).sendKeys(Mobnum);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
	driver.findElement(By.xpath("//button[@class='button w-100 mt-6 is-primary']")).click();
	Thread.sleep(2000);
	String pagesource = driver.getPageSource();
	if(pagesource.contains("Please enter valid mobile number/password"))
	{
		System.out.println("Test case is passed");
	}
	else
	{
		Assert.fail("Invalid password");
	}	
}

public void enteringInvalidMobNoAndPassword(String Mobnum, String Password) throws InterruptedException
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@class='form-control phone-input input is-primary']")).sendKeys(Mobnum);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
	driver.findElement(By.xpath("//button[@class='button w-100 mt-6 is-primary']")).click();
	Thread.sleep(2000);
	String pagesource = driver.getPageSource();
	if(pagesource.contains("Please enter valid mobile number/password"))
	{
		System.out.println("Test case is passed");
	}
	else
	{
		Assert.fail("Invalid mobile number and password");
	}	
}

public void enteringAlphabetsAndSpecialCharactersIntoMobNo(String Mobnum, String Password) throws InterruptedException
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@class='form-control phone-input input is-primary']")).sendKeys(Mobnum);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
	driver.findElement(By.xpath("//button[@class='button w-100 mt-6 is-primary']")).click();
	Thread.sleep(2000);
	String pagesource = driver.getPageSource();
	if(pagesource.contains("Invalid phone number"))
	{
		System.out.println("Test case is passed");
	}
	else
	{
		Assert.fail("Mob No text field will accept only numbers");
	}	
}

public void enteringDataOnlyIntoPassword(String Mobnum, String Password) throws InterruptedException
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@class='form-control phone-input input is-primary']")).sendKeys(Mobnum);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
	driver.findElement(By.xpath("//button[@class='button w-100 mt-6 is-primary']")).click();
	Thread.sleep(2000);
	String pagesource = driver.getPageSource();
	if(pagesource.contains("Invalid phone number"))
	{
		System.out.println("Test case is passed");
	}
	else
	{
		Assert.fail("Mob No text field can not not be empty");
	}	
}

public void enteringDataIntoOnlyMobNo(String Mobnum, String Password) throws InterruptedException
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@class='form-control phone-input input is-primary']")).sendKeys(Mobnum);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
	driver.findElement(By.xpath("//button[@class='button w-100 mt-6 is-primary']")).click();
	Thread.sleep(2000);
	String pagesource = driver.getPageSource();
	if(pagesource.contains("password can not be empty"))
	{
		System.out.println("Test case is passed");
	}
	else
	{
		Assert.fail("Password text field can not not be empty");
	}	
}

public void withOutEnteringDataintoAnyFields(String Mobnum, String Password) throws InterruptedException
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@class='form-control phone-input input is-primary']")).sendKeys(Mobnum);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
	driver.findElement(By.xpath("//button[@class='button w-100 mt-6 is-primary']")).click();
	Thread.sleep(2000);
	String pagesource = driver.getPageSource();
	if(pagesource.contains("Invalid phone number"))
	{
		System.out.println("Test case is passed");
	}
	else
	{
		Assert.fail("Mob no and Password text field can not not be empty");
	}	
}

public void enterDataintoPawdAndMobNoAndDoubleClickOnSignin(String Mobnum, String Password) throws InterruptedException
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@class='form-control phone-input input is-primary']")).sendKeys(Mobnum);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
	WebElement loginbutton = driver.findElement(By.xpath("//button[@class='button w-100 mt-6 is-primary']"));
	Thread.sleep(2000);
	Actions actions = new Actions(driver);
	boolean clicked = actions.doubleClick(loginbutton) !=null;
	if(clicked)
	{
		System.out.println("double clicked");
	}
	else
	{
		Assert.fail("Not double clicked on Sign in button");
	}
}
@Test 
public static void execution() throws InterruptedException
{
	Login A = new Login();
	//A.enteringInvalidMobNo("1234567890", "123");
	//A.enteringUnRegisteredMobNo("9108757478", "123456");
	//A.enteringInvalidPassword("8050373728", "1234");
	//A.enteringInvalidMobNoAndPassword("1234568455", "asd");
	//A.enteringAlphabetsAndSpecialCharactersIntoMobNo("adsf!@#", "12345");
	//A.enteringDataIntoOnlyPassword("", "4561233idjf");
	//A.enteringDataIntoOnlyMobNo("8050373728", "");
	//A.withOutEnteringDataintoAnyFields("", "");
	A.enterDataintoPawdAndMobNoAndDoubleClickOnSignin("9620720383", "12345");
}
}