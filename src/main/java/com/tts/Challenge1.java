package com.tts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Challenge1 {


    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        int product = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter the numbers: ");
            numbers.add(input.nextInt());
        }
        System.out.println(numbers);

        for (int num : numbers) {
            sum = sum + num;
            product = product * num;
        }
        average = sum/5;
        Collections.sort(numbers);
        int smallest = numbers.get(0);
        int largest = numbers.get(numbers.size() - 1);


        System.out.printf("The sum is %d%n " ,  sum);

        System.out.printf("The average is %d%n " ,  average);

        System.out.printf("The product is %d%n " , product);

        System.out.printf("Largest number is %d%n " , largest);

        System.out.printf("Smallest number is %d%n " , smallest);

    }
}
