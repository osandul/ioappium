package hooks;

import Capabilities.AppiumDriverInit;
import PageObjects.Page;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class ServiceHooks extends Page {
    @Before
    public void getDriver() {
        AppiumDriverInit.getDriver ( );
    }

    @After
    public void quitDriver() {
        AppiumDriverInit.closeDriver ( );
    }

}
