package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.CategoriesPage;

public class CategoriesStep {
    @Steps
    CategoriesPage categoriesPage;
    //CategoriesPage categoriesPage;
    @Given("I am on main page")
    public void onTheMainPage(){
        categoriesPage.openPage();
        categoriesPage.validateOnMainPage();
        //categoriesPage.openPage();
        //categoriesPage.validateOnMainPage();
    }

    @Then("Show all products")
    public void showAllProducts() {
        categoriesPage.validateOnMainPage2();
    }

    @When("main page")
    public void mainPage() {
    }
}
