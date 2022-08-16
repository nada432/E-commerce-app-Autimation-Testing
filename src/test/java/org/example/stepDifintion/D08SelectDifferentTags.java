package org.example.stepDifintion;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.*;

public class D08SelectDifferentTags extends Hooks{
    String email="nada444@gmail.com";
    String password="9876543";
    String productname="Apple MacBook Pro 13-inch";
    Homepage homeobject;
    Loginpage loginobject;
    Userregisterpage registerobject;
    Myaccountpage myaccountobject;
    Searchforproductpage searchforproductobject;
    Productinformationpage productinformationobject;
    @Given("user register")
    public void user_register() {
        homeobject = new Homepage(driver);
        homeobject.userregister();
        registerobject = new Userregisterpage(driver);
        registerobject.Userenterdata("nada ", "mohamed", email, password);
    }
    @When("User logout from register account")
    public void user_logout_from_register_account() {
        myaccountobject=new Myaccountpage(driver);
        myaccountobject.userlogout();
    }
    @When("user login in account")
    public void user_login_in_account() {
        homeobject=new Homepage(driver);
        homeobject.userlogin();
        loginobject=new Loginpage(driver);
        loginobject.userenterlogindata(email,password);
    }
    @Then("User search about product")
    public void user_search_about_product() {
        searchforproductobject=new Searchforproductpage(driver);
        searchforproductobject.searchforproduct(productname);
    }
    @Then("select different tags")
    public void select_different_tags() {
      productinformationobject=new Productinformationpage(driver);
      productinformationobject.selectdifferenttags();
    }


}
