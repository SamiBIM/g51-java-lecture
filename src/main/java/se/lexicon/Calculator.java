package se.lexicon;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int operationType = scanner.nextInt();
       double result = performOperation(operationType);
        System.out.println("Result:" + result);
               double number1, number2;

    }

    public static void displayMenu() {
        System.out.println("Select an operation type");
        System.out.println("Operation");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        System.out.println("Select an operation:");

    }

    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number");
        double number = scanner.nextDouble();
        return number;

    }

    public static double performOperation (int operationType) {
        double result= 0;
        double number1 = getNumber();
        double number2 = getNumber();


            switch (operationType) {
            case 1:
                result = number1 + number2;
                break;
            //add
            case 2:
                result = number1 - number2;

            //sub
            break;
            case 3:
                result = number1 * number2;

            //multi
            break;
            case 4:
                result = number1 / number2;
                break;
            //divide
            default:
                System.out.println("Invalid input, Please enter a correct input");
        }
        return result;
    }
}
