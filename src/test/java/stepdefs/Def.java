package stepdefs;


import Capabilities.AppiumDriverInit;
import PageObjects.Page;
import PageObjects.SignInPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import org.testng.Assert;

public class Def extends Page {
   public AppiumDriver driver;
   SignInPage signInPage = new SignInPage ( );

    @Given("I open the application {string} on a smartphone")
    public void i_open_the_application_on_a_smartphone(String string) {
            driver = AppiumDriverInit.getDriver ( );
    }

    @Given("I click on button {string}")
    public void i_click_on_button(String string) {
        signInPage.tapOnSignInButton ( );
    }


    @When("I click on sign in submit button {string}")
    public void i_click_on_sign_in_button(String string) {
        signInPage.tapOnSignInSubmitButton ( );
    }

    @When("I enter a new email address into {string} text field")
    public void i_enter_a_new_email_address_into_text_field(String string) {
        signInPage.tapOnSignInEmailField ( );
        signInPage.SendNewEmailToSignInEmailField ( );
    }

    @Then("I see a pop up window with message to activate your account.")
    public void i_see_a_pop_up_window_with_message_to_activate_your_account() {
        Assert.assertEquals ( getTextFromElement ( signInPage.getSignIn_dialogue_checkmailbox ( ) ),
                signInPage.getSIGNIN_EMAIL_ACTIVATE_MESSAGE ( ), "Activate your account via email");
        System.out.println ( "Activate your account via email" );
    }

    @When("I enter an existing in data base email address into {string} text field")
    public void i_enter_an_existing_in_data_base_email_address_into_text_field(String string) {
        signInPage.tapOnSignInEmailField ( );
        signInPage.SendExistingEmailToSignInEmailField ( );
    }

    @When("I enter a password {string} into {string} text field")
    public void i_enter_a_password_into_text_field(String string, String string2) {
        signInPage.tapOnSignInPasswordField ( );
        signInPage.SendPasswordToSignInPasswordField ( );
    }

    @Then("I see a pop up window with message to enter another email.")
    public void i_see_a_pop_up_window_with_message_to_enter_another_email() {
        Assert.assertEquals ( getTextFromElement ( signInPage.getSignIn_dialogue_checkmailbox ( ) ),
                signInPage.getSIGNIN_EMAIL_EXISTS_MESSAGE ( ), "This email doesn't exist in the base");
        System.out.println ( "This email already exists in the base" );
    }

}


