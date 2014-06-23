package com.dmgt.advancereplacement.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;



import org.openqa.selenium.support.FindBy;





import net.thucydides.core.pages.WebElementFacade;
//import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("https://test.salesforce.com")
public class AccountsPage extends PageObject {

    @FindBy(name="search")
    private WebElementFacade searchTerms;

    @FindBy(name="go")
    private WebElementFacade lookupButton;
    
	@FindBy(how = How.CSS, using = "input[name='q']")
	private WebElement searchField;

	@FindBy(how = How.CSS, using = "input[name='username']")
	private WebElement userName;
	
	@FindBy(how = How.CSS, using = "input[name='pw']")
	private WebElement myPassword;

	@FindBy(how = How.XPATH, using = "//td[contains(label, 'Record Type of new record')]/following-sibling::td[1]/div/select")
	private WebElement recordType;
	
	@FindBy(how = How.XPATH, using = "//td[label='FirstName']/following-sibling::td[1]/input")
	private WebElement firstName;

	@FindBy(how = How.XPATH, using = "//td[contains(label,'Account Name')]/following-sibling::td[1]//input")
	private WebElement accountName;
	
	@FindBy(how = How.XPATH, using = "//td[contains(label,'Parent Account')]/following-sibling::td[1]/span/input")
	private WebElement parentAccount;

	@FindBy(how = How.XPATH, using = "//td[label='Phone']/following-sibling::td[1]/input")
	private WebElement phone;

	@FindBy(how = How.XPATH, using = "//td[label='Website']/following-sibling::td[1]/input")
	private WebElement website;

	@FindBy(how = How.XPATH, using = "//td[label='Employees']/following-sibling::td[1]/input")
	private WebElement employees;

	
	@FindBy(how = How.XPATH, using = "//td[label='Company Registration']/following-sibling::td[1]/input")
	private WebElement companyRegistration;
	
	@FindBy(how = How.XPATH, using = "//td[label='Description']/following-sibling::td[1]/textarea")
	private WebElement description;

	@FindBy(how = How.XPATH, using = "//td[label='Correspondence Street']/following-sibling::td[1]/textarea")
	private WebElement correspondanceStreet;

	@FindBy(how = How.XPATH, using = "//td[label='Correspondence City']/following-sibling::td[1]/input")
	private WebElement correspondanceCity;
	
	@FindBy(how = How.ID, using = "acc6")
	private WebElement type;

	@FindBy(how = How.XPATH , using = "//td[label='Salutation']/following-sibling::td[1]/span/select")
	private WebElement salutation;
	
	@FindBy(how = How.XPATH, using = "//td[label='Correspondence State/Province']/following-sibling::td[1]/input")
	private WebElement correspondanceState;

	@FindBy(how = How.XPATH, using = "//td[label='Correspondence Zip/Postal Code']/following-sibling::td[1]/input")
	private WebElement correspondanceZip;

	@FindBy(how = How.XPATH, using = "//td[label='Correspondence Country']/following-sibling::td[1]/input")
	private WebElement correspondanceCountry;
	
	@FindBy(how = How.XPATH , using = "//td[label='Classified - Main Category']/following-sibling::td[1]/span/select")
	private WebElement classifiedMainCategory;
	
	@FindBy(how = How.XPATH , using = "//td[label='Classified - Sub Category']/following-sibling::td[1]/span/select")
	private WebElement finance;
	
	@FindBy(how = How.XPATH, using = "//td[label='Billing Street']/following-sibling::td[1]/textarea")
	private WebElement billingStreet;
	
	@FindBy(how = How.XPATH, using = "//td[label='Billing City']/following-sibling::td[1]/input")
	private WebElement billingCity;

	@FindBy(how = How.XPATH, using = "//td[label='Billing State/Province']/following-sibling::td[1]/input")
	private WebElement billingState;

	@FindBy(how = How.XPATH, using = "//td[label='Billing Zip/Postal Code']/following-sibling::td[1]/input")
	private WebElement billingPostCode;

	@FindBy(how = How.XPATH, using = "//td[label='Billing Country']/following-sibling::td[1]/input")
	private WebElement billingCountry;
	
	@FindBy(how = How.CSS, using = "span.lsbb > input")
	private WebElement searchButton;

	@FindBy(how = How.CSS, using = "button[name='Login']")
	private WebElement loginButton;

	// Order Creation
	
	@FindBy(how = How.CSS, using = "input[value=' New ']")
	private WebElement newAccountButton;

	
	@FindBy(how = How.XPATH, using = "id('j_id0:j_id1:i:f:pb:pbb:bottom:next')")
	private WebElement next;

