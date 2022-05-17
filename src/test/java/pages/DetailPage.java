package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class DetailPage extends PageObject{
    private By dropDown(){
        return By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[1]/div");
    }

    private By buttonDetails(){
        return By.xpath("//*[@class = 'col-md-4 col-lg-3 col-6'][10]//span[text()='Detail']");
    }

    private By onDetailPage(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div");
    }

    @Step
    public boolean onHomepageDetails(){
        return $(dropDown()).isDisplayed();
    }

    @Step
    public void clickDetails(){
        $(buttonDetails()).click();
    }

    @Step
    public boolean onDetails(){
        return $(onDetailPage()).isDisplayed();
    }
}
