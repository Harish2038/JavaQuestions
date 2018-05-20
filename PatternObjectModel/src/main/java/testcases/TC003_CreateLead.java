package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create a Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Harish";
		browserName="chrome";
		dataSheetName="TC003";
	}	
	
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String fName,String lName, String cName) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeadsButton()
		.clickCreateLead()
		.typeFirstName(fName)
		.typeLastName(lName)
		.typeCompanyName(cName)
		.clickCreateLeadButton()
		.VerifyFirstName(fName);
}
}