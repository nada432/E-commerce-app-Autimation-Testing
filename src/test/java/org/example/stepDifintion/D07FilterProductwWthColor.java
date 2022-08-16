package org.example.stepDifintion;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.*;

public class D07FilterProductwWthColor extends Hooks{
    String email="nada1894@gmail.com";
    String password="9876543";
    Homepage homeobject;
    Loginpage loginobject;
    Userregisterpage registerobject;
    Myaccountpage myaccountobject;
    Searchforproductpage searchforproductobject;
    Productinformationpage productinformationobject;

    @Given("User register in homepage of website")
    public void user_regist_in_homepage_of_website() {
        homeobject = new Homepage(driver);
        homeobject.userregister();
    }
    @When("User enter personal data to register")
    public void user_enter_personal_data_to_regist() {
        registerobject = new Userregisterpage(driver);
        registerobject.Userenterdata("nada ", "mohamed", email, password);

    }
    @When("User logout")
    public void user_logout() {
        myaccountobject=new Myaccountpage(driver);
        myaccountobject.userlogout();
    }
    @Then("User login in his account")
    public void user_login_in_his_account() {
        homeobject=new Homepage(driver);
        homeobject.userlogin();
        loginobject=new Loginpage(driver);
        loginobject.userenterlogindata(email,password);
    }
    @When("user choose main categorise")
    public void user_choose_main_catagorie() {
        searchforproductobject=new Searchforproductpage(driver);
        searchforproductobject.Maincatagorie();

    }
    @When("User choose sub categorise")
    public void user_choose_sub_catagorie() {
        searchforproductobject=new Searchforproductpage(driver);
        searchforproductobject.Subcatagorie();
    }
    @Then("User filter product with red color")
    public void user_filter_product_with_red_color() {
        productinformationobject=new Productinformationpage(driver);
        productinformationobject.Filterattribute();
    }


}


