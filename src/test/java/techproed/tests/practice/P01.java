package techproed.tests.practice;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.PracticePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.util.List;

public class P01 {

// Go to https://practicesoftwaretesting.com/#/
//test if the page title contains "Software Testing"
//test if the page url contains the word "practice"
//test that the number of products displayed on the page is 9
// test whether each product is displayed on the page
// print the products displayed on the page to the console
//test that the number of products containing "hammer" displayed on the page is 4


    @Test
    public void test01() {

        //  https://practicesoftwaretesting.com/#/ sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("practiceUrl"));

        //  sayfa basliginin "Software Testing" icerdigini test edin
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Software Testing"));

        //  sayfa url'nin "practice" kelimesini icerdigini test edin
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("practice"));

        //  sayfada görüntülenen ürün sayisinin 9 oldugunu test edin
        PracticePage practicePage = new PracticePage();
        List<WebElement> products =  practicePage.products;
        Assert.assertEquals(products.size(),9);

        //  her bir ürününün sayfada görüntülendigini test edin
        for ( WebElement  w : products){
            Assert.assertTrue(w.isDisplayed());
        }

        //  sayfada görüntülenen ürünleri konsol a yazdirin
        products.forEach(t-> System.out.println(t.getText()));

        //  sayfada görüntülenen ürünlerden "hammer" iceren ürün sayisinin 4 oldugunu test edin

        int counter=0;
        for( WebElement w : products){
            if(w.getText().contains("hammer")){
                counter++;
            }
        }
        Assert.assertEquals(counter,4);

        Driver.closeDriver();

    }// bilerek bug yaptik
}

















