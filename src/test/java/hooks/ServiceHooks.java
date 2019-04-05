package hooks;

import Capabilities.AppiumDriverInit;
import PageObjects.Page;
import cucumber.api.java.After;
import cucumber.api.java.Before;

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
