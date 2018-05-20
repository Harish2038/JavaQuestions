package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {
	public  EditLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="updateLeadForm_generalProfTitle")
	WebElement profTitle;
	public EditLeadPage typeProfileTitle(String data) {
		type(profTitle,data);
		return this;
	}
	@FindBy(how=How.ID,using="updateLeadForm_generalProfTitle")
	WebElement clearlName;
	@And("Clear Last Name in Edit Lead Page")
	public EditLeadPage ClearLastName() {
		clearlName.clear();
		return this;
	}
	@FindBy(how=How.ID,using="updateLeadForm_generalProfTitle")
	WebElement editlName;
	@And("Enter Last Name in Edit Lead Page as (.*)")
	public EditLeadPage editLastName(String data) {
		type(editlName, data);
		return this;
	}
	@FindBy(how=How.XPATH,using="//input[@value='Update']")
	WebElement updateButton;
	@Then("Click on Update button in Edit Lead Page")
	public ViewLeadPage clickUpdateButton() {
		click(updateButton);
		return new ViewLeadPage();
	}
}
