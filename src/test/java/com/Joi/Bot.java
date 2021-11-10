package com.Joi;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class Bot {


    public static void main() {


        ChromeOptions options = new ChromeOptions();
        //options.setExperimentalOption("debuggerAddress", "localhost:");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", new String[]{"False"});
        options.addArguments(
                "-disable-extensions",
                "-incognito",
                "--kiosk",
                "disable-infobars",
                "--disable-blink-features",
                "--profile-directory=Default",
                "--disable-plugins-discovery",
                "--disable-blink-features=AutomationControlled"

        );

        ChromeDriver driver = new ChromeDriver(options);


        driver.get(Utils.SUP_URL);
        WebForm webForm = new WebForm(driver);
        //webForm.SelectProduct(); //Manually select product
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Delay.main(1000);
        webForm.SelectSize();
        Delay.main(1000);
        webForm.AddProduct();
        Delay.main(1000);
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        webForm.BuyProduct();

        //wait for pay page to load
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Autofill
        webForm.enterName();
        //Delay.main(700);

        webForm.enterEmail();
        Delay.main(500);

        webForm.enterPhone();
        //Delay.main(600);

        webForm.enterStreet();
        Delay.main(500);

        webForm.enterCity();
        //Delay.main(300);

        webForm.enterZip();
       // Delay.main(400);

        webForm.enterCountry();
        Delay.main(800);

        webForm.enterCardNr();
        Delay.main(900);

        webForm.enterCardMonth();
        //Delay.main(500);

        webForm.enterCardYear();
        //Delay.main(300);

        webForm.enterCardCode();
        //Delay.main(300);

        webForm.AcceptAGBS();
        Delay.main(2000);

        webForm.ConfirmPurchase();
    }

    public void bot(){

    }

}
