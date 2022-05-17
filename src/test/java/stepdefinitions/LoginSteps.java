package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;
import pages.LoginPage;


public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openUrl();
        loginPage.validateOnLoginPage();
    }

    @When("I input valid username")
    public void iInputValidUsername() {
        loginPage.inputUsername("didiw@email.com");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword("123123123");
    }

    @And("click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I go to home page")
    public void iGoToHomePage() {
        homePage.headerAppears();
        homePage.headerTextEqual();
    }

    @When("I input invalid username")
    public void iInputInvalidUsername() {
        loginPage.inputUsername("lalalili@mail.com");
    }

    @Then("error message {string}")
    public void errorMessage(String arg0) {
        loginPage.errorMessageAppears();
        loginPage.errorMessageEquals(arg0);
    }

//
//    @When("I input protected username")
//    public void iInputProtectedUsername() {
//        loginPage.inputUsername("locked_out_user");
//    }
//
//    @Then("error message {string}")
//    public void errorMessage(String arg0) {
//        loginPage.errorMessageAppears();
//        loginPage.errorMessageEquals(arg0);
//    }
}
