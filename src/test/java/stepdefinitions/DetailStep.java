package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.DetailPage;

public class DetailStep {
    @Steps
    DetailPage detailPage;
    @Given("I am on homepage")
    public void iAmOnHomepage() {
        detailPage.onHomepageDetails();
    }

    @When("i click details button")
    public void iClickDetailsButton() {
        detailPage.clickDetails();
    }

    @Then("Direct to detail product page")
    public void directToDetailProductPage() {
        detailPage.onDetails();
    }
}
