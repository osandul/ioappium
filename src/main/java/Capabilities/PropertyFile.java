package Capabilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {

        private static String pathToAndroidConfigFile = "src/configAndroid.properties";
        private static String pathToConfigFile = "src/config.properties";

        public static String getAndroidProperty (String key){
            return getValuePipeline ( pathToAndroidConfigFile,key);
        }
        public static String getPropertyValue(String key) {
            return getValuePipeline(pathToConfigFile,key);
        }

    private static Properties getPropertyFile(String pathToConfigFile) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream (pathToConfigFile));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    private static String getSystemProperty(String key) {
        return System.getProperty(key);
    }
    private static String getPropertyValueFromFile(String path,String key) {
        return  getPropertyFile ( path ).getProperty ( key );
        }

    private static String getValuePipeline(String path,String propName) {
        String systemProperty = getSystemProperty(propName);
        String localProperty = getPropertyValueFromFile (path,propName);
        if (systemProperty != null) {
            return systemProperty;
        } else if (localProperty != null) {
            return localProperty;
        }
        return "Property Value is not defined";
    }

}