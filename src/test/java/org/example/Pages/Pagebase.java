package org.example.Pages;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pagebase   {
    protected WebDriver driver ;
    JavascriptExecutor jes;
    public Actions action;
    public Pagebase (WebDriver driver)
    {
        PageFactory.initElements(driver, this);

    }
    protected static void clickbtn (WebElement button) {
        button.click();

    }
    protected static void sendtext(WebElement textelement ,String value)
    {
        textelement.sendKeys(value);

    }
    protected  static void dropdown (WebElement selection ,int num) {
        Select selection1 =new Select(selection);
        selection1.selectByIndex(num);
    }
    public void scroldwon() {
        jes.executeScript("scrollBy(0,1500)");
    }
}


