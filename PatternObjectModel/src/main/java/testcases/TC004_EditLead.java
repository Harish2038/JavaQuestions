package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit a Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Harish";
		browserName="chrome";
		dataSheetName="TC004";
	}	
	
	@Test(dataProvider="fetchData")
	public void EditLead(String uName,String pwd,String fName,String pTitle) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeadsButton()
		.clickFindLeads()
		.typeFirstName(fName)
		.clickFindLeadButton()
		.clickleadID()
		.clickEditLead()
		.typeProfileTitle(pTitle)
		.clickUpdateButton()
		.verifyProfTitle(pTitle);
}
}
