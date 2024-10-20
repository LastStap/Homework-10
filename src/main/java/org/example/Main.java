package org.example;

import Dragons.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> dataDragons = new ArrayList<String>();

    static void createDragon() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the name of the dragon: ");
        String name = scanner.nextLine();
        System.out.println("Please enter the age of the dragon: ");
        int age = scanner.nextInt();
        System.out.println("Please enter the weight of the dragon: ");
        int weight = scanner.nextInt();

        Dragon dragon = new Dragon(name, age, weight);

        dataDragons.add(String.valueOf(dragon));

        System.out.println("Dragon added: " + dragon);
    }


    public static void main(String[] args) {

        Dragon dragon1 = new Dragon();
        System.out.println("Створено невідомго дракона");

        Dragon dragon2 = new Dragon();
        dragon2.setName("Isis");
        dragon2.setAge(1500);
        dragon2.setWeight(2000);
        dragon2.setType(String.valueOf(dragonTypes.BLACK));

//        System.out.println(dragon2.toString());

        System.out.println("Створено повноцінного дракона з такими параметрами:");

        System.out.println("Dragon name: " + dragon2.getName());
        System.out.println("Dragon age: " + dragon2.getAge());
        System.out.println("Dragon weight: " + dragon2.getWeight());
        System.out.println("Dragon type: " + dragon2.getType());

        for (int i = 0; i < 3; i++) {
            createDragon();
        }

        System.out.println("\nList of all dragons:");
        for (String dragon : dataDragons) {
            System.out.println(dragon);
        }
    }
}