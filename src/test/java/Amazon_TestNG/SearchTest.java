package Amazon_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
 
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
		driver.quit();  // the quit() method closes all browser windows and ends the WebDriver session.
		// driver.close(); // the close() closes only the current window on which Selenium is running automated tests.The WebDriver session, however, remains active. 
	}
	
	@Test(description = "Search for Iphone 15 pro mac - Valid match")
	public void search1() throws InterruptedException {
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone 15 pro max");
		searchBox.submit();

		// add delay 
		Thread.sleep(2000);
		
		String expectedTitle = "Amazon.in : Iphone 15 pro max";
		String actualTitle = driver.getTitle();
		
		assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(description = "Search for Apple Mac book - Valid match")
	public void search2() throws InterruptedException {
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.clear();
		searchBox.sendKeys("Apple Mac book");
		searchBox.submit();

		// add delay 
		Thread.sleep(2000);
		
		String expectedTitle = "Amazon.in : Apple Mac book";
		String actualTitle = driver.getTitle();
		
		assertEquals(actualTitle, expectedTitle);
	}

}
