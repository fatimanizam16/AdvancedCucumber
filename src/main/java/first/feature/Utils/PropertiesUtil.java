package first.feature.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    public static Properties properties = new Properties();
    static FileInputStream file;

    public static Properties loadApplicationProps(){

        try {
            file = new FileInputStream("src/test/resources/configuration/application.properties");
            properties.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException a){
            a.printStackTrace();
        }
        return properties;
    }

    public static Properties loadFrameworkProps(){

        try {
            file = new FileInputStream("src/test/resources/configuration/framework.properties");
            properties.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException a){
            a.printStackTrace();
        }
        return properties;
    }
    public static Properties loadUserProps(){

        try {
            file = new FileInputStream("src/test/resources/configuration/user.properties");
            properties.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException a){
            a.printStackTrace();
        }
        return properties;
    }
}
