package testngodev.tests.zerobank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.domsnapshot.model.ArrayOfStrings;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testngodev.pages.zerobankpage.HomePage;
import testngodev.pages.zerobankpage.LogInToZeroBankPage;
import testngodev.pages.zerobankpage.OnlineBankingPage;
import testngodev.pages.zerobankpage.PayBillsPage;
import testngodev.utilities.ConfigurationPropertiesReader;
import testngodev.utilities.Driver;
import testngodev.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class C01_ZeroBankTest {
    HomePage homePage = new HomePage();
    LogInToZeroBankPage logInToZeroBankPage = new LogInToZeroBankPage();
    OnlineBankingPage onlineBankingPage = new OnlineBankingPage();
    PayBillsPage payBillsPage = new PayBillsPage();
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void zeroBankTest() {
        //1. Adresine gidin başlığın  içerdiğini test edin
        Driver.getDriver().get(ConfigurationPropertiesReader.getProperty("zeroBankUrl"));
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Personal"), "Baslik aranan kelimeyi  icermiyor. ");
        //2. Sign in butonuna basin
        ReusableMethods.waitForSecond(2);
        homePage.singInButon.click();
        //3. Login kutusuna "username" yazin
        logInToZeroBankPage.loginBox.sendKeys(ConfigurationPropertiesReader.getProperty("loginBox"));
        ReusableMethods.waitForSecond(2);
        //4. Password kutusuna "password" yazin
        logInToZeroBankPage.passwordBox.sendKeys(ConfigurationPropertiesReader.getProperty("passwordBox"));
        ReusableMethods.waitForSecond(2);
        //5. Sign in tusuna basin
        logInToZeroBankPage.signInButton.click();
        Driver.getDriver().navigate().back();
        //6. Online banking menusu icinde Pay Bills sayfasina gidin başlığın Zero içerdiğini test edin
        onlineBankingPage.onLineBankingLink.click();
        onlineBankingPage.payBilleLink.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Zero"), "Baslik aranan kelimeyi  icermiyor. ");
        //7. "Purchase Foreign Currency" tusuna basin
        payBillsPage.PurchaseForeignCurrencyLink.click();
        //8. "Currency" drop down menusunden Eurozone'u secin
        payBillsPage.currencyDropDownMenu.click();
        // payBillsPage.currencyDropDownMenu.sendKeys("Eurozone (euro)");//1.yol-
        ReusableMethods.ddmVisibleText(payBillsPage.currencyDropDownMenu, "Eurozone (euro)");
        //9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        softAssert.assertTrue(payBillsPage.currencyDropDownMenu.getText().contains("Eurozone (Euro)"), "Istenilen secim yapilamadi");


        //10.soft assert kullanarak DropDown listesinin su secenekleri oldugunu test

        Select select =new Select(payBillsPage.currencyDropDownMenu);
        List<String> expectedCurrencies= Arrays.asList(
                "Select One", "Australia (dollar)", "Canada (dollar)", "Switzerland (franc)", "China (yuan)", "Denmark (krone)",
                "Eurozone (euro)", "Great Britain (pound)", "Hong Kong (dollar)", "Japan (yen)", "Mexico (peso)", "Norway (krone)",
                "New Zealand (dollar)", "Sweden (krona)", "Singapore (dollar)", "Thailand (baht)");
        System.out.println(expectedCurrencies);
        List<String>  actualCurrencies = new ArrayList<>();
        List<WebElement> currenciesLIst = select.getOptions();

        for (WebElement w : currenciesLIst){
           actualCurrencies.add(w.getText());

        }
        System.out.println(actualCurrencies);
        softAssert.assertEquals(actualCurrencies,expectedCurrencies,"Currency drop down listesinin farkli oldugu test dildi");
        softAssert.assertAll();

        Driver.getDriver().quit();

    }
}

//1."http://zero.webappsecurity.com/" Adresine gidin başlığın Personal içerdiğini test edin
//2. Sign in butonuna basin
//3. Login kutusuna "username" yazin
//4. Password kutusuna "password" yazin
//5. Sign in tusuna basin
//6. Online banking menusu icinde Pay Bills sayfasina gidin başlığın Zero içerdiğini test edin
//7. "Purchase Foreign Currency" tusuna basin
//8. "Currency" drop down menusunden Eurozone'u secin
//9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
//10.soft assert kullanarak DropDown listesinin su secenekleri oldugunu test
//edin ("Select One", "Australia (dollar)", "Canada (dollar)","Switzerland
//(franc)","China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain
//(pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway
//(krone)","New Zealand (dollar)","Sweden (krona)","Singapore
//(dollar)","Thailand (baht)")}