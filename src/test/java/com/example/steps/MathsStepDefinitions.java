package com.example.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.BaseTest;
import com.example.app.Calculator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assert;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;

public class MathsStepDefinitions extends BaseTest {

    int a = 0;
    int b = 0;
    int total = 0;

    Calculator calculator = new Calculator();

    @Given("a is {int}")
    public void givenAIs(int value) {
        a = value;
    }

    @Given("b is {int}")
    public void givenBIs(int value) {
        b = value;
    }

    @When("I add a and b")
    public void iAddAAndB() {
        total = calculator.add(a,b);
    }

    @Then("the total should be {int}")
    public void theTotalShouldBe(int expectedTotal) {
        assertThat(total).isEqualTo(expectedTotal);
    }

    @When("user on calculator page")
    public void userOnCalculatorPage() {
        String titleText = calculatorPage.getTitle();
        Assertions.assertEquals("Calculator", titleText);
        boolean isDisplayed = calculatorPage.checkHamburgerBtnAppear();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @And("user input {string} on field first value")
    public void userInputOnFieldFirstValue(String firstValue) {
        calculatorPage.inputFirstValue(firstValue);
    }

    @And("user input {string} on field second value")
    public void userInputOnFieldSecondValue(String secondValue) {
        calculatorPage.inputSecondValue(secondValue);
    }

    @And("user click drop down")
    public void userClickDropDown() {
        calculatorPage.clickBtnDropDown();
    }

    @And("choose arithmetic operations addition")
    public void chooseArithmeticOperationsAddition() {
        calculatorPage.clickBtnAddition();
    }

    @When("user click button equal")
    public void userClickButtonEqual() {
        calculatorPage.clickBtnEqual();
    }

    @And("user successfully addition")
    public void userSeeResult() {
        String titleText = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : 3", titleText);
    }

    @And("user successfully addition numbers decimal")
    public void userSuccessfullyAdditionNumbersDecimal() {
        String titleText = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : 1", titleText);
    }

    @And("choose arithmetic operations subtraction")
    public void chooseArithmeticOperationsSubtraction() {
        calculatorPage.clickBtnSubtraction();
    }

    @And("user successfully subtraction numbers")
    public void userSuccessfullySubtractionNumbers() {
        String titleText = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : 4", titleText);
    }

    @And("choose arithmetic operations multiplication")
    public void chooseArithmeticOperationsMultiplication() {
        calculatorPage.clickBtnMultiplication();
    }

    @And("user successfully multiplication numbers")
    public void userSuccessfullyMultiplicationNumbers() {
        String titleText = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : 25", titleText);
    }

    @And("choose arithmetic operations division")
    public void chooseArithmeticOperationsDivision() {
        calculatorPage.clickBtnDivision();
    }

    @And("user successfully division numbers")
    public void userSuccessfullyDivisionNumbers() {
        String titleText = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : 5", titleText);
    }
}
