package CalculadoraApp;

import java.util.Scanner;

public class CalculadoraConMetodos {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int operation;
                System.out.println("********** App Calculator************************ \n");
                showMenu();

                operation = Integer.parseInt(sc.nextLine());
                if (operation >= 1 && operation <= 4) {
                    executeOperation(operation, sc);
                } else if(operation ==5){
                    System.out.println(" See you later Sr....");
                    break;
                }
            } catch (Exception e) {
                System.out.println("An error has occurred: " + e.getMessage());
             }
            System.out.println();

        }
    }

    private static void showMenu() {

        System.out.println("indicate the operation to be performed ");

        System.out.println("""
                1. Sum
                2. Rest
                3. Multiplication
                4. Division
                5. Exit
                """);

    }

    private static void executeOperation(int operation, Scanner sc) {

        System.out.println("Provide a value");
        double num1 = Double.parseDouble(sc.nextLine());
        System.out.println("Provide a value 2");
        double num2 = Double.parseDouble(sc.nextLine());
        double result;

        switch (operation) {
            //Suma
            case 1 -> {
                result = num1 + num2;
                System.out.println("Result sum: " + result);
            } // Resta
            case 2 -> {
                result = num1 - num2;
                System.out.println("Result rest: " + result);
            } // Multiplicacion
            case 3 -> {
                result = num1 * num2;
                System.out.println("Result multiplication: " + result);
            } // Division
            case 4 -> {
                result = num1 / num2;
                System.out.println("Result division: " + result);
            }
            default -> System.out.println("Option error: " + operation);
        }
    }

}


