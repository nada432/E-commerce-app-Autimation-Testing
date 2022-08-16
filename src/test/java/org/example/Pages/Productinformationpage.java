package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Productinformationpage extends Pagebase {

    public Productinformationpage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "attribute-option-15")
    WebElement filterattribute;
    @FindBy(linkText = "jewelry")
    WebElement fristtag;
    @FindBy(linkText = "nice")
    WebElement Secondtag;

    @FindBy(id="add-to-cart-button-4")
    WebElement addcartbtn;

    @FindBy(css = "p.content")
    WebElement msgshoppingcart;





    public void Filterattribute() {
        clickbtn(filterattribute);
    }

    public void selectdifferenttags() {
        clickbtn(fristtag);
        clickbtn(Secondtag);
    }


    public void Addtocartbtn() {
        clickbtn(addcartbtn);
    }
        public void addtocartsuccessfully(){
        Assert.assertTrue(msgshoppingcart.getText().contains("The product has been added to your shopping cart"));
    }


}
