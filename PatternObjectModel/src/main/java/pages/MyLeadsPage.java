package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {

	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	WebElement eleCreateLead;
	@And("Click on Create Lead link in Leads Page")
	public CreateLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	WebElement FindLeadsbutton;
	@And("Click on Find Lead link in Leads Page")
	public FindLeadPage clickFindLeads() {
		click(FindLeadsbutton);
		return new FindLeadPage();
	}
}
