package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Utils.Global_Vars;

public class ContactUs_PO extends Base_PO {

	private @FindBy(xpath = "//input[@name='first_name']") WebElement fname_field;

	private @FindBy(xpath = "//input[@name='last_name']") WebElement lname_field;

	private @FindBy(name = "email") WebElement email_field;

	private @FindBy(name = "message") WebElement comment_field;

	private @FindBy(css = "[type='submit']") WebElement submit_Btn;

	private @FindBy(xpath = "//div[@id='contact_reply']/h1") WebElement successfulSubmission_Message_Text;

	public ContactUs_PO() {
		super();
	}

	public void navigateTo_WebdriverUniversity() {
		navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Contact-Us/contactus.html");

	}

	public void setUserFirstName(String userFirstname) {
		sendKeys(fname_field, userFirstname);

		// sendKeys(By.xpath("//input[@name=\"last_name\"]"), "AutoLN" +
		// generateRandomString(7));
	}

	public void setUserLastName(String userLastname) {
		sendKeys(lname_field, userLastname);
	}

	public void setEmail(String email) {
		sendKeys(email_field, email);
	}

	public void setComment(String comment) {
		sendKeys(comment_field, comment);
	}

	public void clickSubmitBtn() {
		waitForWebelementAndClick(submit_Btn);
	}

	public void validate_Successful_SubmissionMessage_Text() {
		waitFor(successfulSubmission_Message_Text);
		Assert.assertEquals(successfulSubmission_Message_Text.getText(), "Thank You for your Message!");
	}

	public void setSpecific_FirstName(String firstName) {
		sendKeys(fname_field, firstName);
	}

	public void setSpecific_LastName(String lastName) {
		sendKeys(lname_field, lastName);
	}

	public void setSpecific_EmailAddress(String emailAddress) {
		sendKeys(email_field, emailAddress);
	}

	public void setSpecific_Comment(String comment) {
		sendKeys(comment_field, comment);
	}

	public void clickOn_Submit_Button() {
		waitForWebelementAndClick(submit_Btn);
	}
}
