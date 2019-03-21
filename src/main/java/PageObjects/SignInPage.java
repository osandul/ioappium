package PageObjects;
import Capabilities.PropertyFile;
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



    public void tapOnSignInButton() {
       clickOnElement ( signIn_start_button );
    }


    public void  tapOnSignInEmailField() {
        clickOnElement ( signIn_email_field );
    }

    public void SendExistingEmailToSignInEmailField(){
        sendKeysToElement ( signIn_email_input, PropertyFile.getPropertyValue ( "existing_email" ) );
    }

    public void tapOnSignInPasswordField() {
        clickOnElement ( signIn_password_field );
    }

    public void SendExistingPasswordToSignInPasswordField(){
        sendKeysToElement ( signIn_password_input, PropertyFile.getPropertyValue ( "existing_password" ));
    }

    public void tapOnSignInSubmitButton() {
        clickOnElement ( signIn_submit_button );
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
