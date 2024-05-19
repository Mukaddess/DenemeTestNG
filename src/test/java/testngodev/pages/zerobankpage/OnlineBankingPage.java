package testngodev.pages.zerobankpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testngodev.utilities.Driver;

public class OnlineBankingPage {

    public   OnlineBankingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "onlineBankingMenu")
    public WebElement onLineBankingLink;

    @FindBy(id = "pay_bills_link")
   public WebElement payBilleLink;
}
