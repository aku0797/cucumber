package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleSteps {

    WebDriver driver= Driver.getDriver();
GoogleSearchPage googleSearchPage= new GoogleSearchPage();



    @Given(": user is on google page")
    public void user_is_on_google_page() {
        driver.get("https://www.google.com/");

    }
    @When(": user enters {string} in the search bar")
    public void user_enters_in_the_search_bar(String product) {
googleSearchPage.searchbox.sendKeys(product+ Keys.ENTER);
    }

    @When(": user clicks search button")
    public void user_clicks_searhc_button() {

    }
    @Then(": verify results contain {string}")
    public void verify_results_contain(String product) {


        for (int i = 0; i < googleSearchPage.searchResults.size(); i++) {
            googleSearchPage.searchResults.get(i);
            if (!googleSearchPage.searchResults.get(i).getText().toLowerCase().contains("apple")){
                System.out.println(googleSearchPage.searchResults.get(i).getText());
            }else{
                System.out.println("the search couldn`t find the product");
            }
        }


    }


}
