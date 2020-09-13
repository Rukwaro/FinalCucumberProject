package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SkyBluePage;
import page.SkyWhitePage;
import util.BrowserFactory;

public class ChangeSteps {

	WebDriver driver;

	@Before
	public void startGoogleChrome() {
		driver = BrowserFactory.startBrowser();
		driver.get("http://techfios.com/test/107/");
	}

	@Given("^the Set SkyBlue Background button exists$")
	public void the_Set_SkyBlue_Background_button_exists() {
		boolean isDisplayed = driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).isDisplayed();

		if (isDisplayed) {
			System.out.println("SkyBlue button is Displayed");
		} else {
			System.out.println("SkyBlue button is not displayed");
		}
	}

	@When("^I click on the Set SkyBlue Background button$")
	public void i_click_on_the_Set_SkyBlue_Background_button() {
		SkyBluePage skyBluePage = PageFactory.initElements(driver, SkyBluePage.class);
		skyBluePage.clickOnSkyBlue();

	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		boolean isDisplayed = driver.findElement(By.cssSelector("body[style='background-color: skyblue;']"))
				.isDisplayed();

		if (isDisplayed) {
			System.out.println("SkyBlue background is Displayed");
		} else {
			System.out.println("SkyBlue background is not displayed");
		}

	}

	@Given("^the Set White Background button exists$")
	public void the_Set_White_Background_button_exists() {
		boolean isDisplayed = driver.findElement(By.xpath("//*[@id=\"extra\"]/button[2]")).isDisplayed();

		if (isDisplayed) {
			System.out.println("White background button is Displayed");
		} else {
			System.out.println("White background button is not displayed");
		}
	}

	@When("^I click on Set White Background button$")
	public void i_click_on_Set_White_Background_button() {
		SkyWhitePage skyWhitePage = PageFactory.initElements(driver, SkyWhitePage.class);
		skyWhitePage.clickOnSetWhiteBackground();

	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
		boolean isDisplayed = driver.findElement(By.cssSelector("body[style='background-color: white;']"))
				.isDisplayed();

		if (isDisplayed) {
			System.out.println("White background is Displayed");
		} else {
			System.out.println("White background is not displayed");
		}

	}

}
