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
    
}
