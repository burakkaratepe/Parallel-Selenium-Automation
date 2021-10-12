package Managers;

import java.util.Properties;

public class ConfigurationManager {
    public String getConfig(String name) {
        Properties config = new Properties();
        String configFilePath = "config.properties";
        try {
            config.load(ClassLoader.getSystemResourceAsStream(configFilePath));
            return config.getProperty(name);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
