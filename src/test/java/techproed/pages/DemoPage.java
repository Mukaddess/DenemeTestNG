package techproed.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.util.List;

public class DemoPage {

    public DemoPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@placeholder='First Name']")
    public WebElement firstName;

    @FindBy (xpath = "//input[@type='email']")
    public WebElement emailBox;


    @FindBy (id = "imagesrc")
    public WebElement chooseFile;

    /*
   --------------- fake mail sitesi-------------------
     */

    //fake email sitesine ait zamandan kazanmak icin burada olusturduk
    @FindBy (id = "email")
    public WebElement fakeEmail;










}