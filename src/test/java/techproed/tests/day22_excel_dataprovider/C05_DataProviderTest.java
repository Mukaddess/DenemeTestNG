package techproed.tests.day22_excel_dataprovider;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.DataProviderPage;
import techproed.utilities.DataProviderUtils;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C05_DataProviderTest {


    @Test(dataProvider = "positiveTestData", dataProviderClass = DataProviderUtils.class)
    public void test01(String age) {

        //https://dataprovider.netlify.app/ adresine gidelim
        Driver.getDriver().get("https://dataprovider.netlify.app/");
        ReusableMethods.waitForSecond(2);
        //BlackBoxTesting techniques ile otomasyon test yapalim
        DataProviderPage dataProviderPage = new DataProviderPage();
        ReusableMethods.waitForSecond(2);
        dataProviderPage.searchBox.sendKeys(age, Keys.TAB, Keys.ENTER);
        ReusableMethods.waitForSecond(2);
        Assert.assertTrue(dataProviderPage.positiveVerifyMessage.isDisplayed());
      //  Driver.closeDriver();

    }

    @Test(dataProvider = "negativeTestData", dataProviderClass = DataProviderUtils.class)
    public void test02(String age) {
        //https://dataprovider.netlify.app/ adresine gidelim
        Driver.getDriver().get("https://dataprovider.netlify.app/");
        ReusableMethods.waitForSecond(2);
        //BlackBoxTesting techniques ile otomasyon test yapalim
        DataProviderPage dataProviderPage = new DataProviderPage();
        dataProviderPage.searchBox.sendKeys(age, Keys.TAB, Keys.ENTER);
        ReusableMethods.waitForSecond(1);
        Assert.assertTrue(dataProviderPage.negativeVerifyMessage.isDisplayed());
        Driver.closeDriver();

    }


    @Test(dataProvider = "invalidTestData", dataProviderClass = DataProviderUtils.class)
    public void test03(String age) {
        //https://dataprovider.netlify.app/ adresine gidelim
        Driver.getDriver().get("https://dataprovider.netlify.app/");
        ReusableMethods.waitForSecond(1);
        //BlackBoxTesting techniques ile otomasyon test yapalim
        DataProviderPage dataProviderPage = new DataProviderPage();
        dataProviderPage.searchBox.sendKeys(age, Keys.TAB, Keys.ENTER);
        ReusableMethods.waitForSecond(1);
        Assert.assertTrue(dataProviderPage.invalidVerifyMessage.isDisplayed());
        Driver.closeDriver();

    }

    @Test(dataProvider = "emptyCaracterTestData", dataProviderClass = DataProviderUtils.class)
    public void test04(String age) {
        //https://dataprovider.netlify.app/ adresine gidelim
        Driver.getDriver().get("https://dataprovider.netlify.app/");
        ReusableMethods.waitForSecond(2);
        //BlackBoxTesting techniques ile otomasyon test yapalim
        DataProviderPage dataProviderPage = new DataProviderPage();
        ReusableMethods.waitForSecond(2);
        dataProviderPage.searchBox.sendKeys(age, Keys.TAB, Keys.ENTER);
        ReusableMethods.waitForSecond(2);
        Assert.assertTrue(dataProviderPage.emptyCaracterVerifyMessage.isDisplayed());

       //Driver.closeDriver();


    }
}