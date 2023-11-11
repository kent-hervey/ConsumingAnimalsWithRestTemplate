package com.example.consumingrestwithRestTemplate;

import com.example.consumingrestwithRestTemplate.menu.ConsoleMenu;
import java.io.IOException;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumingRestWithRestTemplateApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ConsumingRestWithRestTemplateApplication.class, args);


		// Display the menu.
		System.out.println("display time");
		Scanner scanner = new Scanner(System.in);

		// Display the menu and get the user's choice.
		while (true) {
			System.out.println("Welcome to the Animal App!");
			System.out.println("1. See all animals");
			System.out.println("2. Add an animal");
			System.out.println("3. Exit");

			int choice = scanner.nextInt();

			// Switch on the user's choice and perform the appropriate action.
			switch (choice) {
				case 1:
					seeAllAnimals();
					break;
				case 2:
					addAnimal();
					break;
				case 3:
					System.out.println("Goodbye!");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice.");
					break;
			}


			// Close the Scanner object.
			//scanner.close();

		}

	}

	private static void addAnimal() {
	}


	private static void seeAllAnimals() {
		System.out.println("See all animals");
	}
	

}
