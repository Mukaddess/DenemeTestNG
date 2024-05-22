package techproed.tests.day21_pom_excel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_PositiveLoginTest {
    //Name: US100201_Admin_Login
//Description:
//Login with admin information
//Acceptance Criteria:
//As admin, I should be able to log in to the application
//email: ada@ada.com
//password: 12345
//https://www.bluerentalcars.com/



    @Test
    public void test01() {

        //Name: US100201_Admin_Login
        //Description:
        //Admin bilgileriyle giriş
        //Acceptance Criteria:
        //Admin olarak, uygulamaya giriş yapabilmeliyim
        //email : ada@ada.com
        //password: 12345
        //https://www.bluerentalcars.com/
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.loginButton.click();
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("blueRentalEmail"));
        blueRentalPage.password.sendKeys(ConfigReader.getProperty("blueRentalPassword"), Keys.ENTER);
        Assert.assertTrue(blueRentalPage.loginVerify.getText().contains("ada admin"));

        Driver.closeDriver();







    }
}


