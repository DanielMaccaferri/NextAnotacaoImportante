package br.com.anotacao.next.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		if(driver == null) {
			createDriver();
		}
		return driver;
	}

	public static void createDriver() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("http://automationpractice.com/index.php");
		//driver.navigate().to("https://telasnegocio.stf.tu.aznxt.local/telasdenegocio/?FUNC=2&customerId=2994&X-Next-AuthToken=eyAgICJhbGciOiAiSFMyNTYiIH0.ew0KICAic3ViIjoiMzcyNDU4NzIwMTUiLA0KICAidXNlckRhdGEiOnsiaG9zdE5hbWUiOiJENDI1M0U3ODk1IiwiYWdlbnRJZCI6Ikk5MzE2NTAiLCJ0aWNrZXQiOiJBMjBFNDZBNTA2NzgyOTBFIiwiY2xhaW1zIjp7ImNzciI6dHJ1ZSwiY3VzdG9tZXIiOnRydWV9LCJhY2NvdW50cyI6W3siY3JlYXRlVXNlcklkIjo0MDUwMSwidXBkYXRlRnVuY3Rpb25OYW1lIjoiQ3VzdG9tZXJCYW5rQWNjb3VudERhb0ltcGwiLCJ1cGRhdGVVc2VySWQiOjQwNTAxLCJjdXN0b21lcklkIjo0MDUwMSwiYWNjb3VudE51bWJlciI6MTUzMDgsImNyZWF0ZUZ1bmN0aW9uTmFtZSI6IkN1c3RvbWVyQmFua0FjY291bnREYW9JbXBsIiwiYnJhbmNoIjozOTI5LCJ1cGRhdGVUaW1lc3RhbXAiOiIyMDIwLTA3LTMxVDA5OjEzOjQ4WiIsInVuaXF1ZUlEIjoxNTQyOCwiY3JlYXRlVGltZXN0YW1wIjoiMjAyMC0wNy0zMVQwOToxMzo0OFoifV0sInNlc3Npb25JZCI6IjAwMUQ2MzVFOUQxNTVCOVgwMkVFQ0I4M0VDNjk2Mzc3IiwiZGV2aWNlSWQiOiJPcHRpb25hbC5lbXB0eSIsImN1c3RvbWVyIjp7ImdlbmRlckNvZGUiOiJNIiwibWFyaXRhbFN0YXR1c0lkIjoiU0lOR0xFIiwibW9udGhseUluY29tZUFtb3VudCI6IjUwMDAuMCIsImNwZiI6IjM3MjQ1ODcyMDE1IiwiYmlydGhEYXRlIjoiMTk4OC0xMS0xMiIsInVuaXF1ZUlEIjo0MDUwMX19DQp9.7WD7BggNfT5qhvTwH-e1frf8-8vt_7W7LiPzvL6Rl5s");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
