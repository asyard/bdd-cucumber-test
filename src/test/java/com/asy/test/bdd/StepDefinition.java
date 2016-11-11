package com.asy.test.bdd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by asy
 */
public class StepDefinition {

    private Calculator calculator;

    @Given("^I have entered (\\d+) and (\\d+) into the calculator$")
    public void i_have_entered_into_the_calculator(Integer firstNumber, Integer secondNumber) throws Throwable {
        calculator = new Calculator();
        calculator.firstNumber = firstNumber;
        calculator.secondNumber = secondNumber;
    }

    @When("^I press (.*)$")
    public void i_press(String operator) throws Throwable {
        calculator.operator = operator;
    }

    @Then("^result should be (\\d+) on the screen")
    public void result_should_be(Integer expectedResult) throws Throwable {
        assertThat(calculator.performOperation(), equalTo(expectedResult));
    }
}
