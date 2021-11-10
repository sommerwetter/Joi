package com.Joi;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;
//test
public class Bot {

    public static void main() {

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "localhost:");
        ChromeDriver driver = new ChromeDriver();


        driver.get(Utils.SUP_URL);
        WebForm webForm = new WebForm(driver);
        //webForm.SelectProduct(); //Manually select product
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        webForm.SelectSize();
        webForm.AddProduct();
        webForm.BuyProduct();

        //wait for pay page to load
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Autofill
        webForm.enterName();
        webForm.enterEmail();
        webForm.enterPhone();
        webForm.enterStreet();
        webForm.enterCity();
        webForm.enterZip();
        webForm.enterCountry();
        webForm.enterCardNr();
        webForm.enterCardMonth();
        webForm.enterCardYear();
        webForm.enterCardCode();
        webForm.AcceptAGBS();
        webForm.ConfirmPurchase();
    }
}
