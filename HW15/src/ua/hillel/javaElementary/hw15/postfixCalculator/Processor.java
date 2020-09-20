package ua.hillel.javaElementary.hw15.postfixCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Processor {

    private Operation calc = new Operation();
    private ArrayList<String> expression;

    public Processor() {
        expression = new ArrayList<>();
    }

    private ArrayList<String> performAction(String act) {
        ArrayList<String> result = new ArrayList<>();
        Boolean performed = false;
        for (int i = 0; i < expression.size(); i++) {
            if (i + 1 < expression.size() && performed == false) {
                if (expression.get(i + 1) == act) {
                    Number firstValue = Double.parseDouble(expression.get(i));
                    Number secondValue = Double.parseDouble(expression.get(i + 2));
                    switch (act) {
                        case "*":
                            result.add(Objects.toString(calc.multiply(firstValue, secondValue)));
                            break;
                        case "/":
                            result.add(Objects.toString(calc.divide(firstValue, secondValue)));
                            break;
                        case "+":
                            result.add(Objects.toString(calc.add(firstValue, secondValue)));
                            break;
                        case "-":
                            result.add(Objects.toString(calc.subtract(firstValue, secondValue)));
                            break;
                    }
                    i += 2;
                    performed = true;
                } else result.add(expression.get(i));
            } else result.add(expression.get(i));
        }
        return result;
    }

    private void updateExpression(ArrayList<String> newExpression) {
        expression.clear();
        expression.addAll(newExpression);
        newExpression.clear();
    }

    private void processActions() {
        ArrayList<String> actions = new ArrayList<>(Arrays.asList("*", "/", "+", "-"));
        for (String action : actions) {
            while (expression.contains(action)) {
                ArrayList<String> result = performAction(action);
                updateExpression(result);
            }
        }
    }

    private String convertToString() {
        String result = "";
        for (String str : expression) {
            result += str;
        }
        return result;
    }

    public String eval(String[] args) {
        parseInput(args);
        processActions();
        return convertToString();
    }

    private void parseInput(String[] args) {
        for (String item : args) {
            expression.add(item);
        }
    }


}
