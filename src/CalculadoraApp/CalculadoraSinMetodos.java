package CalculadoraApp;

import java.util.Scanner;

public class CalculadoraSinMetodos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        var num1 = 0;
        var num2 = 0;
        var result = 0;

        while (true) {

            System.out.println("********** App Calculator************************ \n");

            System.out.println("""
                    1. Sum
                    2. Rest
                    3. Multiplication
                    4. Division
                    5. Exit
                    """);


            System.out.println("\n" +
                    "indicate the operation to be performed ");

            try {// ciclo de tratado y excepciones
                var operation = Integer.parseInt(sc.nextLine());

                // Revisar el numero de operacion que quiere realizar el usuario

                if (operation >= 1 && operation <= 4) {

                    System.out.println("Provide a value");
                    num1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Provide a value 2");
                    num2 = Integer.parseInt(sc.nextLine());

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
                    } // Salir
                } else if (operation == 5) {
                    System.out.println(" See you later Sr....");
                    break;
                } else {
                    System.out.println("Option error: " + operation);
                }
                System.out.println();
            } catch( Exception e){ // capturamos la excepcion por si se envia un parametro de tipo string
                System.out.println(" An error has occurred: "+ e.getMessage());
                System.out.println("");
            }
        }
    }


}