	@FindBy(how = How.CSS, using = "input[value='Finish']")
	private WebElement finish;
	
	@FindBy(how = How.CSS, using = "//td[div='DM Default']")
	private WebElement DMDefault;
	
	@FindBy(how = How.CSS, using = "//div[label='PO number']/div/div/input")
	private WebElement PONumber;

	@FindBy(how = How.CSS, using = "//div[label='Order note']/div/textarea")
	private WebElement orderNote;
	
	@FindBy(how = How.CSS, using = "//div[label='Urgent note']/div/textarea")
	private WebElement urgentNote;
	
	@FindBy(how = How.CSS, using = "//div[label='Caller name']/div/input")
	private WebElement callerName;
	
	@FindBy(how = How.CSS, using = "//div[label='Caller phone']/div/input")
	private WebElement callerPhone;	
	
	@FindBy(how = How.CSS, using = "//div/label='Responsible Salesperson'/div/select")
	private WebElement responsibleSalesperson;		
	
	@FindBy(how = How.CSS, using = "//div/label='Order status'/div/select")
	private WebElement orderStatus;			
	
	@FindBy(how = How.CSS, using = "//div/label='Publication'/div/select")
	private WebElement publication;
	
	@FindBy(how = How.CSS, using = "//div/label='Publication'/div/select")
	private WebElement section;
	
	@FindBy(how = How.CSS, using = "//div/label='Publication'/div/select")
	private WebElement subsection;
	
	@FindBy(how = How.CSS, using = "//div/label='Publication'/div/select")
	private WebElement zones;
	
	@FindBy(how = How.CSS, using = "//div/label='Module'/div/div/select")
	private WebElement module;
	
	@FindBy(how = How.CSS, using = "input[value='New Account']")
	private WebElement newAccountButtonChild;
	
	@FindBy(how = How.CSS, using = "input[value='Continue']")
	private WebElement continueButton;
	
	@FindBy(how = How.CSS, using = "input[value=' Save ']")
	private WebElement saveButton;
	
	@FindBy(how = How.LINK_TEXT, using = "Home")
	private WebElement home;

	@FindBy(how = How.LINK_TEXT, using = "Chatter")
	private WebElement chatter;
	
	@FindBy(how = How.LINK_TEXT, using = "Leads")
	private WebElement leads;
	
	@FindBy(how = How.LINK_TEXT, using = "Accounts")
	private WebElement accounts;
	
	@FindBy(how = How.LINK_TEXT, using = "FriDirectADvertiser400")
	private WebElement newAdvertiser;
	
	@FindBy(how = How.LINK_TEXT, using = "Media Leads")
	private WebElement mediaLeads;

	@FindBy(how = How.LINK_TEXT, using = "Contacts")
	private WebElement contacts;
	
	@FindBy(how = How.LINK_TEXT, using = "Pitch Hub")
	private WebElement pitchHub;

	@FindBy(how = How.LINK_TEXT, using = "Campaigns")
	private WebElement campaigns;
	
	@FindBy(how = How.LINK_TEXT, using = "Dashboards")
	private WebElement dashboards;

	@FindBy(how = How.LINK_TEXT, using = "Documents")
	private WebElement documents;
		
	@FindBy(how = How.CSS, using = "input[value='Create CCI Customer-Mail']")
	private WebElement createCCICustomerMail;

	@FindBy(how = How.CSS, using = "input[value='Create CCI Customer-Metro']")
	private WebElement createCCICustomerMetro;

	@FindBy(how = How.CSS, using = "input[value='Edit']")
	private WebElement Edit;
	
	@FindBy(how = How.CSS, using = "input[value='Create Direct Order']")
	private WebElement createDirectOrder;


    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }

    public void lookup_terms() {
        lookupButton.click();
    }
    
    public void enterUserName(String username) {
    	userName.sendKeys(username);
    }

    public void enterPassword(String password) {
    	myPassword.sendKeys(password);
    }

    public void login() {
    	loginButton.click();
    }
    
    public void newAccount() {
    	newAccountButton.click();
    }

    public void clickLinkNewAccount() {
    	accounts.click();
    }
    
    public void newAccountChild() {
    	newAccountButtonChild.click();
    }
    
    public void recordType(String type) {
    	recordType.sendKeys(type);
    }

    
    public void accountName(String name) {
    	accountName.sendKeys(name);
    }
    
    public void parentAccount(String name) {
    	parentAccount.sendKeys(name);
    }
    
    public void continueButton() {
    	continueButton.click();
    }
    
    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        List<WebElement> results = definitionList.findElements(By.tagName("li"));
        return convert(results, toStrings());
    }

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}