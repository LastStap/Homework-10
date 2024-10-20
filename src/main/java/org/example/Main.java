package org.example;

import Dragons.*;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    static ArrayList<String> dataDragons = new ArrayList<String>();

    static void createDragon() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the name of the dragon: ");
        String name = scanner.nextLine();
        System.out.println(String.format("Please enter the age of the %s: ", name));
        int age = scanner.nextInt();
        System.out.println(String.format("Please enter the weight of the %s: ", name));
        int weight = scanner.nextInt();

        Dragon dragon = new Dragon(name, age, weight);

        dataDragons.add(String.valueOf(dragon));

        System.out.println("Dragon added: " + dragon);

        whatDragonDo(dragon);
    }


    static void whatDragonDo(Dragon dragon) {
        Scanner scannerNew = new Scanner(System.in);
        String dragonName = dragon.getName();

        System.out.println(String.format("Please enter what should %s do? (say, fire, or press ENTER)", dragonName));
        String action = scannerNew.nextLine();


        if (Objects.equals(action, "say")) {

            System.out.println(String.format("What should %s say?", dragonName));
            String say = scannerNew.nextLine();

            System.out.println(String.format("%s said: " + say, dragonName));
        } else if (Objects.equals(action, "fire")){
            System.out.println("imagine fire emoji");
        } else {
            System.out.println(String.format("%s did: \"nothing\"", dragonName));
        }


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
