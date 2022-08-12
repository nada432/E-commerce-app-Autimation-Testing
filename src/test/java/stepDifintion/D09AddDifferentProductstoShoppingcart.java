package stepDifintion;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D09AddDifferentProductstoShoppingcart extends Hooks{
    String email="nada0@gmail.com";
    String password="00909789657476";

    Homepage homeobject;
    Loginpage loginobject;
    Myaccountpage myaccountobject;
    Userregisterpage registerobject;
    Searchforproductpage searchforproductobject;
  Productinformationpage Productinformationobject;


    @Given("User register")
    public void user_register() {
        homeobject = new Homepage(driver);
        homeobject.userregister();
        registerobject = new Userregisterpage(driver);
        registerobject.Userenterdata("nada ", "mohamed", email, password);

    }


    @Given("User click on logout link to logout")
    public void user_click_on_logout_link_to_logout() {
        myaccountobject=new Myaccountpage(driver);
        myaccountobject.userlogout();
    }
    @When("User login")
    public void user_login() {
        homeobject=new Homepage(driver);
        homeobject.userlogin();
        loginobject=new Loginpage(driver);
        loginobject.userenterlogindata(email,password);
    }

    @Then("search for frist {string}")
    public void searchForFrist(String product1) {


        searchforproductobject=new Searchforproductpage(driver);
        searchforproductobject.searchforproduct(product1);

    }


    @Then("Click on add cart ")
    public void click_on_add_cart() {
        searchforproductobject=new Searchforproductpage(driver);
        searchforproductobject.Addcart();



    }


    @Then("Assert that product one added")
    public void assert_that_prodct_added() {
        Productinformationobject=new Productinformationpage(driver);
        Productinformationobject.addtocartsuccessfully();
    }





    @When("Search for {string}")
    public void searchFor(String product2) {


        searchforproductobject=new Searchforproductpage(driver);
        searchforproductobject.searchforproduct(product2);
    }

    @Then("Click on add cart")
    public void clickOnAddCart() {
        searchforproductobject=new Searchforproductpage(driver);
        searchforproductobject.Addcart();
    }
    @When("Click again on add cart in information page")
    public void clickAgainOnAddcartInInformationpage(){
        Productinformationobject=new Productinformationpage(driver);
        Productinformationobject.Addtocartbtn();

    }

    @And("Assert that second product added")
    public void assertThatProductAdded() {
        Productinformationobject=new Productinformationpage(driver);
        Productinformationobject.addtocartsuccessfully();
    }


}
