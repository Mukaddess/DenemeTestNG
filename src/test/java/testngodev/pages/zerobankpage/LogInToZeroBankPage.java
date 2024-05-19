package testngodev.pages.zerobankpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testngodev.utilities.Driver;

public class LogInToZeroBankPage {
    public LogInToZeroBankPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user_login")
    public WebElement loginBox;

    @FindBy(id = "user_password")
    public WebElement passwordBox;

    @FindBy(name="submit")
    public WebElement signInButton;


}