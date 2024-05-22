package techproed.tests.day20_pom;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;

public class C04_PropertiesTest {

    @Test
    public void test01() {
     String url  = ConfigReader.getProperty("amazonUrl");
        System.out.println("url = " + url);

    }




}
