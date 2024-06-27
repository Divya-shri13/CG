package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Driver {

	WebDriver driver;

	@BeforeSuite
	public void browserSetup() {
		
		
		driver = new EdgeDriver();
		// String actUrl ="https://demowebshop.tricentis.com/";
		System.setProperty("webdriver.edge.driver",
				"C:\\selenium\\edgedriver_win64\\msedgedriver.exe");
		// System.setProperty("WebDriver.edge.driver", ("user dir")+
		// "msedgedriver.exe");

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}

	@AfterSuite
	public void CloseBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}

}
