package com.niklas.demo;

public class Main {
    public static void main(String[] args) {

        // Uppgift 1 och 2
        int x = 15;

        if (x < 18) {
            System.out.println("UNDERAGE");
        } else {
            System.out.println("ADULT");
        }


        //Uppgift 3 och 4
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 9; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            //Lyckades inte få ordning på uppgift 4

        }


        //Uppgift 5
        String anton = "sad";

        switch (anton) {
            case "Benny":
                System.out.println("Benny is Antons best friend!");
                break;
            case "Anton":
                System.out.println("Anton loves to hangout with Benny!");
                break;
            default:
                System.out.println("Anton and Benny isn't friends anymore!");
        }

    }
}
