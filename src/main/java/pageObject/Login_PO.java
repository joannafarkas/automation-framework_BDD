package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.Global_Vars;

public class Login_PO extends Base_PO {

	private @FindBy(id = "text") WebElement username_field;

	private @FindBy(id = "password") WebElement password_field;

	private @FindBy(id = "login-button") WebElement login_btn;

	public Login_PO() {
		super();
	}

	public void navigateTo_WebdriverUniversity_LoginPage() {
		navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Login-Portal/index.html?");

	}

	public void setUserName(String username) {
		sendKeys(username_field, username);
	}

	public void setPassword(String password) {
		sendKeys(password_field, password);
	}

	public void clickLoginBtn() {
		waitForWebelementAndClick(login_btn);
	}

	public void checkAlertMessage(String expectedMsg) {
		waitForAlert_Validate(expectedMsg);
	}
}
