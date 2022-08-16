package org.example.stepDifintion;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver = null;

    @Before



    public WebDriver openbrawser() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\zas\\IdeaProjects\\Autimation\\src\\main\\resources\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
        return null;
    }




@After
public void closebrawser() throws InterruptedException {
    Thread.sleep(2000);

 driver.quit();
}


 }



