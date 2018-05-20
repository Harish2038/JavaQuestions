package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {

	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	WebElement eleFirstName;
	public ViewLeadPage VerifyFirstName(String data) {
		verifyExactText(eleFirstName, data);
		return this;
	}
	@FindBy(how=How.XPATH,using="//a[text()='Edit']")
	WebElement editLead;
	@And("Click on Edit Lead link in View Lead Page")
	public EditLeadPage clickEditLead() {
		click(editLead);
		return new EditLeadPage();
	}
	@FindBy(how=How.XPATH,using="//div[@class='fieldgroup-body']//span[text()='Title']/following::td/span")
	WebElement profTitleVerify;
	public ViewLeadPage verifyProfTitle(String data) {
		verifyExactText(profTitleVerify, data);
		return this;
	}
}
