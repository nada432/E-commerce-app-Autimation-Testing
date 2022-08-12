package Runner;

import io.cucumber.testng.CucumberOptions;
import stepDifintion.Hooks;

@CucumberOptions(features ={"src/main/resources/features/F10- AddDifferentProductstoWishlist.feature"},
        glue ={"stepDifintion"}
        ,plugin = {"pretty","html:target/cucumber-html-report"})

public class Testrunner extends Hooks {
}
