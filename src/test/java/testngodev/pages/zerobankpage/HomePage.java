package testngodev.pages.zerobankpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testngodev.utilities.Driver;

public class HomePage {

public HomePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
@FindBy(id="signin_button")
public WebElement singInButon;

//merhaba Murvet hanim nasilsin .bugun neler yaptin
//merhaba Murvet hanim nasilsin .bugun neler yaptin
//merhaba Murvet hanim nasilsin .bugun neler yaptin

}
