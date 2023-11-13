package com.example.consumingrestwithresttemplate;
import com.example.consumingrestwithresttemplate.templates.RestConsumer;
import java.util.Scanner;


public

class

ConsoleMenu {

    static boolean exit = false;

    private ConsoleMenu() {
    }

    public static void presentMenu(Scanner scanner) {

        do {
            System.out.println("\nWelcome to the Animal App!");
            System.out.println("1. See all animals");
            System.out.println("2. See one animal");
            System.out.println("3. Add an animal");
            System.out.println("4. Change an animal");
            System.out.println("5. Delete an animal");
            System.out.println("99. Exit");

            int choice = scanner.nextInt();

            // Switch on the user's choice and perform the appropriate action.
            switch (choice) {
                case 1:
                    RestConsumer.seeAllAnimals();
                    break;
                case 2:
                    RestConsumer.seeOneAnimal();
                    break;
                case 3:
                    RestConsumer.addAnimal();
                    break;
                case 4:
                    RestConsumer.changeAnimal();
                    break;
                case 5:
                    RestConsumer.DeleteAnimal();
                    break;
                case 99:
                    System.out.println("Goodbye!");
                    exit = true;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (!exit);
    }
}