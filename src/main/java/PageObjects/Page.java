package PageObjects;
import Capabilities.AppiumDriverInit;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {


    public AppiumDriver driver = AppiumDriverInit.getDriver ();

    public final String APP_PACKAGE_NAME = "com.booking:id/";

    public WebDriverWait wait = new WebDriverWait ( driver, 20 );

}
