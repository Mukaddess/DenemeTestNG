package techproed.tests.practice;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import techproed.pages.DemoPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class P02 {


    //Go to https://demo.automationtesting.in/Register.html
    //fill firstname, secondname, address fields with faker
    // Get the fake email by going to https://www.fakemail.net/
    // go back and fill in the email address field with this email
    // upload a file to the page
    Faker faker = new Faker();
    DemoPage demoPage = new DemoPage();

    @Test
    public void test01() {

        //https://demo.automationtesting.in/Register.html adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("demoUrl"));
        ReusableMethods.waitForSecond(3);

        // faker ile firstname, secondname, adress alanlarini doldurun
        demoPage.firstName.sendKeys(
                faker.name().firstName(), Keys.TAB,
                faker.name().lastName(), Keys.TAB,
                faker.address().fullAddress()
        );


        // https://www.fakemail.net/ adresine giderek fake maili alin
        ReusableMethods.waitForSecond(3);
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        ReusableMethods.waitForSecond(3);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        ReusableMethods.waitForSecond(2);
        String fakeEmail = demoPage.fakeEmail.getText();

        // geri dönün ve email adress kısmını bu email ile doldurun
        ReusableMethods.switchToWindow(0);
        demoPage.emailBox.sendKeys(fakeEmail);
        ReusableMethods.waitForSecond(2);

        // sayfaya bir dosya yükleyin
        String path = System.getProperty("user.home") + "\\OneDrive\\Masaüstü\\logo.png";
        demoPage.chooseFile.sendKeys(path);


    }
}