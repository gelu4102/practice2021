package com.cybertek.step_defintion;

import com.cybertek.pages.CheckBox;
import com.cybertek.utillites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox_StepDefintion {

    CheckBox checkBox = new CheckBox();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() throws InterruptedException {
        Driver.getDriver().get("http://practice.cybertekschool.com/checkboxes");

        Thread.sleep(2000);
    }
    @When("user click on the second check box")
    public void user_click_on_the_second_check_box() throws InterruptedException {
        Thread.sleep(5000);
            checkBox.checkBox1.click();
    }
    @Then("user should be able to see only the second check box is selected")
    public void user_should_be_able_to_see_only_the_second_check_box_is_selected() throws InterruptedException {


       Thread.sleep(2000);
        Assert.assertTrue(checkBox.checkBox1.isSelected());
        Driver.getDriver().close();

    }

}
