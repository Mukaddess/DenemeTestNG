package techproed.tests.day20_pom;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.AmazonPage;
import techproed.utilities.Driver;

public class C02_PageClassUsage {

    //Page objectini class seviyesinde olusturmak diger test methodlarindan da erisilebilirlik acisindan
    //daha güzel bir yöntemdir
    AmazonPage amazonPage = new AmazonPage();

    @Test
    public void test01() {
        //amazon sayfasina gidelim
        Driver.getDriver().get("https://amazon.com");

        // search box ta iphone aratalim
        amazonPage.searchBox.sendKeys("iphone", Keys.ENTER);
    }
}





