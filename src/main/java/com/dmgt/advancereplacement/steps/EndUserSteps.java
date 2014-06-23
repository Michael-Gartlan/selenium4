package com.dmgt.advancereplacement.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;

import com.dmgt.advancereplacement.pages.AccountsPage;

import static org.fest.assertions.Assertions.assertThat;

public class EndUserSteps extends ScenarioSteps {

    AccountsPage accountsPage;

    @Step
    public void enters(String keyword) {
    	accountsPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
    	accountsPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(accountsPage.getDefinitions()).contains(definition);
    }

    @Step
    public void is_the_home_page() {
    	accountsPage.open();
    }
    
    @Step
    public void login(String username, String password) {
    	accountsPage.enterUserName(username);
    	accountsPage.enterPassword(password);
    	accountsPage.login();
	}

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    } 
    
    
    
	public void newAccount() {
		accountsPage.newAccount();
		accountsPage.newAccountChild();
		
		
//		recordType.sendKeys("Agency");
//		
//		continueButton.click();	
//		
////		salutation.sendKeys("Mr.");
////		firstName.sendKeys("firstName");
//		accountName.sendKeys("MyNewAccount");
//		parentAccount.sendKeys("Mike - Client");
//		phone.sendKeys("07432471793");
//		website.sendKeys("http://www.parcelflow.co.uk");
//		employees.sendKeys("101");
//		companyRegistration.sendKeys("abcdefghij");
//		description.sendKeys("This is a description field");
//		
////		classifiedMainCategory.sendKeys("Health");
//
//		
//		correspondanceStreet.sendKeys("11 Felix Avenue");
//		correspondanceCity.sendKeys("Dallas");
//		
//		type.sendKeys("Client");
//
//		correspondanceState.sendKeys("Texas");
//		correspondanceZip.sendKeys("75204");
//		correspondanceCountry.sendKeys("USA");
//		
//		
//		billingStreet.sendKeys("5 McKinney Ave");
//		billingCity.sendKeys("Dallas");
//		billingState.sendKeys("Texas");
//		billingPostCode.sendKeys("75204");
//		billingCountry.sendKeys("USA");
//		saveButton.click();
		
		
	}

    
    
    
    
}
