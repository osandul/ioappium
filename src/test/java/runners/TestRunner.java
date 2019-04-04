package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
        features = "src/test/resources",
        glue = {"stepdefs", "hooks"}
       )

public class TestRunner extends AbstractTestNGCucumberTests {
}


