package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods {
	
	public MyHomePage(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT, using="Leads")
	WebElement eleLeadsButton;
	@And("Click on Leads link in My Home Page")
	public MyLeadsPage clickLeadsButton()
	{
		click(eleLeadsButton);
		return new MyLeadsPage();
	}

}
