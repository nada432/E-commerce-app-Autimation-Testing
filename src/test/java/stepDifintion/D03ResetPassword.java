package stepDifintion;

import Pages.Homepage;
import Pages.Loginpage;
import Pages.Myaccountpage;
import Pages.Userregisterpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D03ResetPassword extends Hooks{
    String email="nurhan187@gmail.com";
    String password="9876543";
    String oldpassword=password;
    String newpassword="186181964";

    Homepage homeobject;
    Loginpage loginobject;
    Userregisterpage registerobject;
    Myaccountpage myaccountobject;


    @Given("user in homepage to click on registerlink")
    public void user_in_homepage_to_click_on_registerlink() {

        homeobject = new Homepage(driver);
        homeobject.userregister();

    }
    @When("enter user data")
    public void enter_user_data() {
        registerobject = new Userregisterpage(driver);
        registerobject.Userenterdata("nada ", "mohamed", email, password);

    }
    @Then("User logout from website")
    public void user_logout_from_website() {
        myaccountobject=new Myaccountpage(driver);
        myaccountobject.userlogout();
    }
    @When("click on loginlink")
    public void click_on_loginlink() {
        homeobject=new Homepage(driver);
        homeobject.userlogin();
    }
    @Then("user enter login data")
    public void user_enter_login_data() {
        loginobject=new Loginpage(driver);
        loginobject.userenterlogindata(email,password);

    }

    @Then("user click on myaccountlink")
    public void user_click_on_myaccountlink() {
        myaccountobject=new Myaccountpage(driver);
        myaccountobject.myaccount();
    }
    @When("user click on changepasswordlink to reset password")
    public void user_click_on_changepasswordlink() {
        myaccountobject=new Myaccountpage(driver);
        myaccountobject.userresetpassword(oldpassword,newpassword,newpassword);
    }

    @Then("reset password sucessfully")
    public void reset_password_sucessfully() {
        myaccountobject=new Myaccountpage(driver);
        myaccountobject.assertionofresetpassword();

    }
}


