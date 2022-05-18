package testclasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_ReportsAndLogs {

	@BeforeClass
	public void setUp() {
		Reporter.log("This runs once before the class", true);
	}
	
	@AfterClass
	public void cleanUP() {
		Reporter.log("This runs once after the class", true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("beforeMethod -> This runs before every method", true);
	}
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("afterMethod -> This runs after every method", true);		
	}
	
	@Test
	public void testMethod1() {
		Reporter.log("TestNG_ReportsAndLogs -> testMethod1" , true);		
	}
	
	@Test
	public void testMethod2() {
		Reporter.log("TestNG_ReportsAndLogs -> testMethod2" , true);
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"testMethod2"})
	public void testMethod3() {
		Reporter.log("TestNG_ReportsAndLogs -> testMethod3" , true);
		
	}
}
