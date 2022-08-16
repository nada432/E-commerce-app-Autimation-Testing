package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Pagebase{
    public Homepage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Register")
    WebElement registerbutton;
    @FindBy (linkText ="Log in")
    WebElement loginbutton;
    @FindBy(css = "button.button-1.checkout-as-guest-button")
    WebElement checkoutasguestbtn;

    public void userregister() {
        clickbtn(registerbutton);

    }
    public void userlogin() {

        clickbtn(loginbutton);
    }
    public void userclickoncheckoutasgest(){
        clickbtn(checkoutasguestbtn);
    }
}
