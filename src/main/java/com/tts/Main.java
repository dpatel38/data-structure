package com.tts;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] fruitArray = {"orange", "apple", "banana"};
        int[] intArray = {1, 25, 36};

        System.out.println(fruitArray[1]);

        List<String> stringList= new ArrayList<>();
        List <String> stringLinkedList = new LinkedList<>();
        List <String> StringVector = new Vector<>();
        List <String> stringStack = new Stack<>();

        stringList.add("dog");
        stringList.add("house");
        stringList.add("cell phone");

        System.out.println("The element at index 0: " + stringList.get(1));
//        stringList.remove(0);
        System.out.println("This is the size of my list: "+ stringList.size());

        Collections.reverse(stringList);

        System.out.println("Here is my reverse list: " + stringList);


        System.out.println("==== String Conversion ====");

        // first I set up a String
        String myString = "I really love ice cream";
        // then I take my string and split it at every whitespace
        // and turn it into a regular array
        String[] strArr = myString.split(" ");

        // setting up arrayList and making the value
        // that of the strArr
        List<String> splitList = Arrays.asList(strArr);

        System.out.println(splitList);

        List<String> carList = Arrays.asList("BMW", "Honda", "Audi");

        Object[] carArr = carList.toArray();
        String carString = Arrays.toString(carArr);

        System.out.println(carString.replace("[", "")
                                    .replace(",", "")
                                    .replace("]", ""));

        System.out.println("\n==========HashMap=============");
        HashMap<String, Integer> personMap = new HashMap<>();

        personMap.put("Mary", 37);
        personMap.put("Bob", 32);
        personMap.put("Susan", 67);

        System.out.println(personMap);
        System.out.println("This is the value associated with Mary: " + personMap.get("Mary"));
        System.out.println(personMap.keySet());

        for (String i : personMap.keySet()) {
            System.out.println("key: " + i + " \tvalue: " + personMap.get(i));
        }
        personMap.remove("Bob");
        System.out.println("Is Bob in my map: " + personMap.containsKey("Bob"));

        System.out.println("\n=========Iterating============");

        List<String> fruitList = Arrays.asList("plum", "grape", "kiwi");

        for(String fruit : fruitList){
            System.out.println("Here is one of my fruits: " + fruit);
        }

        fruitList.forEach((fruit) -> System.out.println(fruit));
        fruitList.forEach(System.out::println);

        System.out.println("\n=========LinkedList============");

        LinkedList<String> animalList = new LinkedList<String>();
        animalList.add("frog");
        animalList.add("giraffe");
        animalList.add("buffalo");
        animalList.add("mongoose");
        System.out.println(animalList);
        // => [frog, giraffe, buffalo, mongoose]

        // Puts shark as the first element in the ArrayList
        animalList.addFirst("shark");
        System.out.println(animalList);
        // => [shark, frog, giraffe, buffalo, mongoose]

        // Puts koala as the last element in the ArrayList
        animalList.addLast("koala");
        System.out.println(animalList);
        // => [shark, frog, giraffe, buffalo, mongoose, koala]

        // This adds the value cuttlefish to the 3rd index of the LinkedList
        animalList.add(3, "cuttlefish");
        System.out.println(animalList);
        // => [shark, frog, giraffe, cuttlefish, buffalo, mongoose, koala]
        animalList.set(3, "emu");
        //Sets the value at index 4 to "emu"
        System.out.println(animalList);

        System.out.println("\n=========Queues============");

        Queue<Integer> myQueue = new LinkedList<>();

        // Adds elements {5, 6, 7, 8, 9} to queue
        for (int i=5; i<10; i++) {
            myQueue.add(i);
        }
        // Display contents of the queue.
        System.out.println("Elements of queue-"+ myQueue);

        // To remove the head of queue.
        int removedHead = myQueue.remove();
        System.out.println("removed element-" + removedHead);

        System.out.println(myQueue);

        // To view the head of queue
        int head = myQueue.peek();
        System.out.println("head of queue-" + head);

        // Rest all methods of collection interface,
        // Like size and contains can be used with this
        // implementation.
        int size = myQueue.size();
        System.out.println("Size of queue-" + size);

        System.out.println("\n=========Stacks============");

        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack);

        myStack.pop();
        System.out.println(myStack);

        int peek = myStack.peek();
        System.out.println(peek);

        boolean empty = myStack.empty();
        System.out.println(empty);


    }
}
