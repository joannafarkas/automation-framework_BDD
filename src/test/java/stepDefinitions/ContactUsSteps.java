package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Base_PO;
import pageObject.ContactUs_PO;

public class ContactUsSteps extends Base_PO {

	private ContactUs_PO contactus_po;

	public ContactUsSteps(ContactUs_PO contactus_po) {
		this.contactus_po = contactus_po;
	}

	@Given("I access the webdriver university contact us page")
	public void i_access_the_webdriver_university_contact_us_page() {
		contactus_po.navigateTo_WebdriverUniversity();
	}

	@When("I enter a unique {word} first name")
	public void i_enter_a_unique_first_name(String userFirstname) {
		contactus_po.setUserFirstName(userFirstname + "AutoFN" + generateRandomString(7));
	}

	@And("I enter a unique {word} last name")
	public void i_enter_a_unique_last_name(String userLastname) {
		contactus_po.setUserLastName(userLastname + "AutoLN" + generateRandomString(7));

	}

	@And("I enter a unique {} address")
	public void i_enter_a_unique_email_address(String email) {
		contactus_po.setEmail(email);
	}

	@And("I enter a unique {} description")
	public void i_enter_a_unique_comment(String comment) {
		contactus_po.setComment(comment + generateRandomString(15));
	}

	@And("I click on the submit button")
	public void i_click_on_the_submit_button() {
		contactus_po.clickSubmitBtn();
	}

	@Then("I should be presented with a successful contact us submission message")
	public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
		contactus_po.validate_Successful_SubmissionMessage_Text();
	}

	@When("I enter a specific first name {word}")
	public void i_enter_a_specific_first_name(String fname) {
		contactus_po.setSpecific_FirstName(fname);
	}

	@When("I enter a specific last name {word}")
	public void i_enter_a_specific_last_name(String lname) {
		contactus_po.setSpecific_LastName(lname);
	}

	@When("I enter a specific email address {word}")
	public void i_enter_a_specific_email_address(String email) {
		contactus_po.setSpecific_EmailAddress(email);
	}

	@When("I enter a specific comment {string}")
	public void i_enter_a_specific_comment(String comment) {
		contactus_po.setSpecific_Comment(comment);
	}

}
