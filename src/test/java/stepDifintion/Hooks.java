package stepDifintion;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Hooks extends AbstractTestNGCucumberTests {
    public static WebDriver driver = null;

    @BeforeTest



    public void openbrawser() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\zas\\IdeaProjects\\Autimation\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }




@AfterMethod
public void closebrawser() throws InterruptedException {
    Thread.sleep(2000);

 driver.quit();
}


 }



