package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;

public class HomePage extends BaseClass {
	
	WebDriver driver;
	
	
		public HomePage(WebDriver driver) {
			this.driver = driver;
		}
		By radiobtn = By.id("pollanswers-2");
		By votebtn  = By.id("vote-poll-1");
		
		public void radiobtn() {
			WebElement ele =  driver.findElement(radiobtn);
			ClickMethod(ele);
			
		}
		public void votebtn() {
			WebElement vbtn =  driver.findElement(radiobtn);
			ClickMethod(vbtn);

}
		
		
}