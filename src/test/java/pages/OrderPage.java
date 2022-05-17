package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class OrderPage extends PageObject {
    private By beliButton1(){
        return By.xpath("//*[@class = 'col-md-4 col-lg-3 col-6'][1]//span[text() = 'Beli']");
    }
    private By beliButton2(){
        return By.xpath("//*[@class = 'col-md-4 col-lg-3 col-6'][4]//span[text() = 'Beli']");
    }

    private By cart(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[1]/span");
    }

    private By buttonBayar(){
        return By.xpath("//*[@id=\"button-bayar\"]/span");
    }
    private By loginHeader(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[1]");
    }
    private By TransactionText(){ return By.xpath("//*[text()='Transactions']");}

    @Step
    public void openUrl(){

        openUrl("https://qa.alta.id/");
    }

    public boolean validateMainPage(){
        return $(beliButton1()).isDisplayed();
    }
    public void clickBeli1(){
        $(beliButton1()).click();
    }
    public void clickBeli2(){
        $(beliButton2()).click();
    }
    public void clickCart(){
        $(cart()).click();
    }
//    public boolean validateCartPage(){
//        return $(buttonBayar()).isDisplayed();
//    }
   public void clickBayar(){
        $(buttonBayar()).click();
   }
   public boolean directToLoginPage(){
        return $(loginHeader()).isDisplayed();
   }
   public boolean textTransaction(){return $(TransactionText()).isDisplayed();}
}
