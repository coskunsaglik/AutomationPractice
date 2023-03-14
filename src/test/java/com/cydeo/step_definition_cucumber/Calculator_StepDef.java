package com.cydeo.step_definition_cucumber;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Calculator_StepDef {
    int actualResult;
    @Given("Calculator is open")
    public void calculator_is_open() {
        System.out.println("This is from Given");
    }
    @When("I add {int} with {int}")
    public void i_add_with(int num1, int num2) {

        System.out.println("When I add "+num1+" with "+num2);
        actualResult = num1+num2;
    }
    @Then("I should get {int}")
    public void i_should_get(int expectedResult) {
        System.out.println("Then I should get "+expectedResult);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @When("I add {int} with {int} asd")
    public void iAddWithAsd(int arg0, int arg1) {
        Driver.getDriver().get("https://google.com/");
    }
}
