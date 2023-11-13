package com.example.consumingrestwithresttemplate.templates;

import java.util.Scanner;
import org.springframework.web.client.RestTemplate;

public class RestConsumer {
    public static void seeAllAnimals() {
        System.out.println("Inside class RestConsumer....This is the section or method that will do See all animals");
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://localhost:8080/api/animals", String.class);
        System.out.println("Here is the result:  " + result);
    }


    public static void addAnimal() {
        System.out.println("Inside class RestConsumer....This is the section or method that will add an animal");
        Scanner scannerNewAnimal = new Scanner(System.in);
        System.out.println("Enter the name of the animal:  ");
        String name = scannerNewAnimal.nextLine();
        System.out.println("Enter the age of the animal:  ");
        Integer age = scannerNewAnimal.nextInt();
        System.out.println("Enter the weight of the animal:  ");
        Double weight = scannerNewAnimal.nextDouble();
        RestTemplate restTemplate = new RestTemplate();
        System.out.println("you want animal name:  " + name + "  age:  " + age + "  weight:  " + weight);
        Animal animal = new Animal(name, age, weight);
        System.out.println("Here is the animal:  " + animal.toString());

        String animalCreateRequest = restTemplate.postForObject("http://localhost:8080/api/animals", animal, String.class);
        System.out.println("Here is the result:  " + animalCreateRequest);



    }


    public static void DeleteAnimal() {
        System.out.println("Inside class RestConsumer....This is the section or method that will do Delete an animal");
    }

    public static void changeAnimal() {
        System.out.println("Inside class RestConsumer....This is the section or method that will do Change an animal");

    }

    public static void seeOneAnimal() {
        System.out.println("Inside class RestConsumer....This is the section or method that will do See one animal");
    }




}
