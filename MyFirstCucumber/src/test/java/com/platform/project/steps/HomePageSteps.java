package com.platform.project.steps;


import com.platform.project.commons.Commons;
import com.platform.project.commons.ReadPropertyFile;
import com.platform.project.commons.WebDriverManager;
import com.platform.project.pageObjects.HomePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;


public class HomePageSteps {
    WebDriver driver;
    HomePage homeP;
    WebDriverManager webDriverManager;

    @Before
    public void setUp(){
        //Open Browser <=> initializing the webdriver
        webDriverManager = new WebDriverManager();
        //driver = webDriverManager.getDriver( ReadPropertyFile.getConfigPropertyVal("broswer"));
        driver = webDriverManager.getDriver( Commons.createEnvVariable("browser", ReadPropertyFile.getConfigPropertyVal("browser")));
        homeP = new HomePage(driver);
    }

    @After
    public void cleanUp(){
        driver.quit();
    }


    @Given("^I open my Home Page$")
    public void openHomePage(){
        homeP.openHomePage();
    }

    @Then("^Check the home page title is correct$")
    public void verifyHomePageTitle(){
        Commons.check(driver,homeP.getTitle().equals("Welcome to iBusiness"),"Home Page did not match ");
    }

    @Then("^Check the home page title is correct2$")
    public void verifyHomePageTitle2(){
        Commons.check(driver,homeP.getTitle().equals("Welcome to iBusiness2"),"Home Page did not match ");
    }

    @Then("^Check that the home page title is (.*)$")
    public void verifyHomePageTitle3(String expectedTitle){
        Commons.check(driver,homeP.getTitle().equals(expectedTitle),"Home Page did not match ");
    }
}

