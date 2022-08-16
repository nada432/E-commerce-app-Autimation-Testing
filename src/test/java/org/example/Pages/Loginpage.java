package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Pagebase{

    public Loginpage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="Email")
    WebElement emailtext;
    @FindBy(id="Password")
    WebElement passwordtext;

    @FindBy(css="button.button-1.login-button")
    WebElement loginbtn;

    public void userenterlogindata(String email, String password ){
        sendtext(emailtext,email);
        sendtext(passwordtext,password);
        clickbtn(loginbtn);

    }


}
