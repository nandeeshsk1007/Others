package Assertions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class AssertionTrue {
@Test
public void test1()
{
//	String expectedresult = "Selenium";
//	String actualresult = "Selenium";
//	assertEquals(actualresult, expectedresult);
	
//	String expectedresult = "Selenium";
//	String actualresult = "Selenium1";
//	assertEquals(actualresult, expectedresult);
	
	String expectedresult = "Selenium";
	String actualresult = "Selenium";
	assertNotEquals(actualresult, expectedresult, "Test failed");
	
//	String expectedresult = "Selenium";
//	String actualresult = "Selenium";
//	assertNotEquals(actualresult, expectedresult, "Test failed");
}
}
