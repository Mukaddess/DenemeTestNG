package techproed.tests.day22_excel_dataprovider;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.AmazonPage;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C03_DataProvider {

    @DataProvider(name="googleProducts")
    public static Object[][] products() {
        return new Object[][]{
                {"laptop"},{"iphone"},{"mouse"},{"keyboard"}
        };
    }



    @Test(dataProvider = "googleProducts")//product un uzerinde bekleyince  dataprovider notasyonunu otomatik olusturuyor
    public void test01(String product) {

        //Google sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        ReusableMethods.waitForSecond(3);
        //DataProvider ile istediğimiz ürünleri aratalım
        GooglePage googlePage = new GooglePage();
        googlePage.searchBox.sendKeys(product, Keys.ENTER);

        //sayfayı kapatalım
        Driver.closeDriver();
    }


    @DataProvider
    public static Object[][] amazonproducts() {
        return new Object[][]{
                {"laptop"},{"iphone"},{"mouse"},{"keyboard"}
        };
    }

    @Test(dataProvider = "amazonproducts")
    public void test02(String data) {
        //amazon sayfasına gidelim,
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //aramakutusunda dataprovider'dan gelen verileri aratalım
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.handleCaptcha();//captcha cikmasi durumunda handle eder cikmamasi durumunda hata vermez
        amazonPage.searchBox.sendKeys(data,Keys.ENTER);

        //sayfayı kapatınız
        Driver.closeDriver();
    }






}