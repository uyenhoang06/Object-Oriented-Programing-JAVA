package com.patterns.strategy.pseudocode;

import java.util.Scanner;

public class ExampleApplication {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();

        System.out.print("Enter the second number: ");
        int b = in.nextInt();

        System.out.print("Enter the action: ");
        String action = in.next();
        if (action.equals("addition")) {
            context.setStrategy(new ConcreteStrategyAdd());
        }
        if (action.equals("subtraction")) {
            context.setStrategy(new ConcreteStrategySubtract());
        }
        if (action.equals("multiply")) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        int result = context.executeStrategy(a, b);
        System.out.println("result is: " + result);
    }
}
