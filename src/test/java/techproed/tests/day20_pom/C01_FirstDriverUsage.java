package techproed.tests.day20_pom;


import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class C01_FirstDriverUsage {

    @Test
    public void test01() {
        Driver.closeDriver();
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://facebook.com");
        Driver.getDriver().get("https://google.com");


//        Driver driver = new Driver();
//        driver.getDriver().get("https://amazon.com"); //uitilities classinda private conrturoctor yaptik

    }
}