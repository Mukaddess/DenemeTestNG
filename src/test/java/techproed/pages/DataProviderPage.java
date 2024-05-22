package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class DataProviderPage {

    public DataProviderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "age")
    public WebElement searchBox;

    @FindBy(xpath = "//*[.='Yaş doğrulandı!']")
    public WebElement positiveVerifyMessage;

    @FindBy(xpath = "//*[.='Yaş 18 ile 100 arasında olmalıdır.']")
    public WebElement negativeVerifyMessage;


    @FindBy(xpath = "//*[.='Geçersiz yaş!']")
    public WebElement invalidVerifyMessage;

    @FindBy(xpath = "//*[.='Yaş alanı boş bırakılamaz!']")
    public WebElement emptyCaracterVerifyMessage;

}