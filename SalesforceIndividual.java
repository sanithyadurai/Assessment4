package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.PsMethods;
import com.leaftaps.pages.LoginPage;




	public class SalesforceIndividual extends PsMethods{

		 @BeforeTest
	        public void setOppvalue() {
	            testcaseName = "Create Individual";
	            testDescription ="Create and Verify new Individual";
	            authors="Chinna";
	            category ="Smoke";
	            excelFileName = "SFIndividuals";
	        }
	    
	    @Test(dataProvider = "fetchData")
	    public void createOpportunity(String username, String password, String searchValue, String surName, String salutation, String firstName, String fullName) {
	        new LoginPage()
	        .enterUsername(username)
	        .enterPassword(password)
	        .clickLogin()
	        .verifyHomePage()
	        .clickToggleMenn()
	        .searchAndClickInd(searchValue)
	        .clickNew()
	        .enterSurName(surName)
	        .validateSurName(surName)
	        .clickEdit()
	        .selectSalutation(salutation)
	        .enterFirstName(firstName)
	        .validateFullName(fullName);
	        

	   }

	}
