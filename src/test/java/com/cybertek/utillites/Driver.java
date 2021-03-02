package com.cybertek.utillites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

    private static WebDriver driver;
    private Driver(){
    }
    public static WebDriver getDriver(){

        String browser = ConfigurationReader.getProperty("browser");
        if (driver == null) {
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "IE":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                default:
                    System.out.println("No such browser");
            }
        }
        return driver;
    }

    public void close(){
        if (driver != null){
            driver.close();
            driver.quit();
        }
    }


}
