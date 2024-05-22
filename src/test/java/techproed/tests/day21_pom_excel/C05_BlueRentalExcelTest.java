package techproed.tests.day21_pom_excel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;
import techproed.utilities.ReusableMethods;

public class C05_BlueRentalExcelTest {

    @Test
    public void test01() {

        //BlueRentalCar sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        //Login buttonuna tıklayalım
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.loginButton.click();

        //Excel dosyasındaki herhangi bir email ve password ile login olalım
        String path ="src/test/java/techproed/resources/adminTestData.xlsx";
        String pageName="customer_info";
        ExcelReader excelReader = new ExcelReader(path,pageName);
        String email =excelReader.getCellData(1,0);
        String password =excelReader.getCellData(1,1);

        blueRentalPage.email.sendKeys(email);
        blueRentalPage.password.sendKeys(password, Keys.ENTER);
        ReusableMethods.waitForSecond(2);
        //Girilen email ile giriş yapıldığını doğrulayın

        blueRentalPage.loginVerify.click();
        ReusableMethods.waitForSecond(2);

        blueRentalPage.profile.click();
        String profileEmail = blueRentalPage.profileEmail.getText();

        ReusableMethods.waitForSecond(3);
        Assert.assertEquals(profileEmail,email);

        //sayfayı kapatalım

        Driver.closeDriver();

    }
}



