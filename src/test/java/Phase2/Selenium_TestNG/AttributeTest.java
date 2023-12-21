package Phase2.Selenium_TestNG;

//import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class AttributeTest {

	//@Test annotation describe info abt test
	@Test(description = "The Sample Test One", priority = 2)
	public void testOne(){
		System.out.println("--- Test One is executed ---");
		//fail();
	}

	@Test(description = "The Sample Test Three", priority = 1,enabled = false)
	public void testThree(){
		System.out.println("--- Test Three is executed ---");
	}
	
	//@Test annotation attribute depend on  method used
	//@When the 2nd test mtd wants  to be dependent on the first test method
	@Test(description = "The Sample Test Two", dependsOnMethods = {"testOne","testThree"}, alwaysRun = true)
	public void testTwo(){
		System.out.println("--- Test Two is executed ---");
	}
	
	
	//test groups
	@Test(groups = "Regression Test")
	public void r1() {
		System.out.println("--- Test R1 is executed ---");
	}
	
	@Test(groups = "Regression Test" , timeOut = 600)
	public void r2() throws InterruptedException {
		// fail();
		Thread.sleep(500);
		System.out.println("--- Test R2 is executed ---");
	}
	
	@Test(groups = "Regression Test" , dependsOnGroups = {"Regression Test"})
//	@Test(groups = "Regression Test" , dependsOnGroups = {"Regression Test"}, alwaysRun = true)
	public void r3() {
		System.out.println("--- Test R3 is executed ---");
	}
}
