package stepDefinitions;

import ObjectReopository.CALoginpage;
import Reusables.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {


    public CALoginpage loginpage;
    WebDriver driver;
    @Given("User should Open Cloud Anchor Application By using url {string}")
    public void user_should_open_cloud_anchor_application_by_using_url(String string) {
        driver = DriverManager.getWebDriver(string);
        loginpage = new CALoginpage(driver);

    }
    @When("User enter the {string} and {string}")
    public void user_enter_the_and(String email, String password) {
       loginpage.email().sendKeys(email);
       loginpage.password().sendKeys(password);
    }
    @And("User click on login button")
    public void user_click_on_login_button() {
        loginpage.loginbtn().click();
    }
    @Then("Cloud Anchor Application Home Page should opened")
    public void cloud_anchor_application_home_page_should_opened() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(driver.getCurrentUrl().contains("home"));
    }

    @And("Close the Browser")
    public void Close_the_Browser(){
        driver.quit();
    }
}
