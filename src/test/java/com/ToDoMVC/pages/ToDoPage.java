package com.ToDoMVC.pages;

import com.ToDoMVC.utils.ConfigurationReader;
import com.ToDoMVC.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToDoPage {

    public ToDoPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(tagName = "input")
    public WebElement toDoInputBox;

    @FindBy(id = "edit")
    public WebElement inputBoxToBeEdited;

    public WebElement chooseItem(int itemNumber){
        return Driver.get().findElement(By.xpath("(//label[@class='style-scope td-item'])["+itemNumber+"]"));
    }

    public void editItem(int itemNumber, String newContent){
        Actions actions = new Actions(Driver.get());
        actions.doubleClick(chooseItem(itemNumber)).perform();
        inputBoxToBeEdited.sendKeys(Keys.CONTROL + "a" + Keys.BACK_SPACE);
        inputBoxToBeEdited.sendKeys(newContent + Keys.ENTER);
    }
}
