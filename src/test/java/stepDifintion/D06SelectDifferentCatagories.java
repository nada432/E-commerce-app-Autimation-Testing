package stepDifintion;

import Pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D06SelectDifferentCatagories  extends Hooks{
    String email="nada16874@gmail.com";
    String password="9876543";
    Homepage homeobject;
    Loginpage loginobject;
    Userregisterpage registerobject;
    Myaccountpage myaccountobject;
    Searchforproductpage searchforproductobject;

    @Given("User in homepage to click on register-link")
    public void user_in_homepage_to_click_on_registerlink() {
        homeobject = new Homepage(driver);
        homeobject.userregister();
    }
    @When("User enter registration data")
    public void user_enter_registration_data() {
        registerobject = new Userregisterpage(driver);
        registerobject.Userenterdata("nada ", "mohamed", email, password);
    }
    @When("User logout from account")
    public void user_logout_from_account() {
        myaccountobject=new Myaccountpage(driver);
        myaccountobject.userlogout();
    }
    @Then("User login to his account")
    public void user_login_to_his_account() {
        homeobject=new Homepage(driver);
        homeobject.userlogin();
    }
    @When("User enter login data")
    public void user_enter_login_data() {
        loginobject=new Loginpage(driver);
        loginobject.userenterlogindata(email,password);
    }
    @When("user Select main categorise")
    public void user_select_main_catagorie() {
        searchforproductobject=new Searchforproductpage(driver);
        searchforproductobject.Maincatagorie();

    }
    @Then("user select sub categorise")
    public void user_select_sub_catagoeie() {
        searchforproductobject=new Searchforproductpage(driver);
        searchforproductobject.Subcatagorie();

    }
}
