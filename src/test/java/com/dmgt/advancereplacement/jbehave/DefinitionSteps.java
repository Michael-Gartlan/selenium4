package com.dmgt.advancereplacement.jbehave;

import static org.hamcrest.MatcherAssert.assertThat;
import net.thucydides.core.annotations.Steps;

import org.hamcrest.Matchers;
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
		endUser.login("michael.gartlan@dmgmedia.co.uk.systest", "Summer_12");
	}
	
	@When("I navigate to the New Account page with Record Type '$recordType'")
	public void navigateNewAccountPage(String recordType)
			throws InterruptedException {
		endUser.navigateNewAccountPage(recordType);
	}
	
	@When("I create a new Relationship of type Booking")
	public void createNewRelationshipTypeBooking()
			throws InterruptedException {
		endUser.createNewRelationshipBookingToClient();
	}

	@When("I create a new Relationship of type Billing")
	public void createNewRelationshipTypeBilling()
			throws InterruptedException {
		endUser.createNewRelationshipBillingToBooking();
	}
	
	@Then("the relationship is successfully made")
	public void verifyRelationship()
			throws InterruptedException {
		endUser.verifyRelationship();
	}
	
	
	@When("I create a new account")
	public void newAccountButton()
			throws InterruptedException {
		endUser.newAccount();
	}

	@When("I click on Finance Account")
	public void clickFinanceAccount()
			throws InterruptedException {
		endUser.clickFinanceAccount();
	}
	
	@When("I click on Account Mapping")
	public void clickAccountMapping()
			throws InterruptedException {
		endUser.clickAccountMapping();
	}

	@When("I return to Booking Account")
	public void returnToBookingAccount()
			throws InterruptedException {
		endUser.returnToBookingAccount();
	}
	
	@When("I return to Billing Account")
	public void returnToBillingAccount()
			throws InterruptedException {
		endUser.returnToBillingAccount();
	}

	@When("I verify Account Mapping")
	public void checkAccountMapping()
			throws InterruptedException {
		endUser.checkAccountMapping();
	}

	@When("I verify Finance Account")
	public void checkFinanceAccount()
			throws InterruptedException {
		endUser.checkFinanceAccount();
	}
	
	@When("I fill in Mandatory fields for Booking Agency")
	public void fillInMandatoryFieldsForBooking()
			throws InterruptedException {
		endUser.fillInMandatoryFieldsForBooking();
	}
	
	@When("I fill in Mandatory fields for Billing Agency")
	public void fillInMandatoryFieldsForBilling()
			throws InterruptedException {
		endUser.fillInMandatoryFieldsForBilling();
	}
	
	@When("I add Industry Category")
	public void fillInIndustryCategory()
			throws InterruptedException {
		endUser.fillInIndustryCategory();
	}

	@When("I link with CCI")
	public void linkWithCCI()
			throws InterruptedException {
		endUser.createCCICustomerMail();
	}
	
	@When("I fill in Mandatory fields for Advertiser")
	public void fillInMandatoryFieldsForAdvertising()
			throws InterruptedException {
		endUser.fillInMandatoryFieldsForAdvertising();
	}
	
	@Then("page is Saved successfully without Error")
	public void checkPageSavedSuccessfully()
			throws InterruptedException {
		endUser.checkPageSavedSuccessfully();
	}

	@When("I click on Save")
	public void saveForm()
			throws InterruptedException {
		endUser.saveForm();
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

    @Then("the account should be saved without error")
    public void thenTheAccountShouldSaveWithoutError() {
        endUser.save_without_error();
    }
    


}
