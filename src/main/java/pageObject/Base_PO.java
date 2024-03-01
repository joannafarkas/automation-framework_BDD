package pageObject;

import java.time.Duration;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utils.Global_Vars;
import driver.DriverFactory;

public class Base_PO {

	public Base_PO() {
		PageFactory.initElements(getDriver(), this);

	}

	public WebDriver getDriver() {
		return DriverFactory.getDriver();
	}

	public void navigateTo_URL(String url) {
		getDriver().get(url);
	}

	public String generateRandomString(int length) {
		return RandomStringUtils.randomAlphabetic(length);
	}

	public void sendKeys(By by, String textToType) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
		wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(textToType);
	}

	public void sendKeys(WebElement element, String textToType) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
		wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(textToType);
	}

	public void waitForWebelementAndClick(By by) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	}

	public void waitForWebelementAndClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public void waitForAlert_Validate(String expectedMessage) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
		wait.until(ExpectedConditions.alertIsPresent());
		String alert_msg = getDriver().switchTo().alert().getText();
		Assert.assertEquals(alert_msg, expectedMessage);
		System.out.println(alert_msg);
		System.out.println(expectedMessage);
	}

	public void waitFor(By by) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
	}

	public void waitFor(WebElement element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
