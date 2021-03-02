package com.cybertek.step_defintion;

import com.cybertek.utillites.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void setUp(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            //Byte[]
        }
    }

}
