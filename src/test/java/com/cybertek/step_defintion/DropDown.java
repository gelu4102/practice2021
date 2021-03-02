package com.cybertek.step_defintion;

import com.cybertek.utillites.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DropDown {


    @Test
    public void optionDropDown() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement optionDropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select = new Select(optionDropDown);

       // select.selectByValue("2");

    }
    @Test
    public void yearDropDown(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement yearDropDown = driver.findElement(By.id("year"));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(yearDropDown));
        Select select = new Select(yearDropDown);
        select.selectByVisibleText("2011");

        Select select1 = new Select(driver.findElement(By.id("month")));
        select1.selectByVisibleText("April");

        Select select2 = new Select(driver.findElement(By.id("day")));
        select2.selectByVisibleText("5");



    }
   @Test
   public void stateSelection(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement stateSelection = driver.findElement(By.id("state"));
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(stateSelection));
        Select select = new Select(stateSelection);
        select.selectByVisibleText("Illinois");

   }

   @Test
    public void programingLang(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement programingLang = driver.findElement(By.name("Languages"));
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(programingLang));
        Select select = new Select(programingLang);
        select.selectByVisibleText("Java");
   }
   @Test
    public void webSite(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement webSite = driver.findElement(By.className("btn btn-secondary dropdown-toggle"));
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(webSite));
        Select select = new Select(webSite);
        select.selectByVisibleText("Google");
   }
}
//div[@class='dropdown-menu']
//a[@id='dropdownMenuLink']