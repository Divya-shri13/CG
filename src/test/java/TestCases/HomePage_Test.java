package TestCases;

import org.testng.annotations.Test;

import Webpages.HomePage;

public class HomePage_Test extends Driver {
	@Test
	public void Home_Method() {
		HomePage hp = new HomePage(driver);
		hp.radiobtn();
		hp.votebtn();
		

}
}