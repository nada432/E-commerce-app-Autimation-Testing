package stepDifintion;

import Pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D05SwitchCurrency extends Hooks {
    String email="nada125534@gmail.com";
    String password="9876543";
    Homepage homeobject;
    Loginpage loginobject;
    Userregisterpage registerobject;
    Myaccountpage myaccountobject;
    Searchforproductpage searchforproductobject;



    @Given("user in homepage of website to click on register-link")
    public void user_in_homepage_of_website_to_click_on_registerlink() {
        homeobject = new Homepage(driver);
        homeobject.userregister();

    }
    @When("User enter his data to register")
    public void user_enter_his_data_to_regist() {

        registerobject = new Userregisterpage(driver);
        registerobject.Userenterdata("nada ", "mohamed", email, password);
    }
    @When("user logout")
    public void user_logout() {
        myaccountobject=new Myaccountpage(driver);
        myaccountobject.userlogout();
    }
    @Then("User login in account")
    public void user_login_in_account() {
        homeobject=new Homepage(driver);
        homeobject.userlogin();
        loginobject=new Loginpage(driver);
        loginobject.userenterlogindata(email,password);
    }
    @Then("User switch currency")
    public void user_switch_currency() {
        searchforproductobject=new Searchforproductpage(driver);
        searchforproductobject.switchcurrency();



    }
}


