package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By loginHeader(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[1]");
    }
    private By emailField(){
        return By.xpath("//*[@id=\"input-18\"]");
    }

    private By passwordField(){
        return By.xpath("//*[@id=\"input-21\"]");
    }

    private By loginButton(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button//span[text() = 'Login']");
    } //defini identifier element yang akan berinteraksi dengan automatenya

    private By errorMessage(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[1]");
    }

    @Step
    public void openUrl(){

        openUrl("https://qa.alta.id/auth/login");
    }

    @Step
    public boolean validateOnLoginPage(){
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUsername(String username){
        $(emailField()).type(username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step
    public boolean errorMessageAppears(){
        return $(errorMessage()).isDisplayed();
    }

    @Step
    public boolean errorMessageEquals(String text){

        return $(errorMessage()).getText().equals(text);
    }

    @Step
    public boolean headerloginAppear(){
        return $(loginHeader()).isDisplayed();
    }

    @Step
//    public boolean headerLoginTextAppear(strin){
//        return $(loginHeader()).getText().equals(text);
//    }
    public boolean headerLoginTextEquals(String text){
        return $(loginHeader()).getText().equals(text);
    }
}
