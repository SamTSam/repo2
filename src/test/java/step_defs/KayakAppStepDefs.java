package step_defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.junit.Assert.*;

public class KayakAppStepDefs {

    WebDriver driver;

    @Given("^User is on \"([^\"]*)\" homepage$")
    public void user_is_on_homepage(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kayak.com/");
    }

    @Then("^User should see the URL \"([^\"]*)\"$")
    public void user_should_see_the_URL(String expectedURL) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      assertEquals("Assertion failed,URL did't match",expectedURL,driver.getCurrentUrl());

    }

    @Then("^User should see the title \"([^\"]*)\"$")
    public void user_should_see_the_title(String expectedTitle) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("Assertion failed,URL did't match",expectedTitle,driver.getTitle());

    }

    @When("^User click the search button without entering anything$")
    public void user_click_the_search_button_without_entering_anything() throws InterruptedException {
        WebElement searchButton = driver.findElement(By.xpath("//button[@class='Common-Widgets-Button-StyleJamButton theme-light SeparateIconAndTextButton Button-Gradient size-l _id7 _ihr _ihs _h-Y _im4 _ii0 _ihp _ihq _inw _iir _iae _jWT _iFQ _iFR _imQ _iv1']"));
        searchButton.click();
        Thread.sleep(2000);

    }

    @Then("^Verify \"([^\"]*)\" error message is displayed$")
    public void verify_error_message_is_displayed(String expectedErrorMessage) {

        WebElement errorMessage = driver.findElement(By.xpath("//ul[@class = 'errorMessages']//li"));
        String errorMessageText = errorMessage.getText();

        assertEquals("Wrong error message",expectedErrorMessage, errorMessageText);
    }


    @When("^User enters destination as \"([^\"]*)\"$")
    public void user_enters_destination_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^User enters pick up date and drop off date$")
    public void user_enters_pick_up_date_and_drop_off_date() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^User clicks the search button$")
    public void user_clicks_the_search_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^User will be redirected to the result page$")
    public void user_will_be_redirected_to_the_result_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

}


