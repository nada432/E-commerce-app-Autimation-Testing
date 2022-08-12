package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Userregisterpage extends Pagebase{

    public Userregisterpage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="gender-female")
    WebElement genderbtn;
    @FindBy(id="FirstName")
    WebElement fristnametext;
    @FindBy(id="LastName")
    WebElement lastnametext;
    @FindBy(id="Email")
    WebElement emailtext;
    @FindBy(name="DateOfBirthDay")
    WebElement dateofbirthdayfield;
    @FindBy(name="DateOfBirthMonth")
    WebElement dateofbirthmonthfield;
    @FindBy(name="DateOfBirthYear")
    WebElement dateofbirthyearfield;
    @FindBy(id="Password")
    WebElement passwordtext;
    @FindBy(id="ConfirmPassword")
    WebElement confirmpassword;
    @FindBy(id="register-button")
    WebElement registerbtn;

    public void Userenterdata(String firstname, String lastname,String email, String password ) {
        clickbtn(genderbtn);
        sendtext(fristnametext, firstname);
        sendtext(lastnametext, lastname);
        sendtext(emailtext, email);
        dropdown(dateofbirthdayfield, 18);
        dropdown(dateofbirthmonthfield, 6);
        dropdown(dateofbirthyearfield, 89);
        sendtext(passwordtext, password);
        sendtext(confirmpassword, password);
        clickbtn(registerbtn);

    }


}





