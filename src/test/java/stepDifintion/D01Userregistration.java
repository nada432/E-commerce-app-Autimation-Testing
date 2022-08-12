package stepDifintion;

import Pages.Homepage;
import Pages.Userregisterpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D01Userregistration extends Hooks {
    Homepage homeobject;
    Userregisterpage registerobject;

    @Given("The user in the homebage")
    public void the_user_in_the_homebage() {
        homeobject = new Homepage(driver);
        homeobject.userregister();

    }

    @When("user click on user registerlink")
    public void user_click_on_user_registerlink() {

        Assert.assertTrue(driver.getCurrentUrl().contains("register"));

    }

    @And("user enter {string},{string},{string},{string}")
    public void iEntered(String fristname, String lastname, String email, String password) {


        registerobject = new Userregisterpage(driver);
        registerobject.Userenterdata(fristname, lastname, email, password);
    }

    @Then("The restration page display successfully")
    public void the_restration_page_display_successfully() {
        Assert.assertTrue(driver.getCurrentUrl().contains("registerresult"));
    }

}

