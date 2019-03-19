package PageObjects;

import Capabilities.AppiumDriverInit;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    public AppiumDriver driver;


    public By signIn_start_button = By.id ( "com.booking:id/login_button_sign_up");
    public By signIn_email_field = By.id ( "com.booking:id/login_page_sign_up_email_input_layout" );
    public By signIn_email_input = By.id("com.booking:id/login_page_sign_up_email_input_text");
    public By signIn_password_field = By.id ( "com.booking:id/login_page_sign_up_password_input_layout" );
    public By signIn_password_input = By.id("com.booking:id/login_page_sign_up_password_input_text");
    public By signIn_submit_button = By.id ( "com.booking:id/login_page_sign_in_guided_action_button" );
    public By signIn_dialogue_checkmailbox = By.id("com.booking:id/message");
    public String successful_signIn = "Check your inbox for an email. Use the provided link to activate your account.";
    public String email_exists_inDB = "Please enter a different email address, this one has been saved to an existing profile.";


}
