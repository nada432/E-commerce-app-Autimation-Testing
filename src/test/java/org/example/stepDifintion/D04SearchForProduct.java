package org.example.stepDifintion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.*;
import org.testng.Assert;

public class D04SearchForProduct extends Hooks{
    String email="nada122@gmail.com";
    String password="9876543";
    String productname="Apple MacBook Pro 13-inch";
    Homepage homeobject;
    Loginpage loginobject;
    Myaccountpage myaccountobject;
    Userregisterpage registerobject;
    Searchforproductpage searchforproductobject;

    @Given("User click on registlink in homepage")
    public void user_click_on_registlink_in_homepage() {
        homeobject = new Homepage(driver);
        homeobject.userregister();

    }
    @When("user enter registration data")
    public void user_enter_registion_data() {
        registerobject = new Userregisterpage(driver);
        registerobject.Userenterdata("nada ", "mohamed", email, password);
    }
    @When("user logout from account")
    public void user_logout_from_account() {
        myaccountobject=new Myaccountpage(driver);
        myaccountobject.userlogout();
    }

    @When("user click on loginlink")
    public void user_click_on_loginlink() {
        homeobject=new Homepage(driver);
        homeobject.userlogin();
    }
    @Then("User enter his data")
    public void user_enter_his_data() {
        loginobject=new Loginpage(driver);
        loginobject.userenterlogindata(email,password);
    }
    @Then("user search for product")
    public void user_search_for_product() {
        searchforproductobject=new Searchforproductpage(driver);
        searchforproductobject.searchforproduct(productname);
    }
    @Then("User click in searchbtn")
    public void user_click_in_searchbtn() {
        Assert.assertTrue(driver.getCurrentUrl().contains("Apple"));

    }
}


