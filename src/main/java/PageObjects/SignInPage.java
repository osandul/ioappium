package PageObjects;
import org.openqa.selenium.By;

public class SignInPage extends Page {

    private By signIn_start_button = By.id ( APP_PACKAGE_NAME +"login_button_sign_up");
    private By signIn_email_field = By.id ( APP_PACKAGE_NAME +"login_page_sign_up_email_input_layout" );
    private By signIn_email_input = By.id(APP_PACKAGE_NAME +"login_page_sign_up_email_input_text");
    private By signIn_password_field = By.id ( APP_PACKAGE_NAME +"login_page_sign_up_password_input_layout" );
    private By signIn_password_input = By.id(APP_PACKAGE_NAME +"login_page_sign_up_password_input_text");
    private By signIn_submit_button = By.id ( APP_PACKAGE_NAME +"login_page_sign_in_guided_action_button" );
    private By signIn_dialogue_checkmailbox = By.id(APP_PACKAGE_NAME +"message");
    private final String SIGNIN_EMAIL_ACTIVATE_MESSAGE = "Check your inbox for an email. Use the provided link to activate your account.";
    private final String SIGNIN_EMAIL_EXISTS_MESSAGE = "Please enter a different email address, this one has been saved to an existing profile.";

    public By getSignIn_start_button() {
        return signIn_start_button;
    }


    public By getSignIn_email_field() {
        return signIn_email_field;
    }


    public By getSignIn_email_input() {
        return signIn_email_input;
    }


    public By getSignIn_password_field() {
        return signIn_password_field;
    }

    public By getSignIn_password_input() {
        return signIn_password_input;
    }


    public By getSignIn_submit_button() {
        return signIn_submit_button;
    }


    public By getSignIn_dialogue_checkmailbox() {
        return signIn_dialogue_checkmailbox;
    }
    public String getSIGNIN_EMAIL_ACTIVATE_MESSAGE() {
        return SIGNIN_EMAIL_ACTIVATE_MESSAGE;
    }

    public String getSIGNIN_EMAIL_EXISTS_MESSAGE() {
        return SIGNIN_EMAIL_EXISTS_MESSAGE;
    }




}
