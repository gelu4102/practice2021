package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDowns {

  @FindBy(xpath="//select[@id='dropdown']")
    public WebElement dropdown;

  @FindBy(xpath = "//option[@value='IL']")
  public WebElement stateSelection;
  @FindBy(xpath = "//option[@value='java']")
  public WebElement programingLang;
  @FindBy(xpath = "//a[@class='btn btn-secondary dropdown-toggle']")
  public WebElement webSite;

}
