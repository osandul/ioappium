import Capabilities.AppiumDriverInit;
import PageObjects.SignInPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookingSignIn {
    AppiumDriver driver;

    SignInPage signInPage = new SignInPage ( );


    @BeforeTest
    public void setDriver() {
        driver = AppiumDriverInit.getDriver ( );
    }

    @Test

    public void basicTest() {
        WebDriverWait wait = new WebDriverWait ( driver, 10 );

        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.signIn_start_button ) ).click ( );
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.signIn_email_field ) ).click ( );
        driver.findElement ( signInPage.signIn_email_input ).sendKeys ( "oleksandra.sandul13@gmail.com" );
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.signIn_password_field ) ).click ( );
        driver.findElement ( signInPage.signIn_password_input ).sendKeys ( "1234abcd" );
        driver.findElement ( signInPage.signIn_submit_button ).click ( );
    }
}

