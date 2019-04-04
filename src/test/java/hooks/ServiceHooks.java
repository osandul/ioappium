package hooks;

import Capabilities.AppiumDriverInit;
import PageObjects.Page;
import cucumber.api.java.After;

public class ServiceHooks extends Page {

    @After
    public void quitDriver() {
        AppiumDriverInit.closeDriver ( );
    }

}
