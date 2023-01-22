package com.ToDoMVC.stepDefinitions;

import com.ToDoMVC.pages.LandingPage;
import com.ToDoMVC.pages.ToDoPage;
import com.ToDoMVC.utils.ConfigurationReader;
import com.ToDoMVC.utils.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDoStepDefs {

    LandingPage landingPage = new LandingPage();
    ToDoPage toDoPage = new ToDoPage();
    Faker faker = new Faker();

    @Given("the user navigates to the {string}")
    public void the_user_navigates_to_the(String pageUrl) {
        Driver.get().get(ConfigurationReader.get(pageUrl));
    }
    @Given("clicks the {string} tab")
    public void clicks_the_tab(String tabName) {
        landingPage.navigateToTab(tabName);
    }
    @Given("selects the framework as {string}")
    public void selects_the_framework_as(String frameworkName) {
        landingPage.selectFramework(frameworkName);
    }
    @When("the user adds {int} ToDo items")
    public void the_user_adds_to_do_items(Integer numberOfItems) {
        for (int i = 0; i < numberOfItems; i++) {
            toDoPage.toDoInputBox.sendKeys(faker.chuckNorris().fact() + Keys.ENTER);
        }
    }
    @When("edits the item {int}")
    public void edits_the_item(Integer itemNumber) {
        toDoPage.editItem(itemNumber, ConfigurationReader.get("toDoItem#3"));
    }
}
