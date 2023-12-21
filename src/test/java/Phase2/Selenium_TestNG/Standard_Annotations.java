package Phase2.Selenium_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Standard_Annotations {
	
	@BeforeSuite
	public void setUpBeforeSuite() {
		System.out.println("--- Before Suite ---");
	}
	
	@AfterSuite
	public void cleanAfterSuite() {
		System.out.println("--- After Suite ---");
	}
	
	@BeforeClass
	public void setUpBeforeClass() {
		System.out.println("--- Before Class ---");
	}
	
	@AfterClass
	public void cleanAfterClass() {
		System.out.println("--- After Class ---");
	}
	
	@BeforeMethod
	public void setUpBeforeMethod() {
		System.out.println("--- Before Test Method ---");
	}
	
	@AfterMethod
	public void cleanAfterMethod() {
		System.out.println("--- After Test Method ---");
	}
	
	@Test
	public void testOne(){
		System.out.println("--- Test One is executed ---");
	}
	
	@Test
	public void testTwo() {
		System.out.println("--- Test Two is executed ---");		
	}
	
	@Test
	@Ignore
	public void testThree(){
		System.out.println("--- Test Three is executed ---");
	}
}
