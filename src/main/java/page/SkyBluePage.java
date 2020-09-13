package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyBluePage {
	WebDriver driver;

	public void skyBlue(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.CSS, using = "button[onclick='myFunctionSky()']")
	WebElement SetSkyBlueBackground_Locator;

	// Method to interact with
	public void clickOnSkyBlue() {
		SetSkyBlueBackground_Locator.click();
	}
}
