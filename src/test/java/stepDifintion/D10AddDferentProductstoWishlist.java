package stepDifintion;

import Pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D10AddDferentProductstoWishlist extends Hooks {
    String email = "nada19872@gmail.com";
    String password = "9876543";
    Homepage homeobject;
    Loginpage loginobject;
    Myaccountpage myaccountobject;
    Userregisterpage registerobject;
    Searchforproductpage searchforproductobject;
    Productinformationpage Productinformationobject;

    @Given("User register to website")
    public void user_register_to_website() {
        homeobject = new Homepage(driver);
        homeobject.userregister();
        registerobject = new Userregisterpage(driver);
        registerobject.Userenterdata("nada ", "mohamed", email, password);

    }

    @Given("User click on logout link")
    public void user_click_on_logout_link() {
        myaccountobject = new Myaccountpage(driver);
        myaccountobject.userlogout();
    }

    @Then("User login to register account")
    public void user_login_to_register_account() {
        homeobject = new Homepage(driver);
        homeobject.userlogin();
        loginobject = new Loginpage(driver);
        loginobject.userenterlogindata(email, password);
    }

    @When("User search for {string}")
    public void user_search_for(String product1) {
        searchforproductobject = new Searchforproductpage(driver);
        searchforproductobject.searchforproduct(product1);
    }
    @When("User click on add wishlist btn")
    public void user_click_on_wishlistbtn() {
        searchforproductobject =new Searchforproductpage (driver);
        searchforproductobject.Addtowishlistbtn();
    }
    @When("Assert that first product added to wish list")
    public void assert_that_first_product_added_to_wish_list() {
      searchforproductobject=new Searchforproductpage(driver);
      searchforproductobject.Addtowishsuccessfully();

    }

    @Then("User search for second {string}")
    public void user_search_for_second_product(String product2) {
        searchforproductobject = new Searchforproductpage(driver);
        searchforproductobject.searchforproduct(product2);



    }

    @Then("User click on wishlist")
    public void user_click_on_wishlist() {
        searchforproductobject =new Searchforproductpage (driver);
        searchforproductobject.Addtowishlistbtn();

    }

    @Then("Assert that second product added to wishlist")
    public void assert_that_second_product_added_to_wishlist() {
        searchforproductobject=new Searchforproductpage(driver);
        searchforproductobject.Addtowishsuccessfully();
    }


}