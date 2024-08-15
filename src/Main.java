package main

import java.util.Scanner;
import factorial.FactorialCalculator;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long factorial = FactorialCalculator.calculateFactorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);

        scanner.close();
    }
}
