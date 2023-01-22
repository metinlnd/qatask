package com.ToDoMVC.pages;

import com.ToDoMVC.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public LandingPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public void navigateToTab(String tab){
        Driver.get().findElement(By.xpath("//div[.='"+tab+"']")).click();
    }

    public void selectFramework(String frameworkName){
        Driver.get().findElement(By.linkText(frameworkName)).click();
    }
}
