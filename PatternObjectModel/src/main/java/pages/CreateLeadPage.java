package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{

	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement companyName;
	@And("Enter Company Name in Create Lead Page as (.*)")
	public CreateLeadPage typeCompanyName(String data) {
		type(companyName,data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	WebElement firstName;
	@And("Enter First Name in Create Lead Page as (.*)")
	public CreateLeadPage typeFirstName(String data) {
		type(firstName,data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	WebElement lastName;
	@And("Enter Last Name in Create Lead Page as (.*)")
	public CreateLeadPage typeLastName(String data) {
		type(lastName,data);
		return this;
	}

	@FindBy(how=How.XPATH,using="//input[@name='submitButton']")
	WebElement createLeadButton;
	@When("Click on Create Lead button in Create Lead Page")
	public ViewLeadPage clickCreateLeadButton() {
		click(createLeadButton);
		return new ViewLeadPage();
	}
}
