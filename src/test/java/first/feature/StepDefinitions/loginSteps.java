package first.feature.StepDefinitions;

import first.feature.BaseClass;
import first.feature.PageObjects.LoginPage;
import first.feature.Utils.PropertiesUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.Properties;

public class loginSteps extends BaseClass {

    Properties properties= PropertiesUtil.loadUserProps();
    @Given("User enters valid email in the email field")
    public void userEntersValidEmailInTheEmailField() {
       String username=  properties.getProperty("username");
        LoginPage.enterEmail(username);
    }

    @And("User enters valid password in the password field")
    public void userEntersValidPasswordInThePasswordField() {
        String password= properties.getProperty("password");
        LoginPage.enterPassword(password);
    }

    @When("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
        LoginPage.clickLoginBtn();
    }

    @Then("User is logged in successfully")
    public void userIsLoggedInSuccessfully() {

    }

    @Given("User enters invalid email in the email field")
    public void userEntersInvalidEmailInTheEmailField() {
    }

    @And("User enters invalid password in the password field")
    public void userEntersInvalidPasswordInThePasswordField() {

    }

    @Then("Error message is displayed")
    public void errorMessageIsDisplayed() {
    }



}
