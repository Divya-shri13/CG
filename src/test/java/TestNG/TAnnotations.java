package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TAnnotations {
	
	@BeforeSuite
	public void testbeforesuite() {
		System.out.println("suite before test");
	}

	@AfterSuite
	public void testaftersuite() {
		System.out.println("suite after test");
	}

	@BeforeTest
	public void openDBconnection1() {
		System.out.println("DB is connected");
	}

	@AfterTest
	public void openDBconnection() {
		System.out.println("DB is closed");
	}

	@BeforeMethod
	public void openbrowser() {
		System.out.println("Browser open");
	}

	@AfterMethod
	public void Closebrowser() {
		System.out.println("Browser close");
	}

	@Test(priority = 0)
	public void Loginsucessful() {
		System.out.println("sucessfully login");
	}

	@Test(priority = 1)
	public void titlevalidation() {
		System.out.println("Verify the tile");
	}

	@Test(priority = 2)
	public void searchproduct() {
		System.out.println("searching the product");
	}

}
