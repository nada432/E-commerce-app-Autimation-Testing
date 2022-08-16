package org.example.stepDifintion;

import org.example.Pages.Checkoutpage;
import org.example.Pages.Searchforproductpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D12CreateSuccessfulOrder extends Hooks{
    String product="Apple MacBook Pro 13-inch";
    Searchforproductpage searchforproductobject;
  Checkoutpage checkoutobject;

    @Given("User search for product")
    public void userSearchForProduct() {
        searchforproductobject=new Searchforproductpage(driver);
        searchforproductobject.searchforproduct(product);

    }

    @When("User add  product to shopping cart")
    public void userAddProductToShoppingCart() {
        searchforproductobject=new Searchforproductpage(driver);
        searchforproductobject.Addcart();

    }

    @And("User go to shopping cart page")
    public void userGoToShoppingCartPage() {
       searchforproductobject=new Searchforproductpage(driver);
       searchforproductobject.usercangotocheckoutpage();
    }

    @Then("User enter data in billing payment")
    public void userEnterDataInBillingPayment() {
        checkoutobject=new Checkoutpage(driver);
        checkoutobject.userenterdatainbillingpayment("nada","mohamed","nada12345@gmail.com"," fayoum","dala ys","12345","0997968576454");

    }


    @When("User choose shipping method")
    public void userChooseShippingMethod() {
        checkoutobject=new Checkoutpage(driver);
        checkoutobject.userchooseshippingmethod();


    }

    @And("User choose payment method in payment method page")
    public void userChoosePaymentMethodInPaymentMethodPage() {
        checkoutobject=new Checkoutpage(driver);
        checkoutobject.userchoosepaymentmethod();

    }

    @Then("User comfirm order")
    public void userComfirmOrder() {
        checkoutobject=new Checkoutpage(driver);
        checkoutobject.usercomfirmorder();
    }
}


