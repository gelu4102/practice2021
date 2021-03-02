package com.cybertek.utillites;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();
    static{
        try (InputStream in = new FileInputStream("configaration.properties")) {
            properties.load(in);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to load properties file");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
