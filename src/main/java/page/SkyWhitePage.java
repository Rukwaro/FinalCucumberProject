package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyWhitePage {
	WebDriver driver;

	public void skyWhite(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.CSS, using = "button[onclick='myFunctionWhite()']")
	WebElement SetWhiteBackground_Locator;

	// Method to interact with
	public void clickOnSetWhiteBackground() {
		SetWhiteBackground_Locator.click();
	}
}
