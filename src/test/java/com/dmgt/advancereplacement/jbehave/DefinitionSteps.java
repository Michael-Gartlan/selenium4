package com.dmgt.advancereplacement.jbehave;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.dmgt.advancereplacement.steps.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Salesforce home page")
    public void givenTheUserIsOnTheSalesforceHomePage() {
        endUser.is_the_home_page();
    }

	@When("I login to glue as Mail user")
	public void login()
			throws InterruptedException {
		endUser.login("michael.gartlan@dmgmedia.co.uk.mailuser.uat", "Summer_12");
	}

	
	
	@When("I navigate to the New Account page with Record Type '$recordType'")
	public void navigateNewAccountPage(String recordType)
			throws InterruptedException {
		endUser.navigateNewAccountPage(recordType);
	}
	
	@When("I create a new account")
	public void newAccountButton()
			throws InterruptedException {
		endUser.newAccount();
	}
	
	@When("I fill in Mandatory fields for Booking Agency")
	public void fillInMandatoryFieldsForBooking()
			throws InterruptedException {
		endUser.fillInMandatoryFieldsForBooking();
	}
	
	
	@When("I select Account Type as '$type'")
	public void selectType(String type)
			throws InterruptedException {
		endUser.selectType(type);
	}
	
    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }
    


}
