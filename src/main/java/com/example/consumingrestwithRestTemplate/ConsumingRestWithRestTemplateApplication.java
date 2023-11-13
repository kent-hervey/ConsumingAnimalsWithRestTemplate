package com.example.consumingrestwithresttemplate;

import java.io.IOException;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumingRestWithRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestWithRestTemplateApplication.class, args);

		// Display the menu.
		System.out.println("display time");
		Scanner scanner = new Scanner(System.in);
		ConsoleMenu.presentMenu(scanner);

		// Close the scanner.
		scanner.close();
	}


}
