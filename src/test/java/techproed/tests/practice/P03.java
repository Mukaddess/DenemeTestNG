package techproed.tests.practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class P03 {

//Go to https://books-pwakit.appspot.com/
    //search for selenium in searchbox
    //test if the header contains selenium

    @Test
    public void test01() {

        //https://books-pwakit.appspot.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("booksUrl"));

        //searchboxta selenium aratin
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement searchBox = (WebElement) js.executeScript("return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\")");

        //basligin selenium icerdigini test edin
        searchBox.sendKeys("selenium", Keys.ENTER);
        ReusableMethods.waitForSecond(1);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("selenium"));

        //Sayfayi kapatin
        Driver.closeDriver();
    }
}