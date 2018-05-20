package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{

	public FindLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="(//label[text()='First name:'])[3]//following::div[1]/input")
	WebElement firstName;
	@And("Enter First Name in Find by section in Find Lead Page as (.*)")
	public FindLeadPage typeFirstName(String data) {
		type(firstName, data);
		return this;
	}
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	WebElement findLeadButton;
	@And("Click on Find Leads button in Find Lead Page")
	public FindLeadPage clickFindLeadButton() {
		click(findLeadButton);
		return this;		
	}
	@FindBy(how=How.XPATH,using="//a[text()='10429']")
	WebElement selectLead;
	@And("Click on Lead ID link")
	public ViewLeadPage clickleadID() {
		click(selectLead);
		return new ViewLeadPage();
	}
}
