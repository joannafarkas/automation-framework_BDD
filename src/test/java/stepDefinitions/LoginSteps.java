package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Base_PO;
import pageObject.Login_PO;
import org.openqa.selenium.By;


public class LoginSteps extends Base_PO{

	private Login_PO login_po;
	 
	public LoginSteps(Login_PO login_po) {
		this.login_po = login_po;
	}
	 
	@Given("I open login page")
	public void i_access_the_webdriver_university_login_portal() {
		login_po.navigateTo_WebdriverUniversity_LoginPage();
	}
	
	@When("I enter a {word} and {word}")
	public void i_enter_a_unique_login(String login, String password) {
		login_po.setUserName(login);
		login_po.setPassword(password);
	}
	
	@And("I press login button")
	public void i_login_to_the_page() {
		waitForWebelementAndClick(By.id("login-button"));
	} 
	
	@Then("I should see {}")
	public void iShouldSeeValidationMessage(String expectedMessage){
		login_po.checkAlertMessage(expectedMessage);
	}

}
