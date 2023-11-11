package com.example.consumingrestwithRestTemplate.menu;

import java.io.IOException;
import

        java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public

class

ConsoleMenu {

    public static void main(String[] args) throws IOException {
        // Create a new process to run the menu.
        Process process = Runtime.getRuntime().exec("clear");

        // Get the input and output streams for the process.
        InputStream inputStream = process.getInputStream();
        OutputStream outputStream = process.getOutputStream();

        // Create a PrintWriter to write to the process's output stream.
        PrintWriter writer = new PrintWriter(outputStream);

        // Create a Scanner to read from the process's input stream.
        Scanner scanner = new Scanner(inputStream);

        // Write the menu to the process's output stream.
        writer.println("Welcome to the Animal App!");
        writer.println("1. See all animals");
        writer.println("2. Add an animal");
        writer.flush();

        // Read the user's choice from the process's input stream.
        int choice = scanner.nextInt();

        // Perform the appropriate action based on the user's choice.
        switch (choice) {
            case 1:
                // See all animals.
                break;
            case 2:
                // Add an animal.
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        // Close the PrintWriter and Scanner objects.
        writer.close();
        scanner.close();

        // Wait for the process to finish.
        try {
            process.waitFor();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}