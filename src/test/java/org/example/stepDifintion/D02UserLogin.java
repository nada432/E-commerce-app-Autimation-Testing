package org.example.stepDifintion;

import org.example.Pages.Homepage;
import org.example.Pages.Loginpage;
import org.example.Pages.Myaccountpage;
import org.example.Pages.Userregisterpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D02UserLogin extends Hooks {
    String email="nada1234@gmail.com";
    String password="9876543";
    Homepage homeobject;
    Loginpage loginobject;
    Userregisterpage registerobject;
    Myaccountpage myaccountobject;


    @Given("User in homepage to register")
    public void user_in_homepage_to_regist() {
        homeobject = new Homepage(driver);
        homeobject.userregister();
    }
    @When("user enter data")
    public void i_entered_user_data() {
        registerobject = new Userregisterpage(driver);
        registerobject.Userenterdata("nada ", "mohamed", email, password);

    }
    @When("user click on logout link")
    public void user_click_on_logoutlink() {
        myaccountobject=new Myaccountpage(driver);
        myaccountobject.userlogout();
    }
    @Then("User go back to homepage to login")
    public void user_go_back_to_homepage_to_login() {
        homeobject=new Homepage(driver);
        homeobject.userlogin();
    }
    @When("user enter his data")
    public void user_entered_his_data() {
        loginobject=new Loginpage(driver);
        loginobject.userenterlogindata(email,password);
    }
    @When("The account page display successfully")
    public void the_account_page_display_successfully() {
        Assert.assertTrue(driver.getCurrentUrl().contains("demo"));
    }
}

