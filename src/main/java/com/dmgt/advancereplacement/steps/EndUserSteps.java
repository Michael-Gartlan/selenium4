package com.dmgt.advancereplacement.steps;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

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
    public void save_without_error() {
//        assertThat(dictionaryPage.getDefinitions()).contains(definition);
    	assertThat(accountsPage.getResult()).isEqualTo(0);
    }
    
    @Step
    public void checkCustRef() {
//        assertThat(dictionaryPage.getDefinitions()).contains(definition);
//    	assertThat(accountsPage.verifyNumeric()).isEqualTo(0);
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

    
    
    
    @Step
	public void selectType(String mytype) {   
    	
    	accountsPage.type(mytype);						
	}

    
    

    @Step
	public void newAccount() {
    	
    	accountsPage.clickLinkNewAccount();
		accountsPage.newAccount();
		accountsPage.newAccountChild();
		accountsPage.recordType("Agency");
		accountsPage.continueButton();
		accountsPage.accountName("MyNewAccount");
		accountsPage.parentAccount("Mike - Client");

		//		
////		salutation.sendKeys("MyNewAccount.");
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

    @Step
	public void fillInMandatoryFieldsForBooking() { 
    	
		accountsPage.accountName("AUTOBOOKING" + accountAppend());			
	}
    
    public int accountAppend()
    {
    	Random rand = new Random();
   		return rand.nextInt(900) + 10;		
    }

    @Step
	public void fillInMandatoryFieldsForBilling() {   
		accountsPage.accountName("AUTOBILLING" + accountAppend());	
		accountsPage.phoneNumber("123123123123");
		accountsPage.billingStreet("AnyStreet");
		accountsPage.postCode("BT60JH");
	}
    
    @Step
	public void fillInIndustryCategory() {
    	waitMillis(20000);
    	accountsPage.editIndustryCategory();
    	
    }
    
    @Step
	public void clickAccountMapping() {    	
		accountsPage.accountMapping();	
	}
    
    @Step
    public void clickFinanceAccount() {    	
		accountsPage.financeAccount();	
	}
    
    @Step
	public void returnToBookingAccount() {    	
		accountsPage.accountMappingBookingLink();	
	}

    @Step
	public void returnToBillingAccount() {    	
		accountsPage.accountMappingBillingLink();	
	}
    
    @Step
    public void checkAccountMapping() {    	
		assertThat(accountsPage.getCustomerRef()).matches("\\d+");	
	}
	
    @Step
    public void checkFinanceAccount() {    	
		assertThat(accountsPage.getSOPID()).matches("\\d+");	
	}    
    
    @Step
    public void createCCICustomerMail()
    {
    	accountsPage.createCCICustomerMail();
		WebDriver browser3 = getDriver();
		Alert alt = browser3.switchTo().alert();
		System.out.println("Prefab Sprouts " + alt.getText());
		alt.accept();
		
		waitMillis(8000);
		
		alt = browser3.switchTo().alert();
		System.out.println("Prefab Sprouts " + alt.getText());
		alt.accept();

    }
    
    
    public static void waitMillis(long waitTimeMillis) {
        long startTimeMillis = System.currentTimeMillis();
        long finishTimeMillis = startTimeMillis + waitTimeMillis;
        long waitLength;
        while ((waitLength = finishTimeMillis - System.currentTimeMillis()) > 0) {
            try {
                Thread.sleep(waitLength);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    @Step
	public void fillInMandatoryFieldsForAdvertising() {
    	accountsPage.accountName("AUTOADVERTISER" + accountAppend());
    	accountsPage.firstName("Michael");
    	accountsPage.phoneNumber("01234567890");
    	accountsPage.salutation("M");
    	accountsPage.billingStreet("Any Street");
    	accountsPage.postCode("BT60JH");
    }
    
    @Step
	public void saveForm() {    	
		accountsPage.saveForm();			
	}

    @Step
	public void checkPageSavedSuccessfully() {    	
		accountsPage.checkPageSavedSuccessfully("MyNewAccount");			
	}
    
    @Step
	public void createNewRelationshipBillingToBooking()
    {
    	accountsPage.createNewRelationshipBillingToBooking();    	
    }
    
    @Step
	public void createNewRelationshipBookingToClient()
    {
    	accountsPage.createNewRelationshipBookingToClient();    	
    }
    
    @Step
	public void verifyRelationship()
    {
    	
    	assertThat(accountsPage.verifyRelationship().matches("XYZABC"));
    }
    
    @Step
	public void navigateNewAccountPage(String recordType) {
    	
    	accountsPage.clickLinkNewAccount();
//    	accountsPage.clickExistingAccount();
		accountsPage.newAccount();
		accountsPage.newAccountChild();
		accountsPage.recordType(recordType);
		accountsPage.continueButton();

		//		
////		salutation.sendKeys("MyNewAccount.");
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
