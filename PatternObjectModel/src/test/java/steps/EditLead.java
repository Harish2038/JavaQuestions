/*package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditLead {
public static RemoteWebDriver driver;
	
	@Given("Open the Browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\Test Leaf\\Workspace Test Leaf\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("Load the URL")
	public void LoadURL() {
		driver.get("http://leaftaps.com/opentaps");
	}
	@And("Enter Username as (.*)")
	public void enterUserName(String data) {
		driver.findElementById("username").sendKeys(data);
	}
	@And("Enter Password as (.*)")
	public void enterPassword(String data) {
		driver.findElementById("password").sendKeys(data);
	}
	@And("Click on Login button in Login Page")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("Click on CRM/SFA link in Home Page")
	public void clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("Click on Leads link in My Home Page")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();
	}
	@And("Click on Find Lead link in Leads Page")
	public void clickFindLead() {
		driver.findElementByLinkText("Find Lead").click();
	}
	@And("Enter First Name in Find by section in Find Lead Page as (.*)")
	public void enterfName(String data) {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(data);
	}
	@And("Click on Find Leads button in Find Lead Page")
	public void ClickFindLeadsButton() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	}
	@And("Click on Lead ID link")
	public void ClickLeadID() {
		driver.findElementByLinkText("10429").click();
	}
	@And("Click on Edit Lead link in View Lead Page")
	public void ClickEditLead() {
		driver.findElementByLinkText("Edit").click();
	}
	@And("Clear Last Name in Edit Lead Page")
	public void ClearLastName() {
	driver.findElementById("updateLeadForm_lastName").clear();
	}
	@And("Enter Last Name in Edit Lead Page as (.*)")
	public void EditLastName(String data) {
	driver.findElementById("updateLeadForm_lastName").sendKeys(data);;
	}
	@When("Click on Update button in Edit Lead Page")
	public void ClickUpdateButton() {
		driver.findElementByName("submitButton").click();
	}
	@Then("Close the Browser")
	public void closeBrowser() {
		driver.close();
	}
}
*/