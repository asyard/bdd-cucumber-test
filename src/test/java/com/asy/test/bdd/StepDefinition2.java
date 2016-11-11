package com.asy.test.bdd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by asy
 */
public class StepDefinition2 {
    Calculator calculator;

    @Given("^a calculator I just turned on$")
    public void a_calculator_i_turned() throws Throwable {
        calculator = new Calculator();
        calculator.operator = "+";
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void i_add(Integer firstNumber, Integer secondNumber) throws Throwable {
        calculator.firstNumber = firstNumber;
        calculator.secondNumber = secondNumber;
    }

    @Then("^the result is (\\d+)")
    public void result_should_be(Integer expectedResult) throws Throwable {
        assertThat(calculator.performOperation(), equalTo(expectedResult));
    }
}
