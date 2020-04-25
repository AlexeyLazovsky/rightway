package steps;
import app.Calculator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.*;

public class CalculatorStepsDefinition {
    private Calculator calculator;
    int firstNum;
    int secondNum;

    @Given("calculator app is up and running")
    public void startCalculator() {
        calculator = new Calculator();
        System.out.println("app.Calculator was turned on");
    }

    @When("first number equals {int}")
    public void firstNumberEquals(int firstNum) {
        this.firstNum = firstNum;
        System.out.println("The first num received is " + firstNum);
    }

    @And("second number equals {int}")
    public void secondNumberEquals(int num) {
        secondNum = num;
        System.out.println("The second num received is " + num);

    }

    @Then("the result should be equal {int}")
    public void theResultShouldBeEqual(int expectedResult) {
        int actualResult = calculator.addTwoNumbers(firstNum, secondNum);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
