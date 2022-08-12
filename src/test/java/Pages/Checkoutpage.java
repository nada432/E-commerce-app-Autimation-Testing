package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkoutpage extends Pagebase{
    public Checkoutpage(WebDriver driver) {
        super(driver);
    }
@FindBy(id="BillingNewAddress_FirstName")
    WebElement fristnametext;
    @FindBy(id="BillingNewAddress_LastName")
    WebElement lastnametext;
    @FindBy(id="BillingNewAddress_Email")
    WebElement emailtext;
    @FindBy(id="BillingNewAddress_CountryId")
    WebElement country;
    @FindBy(id="BillingNewAddress_City")
    WebElement citytext;
    @FindBy(id="BillingNewAddress_Address1")
    WebElement addresstext;
    @FindBy(id="BillingNewAddress_ZipPostalCode")
    WebElement zipposttext;
    @FindBy(id="BillingNewAddress_PhoneNumber")
    WebElement phonenumbertext;
    @FindBy(css = "button.button-1.new-address-next-step-button")
    WebElement continuebtninbillingpage;
    @FindBy(id="shippingoption_1")
    WebElement shippingmethodbtn;
    @FindBy(css = "button.button-1.shipping-method-next-step-button")
    WebElement continuebtninshippingmethodpage;
    @FindBy(id="paymentmethod_0")
    WebElement paymentmethodbtn;
    @FindBy(css = "button.button-1.payment-method-next-step-button")
    WebElement continuebtninpaymentmethodpage;
    @FindBy(css = "button.button-1 payment-info-next-step-button")
    WebElement continuebtninpaymentinfopage;
    @FindBy(css ="button.button-1.confirm-order-next-step-button")
    WebElement confirmbtn;
    public void userenterdatainbillingpayment(String firstname,String lastname,String email ,String City,String address ,String zippost, String phonenumber){
        sendtext(fristnametext,firstname);
        sendtext(lastnametext,lastname);
        sendtext(emailtext,email);
        dropdown(country,123);
        sendtext(citytext,City);
        sendtext(addresstext,address);
        sendtext(zipposttext,zippost);
        sendtext(phonenumbertext,phonenumber);
        clickbtn(continuebtninbillingpage);
    }
public  void  userchooseshippingmethod(){
        clickbtn(shippingmethodbtn);
        clickbtn(continuebtninshippingmethodpage);
}
public void userchoosepaymentmethod(){
        clickbtn(paymentmethodbtn);
        clickbtn(continuebtninpaymentmethodpage);
}
public void usercomfirmorder()
{
    clickbtn(continuebtninpaymentinfopage);
    clickbtn(confirmbtn);
}

}
