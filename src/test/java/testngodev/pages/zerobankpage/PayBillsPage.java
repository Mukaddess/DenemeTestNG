package testngodev.pages.zerobankpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testngodev.utilities.Driver;

public class PayBillsPage {
    public PayBillsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
   @FindBy(partialLinkText ="Purchase Foreign Currency" )
    public WebElement PurchaseForeignCurrencyLink;


    @FindBy(id="pc_currency" )
    public WebElement currencyDropDownMenu;

}
