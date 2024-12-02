package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Login_page;
import utilities.Driver;

public class Login_steps {


    WebDriver driver= Driver.getDriver();
    Login_page loginPage= new Login_page();


    @Given(": user is on login page")
    public void user_is_on_login_page() {

    }
    @When(": user enters {string}")
    public void username_input(String username) {

    }
    @When(": user enters {string}")
    public void password_input(String password) {

    }

    @Then(": user clicks in login button")
    public void user_clicks_in_login_button() {

    }
    @Then("verify user redirected to the home page")
    public void verify_user_redirected_to_the_home_page() {

    }


}
