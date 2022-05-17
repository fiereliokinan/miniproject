package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
//import org.aspectj.weaver.ast.Or;
import pages.OrderPage;
import pages.LoginPage;

public class OrderSteps {

    @Steps
    OrderPage OrderPage;
    @Given(": Iam on main page")
    public void iamOnMainPage() {
        OrderPage.openUrl();
        OrderPage.validateMainPage();
    }

    @When("I click beli")
    public void iClickBeli() {
        OrderPage.clickBeli1();
        OrderPage.clickBeli2();

    }

    @And("I click cart")
    public void iClickCart() {
        OrderPage.clickCart();
    }

    @And("click bayar")
    public void clickBayar() {
        OrderPage.clickBayar();
    }

    @Then("direct to login page")
    public void directToLoginPage() {
        OrderPage.directToLoginPage();
    }

    @Steps
    LoginPage loginPage;
    @Given("Iam on login page")
    public void iamOnLoginPage() {
        loginPage.openUrl();
        loginPage.validateOnLoginPage();
    }

    @Then("Directed to transaction page")
    public void directedToTransactionPage() {
        OrderPage.textTransaction();
    }

    @And("I click bayar")
    public void iClickBayar() {
        OrderPage.clickBayar();
    }
}
