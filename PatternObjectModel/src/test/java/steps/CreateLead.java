/*package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {

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
	@And("Click on Create Lead link in Leads Page")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter Company Name in Create Lead Page as (.*)")
	public void enterCompName(String data) {
		driver.findElementById("createLeadForm_companyName").sendKeys(data);;
	}
	@And("Enter First Name in Create Lead Page as (.*)")
	public void enterfName(String data) {
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
	}
	@And("Enter Last Name in Create Lead Page as (.*)")
	public void enterlName(String data) {
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
	}
	@When("Click on Create Lead button in Create Lead Page")
	public void clickCreateLeadButton() {
		driver.findElementByName("submitButton").click();
	}
	@Then("Verify Created Lead Successfully")
	public void verifyCreateLead() {
		System.out.println("Created Lead Successful");
	}
	@But("Create Lead not Successful")
	public void verifyCreateLeadNeg() {
		System.err.println("Not able to create Lead");
	}
	@Then("Close the Browser")
	public void closeBrowser() {
		driver.close();
	}
	
}
*/