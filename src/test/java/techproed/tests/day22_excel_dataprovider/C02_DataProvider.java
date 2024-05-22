package techproed.tests.day22_excel_dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C02_DataProvider {

    /*
    Dataprovider bir cok veriyi test caslerde loop kullanmadan aktarmak icin testng den gelen bir özelliktir
    2 boyutlu object array return eder,
    Dataprovideri kullanabilmek icin @Test notasyonundan sonra
    parametre olarak dataprovider yazip asagidaki örnekte oldugu gibi bir isim veririz.
    Bu verileri kullanabilmek icin test methodunada data tipine uygun parametre ekleriz
    inttelijden dataprovideri olusturmasi icin yardim alabiliriz,
    sari uyarinin üzerinde bekledigimizde create ... seklinde cikan uyariya tiklamamiz yeterli olacaktir
    bizim data provedirda belirttigimiz data adedince ilgili test methodumuz tekrar tekrar calistirilir
    bunu arka planda testng kendisi otomatik olarak yapar
     */

    @DataProvider
    public static Object[][] isimler() {// bu yapiyi uzerinde bekleyerek otmatik yaptirdik
        return new Object[][]{
                {"ali@can.com","ali",5,true},
                {"veli@can.com","veli",7,false},
                {"ayse@can.com","ayse",8,true}
        };
    }

    @Test(dataProvider = "isimler")
    public void test01(String email,String password,int age,boolean isValid) {
        System.out.println(email);
        System.out.println(password);
    }



}