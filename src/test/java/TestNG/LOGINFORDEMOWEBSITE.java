package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LOGINFORDEMOWEBSITE {

	
		WebDriver driver;
		
		
		@org.testng.annotations.Parameters({"browser","url"})
				
			@Test
			public void browserSetup(String browser, String url) {
				
				System.out.println("the browser is:" + browser);
				
				if(browser.equals("edge")) {
					driver = new EdgeDriver();
					System.setProperty("webdriver.edge.driver","C:\\selenium\\edgedriver_win64");
				}
				driver.get(url);
				System.out.println("done");
					
		}
		@Parameters({"username","password"})
		
		@Test
		public void test(String username, String password ) {
			driver.findElement(By.id("user-name")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("login-button")).click();
		
			
			}
			
	}
