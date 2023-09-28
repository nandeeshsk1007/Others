package AdoohNegativeScenarios;

import java.security.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Signup extends Generic1{
public void enteringRegisteredMobnu(String Mobnum)
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[.='Create One']")).click();
	driver.findElement(By.xpath("//input[@class='form-control phone-input input is-primary']")).sendKeys(Mobnum);
	driver.findElement(By.xpath("//button[.='Sign Up']")).click();
	if(driver.getPageSource().contains("Already exists"))
	{
		System.out.println("Test case is passed");
	}
	else
	{
		Assert.fail("It is accepting already registered mob num");
	}
}

public void notEnteringDataMobnu(String Mobnum)
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[.='Create One']")).click();
	driver.findElement(By.xpath("//input[@class='form-control phone-input input is-primary']")).sendKeys(Mobnum);
	driver.findElement(By.xpath("//button[.='Sign Up']")).click();
	if(driver.getPageSource().contains("Invalid phone number"))
	{
		System.out.println("Invalid phone number");
	}
	else
	{
		Assert.fail("No data entered");
	}
}

public void enteringLessThan10Digits(String Mobnum)
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[.='Create One']")).click();
	driver.findElement(By.xpath("//input[@class='form-control phone-input input is-primary']")).sendKeys(Mobnum);
	driver.findElement(By.xpath("//button[.='Sign Up']")).click();
	if(driver.getPageSource().contains("Invalid phone number"))
	{
		System.out.println("Invalid phone number");
	}
	else
	{
		Assert.fail("Make sure you have entered 10 digits");
	}
}
/*
public void enteringMoreThan10Digits(String Mobnum)
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[.='Create One']")).click();
	WebElement mobnum = driver.findElement(By.xpath("//input[@class='form-control phone-input input is-primary']"));
	mobnum.sendKeys(Mobnum);
	driver.findElement(By.xpath("//button[.='Sign Up']")).click();
	//mobnum.sendKeys(Keys.CONTROL+"A");
	String length = mobnum.getAttribute("value");
	if(length.contains("+91"))
	{
		length.replace("+91", "2");
		System.out.println(length);
	}
	//.length();
	System.out.println(length);
	if(driver.getPageSource().contains("Invalid phone number"))
	{
		System.out.println("Invalid phone number");
	}
	else
	{
		Assert.fail("Make sure you have entered 10 digits");
	}
}
*/
@Test
public static void execution1()
{
	Signup B = new Signup();
	//B.enteringRegisteredMobnu("8050373728");
	//B.notEnteringDataMobnu("");
	//B.enteringLessThan10Digits("51515");
	//B.enteringMoreThan10Digits("2879111178");;
	
}
}
