package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Myaccountpage extends Pagebase{

    public Myaccountpage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Log out")
    WebElement logoutbtn;
    @FindBy(linkText = "My account")
    WebElement myaccountbtn;
    @FindBy(linkText = "Change password")
    WebElement changepasswordlink;
    @FindBy(id="OldPassword")
    WebElement oldpasswordtext;
    @FindBy(id="NewPassword")
    WebElement newpasswordtext;
    @FindBy(id="ConfirmNewPassword")
    WebElement confirmpasswordtext;
    @FindBy(css = "button.button-1.change-password-button")
    WebElement changepasswordbtn;
  public  @FindBy(css="p.content")
    WebElement Confirmmessage;



    public void userlogout () {
        clickbtn(logoutbtn);
    }
        public void myaccount (){
            clickbtn(myaccountbtn);
        }


    public void userresetpassword(String oldpassword, String newpassword,String confirmpassword) {

        clickbtn(changepasswordlink);
        sendtext(oldpasswordtext, oldpassword);
        sendtext(newpasswordtext, newpassword);
        sendtext(confirmpasswordtext, confirmpassword);
        clickbtn(changepasswordbtn);
    }
    public void assertionofresetpassword(){
        Assert .assertTrue(Confirmmessage.getText().contains("Password was changed"));
    }

}
