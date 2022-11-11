package org.sda.lambdaHomework;

/**
 * Create and present the usage of lambda expression
 * a) addition, subtraction, multiplication, division
 * b) the sum of the elements (int type) of the list
 * c) number of words in the input expression (list containing elements of type String)
 * d) List before and after sorting (use the Arrays class and lambda expressions : String :: CompareToIgnoreCase as a comparator
 *
 * @author Kätlin Padesaar-Korela
 */

public class CalculatorLambda {

    //Lambda expression
    // a) addition, subtraction, multiplication, division

    @FunctionalInterface
    interface Calculator {
        int calculatorCal(int a, int b);

    }

    public int calculate(int a, int b, Calculator calculator) {
        return calculator.calculatorCal(a, b);
    }

    private void addition() {
        Calculator additionCal = (int a, int b) -> a + b;
        System.out.println("100 + 40 = " + calculate(100, 40, additionCal));
    }

    private void subtraction() {
        Calculator subtractionCal = (int a, int b) -> a - b;
        System.out.println("100 - 40 = " + calculate(100, 40, subtractionCal));
    }

    private void multiplication() {
        Calculator multiplicationCal = (int a, int b) -> a * b;
        System.out.println("100 * 40 = " + calculate(100, 40, multiplicationCal));
    }

    private void division() {
        Calculator divisionCal = (int a, int b) -> a / b;
        System.out.println("100 / 40 = "+ calculate(100, 40, divisionCal));
    }

    public static void main(String[] args) {

        CalculatorLambda calculator = new CalculatorLambda();
        calculator.addition();
        calculator.subtraction();
        calculator.multiplication();
        calculator.division();



    }
}
