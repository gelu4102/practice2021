package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBox {

    @FindBy(xpath = "//input[@type='checkbox'][1]")
    public WebElement checkBox1;

    @FindBy(xpath = "//input[@type='checkbox'][2]")
    public WebElement checkBox2;





}
