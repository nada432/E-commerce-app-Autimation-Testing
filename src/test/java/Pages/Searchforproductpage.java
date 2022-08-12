package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Searchforproductpage extends Pagebase {
    public Searchforproductpage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "small-searchterms")
    WebElement searchbar;
    @FindBy(css = "button.button-1.search-box-button")
    WebElement searchbtn;
    @FindBy(id = "customerCurrency")
    WebElement currency;
    @FindBy(linkText = "Apparel")
    WebElement maincatagorie;
    @FindBy(linkText = "Shoes")
    WebElement subcatagorie;
    @FindBy(css = "button.button-2.product-box-add-to-cart-button")
    WebElement addcartbtn;
    @FindBy(css = "button.button-2.add-to-wishlist-button")
    WebElement addtowishlistbtn;

    @FindBy (css ="p.content")
    WebElement msgaddtoweishlist;

    @FindBy(css = " button.button-2.add-to-compare-list-button")
    WebElement addtocomparelistbtn;

    @FindBy(css ="p.content")
    WebElement msgaddtocomparelist;

    @FindBy(linkText = "Shopping cart")
    WebElement shppingcartbtn;

    @FindBy(id="termsofservice")
    WebElement termsofservicebtn;

    @FindBy(id="checkout")
        WebElement checkoutbtn;
    public void searchforproduct(String productname) {
        sendtext(searchbar, productname);
        clickbtn(searchbtn);
    }

    public void switchcurrency() {
        dropdown(currency, 1);
    }

    public void Maincatagorie() {
        clickbtn(maincatagorie);

    }

    public void Subcatagorie() {
        clickbtn(subcatagorie);
    }

    public void Addcart() {
        clickbtn(addcartbtn);
    }
    public void Addtowishlistbtn()
    {
        clickbtn(addtowishlistbtn);

    }
    public void Addtowishsuccessfully(){
        Assert.assertTrue(msgaddtoweishlist.getText().contains("The product has been added to your wishlist") );

    }
    public void Addtocomparelist(){
        clickbtn(addtocomparelistbtn);
    }
    public void Addtocomparelistsuccessfully(){
        Assert.assertTrue(msgaddtocomparelist.getText().contains("The product has been added to your product comparison"));
    }
 public void usercangotocheckoutpage(){
        clickbtn(shppingcartbtn);
        clickbtn(termsofservicebtn);
        clickbtn(checkoutbtn);
 }
}