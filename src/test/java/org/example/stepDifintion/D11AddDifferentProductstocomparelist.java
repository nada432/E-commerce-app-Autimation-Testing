package org.example.stepDifintion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.*;

public class D11AddDifferentProductstocomparelist extends Hooks {

    String email = "nada8888@gmail.com";
    String password = "9876543";
    Homepage homeobject;
    Loginpage loginobject;
    Myaccountpage myaccountobject;
    Userregisterpage registerobject;
    Searchforproductpage searchforproductobject;



    @Given("User click on  register link to register")
    public void user_click_on_register_link_to_register() {
        homeobject = new Homepage(driver);
        homeobject.userregister();
        registerobject = new Userregisterpage(driver);
        registerobject.Userenterdata("nada ", "mohamed", email, password);

    }

    @When("User logout from his register account")
    public void user_logout_from_his_register_account() {
        myaccountobject = new Myaccountpage(driver);
        myaccountobject.userlogout();
    }

    @Then("User login in  his account in website")
    public void user_login_in_his_account_in_website() {
        homeobject = new Homepage(driver);
        homeobject.userlogin();
        loginobject = new Loginpage(driver);
        loginobject.userenterlogindata(email, password);
    }

    @When("User search for first product {string}")
    public void userSearchForFirstProduct(String product1) {
        searchforproductobject = new Searchforproductpage(driver);
        searchforproductobject.searchforproduct(product1);
    }

    @When("User click on add compare list btn")
    public void user_click_on_add_compare_list_btn() {
        searchforproductobject = new Searchforproductpage(driver);
        searchforproductobject.Addtocomparelist();
    }

    @When("Assert that first product added to compare list")
    public void assert_that_first_product_added_to_compare_list() {
        searchforproductobject = new Searchforproductpage(driver);
        searchforproductobject.Addtocomparelistsuccessfully();
    }

    @Then("User search for second product {string}")
    public void user_search_for_second_product(String product2) {
        searchforproductobject = new Searchforproductpage(driver);
        searchforproductobject.searchforproduct(product2);
    }

    @Then("User click on add compare list")
    public void user_click_on_add_compare_list() {
        searchforproductobject = new Searchforproductpage(driver);
        searchforproductobject.Addtocomparelist();
    }

    @Then("Assert that second product added to compare list")
    public void assert_that_second_product_added_to_compare_list() {
        searchforproductobject = new Searchforproductpage(driver);
        searchforproductobject.Addtocomparelistsuccessfully();
    }


}