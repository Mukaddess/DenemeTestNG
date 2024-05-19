package testngodev.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
   static WebDriver driver;

   public static WebDriver getDriver(){

      if(driver==null) {
          switch (ConfigurationPropertiesReader.getProperty("browser")){

              case "chrome":
                  driver=new ChromeDriver();
              break;
              case  " edge":
                  driver = new EdgeDriver();
              break;
              case " firefox":
                  driver = new FirefoxDriver();
              break;
              default:

                  driver = new ChromeDriver();
          }

          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      }
       return driver;
   }

   public void  closeDriver(){
       if(driver!=null){
           driver.close();
           driver=null;
       }
   }




}
