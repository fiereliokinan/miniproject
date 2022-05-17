package pages;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class CategoriesPage extends PageObject {
    private  By CategoriesDDown(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div[1]/div/div[1]/div[1]");
    }
    private By Detail(){
        return By.xpath("//*[@class = 'col-md-4 col-lg-3 col-6'][1]//span[text() = 'Beli']");
    }

    @Step
    public void openPage(){
        open();
    }
    @Step
    public boolean validateOnMainPage(){
        return $(CategoriesDDown()).isDisplayed();
    }
    @Step
    public boolean validateOnMainPage2(){
        return $(Detail()).isDisplayed();
    }
}
