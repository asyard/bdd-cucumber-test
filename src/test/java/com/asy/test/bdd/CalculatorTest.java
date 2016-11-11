package com.asy.test.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by asy
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com.asy.test.bdd"
        //format = {"pretty", "html:target/cucumber-html-report", "json-pretty:target/cucumber-report.json"}
)

public class CalculatorTest {
}
