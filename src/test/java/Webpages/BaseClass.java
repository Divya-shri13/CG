package Webpages;

import org.openqa.selenium.WebElement;

import TestCases.Driver;

public class BaseClass extends Driver {
	public void ClickMethod(WebElement ele) {
		ele.click();
	}
}