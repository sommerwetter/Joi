package pakete;

public class TestPlan {

    public static void main(String[] args) {

        // ChromeDriver location set up in com.Joi.hehe.Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);

        UI.main();

        //type this in terminal: taskkill /im chromedriver.exe /f      to be sure all chromedriver windows are closed
        
    }

}
