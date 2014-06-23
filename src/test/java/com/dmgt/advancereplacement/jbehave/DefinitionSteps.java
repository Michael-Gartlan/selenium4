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

	@When("I login with username <username> and password <password>")
	public void login(@Named("username") String username, @Named("password") String password)
			throws InterruptedException {
		endUser.login(username, password);
	}
    
	@When("I create a new account")
	public void newAccountButton()
			throws InterruptedException {
		endUser.newAccount();
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
