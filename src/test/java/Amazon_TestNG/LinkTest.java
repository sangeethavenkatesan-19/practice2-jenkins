package Amazon_TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkTest {
	//step 1: formulate a test domain url and driver path
	String siteUrl = "https://www.amazon.in/";
	String driverPath = "drivers/windows/chromedriver.exe";	
	WebDriver driver;
		
	@BeforeMethod
	public void setUp() {
		//step 2: set system properties for selenium driver
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		//step 3: Instantiate selenium web driver
		driver = new ChromeDriver();
							
		//step 4: launch browser
		driver.get(siteUrl);
	}
		
	@AfterMethod
	public void cleanUp() {
		driver.quit();  
	}
	
	@Test(description = "Link Test 1 - Best Sellers")
	public void linkTest1() throws InterruptedException {
		Thread.sleep(1000);

		WebElement link = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));

		link.click();

		// add delay
		Thread.sleep(1000);

		String expectedTitle = "Amazon.in Bestsellers: The most popular items on Amazon";
		String actualTitle = driver.getTitle();
		
		assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(description = "Link Test 2 - Deals")
	public void linkTest2() throws InterruptedException {
		Thread.sleep(1000);

		WebElement link = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(6)"));

		link.click();

		// add delay
		Thread.sleep(1000);

		String expectedTitle = "Amazon.in - Deals";
		String actualTitle = driver.getTitle();
		
		assertEquals(actualTitle, expectedTitle);
	}
}
