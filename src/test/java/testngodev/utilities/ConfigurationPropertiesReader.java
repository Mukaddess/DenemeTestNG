package testngodev.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationPropertiesReader {

public static String getProperty(String key){
    Properties properties =new Properties();
    try {


    FileInputStream fis = new FileInputStream("configuration.Properties");
    properties.load(fis);

   return properties.getProperty(key);
} catch (IOException e){
        throw new RuntimeException(e);
    }
}

}
