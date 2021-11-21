package pakete;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static pakete.UI.*;

public class WebForm extends PageObject {

    public WebForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//select[@id='size']")
    private WebElement SelectSize;
    @FindBy(xpath = "//fieldset[@id='add-remove-buttons']/input")
    private WebElement AddToCarro;
    @FindBy(xpath = "//a[contains(@href, 'https://www.supremenewyork.com/checkout')]")
    private WebElement Buy;

    //Size

    private final String SIZE = talla;

    // Shipping and Card Info

    private final String NAME = nombre;
    private final String EMAIL = correo;
    private final String PHONE = telefono;
    private final String STREET = calle;
    private final String CITY =ciudad;
    private final String ZIP = postal;
    private final String COUNTRY = pais;
    private final String CARDNR = tarjetanr;
    private final String CARDMONTH = tarjetames;
    private final String CARDYEAR = tarjetayear;
    private final String CARDCODE = tarjetacodigo;

    //Xpaths
    @FindBy (xpath = "//input[@id='order_billing_name']")
    private WebElement Name;
    @FindBy (xpath = "//input[@id='order_email']")
    private WebElement Email;
    @FindBy (xpath = "//input[@id='order_tel']")
    private WebElement Phone;
    @FindBy (xpath = "//input[@id='order_billing_address']")
    private WebElement Street;
    @FindBy (xpath = "//input[@id='order_billing_city']")
    private WebElement City;
    @FindBy (xpath = "//input[@id='order_billing_zip']")
    private WebElement Zip;
    @FindBy (xpath = "//select[@id='order_billing_country']")
    private WebElement Country;
    @FindBy (xpath = "//input[@id='credit_card_number']")
    private WebElement CardNr;
    @FindBy (xpath = "//select[@id='credit_card_month']")
    private WebElement CardMonth;
    @FindBy (xpath = "//select[@id='credit_card_year']")
    private WebElement CardYear;
    @FindBy (xpath = "//input[@id='credit_card_verification_value']")
    private WebElement CardCode;
    @FindBy (xpath = "//div[@id='cart-cc']/fieldset/p/label/div/ins")
    private WebElement AGBS;
    @FindBy (xpath = "//input[@name='commit']")
    private WebElement Confirm;


    //Work
    public void SelectSize(){this.SelectSize.sendKeys(SIZE);}
    public void AddProduct(){this.AddToCarro.click();}
    public void BuyProduct(){this.Buy.click();}

    //Autofill

    public void enterName(){this.Name.sendKeys(NAME);}
    public void enterEmail(){this.Email.sendKeys(EMAIL);}
    public void enterPhone(){this.Phone.sendKeys(PHONE);}
    public void enterStreet(){this.Street.sendKeys(STREET);}
    public void enterCity(){this.City.sendKeys(CITY);}
    public void enterZip(){this.Zip.sendKeys(ZIP);}
    public void enterCountry(){this.Country.sendKeys(COUNTRY);}
    public void enterCardNr(){this.CardNr.sendKeys(CARDNR);}
    public void enterCardMonth(){this.CardMonth.sendKeys(CARDMONTH);}
    public void enterCardYear(){this.CardYear.sendKeys(CARDYEAR);}
    public void enterCardCode(){this.CardCode.sendKeys(CARDCODE);}
    public void AcceptAGBS(){this.AGBS.click();}
    public void ConfirmPurchase(){this.Confirm.click();}


}
