package PageObjects;
import Capabilities.AppiumDriverInit;
import Capabilities.PropertyFile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

    public AppiumDriver driver = AppiumDriverInit.getDriver ( );

    public final String APP_PACKAGE_NAME = "com.booking:id/";

    public WebDriverWait wait = new WebDriverWait ( driver, 20 );

    public MobileElement waitForVisibilityOfElement(By locator) {
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( locator ) );
        return (MobileElement) driver.findElement ( locator );
    }

    public void clickOnElement(By locator) {
        waitForVisibilityOfElement ( locator ).click ( );

    }

    public void sendKeysToElement(By locator, String text) {
        waitForVisibilityOfElement ( locator ).sendKeys ( text );
    }

    public String getTextFromElement (By locator){
        return waitForVisibilityOfElement ( locator ).getAttribute ( "text");
    }

}
