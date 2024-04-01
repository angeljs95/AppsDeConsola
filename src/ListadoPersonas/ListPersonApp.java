package ListadoPersonas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPersonApp {

    private static void showMenu() {

        System.out.println("""
                ***********listPeople App****************
                 1. Add Person
                 2. List People
                 3. Exit
                 """);
        System.out.print("Enter the option to realize: ");
    }

    private static boolean executeOperation(Scanner sc, List<Person> people) {
        var option = Integer.parseInt(sc.nextLine());
        var exit = false;
        // Revisamos la opcion seleccionada
        switch (option) {
            case 1 -> {
                System.out.print("enter the name of the person to register");
                String name = sc.nextLine();
                System.out.print("enter the phone number");
                String phone = sc.nextLine();
                System.out.print("enter user email");
                String email = sc.nextLine();
                Person person = new Person(name, phone, email);
                people.add(person);
                System.out.print("The list contains: " + people.size() + " people.");
            }
            case 2 -> {
                System.out.println(" List People: ");
                // funcion lambda
                //  people.forEach(person -> System.out.println(person));
                //Metodo de referecia
                people.forEach(System.out::println);
            }
            case 3 -> {
                System.out.println(" See you later Sr....");
                exit = true;
            }
            default -> System.out.println("Wrong option: " + option);
        }
        return exit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> listPeople = new ArrayList<>();
        var exit = false;
        while (!exit) {
            showMenu();
            try {
                 exit = executeOperation(sc, listPeople);
                 } catch (Exception e) {
                System.out.println("An error has ocurred: " + e.getMessage());
            }
            System.out.println();
        }

    }
}
