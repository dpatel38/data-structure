package com.tts;

import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("FORTUNE TELLER");

        System.out.println("What is your first name? ");
        String firstName = input.next();
        if (firstName.equalsIgnoreCase("quit")) {
            System.out.println("Nobody likes a quitter...");
            System.exit(0);
        }

        System.out.println("What is your last name? ");
        String lastName = input.next();
        if (lastName.equalsIgnoreCase("quit")) {
            System.out.println("Nobody likes a quitter...");
            System.exit(0);
        }

        System.out.println("What is your age? ");
        String age = input.next();
        if (age.equalsIgnoreCase("quit")) {
            System.out.println("Nobody likes a quitter...");
            System.exit(0);
        }
        int numberAge = Integer.parseInt(age);

        System.out.println("What is your birth month? (1-12) ");
        String birthMonth = input.next();
        if (birthMonth.equalsIgnoreCase("quit")) {
            System.out.println("Nobody likes a quitter...");
            System.exit(0);
        }
        int bMonth = Integer.parseInt(birthMonth);

        System.out.println("What is your favorite ROYGBIV color? If you don't know what ROYGBIV is? Type Help!");
        String favColor = input.next();

        String needHelp = "";
        while(favColor.equalsIgnoreCase("help")){
            needHelp = "Red, Orange, Yellow, Green, Blue, Indigo, Violet";
            System.out.println("The ROYGBIV colors are " + needHelp);

            favColor = input.next();
        }

        System.out.println("How many siblings do you have? ");
        String numSibling = input.next();
        if (numSibling.equalsIgnoreCase("quit")) {
            System.out.println("Nobody likes a quitter...");
            System.exit(0);
        }
        int sibling = Integer.parseInt(numSibling);

        //Retirement years
        String userYearOfRetirement = "";

        if(numberAge % 2 == 0){
            userYearOfRetirement = "10";
        }else {
            userYearOfRetirement = "15";
        }
        System.out.println("How many years until retirement: " + userYearOfRetirement);
        System.out.println();

        //Vacation home location
        String vacationHomeLocation = "";

        if(sibling <= 0){
            vacationHomeLocation = "Chicago";
        }else if(sibling == 1){
            vacationHomeLocation = "Florida";
        }else if(sibling == 2){
            vacationHomeLocation = "California";
        }else if(sibling == 3){
            vacationHomeLocation = "Bahamas";
        }else if(sibling > 3){
            vacationHomeLocation = "Virginia";
        }
        System.out.println("Vacation home location will be " + vacationHomeLocation);
        System.out.println();

        //mode of transportation
        String modeOfTransportation = "";
        if(favColor.equalsIgnoreCase("red")){
            modeOfTransportation = "Mustang";
        }else if(favColor.equalsIgnoreCase("orange")){
            modeOfTransportation = "Maserati";
        }else if(favColor.equalsIgnoreCase("yellow")){
            modeOfTransportation = "Amtrak";
        }else if(favColor.equalsIgnoreCase("green")){
            modeOfTransportation = "Southwest Airline";
        }else if(favColor.equalsIgnoreCase("blue")){
            modeOfTransportation = "Motor Cycle";
        }else if(favColor.equalsIgnoreCase("indigo")){
            modeOfTransportation = "69 Charger";
        }else if(favColor.equalsIgnoreCase("violet")){
            modeOfTransportation = "Corvette";
        }
        System.out.println("Mode of transportation will be " + modeOfTransportation);
        System.out.println();

        //bank balance
        String bankBalance = "";
        if(bMonth <= 4){
            bankBalance = "$350,000";
        }else if((bMonth >= 5) && (bMonth <= 8)){
            bankBalance = "$250,000";
        }else if((bMonth >= 9) && (bMonth <= 12)){
            bankBalance = "$150,000";
        }
        System.out.println("Bank balance will be " + bankBalance);
        System.out.println();

        String userOutput = firstName + " " + lastName + " will retire in " + userYearOfRetirement + " years with "
                + bankBalance + " in the bank, a vacation home in " + vacationHomeLocation + " and travel by "
                + modeOfTransportation + ".";
        System.out.println(userOutput);

        input.close();

    }
}
