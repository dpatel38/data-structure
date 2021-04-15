package com.tts;

import java.util.*;

public class Challenge2 {
    public static void main(String[] args) {
        Map<String, String> vehicles = new HashMap<>();

        vehicles.put("rav4", "Toyota");
        vehicles.put("audi-A4", "Audi");
        vehicles.put("civic", "Honda");
        vehicles.put("bmw-i8", "BMW");
        vehicles.put("cr-v", "Honda");

        Scanner input = new Scanner(System.in);

        System.out.print("What car model are you looking for? ");
        String carName = input.next();

        if(vehicles.containsKey(carName.toLowerCase())) {
            System.out.println("Oh, you're looking for a " + carName + "?");
//            vehicles.get(carName);

            for ( String i : vehicles.keySet()) {

                if(i.equalsIgnoreCase(carName)) {
                    System.out.println("Model: " + carName + " \tMake: " + vehicles.get(carName));
                }
            }
        }else {
            System.out.println("Sorry we currently do not have any " + carName + " vehicle");
        }


    }
}
