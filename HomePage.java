package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.PsMethod;

public class HomePage extends PsMethod{
	

	
	public SFIndividualPage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.CLASS_NAME, "slds-icon-waffle"));
		reportStep("Homepage is loaded", "pass");
		return new SFIndividualPage();
	}
	

}
