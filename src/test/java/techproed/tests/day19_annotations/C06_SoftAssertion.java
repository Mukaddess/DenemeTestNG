package techproed.tests.day19_annotations;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C06_SoftAssertion {

    @Test(groups ="smoke")
    public void test01() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(12,2);
        System.out.println("test calismaya devam etti 1");

        softAssert.assertNotEquals(3,3);
        System.out.println("test calismaya devam etti 2");

        softAssert.assertTrue(3>12);
        System.out.println("test calismaya devam etti 3");

        softAssert.assertFalse(12>3);
        System.out.println("test calismaya devam etti 4");

        softAssert.assertAll();
        System.out.println("fail oldugu icin bu yazi consolde görülmeyecek");


        /*
        SoftAssert'un hata bulsa bile calismaya devam etme özelligi assertAll()' a kadardir
        Eger assertAll() da fail rapor edilirse calisma durdurulur, ve classin kalan kismi calistirilmaz
         */
    }

}



