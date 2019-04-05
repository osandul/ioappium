package stepdefs;


import PageObjects.Page;
import PageObjects.SignInPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class Def extends Page {
    SignInPage signInPage = new SignInPage ( );

    @Given("I click on button Create account")
    public void iClickOnButton() {
        signInPage.tapOnSignInButton();
    }

    @When("I click on sign in submit button Create account")
    public void iClickOnSignInButton() {
        signInPage.tapOnSignInSubmitButton();
    }

    @When("I enter a new email address into Email address text field")
    public void iEnterANewEmailAddressIntoTextField() {
        signInPage.tapOnSignInEmailField();
        signInPage.SendNewEmailToSignInEmailField();
    }

    @Then("I see a pop up window with message to activate your account.")
    public void iSeeAPopUpWindowWithMessageToActivateYourAccount() {
        Assert.assertEquals(getTextFromElement (signInPage.getSignIn_dialogue_checkmailbox() ),
                signInPage.getSIGNIN_EMAIL_ACTIVATE_MESSAGE(), "Activate your account via email");
        System.out.println("Activate your account via email");
    }

    @When("I enter an existing in data base email address into Email address text field")
    public void iEnterAnExistingInDataBaseEmailAddressIntoTextField() {
        signInPage.tapOnSignInEmailField();
        signInPage.SendExistingEmailToSignInEmailField();
    }

    @When("I enter a valid password into Password text field")
    public void iEnterAPasswordIntoTextField() {
        signInPage.tapOnSignInPasswordField();
        signInPage.SendPasswordToSignInPasswordField();
    }

    @Then("I see a pop up window with message to enter another email.")
    public void iSeeAPopUpWindowWithMessageToEnterAnotherEmail() {
        Assert.assertEquals(getTextFromElement(signInPage.getSignIn_dialogue_checkmailbox()),
                signInPage.getSIGNIN_EMAIL_EXISTS_MESSAGE(), "This email doesn't exist in the base");
        System.out.println("This email already exists in the base");
    }
}


