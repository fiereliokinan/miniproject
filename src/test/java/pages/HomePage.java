package pages;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    private By productHeader(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div[1]/div/div[1]/div[1]");
    }

    @Step
    public boolean headerAppears(){
        return $(productHeader()).isDisplayed();
    }

    @Step
    public boolean headerTextEqual(){
        return $(productHeader()).getText().equals("Select category ...");
    }
}
