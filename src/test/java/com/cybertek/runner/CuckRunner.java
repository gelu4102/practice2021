package com.cybertek.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/cybertek/step_defintion",
        dryRun = true,
        publish = true
)

public class CuckRunner {
}
